<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
 
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <link href="ESTILOSGYM.css" rel="stylesheet" type="text/css"/>
        <title>LOGIN</title>
    </head>
    <body>
        <div class="container center-block" >
            <div class="row justify-content-center">
        <div class="card" style="width: 18rem;">
             <img src="LOGIN.png"class="card-img-top" alt="...">
            <div class="card-body">
                <form method="POST" action="Validar">
                    <div class="form-group"> 
                        <center>
                        <label>Usuario</label> 
                        </center>
                        <input type="text" class="form-control" name="txtusuario">
                        <small id="emailHelp" class="form-text text-muted">Ingrese su  usuario sin espacios</small>
                    </div>
                    <div class="form-group"> 
                        <center>
                        <label for="exampleInputPassword1">Contraseņa</label> 
                        </center>
                        <input type="password" class="form-control" id="exampleInputPassword1" name="txtpassword">
                    </div>
                    </div> 
                    <center>
                    <button type="submit" class="btn btn-primary" name="accion" value="Ingresar">Ingresar</button>
                    </center>
                </form>
            </div>
        </div>
              </div>  
            </div>
 
        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    </body>
</html>
