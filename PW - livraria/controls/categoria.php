<?php

//função inserir
function inserir_categoria($conexao,$descricao){
$sql = "insert into tb_categoria values (default, '$descricao')";
return mysqli_query($conexao,$sql);
}

//função alterar
function alterar_categoria($conexao,$descricao,$id_categoria){
$sql = "update tb_categoria set descricao = '$descricao' where id_categoria = $id_categoria";
return mysqli_query($conexao,$sql);
}

//função exluir
function excluir_categoria($conexao,$id_categoria){
$sql = "delete from tb_categoria where id_categoria = $id_categoria";
return mysqli_query($conexao,$sql);
}

//função listar
function listar_categoria($conexao,){
    $categorias = array();
    $resultado = mysqli_query($conexao, "select * from tb_categoria");



    while ($categoria = mysqli_fetch_assoc($resultado)){
        array_push($categorias,$categoria);
    }
    return $categorias;
}

//função buscar
function buscar_categoria($conexao,$id_categoria){
    $resultado = mysqli_query($conexao, "select * from tb_categoria where id_categoria=$id_categoria");
    return mysqli_fetch_assoc($resultado);
}
?>