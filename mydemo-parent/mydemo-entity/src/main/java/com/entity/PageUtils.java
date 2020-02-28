package com.entity;

import org.omg.CORBA.INTERNAL;

import java.util.List;

/**
 * @program: mydemo-parent
 * @description: 分页辅助类
 * @author: admin
 * @create: 2019-10-04 15:26
 **/
public class PageUtils {
    private Integer firstPage = 1; //首页
    private Integer prePage;  //上一页
    private Integer nextPage;   //下一页
    private Integer totalPage;  //末页。总页
    private  Integer curPage;   //当前页
    private List datas;     //需要显示的数据
    private Integer curSize = 6; //每页显示的数据
    private Integer totalSize;  //总的记录数

    public Integer getFirstPage() {
        return firstPage;
    }

    public void setFirstPage(Integer firstPage) {
        this.firstPage = firstPage;
    }

    public Integer getPrePage() {
        return this.getCurPage() == this.getFirstPage() ? this.getFirstPage() : this.getCurPage()-1;
    }

    public void setPrePage(Integer prePage) {
        this.prePage = prePage;
    }

    public Integer getNextPage() {
        return this.getCurPage() == this.getTotalPage() ? this.getTotalPage():this.getCurPage()+1;
    }

    public void setNextPage(Integer nextPage) {
        this.nextPage = nextPage;
    }

    public Integer getTotalPage() {
        return this.getTotalSize()%this.getCurSize()==0?this.getTotalSize()/this.getCurSize():this.getTotalSize()/this.getCurSize()+1;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getCurPage() {
        return curPage;
    }

    public void setCurPage(Integer curPage) {
        this.curPage = curPage;
    }

    public List getDatas() {
        return datas;
    }

    public void setDatas(List datas) {
        this.datas = datas;
    }

    public Integer getCurSize() {
        return curSize;
    }

    public void setCurSize(Integer curSize) {
        this.curSize = curSize;
    }

    public Integer getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }
}
