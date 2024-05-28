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
package com.amazonaws.services.codegurusecurity.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/ListFindingsMetrics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFindingsMetricsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The end date of the interval which you want to retrieve metrics from.
     * </p>
     */
    private java.util.Date endDate;
    /**
     * <p>
     * The maximum number of results to return in the response. Use this parameter when paginating results. If
     * additional results exist beyond the number you specify, the <code>nextToken</code> element is returned in the
     * response. Use <code>nextToken</code> in a subsequent request to retrieve additional results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request. For subsequent calls, use the <code>nextToken</code> value returned from the previous
     * request to continue listing results after the first page.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The start date of the interval which you want to retrieve metrics from.
     * </p>
     */
    private java.util.Date startDate;

    /**
     * <p>
     * The end date of the interval which you want to retrieve metrics from.
     * </p>
     * 
     * @param endDate
     *        The end date of the interval which you want to retrieve metrics from.
     */

    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * The end date of the interval which you want to retrieve metrics from.
     * </p>
     * 
     * @return The end date of the interval which you want to retrieve metrics from.
     */

    public java.util.Date getEndDate() {
        return this.endDate;
    }

    /**
     * <p>
     * The end date of the interval which you want to retrieve metrics from.
     * </p>
     * 
     * @param endDate
     *        The end date of the interval which you want to retrieve metrics from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFindingsMetricsRequest withEndDate(java.util.Date endDate) {
        setEndDate(endDate);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in the response. Use this parameter when paginating results. If
     * additional results exist beyond the number you specify, the <code>nextToken</code> element is returned in the
     * response. Use <code>nextToken</code> in a subsequent request to retrieve additional results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the response. Use this parameter when paginating results. If
     *        additional results exist beyond the number you specify, the <code>nextToken</code> element is returned in
     *        the response. Use <code>nextToken</code> in a subsequent request to retrieve additional results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response. Use this parameter when paginating results. If
     * additional results exist beyond the number you specify, the <code>nextToken</code> element is returned in the
     * response. Use <code>nextToken</code> in a subsequent request to retrieve additional results.
     * </p>
     * 
     * @return The maximum number of results to return in the response. Use this parameter when paginating results. If
     *         additional results exist beyond the number you specify, the <code>nextToken</code> element is returned in
     *         the response. Use <code>nextToken</code> in a subsequent request to retrieve additional results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response. Use this parameter when paginating results. If
     * additional results exist beyond the number you specify, the <code>nextToken</code> element is returned in the
     * response. Use <code>nextToken</code> in a subsequent request to retrieve additional results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the response. Use this parameter when paginating results. If
     *        additional results exist beyond the number you specify, the <code>nextToken</code> element is returned in
     *        the response. Use <code>nextToken</code> in a subsequent request to retrieve additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFindingsMetricsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request. For subsequent calls, use the <code>nextToken</code> value returned from the previous
     * request to continue listing results after the first page.
     * </p>
     * 
     * @param nextToken
     *        A token to use for paginating results that are returned in the response. Set the value of this parameter
     *        to null for the first request. For subsequent calls, use the <code>nextToken</code> value returned from
     *        the previous request to continue listing results after the first page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request. For subsequent calls, use the <code>nextToken</code> value returned from the previous
     * request to continue listing results after the first page.
     * </p>
     * 
     * @return A token to use for paginating results that are returned in the response. Set the value of this parameter
     *         to null for the first request. For subsequent calls, use the <code>nextToken</code> value returned from
     *         the previous request to continue listing results after the first page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request. For subsequent calls, use the <code>nextToken</code> value returned from the previous
     * request to continue listing results after the first page.
     * </p>
     * 
     * @param nextToken
     *        A token to use for paginating results that are returned in the response. Set the value of this parameter
     *        to null for the first request. For subsequent calls, use the <code>nextToken</code> value returned from
     *        the previous request to continue listing results after the first page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFindingsMetricsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The start date of the interval which you want to retrieve metrics from.
     * </p>
     * 
     * @param startDate
     *        The start date of the interval which you want to retrieve metrics from.
     */

    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The start date of the interval which you want to retrieve metrics from.
     * </p>
     * 
     * @return The start date of the interval which you want to retrieve metrics from.
     */

    public java.util.Date getStartDate() {
        return this.startDate;
    }

    /**
     * <p>
     * The start date of the interval which you want to retrieve metrics from.
     * </p>
     * 
     * @param startDate
     *        The start date of the interval which you want to retrieve metrics from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFindingsMetricsRequest withStartDate(java.util.Date startDate) {
        setStartDate(startDate);
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
        if (getEndDate() != null)
            sb.append("EndDate: ").append(getEndDate()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getStartDate() != null)
            sb.append("StartDate: ").append(getStartDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFindingsMetricsRequest == false)
            return false;
        ListFindingsMetricsRequest other = (ListFindingsMetricsRequest) obj;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        return hashCode;
    }

    @Override
    public ListFindingsMetricsRequest clone() {
        return (ListFindingsMetricsRequest) super.clone();
    }

}
