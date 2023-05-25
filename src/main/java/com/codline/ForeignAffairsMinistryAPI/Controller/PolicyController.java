package com.codline.ForeignAffairsMinistryAPI.Controller;

import com.codline.ForeignAffairsMinistryAPI.Models.Policy;
import com.codline.ForeignAffairsMinistryAPI.Repository.PolicyRepository;
import com.codline.ForeignAffairsMinistryAPI.RequestObject.RequestPolicy;
import com.codline.ForeignAffairsMinistryAPI.Service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/api/policies")
public class PolicyController {

    final PolicyService policyService;

    public ResponseEntity<Void> saveAccount(@RequestBody RequestPolicy requestPolicy) {
        createPolicy(requestPolicy);
        return ResponseEntity.ok().build();

    }

    public void createPolicy(RequestPolicy requestPolicy) {
        Policy policy = new Policy();
        policy.setCountry(requestPolicy.getCountry());
        policy.setRegion(requestPolicy.getRegion());
        policy.setTopic(requestPolicy.getTopic());
        policy.setDetails(requestPolicy.getDetails());
        policy.setIsActive(true);
        policy.setCreatedDate(new Date());
        policyService.addPolicy(policy);
    }

    ///hhhhh

    @Autowired
    public PolicyController(PolicyService policyService) {
        this.policyService = policyService;
    }

    @GetMapping
    public ResponseEntity<List<Policy>> getAllPolicies() {
        List<Policy> policies = policyService.getAllPolicies();
        return new ResponseEntity<>(policies, HttpStatus.OK);
    }





    @PostMapping
    public PolicyService createPolicy(@RequestBody PolicyService policy) {
        return policyRepository.save(policy);
    }


    @PutMapping("/{id}")
    public PolicyService updatePolicy(@PathVariable Integer id, @RequestBody PolicyService policy) {
        policy.setId(id);
        return policyRepository.save(policy);
    }



    @DeleteMapping("/{id}")
    public void deletePolicy(@PathVariable Integer id) {
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
