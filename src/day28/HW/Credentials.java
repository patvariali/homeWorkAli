package day28.HW;

public class Credentials {
    private String username;
    private String password;

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {
        if (username == null || username.isEmpty() || username.isBlank()) {
            throw new InvalidEntryException("Invalid username: " + username);

        }
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null || password.isEmpty() || password.isBlank()) {
            throw new InvalidEntryException("Invalid password: " + password + "\nPassword cant be null, empty or blank");
        }
        boolean hasDigit = false;
        boolean hasSpecial = false;
        boolean hasLetter = false;
        boolean isLongEnough = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                hasDigit = true;
            }
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                hasSpecial = true;
            }
            if (Character.isLetter(password.charAt(i))) {
                hasLetter = true;
            }
            if (password.length() >= 8) {
                isLongEnough = true;
            }
        }


        if (!hasSpecial || !hasDigit || !hasLetter || !isLongEnough) {
            throw new InvalidEntryException("Invalid password: " + password + "\n1. Password MUST be at least have 8 characters long, and should not contain space\n" +
                    "2. PassWord should at least contain one letter \n" +
                    "3. Password should at least contain one special characters\n" +
                    "4. Password should at least contain a digit");
        }
        this.password = password;
    }

    public Credentials(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    @Override
    public String toString() {
        return "Credentials{" +
                "username='" + getUsername() + '\'' +
                ", password='" + getPassword() + '\'' +
                '}';
    }
}
