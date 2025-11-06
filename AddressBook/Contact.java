package AddressBook;

import lombok.*;

import java.util.Objects;

@Getter
@Setter

/*Класс хранящий все данные контанкта ( Имя, должность, возраст,
номер телефона, почту).*/

public class Contact {
    private String name;
    private String post;
    private String age;
    private String phone;
    private String mail;
    private static int contactCounter;
    private int ID;


    @Override
    public boolean equals(Object o) {
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) && Objects.equals(post, contact.post) &&
                Objects.equals(age, contact.age) && Objects.equals(phone, contact.phone) &&
                Objects.equals(mail, contact.mail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, post, age, phone, mail);
    }

    @Override
    public String toString() {
        return "Contact {" +
                "Name- " + name + "\'" +
                " Post- " + post + "\'" +
                " Age- " + age + "\'" +
                " Phone- " + phone + "\'" +
                " Mail- " + mail + "\'" +
                "}";
    }


}
