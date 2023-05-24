package com.codline.ForeignAffairsMinistryAPI.Service;

import com.codline.ForeignAffairsMinistryAPI.Models.Policy;
import com.codline.ForeignAffairsMinistryAPI.Repository.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyService {

    final PolicyRepository policyRepository;

    @Autowired
    public PolicyService(PolicyRepository policyRepository) {
        this.policyRepository = policyRepository;
    }

    public List<Policy> getAllPolicies() {
        return policyRepository.findAll();
    }

    public Optional<Policy> getPolicyById(Integer id) {
        return policyRepository.findById(id);
    }












}



