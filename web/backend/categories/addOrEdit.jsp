<%@include file="../../common/templates/backend/header.jsp" %>
<%@include file="../../common/templates/backend/navbar.jsp" %>

<section class="row">
    <article class="col">
        <div class="card" style="width: 18rem;float: left;">
            <div class="card-header">
                <b style="padding-left:38px;"> ${category != null?"Edit Category":"Add New Category"} </b>
            </div>
            <ul class="card-body">
                <form action="${category !=null?"EditCategoryController":"InsertCategoriesController"}" method="post">
                    <div class="form-group">
                        <label for="categoryId">Category ID:</label>  
                        <input type="text" class="form-control" id="categoryId" name="categoryId" placeholder="Category ID " value="${category.categoryId}">
                    </div>
                    
                    <div class="form-group">
                        <label for="name"> Name:</label>  
                        <input type="text" class="form-control" id="name" name="name" placeholder="Category Name" value="${category.name}">
                    </div>
                    
                    <div class="form-group">
                        <input type="submit" value="${category != null?"Update":"Add new"}" class="btn-primary">
                    </div>
                </form>
            </ul>
        </div>
    </article>
</section>
<%@include file="../../common/templates/backend/footer.jsp" %>

