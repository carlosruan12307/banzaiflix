import React from "react";
import "../css/App.css";
import flix from "../assets/banzaiflix.png";
import { Link } from "react-router-dom";
import $ from "jquery";

function Header() {
  const clickLink = (e) => {
    $("a").css("color", "white");
    $("#" + e.target.id).css("color", "red");
  };
  return (
    <nav className="navbar navbar-expand-sm ts navbar-dark bg-dark">
      <div className="navbar-brand">
        <a href="/">
          <img className="logo" src={flix}></img>
        </a>
      </div>
      <button
        className="navbar-toggler sandwitch"
        data-bs-toggle="collapse"
        data-bs-target="#nav"
      >
        <span className="navbar-toggler-icon"></span>
      </button>
      <ul id="nav" className="navbar-nav navbar-collapse collapse">
        <li className="nav-item ">
          <a id="a1" onClick={clickLink} href="#" className="nav-link">
            Inicio
          </a>
        </li>
        <li className="nav-item">
          <a id="a2" onClick={clickLink} href="#" className="nav-link">
            Series
          </a>
        </li>
        <li className="nav-item">
          <a id="a3" onClick={clickLink} href="#" className="nav-link">
            Filmes
          </a>
        </li>
        <li className="nav-item">
          <a id="a4" onClick={clickLink} href="#" className="nav-link">
            Meus Favoritos
          </a>
        </li>
        <div className=" ms-auto search">
          <button class="mt-2 text-white input-group-item fa-solid fa-magnifying-glass fa-search"></button>
          <input className="form-control"></input>
        </div>
      </ul>
    </nav>
  );
}

export default Header;
