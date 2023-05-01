<?php
    $id=$_GET['id'];
    $arquivo =file_get_contents('json.json');
    $json =json_decode(utf8_encode($arquivo));
?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title><?php 
    foreach($json as $personagens){if($id==$personagens->id){echo $personagens->nome;}  }?></title>
    <link rel="stylesheet" type="text/css" href="css/main.css">
    <link rel="stylesheet" type="text/css" href="css/info.css">
    <link rel="icon" type="image/x-icon" href="img/favicon.ico">
</head>
<body>
<div id="fundo">
<div id="filtro">
<nav>
    <h3>
    <?php 
    foreach($json as$personagens) {
        if($id==$personagens->id){
            echo utf8_decode($personagens->nome);
        }
    }
    ?>
    </h3>
</nav>
<div id="container">
<?php
foreach($json as$personagens) {
    if($id==$personagens->id){
        echo "<div id='dados'>";
        echo "<img src='$personagens->img'>";
        echo "<div>";
        echo "<p class='atributo'>Apelido: </p>".utf8_decode($personagens->apelido)."<br />";
        echo "<p class='atributo'>Idade: </p>".utf8_decode($personagens->idade)."<br />";
        echo "<p class='atributo'>Status: </p>".utf8_decode($personagens->status)."<br />";
        echo "<p class='atributo'>Afinidade: </p>".utf8_decode($personagens->afinidade)."<br />";
        echo "<p class='atributo'>Aparições: </p>".utf8_decode($personagens->aparicoes)."<br />";
        echo "</div></div>";
        echo "<div id='ator'>";
        echo "<p class='atributo'>Ator: </p>".utf8_decode($personagens->ator)."<br />";
        echo "<img src='$personagens->imgator'>";
        echo "</div>";
    }
}
?>
</div>  
</div>
</div>
</body>
</html>