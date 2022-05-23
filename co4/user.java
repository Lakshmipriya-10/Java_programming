import java.util.Scanner;

class userNameError extends Exception {
    String user;

    userNameError(String u) {
        user = u;
    }

    public String userExp() {
        return "userNameError[" + user + "]";
    }
}

class PassWordError extends Exception {
    String passwd;

    PassWordError(String p) {
        passwd = p;
    }

    public String passExp() {
        return "PassWordError[" + passwd + "]";
    }
}

public class user {
    static void check(String u, String p) throws userNameError, PassWordError {
        if (!u.equals("user")) {
            throw new userNameError(u);
        } else if (!p.equals("user@123")) {
            throw new PassWordError(p);
        } else {
            System.out.println("Auntentication Success!!!");
        }
    }

    public static void main(String[] args) {
        try {
            String u, p;
            Scanner sc = new Scanner(System.in);
            System.out.println("Username : ");
            u = sc.nextLine();
            System.out.println("Password : ");
            p = sc.nextLine();
            check(u, p);
        } catch (userNameError e) {
            System.out.println("Invalid Username!!!");
        } catch (PassWordError e) {
            System.out.println("Invalid Password!!!");
        }
    }
}
