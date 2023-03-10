import React, { useEffect } from "react";
import "../css/App.css";
import flix from "../assets/banzaiflix.png";
import { Link } from "react-router-dom";
import $ from "jquery";

function Header() {
  useEffect(() => {
    $("html").css("--scroll-padding", $("header").outerHeight() + "px");
  }, []);

  const clickLink = (e) => {
    $("a").css("color", "white");
    if (e.target.id === "logo-link") {
      $("#inicio-link").css("color", "red");
    }

    $("#" + e.target.id).css("color", "red");
  };
  return (
    <div>
      <header className="">
        <nav className="navbar navbar-expand-sm ts navbar-dark bg-dark">
          <div className="navbar-brand">
            <a href="#">
              <img
                id="logo-link"
                onClick={clickLink}
                className="logo"
                src={flix}
              ></img>
            </a>
          </div>
          <button
            className="navbar-toggler sandwitch me-4"
            data-bs-toggle="collapse"
            data-bs-target="#nav"
          >
            <span className="navbar-toggler-icon"></span>
          </button>
          <ul id="nav" className="navbar-nav navbar-collapse collapse">
            <li className="nav-item ">
              <a
                id="inicio-link"
                onClick={clickLink}
                href="#"
                className="nav-link"
              >
                Inicio
              </a>
            </li>
            <li className="nav-item">
              <a
                id="series-link"
                onClick={clickLink}
                href="#"
                className="nav-link"
              >
                Series
              </a>
            </li>
            <li className="nav-item">
              <a
                id="filmes-link"
                onClick={clickLink}
                href="#"
                className="nav-link"
              >
                Filmes
              </a>
            </li>
            <li className="nav-item">
              <a
                id="favoritos-link"
                onClick={clickLink}
                href="#section-favoritos"
                className="nav-link"
              >
                Meus Favoritos
              </a>
            </li>
            <div className="ms-auto search">
              <button className="mt-2 text-white input-group-item fa-solid fa-magnifying-glass fa-search"></button>
              <input className="form-control"></input>
            </div>
          </ul>
        </nav>
      </header>
    </div>
  );
}

export default Header;
