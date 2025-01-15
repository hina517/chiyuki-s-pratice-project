package net.study.gmall.service.service;

import com.atguigu.gmall.model.product.BaseCategory1;

import java.util.List;

/**一级分类的接口类*/

public interface BaseCategory1Service {

    /**
     * 主键查询
     *
     * @param id
     * @return
     */

    public BaseCategory1 getBaseCatetory1(Long id);

    public List<BaseCategory1> getBaseCategory1List();
}
