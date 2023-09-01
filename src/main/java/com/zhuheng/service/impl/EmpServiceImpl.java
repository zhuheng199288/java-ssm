package com.zhuheng.service.impl;

import com.zhuheng.controller.Code;
import com.zhuheng.dao.EmpDao;
import com.zhuheng.daomain.Emp;
import com.zhuheng.exception.BusinessException;
import com.zhuheng.exception.SystemException;
import com.zhuheng.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpDao empDao;
    @Override
    public boolean save(Emp emp) {
        empDao.save(emp);
        return true;
    }

    @Override
    public boolean update(Emp emp) {
        empDao.update(emp);
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        empDao.delete(id);
        return true;
    }

    @Override
    public Emp getById(Integer id) {
        if(id == 1) {
            throw new BusinessException(Code.SYSTEM_ERR,"请不要用你的技术挑战我的底线");
        }
        try{
            int i = 1 / 0;
        }catch (ArithmeticException e){
            throw new SystemException(Code.SYSTEM_TIMEOUT__ERR,"服务器访问超时",e);
        }
        return empDao.getById(id);
    }

    @Override
    public List<Emp> getAll() {
        return empDao.getAll();
    }
}
