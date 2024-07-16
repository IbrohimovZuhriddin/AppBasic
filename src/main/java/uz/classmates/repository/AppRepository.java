package uz.classmates.repository;

import org.springframework.data.repository.CrudRepository;
import uz.classmates.entity.AppEntity;


public interface AppRepository extends CrudRepository<AppEntity,Integer> {


}