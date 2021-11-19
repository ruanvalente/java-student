package example.Main;

import example.exception.CustomExceptionLogin;

public class UserLogin {
    public static void main(String[] args){
        try {
            login();
        } catch (CustomExceptionLogin e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void login() throws CustomExceptionLogin {
        String name = "user";
        String password = "123";

        if(!name.equals(name) || !password.equals(password)) {
            throw new CustomExceptionLogin();
        }
        System.out.println("Usuário logado com sucesso");
    }
}
