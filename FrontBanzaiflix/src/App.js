import logo from './logo.svg';
import './css/App.css';
import Header from './components/Header.js'
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Main from './components/Main';
import Catalog from './components/Catalog';
import Footer from './components/Footer';
function App() {
  return (
    <Router>
      <Routes>
        <Route path='/' element={<><Header/><Main/><Catalog/><Footer/></>}/>
      </Routes>
    </Router>
  );
}

export default App;
