<%@include file="../../common/templates/backend/header.jsp" %>
<%@include file="../../common/templates/backend/navbar.jsp" %>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<section class="row">
    <article class="col">
        <div class="card" >
            <div class="card-header">
                List of Cart
            </div>
            <div class="card-body">
                <table class="table table-hover"> 
                    <tr class="table-success">
                        <td>Cart ID</td>                    
                        <td>CreatedDate</td>
                        <td>Status</td>
                        <td>&nbsp;</td>
                    </tr>
                    <c:forEach var="entity" items="${carts}">
                        <tr>
                            <td>${entity.cartId}</td>
                            <td>${entity.createdDate}</td>
                            <td>${entity.status}</td>

                            <td> 
                                <a href="DetailProductController?id=${entity.productId}">Detail</a> |
                                <a href="EditProductController?id=${entity.productId}">Edit</a> |
                                <a href="DeleteProductController?id=${entity.productId}">Delete</a> 

                            </td>
                        </tr>

                    </c:forEach>
                </table>
            </div>
        </div>
    </article>
</section>
<%@include file="../../common/templates/backend/footer.jsp" %>

