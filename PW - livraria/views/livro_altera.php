<?php
    include("../bd/conexao.php");
    include("../controls/livro.php");
    $id = $_GET['id'];
    $livro = buscar_livro($conexao, $id);
    
?>
<?php
            if ($_POST) {
                $id=$_POST['id'];
                $editora=$_POST['editora'];
                $categoria=$_POST['categoria'];
                $autor=$_POST['autor'];
                $titulo=$_POST['titulo'];
                $qtd=$_POST['qtd'];
                if(alterar_livro($conexao,$editora, $categoria, $autor, $titulo, $qtd, $id)){
                  header("Location: livro_lista.php");
                }
                else{
                  $msg=mysqli_error($conexao);
                  echo($msg);
                }
            }
        ?>
<!DOCTYPE html>
<html lang="pt-br"> 
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel='stylesheet' type='text/css' media='screen' href='../css/bootstrap.css'>
    <link rel='stylesheet' type='text/css' media='screen' href='css/alterar.css'>
    <script src="../js/bootstrap.js"></script>
    <title>Alterar livro</title>
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
              <h1>Alterar livro</h1>
            </div>
        <form action="" method="post">
            <label name="lbl_id">Código</label>
            <input class="editText_id" type="number" name="id" value="<?= $livro['id_livro'] ?>" readonly>
              <br>
            <label name="lbl_autor">Autor: </label> 
            <select class="comboBox" name="autor">
              <?php
                include("../controls/autor.php");
                $autores = listar_autor($conexao);
                foreach ($autores as $a) :
                echo "<option value=" . $a['id_autor'] . ">" . $a['nome'] . "</option>";
                endforeach;
              ?>
            </select>
              <br>
            <label name="lbl_categoria">Categoria:</label>
            <select class="comboBox" name="categoria">
              <?php
                include("../controls/categoria.php");
                $categorias = listar_categoria($conexao);
                foreach ($categorias as $c) :
                echo "<option value=" . $c['id_categoria'] . ">" . $c['descricao'] . "</option>";
                endforeach;
              ?>
            </select>
            <br>
            <label name="lbl_editora">Editora:</label>
            <select class="comboBox" name="editora">
              <?php
                include("../controls/editora.php");
                $editoras = listar_editora($conexao);
                foreach ($editoras as $e) :
                echo "<option value=" . $e['id_editora'] . ">" . $e['descricao'] . "</option>";
                endforeach;
              ?>
            </select>
              <br>
            <label for="titulo">Titulo:</label>
            <input type="text" class="editText" name="titulo" placeholder="Titulo" id="" value="<?=$livro['titulo']?>">
              <br>
            <label for="qtd">Quantidade:</label>
            <input type="number" class="editText" name="qtd" placeholder="Quantidade" value="<?=$livro['qtd']?>">
              <br>
                <div class="container_botao">
                  <input type="submit" class="botao" value="Alterar">
                </div>
        </form>
        
      </div>
    </div>
  </div>
</body>
</html>
