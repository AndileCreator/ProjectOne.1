package org.example;
//Create LoginCheck. Compare a username and password stored in String variables with expected values.
// Display Login successful or Invalid credentials.
//Important: Use .equals() to compare String contents rather than ==.

public class LoginCheck {
    private String username;
    private String password;

    public LoginCheck(String _username, String _password) {
        this.username = _username;
        this.password = _password;
    }

    public void Validation(String _username_, String _password_){
        if (!username.equals(_username_)) {
            System.out.println("Username Incorrect");
        }
        else if (!password.equals(_password_)) {
            System.out.println("Password Incorrect");
        }
        else  if (username == null || password == null) {
            System.out.println("Username or password is null");
        }
        else {
            System.out.println("Username and password are a match.");
        }
    }
}
