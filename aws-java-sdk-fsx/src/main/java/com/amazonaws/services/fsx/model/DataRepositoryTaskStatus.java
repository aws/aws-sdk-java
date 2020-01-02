/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the task status showing a running total of the total number of files to be processed, the number
 * successfully processed, and the number of files the task failed to process.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DataRepositoryTaskStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataRepositoryTaskStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total number of files that the task will process. While a task is executing, the sum of
     * <code>SucceededCount</code> plus <code>FailedCount</code> may not equal <code>TotalCount</code>. When the task is
     * complete, <code>TotalCount</code> equals the sum of <code>SucceededCount</code> plus <code>FailedCount</code>.
     * </p>
     */
    private Long totalCount;
    /**
     * <p>
     * A running total of the number of files that the task has successfully processed.
     * </p>
     */
    private Long succeededCount;
    /**
     * <p>
     * A running total of the number of files that the task failed to process.
     * </p>
     */
    private Long failedCount;
    /**
     * <p>
     * The time at which the task status was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * The total number of files that the task will process. While a task is executing, the sum of
     * <code>SucceededCount</code> plus <code>FailedCount</code> may not equal <code>TotalCount</code>. When the task is
     * complete, <code>TotalCount</code> equals the sum of <code>SucceededCount</code> plus <code>FailedCount</code>.
     * </p>
     * 
     * @param totalCount
     *        The total number of files that the task will process. While a task is executing, the sum of
     *        <code>SucceededCount</code> plus <code>FailedCount</code> may not equal <code>TotalCount</code>. When the
     *        task is complete, <code>TotalCount</code> equals the sum of <code>SucceededCount</code> plus
     *        <code>FailedCount</code>.
     */

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * <p>
     * The total number of files that the task will process. While a task is executing, the sum of
     * <code>SucceededCount</code> plus <code>FailedCount</code> may not equal <code>TotalCount</code>. When the task is
     * complete, <code>TotalCount</code> equals the sum of <code>SucceededCount</code> plus <code>FailedCount</code>.
     * </p>
     * 
     * @return The total number of files that the task will process. While a task is executing, the sum of
     *         <code>SucceededCount</code> plus <code>FailedCount</code> may not equal <code>TotalCount</code>. When the
     *         task is complete, <code>TotalCount</code> equals the sum of <code>SucceededCount</code> plus
     *         <code>FailedCount</code>.
     */

    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * <p>
     * The total number of files that the task will process. While a task is executing, the sum of
     * <code>SucceededCount</code> plus <code>FailedCount</code> may not equal <code>TotalCount</code>. When the task is
     * complete, <code>TotalCount</code> equals the sum of <code>SucceededCount</code> plus <code>FailedCount</code>.
     * </p>
     * 
     * @param totalCount
     *        The total number of files that the task will process. While a task is executing, the sum of
     *        <code>SucceededCount</code> plus <code>FailedCount</code> may not equal <code>TotalCount</code>. When the
     *        task is complete, <code>TotalCount</code> equals the sum of <code>SucceededCount</code> plus
     *        <code>FailedCount</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataRepositoryTaskStatus withTotalCount(Long totalCount) {
        setTotalCount(totalCount);
        return this;
    }

    /**
     * <p>
     * A running total of the number of files that the task has successfully processed.
     * </p>
     * 
     * @param succeededCount
     *        A running total of the number of files that the task has successfully processed.
     */

    public void setSucceededCount(Long succeededCount) {
        this.succeededCount = succeededCount;
    }

    /**
     * <p>
     * A running total of the number of files that the task has successfully processed.
     * </p>
     * 
     * @return A running total of the number of files that the task has successfully processed.
     */

    public Long getSucceededCount() {
        return this.succeededCount;
    }

    /**
     * <p>
     * A running total of the number of files that the task has successfully processed.
     * </p>
     * 
     * @param succeededCount
     *        A running total of the number of files that the task has successfully processed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataRepositoryTaskStatus withSucceededCount(Long succeededCount) {
        setSucceededCount(succeededCount);
        return this;
    }

    /**
     * <p>
     * A running total of the number of files that the task failed to process.
     * </p>
     * 
     * @param failedCount
     *        A running total of the number of files that the task failed to process.
     */

    public void setFailedCount(Long failedCount) {
        this.failedCount = failedCount;
    }

    /**
     * <p>
     * A running total of the number of files that the task failed to process.
     * </p>
     * 
     * @return A running total of the number of files that the task failed to process.
     */

    public Long getFailedCount() {
        return this.failedCount;
    }

    /**
     * <p>
     * A running total of the number of files that the task failed to process.
     * </p>
     * 
     * @param failedCount
     *        A running total of the number of files that the task failed to process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataRepositoryTaskStatus withFailedCount(Long failedCount) {
        setFailedCount(failedCount);
        return this;
    }

    /**
     * <p>
     * The time at which the task status was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time at which the task status was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The time at which the task status was last updated.
     * </p>
     * 
     * @return The time at which the task status was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The time at which the task status was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time at which the task status was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataRepositoryTaskStatus withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
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
        if (getTotalCount() != null)
            sb.append("TotalCount: ").append(getTotalCount()).append(",");
        if (getSucceededCount() != null)
            sb.append("SucceededCount: ").append(getSucceededCount()).append(",");
        if (getFailedCount() != null)
            sb.append("FailedCount: ").append(getFailedCount()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataRepositoryTaskStatus == false)
            return false;
        DataRepositoryTaskStatus other = (DataRepositoryTaskStatus) obj;
        if (other.getTotalCount() == null ^ this.getTotalCount() == null)
            return false;
        if (other.getTotalCount() != null && other.getTotalCount().equals(this.getTotalCount()) == false)
            return false;
        if (other.getSucceededCount() == null ^ this.getSucceededCount() == null)
            return false;
        if (other.getSucceededCount() != null && other.getSucceededCount().equals(this.getSucceededCount()) == false)
            return false;
        if (other.getFailedCount() == null ^ this.getFailedCount() == null)
            return false;
        if (other.getFailedCount() != null && other.getFailedCount().equals(this.getFailedCount()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotalCount() == null) ? 0 : getTotalCount().hashCode());
        hashCode = prime * hashCode + ((getSucceededCount() == null) ? 0 : getSucceededCount().hashCode());
        hashCode = prime * hashCode + ((getFailedCount() == null) ? 0 : getFailedCount().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        return hashCode;
    }

    @Override
    public DataRepositoryTaskStatus clone() {
        try {
            return (DataRepositoryTaskStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.DataRepositoryTaskStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
