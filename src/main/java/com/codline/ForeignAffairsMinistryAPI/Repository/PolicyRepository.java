package com.codline.ForeignAffairsMinistryAPI.Repository;

import com.codline.ForeignAffairsMinistryAPI.Service.PolicyService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyRepository extends JpaRepository<PolicyService, Long> {


    Iterable<PolicyService> findByCountry(String country);

    Iterable<PolicyService> findByRegion(String region);

    Iterable<PolicyService> findByTopic(String topic);
}
