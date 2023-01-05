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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListCampaigns" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCampaignsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A pagination token for the next set of results.
     * </p>
     * <p>
     * If the results of a search are large, only a portion of the results are returned, and a <code>nextToken</code>
     * pagination token is returned in the response. To retrieve the next set of results, reissue the search request and
     * include the returned token. When all results have been returned, the response does not contain a pagination token
     * value.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items to return, between 1 and 100, inclusive.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Optional parameter to filter the results by the status of each created campaign in your account. The status can
     * be one of: <code>CREATING</code>, <code>WAITING_FOR_APPROVAL</code>, <code>RUNNING</code>, or
     * <code>SUSPENDED</code>.
     * </p>
     */
    private String status;

    /**
     * <p>
     * A pagination token for the next set of results.
     * </p>
     * <p>
     * If the results of a search are large, only a portion of the results are returned, and a <code>nextToken</code>
     * pagination token is returned in the response. To retrieve the next set of results, reissue the search request and
     * include the returned token. When all results have been returned, the response does not contain a pagination token
     * value.
     * </p>
     * 
     * @param nextToken
     *        A pagination token for the next set of results.</p>
     *        <p>
     *        If the results of a search are large, only a portion of the results are returned, and a
     *        <code>nextToken</code> pagination token is returned in the response. To retrieve the next set of results,
     *        reissue the search request and include the returned token. When all results have been returned, the
     *        response does not contain a pagination token value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token for the next set of results.
     * </p>
     * <p>
     * If the results of a search are large, only a portion of the results are returned, and a <code>nextToken</code>
     * pagination token is returned in the response. To retrieve the next set of results, reissue the search request and
     * include the returned token. When all results have been returned, the response does not contain a pagination token
     * value.
     * </p>
     * 
     * @return A pagination token for the next set of results.</p>
     *         <p>
     *         If the results of a search are large, only a portion of the results are returned, and a
     *         <code>nextToken</code> pagination token is returned in the response. To retrieve the next set of results,
     *         reissue the search request and include the returned token. When all results have been returned, the
     *         response does not contain a pagination token value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token for the next set of results.
     * </p>
     * <p>
     * If the results of a search are large, only a portion of the results are returned, and a <code>nextToken</code>
     * pagination token is returned in the response. To retrieve the next set of results, reissue the search request and
     * include the returned token. When all results have been returned, the response does not contain a pagination token
     * value.
     * </p>
     * 
     * @param nextToken
     *        A pagination token for the next set of results.</p>
     *        <p>
     *        If the results of a search are large, only a portion of the results are returned, and a
     *        <code>nextToken</code> pagination token is returned in the response. To retrieve the next set of results,
     *        reissue the search request and include the returned token. When all results have been returned, the
     *        response does not contain a pagination token value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCampaignsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return, between 1 and 100, inclusive.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return, between 1 and 100, inclusive.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return, between 1 and 100, inclusive.
     * </p>
     * 
     * @return The maximum number of items to return, between 1 and 100, inclusive.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return, between 1 and 100, inclusive.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return, between 1 and 100, inclusive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCampaignsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Optional parameter to filter the results by the status of each created campaign in your account. The status can
     * be one of: <code>CREATING</code>, <code>WAITING_FOR_APPROVAL</code>, <code>RUNNING</code>, or
     * <code>SUSPENDED</code>.
     * </p>
     * 
     * @param status
     *        Optional parameter to filter the results by the status of each created campaign in your account. The
     *        status can be one of: <code>CREATING</code>, <code>WAITING_FOR_APPROVAL</code>, <code>RUNNING</code>, or
     *        <code>SUSPENDED</code>.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Optional parameter to filter the results by the status of each created campaign in your account. The status can
     * be one of: <code>CREATING</code>, <code>WAITING_FOR_APPROVAL</code>, <code>RUNNING</code>, or
     * <code>SUSPENDED</code>.
     * </p>
     * 
     * @return Optional parameter to filter the results by the status of each created campaign in your account. The
     *         status can be one of: <code>CREATING</code>, <code>WAITING_FOR_APPROVAL</code>, <code>RUNNING</code>, or
     *         <code>SUSPENDED</code>.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Optional parameter to filter the results by the status of each created campaign in your account. The status can
     * be one of: <code>CREATING</code>, <code>WAITING_FOR_APPROVAL</code>, <code>RUNNING</code>, or
     * <code>SUSPENDED</code>.
     * </p>
     * 
     * @param status
     *        Optional parameter to filter the results by the status of each created campaign in your account. The
     *        status can be one of: <code>CREATING</code>, <code>WAITING_FOR_APPROVAL</code>, <code>RUNNING</code>, or
     *        <code>SUSPENDED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCampaignsRequest withStatus(String status) {
        setStatus(status);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListCampaignsRequest == false)
            return false;
        ListCampaignsRequest other = (ListCampaignsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ListCampaignsRequest clone() {
        return (ListCampaignsRequest) super.clone();
    }

}
