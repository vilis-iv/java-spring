package com.estore.repository;

import com.estore.model.BillerData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainRepository extends JpaRepository<BillerData, String> {
    BillerData findByBillerDomain(String domain);

}
