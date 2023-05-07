import './assets/css/bootstrap.css'
import './assets/js/bootstrap.js'
import Projetos from './components/Projetos'
import About from './components/About'
import Home from './components/Home'
import Navbar from './components/navbar/navbar'
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import './App.css'
import Competencias from './components/competencias/competencias'

function App() {

  return (
      <Router>
        <Navbar/>
        <Routes>
          <Route exact path="/" element={<Home/>} />
          <Route path="/about" element={<About/>} />
          <Route path="/competencias" element={<Competencias/>} />
          <Route path="/projetos" element={<Projetos/>} />
        </Routes>
       </Router>
  )
}

export default App
