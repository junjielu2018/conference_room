package com.em.service.impl;

import com.em.dao.RoomMapper;
import com.em.domain.PagingVO;
import com.em.domain.Room;
import com.em.service.RoomService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lujunjie on 2018/6/26.
 */
@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    private RoomMapper roomMapper;

    public Integer roomCount() {
        return roomMapper.roomCount();
    }

    public PageInfo<Room> findByPaging(Integer toPageNo) throws Exception {
        PagingVO pagingVO = new PagingVO();
        PageHelper.startPage(toPageNo, pagingVO.getPageSize());
        List<Room> list = roomMapper.findByPaging();
        PageInfo<Room> pageInfo = new PageInfo<Room>(list);
        return pageInfo;
    }

    public void add(Room room) throws Exception {
        roomMapper.add(room);
    }

    public Room findById(Integer id) throws Exception {
        return roomMapper.findById(id);
    }

    public void updateById(Room room) throws Exception {
        roomMapper.updateById(room);
    }

    public void removeById(Integer id) throws Exception {
        roomMapper.removeById(id);
    }

    public List<Room> findByName(String name) throws Exception {
        return roomMapper.findByName(name);
    }

    public List<Room> nameList() throws Exception {
        return roomMapper.nameList();
    }

}
