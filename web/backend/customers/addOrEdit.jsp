<%@include file="../../common/templates/backend/header.jsp" %>
<%@include file="../../common/templates/backend/navbar.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<section class="row">
    <article class="col">
        <div class="card" style="width: 18rem;float: left;">
            <div class="card-header">
                <b style="padding-left:38px;"> ${customer != null?"Edit Customer":"Add New Customer"}  </b>
            </div>
            <ul class="card-body">
                <form action="${product !=null?"EditCustomerController":"InsertCustomersController"}" method="post">
                    <div class="form-group">
                        <label for="customerId">Customer ID:</label>  
                        <input type="text" class="form-control" id="customerId" name="customerId" placeholder="CustomerId ID " value="${customer.customerId}">
                    </div>
                    
                    <div class="form-group">
                        <label for="name"> Name:</label>  
                        <input type="text" class="form-control" id="name" name="name" placeholder="Customer Name" value="${customer.name}">
                    </div>
                        
                    <div class="form-group">
                        <label for="password"> Password :</label>  
                        <input type="text" class="form-control" id="password" name="password" placeholder="Password" value="${customer.password}" >
                    </div>
                    
                    <div class="form-group">
                        <label for="gender"> Gender :</label>  
                       <select id="gender" name="gender" class="form-control" >
                            <option value="Nam">Nam</option>
                            <option value="Nu">Nu</option>
                            <option value="Nu">Khác</option>
                        </select>
                    </div>
                      
                    <div class="form-group">
                        <label for="email"> Email :</label>  
                        <input type="text" class="form-control" id="email" name="email" placeholder="Email" value="${customer.email}">
                    </div>
                    
                      
                    <div class="form-group">
                        <label for="phone"> Phone :</label>  
                        <input type="text" class="form-control" id="phone" name="phone" placeholder="Phone" value="${customer.phone}">
                    </div>
                    
                    <div class="form-group">
                        <label for="satatus"> Status :</label>  
                        <textarea class="form-control" id="satatus" name="satatus" placeholder="Status">${customer.satatus}</textarea>
                    </div>
                    
                    <div class="form-group">
                        <input type="submit" value="${customer != null?"Update":"Add new"}" class="btn-primary">
                    </div>
                </form>
            </ul>
        </div>
    </article>
</section>
<%@include file="../../common/templates/backend/footer.jsp" %>

