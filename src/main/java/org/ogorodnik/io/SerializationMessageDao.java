package org.ogorodnik.io;

import java.io.*;

class SerializationMessageDao implements MessageDao {
    private ObjectOutputStream objectOutputStream;


    public SerializationMessageDao(OutputStream outputStream)
            throws IOException {
        this.objectOutputStream = new ObjectOutputStream(outputStream);
    }

    @Override
    public void save(Message message) throws IOException {
        objectOutputStream.writeObject(message);
    }

    @Override
    public Message load(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        Message message = new Message();
        while(objectInputStream.available() > 0){
            message = (Message) objectInputStream.readObject();
        }
        return message;
    }
}
