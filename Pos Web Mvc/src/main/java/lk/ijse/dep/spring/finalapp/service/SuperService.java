package lk.ijse.dep.spring.finalapp.service;

import java.util.List;

public interface SuperService<T,ID> {
     List<T> getAll() ;

     String save(T dto);

     boolean remove(ID dtoId);

     boolean update(T dtoId);

     T get(ID dtoId);
}
