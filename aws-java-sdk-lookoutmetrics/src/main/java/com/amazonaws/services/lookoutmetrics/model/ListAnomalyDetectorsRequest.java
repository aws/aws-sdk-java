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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ListAnomalyDetectors"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAnomalyDetectorsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If the result of the previous request was truncated, the response includes a <code>NextToken</code>. To retrieve
     * the next set of results, use the token in the next request. Tokens expire after 24 hours.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @return The maximum number of results to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnomalyDetectorsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If the result of the previous request was truncated, the response includes a <code>NextToken</code>. To retrieve
     * the next set of results, use the token in the next request. Tokens expire after 24 hours.
     * </p>
     * 
     * @param nextToken
     *        If the result of the previous request was truncated, the response includes a <code>NextToken</code>. To
     *        retrieve the next set of results, use the token in the next request. Tokens expire after 24 hours.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the result of the previous request was truncated, the response includes a <code>NextToken</code>. To retrieve
     * the next set of results, use the token in the next request. Tokens expire after 24 hours.
     * </p>
     * 
     * @return If the result of the previous request was truncated, the response includes a <code>NextToken</code>. To
     *         retrieve the next set of results, use the token in the next request. Tokens expire after 24 hours.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the result of the previous request was truncated, the response includes a <code>NextToken</code>. To retrieve
     * the next set of results, use the token in the next request. Tokens expire after 24 hours.
     * </p>
     * 
     * @param nextToken
     *        If the result of the previous request was truncated, the response includes a <code>NextToken</code>. To
     *        retrieve the next set of results, use the token in the next request. Tokens expire after 24 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnomalyDetectorsRequest withNextToken(String nextToken) {
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

        if (obj instanceof ListAnomalyDetectorsRequest == false)
            return false;
        ListAnomalyDetectorsRequest other = (ListAnomalyDetectorsRequest) obj;
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

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAnomalyDetectorsRequest clone() {
        return (ListAnomalyDetectorsRequest) super.clone();
    }

}
