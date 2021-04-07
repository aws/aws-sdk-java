/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DescribeJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Request to describe Job log filters.
     * </p>
     */
    private DescribeJobsRequestFilters filters;
    /**
     * <p>
     * Request to describe Job log by max results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Request to describe Job logby next token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Request to describe Job log filters.
     * </p>
     * 
     * @param filters
     *        Request to describe Job log filters.
     */

    public void setFilters(DescribeJobsRequestFilters filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * Request to describe Job log filters.
     * </p>
     * 
     * @return Request to describe Job log filters.
     */

    public DescribeJobsRequestFilters getFilters() {
        return this.filters;
    }

    /**
     * <p>
     * Request to describe Job log filters.
     * </p>
     * 
     * @param filters
     *        Request to describe Job log filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobsRequest withFilters(DescribeJobsRequestFilters filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Request to describe Job log by max results.
     * </p>
     * 
     * @param maxResults
     *        Request to describe Job log by max results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Request to describe Job log by max results.
     * </p>
     * 
     * @return Request to describe Job log by max results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Request to describe Job log by max results.
     * </p>
     * 
     * @param maxResults
     *        Request to describe Job log by max results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Request to describe Job logby next token.
     * </p>
     * 
     * @param nextToken
     *        Request to describe Job logby next token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Request to describe Job logby next token.
     * </p>
     * 
     * @return Request to describe Job logby next token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Request to describe Job logby next token.
     * </p>
     * 
     * @param nextToken
     *        Request to describe Job logby next token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobsRequest withNextToken(String nextToken) {
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof DescribeJobsRequest == false)
            return false;
        DescribeJobsRequest other = (DescribeJobsRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeJobsRequest clone() {
        return (DescribeJobsRequest) super.clone();
    }

}
