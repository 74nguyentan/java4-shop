<%@include file="../../common/templates/backend/header.jsp" %>
<%@include file="../../common/templates/backend/navbar.jsp" %>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<section class="row">
    <article class="col">
        <div class="card" >
            <div class="card-header">
                List of Customers
            </div>
            <div class="card-body">
                <table class="table table-hover"> 
                    <tr class="table-success">
                        <td>Customer ID</td>
                        <td>Name</td>
                        <td>Password</td>
                        <td>Gender</td>
                        <td>DOB</td>
                        <td>Email</td>
                        <td>Phone</td>
                        <td>Satatus</td>
                        <td>RegisteredDate</td>
                        <td>&nbsp;</td>
                    </tr>
                    <c:forEach var="entity" items="${customers}">
                        <tr>
                            <td>${entity.customerId}</td>
                            <td>${entity.name}</td>
                            <td>${entity.password}</td>
                            <td>${entity.gender}</td>
                            <td>${entity.dob}</td>
                            <td>${entity.email}</td>
                            <td>${entity.phone}</td>
                            <td>${entity.satatus}</td>
                            <td>${entity.registeredDate}</td>
                            <td> 
                                <a href="DetailCustomerController?id=${entity.customerId}">Detail</a> |
                                <a href="EditCustomerController?id=${entity.customerId}">Edit</a> |
                                <a href="DeleteCustomerController?id=${entity.customerId}">Delete</a> 
                            
                            </td>
                        </tr>
                        
                    </c:forEach>
                </table>
            </div>
        </div>
    </article>
</section>
<%@include file="../../common/templates/backend/footer.jsp" %>

