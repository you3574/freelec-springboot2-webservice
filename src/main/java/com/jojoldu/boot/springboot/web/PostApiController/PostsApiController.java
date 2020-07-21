package com.jojoldu.boot.springboot.web.PostApiController;

import com.jojoldu.boot.springboot.service.PostsService.PostsService;
import com.jojoldu.boot.springboot.web.dto.PostsSaveRequestDto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requstDto){

        return postsService.save(requstDto);
    }

}
