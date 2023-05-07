import React from'react';
import styles from './index.module.css'
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';

function About(){
    return(
        <div className={styles.container}>

           

            <div className={styles.informacoes}>
                <div className={styles.texto}>
                    <center><p>Meu nome é Sandy, atualmente tenho 16 anos e estou no último ano do ensino médio integrado ao curso de desenvolvimento de sistemas da Etec Ermelinda Giannini Teixeira. Tenho planos de continuar na área de TI pois acredito ser uma área muito ampla e promissora. Até agora acredito que me encontrei na área de programação web, possuo um nível de inglês intermediário, experiência com trabalho em equipe, gestão de projeto, edição de imagens e banco de dados.</p></center>
                </div>
                <div className={styles.caixa}>
                   <center><h2 className={styles.idade}>16 anos</h2></center> 
                   <center><h2 className={styles.email}>sandy334400@gmail.com</h2></center> 
                    <div className={styles.contatos}>
                    <a href='https://www.facebook.com/sandy.pereiracavalcanti?mibextid=ZbWKwL' ><img src='/img/facebook.png'/></a>
                    <a href='https://www.instagram.com/ei_sand_y/?igshid=NzMyMjgxZWIzNw%3D%3D' ><img src='/img/instagram.png'/></a>
                    <a href='https://www.linkedin.com/in/sandy-pereira-cavalcanti-4351a0259/' ><img src='/img/linkedin.png'/></a>
                    </div>
                </div>
            </div>
                <img className={styles.img} src='/img/eu.jpg'/>

            <div className={styles.nome}>
                <h1>Sandy Pereira Cavalcanti</h1>
           </div>
        </div>
    )
}
export default About