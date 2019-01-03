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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListTopicsDetectionJobs" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTopicsDetectionJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Filters the jobs that are returned. Jobs can be filtered on their name, status, or the date and time that they
     * were submitted. You can set only one filter at a time.
     * </p>
     */
    private TopicsDetectionJobFilter filter;
    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return in each page. The default is 100.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * Filters the jobs that are returned. Jobs can be filtered on their name, status, or the date and time that they
     * were submitted. You can set only one filter at a time.
     * </p>
     * 
     * @param filter
     *        Filters the jobs that are returned. Jobs can be filtered on their name, status, or the date and time that
     *        they were submitted. You can set only one filter at a time.
     */

    public void setFilter(TopicsDetectionJobFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * Filters the jobs that are returned. Jobs can be filtered on their name, status, or the date and time that they
     * were submitted. You can set only one filter at a time.
     * </p>
     * 
     * @return Filters the jobs that are returned. Jobs can be filtered on their name, status, or the date and time that
     *         they were submitted. You can set only one filter at a time.
     */

    public TopicsDetectionJobFilter getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * Filters the jobs that are returned. Jobs can be filtered on their name, status, or the date and time that they
     * were submitted. You can set only one filter at a time.
     * </p>
     * 
     * @param filter
     *        Filters the jobs that are returned. Jobs can be filtered on their name, status, or the date and time that
     *        they were submitted. You can set only one filter at a time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTopicsDetectionJobsRequest withFilter(TopicsDetectionJobFilter filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * 
     * @param nextToken
     *        Identifies the next page of results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * 
     * @return Identifies the next page of results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * 
     * @param nextToken
     *        Identifies the next page of results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTopicsDetectionJobsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in each page. The default is 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in each page. The default is 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in each page. The default is 100.
     * </p>
     * 
     * @return The maximum number of results to return in each page. The default is 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in each page. The default is 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in each page. The default is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTopicsDetectionJobsRequest withMaxResults(Integer maxResults) {
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
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
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

        if (obj instanceof ListTopicsDetectionJobsRequest == false)
            return false;
        ListTopicsDetectionJobsRequest other = (ListTopicsDetectionJobsRequest) obj;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
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

        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListTopicsDetectionJobsRequest clone() {
        return (ListTopicsDetectionJobsRequest) super.clone();
    }

}
