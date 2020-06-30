<%@include file="../../common/templates/backend/header.jsp" %>
<%@include file="../../common/templates/backend/navbar.jsp" %>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<section class="row">
    <article class="col">
        <div class="card" >
            <div class="card-header">
                List of Categories
            </div>
            <div class="card-body">
                <table class="table table-hover"> 
                    <tr class="table-success">
                        <td>CartDetail ID</td>
                        <td>Quantity</td>
                        <td>Price</td>
                        <td>Note</td>
                        <td>&nbsp;</td>
                    </tr>
                    <c:forEach var="entity" items="${CartDetails}">
                        <tr>
                            <td>${entity.cartDetailId}</td>
                            <td>${entity.quantity}</td>
                            <td>${entity.price}</td>
                            <td>${entity.note}</td>
                            <td> 
                                <a href="DetailCategoryController?id=${entity.cartDetailId}">Detail</a> |
                                <a href="EditCartDetailController?id=${entity.cartDetailId}">Edit</a> |
                                <a href="DeleteCategoryController?id=${entity.cartDetailId}">Delete</a> 
                            
                            </td>
                        </tr>
                        
                    </c:forEach>
                </table>
            </div>
        </div>
    </article>
</section>
<%@include file="../../common/templates/backend/footer.jsp" %>

