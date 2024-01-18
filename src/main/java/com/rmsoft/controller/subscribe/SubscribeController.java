package com.rmsoft.controller.subscribe;

import com.rmsoft.service.SubscribeService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Log4j2
@Controller
public class SubscribeController {
    @Autowired
    private SubscribeService subscribeService;

    // 글목록 조회
    @GetMapping("/subscribe/list")
    public String list(){
        log.info("서비스 현황 나와라!!!!!!!!1");
        return "/subscribe/list";
    }
    @GetMapping("/subscribe/write")
    public String write(){
        return "/subscribe/write";
    }
    /*
    @PostMapping("/article/write")
    public String register(HttpServletRequest request, ArticleDTO dto){

        dto.setRegip(request.getRemoteAddr());

        log.info(dto);

        articleService.save(dto);
        return "redirect:/article/list?cate="+dto.getCate();
    }*/


}
