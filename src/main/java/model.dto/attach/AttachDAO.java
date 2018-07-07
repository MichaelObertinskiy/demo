package com.antares.demo.model.dto.attach;

import com.antares.demo.model.Attach;

import java.util.List;

public interface AttachDAO {

    public  void addAttach(Attach attach);

    public List<Attach> listAttach();

    public void removeAttach(Integer id);

}
