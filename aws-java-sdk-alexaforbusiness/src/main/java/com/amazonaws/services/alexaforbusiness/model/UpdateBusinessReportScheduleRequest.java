/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateBusinessReportSchedule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBusinessReportScheduleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the business report schedule.
     * </p>
     */
    private String scheduleArn;
    /**
     * <p>
     * The S3 location of the output reports.
     * </p>
     */
    private String s3BucketName;
    /**
     * <p>
     * The S3 key where the report is delivered.
     * </p>
     */
    private String s3KeyPrefix;
    /**
     * <p>
     * The format of the generated report (individual CSV files or zipped files of individual files).
     * </p>
     */
    private String format;
    /**
     * <p>
     * The name identifier of the schedule.
     * </p>
     */
    private String scheduleName;
    /**
     * <p>
     * The recurrence of the reports.
     * </p>
     */
    private BusinessReportRecurrence recurrence;

    /**
     * <p>
     * The ARN of the business report schedule.
     * </p>
     * 
     * @param scheduleArn
     *        The ARN of the business report schedule.
     */

    public void setScheduleArn(String scheduleArn) {
        this.scheduleArn = scheduleArn;
    }

    /**
     * <p>
     * The ARN of the business report schedule.
     * </p>
     * 
     * @return The ARN of the business report schedule.
     */

    public String getScheduleArn() {
        return this.scheduleArn;
    }

    /**
     * <p>
     * The ARN of the business report schedule.
     * </p>
     * 
     * @param scheduleArn
     *        The ARN of the business report schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBusinessReportScheduleRequest withScheduleArn(String scheduleArn) {
        setScheduleArn(scheduleArn);
        return this;
    }

    /**
     * <p>
     * The S3 location of the output reports.
     * </p>
     * 
     * @param s3BucketName
     *        The S3 location of the output reports.
     */

    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * The S3 location of the output reports.
     * </p>
     * 
     * @return The S3 location of the output reports.
     */

    public String getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * <p>
     * The S3 location of the output reports.
     * </p>
     * 
     * @param s3BucketName
     *        The S3 location of the output reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBusinessReportScheduleRequest withS3BucketName(String s3BucketName) {
        setS3BucketName(s3BucketName);
        return this;
    }

    /**
     * <p>
     * The S3 key where the report is delivered.
     * </p>
     * 
     * @param s3KeyPrefix
     *        The S3 key where the report is delivered.
     */

    public void setS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
    }

    /**
     * <p>
     * The S3 key where the report is delivered.
     * </p>
     * 
     * @return The S3 key where the report is delivered.
     */

    public String getS3KeyPrefix() {
        return this.s3KeyPrefix;
    }

    /**
     * <p>
     * The S3 key where the report is delivered.
     * </p>
     * 
     * @param s3KeyPrefix
     *        The S3 key where the report is delivered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBusinessReportScheduleRequest withS3KeyPrefix(String s3KeyPrefix) {
        setS3KeyPrefix(s3KeyPrefix);
        return this;
    }

    /**
     * <p>
     * The format of the generated report (individual CSV files or zipped files of individual files).
     * </p>
     * 
     * @param format
     *        The format of the generated report (individual CSV files or zipped files of individual files).
     * @see BusinessReportFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the generated report (individual CSV files or zipped files of individual files).
     * </p>
     * 
     * @return The format of the generated report (individual CSV files or zipped files of individual files).
     * @see BusinessReportFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format of the generated report (individual CSV files or zipped files of individual files).
     * </p>
     * 
     * @param format
     *        The format of the generated report (individual CSV files or zipped files of individual files).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BusinessReportFormat
     */

    public UpdateBusinessReportScheduleRequest withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The format of the generated report (individual CSV files or zipped files of individual files).
     * </p>
     * 
     * @param format
     *        The format of the generated report (individual CSV files or zipped files of individual files).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BusinessReportFormat
     */

    public UpdateBusinessReportScheduleRequest withFormat(BusinessReportFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The name identifier of the schedule.
     * </p>
     * 
     * @param scheduleName
     *        The name identifier of the schedule.
     */

    public void setScheduleName(String scheduleName) {
        this.scheduleName = scheduleName;
    }

    /**
     * <p>
     * The name identifier of the schedule.
     * </p>
     * 
     * @return The name identifier of the schedule.
     */

    public String getScheduleName() {
        return this.scheduleName;
    }

    /**
     * <p>
     * The name identifier of the schedule.
     * </p>
     * 
     * @param scheduleName
     *        The name identifier of the schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBusinessReportScheduleRequest withScheduleName(String scheduleName) {
        setScheduleName(scheduleName);
        return this;
    }

    /**
     * <p>
     * The recurrence of the reports.
     * </p>
     * 
     * @param recurrence
     *        The recurrence of the reports.
     */

    public void setRecurrence(BusinessReportRecurrence recurrence) {
        this.recurrence = recurrence;
    }

    /**
     * <p>
     * The recurrence of the reports.
     * </p>
     * 
     * @return The recurrence of the reports.
     */

    public BusinessReportRecurrence getRecurrence() {
        return this.recurrence;
    }

    /**
     * <p>
     * The recurrence of the reports.
     * </p>
     * 
     * @param recurrence
     *        The recurrence of the reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBusinessReportScheduleRequest withRecurrence(BusinessReportRecurrence recurrence) {
        setRecurrence(recurrence);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getScheduleArn() != null)
            sb.append("ScheduleArn: ").append(getScheduleArn()).append(",");
        if (getS3BucketName() != null)
            sb.append("S3BucketName: ").append(getS3BucketName()).append(",");
        if (getS3KeyPrefix() != null)
            sb.append("S3KeyPrefix: ").append(getS3KeyPrefix()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getScheduleName() != null)
            sb.append("ScheduleName: ").append(getScheduleName()).append(",");
        if (getRecurrence() != null)
            sb.append("Recurrence: ").append(getRecurrence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBusinessReportScheduleRequest == false)
            return false;
        UpdateBusinessReportScheduleRequest other = (UpdateBusinessReportScheduleRequest) obj;
        if (other.getScheduleArn() == null ^ this.getScheduleArn() == null)
            return false;
        if (other.getScheduleArn() != null && other.getScheduleArn().equals(this.getScheduleArn()) == false)
            return false;
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        if (other.getS3KeyPrefix() == null ^ this.getS3KeyPrefix() == null)
            return false;
        if (other.getS3KeyPrefix() != null && other.getS3KeyPrefix().equals(this.getS3KeyPrefix()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getScheduleName() == null ^ this.getScheduleName() == null)
            return false;
        if (other.getScheduleName() != null && other.getScheduleName().equals(this.getScheduleName()) == false)
            return false;
        if (other.getRecurrence() == null ^ this.getRecurrence() == null)
            return false;
        if (other.getRecurrence() != null && other.getRecurrence().equals(this.getRecurrence()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScheduleArn() == null) ? 0 : getScheduleArn().hashCode());
        hashCode = prime * hashCode + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getS3KeyPrefix() == null) ? 0 : getS3KeyPrefix().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getScheduleName() == null) ? 0 : getScheduleName().hashCode());
        hashCode = prime * hashCode + ((getRecurrence() == null) ? 0 : getRecurrence().hashCode());
        return hashCode;
    }

    @Override
    public UpdateBusinessReportScheduleRequest clone() {
        return (UpdateBusinessReportScheduleRequest) super.clone();
    }

}
