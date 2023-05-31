package com.codline.ForeignAffairsMinistryAPI.Service;

import com.codline.ForeignAffairsMinistryAPI.Models.News;
import com.codline.ForeignAffairsMinistryAPI.Repository.NewsRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsService {
    @Autowired
    NewsRepository newsRepository;

    public void addPolicy(News news) {
        newsRepository.save(news);
    }

    public void updateNews(Long newsId, String title , String country ,String region ,String details) {
        Optional<News> optionalNews = newsRepository.findById(newsId);
    }
    }

}
