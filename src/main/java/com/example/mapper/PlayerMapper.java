package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.domain.Player;


@Mapper
public interface PlayerMapper {
    @Select("select * from player")
    List<Player> findAll();

    @Select("select * from player where id = #{id}")
    Player findOne(Long id);

    @Insert("insert into player (name, team, position) values (#{name}, #{team}, #{position})")
    @Options(useGeneratedKeys = true)
    void save(Player player);

    @Update("update player set name = #{name}, team = #{team}, position = #{position} where id = #{id}")
    void update(Player player);

    @Delete("delete from player where id = #{id}")
    void delete(Long id);
}
