package com.yusuf.repository;

import com.yusuf.entity.Interest;
import com.yusuf.entity.User;
import com.yusuf.utility.HibernateUtility;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class UserRepository extends MyFactoryRepository<User,Long> {
    private EntityManager entityManager;

    public UserRepository() { // Constructor based Dependency Injection
        super(new User());
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
    }

    //Native Query
    public List<Interest> findUsersInterests(User user){
        String sql = "SELECT i.*\n" +
                "FROM tbl_interest i\n" +
                "JOIN tbl_user u ON i.userid = u.id\n" +
                "WHERE u.id = :userId";
        TypedQuery<Interest> interestTypedQuery = (TypedQuery<Interest>) entityManager.createNativeQuery(sql, Interest.class);
        interestTypedQuery.setParameter("userId",user.getId());
        return interestTypedQuery.getResultList();
    }
}


//