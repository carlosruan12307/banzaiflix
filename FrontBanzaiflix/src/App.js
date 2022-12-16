import logo from './logo.svg';
import './css/App.css';
import Header from './components/Header.js'
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
function App() {
  return (
    <Router>
      <Routes>
        <Route path='/' element={<Header/>}/>
      </Routes>
    </Router>
  );
}

export default App;
