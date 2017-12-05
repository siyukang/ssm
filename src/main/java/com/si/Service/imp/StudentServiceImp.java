package com.si.Service.imp;

import com.si.Service.StudentService;
import com.si.dto.Student;
import com.si.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: XiaoSi
 * @Description:
 * @Date: Created by Administrator on 2017/11/21 0021.
 * @Modified By:
 */
@Service
public class StudentServiceImp implements StudentService{
    @Autowired
    private StudentMapper studentMapper;

    public List<Student> getList() {
        return studentMapper.getLists();
    }
}
