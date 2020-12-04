package com.wtkj.springCloud.mapper;

import com.wtkj.springCloud.po.XtUser;

import java.util.List;

public interface XtUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(XtUser record);

    int insertSelective(XtUser record);

    XtUser selectByPrimaryKey(String id);

    List<XtUser> selectAllList();

    int updateByPrimaryKeySelective(XtUser record);

    int updateByPrimaryKey(XtUser record);
}