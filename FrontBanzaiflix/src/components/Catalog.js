import React from "react";
import test from "../assets/principal.png";
import test1 from "../assets/banzaiflix.png";
function Catalog() {
  return (
    <div className="catalog">
      <div id="banner" className="carousel slide p-5" data-bs-ride="carousel">
        <div className="carousel-indicators">
          <button
            className="active"
            data-bs-target="#banner"
            data-bs-slide-to="0"
          ></button>
          <button data-bs-target="#banner" data-bs-slide-to="1"></button>
        </div>
        <div className="carousel-inner">
          <div className="carousel-item">
            <div className="cards-wrapper ">
              <div className="card w-25 ">
                <div className="card-header">
                  <img className="w-100 d-block" src={test}></img>
                </div>
                <div className="card-body"></div>
                <div className="card-footer"></div>
              </div>
              <div className="card w-25 ">
                <div className="card-header">
                  <img className="w-100 d-block" src={test1}></img>
                </div>
                <div className="card-body"></div>
                <div className="card-footer"></div>
              </div>
              <div className="card w-25 ">
                <div className="card-header">
                  <img className="w-100 d-block" src={test1}></img>
                </div>
                <div className="card-body"></div>
                <div className="card-footer"></div>
              </div>
            </div>
          </div>

          <div className="carousel-item active">
            <div className="cards-wrapper">
              <div className="card w-25 ">
                <div className="card-header">
                  <img className="w-100" src={test}></img>
                </div>
                <div className="card-body"></div>
                <div className="card-footer"></div>
              </div>
              <div className="card w-25 ">
                <div className="card-header">
                  <img className="w-100" src={test}></img>
                </div>
                <div className="card-body"></div>
                <div className="card-footer"></div>
              </div>
              <div className="card w-25 ">
                <div className="card-header">
                  <img className="w-100" src={test}></img>
                </div>
                <div className="card-body"></div>
                <div className="card-footer"></div>
              </div>
            </div>
          </div>
          <button
            className="carousel-control-next btn-next"
            data-bs-target="#banner"
            data-bs-slide="next"
          >
            <span className="carousel-control-next-icon"></span>
          </button>
          <button
            className="carousel-control-prev btn-prev"
            data-bs-target="#banner"
            data-bs-slide="prev"
          >
            <span className="carousel-control-prev-icon"></span>
          </button>
        </div>
      </div>
    </div>
  );
}

export default Catalog;
