package com.content.service;

import com.ssm.common.pojo.EasyUITreeNode;

import java.util.List;

/**
 * @author 墨殇
 * @description:
 * @Date : 2018/2/5.
 */
public interface ContentCategoryService {

    List<EasyUITreeNode> getContentList(long parentId);
}
