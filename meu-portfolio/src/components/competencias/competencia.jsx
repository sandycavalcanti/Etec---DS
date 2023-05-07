import styles from './competencias.module.css'

function Competencia(props){
    return(
        <div className={styles.competencia}>
            <img src={props.foto} />
            <h1>{props.nome}</h1>
            <progress value={props.valor} max="100" />
            <p>{props.porcentagem}</p>
        </div>
    )
}
export default Competencia