import React from "react";
import test from "../assets/principal.png";
import test1 from "../assets/banzaiflix.png";
function Catalog({ emAlta, Top10 }) {
  return (
    <div className="catalog">
      <section id="section-emAlta">
        <div
          id="banner-emAlta"
          className="carousel slide p-5"
          data-bs-ride="carousel"
        >
          <div className="carousel-indicators">
            <button
              className="active"
              data-bs-target="#banner-emAlta"
              data-bs-slide-to="0"
            ></button>
            <button
              data-bs-target="#banner-emAlta"
              data-bs-slide-to="1"
            ></button>
          </div>
          <div className="carousel-inner">
            <div className="carousel-item">
              <div className="cards-wrapper ">
                {emAlta
                  ? emAlta
                      .filter((e) => e.id <= 3)
                      .map((src) => {
                        return (
                          <div
                            className="card "
                            style={{ height: "500px", width: "600px" }}
                          >
                            <div className="card-header">
                              <img
                                alt=""
                                className="w-100 h-100 d-block"
                                src={"http://localhost:8080" + src.url}
                              ></img>
                            </div>
                            <div className="card-body"></div>
                            <div className="card-footer"></div>
                          </div>
                        );
                      })
                  : ""}
              </div>
            </div>

            <div className="carousel-item active">
              <div className="cards-wrapper">
                {emAlta
                  ? emAlta
                      .filter((e) => e.id > 3)
                      .map((src) => {
                        return (
                          <div
                            className="card "
                            style={{ height: "500px", width: "600px" }}
                          >
                            <div className="card-header">
                              <img
                                alt=""
                                className="w-100 h-100 d-block"
                                src={"http://localhost:8080" + src.url}
                              ></img>
                            </div>
                            <div className="card-body"></div>
                            <div className="card-footer"></div>
                          </div>
                        );
                      })
                  : ""}
              </div>
            </div>
            <button
              className="carousel-control-next btn-next"
              data-bs-target="#banner-emAlta"
              data-bs-slide="next"
            >
              <span className="carousel-control-next-icon"></span>
            </button>
            <button
              className="carousel-control-prev btn-prev"
              data-bs-target="#banner-emAlta"
              data-bs-slide="prev"
            >
              <span className="carousel-control-prev-icon"></span>
            </button>
          </div>
        </div>
      </section>

      <section id="section-top10">
        <h1 className="text-white ms-5 mt-3">Top 10 no Brasil hoje</h1>

        <div
          id="banner-top10"
          className="carousel slide p-5"
          data-bs-ride="carousel"
        >
          <div className="carousel-indicators">
            <button
              className="active"
              data-bs-target="#banner-top10"
              data-bs-slide-to="0"
            ></button>
            <button
              data-bs-target="#banner-top10"
              data-bs-slide-to="1"
            ></button>
          </div>
          <div className="carousel-inner">
            <div className="carousel-item">
              <div className="cards-wrapper ">
                {Top10
                  ? Top10.filter((e) => e.id <= 9).map((src) => {
                      return (
                        <div
                          className="card "
                          style={{ height: "500px", width: "600px" }}
                        >
                          <div className="card-header">
                            <img
                              alt=""
                              className="w-100 h-100 d-block"
                              src={"http://localhost:8080" + src.url}
                            ></img>
                          </div>
                          <div className="card-body"></div>
                          <div className="card-footer"></div>
                        </div>
                      );
                    })
                  : ""}
              </div>
            </div>

            <div className="carousel-item active">
              <div className="cards-wrapper">
                {Top10
                  ? Top10.filter((e) => e.id > 9).map((src) => {
                      return (
                        <div
                          className="card "
                          style={{ height: "500px", width: "600px" }}
                        >
                          <div className="card-header">
                            <img
                              alt=""
                              className="w-100 h-100 d-block"
                              src={"http://localhost:8080" + src.url}
                            ></img>
                          </div>
                          <div className="card-body"></div>
                          <div className="card-footer"></div>
                        </div>
                      );
                    })
                  : ""}
              </div>
            </div>
            <button
              className="carousel-control-next btn-next"
              data-bs-target="#banner-top10"
              data-bs-slide="next"
            >
              <span className="carousel-control-next-icon"></span>
            </button>
            <button
              className="carousel-control-prev btn-prev"
              data-bs-target="#banner-top10"
              data-bs-slide="prev"
            >
              <span className="carousel-control-prev-icon"></span>
            </button>
          </div>
        </div>
      </section>
    </div>
  );
}

export default Catalog;
