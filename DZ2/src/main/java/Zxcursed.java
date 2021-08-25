import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Zxcursed {
    public static void main(String[] args) throws IOException {
//        Worker worker = new Worker("семен", 19, "rthhfghfghfgdn@bdbk.ru", "test");
//        worker.info();
        Group group = new Group("ученики");
//        group.addWorker("Gleb", 41, "fdgfgbssntdfb", "test");
//        group.addWorker("lrgdr", 23, "sgsfgdfgd", "srgdrg");


        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

//        String name = bufferedReader.readLine(); //читаем строку с клавиатуры
//        String sAge = bufferedReader.readLine(); //читаем строку с клавиатуры
//        int nAge = Integer.parseInt(sAge); //преобразовываем строку в число.
        while (true) {
            System.out.println("Выберите действие");
            System.out.println("1 - Добавить в группу рабочего");
            System.out.println("2 - Удалить одного рабочих");
            System.out.println("3 - Удалить всех рабочих");
            System.out.println("4 - Вывести скисок рабочих в группе");

            String sNumberMenu = bufferedReader.readLine(); //читаем строку с клавиатуры
            int mumberMenu = Integer.parseInt(sNumberMenu); //преобразовываем строку в число.

            switch (mumberMenu) {
                case 1:
                    System.out.println("введите Имя Рабочего");
                    String workerName = bufferedReader.readLine(); //читаем строку с клавиатуры

                    System.out.println("введите Возраст Рабочего");
                    String age = bufferedReader.readLine(); //читаем строку с клавиатуры

                    System.out.println("введите Почту Рабочего");
                    String email = bufferedReader.readLine(); //читаем строку с клавиатуры

                    System.out.println("введите Профессию Рабочего");
                    String prof = bufferedReader.readLine(); //читаем строку с клавиатуры

                    if (workerName == null &&
                            age == null &&
                            email == null &&
                            prof == null) {
                        System.out.println("Одинг из параметров пустой");
                    }

                    group.addWorker(workerName, Integer.parseInt(age), email, prof);
                    break;
                case 2:
                    System.out.println("введите номер Рабочего");
                    String workerNumber = bufferedReader.readLine(); //читаем строку с клавиатуры
                    group.delWorker(Integer.parseInt(workerNumber));
                    break;
                case 3:
                    group.delAllWorkers();
                    break;
                case 4:
                    group.printGroup();
                    break;

            }
        }
    }
}