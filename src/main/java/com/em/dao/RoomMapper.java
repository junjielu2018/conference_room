package com.em.dao;

import com.em.domain.PagingVO;
import com.em.domain.Room;

import java.util.List;

/**
 * Created by lujunjie on 2018/6/26.
 */
public interface RoomMapper {
    public Integer roomCount();

    public List<Room> findByPaging() throws Exception;

    public void add(Room room) throws Exception;

    public void updateById(Room room) throws Exception;

    public Room findById(Integer id) throws Exception;

    public void removeById(Integer id) throws Exception;

    public List<Room> findByName(String name) throws Exception;

    public List<Room> nameList() throws Exception;
}
