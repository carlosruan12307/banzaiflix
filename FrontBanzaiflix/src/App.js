import logo from './logo.svg';
import './css/App.css';
import Header from './components/Header.js'
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Main from './components/Main';
import Catalog from './components/Catalog';
function App() {
  return (
    <Router>
      <Routes>
        <Route path='/' element={<><Header/><Main/><Catalog/></>}/>
      </Routes>
    </Router>
  );
}

export default App;
