<?php
    include("../bd/conexao.php");
    include("../controls/categoria.php");
    $id=$_GET['id'];
    $categoria=buscar_categoria($conexao,$id);
?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Alterar Categoria</title>
    <link rel='stylesheet' type='text/css' media='screen' href='../css/bootstrap.css'>
    <link rel='stylesheet' type='text/css' media='screen' href='css/alterar.css'>
    <script src="../js/bootstrap.js"></script>
</head>
<body>
  <div id="background">
    <nav class="navbar navbar-expand-lg">
      <div class="container-fluid">
            <img src="../img/icon.png" alt="Bootstrap" width="40">
            <a class="navbar-brand" href="index.html">BookMaster</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav me-auto mb-2 mb-lg-0">
            <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="index.html">Home</a>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                  Cadastros
                </a>
                <ul class="dropdown-menu">
                  <li><a class="dropdown-item" href="livro_cad.php">Cadastrar livro</a></li>
                  <li><a class="dropdown-item" href="editora_cad.php">Cadastrar editora</a></li>
                  <li><a class="dropdown-item" href="categoria_cad.php">Cadastrar categoria</a></li>
                  <li><a class="dropdown-item" href="autor_cad.php">Cadastrar autor</a></li>
                </ul>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                  Checar listas
                </a>
              <ul class="dropdown-menu">
                <li><a class="dropdown-item" href="livro_lista.php">Lista de livros</a></li>
                <li><a class="dropdown-item" href="editora_lista.php">Lista de editoras</a></li>
                <li><a class="dropdown-item" href="categoria_lista.php">Lista de categorias</a></li>
                <li><a class="dropdown-item" href="autor_lista.php">Lista de autores</a></li>
              </ul>
            </li>
          </ul>
        </div>
      </div>
    </nav>
    <div id="container">
      <div id="container2">
        <div class="titulo">
          <h1>Alterar categorias</h1>
        </div>
        <form action="" method="post">
          <div class="espaco">
            <label name="lbl_id">Código:</label>
            <input type="number" class="editText_id" name="id" value="<?=$categoria['id_categoria']?>" readonly>
          </div>
            <label name="lbl_des">Descrição da categoria:</label>
            <input type="text" class="editText" name="desc" value="<?=$categoria['descricao']?>" placeholder="Digite a descrição da categoria">
              <br>
          <div class="container_botao">
            <input type="submit" class="botao" value="Alterar">
          </div>
        </form>
        <?php
          if($_POST){
            $id=$_POST['id'];
            $desc=$_POST['desc'];
              if(alterar_categoria($conexao,$desc,$id)){
                  echo("Alterado com sucesso");
                  header("Location: categoria_lista.php");
              }else
              {
                  $msg=mysqli_error($conexao);
                  echo ($msg);
              }
          }
        ?>
      </div>
    </div>
  </div>
</body>
</html>