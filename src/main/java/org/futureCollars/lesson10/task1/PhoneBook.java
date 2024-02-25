package org.futureCollars.lesson10.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Optional;

public class PhoneBook {

    private final HashMap<String, Contact> contacts = new HashMap<>();

    public void createPhoneBook() {
        try (BufferedReader reader = new BufferedReader(new FileReader("src\\main\\resources\\phoneBook.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                String[] contactArray = line.split(",");
                Contact contact = new Contact();
                contact.setName(contactArray[0]);
                contact.setAddress(contactArray[1]);
                if (contactArray.length == 3) {
                    contact.setPhoneNumber(Optional.of(contactArray[2]));
                } else {
                    contact.setPhoneNumber(Optional.empty());
                }
                contacts.put(contactArray[0], contact);
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public Contact findContactByName(String name) throws Exception {
        if (contacts.containsKey(name)) {
            return contacts.get(name);
        } else {
            throw new Exception("nie istnieje");
        }
    }
}
