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
                        <td>Category ID</td>
                        <td>Name</td>
                        <td>&nbsp;</td>
                    </tr>
                    <c:forEach var="entity" items="${categories}">
                        <tr>
                            <td>${entity.categoryId}</td>
                            <td>${entity.name}</td>
                            <td> 
                                <a href="DetailCategoryController?id=${entity.categoryId}">Detail</a> |
                                <a href="EditCategoryController?id=${entity.categoryId}">Edit</a> |
                                <a href="DeleteCategoryController?id=${entity.categoryId}">Delete</a> 
                            
                            </td>
                        </tr>
                        
                    </c:forEach>
                </table>
            </div>
        </div>
    </article>
</section>
<%@include file="../../common/templates/backend/footer.jsp" %>

