package AddressBook;

import static java.lang.System.out;

import java.util.Scanner;

public class AddressBook {
    private Contact[] contacts = new Contact[100];
    private int size;

    //Метод который добавляет контакт
    public void addContact() {
        Scanner scanner1 = new Scanner(System.in);
        out.println("Введите имя: ");
        String name = scanner1.nextLine();
        out.println("Введите должность: ");
        String post = scanner1.nextLine();
        out.println("Введите дату рождения: ");
        String age = scanner1.next();
        out.println("Введите номер телефона: ");
        String phone = scanner1.next();
        out.println("Введите email: ");
        String email = scanner1.next();
        Contact newContact = new Contact();
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                contacts[i] = newContact;
                size++;
                out.println("Новый контакт добавлен");
                return;
            } else if (contacts[i].getID() == newContact.getID()) {
                contacts[i] = newContact;
                out.println("Контакт обновлен");
                return;
            }
        }
        out.println("Адресная книжка заполнена, не удалось добавить контакт");
    }

    public void removeContact(int ID) {
        out.println("Введите ID контакта для удаления: ");
        Scanner scanner2 = new Scanner(System.in);
        int id = scanner2.nextInt();
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null) {
                contacts[i] = null;
                out.println("Контакт удален");
                return;
            }
        }
        out.println("Контакт не найден");
    }

    public Contact[] getAllContacts() {
        out.println("Контакты в Адресной книжке: " + size);
        return contacts;
    }

    public void showContacts() {
        for (Contact contact : contacts) {
            if (contact != null) {
                out.println(contact);
            }
        }
    }

}
