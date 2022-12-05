import java.util.Arrays;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {

        System.out.println(ANSI_RED+"1.1 First Task"+ANSI_RESET);

        String initialData = "     Ivanov    Ivan       Ivanovich           ";
        String firstName=null, middleName=null, lastName=null, fullName=null;

        if(initialData.isBlank())
            throw new RuntimeException("ФИО пусто");
        initialData=initialData.trim();
        initialData=initialData.replaceAll("\\s+"," ");


        String [] splitData = initialData.split(" ");
        if (splitData.length<3) {
            throw new RuntimeException("Введено неполное ФИО");
        } else if (splitData.length>3)
            throw new RuntimeException("Введено слишком много данных или они некорректны");

        firstName=splitData[0];
        middleName=splitData[1];
        lastName=splitData[2];
        fullName = firstName + " " + middleName + " " + lastName;

        System.out.println("ФИО сотрудника - " + fullName);

        System.out.println(ANSI_RED+"1.2 Second Task"+ANSI_RESET);

        System.out.println(ANSI_RED+"1.3 Third Task"+ANSI_RESET);

    }//main
}//Main