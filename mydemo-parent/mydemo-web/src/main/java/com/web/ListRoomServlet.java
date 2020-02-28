package com.web;

import com.entity.PageUtils;
import com.service.RoomService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: mydemo-parent
 * @description: 获取room的servlet
 * @author: admin
 * @create: 2019-10-04 15:42
 **/
@WebServlet("/list")
public class ListRoomServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RoomService service = new RoomService();
        PageUtils pageUtils = new PageUtils();
        //计算总页数
        pageUtils.setTotalSize(service.queryCount());
        //计算当前页
        String curPage = req.getParameter("curPage");
        if ( "".equals(curPage) || curPage == null){
            curPage = "1";
        }
        pageUtils.setCurPage(Integer.parseInt(curPage));
        //计算每页显示的数据
        pageUtils.setDatas(service.getRoomPage(pageUtils.getCurPage(),pageUtils.getCurSize()));
        req.setAttribute("page",pageUtils);
        req.getRequestDispatcher("WEB-INF/index.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
