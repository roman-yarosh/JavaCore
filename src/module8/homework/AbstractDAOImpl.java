package module8.homework;

import java.util.ArrayList;
import java.util.List;

public class AbstractDAOImpl<T> extends AbstractDAO<T> {

    private List<T> list = new ArrayList<T>();

    @Override
    T save(T t) {
        list.add(t);
        return t;
    }

    @Override
    void delete(T t) {
        list.remove(t);
    }

    @Override
    void deleteAll(List<T> t) {
        list.removeAll(t);
    }

    @Override
    void saveAll(List<T> t) {
        list.addAll(t);
    }

    @Override
    List<T> getList() {
        return list;
    }
}
