<%@page import="java.util.List" %>
    <%@taglib prefix="c" uri="jakarta.tags.core" %>
        <%@page isELIgnored="false" %>
            <!DOCTYPE html>
            <html lang="en">

            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Index </title>
            </head>

            <body>
                <h2>Home page</h2>
                <h3>
                    <!-- <%-- <%=request.getAttribute("name")%>&nbsp;
                        ID:<%=request.getAttribute("id")%><br><br>
                            Courses
                            <% List<String> courses=(List<String>)request.getAttribute("courses");
                                    for(String s:courses){
                                    %><h4>
                                        <%=s%>
                                    </h4>
                                    <% } %>--%> -->

                    Name:${name} <br>
                    <c:forEach var="item" items="${courses}">
                        <!-- <h2>${item}</h2> -->
                        <c:out value="${item}" />
                    </c:forEach>
                </h3>
            </body>

            </html>