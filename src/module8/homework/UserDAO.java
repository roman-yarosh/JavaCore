package module8.homework;

import java.util.List;

public class UserDAO extends AbstractDAOImpl<User> {
    
    @Override
    User save(User user) {
        return super.save(user);    
    }

    @Override
    void delete(User user) {
        super.delete(user);    
    }

    @Override
    void deleteAll(List<User> t) {
        super.deleteAll(t);    
    }

    @Override
    void saveAll(List<User> t) {
        super.saveAll(t);    
    }

    @Override
    List<User> getList() {
        return super.getList();    
    }
}
