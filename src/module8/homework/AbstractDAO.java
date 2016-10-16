package module8.homework;

import java.util.List;

public abstract class AbstractDAO<T> {

    abstract T save(T t);
    abstract void delete(T t);
    abstract void deleteAll(List<T> t);
    abstract void saveAll(List<T> t);
    abstract List<T> getList();

}
