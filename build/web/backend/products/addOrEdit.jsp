<%@include file="../../common/templates/backend/header.jsp" %>
<%@include file="../../common/templates/backend/navbar.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<section class="row">
    <article class="col">
        <div class="card" style="width: 18rem;float: left;">
            <div class="card-header">
                <b style="padding-left:38px;"> ${product != null?"Edit Product":"Add New Product"}  </b>
            </div>
            <ul class="card-body">
                <form action="${product !=null?"EditProductController":"InsertProductController"}" method="post" enctype="multipart/form-data">
                  
                 
                        <div class="form-group">
                            <label for="productId">Product ID:</label>  
                            <input type="text" class="form-control" id="productId" name="productId" placeholder="Product ID " value="${product.productId}">
                        </div>
                 
                    <div class="form-group">
                        <label for="categoryId">Category ID:</label>  
                        <select class="form-control" id="categoryId" name="categoryId" ${product != null?"readonly":""  }>
                            <c:forEach var="category" items="${categories}">
                                <option value="${category.categoryId}">${category.name}</option>
                            </c:forEach>
                        </select>
                    </div>

                    <div class="form-group">
                        <label for="name"> Name:</label>  
                        <input type="text" class="form-control" id="name" name="name" placeholder="Product Name" value="${product.name}">
                    </div>

                    <div class="form-group">
                        <label for="quantity"> Quantity:</label>  
                        <input type="text" class="form-control" id="quantity" name="quantity" placeholder="Product Quantity" value="${product.quantity}">
                    </div>

                    <div class="form-group">
                        <label for="price"> Price :</label>  
                        <input type="text" class="form-control" id="price" name="price" placeholder="Product Price" value="${product.price}">
                    </div>   

                    <div class="form-group">
                        <label for="status"> Status :</label>  
                        <select id="status" name="status" class="form-control" >
                            <option value="InStock">In-Stock</option>
                            <option value="OutStock">Out-Stock</option>
                        </select>
                    </div>
                    <c:if test="${product != null}">
                        <div class="form-group">
                            <img src="uploads/${product.image} " alt="${product.image}">
                        </div>
                    </c:if>
                    <div class="form-group">
                        <label for="image"> Image :</label>  
                        <input type="file" id="image" name="image" class="form-control">
                    </div>

                    <div class="form-group">
                        <label for="description"> Description :</label>  
                        <textarea  class="form-control" id="description" name="description" placeholder="Description">${product.description}</textarea>

                    </div>


                    <div class="form-group">
                        <input type="submit" value="${product != null?"Update":"Add new"}" class="btn-primary">
                    </div>
                </form>
            </ul>
        </div>
    </article>
</section>
<%@include file="../../common/templates/backend/footer.jsp" %>

