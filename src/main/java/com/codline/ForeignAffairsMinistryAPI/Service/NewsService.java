package com.codline.ForeignAffairsMinistryAPI.Service;

import com.codline.ForeignAffairsMinistryAPI.Repository.NewsRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsService {
    @Autowired
    NewsRepository newsRepository;

}
