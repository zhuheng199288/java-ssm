package com.zhuheng.service;

import com.zhuheng.daomain.Emp;

import java.util.List;

public interface EmpService {
    /**
     * 保存
     * @param emp
     * @return
     */
    public boolean save(Emp emp);

    /**
     * 修改
     * @param emp
     * @return
     */
    public boolean update(Emp emp);

    /**
     * 按id删除
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * 按id查询
     * @param id
     * @return
     */
    public Emp getById(Integer id);

    /**
     * 查询全部
     * @return
     */
    public List<Emp> getAll();
}
