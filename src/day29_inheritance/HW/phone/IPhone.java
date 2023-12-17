package day29_inheritance.HW.phone;

public class IPhone extends Phone{
    public void faceTime(long phoneNumber) {
        System.out.println(getBrand() + " is calling via FaceTime to "+phoneNumber);
    }
    public void faceTime(String email) {
        System.out.println(getBrand() + " is texting via FaceTime to " + email);
    }
}
