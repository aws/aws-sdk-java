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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the count of workflow executions returned from <a>CountOpenWorkflowExecutions</a> or
 * <a>CountClosedWorkflowExecutions</a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/WorkflowExecutionCount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowExecutionCount extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The number of workflow executions.
     * </p>
     */
    private Integer count;
    /**
     * <p>
     * If set to true, indicates that the actual count was more than the maximum supported by this API and the count
     * returned is the truncated value.
     * </p>
     */
    private Boolean truncated;

    /**
     * <p>
     * The number of workflow executions.
     * </p>
     * 
     * @param count
     *        The number of workflow executions.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of workflow executions.
     * </p>
     * 
     * @return The number of workflow executions.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * The number of workflow executions.
     * </p>
     * 
     * @param count
     *        The number of workflow executions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionCount withCount(Integer count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * If set to true, indicates that the actual count was more than the maximum supported by this API and the count
     * returned is the truncated value.
     * </p>
     * 
     * @param truncated
     *        If set to true, indicates that the actual count was more than the maximum supported by this API and the
     *        count returned is the truncated value.
     */

    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    /**
     * <p>
     * If set to true, indicates that the actual count was more than the maximum supported by this API and the count
     * returned is the truncated value.
     * </p>
     * 
     * @return If set to true, indicates that the actual count was more than the maximum supported by this API and the
     *         count returned is the truncated value.
     */

    public Boolean getTruncated() {
        return this.truncated;
    }

    /**
     * <p>
     * If set to true, indicates that the actual count was more than the maximum supported by this API and the count
     * returned is the truncated value.
     * </p>
     * 
     * @param truncated
     *        If set to true, indicates that the actual count was more than the maximum supported by this API and the
     *        count returned is the truncated value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionCount withTruncated(Boolean truncated) {
        setTruncated(truncated);
        return this;
    }

    /**
     * <p>
     * If set to true, indicates that the actual count was more than the maximum supported by this API and the count
     * returned is the truncated value.
     * </p>
     * 
     * @return If set to true, indicates that the actual count was more than the maximum supported by this API and the
     *         count returned is the truncated value.
     */

    public Boolean isTruncated() {
        return this.truncated;
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
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getTruncated() != null)
            sb.append("Truncated: ").append(getTruncated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkflowExecutionCount == false)
            return false;
        WorkflowExecutionCount other = (WorkflowExecutionCount) obj;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getTruncated() == null ^ this.getTruncated() == null)
            return false;
        if (other.getTruncated() != null && other.getTruncated().equals(this.getTruncated()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getTruncated() == null) ? 0 : getTruncated().hashCode());
        return hashCode;
    }

    @Override
    public WorkflowExecutionCount clone() {
        try {
            return (WorkflowExecutionCount) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
