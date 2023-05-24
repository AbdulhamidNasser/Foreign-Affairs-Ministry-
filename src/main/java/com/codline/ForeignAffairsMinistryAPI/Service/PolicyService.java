package com.codline.ForeignAffairsMinistryAPI.Service;

import com.codline.ForeignAffairsMinistryAPI.Repository.PolicyRepository;
import org.springframework.stereotype.Service;

@Service
public class PolicyService {

    final PolicyRepository policyRepository;


    public PolicyService(PolicyRepository policyRepository) {
        this.policyRepository = policyRepository;
    }
}



