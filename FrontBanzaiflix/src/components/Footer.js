import React from "react";

function Footer() {
  return (
    <footer
      id="foot"
      className="footer d-flex align-content-center flex-wrap  justify-content-center"
    >
      <div className=" cols">
        <i className="fa-brands fa-facebook fa-footer-icon"></i>
        <i className="fa-brands fa-instagram fa-footer-icon"></i>
        <i className="fa-brands fa-twitter fa-footer-icon"></i>
        <i className="fa-brands fa-youtube fa-footer-icon"></i>
        <h4>idiomas e legendas</h4>
        <h4>Imprensa</h4>
        <h4>Privacidade</h4>
        <h4>Entre em Contato</h4>
        <button className="btn btn-outline-light btn-footer">
          Código do serviço
        </button>

        <h5>1997-2022 netflix, inc 193198319</h5>
      </div>
      <div className=" cols">
        <h4>Audiodescrição</h4>
        <h4>Relações Com Investidores</h4>
        <h4>Avisos Legais</h4>
      </div>

      <div className="cols">
        <h4>Centro De Ajuda</h4>
        <h4>Carreiras</h4>
        <h4>Preferências de cookies</h4>
      </div>

      <div className=" cols">
        <h4>Cartão Pré-pago</h4>
        <h4>Termos De Uso</h4>
        <h4>Informações comporativas</h4>
      </div>
    </footer>
  );
}

export default Footer;
