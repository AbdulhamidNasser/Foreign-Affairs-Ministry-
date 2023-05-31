package com.codline.ForeignAffairsMinistryAPI.Controller;

import com.codline.ForeignAffairsMinistryAPI.Models.News;
import com.codline.ForeignAffairsMinistryAPI.Models.updateNews;
import com.codline.ForeignAffairsMinistryAPI.Repository.NewsRepository;
import com.codline.ForeignAffairsMinistryAPI.RequestObject.RequestNews;
import com.codline.ForeignAffairsMinistryAPI.Service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/news")
public class NewsController {

    @Autowired
    NewsService newsService;

    public ResponseEntity<Void> saveAccount (@RequestBody RequestNews requestNews) {
        createNews(requestNews);
        return ResponseEntity.ok().build();

    }

    public void createNews(RequestNews requestNews){
        News news = new News();
        news.setTitle(requestNews.getTitle());
        news.setCountry(requestNews.getCountry());
        news.setRegion(requestNews.getRegion());
        news.setDescription(requestNews.getDescription());
        news.setIsActive(true);
        news.setCreatedDate(new Date());
        newsService.addPolicy(news);
    }

    @PutMapping("/api/news/{newsId}")
    public ResponseEntity<String> updateNews(@PathVariable Integer newsId, @RequestBody updateNews update) {
        try {
            String country = update.getCountry() ;
            String region =update.getRegion();
            String title=update.getTitle();
            String description=update.getDescription();
            newsService.updateNews(newsId,title,country,region,description);
            return ResponseEntity.ok("updated successfully");
        } catch (NewsNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/api/news")
    public ResponseEntity<List<News>> getNewsByCountry(@RequestParam("region") String region) {
        List<News> newsList = newsService.getNewsByRegion(region);
        return new ResponseEntity<>(newsList, HttpStatus.OK);
    }











}
