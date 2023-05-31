package com.codline.ForeignAffairsMinistryAPI.Controller;

import com.codline.ForeignAffairsMinistryAPI.Models.Policy;
import com.codline.ForeignAffairsMinistryAPI.RequestObject.RequestPolicy;
import com.codline.ForeignAffairsMinistryAPI.Service.PolicyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/policies")
public class PolicyController {

    final PolicyService policyService;

    public PolicyController(PolicyService policyService) {
        this.policyService = policyService;
    }

    public ResponseEntity<Void> saveAccount(@RequestBody RequestPolicy requestPolicy) {
        createPolicy(requestPolicy);
        return ResponseEntity.ok().build();

    }

    public void createPolicy(RequestPolicy requestPolicy) {
        Policy policy = new Policy();
        policy.setCountry(requestPolicy.getCountry());
        policy.setRegion(requestPolicy.getRegion());
        policy.setTopic(requestPolicy.getTopic());
        policy.setDescription(requestPolicy.getdescription());
        policy.setIsActive(true);
        policy.setCreatedDate(new Date());
        policyService.addPolicy(policy);
    }

    @GetMapping("/api/policies")
    public ResponseEntity<List<Policy>> getNewsByCountry(@RequestParam("country") String country) {
        List<Policy> policyList = policyService.getPolicyByCountry(country);
        return new ResponseEntity<>(policyList, HttpStatus.OK);
    }





}
