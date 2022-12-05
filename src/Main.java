import java.util.Arrays;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {

        System.out.println(ANSI_RED + "1.1 First Task" + ANSI_RESET);

        String initialData = "     Ivanov    Ivan       Ivanovich           ";
        String firstName = null, middleName = null, lastName = null, fullName = null;

        if (initialData.isBlank())
            throw new RuntimeException("ФИО пусто");
        initialData = initialData.trim();
        initialData = initialData.replaceAll("\\s+", " ");


        String[] splitData = initialData.split(" ");
        if (splitData.length < 3) {
            throw new RuntimeException("Введено неполное ФИО");
        } else if (splitData.length > 3)
            throw new RuntimeException("Введено слишком много данных или они некорректны");

        firstName = splitData[0];
        middleName = splitData[1];
        lastName = splitData[2];
        fullName = firstName + " " + middleName + " " + lastName;

        System.out.println("ФИО сотрудника - " + fullName);

        System.out.println(ANSI_RED + "1.2 Second Task" + ANSI_RESET);

        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполениея отчета - " + fullName);

        System.out.println(ANSI_RED + "1.3 Third Task" + ANSI_RESET);
        fullName = "Иванов Семён Семенович";
        fullName = fullName.replace('ё', 'e').replace('Ё', 'Е');
        System.out.println("Данные ФИО сотрудника - " + fullName);

        System.out.println(ANSI_RED + "1.5 Fifth Task" + ANSI_RESET);
        fullName = " Ivanov    Ivan  Ivanovich   ";
        fullName = fullName.trim().replaceAll("\\s+", " ");
        if (fullName.split(" ").length != 3) {
            throw new RuntimeException("Неверный ввод ФИО");
        }
        int firstWhiteSpace = fullName.indexOf(' ');
        if (firstWhiteSpace == -1) {
            throw new RuntimeException("ошибкв в ФИО");
        }
        firstName = fullName.substring(0, firstWhiteSpace);
        int lastWhiteSpace = fullName.lastIndexOf(' ');
        if (lastWhiteSpace == -1) {
            throw new RuntimeException("ошибкв в ФИО");
        }
        middleName = fullName.substring(firstWhiteSpace + 1, lastWhiteSpace);
        lastName = fullName.substring(lastWhiteSpace + 1, fullName.length() - 1);

        System.out.println("Имя сотрудника - " + firstName);
        System.out.println("Фамилия сотрудника - " + middleName);
        System.out.println("Отчество сотрудника - " + lastName);

        System.out.println(ANSI_RED + "1.6 Sixth Task" + ANSI_RESET);
        fullName = "  ivanov   ivan    ivanovich ".trim().replaceAll("\\s+", " ");
        String[] names = fullName.split(" ");
        if (names.length != 3) {
            throw new RuntimeException("Неверный ФИО");
        }
        firstName = names[0].substring(0, 1).toUpperCase() + names[0].substring(1, names[0].length() - 1);
        middleName = names[1].substring(0, 1).toUpperCase() + names[1].substring(1, names[1].length() - 1);
        lastName = names[2].substring(0, 1).toUpperCase() + names[2].substring(1, names[2].length() - 1);

        fullName = firstName + " " + middleName + " " + lastName;
        System.out.println(fullName);

        System.out.println(ANSI_RED + "1.7 Seventh Task" + ANSI_RESET);

        String stringOne = "1357";
        String stringTwo = "246";
        StringBuilder resultString = new StringBuilder(stringOne);
        if (stringTwo==null || stringOne==null)
            System.out.println("Одна из сторок не инициализирована");
        else if (stringOne.length() <= 1)
            resultString.append(stringTwo);
        else {
            for (int i = 1,j=0; j < stringTwo.length(); j++,i=i+2) {
                if(i>=resultString.length()) {
                    resultString.append(stringTwo.substring(j));
                    break;
                }
                resultString.insert(i,stringTwo.charAt(j));
                System.out.println(resultString);
            }
        }
        System.out.println("Результирующая строка: "+resultString);

        System.out.println(ANSI_RED + "1.8 Eighth Task" + ANSI_RESET);
    }//main$$
}//Main