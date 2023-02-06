package com.banzaiflix_backend.banzaiflix_backend.filters;

import java.io.IOException;
import java.util.stream.Stream;

import javax.crypto.SecretKey;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.WebUtils;

import com.banzaiflix_backend.banzaiflix_backend.Interfaces.JWTInterface;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JWTValidatorFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        // String jwt = request.getHeader(JWTInterface.JWT_HEADER);
        Cookie cookieJWT = WebUtils.getCookie(request, "jwt");

        if (cookieJWT.getValue() != null) {
            try {
                String jwt = cookieJWT.getValue();
                SecretKey key = Keys.hmacShaKeyFor(JWTInterface.JWT_KEY.getBytes());
                Claims claims = Jwts.parserBuilder()
                        .setSigningKey(key)
                        .build()
                        .parseClaimsJws(jwt)
                        .getBody();
                String username = String.valueOf(claims.get("username"));
                String authorities = (String) claims.get("authorities");
                Authentication auth = new UsernamePasswordAuthenticationToken(username, null,
                        AuthorityUtils.commaSeparatedStringToAuthorityList(authorities));
                SecurityContextHolder.getContext().setAuthentication(auth);
            } catch (Exception e) {
                // TODO: handle exception
                throw new BadCredentialsException("invalid token");
            }
        } else {
            throw new BadCredentialsException("invalid token");
        }

        filterChain.doFilter(request, response);
    }
    // TODO Auto-generated method stub

    @Override
    protected boolean shouldNotFilter(HttpServletRequest request) throws ServletException {
        // TODO Auto-generated method stub
        AntPathMatcher pathMatcher = new AntPathMatcher();
        String[] excluded_urls = {
                "/login",
                "/brincando/**",
                "/Top10",
                "/EmAlta"
        };
        String url = request.getRequestURI();
        return Stream.of(excluded_urls).anyMatch(x -> pathMatcher.match(x, url));
    }

}
