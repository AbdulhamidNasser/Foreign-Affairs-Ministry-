package com.codline.ForeignAffairsMinistryAPI.Repository;

import com.codline.ForeignAffairsMinistryAPI.Models.Policy;
import com.codline.ForeignAffairsMinistryAPI.Service.PolicyService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Integer> {


    //Iterable<PolicyService> findByCountry(String country);

    //Iterable<PolicyService> findByRegion(String region);

   // Iterable<PolicyService> findByTopic(String topic);
}
