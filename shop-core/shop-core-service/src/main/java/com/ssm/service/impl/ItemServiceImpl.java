package com.ssm.service.impl;

import com.ssm.mapper.TbItemMapper;
import com.ssm.pojo.TbItem;
import com.ssm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 墨殇
 * 2018/1/30.
 * @author Administrator
 */
@Service
public class ItemServiceImpl implements ItemService{
    @Autowired
    private TbItemMapper tbItemMapper;
    @Override
    public TbItem getItemById(Long itemId) {
        TbItem tbItem=tbItemMapper.selectByPrimaryKey(itemId);
        return tbItem;
    }
}
