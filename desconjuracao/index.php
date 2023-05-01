<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Desconjuração</title>
    <link rel="stylesheet" type="text/css" href="css/main.css">
    <link rel="stylesheet" type="text/css" href="css/index.css">
    <link rel="icon" type="image/x-icon" href="img/favicon.ico">
</head>
<body>
<div id="fundo">
<div id="filtro">
<nav>
    <img id="titulo" src="img/titulo.png">
    <h1>DESCONJURAÇÃO</h1>
</nav>
<div id="container">
    <?php
        $arquivo =file_get_contents('json.json');
        
        $json =json_decode(utf8_encode($arquivo));
        
        foreach($json as $personagens){
            echo "<div class='persona'>";
            echo "<a href='info.php?id=$personagens->id'><img src='$personagens->img'><p>$personagens->nome</p></a>";
            echo "</div>";
        }
    ?>
</div>
</div>
</div>
</body>
</html>