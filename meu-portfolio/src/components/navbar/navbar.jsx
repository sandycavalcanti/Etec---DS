import { Link, Outlet} from 'react-router-dom'

function Navbar(){
    return(
        <>
        <nav className='navbar' class="navbar navbar-expand-lg bg-light">
            <Link to="/"  class="nav-link" ><p>Home</p></Link>
            <Link to="/About" class="nav-link"><p>About</p></Link>
            <Link to="/Competencias" class="nav-link"><p>Competências</p></Link>
            <Link to="/Projetos" class="nav-link" ><p>Projetos</p></Link>
        </nav>
        <Outlet/>
        </>
    )
}

export default Navbar