<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Book Details</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f4f4f9;
            margin: 0;
            padding: 0;
        }

        h2 {
            text-align: center;
            color: #4CAF50;
            margin-top: 50px;
        }

        table {
            border-collapse: collapse;
            width: 60%;
            margin: 30px auto;
            background-color: white;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
            overflow: hidden;
        }

        table, th, td {
            border: 1px solid #ddd;
        }

        th {
            background-color: #4CAF50;
            color: white;
            padding: 12px;
            text-align: center;
        }

        td {
            padding: 12px;
            background-color: #f9f9f9;
            text-align: center;
            color: #333;
        }

        tr:hover {
            background-color: #f1f1f1;
        }

        a {
            display: inline-block;
            margin-top: 20px;
            text-decoration: none;
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border-radius: 5px;
            transition: background-color 0.3s;
        }

        a:hover {
            background-color: #45a049;
        }

        /* Responsive adjustments */
        @media (max-width: 768px) {
            table {
                width: 90%;
            }

            td, th {
                padding: 8px;
            }
        }
    </style>
</head>
<body>

    <h2>Submitted Book Details</h2>

    <table>
        <tr>
            <th>Book Name</th>
            <td>${bookName}</td>
        </tr>
        <tr>
            <th>Author</th>
            <td>${author}</td>
        </tr>
        <tr>
            <th>Genre</th>
            <td>${genre}</td>
        </tr>
    </table>

    <div style="text-align: center;">
        <a href="/">Submit Another Book</a>
    </div>

</body>
</html>
