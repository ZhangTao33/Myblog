package com.example.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.entity.Blog;
import com.example.mapper.BlogMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BlogService extends ServiceImpl<BlogMapper, Blog> {

    @Resource
    private BlogMapper blogMapper;

}
