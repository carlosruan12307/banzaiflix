import React from "react";

function Main() {
  return (
    <div className="principal">
      <div className="container-main d-flex flex-column">
        <img
          className="StrangerThings-F"
          src="https://fontmeme.com/permalink/221218/1df59e3f82fc338190d882577fa9adf6.png"
          alt="fonte-de-stranger-things"
          border="0px"
        />
        <h4 className="m-3 col-sm-10 col-lg-10 col-md-10 col-xl-8 col-xxl-5 text-white">
          Quando uma garota desaparece, a cidade toda participa nas buscas. Mas
          o que encontram são segredos, forças sobrenaturais e uma menina
        </h4>
        <div className="d-flex m-3">
          <button className="  btn p-4 d-flex flex-wrap justify-content-center align-content-center btn-light btn-main text-capitalize">
            Assistir
          </button>
          <button className="ms-3 d-flex flex-wrap p-4 align-content-center justify-content-center btn btn-light btn-main text-capitalize">
            Saiba Mais!
          </button>
        </div>
      </div>
    </div>
  );
}

export default Main;
