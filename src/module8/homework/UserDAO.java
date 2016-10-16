package module8.homework;

import java.util.List;

public class UserDAO extends AbstractDAOImpl<User> {

    @Override
    public User save(User user) {
        return super.save(user);
    }

    @Override
    public void delete(User user) {
        super.delete(user);
    }

    @Override
    public void deleteAll(List<User> t) {
        super.deleteAll(t);
    }

    @Override
    public void saveAll(List<User> t) {
        super.saveAll(t);
    }

    @Override
    public List<User> getList() {
        return super.getList();
    }

    @Override
    public void deleteById(long id) {
        super.deleteById(id);
    }

    @Override
    public User get(long id) {
        return super.get(id);
    }
}
