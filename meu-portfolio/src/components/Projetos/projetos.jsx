import styles from './projeto.module.css'

function Meus_projetos(props){
    return(
        <div className={styles.projeto}>
            <img src={props.foto}/>
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
export default Meus_projetos