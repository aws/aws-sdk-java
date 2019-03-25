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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/ListJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** Optional. Number of jobs, up to twenty, that will be returned at one time. */
    private Integer maxResults;
    /** Use this string, provided with the response to a previous request, to request the next batch of jobs. */
    private String nextToken;
    /**
     * When you request lists of resources, you can optionally specify whether they are sorted in ASCENDING or
     * DESCENDING order. Default varies by resource.
     */
    private String order;
    /** Provide a queue name to get back only jobs from that queue. */
    private String queue;
    /** A job's status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED, or ERROR. */
    private String status;

    /**
     * Optional. Number of jobs, up to twenty, that will be returned at one time.
     * 
     * @param maxResults
     *        Optional. Number of jobs, up to twenty, that will be returned at one time.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * Optional. Number of jobs, up to twenty, that will be returned at one time.
     * 
     * @return Optional. Number of jobs, up to twenty, that will be returned at one time.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * Optional. Number of jobs, up to twenty, that will be returned at one time.
     * 
     * @param maxResults
     *        Optional. Number of jobs, up to twenty, that will be returned at one time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * Use this string, provided with the response to a previous request, to request the next batch of jobs.
     * 
     * @param nextToken
     *        Use this string, provided with the response to a previous request, to request the next batch of jobs.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * Use this string, provided with the response to a previous request, to request the next batch of jobs.
     * 
     * @return Use this string, provided with the response to a previous request, to request the next batch of jobs.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * Use this string, provided with the response to a previous request, to request the next batch of jobs.
     * 
     * @param nextToken
     *        Use this string, provided with the response to a previous request, to request the next batch of jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * When you request lists of resources, you can optionally specify whether they are sorted in ASCENDING or
     * DESCENDING order. Default varies by resource.
     * 
     * @param order
     *        When you request lists of resources, you can optionally specify whether they are sorted in ASCENDING or
     *        DESCENDING order. Default varies by resource.
     * @see Order
     */

    public void setOrder(String order) {
        this.order = order;
    }

    /**
     * When you request lists of resources, you can optionally specify whether they are sorted in ASCENDING or
     * DESCENDING order. Default varies by resource.
     * 
     * @return When you request lists of resources, you can optionally specify whether they are sorted in ASCENDING or
     *         DESCENDING order. Default varies by resource.
     * @see Order
     */

    public String getOrder() {
        return this.order;
    }

    /**
     * When you request lists of resources, you can optionally specify whether they are sorted in ASCENDING or
     * DESCENDING order. Default varies by resource.
     * 
     * @param order
     *        When you request lists of resources, you can optionally specify whether they are sorted in ASCENDING or
     *        DESCENDING order. Default varies by resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Order
     */

    public ListJobsRequest withOrder(String order) {
        setOrder(order);
        return this;
    }

    /**
     * When you request lists of resources, you can optionally specify whether they are sorted in ASCENDING or
     * DESCENDING order. Default varies by resource.
     * 
     * @param order
     *        When you request lists of resources, you can optionally specify whether they are sorted in ASCENDING or
     *        DESCENDING order. Default varies by resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Order
     */

    public ListJobsRequest withOrder(Order order) {
        this.order = order.toString();
        return this;
    }

    /**
     * Provide a queue name to get back only jobs from that queue.
     * 
     * @param queue
     *        Provide a queue name to get back only jobs from that queue.
     */

    public void setQueue(String queue) {
        this.queue = queue;
    }

    /**
     * Provide a queue name to get back only jobs from that queue.
     * 
     * @return Provide a queue name to get back only jobs from that queue.
     */

    public String getQueue() {
        return this.queue;
    }

    /**
     * Provide a queue name to get back only jobs from that queue.
     * 
     * @param queue
     *        Provide a queue name to get back only jobs from that queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsRequest withQueue(String queue) {
        setQueue(queue);
        return this;
    }

    /**
     * A job's status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED, or ERROR.
     * 
     * @param status
     *        A job's status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED, or ERROR.
     * @see JobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * A job's status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED, or ERROR.
     * 
     * @return A job's status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED, or ERROR.
     * @see JobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * A job's status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED, or ERROR.
     * 
     * @param status
     *        A job's status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED, or ERROR.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public ListJobsRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * A job's status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED, or ERROR.
     * 
     * @param status
     *        A job's status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED, or ERROR.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public ListJobsRequest withStatus(JobStatus status) {
        this.status = status.toString();
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getOrder() != null)
            sb.append("Order: ").append(getOrder()).append(",");
        if (getQueue() != null)
            sb.append("Queue: ").append(getQueue()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListJobsRequest == false)
            return false;
        ListJobsRequest other = (ListJobsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getOrder() == null ^ this.getOrder() == null)
            return false;
        if (other.getOrder() != null && other.getOrder().equals(this.getOrder()) == false)
            return false;
        if (other.getQueue() == null ^ this.getQueue() == null)
            return false;
        if (other.getQueue() != null && other.getQueue().equals(this.getQueue()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getOrder() == null) ? 0 : getOrder().hashCode());
        hashCode = prime * hashCode + ((getQueue() == null) ? 0 : getQueue().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ListJobsRequest clone() {
        return (ListJobsRequest) super.clone();
    }

}
