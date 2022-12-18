import React from "react";

function Main() {
  return (
    <main className="">
      <div className="d-flex flex-column flex-wrap justify-content-center principal  ">
        <h1 className="row stranger text-white m-5 ">STRANGER THINGS</h1>
        <h4 className="ms-5 col-3 text-white">
          Quando uma garota desaparece, a cidade toda participa nas buscas. Mas o
          que encontram são segredos, forças sobrenaturais e uma menina
        </h4>
        <div className="">
          <button className="ms-5 mt-3  btn btn-light btn-main text-capitalize">
            Assistir
          </button>
          <button className="ms-5 mt-3 btn btn-light btn-main text-capitalize">
            Saiba Mais!
          </button>
        </div>
        <h1 className="text-white ms-5" style={{position: "absolute",marginTop: "950px"}}>Em Alta</h1>
      </div>
     
    </main>
  );
}

export default Main;
