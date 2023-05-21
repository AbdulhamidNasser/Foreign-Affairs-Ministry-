package com.codline.ForeignAffairsMinistryAPI.Repository;

import com.codline.ForeignAffairsMinistryAPI.Service.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Long> {
}
