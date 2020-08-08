package com.microserv.learnmicro.dao;

import com.microserv.learnmicro.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account,Integer> {
    //@Query(value="SELECT *  FROM employee", nativeQuery = true)


}
