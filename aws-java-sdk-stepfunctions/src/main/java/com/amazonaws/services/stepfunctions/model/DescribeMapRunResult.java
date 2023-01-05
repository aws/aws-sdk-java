/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/DescribeMapRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMapRunResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies a Map Run.
     * </p>
     */
    private String mapRunArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the execution in which the Map Run was started.
     * </p>
     */
    private String executionArn;
    /**
     * <p>
     * The current status of the Map Run.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date when the Map Run was started.
     * </p>
     */
    private java.util.Date startDate;
    /**
     * <p>
     * The date when the Map Run was stopped.
     * </p>
     */
    private java.util.Date stopDate;
    /**
     * <p>
     * The maximum number of child workflow executions configured to run in parallel for the Map Run at the same time.
     * </p>
     */
    private Integer maxConcurrency;
    /**
     * <p>
     * The maximum percentage of failed child workflow executions before the Map Run fails.
     * </p>
     */
    private Float toleratedFailurePercentage;
    /**
     * <p>
     * The maximum number of failed child workflow executions before the Map Run fails.
     * </p>
     */
    private Long toleratedFailureCount;
    /**
     * <p>
     * A JSON object that contains information about the total number of items, and the item count for each processing
     * status, such as <code>pending</code> and <code>failed</code>.
     * </p>
     */
    private MapRunItemCounts itemCounts;
    /**
     * <p>
     * A JSON object that contains information about the total number of child workflow executions for the Map Run, and
     * the count of child workflow executions for each status, such as <code>failed</code> and <code>succeeded</code>.
     * </p>
     */
    private MapRunExecutionCounts executionCounts;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies a Map Run.
     * </p>
     * 
     * @param mapRunArn
     *        The Amazon Resource Name (ARN) that identifies a Map Run.
     */

    public void setMapRunArn(String mapRunArn) {
        this.mapRunArn = mapRunArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies a Map Run.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that identifies a Map Run.
     */

    public String getMapRunArn() {
        return this.mapRunArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies a Map Run.
     * </p>
     * 
     * @param mapRunArn
     *        The Amazon Resource Name (ARN) that identifies a Map Run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMapRunResult withMapRunArn(String mapRunArn) {
        setMapRunArn(mapRunArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the execution in which the Map Run was started.
     * </p>
     * 
     * @param executionArn
     *        The Amazon Resource Name (ARN) that identifies the execution in which the Map Run was started.
     */

    public void setExecutionArn(String executionArn) {
        this.executionArn = executionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the execution in which the Map Run was started.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that identifies the execution in which the Map Run was started.
     */

    public String getExecutionArn() {
        return this.executionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the execution in which the Map Run was started.
     * </p>
     * 
     * @param executionArn
     *        The Amazon Resource Name (ARN) that identifies the execution in which the Map Run was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMapRunResult withExecutionArn(String executionArn) {
        setExecutionArn(executionArn);
        return this;
    }

    /**
     * <p>
     * The current status of the Map Run.
     * </p>
     * 
     * @param status
     *        The current status of the Map Run.
     * @see MapRunStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the Map Run.
     * </p>
     * 
     * @return The current status of the Map Run.
     * @see MapRunStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the Map Run.
     * </p>
     * 
     * @param status
     *        The current status of the Map Run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MapRunStatus
     */

    public DescribeMapRunResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the Map Run.
     * </p>
     * 
     * @param status
     *        The current status of the Map Run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MapRunStatus
     */

    public DescribeMapRunResult withStatus(MapRunStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date when the Map Run was started.
     * </p>
     * 
     * @param startDate
     *        The date when the Map Run was started.
     */

    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The date when the Map Run was started.
     * </p>
     * 
     * @return The date when the Map Run was started.
     */

    public java.util.Date getStartDate() {
        return this.startDate;
    }

    /**
     * <p>
     * The date when the Map Run was started.
     * </p>
     * 
     * @param startDate
     *        The date when the Map Run was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMapRunResult withStartDate(java.util.Date startDate) {
        setStartDate(startDate);
        return this;
    }

    /**
     * <p>
     * The date when the Map Run was stopped.
     * </p>
     * 
     * @param stopDate
     *        The date when the Map Run was stopped.
     */

    public void setStopDate(java.util.Date stopDate) {
        this.stopDate = stopDate;
    }

    /**
     * <p>
     * The date when the Map Run was stopped.
     * </p>
     * 
     * @return The date when the Map Run was stopped.
     */

    public java.util.Date getStopDate() {
        return this.stopDate;
    }

    /**
     * <p>
     * The date when the Map Run was stopped.
     * </p>
     * 
     * @param stopDate
     *        The date when the Map Run was stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMapRunResult withStopDate(java.util.Date stopDate) {
        setStopDate(stopDate);
        return this;
    }

    /**
     * <p>
     * The maximum number of child workflow executions configured to run in parallel for the Map Run at the same time.
     * </p>
     * 
     * @param maxConcurrency
     *        The maximum number of child workflow executions configured to run in parallel for the Map Run at the same
     *        time.
     */

    public void setMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    /**
     * <p>
     * The maximum number of child workflow executions configured to run in parallel for the Map Run at the same time.
     * </p>
     * 
     * @return The maximum number of child workflow executions configured to run in parallel for the Map Run at the same
     *         time.
     */

    public Integer getMaxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * <p>
     * The maximum number of child workflow executions configured to run in parallel for the Map Run at the same time.
     * </p>
     * 
     * @param maxConcurrency
     *        The maximum number of child workflow executions configured to run in parallel for the Map Run at the same
     *        time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMapRunResult withMaxConcurrency(Integer maxConcurrency) {
        setMaxConcurrency(maxConcurrency);
        return this;
    }

    /**
     * <p>
     * The maximum percentage of failed child workflow executions before the Map Run fails.
     * </p>
     * 
     * @param toleratedFailurePercentage
     *        The maximum percentage of failed child workflow executions before the Map Run fails.
     */

    public void setToleratedFailurePercentage(Float toleratedFailurePercentage) {
        this.toleratedFailurePercentage = toleratedFailurePercentage;
    }

    /**
     * <p>
     * The maximum percentage of failed child workflow executions before the Map Run fails.
     * </p>
     * 
     * @return The maximum percentage of failed child workflow executions before the Map Run fails.
     */

    public Float getToleratedFailurePercentage() {
        return this.toleratedFailurePercentage;
    }

    /**
     * <p>
     * The maximum percentage of failed child workflow executions before the Map Run fails.
     * </p>
     * 
     * @param toleratedFailurePercentage
     *        The maximum percentage of failed child workflow executions before the Map Run fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMapRunResult withToleratedFailurePercentage(Float toleratedFailurePercentage) {
        setToleratedFailurePercentage(toleratedFailurePercentage);
        return this;
    }

    /**
     * <p>
     * The maximum number of failed child workflow executions before the Map Run fails.
     * </p>
     * 
     * @param toleratedFailureCount
     *        The maximum number of failed child workflow executions before the Map Run fails.
     */

    public void setToleratedFailureCount(Long toleratedFailureCount) {
        this.toleratedFailureCount = toleratedFailureCount;
    }

    /**
     * <p>
     * The maximum number of failed child workflow executions before the Map Run fails.
     * </p>
     * 
     * @return The maximum number of failed child workflow executions before the Map Run fails.
     */

    public Long getToleratedFailureCount() {
        return this.toleratedFailureCount;
    }

    /**
     * <p>
     * The maximum number of failed child workflow executions before the Map Run fails.
     * </p>
     * 
     * @param toleratedFailureCount
     *        The maximum number of failed child workflow executions before the Map Run fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMapRunResult withToleratedFailureCount(Long toleratedFailureCount) {
        setToleratedFailureCount(toleratedFailureCount);
        return this;
    }

    /**
     * <p>
     * A JSON object that contains information about the total number of items, and the item count for each processing
     * status, such as <code>pending</code> and <code>failed</code>.
     * </p>
     * 
     * @param itemCounts
     *        A JSON object that contains information about the total number of items, and the item count for each
     *        processing status, such as <code>pending</code> and <code>failed</code>.
     */

    public void setItemCounts(MapRunItemCounts itemCounts) {
        this.itemCounts = itemCounts;
    }

    /**
     * <p>
     * A JSON object that contains information about the total number of items, and the item count for each processing
     * status, such as <code>pending</code> and <code>failed</code>.
     * </p>
     * 
     * @return A JSON object that contains information about the total number of items, and the item count for each
     *         processing status, such as <code>pending</code> and <code>failed</code>.
     */

    public MapRunItemCounts getItemCounts() {
        return this.itemCounts;
    }

    /**
     * <p>
     * A JSON object that contains information about the total number of items, and the item count for each processing
     * status, such as <code>pending</code> and <code>failed</code>.
     * </p>
     * 
     * @param itemCounts
     *        A JSON object that contains information about the total number of items, and the item count for each
     *        processing status, such as <code>pending</code> and <code>failed</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMapRunResult withItemCounts(MapRunItemCounts itemCounts) {
        setItemCounts(itemCounts);
        return this;
    }

    /**
     * <p>
     * A JSON object that contains information about the total number of child workflow executions for the Map Run, and
     * the count of child workflow executions for each status, such as <code>failed</code> and <code>succeeded</code>.
     * </p>
     * 
     * @param executionCounts
     *        A JSON object that contains information about the total number of child workflow executions for the Map
     *        Run, and the count of child workflow executions for each status, such as <code>failed</code> and
     *        <code>succeeded</code>.
     */

    public void setExecutionCounts(MapRunExecutionCounts executionCounts) {
        this.executionCounts = executionCounts;
    }

    /**
     * <p>
     * A JSON object that contains information about the total number of child workflow executions for the Map Run, and
     * the count of child workflow executions for each status, such as <code>failed</code> and <code>succeeded</code>.
     * </p>
     * 
     * @return A JSON object that contains information about the total number of child workflow executions for the Map
     *         Run, and the count of child workflow executions for each status, such as <code>failed</code> and
     *         <code>succeeded</code>.
     */

    public MapRunExecutionCounts getExecutionCounts() {
        return this.executionCounts;
    }

    /**
     * <p>
     * A JSON object that contains information about the total number of child workflow executions for the Map Run, and
     * the count of child workflow executions for each status, such as <code>failed</code> and <code>succeeded</code>.
     * </p>
     * 
     * @param executionCounts
     *        A JSON object that contains information about the total number of child workflow executions for the Map
     *        Run, and the count of child workflow executions for each status, such as <code>failed</code> and
     *        <code>succeeded</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMapRunResult withExecutionCounts(MapRunExecutionCounts executionCounts) {
        setExecutionCounts(executionCounts);
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
        if (getMapRunArn() != null)
            sb.append("MapRunArn: ").append(getMapRunArn()).append(",");
        if (getExecutionArn() != null)
            sb.append("ExecutionArn: ").append(getExecutionArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStartDate() != null)
            sb.append("StartDate: ").append(getStartDate()).append(",");
        if (getStopDate() != null)
            sb.append("StopDate: ").append(getStopDate()).append(",");
        if (getMaxConcurrency() != null)
            sb.append("MaxConcurrency: ").append(getMaxConcurrency()).append(",");
        if (getToleratedFailurePercentage() != null)
            sb.append("ToleratedFailurePercentage: ").append(getToleratedFailurePercentage()).append(",");
        if (getToleratedFailureCount() != null)
            sb.append("ToleratedFailureCount: ").append(getToleratedFailureCount()).append(",");
        if (getItemCounts() != null)
            sb.append("ItemCounts: ").append(getItemCounts()).append(",");
        if (getExecutionCounts() != null)
            sb.append("ExecutionCounts: ").append(getExecutionCounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMapRunResult == false)
            return false;
        DescribeMapRunResult other = (DescribeMapRunResult) obj;
        if (other.getMapRunArn() == null ^ this.getMapRunArn() == null)
            return false;
        if (other.getMapRunArn() != null && other.getMapRunArn().equals(this.getMapRunArn()) == false)
            return false;
        if (other.getExecutionArn() == null ^ this.getExecutionArn() == null)
            return false;
        if (other.getExecutionArn() != null && other.getExecutionArn().equals(this.getExecutionArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getStopDate() == null ^ this.getStopDate() == null)
            return false;
        if (other.getStopDate() != null && other.getStopDate().equals(this.getStopDate()) == false)
            return false;
        if (other.getMaxConcurrency() == null ^ this.getMaxConcurrency() == null)
            return false;
        if (other.getMaxConcurrency() != null && other.getMaxConcurrency().equals(this.getMaxConcurrency()) == false)
            return false;
        if (other.getToleratedFailurePercentage() == null ^ this.getToleratedFailurePercentage() == null)
            return false;
        if (other.getToleratedFailurePercentage() != null && other.getToleratedFailurePercentage().equals(this.getToleratedFailurePercentage()) == false)
            return false;
        if (other.getToleratedFailureCount() == null ^ this.getToleratedFailureCount() == null)
            return false;
        if (other.getToleratedFailureCount() != null && other.getToleratedFailureCount().equals(this.getToleratedFailureCount()) == false)
            return false;
        if (other.getItemCounts() == null ^ this.getItemCounts() == null)
            return false;
        if (other.getItemCounts() != null && other.getItemCounts().equals(this.getItemCounts()) == false)
            return false;
        if (other.getExecutionCounts() == null ^ this.getExecutionCounts() == null)
            return false;
        if (other.getExecutionCounts() != null && other.getExecutionCounts().equals(this.getExecutionCounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMapRunArn() == null) ? 0 : getMapRunArn().hashCode());
        hashCode = prime * hashCode + ((getExecutionArn() == null) ? 0 : getExecutionArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getStopDate() == null) ? 0 : getStopDate().hashCode());
        hashCode = prime * hashCode + ((getMaxConcurrency() == null) ? 0 : getMaxConcurrency().hashCode());
        hashCode = prime * hashCode + ((getToleratedFailurePercentage() == null) ? 0 : getToleratedFailurePercentage().hashCode());
        hashCode = prime * hashCode + ((getToleratedFailureCount() == null) ? 0 : getToleratedFailureCount().hashCode());
        hashCode = prime * hashCode + ((getItemCounts() == null) ? 0 : getItemCounts().hashCode());
        hashCode = prime * hashCode + ((getExecutionCounts() == null) ? 0 : getExecutionCounts().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMapRunResult clone() {
        try {
            return (DescribeMapRunResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
