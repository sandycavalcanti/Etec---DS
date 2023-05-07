import styles from './projeto.module.css'

function Projetos_java(props){
    return(
        <div className={styles.projeto}>
            <img className={styles.img} src={props.foto}/>
            <img className={styles.img} src={props.foto1}/>
            <div className={styles.textos}>
                <h1>{props.nome}</h1>
                <p>{props.descricao}</p>
                <div className={styles.caixa}>
                    <a href={props.link}>Ver projeto</a>
                </div>
            </div>
        </div>
    )
}
export default Projetos_java