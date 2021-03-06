package com.antra.report.client.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.*;

import java.time.LocalDateTime;

@DynamoDBDocument
public class BaseReportEntity {
    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    private String id;
    private String fileId;


    private ReportRequestEntity request;

    private String fileLocation;
    private long fileSize;

    private ReportStatus status;

    private LocalDateTime createdTime;

    private LocalDateTime updatedTime;

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public ReportRequestEntity getRequest() {
        return request;
    }

    public void setRequest(ReportRequestEntity request) {
        this.request = request;
    }

    public String getFileLocation() {
        return fileLocation;
    }

    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(LocalDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    public ReportStatus getStatus() {
        return status;
    }

    public void setStatus(ReportStatus status) {
        this.status = status;
    }
}
