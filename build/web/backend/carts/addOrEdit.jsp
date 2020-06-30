<%@include file="../../common/templates/backend/header.jsp" %>
<%@include file="../../common/templates/backend/navbar.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<section class="row">
    <article class="col">
        <div class="card" style="width: 18rem;float: left;">
            <div class="card-header">
                <b style="padding-left:38px;"> Add New Cart </b>
            </div>
            <ul class="card-body">
                <form action="InsertCartController" method="post" enctype="multipart/form-data">
                    
                    <div class="form-group">
                        <label for="cartId">Cart ID:</label>  
                        <input type="text" class="form-control" id="cartId" name="cartId" placeholder="Cart ID ">
                    </div>

                    <div class="form-group">
                        <label for="customerId">Customer ID:</label>  
                        <select class="form-control" id="customerId" name="customerId" >
                            <c:forEach var="customer" items="${customers}">
                                <option value="${customer.customerId}">${customer.name}</option>
                            </c:forEach>
                        </select>
                    </div>


                    <div class="form-group">
                        <label for="status"> Status :</label>  
                        <textarea id="status" name="status" class="form-control" placeholder="Status" ></textarea>
                    </div>

                   

                    <div class="form-group">
                        <input type="submit" value="Add new" class="btn-primary">
                    </div>
                </form>
            </ul>
        </div>
    </article>
</section>
<%@include file="../../common/templates/backend/footer.jsp" %>

