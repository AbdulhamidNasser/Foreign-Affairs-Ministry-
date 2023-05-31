package com.codline.ForeignAffairsMinistryAPI.Service;

import com.codline.ForeignAffairsMinistryAPI.Models.News;
import com.codline.ForeignAffairsMinistryAPI.Repository.NewsRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NewsService {
    @Autowired
    NewsRepository newsRepository;

    public void addPolicy(News news) {
        newsRepository.save(news);
    }

    public void updateNews(Integer newsId, String title , String country ,String region ,String description) {
        Optional<News> optionalNews = newsRepository.findById(newsId);
        if (((Optional<?>) optionalNews).isPresent()) {
            News news = optionalNews.get();
            news.setTitle(title);
            news.setCountry(country);
            news.setRegion(region);
            news.setDescription(description);
            newsRepository.save(news);
        } else {
            System.out.print("NOT FOUND");
        }
    }
    public List<News> getNewsByRegion(String region) {
        return newsRepository.findByRegion(region);
    }


    }

}
