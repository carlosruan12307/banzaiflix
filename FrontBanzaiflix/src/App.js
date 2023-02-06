import logo from "./logo.svg";
import "./css/App.css";
import Header from "./components/Header.js";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Main from "./components/Main";
import Catalog from "./components/Catalog";
import Footer from "./components/Footer";
import { useEffect, useState } from "react";
function App() {
  const [emAlta, setemAlta] = useState();
  const [Top10, setTop10] = useState();
  const code = window.btoa("joao:123");
  const headerGet = {
    Authorization: `Basic ${code}`,
  };
  useEffect(() => {
    getData();
  }, []);

  async function getData() {
    await fetch("http://localhost:8080/EmAlta", {
      method: "get",
      headers: headerGet,
    })
      .then((res) => res.json())
      .then((resj) => setemAlta((prev) => resj))
      .catch((err) => console.log(err));
    await fetch("http://localhost:8080/Top10", {
      method: "get",
      headers: headerGet,
    })
      .then((res) => res.json())
      .then((resj) => setTop10((prev) => resj))
      .catch((err) => console.log(err));
  }
  return (
    <Router>
      <Routes>
        <Route
          path="/"
          element={
            <>
              <Header />
              <Main />
              <Catalog emAlta={emAlta} Top10={Top10} />
              <Footer />
            </>
          }
        />
      </Routes>
    </Router>
  );
}

export default App;
