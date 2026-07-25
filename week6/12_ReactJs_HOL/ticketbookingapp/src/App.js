import { useState } from "react";
import Login from "./Login";
import GuestPage from "./GuestPage";
import UserPage from "./UserPage";

function App() {

    const [isLoggedIn, setIsLoggedIn] = useState(false);

    const handleLogin = () => {
        setIsLoggedIn(true);
    };

    const handleLogout = () => {
        setIsLoggedIn(false);
    };

    return (
        <div>

            <Login
                isLoggedIn={isLoggedIn}
                handleLogin={handleLogin}
                handleLogout={handleLogout}
            />

            {
                isLoggedIn
                    ? <UserPage />
                    : <GuestPage />
            }

        </div>
    );
}

export default App;