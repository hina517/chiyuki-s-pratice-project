package net.study.gmall.service.service.impl;

import com.atguigu.gmall.model.product.BaseCategory1;
import net.study.gmall.mapper.BaseCategory1Mapper;
import net.study.gmall.service.service.BaseCategory1Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 一级分类的接口实现类*/

@Service
public class BaseCategory1ServiceImpl implements BaseCategory1Service {

    @Resource
    private BaseCategory1Mapper baseCategory1Mapper;

    /**
     * 主键查询
     *
     * @param id
     * @return
     */

    @Override
    public BaseCategory1 getBaseCatetory1(Long id) {
        return baseCategory1Mapper.selectById(id);
    }

    @Override
    public List<BaseCategory1> getBaseCategory1List() {
        return null;
    }
}
