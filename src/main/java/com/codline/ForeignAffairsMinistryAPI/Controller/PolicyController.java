package com.codline.ForeignAffairsMinistryAPI.Controller;

import com.codline.ForeignAffairsMinistryAPI.Repository.PolicyRepository;
import com.codline.ForeignAffairsMinistryAPI.Service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/policies")
public class PolicyController {

    @Autowired
    policyRepository policyRepository;


    @PostMapping
    public PolicyService createPolicy(@RequestBody PolicyService policy) {
        return policyRepository.save(policy);
    }


    @PutMapping("/{id}")
    public PolicyService updatePolicy(@PathVariable Long id, @RequestBody PolicyService policy) {
        policy.setId(id);
        return policyRepository.save(policy);
    }



    @DeleteMapping("/{id}")
    public void deletePolicy(@PathVariable Long id) {
        policyRepository.deleteById(id);
    }


    @GetMapping
    public Iterable<PolicyService> getAllPolicies() {
        return policyRepository.findAll();
    }



    @GetMapping("/{country}")
    public Iterable<PolicyService> getPoliciesByCountry(@PathVariable String country) {
        return policyRepository.findByCountry(country);
    }


    @GetMapping("/{region}")
    public Iterable<PolicyService> getPoliciesByRegion(@PathVariable String region) {
        return policyRepository.findByRegion(region);
    }



    @GetMapping("/{topic}")
    public Iterable<PolicyService> getPoliciesByTopic(@PathVariable String topic) {
        return policyRepository.findByTopic(topic);
    }



}
