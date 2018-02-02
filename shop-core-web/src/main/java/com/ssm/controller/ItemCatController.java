package com.ssm.controller;

import com.ssm.common.pojo.EasyUITreeNode;
import com.ssm.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 墨殇
 * @description:
 * @Date : 2018/2/2.
 */
@Controller
public class ItemCatController {


    @Autowired
    private ItemCatService itemCatService;

    @RequestMapping("/item/cat/list")
    @ResponseBody
    public List<EasyUITreeNode> getItemCatList(@RequestParam(name = "id",defaultValue = "0") Long parentId){
          List<EasyUITreeNode> list=itemCatService.getItemCatList(parentId);
          return list;
    }
}
