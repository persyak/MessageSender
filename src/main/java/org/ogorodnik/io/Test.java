package org.ogorodnik.io;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try(
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("testOutput"));
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("testOutput"))) {

            SerializationMessageDao serializationMessageDao =
                    new SerializationMessageDao(objectOutputStream);

            Message messageOut = new Message();
            System.out.println(messageOut);
            serializationMessageDao.save(messageOut);

            Message messageIn = (Message) serializationMessageDao.load(objectInputStream);
            System.out.println(messageIn);
        }
    }
}


