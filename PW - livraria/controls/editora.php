<?php

    function inserir_editora($conexao,$descricao){
        $sql = "insert into tb_editora values (default, '$descricao')";
        return mysqli_query($conexao, $sql);
    }

    function alterar_editora($conexao, $descricao, $id_editora){
        $sql = "update tb_editora set descricao='$descricao' where id_editora=$id_editora";
        return mysqli_query($conexao, $sql);
    }

    function excluir_editora($conexao, $id_editora){
        $sql = "delete from tb_editora where id_editora=$id_editora";
        return mysqli_query($conexao, $sql);
    }

    function listar_editora($conexao){
        $editoras = array();
        $resultado = mysqli_query($conexao, "select * from tb_editora");
        while($editora = mysqli_fetch_assoc($resultado)){
        array_push($editoras, $editora);
        }
        return $editoras;
    }

    function buscar_editora($conexao, $id_editora){
        $resultado = mysqli_query($conexao, "select * from tb_editora where id_editora=$id_editora");
        return mysqli_fetch_assoc($resultado);
    }

?>