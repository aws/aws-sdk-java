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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the <a>DescribeJobFlows</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/DescribeJobFlows" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeJobFlowsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Return only job flows created after this date and time.
     * </p>
     */
    private java.util.Date createdAfter;
    /**
     * <p>
     * Return only job flows created before this date and time.
     * </p>
     */
    private java.util.Date createdBefore;
    /**
     * <p>
     * Return only job flows whose job flow ID is contained in this list.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> jobFlowIds;
    /**
     * <p>
     * Return only job flows whose state is contained in this list.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> jobFlowStates;

    /**
     * Default constructor for DescribeJobFlowsRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public DescribeJobFlowsRequest() {
    }

    /**
     * Constructs a new DescribeJobFlowsRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     * 
     * @param jobFlowIds
     *        Return only job flows whose job flow ID is contained in this list.
     */
    public DescribeJobFlowsRequest(java.util.List<String> jobFlowIds) {
        setJobFlowIds(jobFlowIds);
    }

    /**
     * <p>
     * Return only job flows created after this date and time.
     * </p>
     * 
     * @param createdAfter
     *        Return only job flows created after this date and time.
     */

    public void setCreatedAfter(java.util.Date createdAfter) {
        this.createdAfter = createdAfter;
    }

    /**
     * <p>
     * Return only job flows created after this date and time.
     * </p>
     * 
     * @return Return only job flows created after this date and time.
     */

    public java.util.Date getCreatedAfter() {
        return this.createdAfter;
    }

    /**
     * <p>
     * Return only job flows created after this date and time.
     * </p>
     * 
     * @param createdAfter
     *        Return only job flows created after this date and time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobFlowsRequest withCreatedAfter(java.util.Date createdAfter) {
        setCreatedAfter(createdAfter);
        return this;
    }

    /**
     * <p>
     * Return only job flows created before this date and time.
     * </p>
     * 
     * @param createdBefore
     *        Return only job flows created before this date and time.
     */

    public void setCreatedBefore(java.util.Date createdBefore) {
        this.createdBefore = createdBefore;
    }

    /**
     * <p>
     * Return only job flows created before this date and time.
     * </p>
     * 
     * @return Return only job flows created before this date and time.
     */

    public java.util.Date getCreatedBefore() {
        return this.createdBefore;
    }

    /**
     * <p>
     * Return only job flows created before this date and time.
     * </p>
     * 
     * @param createdBefore
     *        Return only job flows created before this date and time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobFlowsRequest withCreatedBefore(java.util.Date createdBefore) {
        setCreatedBefore(createdBefore);
        return this;
    }

    /**
     * <p>
     * Return only job flows whose job flow ID is contained in this list.
     * </p>
     * 
     * @return Return only job flows whose job flow ID is contained in this list.
     */

    public java.util.List<String> getJobFlowIds() {
        if (jobFlowIds == null) {
            jobFlowIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return jobFlowIds;
    }

    /**
     * <p>
     * Return only job flows whose job flow ID is contained in this list.
     * </p>
     * 
     * @param jobFlowIds
     *        Return only job flows whose job flow ID is contained in this list.
     */

    public void setJobFlowIds(java.util.Collection<String> jobFlowIds) {
        if (jobFlowIds == null) {
            this.jobFlowIds = null;
            return;
        }

        this.jobFlowIds = new com.amazonaws.internal.SdkInternalList<String>(jobFlowIds);
    }

    /**
     * <p>
     * Return only job flows whose job flow ID is contained in this list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobFlowIds(java.util.Collection)} or {@link #withJobFlowIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param jobFlowIds
     *        Return only job flows whose job flow ID is contained in this list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobFlowsRequest withJobFlowIds(String... jobFlowIds) {
        if (this.jobFlowIds == null) {
            setJobFlowIds(new com.amazonaws.internal.SdkInternalList<String>(jobFlowIds.length));
        }
        for (String ele : jobFlowIds) {
            this.jobFlowIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Return only job flows whose job flow ID is contained in this list.
     * </p>
     * 
     * @param jobFlowIds
     *        Return only job flows whose job flow ID is contained in this list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobFlowsRequest withJobFlowIds(java.util.Collection<String> jobFlowIds) {
        setJobFlowIds(jobFlowIds);
        return this;
    }

    /**
     * <p>
     * Return only job flows whose state is contained in this list.
     * </p>
     * 
     * @return Return only job flows whose state is contained in this list.
     * @see JobFlowExecutionState
     */

    public java.util.List<String> getJobFlowStates() {
        if (jobFlowStates == null) {
            jobFlowStates = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return jobFlowStates;
    }

    /**
     * <p>
     * Return only job flows whose state is contained in this list.
     * </p>
     * 
     * @param jobFlowStates
     *        Return only job flows whose state is contained in this list.
     * @see JobFlowExecutionState
     */

    public void setJobFlowStates(java.util.Collection<String> jobFlowStates) {
        if (jobFlowStates == null) {
            this.jobFlowStates = null;
            return;
        }

        this.jobFlowStates = new com.amazonaws.internal.SdkInternalList<String>(jobFlowStates);
    }

    /**
     * <p>
     * Return only job flows whose state is contained in this list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobFlowStates(java.util.Collection)} or {@link #withJobFlowStates(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param jobFlowStates
     *        Return only job flows whose state is contained in this list.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobFlowExecutionState
     */

    public DescribeJobFlowsRequest withJobFlowStates(String... jobFlowStates) {
        if (this.jobFlowStates == null) {
            setJobFlowStates(new com.amazonaws.internal.SdkInternalList<String>(jobFlowStates.length));
        }
        for (String ele : jobFlowStates) {
            this.jobFlowStates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Return only job flows whose state is contained in this list.
     * </p>
     * 
     * @param jobFlowStates
     *        Return only job flows whose state is contained in this list.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobFlowExecutionState
     */

    public DescribeJobFlowsRequest withJobFlowStates(java.util.Collection<String> jobFlowStates) {
        setJobFlowStates(jobFlowStates);
        return this;
    }

    /**
     * <p>
     * Return only job flows whose state is contained in this list.
     * </p>
     * 
     * @param jobFlowStates
     *        Return only job flows whose state is contained in this list.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobFlowExecutionState
     */

    public DescribeJobFlowsRequest withJobFlowStates(JobFlowExecutionState... jobFlowStates) {
        com.amazonaws.internal.SdkInternalList<String> jobFlowStatesCopy = new com.amazonaws.internal.SdkInternalList<String>(jobFlowStates.length);
        for (JobFlowExecutionState value : jobFlowStates) {
            jobFlowStatesCopy.add(value.toString());
        }
        if (getJobFlowStates() == null) {
            setJobFlowStates(jobFlowStatesCopy);
        } else {
            getJobFlowStates().addAll(jobFlowStatesCopy);
        }
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
        if (getCreatedAfter() != null)
            sb.append("CreatedAfter: ").append(getCreatedAfter()).append(",");
        if (getCreatedBefore() != null)
            sb.append("CreatedBefore: ").append(getCreatedBefore()).append(",");
        if (getJobFlowIds() != null)
            sb.append("JobFlowIds: ").append(getJobFlowIds()).append(",");
        if (getJobFlowStates() != null)
            sb.append("JobFlowStates: ").append(getJobFlowStates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeJobFlowsRequest == false)
            return false;
        DescribeJobFlowsRequest other = (DescribeJobFlowsRequest) obj;
        if (other.getCreatedAfter() == null ^ this.getCreatedAfter() == null)
            return false;
        if (other.getCreatedAfter() != null && other.getCreatedAfter().equals(this.getCreatedAfter()) == false)
            return false;
        if (other.getCreatedBefore() == null ^ this.getCreatedBefore() == null)
            return false;
        if (other.getCreatedBefore() != null && other.getCreatedBefore().equals(this.getCreatedBefore()) == false)
            return false;
        if (other.getJobFlowIds() == null ^ this.getJobFlowIds() == null)
            return false;
        if (other.getJobFlowIds() != null && other.getJobFlowIds().equals(this.getJobFlowIds()) == false)
            return false;
        if (other.getJobFlowStates() == null ^ this.getJobFlowStates() == null)
            return false;
        if (other.getJobFlowStates() != null && other.getJobFlowStates().equals(this.getJobFlowStates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAfter() == null) ? 0 : getCreatedAfter().hashCode());
        hashCode = prime * hashCode + ((getCreatedBefore() == null) ? 0 : getCreatedBefore().hashCode());
        hashCode = prime * hashCode + ((getJobFlowIds() == null) ? 0 : getJobFlowIds().hashCode());
        hashCode = prime * hashCode + ((getJobFlowStates() == null) ? 0 : getJobFlowStates().hashCode());
        return hashCode;
    }

    @Override
    public DescribeJobFlowsRequest clone() {
        return (DescribeJobFlowsRequest) super.clone();
    }

}
