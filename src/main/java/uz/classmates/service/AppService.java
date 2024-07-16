package uz.classmates.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.classmates.dto.AppDTO;
import uz.classmates.entity.AppEntity;
import uz.classmates.repository.AppRepository;

@Service
public class AppService {

    @Autowired
    private AppRepository repository;

    public void create (AppDTO dto) {

        AppEntity entity = new AppEntity();
        entity.setName(dto.getName());
        entity.setSurname(dto.getSurname());
        entity.setPhoneNumber(dto.getPhoneNumber());
        repository.save(entity);
    }

}