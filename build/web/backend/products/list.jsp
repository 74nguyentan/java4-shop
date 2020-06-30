<%@include file="../../common/templates/backend/header.jsp" %>
<%@include file="../../common/templates/backend/navbar.jsp" %>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<section class="row">
    <article class="col">
        <div class="card" >
            <div class="card-header">
                List of Products
            </div>
            <div class="card-body">
                <table class="table table-hover"> 
                    <tr class="table-success">
                        <td>Product ID</td>
                        <td>Name</td>
                        <td>Price</td>
                        <td>Quantity</td>
                        <td>ManufacturedDate</td>
                        <td>Status</td>
                        <td>Description</td>
                        <td>Image</td>
                        
                        <td>&nbsp;</td>
                    </tr>
                    <c:forEach var="entity" items="${products}">
                        <tr>
                            <td>${entity.productId}</td>
                            <td>${entity.name}</td>
                            <td>${entity.price}</td>
                            <td>${entity.quantity}</td>
                            <td>${entity.manufacturedDate}</td>
                            <td>${entity.status}</td>
                            <td>${entity.description}</td>
                            <td><img src="uploads/${entity.image}" alt="${entity.image}"></td>
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

