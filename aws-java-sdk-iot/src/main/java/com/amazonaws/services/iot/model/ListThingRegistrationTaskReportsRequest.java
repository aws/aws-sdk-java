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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListThingRegistrationTaskReportsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The id of the task.
     * </p>
     */
    private String taskId;
    /**
     * <p>
     * The type of task report.
     * </p>
     */
    private String reportType;
    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return per request.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The id of the task.
     * </p>
     * 
     * @param taskId
     *        The id of the task.
     */

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The id of the task.
     * </p>
     * 
     * @return The id of the task.
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     * <p>
     * The id of the task.
     * </p>
     * 
     * @param taskId
     *        The id of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThingRegistrationTaskReportsRequest withTaskId(String taskId) {
        setTaskId(taskId);
        return this;
    }

    /**
     * <p>
     * The type of task report.
     * </p>
     * 
     * @param reportType
     *        The type of task report.
     * @see ReportType
     */

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    /**
     * <p>
     * The type of task report.
     * </p>
     * 
     * @return The type of task report.
     * @see ReportType
     */

    public String getReportType() {
        return this.reportType;
    }

    /**
     * <p>
     * The type of task report.
     * </p>
     * 
     * @param reportType
     *        The type of task report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportType
     */

    public ListThingRegistrationTaskReportsRequest withReportType(String reportType) {
        setReportType(reportType);
        return this;
    }

    /**
     * <p>
     * The type of task report.
     * </p>
     * 
     * @param reportType
     *        The type of task report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportType
     */

    public ListThingRegistrationTaskReportsRequest withReportType(ReportType reportType) {
        this.reportType = reportType.toString();
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @return The token to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThingRegistrationTaskReportsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per request.
     * </p>
     * 
     * @return The maximum number of results to return per request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThingRegistrationTaskReportsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getTaskId() != null)
            sb.append("TaskId: ").append(getTaskId()).append(",");
        if (getReportType() != null)
            sb.append("ReportType: ").append(getReportType()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListThingRegistrationTaskReportsRequest == false)
            return false;
        ListThingRegistrationTaskReportsRequest other = (ListThingRegistrationTaskReportsRequest) obj;
        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        if (other.getReportType() == null ^ this.getReportType() == null)
            return false;
        if (other.getReportType() != null && other.getReportType().equals(this.getReportType()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        hashCode = prime * hashCode + ((getReportType() == null) ? 0 : getReportType().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListThingRegistrationTaskReportsRequest clone() {
        return (ListThingRegistrationTaskReportsRequest) super.clone();
    }

}
