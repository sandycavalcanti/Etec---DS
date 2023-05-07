import styles from './home.module.css';

function About() {
    return (
        <div className={styles.app}>

            <div className={styles.container}>
                <h1>Sandy Pereira Cavalcanti</h1>
                <center><h2>Bem vindo ao meu portfólio, aqui você tera acesso a minhas informações gerais, minhas competências e aos meus projetos</h2></center>
            </div>
            <div className={styles.foto}>
                <img src='./img/eu.jpg'/>
            </div>
        </div>
    )
}
export default About