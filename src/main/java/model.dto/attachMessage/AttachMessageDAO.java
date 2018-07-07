package com.antares.demo.model.dto.attachMessage;

import com.antares.demo.model.AttachMessage;

import java.util.List;

public interface AttachMessageDAO {

    public void addAttachMessage (AttachMessage attachMessage);

    public List<AttachMessage> listAttachMessage();

    public void removeAttachMessage(Integer id);
}
