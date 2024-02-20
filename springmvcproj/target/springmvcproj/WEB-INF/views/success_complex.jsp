<%@page isELIgnored="false" %>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Submitted</title>
    </head>

    <body>
        <h1>Details submitted</h1>
        <h2>${student.name}</h2>
        <h2>${student.id}</h2>
        <h2>${student.dob}</h2>
        <h2>${student.gender}</h2>
        <h2>${student.courses}</h2>
        <h2>${student.type}</h2>
        <h2>${student.address.city}</h2>
        <h2>${student.address.street}</h2>

    </body>

    </html>