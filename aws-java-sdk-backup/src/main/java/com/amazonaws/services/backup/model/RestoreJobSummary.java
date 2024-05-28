/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This is a summary of restore jobs created or running within the most recent 30 days.
 * </p>
 * <p>
 * The returned summary may contain the following: Region, Account, State, ResourceType, MessageCategory, StartTime,
 * EndTime, and Count of included jobs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/RestoreJobSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreJobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services Regions within the job summary.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The account ID that owns the jobs within the summary.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * This value is job count for jobs with the specified state.
     * </p>
     */
    private String state;
    /**
     * <p>
     * This value is the job count for the specified resource type. The request <code>GetSupportedResourceTypes</code>
     * returns strings for supported resource types.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The value as a number of jobs in a job summary.
     * </p>
     */
    private Integer count;
    /**
     * <p>
     * The value of time in number format of a job start time.
     * </p>
     * <p>
     * This value is the time in Unix format, Coordinated Universal Time (UTC), and accurate to milliseconds. For
     * example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The value of time in number format of a job end time.
     * </p>
     * <p>
     * This value is the time in Unix format, Coordinated Universal Time (UTC), and accurate to milliseconds. For
     * example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The Amazon Web Services Regions within the job summary.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Regions within the job summary.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Amazon Web Services Regions within the job summary.
     * </p>
     * 
     * @return The Amazon Web Services Regions within the job summary.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The Amazon Web Services Regions within the job summary.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Regions within the job summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreJobSummary withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The account ID that owns the jobs within the summary.
     * </p>
     * 
     * @param accountId
     *        The account ID that owns the jobs within the summary.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account ID that owns the jobs within the summary.
     * </p>
     * 
     * @return The account ID that owns the jobs within the summary.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The account ID that owns the jobs within the summary.
     * </p>
     * 
     * @param accountId
     *        The account ID that owns the jobs within the summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreJobSummary withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * This value is job count for jobs with the specified state.
     * </p>
     * 
     * @param state
     *        This value is job count for jobs with the specified state.
     * @see RestoreJobState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * This value is job count for jobs with the specified state.
     * </p>
     * 
     * @return This value is job count for jobs with the specified state.
     * @see RestoreJobState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * This value is job count for jobs with the specified state.
     * </p>
     * 
     * @param state
     *        This value is job count for jobs with the specified state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RestoreJobState
     */

    public RestoreJobSummary withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * This value is job count for jobs with the specified state.
     * </p>
     * 
     * @param state
     *        This value is job count for jobs with the specified state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RestoreJobState
     */

    public RestoreJobSummary withState(RestoreJobState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * This value is the job count for the specified resource type. The request <code>GetSupportedResourceTypes</code>
     * returns strings for supported resource types.
     * </p>
     * 
     * @param resourceType
     *        This value is the job count for the specified resource type. The request
     *        <code>GetSupportedResourceTypes</code> returns strings for supported resource types.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * This value is the job count for the specified resource type. The request <code>GetSupportedResourceTypes</code>
     * returns strings for supported resource types.
     * </p>
     * 
     * @return This value is the job count for the specified resource type. The request
     *         <code>GetSupportedResourceTypes</code> returns strings for supported resource types.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * This value is the job count for the specified resource type. The request <code>GetSupportedResourceTypes</code>
     * returns strings for supported resource types.
     * </p>
     * 
     * @param resourceType
     *        This value is the job count for the specified resource type. The request
     *        <code>GetSupportedResourceTypes</code> returns strings for supported resource types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreJobSummary withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The value as a number of jobs in a job summary.
     * </p>
     * 
     * @param count
     *        The value as a number of jobs in a job summary.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The value as a number of jobs in a job summary.
     * </p>
     * 
     * @return The value as a number of jobs in a job summary.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * The value as a number of jobs in a job summary.
     * </p>
     * 
     * @param count
     *        The value as a number of jobs in a job summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreJobSummary withCount(Integer count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * The value of time in number format of a job start time.
     * </p>
     * <p>
     * This value is the time in Unix format, Coordinated Universal Time (UTC), and accurate to milliseconds. For
     * example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param startTime
     *        The value of time in number format of a job start time.</p>
     *        <p>
     *        This value is the time in Unix format, Coordinated Universal Time (UTC), and accurate to milliseconds. For
     *        example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The value of time in number format of a job start time.
     * </p>
     * <p>
     * This value is the time in Unix format, Coordinated Universal Time (UTC), and accurate to milliseconds. For
     * example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @return The value of time in number format of a job start time.</p>
     *         <p>
     *         This value is the time in Unix format, Coordinated Universal Time (UTC), and accurate to milliseconds.
     *         For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The value of time in number format of a job start time.
     * </p>
     * <p>
     * This value is the time in Unix format, Coordinated Universal Time (UTC), and accurate to milliseconds. For
     * example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param startTime
     *        The value of time in number format of a job start time.</p>
     *        <p>
     *        This value is the time in Unix format, Coordinated Universal Time (UTC), and accurate to milliseconds. For
     *        example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreJobSummary withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The value of time in number format of a job end time.
     * </p>
     * <p>
     * This value is the time in Unix format, Coordinated Universal Time (UTC), and accurate to milliseconds. For
     * example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param endTime
     *        The value of time in number format of a job end time.</p>
     *        <p>
     *        This value is the time in Unix format, Coordinated Universal Time (UTC), and accurate to milliseconds. For
     *        example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The value of time in number format of a job end time.
     * </p>
     * <p>
     * This value is the time in Unix format, Coordinated Universal Time (UTC), and accurate to milliseconds. For
     * example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @return The value of time in number format of a job end time.</p>
     *         <p>
     *         This value is the time in Unix format, Coordinated Universal Time (UTC), and accurate to milliseconds.
     *         For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The value of time in number format of a job end time.
     * </p>
     * <p>
     * This value is the time in Unix format, Coordinated Universal Time (UTC), and accurate to milliseconds. For
     * example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param endTime
     *        The value of time in number format of a job end time.</p>
     *        <p>
     *        This value is the time in Unix format, Coordinated Universal Time (UTC), and accurate to milliseconds. For
     *        example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreJobSummary withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
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
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreJobSummary == false)
            return false;
        RestoreJobSummary other = (RestoreJobSummary) obj;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public RestoreJobSummary clone() {
        try {
            return (RestoreJobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.RestoreJobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
