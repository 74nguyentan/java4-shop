<%-- 
    Document   : SanPham
    Created on : Oct 16, 2019, 11:17:20 AM
    Author     : Van Tan Exfick
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SanPham</title>
        <style>
            .box {
                padding: 0.5% 2% 1% 2%;
                width: 700px;
                height: 540px;
                border: groove 5px #000000;
                moz-border-radius: 16px;
                webkit-border-radius: 16px;
                border-radius: 16px;
                moz-box-shadow: 0px 0px 20px black;
                webkit-box-shadow: 0px 0px 20px black;
                box-shadow: 0px 0px 20px black;
                position: absolute;
                left: 25%;
                top: 12%;
            }
            h2 {
                color: blue;
            }
            legend {
                color: red;
                font-size: 20px;
            }
            .nhap input {
                width: 80%;
                padding-top: 2%;
                padding-bottom: 2%;
                padding-left: 2%;
                margin-left: 7%;

            }
            .nhap input:hover {
                color: red;
                background-color: hsla(0,0%,94%,1.00);
                font-weight: 700;
            }
            .nhap textarea {
                width: 80%;
                padding-top: 2%;
                padding-bottom: 2%;
                padding-left: 2%;
                margin-left: 7%;

            }
            .nhap textarea:hover {
                color: red;
                background-color: hsla(0,0%,94%,1.00);
                font-weight: 700;
            }
            .search {
                width: 91%;
                margin: 0% 0% 0% 4.8%;
            }
            .search .btnSearch:hover {
                color: red;
                background-color: yellow;
                font-weight: 700;
            }
            .search .txtSearch:hover {
                color: red;
                background-color: hsla(0,0%,94%,1.00);
                font-weight: 700;
            }
            .search .txtSearch {
                width: 81%;
                padding-top: 1%;
                padding-bottom: 1%;
                padding-left: 2%;
            }
            .btnSearch {
                width: 15%;
                padding-top: 1%;
                padding-bottom: 1%;
            }
            .them {
                width: 39%;
                float: left;
                margin-left: 8%;
                margin-bottom: 2%;
            }
            .them>input {
                width: 100%;
                padding-top: 3%;
                padding-bottom: 3%;
            }
            .them :hover {
                color: red;
                background-color: yellow;
                font-weight: 700;
            }
            .sua {
                width: 39%;
                float: right;
                margin-right: 9.5%;
                margin-bottom: 2%;
            }
            .sua>input {
                width: 100%;
                padding-top: 3%;
                padding-bottom: 3%;
            }
            .sua :hover {
                color: red;
                background-color: yellow;
                font-weight: 700;
            }
            .xoa {
                width: 39%;
                float: left;
                margin-left: 8%;
                margin-bottom: 3%;
            }
            .xoa>input {
                width: 100%;
                padding-top: 3%;
                padding-bottom: 3%;
            }
            .xoa :hover {
                color: red;
                background-color: yellow;
                font-weight: 700;
            }
            .thoat {
                width: 39%;
                float: right;
                margin-right: 9.5%;
                margin-bottom: 3%;
            }
            .thoat>input {
                width: 100%;
                padding-top: 3%;
                padding-bottom: 3%;
            }
            .thoat :hover {
                color: red;
                background-color: yellow;
                font-weight: 700;
            }
            .abcbbb {
                margin-top: 215px;
            }
            #formInput {
                width: 65%;
                float: left;
            }
            #imagess {
                border: ridge 1px #000000;
                moz-border-radius: 5px;
                webkit-border-radius: 5px;
                border-radius: 5px;
                width: 28%;
                height: 223px;
                float: right;
                margin-right: 4.5%;
            }
        </style>
    </head>
    <body>
        <form>
            <div class="box">
                <h2 align="center">Quản Lí Sản Phẩm</h2>
                <fieldset>
                    <legend><b>Quản lí</b></legend>
                    <br />
                    <div class="search">
                        <input class="txtSearch" type="text" name="search" placeholder="ID Tìm kiếm" />
                        <input class="btnSearch" type="submit" value= "Tìm kiếm " />
                    </div>
                    <br />
                    <div id="box2">
                        <div id="formInput">
                            <div class="nhap">
                                <input type="text" name="maSP" placeholder="ID sản phẩm" />
                            </div>
                            <br />
                            <div class="nhap">
                                <input type="text" name="TenSP" placeholder="Tên sản phẩm" />
                            </div>
                            <br />
                            <div class="nhap">
                                <input type="text" name="gia" placeholder="Giá" />
                            </div>
                            <br />
                            <div class="nhap">
                                <textarea rows="3" cols="40" name="mota" placeholder="Mô tả" ></textarea>
                            </div>
                        </div>
                        <div id="imagess"> <img src="#" alt=" ảnh sản phẩm">  </div>
                    </div>
                    <br />
                    <br />
                    <div class="abcbbb">
                        <div class="them">
                            <input type="submit" value="Thêm" />
                        </div>
                        <div class="sua">
                            <input type="submit" value="Sửa"/>
                        </div>
                        <br />
                        <br />
                        <div class="xoa">
                            <input type="submit" value="Xóa"/>
                        </div>
                        <div class="thoat">
                            <input type="submit" value="Thoát"/>
                        </div>
                        <br />
                    </div>
                </fieldset>
            </div>
        </form>
    </body>
</html>
