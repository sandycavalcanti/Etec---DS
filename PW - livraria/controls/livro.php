<?php

 function inserir_livro($conexao,$fk_editora, $fk_categoria, $fk_autor, 
$titulo, $qtd){
    $sql="insert into tb_livro values (default, $fk_editora, $fk_categoria, 
$fk_autor, '$titulo', $qtd)";
    return mysqli_query($conexao, $sql);
}

function alterar_livro($conexao,$fk_editora, $fk_categoria, $fk_autor, 
$titulo, $qtd, $id_livro){
   $sql="update tb_livro set 
fk_editora=$fk_editora,
fk_categoria=$fk_categoria,
fk_autor=$fk_autor,
titulo='$titulo',
qtd=$qtd
where id_livro=$id_livro";
   return mysqli_query($conexao, $sql);
}

function excluir_livro($conexao, $id_livro){
    $sql="delete from tb_livro where id_livro= $id_livro";
    return mysqli_query($conexao,$sql);
}

function listar_livro($conexao){
    $livros = array();
    $resultado = mysqli_query($conexao, "select * from view_livro");
    while ($livro = mysqli_fetch_assoc($resultado)) {
    array_push ($livros, $livro);
    }
    return $livros;

}

function buscar_livro($conexao, $id_livro){
    $resultado = mysqli_query($conexao, "select * from view_livro where 
    id_livro=$id_livro");
    return mysqli_fetch_assoc($resultado);
}
