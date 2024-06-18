@extends('layout')

@section('content')
    <h1>Show User</h1>
    <div class="user-detail">
        <label>Name:</label>
        <p>{{ $user->name }}</p>
    </div>
    <div class="user-detail">
        <label>Email:</label>
        <p>{{ $user->email }}</p>
    </div>
    <a href="{{ route('users.index') }}" class="back-link">Back to list</a>
@endsection
