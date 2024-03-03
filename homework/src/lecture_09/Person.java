package lecture_09;

import java.time.LocalDate;

public class Person {
    private final String name;
    private final char gender;
    private final String religion;
    private final String language;
    private String job;
    private final String nationality;
    private final String egn;
    private final String dateOfBirth;
    protected final int age;
    private String countryOfResidence;


    public Person(String name, char gender, String religion, String language, String job,
                  String nationality, String egn, String countryOfResidence){
        this.name = name;
        verifyGender(gender);
        this.gender = gender;
        this.religion = religion;
        this.language = language;
        this.job = job;
        this.nationality = nationality;
        verifyEgn(egn);
        this.egn = egn;
        this.age = calculateAge(this.egn);
        this.dateOfBirth = calculateDateOfBirth(this.egn);
        this.countryOfResidence = countryOfResidence;
    }
    private void verifyEgn(String egn) {
        if ((egn.length() != 10) && (egn.matches("\\d+"))) {
            throw new RuntimeException("Invalid EGN !!!!!!!!!!!");
        }
        }
    private void verifyGender(char gender) {
        if ((gender != 'm') && (gender != 'f') && (gender != 'M') && (gender != 'F')) {
            throw new RuntimeException("Invalid GENDER !!!!!!!!!!!");
        }
    }

    protected int calculateAge(String egn) {
        String birthYearString;
        int currentYear = LocalDate.now().getYear();

        String yearDigits = egn.substring(0, 2);
        String monthDigits = egn.substring(2, 4);

        int monthDigitsInt = Integer.parseInt(monthDigits);

        if (monthDigitsInt > 40) {
            birthYearString = "20" + yearDigits;
        } else {
            birthYearString = "19" + yearDigits;
        }
        int birthYear = Integer.parseInt(birthYearString);

        return currentYear - birthYear;
    }

    private String calculateDateOfBirth(String egn) {
        String monthDigits = egn.substring(2, 4);
        String dayDigits = egn.substring(4, 6);

        int monthDigitsInt = Integer.parseInt(monthDigits);
        int monthNumber = monthDigitsInt;

        if (monthDigitsInt > 40) {
            monthNumber -= 40;
        }
        // dd-mm
        return dayDigits + "-" + monthNumber;
    }

    public void sayHello() {
        System.out.println("Hello BASE CLASS");
    };

    public void celebrateEaster() {
        if (this.religion.equals("Islam")) {
            System.out.println("I don't celebrate Easter!");
        } else {
            System.out.println("I celebrate Easter!");
        }
    }
    public Boolean isAdult() {
        return true;
    };

    public Boolean canTakeLoan() {
        return (this.job != null && isAdult());
    }

}
