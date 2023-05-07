import styles from './competencias.module.css'
import Competencia from './competencia.jsx'

function Competencias(){
    return(
        <div className={styles.container}>
            <div className={styles.informacoes}>

                <Competencia
                    foto="https://velog.velcdn.com/images/cj98123/post/0536577d-9dbf-4f59-b87f-6e12a80dca21/image.jpeg"
                    nome="Html"
                    valor="70"
                    porcentagem="70%"
                />
                <Competencia
                    foto="https://logospng.org/download/css-3/logo-css-3-2048.png"
                    nome="Css"
                    valor="90"
                    porcentagem="90%"
                />
                <Competencia
                    foto="https://cdn-icons-png.flaticon.com/512/270/270780.png"
                    nome="Java"
                    valor="60"
                    porcentagem="60%"
                />
                <Competencia
                    foto="https://ubuntuhandbook.org/wp-content/uploads/2022/06/gimp-logo.webp"
                    nome="Gimp"
                    valor="70"
                    porcentagem="70%"
                />
                <Competencia
                    foto="https://assets.website-files.com/5a061b4bcb4faf000133793b/6238a915525148147eb79756_62338328d5aa2d62f75ce802_c%2523.png"
                    nome="C#"
                    valor="60"
                    porcentagem="60%"
                />
                <Competencia
                    foto="https://www.alura.com.br/assets/api/cursos/512/solid-php-principios-orientacao-a-objetos.png"
                    nome="Php"
                    valor="70"
                    porcentagem="70%"
                />
                <Competencia
                    foto="https://cdn-icons-png.flaticon.com/512/5968/5968313.png"
                    nome="MySQL"
                    valor="80"
                    porcentagem="80%"
                /><Competencia
                foto="https://cdn-icons-png.flaticon.com/512/7819/7819053.png"
                nome="Inglês"
                valor="70"
                porcentagem="70%"
                />
                

            </div>
        </div>
    )
}
export default Competencias