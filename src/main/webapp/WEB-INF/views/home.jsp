<%@ page language="java" import="java.util.*,com.shopping.model.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product List</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .product-card {
            margin-bottom: 20px;
        }
        .product-image {
            height: 200px;
            width: 100%;
            object-fit: cover;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1 class="my-4">Product List</h1>
        <div class="row">
            <%
                List<Product> products = (List<Product>) request.getAttribute("pdlist");
                if (products != null) {
                    for (Product product : products) {
            %>
                <div class="col-md-4">
                    <div class="card product-card">
                        <img class="card-img-top product-image" src="<%= product.getImage() %>" alt="<%= product.getProd_title() %>">
                        <div class="card-body">
                            <h5 class="card-title"><%= product.getProd_title() %></h5>
                            <p class="card-text">Price: $<%= product.getProd_price() %></p>
                            
                        </div>
                    </div>
                </div>
            <%
                    }
                } else {
            %>
                <p>No products available.</p>
            <%
                }
            %>
        </div>
    </div>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
