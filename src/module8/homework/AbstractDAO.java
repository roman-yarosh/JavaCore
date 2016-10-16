package module8.homework;

import java.util.List;

public interface AbstractDAO<T extends HasGetId> {

    T save(T t);
    void delete(T t);
    void deleteAll(List<T> t);
    void saveAll(List<T> t);
    List<T> getList();

    void deleteById(long id);
    T get(long id);
}
