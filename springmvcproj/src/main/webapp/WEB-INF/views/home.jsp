<%@ taglib prefix="c" uri="jakarta.tags.core" %>
    <!doctype html>
    <html lang="en">

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Bootstrap demo</title>
        <link rel="stylesheet" href="<c:url value='/resources/css/styles.css' />">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    </head>

    <body>
        <img src="<c:url value='/resources/images/img.jpg'/>" alt="">
        <div class="container text-center ">
            <div class="row">
                <div class="card bg-primary  mt-5 mx-auto " style="width: 50%;">
                    <div class="card-body py-5">
                        <h3 class="text-white " style="text-transform: uppercase;">My search</h3>
                        <form action="query" class="mt-3" method="post">
                            <div class="form-group">
                                <input type="text" class="form-control " name="query" placeholder="Enter keyword">
                            </div>
                            <div class="container text-center">
                                <button class="btn btn-outline-light mt-4">Search</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
            crossorigin="anonymous"></script>
        <script src="<c:url value='/resources/js/script.js' />"></script>
    </body>

    </html>