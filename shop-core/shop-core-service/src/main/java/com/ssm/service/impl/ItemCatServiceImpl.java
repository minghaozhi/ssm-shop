package com.ssm.service.impl;

import com.ssm.common.pojo.EasyUITreeNode;
import com.ssm.mapper.TbItemCatMapper;
import com.ssm.pojo.TbItemCat;
import com.ssm.pojo.TbItemCatExample;
import com.ssm.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 墨殇
 * @description:
 * @Date : 2018/2/2.
 */
@Service
public class ItemCatServiceImpl implements ItemCatService{

    @Autowired
    private TbItemCatMapper tbItemCatMapper;

    @Override
    public List<EasyUITreeNode> getItemCatList(Long parentId) {
        //根据父id查询子节点列表
        TbItemCatExample example=new TbItemCatExample();
        TbItemCatExample.Criteria criteria=example.createCriteria();
        //设置查询条件
        criteria.andParentIdEqualTo(parentId);
        //执行查询
        List<TbItemCat> list=tbItemCatMapper.selectByExample(example);
        List<EasyUITreeNode> easyUITreeNodeArrayList=new ArrayList<>();
        //转换成EasyUITreeNode格式
        for (TbItemCat tbItemCat:list){
          EasyUITreeNode easyUITreeNode=new EasyUITreeNode();
          easyUITreeNode.setId(tbItemCat.getId());
          easyUITreeNode.setText(tbItemCat.getName());
          easyUITreeNode.setState(tbItemCat.getIsParent()?"closed":"open");

          easyUITreeNodeArrayList.add(easyUITreeNode);
        }
        return easyUITreeNodeArrayList;
    }
}
