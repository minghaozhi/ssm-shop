package com.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.common.pojo.EasyUIDataGridResult;
import com.ssm.mapper.TbItemMapper;
import com.ssm.pojo.TbItem;
import com.ssm.pojo.TbItemExample;
import com.ssm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 墨殇
 * 2018/1/30.
 * @author Administrator
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private TbItemMapper tbItemMapper;
    @Override
    public TbItem getItemById(Long itemId) {
        TbItem tbItem=tbItemMapper.selectByPrimaryKey(itemId);
        return tbItem;
    }

    @Override
    public EasyUIDataGridResult getItemList(int page, int rows) {
        //设置分页信息
        PageHelper.startPage(page,rows);
        //执行查询
        TbItemExample example=new TbItemExample();
        List<TbItem> list=tbItemMapper.selectByExample(example);
        //创建返回值对象
        EasyUIDataGridResult result=new EasyUIDataGridResult();
        result.setRows(list);
        PageInfo<TbItem> pageInfo=new PageInfo<>(list);
        //取总记录数
        long total=pageInfo.getTotal();
        result.setTotal(total);
        //获取结果
        return result;
    }
}
