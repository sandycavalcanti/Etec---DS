<?php 

//inserir
   function inserir_autor($conexao, $nome){
       $sql = "insert  into tb_autor values (default, '$nome')";
       return mysqli_query($conexao, $sql);
   }

//alterar   
     function alterar_autor($conexao, $nome, $id_autor){
         $sql ="update tb_autor set nome= '$nome' where id_autor=$id_autor";
         return mysqli_query($conexao, $sql);
     }
//excluir
    function excluir_autor($conexao, $id_autor) {
        $sql="delete from tb_autor where id_autor=$id_autor";
        return mysqli_query($conexao, $sql);
    }
//listar
    function listar_autor($conexao){
        $autores = array();
        $resultado = mysqli_query($conexao, "select * from tb_autor");
        while ($autor = mysqli_fetch_assoc($resultado)){
            array_push($autores, $autor);
        }
        return $autores;
    }    
//buscar
     function buscar_autor($conexao, $id_autor){
        $resultado = mysqli_query($conexao, "select * from tb_autor where
        id_autor=$id_autor");
        return mysqli_fetch_assoc($resultado);
        }
        
   ?>