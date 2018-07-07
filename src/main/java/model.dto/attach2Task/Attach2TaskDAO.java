package com.antares.demo.model.dto.attach2Task;

import com.antares.demo.model.Attach2Task;

import java.util.List;

public interface Attach2TaskDAO {

    public void addAttach2Task(Attach2Task attach2Task);

    public List<Attach2Task> listAttach2Task();

    public void removeAttach2Task(Integer id);
}
