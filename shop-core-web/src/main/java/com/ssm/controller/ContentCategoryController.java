package com.ssm.controller;

import com.content.service.ContentCategoryService;
import com.ssm.common.pojo.EasyUITreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 墨殇
 * @description:
 * @Date : 2018/2/5.
 */
@Controller
public class ContentCategoryController {
    @Autowired
    private ContentCategoryService contentCategoryService;

    @RequestMapping("/content/category/list")
    @ResponseBody
    public List<EasyUITreeNode> getContentList(@RequestParam(name = "id",defaultValue = "0") Long parentId){

        List<EasyUITreeNode> list=contentCategoryService.getContentList(parentId);
        return list;
    }

}
