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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/DescribeJobQueues" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeJobQueuesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of job queues.
     * </p>
     */
    private java.util.List<JobQueueDetail> jobQueues;
    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>DescribeJobQueues</code> request. When the results
     * of a <code>DescribeJobQueues</code> request exceed <code>maxResults</code>, this value can be used to retrieve
     * the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of job queues.
     * </p>
     * 
     * @return The list of job queues.
     */

    public java.util.List<JobQueueDetail> getJobQueues() {
        return jobQueues;
    }

    /**
     * <p>
     * The list of job queues.
     * </p>
     * 
     * @param jobQueues
     *        The list of job queues.
     */

    public void setJobQueues(java.util.Collection<JobQueueDetail> jobQueues) {
        if (jobQueues == null) {
            this.jobQueues = null;
            return;
        }

        this.jobQueues = new java.util.ArrayList<JobQueueDetail>(jobQueues);
    }

    /**
     * <p>
     * The list of job queues.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobQueues(java.util.Collection)} or {@link #withJobQueues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param jobQueues
     *        The list of job queues.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobQueuesResult withJobQueues(JobQueueDetail... jobQueues) {
        if (this.jobQueues == null) {
            setJobQueues(new java.util.ArrayList<JobQueueDetail>(jobQueues.length));
        }
        for (JobQueueDetail ele : jobQueues) {
            this.jobQueues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of job queues.
     * </p>
     * 
     * @param jobQueues
     *        The list of job queues.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobQueuesResult withJobQueues(java.util.Collection<JobQueueDetail> jobQueues) {
        setJobQueues(jobQueues);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>DescribeJobQueues</code> request. When the results
     * of a <code>DescribeJobQueues</code> request exceed <code>maxResults</code>, this value can be used to retrieve
     * the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>DescribeJobQueues</code> request. When the
     *        results of a <code>DescribeJobQueues</code> request exceed <code>maxResults</code>, this value can be used
     *        to retrieve the next page of results. This value is <code>null</code> when there are no more results to
     *        return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>DescribeJobQueues</code> request. When the results
     * of a <code>DescribeJobQueues</code> request exceed <code>maxResults</code>, this value can be used to retrieve
     * the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @return The <code>nextToken</code> value to include in a future <code>DescribeJobQueues</code> request. When the
     *         results of a <code>DescribeJobQueues</code> request exceed <code>maxResults</code>, this value can be
     *         used to retrieve the next page of results. This value is <code>null</code> when there are no more results
     *         to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>DescribeJobQueues</code> request. When the results
     * of a <code>DescribeJobQueues</code> request exceed <code>maxResults</code>, this value can be used to retrieve
     * the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>DescribeJobQueues</code> request. When the
     *        results of a <code>DescribeJobQueues</code> request exceed <code>maxResults</code>, this value can be used
     *        to retrieve the next page of results. This value is <code>null</code> when there are no more results to
     *        return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobQueuesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getJobQueues() != null)
            sb.append("JobQueues: ").append(getJobQueues()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeJobQueuesResult == false)
            return false;
        DescribeJobQueuesResult other = (DescribeJobQueuesResult) obj;
        if (other.getJobQueues() == null ^ this.getJobQueues() == null)
            return false;
        if (other.getJobQueues() != null && other.getJobQueues().equals(this.getJobQueues()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobQueues() == null) ? 0 : getJobQueues().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeJobQueuesResult clone() {
        try {
            return (DescribeJobQueuesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
