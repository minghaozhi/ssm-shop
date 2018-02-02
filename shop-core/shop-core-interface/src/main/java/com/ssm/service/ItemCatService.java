package com.ssm.service;

import com.ssm.common.pojo.EasyUITreeNode;

import java.util.List;

/**
 * @author 墨殇
 * @description:
 * @Date : 2018/2/2.
 */
public interface ItemCatService {
    List<EasyUITreeNode>  getItemCatList(Long parentId);
}
