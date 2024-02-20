<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@page isELIgnored="false" %>
            <!doctype html>
            <html lang="en">

            <head>
                <!-- Required meta tags -->
                <meta charset="utf-8">
                <meta name="viewport" content="width=device-width, initial-scale=1">

                <!-- Bootstrap CSS -->
                <link rel="stylesheet"
                    href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.rtl.min.css"
                    integrity="sha384-nU14brUcp6StFntEOOEBvcJm4huWjB0OcIeQ3fltAfSmuZFrkAif0T+UtNGlKKQv"
                    crossorigin="anonymous">

                <title>
                    <c:out value="${page}"></c:out>
                </title>
            </head>

            <body>
                <div class="container mt-3">
                    <h1 class="text-center">Welcome to TODO Manger</h1>
                    <c:if test="${not empty msg}">
                        <div class="alert alert-success">
                            <b>
                                <c:out value="${msg}"></c:out>
                            </b>
                        </div>
                    </c:if>
                    <div class="row mt-5">
                        <div class="col-md-2">

                            <div class="list-group">

                                <a href="<c:url value='/add'></c:url>" class="list-group-item
                                    list-group-item-action active">ADD TODO</a>
                                <a href="<c:url value='/home'></c:url>" class="list-group-item
                                    list-group-item-action active">View TODO</a>

                            </div>
                        </div>
                        <div class="col-md-10">
                            <c:if test="${page=='home'}">
                                <h1 class="text-center">All TODOs</h1>
                                <c:forEach items="${todos}" var="t">
                                    <div class="card">
                                        <div class="card-body">
                                            <h3>
                                                <c:out value="${t.todoTitle}"></c:out>
                                            </h3>
                                            <p>
                                                <c:out value="${t.todoContent}"></c:out>
                                            </p>
                                        </div>
                                    </div>
                                </c:forEach>

                            </c:if>
                            <c:if test="${page=='add'}">
                                <h1 class="text-center">Add TODO</h1>
                                <form:form action="saveTodo" method="post" modelAttribute="todo">
                                    <div class="form-group">
                                        <form:input path="todoTitle" class="form-control"
                                            placeholder="enter your todo" />
                                    </div>
                                    <div class="form-group">
                                        <form:textarea path="todoContent" class="form-control"
                                            placeholder="Enter your TODO content" style="height:300px;" />
                                    </div>
                                    <div class="form-group">
                                        <form:input path="todoDate" type="date" class="form-control" />
                                    </div>
                                    <div class="container text-center">
                                        <button class="btn btn-outline-success">Add Todo </button>
                                    </div>
                                </form:form>

                            </c:if>
                        </div>



                        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
                            integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
                            crossorigin="anonymous"></script>


            </body>

            </html>