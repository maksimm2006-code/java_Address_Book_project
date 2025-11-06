package AddressBook;

import static java.lang.System.out;

import java.util.Scanner;

public class MenuNavigator {
    AddressBook addressBook = new AddressBook();
    Scanner scanner = new Scanner(System.in);

    public void startMenu() {
        out.println("Адресная книга\n" +
                "1 – новый контакт\n" +
                "2 – удаление существующего контакта\n" +
                "3 – вывод всех контактов\n" +
                "4 – завершение работы\n" +
                "Введите нужную опцию и нажмите Enter [1..4]: 3");
        int stmen = scanner.nextInt();
        if(stmen == 1){
            addressBook.addContact();
        }
        if(stmen == 2) {
            addressBook.removeContact(1);
        }
        if(stmen == 3) {
            addressBook.getAllContacts();
        }
        if(stmen == 4) {
            out.println("Программа завершена, ждем вас снова ;) ");
        }
    }

}
