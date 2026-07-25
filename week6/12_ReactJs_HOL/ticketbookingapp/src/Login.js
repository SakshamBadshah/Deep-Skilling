function Login(props) {

    return (
        <div>

            {props.isLoggedIn ? (
                <button onClick={props.handleLogout}>
                    Logout
                </button>
            ) : (
                <button onClick={props.handleLogin}>
                    Login
                </button>
            )}

        </div>
    );
}

export default Login;