package com.content.service.impl;

import com.content.service.ContentCategoryService;
import com.ssm.common.pojo.EasyUITreeNode;
import com.ssm.mapper.TbContentCategoryMapper;
import com.ssm.pojo.TbContentCategory;
import com.ssm.pojo.TbContentCategoryExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 墨殇
 * @description:
 * @Date : 2018/2/5.
 */
@Service
public class ContentCategoryServiceImpl implements ContentCategoryService{

    @Autowired
    private TbContentCategoryMapper tbContentCategoryMapper;
    @Override
    public List<EasyUITreeNode> getContentList(long parentId) {
        TbContentCategoryExample example=new TbContentCategoryExample();
        TbContentCategoryExample.Criteria criteria=example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        List<TbContentCategory> list=tbContentCategoryMapper.selectByExample(example);

        List<EasyUITreeNode> easyUITreeNodes=new ArrayList<>();
        for (TbContentCategory tbContentCategory:list){
            EasyUITreeNode node=new EasyUITreeNode();
            node.setId(tbContentCategory.getId());
            node.setState(tbContentCategory.getIsParent()?"closed":"open");
            node.setText(tbContentCategory.getName());
            easyUITreeNodes.add(node);
        }

        return easyUITreeNodes;
    }
}
