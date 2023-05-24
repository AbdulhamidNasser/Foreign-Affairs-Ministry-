package com.codline.ForeignAffairsMinistryAPI.Service;

import com.codline.ForeignAffairsMinistryAPI.Models.Policy;
import com.codline.ForeignAffairsMinistryAPI.Repository.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Policy addPolicy(Policy policy) {
        return policyRepository.save(policy);
    }

    public void updatePolicy(Integer id, Policy updatedPolicy) {
        Optional<Policy> optionalPolicy = policyRepository.findById(id);
        if (optionalPolicy.isPresent()) {
            Policy policy = optionalPolicy.get();
            policy.setCountry(updatedPolicy.getCountry());
            policy.setRegion(updatedPolicy.getRegion());
            policy.setTitle(updatedPolicy.getTitle());
            policy.setDescription(updatedPolicy.getDescription());
            policyRepository.save(policy);
        }
    }












}



