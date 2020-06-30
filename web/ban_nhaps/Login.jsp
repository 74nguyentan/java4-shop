<%-- 
    Document   : Login
    Created on : Oct 16, 2019, 11:15:11 AM
    Author     : Van Tan Exfick
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Đăng Nhập</title>
        <style>

            .box{
                padding: 0.5% 1% 1% 1%;
                width:400px;
                height: 370px;
                border:groove 5px #000000;
                moz-border-radius: 16px;	
                webkit-border-radius: 16px;
                border-radius: 16px;

                moz-box-shadow: 0px 0px 20px black;
                webkit-box-shadow: 0px 0px 20px black;
                box-shadow: 0px 0px 20px black;

                position: absolute;
                left: 35%;
                top: 20%;
            }

            h2{color: blue;}
            legend{color: red;
                   font-size: 20px;

            }

            .nhap input{width:80%;
                        padding-top: 2%;
                        padding-bottom: 2%;
                        padding-left: 2%;
                        margin-left:  8%;
                        margin-right:  12%;
            }
            .check{float: left;
                   margin-left: 8%;
            }
            .qmk{float: right;
                 margin-right: 12%;
            }

            .sumitt>input{
                width: 83%;
                padding-top: 2%;
                padding-bottom: 2%;
                margin: 6% 10% 1% 8%;

            }
            .sumitt>input :hover{
                background-color: black;
            }
            .back>input{
                width: 83%;
                margin: 0% 10% 1% 8%;

            }
        </style>
    </head>
    <body>
        <form>
            <div class="box">
                <h2 align="center">Đăng nhập</h2>
                <fieldset>
                    <legend><b>Đăng Nhập</b></legend><br />
                    <div class="nhap"><input type="text" name="username" placeholder="User Name" /> </div> <br />
                    <div class="nhap"><input type="password" name="password"  placeholder="PassWord" /> </div> <br />
                    <div>
                        <div class="check"><label ><input type="checkbox" />Lưu Thông Tin ?</label></div>
                        <div class="qmk"><label><a href="#">Quên Mật Khẩu ?</a></label></div>
                    </div><br />
                    <div class="sumitt"><input type="submit" value="Đăng Nhập" /> </div> <br />
                    <div class="back">  <input type="submit" value="Thoát" /> </div> <br />
                </fieldset>
            </div>
        </form>
    </body>
</html>

