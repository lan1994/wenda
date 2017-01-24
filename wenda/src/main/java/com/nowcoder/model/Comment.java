package com.nowcoder.model;

import java.util.Date;

/**
 * Created by nowcoder on 2016/7/24.
 */
public class Comment {
    private int id;
    private int userId;     //谁评论的
    private int entityId;  //questionId,commentId
    private int entityType;//question ,comment
    private String content;
    private Date createdDate;
    private int status;
    //private int toUserId //评论了谁
    //private int conversitinId userxiao_userda规则，为了能显示出会话
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getEntityId() {
        return entityId;
    }

    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }

    public int getEntityType() {
        return entityType;
    }

    public void setEntityType(int entityType) {
        this.entityType = entityType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
