<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome to Your Application</title>
    <link rel="stylesheet" href="{{ asset('css/styles.css') }}">
    <style>
        /* Additional styles for the welcome page */
        .welcome-container {
            text-align: center;
            margin-top: 50px;
        }

        .welcome-header {
            font-size: 48px;
            margin-bottom: 20px;
            color: #007bff;
        }

        .welcome-subheader {
            font-size: 24px;
            margin-bottom: 30px;
            color: #343a40;
        }

        .welcome-buttons a {
            margin: 0 10px;
            padding: 10px 20px;
            background-color: #28a745;
            color: white;
            text-decoration: none;
            border-radius: 4px;
        }

        .welcome-buttons a:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>
    <div class="container welcome-container">
        <h1 class="welcome-header">Welcome to Your Application</h1>
        <p class="welcome-subheader">The best place to manage your tasks and projects.</p>
        <div class="welcome-buttons">
            <a href="{{ route('users.index') }}">View Users</a>
            <a href="{{ route('users.create') }}">Create User</a>
        </div>
    </div>
</body>
</html>
