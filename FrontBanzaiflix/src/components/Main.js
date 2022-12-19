import React from "react";

function Main() {
  return (
    <div className="d-flex  flex-column justify-content-center principal">
      <img
        className="img-fluid w-25"
        src="https://fontmeme.com/permalink/221218/1df59e3f82fc338190d882577fa9adf6.png"
        alt="fonte-de-stranger-things"
        border="0"
      />
      <h4 className="m-3 col-sm-10 col-lg-10 col-md-10 col-xl-8 col-xxl-5 text-white">
        Quando uma garota desaparece, a cidade toda participa nas buscas. Mas o
        que encontram são segredos, forças sobrenaturais e uma menina
      </h4>
      <div className="d-flex m-3">
        <button className="  btn btn-light btn-main text-capitalize">
          Assistir
        </button>
        <button className="ms-3 btn btn-light btn-main text-capitalize">
          Saiba Mais!
        </button>
      </div>
      <h1
        className="text-white ms-5"
        style={{ position: "absolute", marginTop: "950px" }}
      >
        Em Alta
      </h1>
    </div>
  );
}

export default Main;
