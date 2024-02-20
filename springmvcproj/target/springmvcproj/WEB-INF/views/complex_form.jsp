<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <!doctype html>
    <html lang="en">

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Bootstrap demo</title>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    </head>

    <body>
        <div class="container mt-4  ">
            <div class="row">
                <div class="col-md-6 offset-md-3 ">
                    <div class="card bg-primary text-white">
                        <div class="card-body">
                            <h3 class="text-center ">Complex Form</h3>
                            <div class="alert alert-danger" role="alert">
                                <form:errors path="student.*" />
                            </div>

                            <form action="handleForm" method="post">
                                <div class="mb-3">
                                    <label for="name" class="form-label">Name</label>
                                    <input type="text" class="form-control" id="name" placeholder="Enter your name"
                                        name="name">
                                </div>

                                <div class="mb-3">
                                    <label for="id" class="form-label">ID</label>
                                    <input type="text" class="form-control" id="Id" name="Id" placeholder="Enter Id">
                                </div>
                                <div class="mb-3">
                                    <label for="dob" class="form-label">DOB</label>
                                    <input type="date" class="form-control" id="dob" name="dob"
                                        placeholder="dd/MM/yyyy">
                                </div>
                                <div class="mb-3">
                                    <label for="courses" class="form-label">Select courses</label>
                                    <select class="form-select" aria-label="Default select example" name="courses"
                                        multiple>
                                        <option selected disabled>--select course--</option>
                                        <option value="1">Java</option>
                                        <option value="2">Python</option>
                                        <option value="3">C++</option>
                                    </select>
                                </div>
                                <div class="mb-3">
                                    <span>Select Gender</span>
                                    <div class="form-check form-check-inline">

                                        <input class="form-check-input" type="radio" name="gender"
                                            id="flexRadioDefault1" value="female">
                                        <label class="form-check-label" for="flexRadioDefault1">
                                            Female
                                        </label>
                                    </div>
                                    <div class="form-check form-check-inline ">
                                        <input class="form-check-input" type="radio" name="gender"
                                            id="flexRadioDefault2" value="male">
                                        <label class="form-check-label" for="flexRadioDefault2">
                                            Male
                                        </label>
                                    </div>
                                </div>
                                <div class="mb-3">
                                    <label for="type" class="form-label">Select type</label>
                                    <select class="form-select" aria-label="Default select example" name="type">
                                        <option selected disabled>--select type--</option>
                                        <option value="old student">Old Student</option>
                                        <option value="normal">Normal Student</option>
                                    </select>
                                </div>
                                <div class="card">
                                    <div class="card-body">
                                        <p>Address:</p>
                                        <div class="mb-3">
                                            <input type="text" class="form-control" id="name" placeholder="street"
                                                name="address.street">&nbsp;
                                            <input type="text" class="form-control" id="name" placeholder="city"
                                                name="address.city">
                                        </div>
                                    </div>
                                </div>
                                <div class="container text-center mb-3">
                                    <button type="submit" class="btn btn-outline-light  ">Submit</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
            crossorigin="anonymous"></script>
    </body>

    </html>