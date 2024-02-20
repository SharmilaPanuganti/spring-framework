<%@taglib prefix="c" uri="jakarta.tags.core" %>
    <%@page isELIgnored="false" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Help</title>
        </head>

        <body>
            <h1>Help page <br>
                Name:<%=request.getAttribute("name")%><br>
                    Employees:<%=request.getAttribute("Employees")%>
            </h1>
            <h2>
                Time: <%=request.getAttribute("time")%>
            </h2>
            <h3>
                Marks
                <c:forEach var="i" items="${marks}">
                    ${i}
                </c:forEach>
            </h3>


        </body>

        </html>