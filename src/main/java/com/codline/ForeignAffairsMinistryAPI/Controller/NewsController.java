package com.codline.ForeignAffairsMinistryAPI.Controller;

import com.codline.ForeignAffairsMinistryAPI.Repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsRepository newsRepository;












}
