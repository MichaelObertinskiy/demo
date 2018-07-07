package com.antares.demo.model.dto.message;

import com.antares.demo.model.Message;

import java.util.List;

public interface MessageDAO {

    public void addMessage (Message message);

    public List<Message> listMessage();

    public void removeMessage(Integer id);
}
