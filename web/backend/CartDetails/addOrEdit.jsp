<%@include file="../../common/templates/backend/header.jsp" %>
<%@include file="../../common/templates/backend/navbar.jsp" %>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<section class="row">
    <article class="col">
        <div class="card" style="width: 18rem;float: left;">
            <div class="card-header">
                <b style="padding-left:38px;">${cartDetail != null?"Edit CartDetail":"Add New CartDetail"}    </b>
            </div>
            <ul class="card-body">
                <form action="${cartDetail !=null?"EditCartDetailController":"InsertCartDetailController"}" method="post">
                    <div class="form-group">
                        <label for="cartDetailId">CartDetail ID:</label>  
                        <input type="text" class="form-control" id="cartDetailId" name="cartDetailId" placeholder="CartDetail ID " value="${cartDetail.cartDetailId}"  >
                    </div>
                    
                   <div class="form-group">
                        <label for="cartId">Cart ID:</label>  
                        <select class="form-control" id="cartId" name="cartId" ${cartDetail != null?"readonly":""  } >
                            <c:forEach var="cart" items="${carts}">
                                <option value="${cart.cartId}">${cart.cartId}</option>
                            </c:forEach>
                        </select>
                    </div>
                            
                   <div class="form-group">
                        <label for="productId">Product ID:</label>  
                        <select class="form-control" id="productId" name="productId" ${cartDetail != null?"readonly":""  } >
                            <c:forEach var="product" items="${products}">
                                <option value="${product.productId}">${product.name}</option>
                            </c:forEach>
                        </select>
                    </div>

                    

                    <div class="form-group">
                        <label for="quantity"> Quantity:</label>  
                        <input type="text" class="form-control" id="quantity" name="quantity" placeholder="Product Quantity"  value="${cartDetail.quantity}" >
                    </div>

                    <div class="form-group">
                        <label for="price"> Price :</label>  
                        <input type="text" class="form-control" id="price" name="price" placeholder="Product Price"  value="${cartDetail.price}" >
                    </div>   

                    <div class="form-group">
                        <label for="note"> Note :</label>  
                        <textarea class="form-control" id="note" name="note" placeholder="Note">${cartDetail.note} </textarea>
                    </div>

                    
                    <div class="form-group">
                        <input type="submit" value="${cartDetail != null?"Update":"Add new"}" class="btn-primary">
                    </div>
                </form>
            </ul>
        </div>
    </article>
</section>
<%@include file="../../common/templates/backend/footer.jsp" %>

