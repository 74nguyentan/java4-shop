<%@include file="../../common/templates/backend/header.jsp" %>
<%@include file="../../common/templates/backend/navbar.jsp" %>
<section class="row">
    <article class="col">
        <div class="card" style="width: 18rem;float: left;">
            <div class="card-header">
                <b style="padding-left:38px;"> Login </b>
            </div>
            <ul class="card-body">
                
                <form action="InsertCustomersController" method="post">
       
                    
                      
                    <div class="form-group">
                        <label for="username"> UserName :</label>  
                        <input type="text" class="form-control" id="username" name="username" placeholder="User Name">
                    </div>
                    
                    <div class="form-group">
                        <label for="password"> Password :</label>  
                        <textarea class="form-control" id="password" name="password" placeholder="Password"></textarea>
                    </div>
                    
                    <div class="form-control">
                        <div for="luu" class="check"><label ><input type="checkbox" /> Luu Thông Tin ?</label></div>
                        <div for="quenmk" class="qmk"><label><a href="#">Quên Mât Khâu ?</a></label></div>
                    </div>
                    <br> <br>
                    <div class="form-group">
                        <input type="submit" value="Login" class="btn-primary">
                    </div>
                </form>
            </ul>
        </div>
    </article>
</section>
<%@include file="../../common/templates/backend/footer.jsp" %>

