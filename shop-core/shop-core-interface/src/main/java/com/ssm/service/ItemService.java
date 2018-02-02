package com.ssm.service;

import com.ssm.common.pojo.EasyUIDataGridResult;
import com.ssm.pojo.TbItem;

/**
 * Created by 墨殇
 * 2018/1/30.
 * @author Administrator
 */
public interface ItemService {
    TbItem getItemById(Long itemId);
    EasyUIDataGridResult getItemList(int page,int rows);
}
