<%-- 
    Document   : index
    Created on : Jun 8, 2013, 12:31:14 AM
    Author     : Dilukshan Mahendra
--%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
         <link rel="stylesheet" href="../fontawesome-free-5.11.2-web/css/all.min.css"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
   
        <title>Shopping Cart - Login</title>
        <style type="text/css">
            <!--
            .containerr {
                height: 700px;
                width: 900px;
                margin:auto;
            }
            .headbanner {
                float: left;
                height: 80px;
                width: 900px;
                vertical-align:middle;
                background-color:#FFCC00;


            }
            .containerr .headbanner h1 {
                font-family: Verdana, Geneva, sans-serif;
                color: #CC3300;

            }
            .mycontent {
                float: left;
                height: 200px;
                width: 900px;
            }
            .myfooter {
                float: left;
                height: 100px;
                width: 900px;
                border-top-width:3px;
                border-top-style:solid;
                border-top-color:#FFCC00;
            }
            .containerr .myfooter h3 {
                font-family: Verdana, Geneva, sans-serif;
                font-size: 12px;
                color:#CC3300;
            }
            .space {
                float: left;
                height: 35px;
                width: 900px;
                font-size: 24px;
                font-family: Verdana, Geneva, sans-serif;
                padding-top:15px;
                margin-bottom: 15px;

            }
            .formcontent {
                float: left;
                height: 200px;
                width: 900px;
            }
            .formtext {
                color:#CC3300;
                font-family:Verdana, Geneva, sans-serif;
            }
            -->
        </style>
    </head>
    
    
     <main class="container">
         <nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="#">Shop_NVT</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="#"><i class="fas fa-home"></i>Home <span class="sr-only">(current)</span></a>
</li>
            <li class="nav-item">
                <a class="nav-link" href="#"> Categories</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#"> Products</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#"> Carts</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#"> Carts detail</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#"> Customers</a>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Contact
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item" href="#">Phone</a>
                    <a class="dropdown-item" href="#">Email</a>
                    <div class="dropdown-divider"></div>
                    <a class="dropdown-item" href="#">Facebook</a>
                </div>
            </li>
         
        </ul>
        <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
    </div>
</nav>
         
    
    <body style="margin:0; padding:0">
        <div class="containerr">
            <div class="headbanner">
                <h1 style="display:inline">
                    <center>
                        <img src="img/shopping.png" />[My Shopping Cart]
                    </center>
                </h1>
            </div>
            <div class="mycontent">
                <div class="space"><span><a class="formtext">Login</a></span></div>
                <div class="formcontent">
                    <form action="loginval" method="post">
                        <table>
                            <tr>
                                <td class="formtext">Username :</td>
                                <td><input id="name" name="uname" type="text" size="30" /></td><td><a style="font-size: 10px; font-family:lucida sans; color: darkgray">[Any name]</a></td>
                            </tr>
                            <tr>
                                <td class="formtext">Password :</td>
                                <td><input id="pas" name="pass" type="password" size="30" /></td><td><a style="font-size: 10px; font-family:lucida sans; color: darkgray">[Pass = 1234]</a></td>
                            </tr>
                            <tr>
                                <td><input type="submit" value="Submit"/></td>
                            </tr>
                        </table>
                    </form>
                </div>
            </div>
           
        </div>
        <footer class="row">
                <section class="col">
                    <div class="alert alert-success" role="alert">
                        Copyright by &copy: FPT polytechnic
                    </div>
                </section>
            </footer>
        </main>

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

    </body>
</html>
