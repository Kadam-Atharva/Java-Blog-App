package com.atharva.blog.mappers;

import com.atharva.blog.domain.CreatePostRequest;
import com.atharva.blog.domain.UpdatePostRequest;
import com.atharva.blog.domain.dtos.CreatePostRequestDto;
import com.atharva.blog.domain.dtos.PostDto;
import com.atharva.blog.domain.dtos.UpdatePostRequestDto;
import com.atharva.blog.domain.entities.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PostMapper {

    @Mapping(target = "author", source = "author")
    @Mapping(target = "category", source = "category")
    @Mapping(target = "tags", source = "tags")
    @Mapping(target = "status", source = "status")
    PostDto toDto(Post post);

    CreatePostRequest toCreatePostRequest(CreatePostRequestDto dto);

    UpdatePostRequest toUpdatePostRequest(UpdatePostRequestDto dto);
}
