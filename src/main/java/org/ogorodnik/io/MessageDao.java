package org.ogorodnik.io;

import java.io.IOException;
import java.io.ObjectInputStream;

public interface MessageDao {
    void save(Message message) throws IOException;
    Message load(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException;
}
