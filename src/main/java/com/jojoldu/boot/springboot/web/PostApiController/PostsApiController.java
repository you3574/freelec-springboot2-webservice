package com.jojoldu.boot.springboot.web.PostApiController;

import com.jojoldu.boot.springboot.service.PostsService.PostsService;
import com.jojoldu.boot.springboot.web.dto.PostsResponseDto.PostsResponseDto;
import com.jojoldu.boot.springboot.web.dto.PostsSaveRequestDto.PostsSaveRequestDto;
import com.jojoldu.boot.springboot.web.dto.PostsUpdateRequestDto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requstDto){

        return postsService.save(requstDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto){
        return postsService.update(id,requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id){
        return postsService.findById(id);
    }

}
