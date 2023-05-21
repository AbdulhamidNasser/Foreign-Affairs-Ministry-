package com.codline.ForeignAffairsMinistryAPI.Controller;

import com.codline.ForeignAffairsMinistryAPI.Repository.PolicyRepository;

public class PolicyController {

    private PolicyRepository policyRepository;


    public Policy createPolicy(@RequestBody Policy policy) {
        return policyRepository.save(policy);
    }
}
