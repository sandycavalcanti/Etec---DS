import React from'react';
import Meus_projetos from './projetos.jsx';
import Projetos_java from './projeto_java.jsx';
import styles from './projeto.module.css'

function Projetos(){
    return(
        <div className={styles.tudo}>
            <div className={styles.container}>
                <div>
                   <div className={styles.titulo}><h1>Html</h1></div>

                        <div className={styles.projetos}>

                            <Meus_projetos
                                foto="/img/my_buddy.png"
                                nome="My Buddy"
                                descricao="O projeto se trata de uma ONG (fictícia), neste site o usuário terá acesso aos animais que estão disponíveis para adoção, os produtos vendidos pela ONG e uma breve descrição dos criadores do projeto. Feito completamente em Html."
                                link="https://github.com/sandycavalcanti/Etec---DS/tree/main/PW%20-%20Projeto_My-Buddy"
                            />
                            <Meus_projetos
                                foto="/img/nirvana.png"
                                nome=" Site Nirvana"
                                descricao="O projeto consiste em um site sobre a banda Nirvana, nele é possível visualizar os álbuns da banda além de uma breve descrição de seus membros, o projeto foi criado com o intuito de treinar os meus conhecimentos em Html."
                                link="https://github.com/sandycavalcanti/Etec---DS/tree/main/Nirvana"
                            />
                            <Meus_projetos
                                foto="/img/desconjuracao.png"
                                nome="Site Desconjuração"
                                descricao="O site foi criado com o objetivo de colocar em prática meus conhecimentos de Css e Html, principalmente os comandos Css displey e justify-content, o projeto consiste em um pequeno site sobre um RPG criado, mestrado e exibido pelo streamer Cellbit, neste site é possível visualizar algumas informações sobre o criador, tal como alguns jogadores e seus personagens. "
                                link="https://github.com/sandycavalcanti/Etec---DS/tree/main/site_desconjuracao"
                            />
                            <Meus_projetos
                                foto="/img/curriculo.png"
                                nome="Site Curriculo"
                                descricao="O projeto consiste em um currículo básico criado em 2021, com o objetivo de exibir alguns dos meus projetos criados na plataforma Gimp, além disso também é possível visualizar algumas informações minhas."
                                link="https://github.com/sandycavalcanti/Etec---DS/tree/main/site_curriculo"
                            />
                        </div>
                    
                        <div className={styles.titulo}><h1>Php</h1></div>

                        <div className={styles.projetos}>

                            <Meus_projetos
                                foto="/img/livraria.png"
                                nome="Site gerenciamento de livraria"
                                descricao="O projeto consiste em um site de uma livraria (fictícia) criado com o objetivo de integrar um banco de dados a um site Php, através do site é possível cadastrar um autor, criar uma categoria para o livro, uma editora, além de um livro. "
                                link="https://github.com/sandycavalcanti/Etec---DS/tree/main/PW%20-%20livraria"
                            />
                            <Meus_projetos
                                foto="/img/api_desconjuracao.png"
                                nome=" Site criação de uma api Desconjuração"
                                descricao="O projeto consiste na criação de uma Api feita em Json, a Api apresenta informações sobre alguns personagens do RPG Ordem paranormal, já o site foi feito em PHP e utiliza da Api para mostrar as informações. O projeto foi criado para colocar em prática conhecimentos sobre Api’s e como utilizar uma em um arquivo Php."
                                link="https://github.com/sandycavalcanti/Etec---DS/tree/main/api_desconjuracao"
                            />
                        </div>

                        <div className={styles.titulo}><h1>Java - Android</h1></div>
                            <div className={styles.projetos}>
                                <Projetos_java
                                    foto="/img/app_my_buddy_splash.jpg"
                                    foto1="/img/app_my_buddy.jpg"
                                    nome="App My Buddy"
                                    descricao="O projeto se trata de uma ONG (fictícia), neste App o usuário terá acesso aos animais que estão disponíveis para adoção, os produtos vendidos pela ONG, ver uma pequena descrição sobre a instituição e fazer uma doação a ela, o projeto foi criado com o intuito de colocar em pratica os conhecimentos sobre Java e a plataforma Eclipse."
                                    link="https://github.com/sandycavalcanti/Etec---DS/blob/main/PAM%20-%20App_My_Buddy.rar"
                                />
                                <Projetos_java
                                    foto="/img/great_taste_splash.jpg"
                                    foto1="/img/great_taste.jpg"
                                    nome="App Great Taste"
                                    descricao="O projeto consiste em um app que possibilita ao usuário visualizar e postar receitas, além de poder visualizar outros usuários e suas receitas e poder favoritar uma receita na qual ele goste. O projeto tem o intuito de exercitar os conhecimentos sobre Java, a plataforma Eclipse e criar um banco de dados local no próprio celular, fazendo com que as informações postadas fiquem salvas no dispositivo."
                                    link="https://github.com/sandycavalcanti/Etec---DS/tree/main/PAM%20-%20App_great_taste"
                                />
                            </div>
                        <div className={styles.titulo}><h1>C#</h1></div>

                        <div className={styles.projetos}>
                            <Meus_projetos
                                foto="/img/locadora.jpg"
                                nome="Projeto locadora"
                                descricao="O projeto consiste em aplicativo para desktop de uma Locadora de automóveis, através do aplicativo é possível cadastrar marca, modelo, cliente, automóveis e principalmente realizar uma locação. O projeto tem como objetivo colocar em pratica os conhecimentos de c# tal como integrar um banco de dados com um projeto c#."
                                link="https://github.com/sandycavalcanti/Etec---DS/blob/main/PROJETO%20LOCADORA.rar"
                            />
                        </div>
                            <br/>
                </div>
            </div>
        </div>
    )
}
export default Projetos