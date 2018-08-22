package com.yuanhong.bootredis.controller;

import com.yuanhong.bootredis.model.Article;
import com.yuanhong.bootredis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    RedisService redisService;

    @RequestMapping("/getArticleById")
    public Object getArticleById(Integer id){
        return redisService.getObj(id);
    }

    @RequestMapping("/add")
    public Object setArticle(Integer key){
        Article article = new Article();
        article.setId(1);
        article.setContents("spring boot redis");
        article.setTitle("spring boot redis");
        redisService.setObj(key,article);

        return true;
    }


}
