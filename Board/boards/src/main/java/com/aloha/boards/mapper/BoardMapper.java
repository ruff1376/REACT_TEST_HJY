package com.aloha.boards.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.aloha.boards.domain.Boards;

@Mapper
public interface BoardMapper extends BaseMapper<Boards> {
    
}
