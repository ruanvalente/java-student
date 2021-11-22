package example.exception;

public class CustomExceptionLogin extends Exception {
    public CustomExceptionLogin() {
        super("Login Inválido");
    }

    public CustomExceptionLogin(String message) {
        super(message);
    }
}
