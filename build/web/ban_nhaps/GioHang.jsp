<%-- 
    Document   : GioHang
    Created on : Oct 16, 2019, 11:12:12 AM
    Author     : Van Tan Exfick
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>GioHang</title>
        <style>
            .box {
                padding: 0.5% 2% 1% 2%;
                width: 1400px;
                height: 560px;
                border: groove 5px #000000;
                -moz-border-radius: 16px;
                -webkit-border-radius: 16px;
                border-radius: 16px;
                -moz-box-shadow: 0px 0px 20px black;
                -webkit-box-shadow: 0px 0px 20px black;
                box-shadow: 0px 0px 20px black;
                position: absolute;
                left: 4%;
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
            .them {
                width: 39%;
                float: left;
                margin-left: 7%;
                margin-bottom: 2%;
            }
            .them>input {
                width: 100%;
                padding-top: 5%;
                padding-bottom: 5%;
            }
            .them :hover {
                color: red;
                background-color: yellow;
                font-weight: 700;
            }
            .moi {
                width: 39%;
                float: right;
                margin-right: 9.5%;
                margin-bottom: 2%;
            }
            .moi>input {
                width: 100%;
                padding-top: 5%;
                padding-bottom: 5%;
            }
            .moi :hover {
                color: red;
                background-color: yellow;
                font-weight: 700;
            }
            .thoat {
                width: 83.7%;
                margin-left: 6.8%;
                margin-bottom: 3%;
            }
            .thoat>input {
                width: 100%;
                padding-top: 2%;
                padding-bottom: 2%;
            }
            .thoat :hover {
                color: red;
                background-color: yellow;
                font-weight: 700;
            }
            #formInput {
                width: 25%;
                float: left;
            }
            #table {
                width: 73%;
                float: right;
                margin-right: 1.5%;

            }

            #bang{
                width: 100%;
                height: 400px;

            }
            #methorr{
                width: 100%;
                margin-left: 10px;
                margin-right: -60px;
            }
            #methorr input {

                width: 80px;
                padding: 5px 0px 5px 0px; 
                margin: -22px 0px -22px 0px; 
            }
            #methorr input:hover {

                background-color: greenyellow;
                color: red;

                font-weight: 500;
            }
        </style>
    </head>
    <body>
        <form>
            <div class="box">
                <h2 align="center">Quản Lí Giỏ Hàng</h2>
                <fieldset>
                    <legend><b>Quản lí</b></legend>
                    <br />

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
                        </div><br />
                        <div class="nhap">
                            <input type="text" name="soluong" placeholder="Số lượng" />
                        </div>
                        <br />
                        <div class="nhap">
                            <textarea rows="6" cols="40" name="ghichu" placeholder="Ghi chú" ></textarea>
                        </div>
                        <br />
                        <div>
                            <div class="them">
                                <input type="submit" value="Thêm" />
                            </div>
                            <div class="moi">
                                <input type="submit" value="Mới"/>
                            </div>
                            <br />
                            <div class="thoat">
                                <input type="submit" value="Thoát"/>
                            </div>
                        </div>
                    </div>
                    <div id="table">
                        <table id="bang" border="1">
                            <tr>
                                <th>STT</th>
                                <th>Mã SP</th>
                                <th>Tên sản phẩm</th>
                                <th>Số lượng</th>
                                <th>Đơn giá</th>
                                <th>Thành tiền</th>
                                <th>Ghi chú</th>
                                <th>Phương thức</th>
                            </tr>
                            <tr>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td>
                                    <div id="methorr">
                                        <input type="submit" value="sửa"/>
                                        <input type="submit" value="xóa"/>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td>
                                    <div id="methorr">
                                        <input type="submit" value="sửa"/>
                                        <input type="submit" value="xóa"/>
                                    </div></td>
                            </tr>
                            <tr>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td>
                                    <div id="methorr">
                                        <input type="submit" value="sửa"/>
                                        <input type="submit" value="xóa"/>
                                    </div></td>
                            </tr>
                            <tr>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td>
                                    <div id="methorr">
                                        <input type="submit" value="sửa"/>
                                        <input type="submit" value="xóa"/>
                                    </div></td>
                            </tr>
                            <tr>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td>
                                    <div id="methorr">
                                        <input type="submit" value="sửa"/>
                                        <input type="submit" value="xóa"/>
                                    </div></td>
                            </tr>
                            <tr>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td>
                                    <div id="methorr">
                                        <input type="submit" value="sửa"/>
                                        <input type="submit" value="xóa"/>
                                    </div></td>
                            </tr>
                            <tr>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td>
                                    <div id="methorr">
                                        <input type="submit" value="sửa"/>
                                        <input type="submit" value="xóa"/>
                                    </div></td>
                            </tr>
                        </table>
                    </div>

                    <br />
                    <br />
                </fieldset>
            </div>
        </form>
    </body>
</html>

