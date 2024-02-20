<%@ page isELIgnored="false" %>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

        <title>Registration success</title>
    </head>

    <body>
        <h3 class="text-center ">${Header}</h3>
        <p class="text-center ">${desc}</p>
        <h2>${msg}</h2>
        <h2>Welcome,${user.user_name}</h2>
        <h3>Email:${user.email}</h3>
        <h3>Password:${user.password}</h3>
    </body>

    </html>