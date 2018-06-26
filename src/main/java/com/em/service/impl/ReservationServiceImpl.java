package com.em.service.impl;

import com.em.dao.ReservationMapper;
import com.em.domain.PagingVO;
import com.em.domain.Reservation;
import com.em.domain.ReservationCustom;
import com.em.domain.ReservationVo;
import com.em.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lujunjie on 2018/6/26.
 */
@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationMapper reservationMapper;

    public Integer reservationCount() {
        return reservationMapper.reservationCount();
    }

    public List<ReservationVo> findByPaging(Integer toPageNo) {
        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);

        List<ReservationVo> list = reservationMapper.findByPaging(pagingVO);
        return list;
    }

    public List<Reservation> findByName(String name) {
        return reservationMapper.findByName(name);
    }

    public Integer reservationPassCount() {
        return reservationMapper.reservationPassCount();
    }

    public List<ReservationVo> findRecord(Integer toPageNo) throws Exception {
        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);

        List<ReservationVo> list = reservationMapper.findRecord(pagingVO);
        return list;
    }

    public void reviewReservation(Integer id) throws Exception {
        reservationMapper.reviewReservation(id);
    }

    public Integer reserveCount() throws Exception {
        return reservationMapper.reserveCount();
    }

    public List<ReservationVo> findAllByPaging(Integer toPageNo) throws Exception {
        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);

        List<ReservationVo> list = reservationMapper.findAllByPaging(pagingVO);
        return list;
    }

    public void addReservation(ReservationCustom reservationCustom) throws Exception {
        reservationMapper.addReservation(reservationCustom);
    }

    public List<ReservationVo> queryByUser(String name) throws Exception {
        return reservationMapper.queryByUser(name);
    }

    public List<ReservationCustom> findByUser(String name) throws Exception {
        return reservationMapper.findByUser(name);
    }

    public void cancelApplication(Integer id) throws Exception {
        reservationMapper.cancelApplication(id);
    }
}
