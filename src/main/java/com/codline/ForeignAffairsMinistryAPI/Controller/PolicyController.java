package com.codline.ForeignAffairsMinistryAPI.Controller;

import com.codline.ForeignAffairsMinistryAPI.Repository.PolicyRepository;
import com.codline.ForeignAffairsMinistryAPI.Service.Policy;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public class PolicyController {

    private PolicyRepository policyRepository;


    public Policy createPolicy(@RequestBody Policy policy) {
        return policyRepository.save(policy);
    }


    public Policy updatePolicy(@PathVariable Long id, @RequestBody Policy policy) {
        policy.setId(id);
        return policyRepository.save(policy);
    }



    public void deletePolicy(@PathVariable Long id) {
        policyRepository.deleteById(id);
    }


    public Iterable<Policy> getAllPolicies() {
        return policyRepository.findAll();
    }



    public Iterable<Policy> getPoliciesByCountry(@PathVariable String country) {
        return policyRepository.findByCountry(country);
    }


    public Iterable<Policy> getPoliciesByRegion(@PathVariable String region) {
        return policyRepository.findByRegion(region);
    }














}
