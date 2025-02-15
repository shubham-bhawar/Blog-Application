package com.codewithshubham.blog.payloads;


import lombok.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;



@NoArgsConstructor
@AllArgsConstructor
@Data
public class PostDto {

    private Integer postId;

    private String title;

    private String content;



    private Date addedDate;

    private CategoryDto category;

    private UserDto user;

    private Set<CommentDto> comments=new HashSet<>();

    private String imageName;

}
