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
package com.amazonaws.services.mediastoredata.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-data-2017-09-01/ListItems" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListItemsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The path in the container from which to retrieve items. Format: &lt;folder name&gt;/&lt;folder name&gt;/&lt;file
     * name&gt;
     * </p>
     */
    private String path;
    /**
     * <p>
     * The maximum number of results to return per API request. For example, you submit a <code>ListItems</code> request
     * with <code>MaxResults</code> set at 500. Although 2,000 items match your request, the service returns no more
     * than the first 500 items. (The service also returns a <code>NextToken</code> value that you can use to fetch the
     * next batch of results.) The service might return fewer results than the <code>MaxResults</code> value.
     * </p>
     * <p>
     * If <code>MaxResults</code> is not included in the request, the service defaults to pagination with a maximum of
     * 1,000 results per page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token that identifies which batch of results that you want to see. For example, you submit a
     * <code>ListItems</code> request with <code>MaxResults</code> set at 500. The service returns the first batch of
     * results (up to 500) and a <code>NextToken</code> value. To see the next batch of results, you can submit the
     * <code>ListItems</code> request a second time and specify the <code>NextToken</code> value.
     * </p>
     * <p>
     * Tokens expire after 15 minutes.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The path in the container from which to retrieve items. Format: &lt;folder name&gt;/&lt;folder name&gt;/&lt;file
     * name&gt;
     * </p>
     * 
     * @param path
     *        The path in the container from which to retrieve items. Format: &lt;folder name&gt;/&lt;folder
     *        name&gt;/&lt;file name&gt;
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path in the container from which to retrieve items. Format: &lt;folder name&gt;/&lt;folder name&gt;/&lt;file
     * name&gt;
     * </p>
     * 
     * @return The path in the container from which to retrieve items. Format: &lt;folder name&gt;/&lt;folder
     *         name&gt;/&lt;file name&gt;
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path in the container from which to retrieve items. Format: &lt;folder name&gt;/&lt;folder name&gt;/&lt;file
     * name&gt;
     * </p>
     * 
     * @param path
     *        The path in the container from which to retrieve items. Format: &lt;folder name&gt;/&lt;folder
     *        name&gt;/&lt;file name&gt;
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListItemsRequest withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per API request. For example, you submit a <code>ListItems</code> request
     * with <code>MaxResults</code> set at 500. Although 2,000 items match your request, the service returns no more
     * than the first 500 items. (The service also returns a <code>NextToken</code> value that you can use to fetch the
     * next batch of results.) The service might return fewer results than the <code>MaxResults</code> value.
     * </p>
     * <p>
     * If <code>MaxResults</code> is not included in the request, the service defaults to pagination with a maximum of
     * 1,000 results per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per API request. For example, you submit a <code>ListItems</code>
     *        request with <code>MaxResults</code> set at 500. Although 2,000 items match your request, the service
     *        returns no more than the first 500 items. (The service also returns a <code>NextToken</code> value that
     *        you can use to fetch the next batch of results.) The service might return fewer results than the
     *        <code>MaxResults</code> value.</p>
     *        <p>
     *        If <code>MaxResults</code> is not included in the request, the service defaults to pagination with a
     *        maximum of 1,000 results per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per API request. For example, you submit a <code>ListItems</code> request
     * with <code>MaxResults</code> set at 500. Although 2,000 items match your request, the service returns no more
     * than the first 500 items. (The service also returns a <code>NextToken</code> value that you can use to fetch the
     * next batch of results.) The service might return fewer results than the <code>MaxResults</code> value.
     * </p>
     * <p>
     * If <code>MaxResults</code> is not included in the request, the service defaults to pagination with a maximum of
     * 1,000 results per page.
     * </p>
     * 
     * @return The maximum number of results to return per API request. For example, you submit a <code>ListItems</code>
     *         request with <code>MaxResults</code> set at 500. Although 2,000 items match your request, the service
     *         returns no more than the first 500 items. (The service also returns a <code>NextToken</code> value that
     *         you can use to fetch the next batch of results.) The service might return fewer results than the
     *         <code>MaxResults</code> value.</p>
     *         <p>
     *         If <code>MaxResults</code> is not included in the request, the service defaults to pagination with a
     *         maximum of 1,000 results per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per API request. For example, you submit a <code>ListItems</code> request
     * with <code>MaxResults</code> set at 500. Although 2,000 items match your request, the service returns no more
     * than the first 500 items. (The service also returns a <code>NextToken</code> value that you can use to fetch the
     * next batch of results.) The service might return fewer results than the <code>MaxResults</code> value.
     * </p>
     * <p>
     * If <code>MaxResults</code> is not included in the request, the service defaults to pagination with a maximum of
     * 1,000 results per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per API request. For example, you submit a <code>ListItems</code>
     *        request with <code>MaxResults</code> set at 500. Although 2,000 items match your request, the service
     *        returns no more than the first 500 items. (The service also returns a <code>NextToken</code> value that
     *        you can use to fetch the next batch of results.) The service might return fewer results than the
     *        <code>MaxResults</code> value.</p>
     *        <p>
     *        If <code>MaxResults</code> is not included in the request, the service defaults to pagination with a
     *        maximum of 1,000 results per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListItemsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token that identifies which batch of results that you want to see. For example, you submit a
     * <code>ListItems</code> request with <code>MaxResults</code> set at 500. The service returns the first batch of
     * results (up to 500) and a <code>NextToken</code> value. To see the next batch of results, you can submit the
     * <code>ListItems</code> request a second time and specify the <code>NextToken</code> value.
     * </p>
     * <p>
     * Tokens expire after 15 minutes.
     * </p>
     * 
     * @param nextToken
     *        The token that identifies which batch of results that you want to see. For example, you submit a
     *        <code>ListItems</code> request with <code>MaxResults</code> set at 500. The service returns the first
     *        batch of results (up to 500) and a <code>NextToken</code> value. To see the next batch of results, you can
     *        submit the <code>ListItems</code> request a second time and specify the <code>NextToken</code> value.</p>
     *        <p>
     *        Tokens expire after 15 minutes.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that identifies which batch of results that you want to see. For example, you submit a
     * <code>ListItems</code> request with <code>MaxResults</code> set at 500. The service returns the first batch of
     * results (up to 500) and a <code>NextToken</code> value. To see the next batch of results, you can submit the
     * <code>ListItems</code> request a second time and specify the <code>NextToken</code> value.
     * </p>
     * <p>
     * Tokens expire after 15 minutes.
     * </p>
     * 
     * @return The token that identifies which batch of results that you want to see. For example, you submit a
     *         <code>ListItems</code> request with <code>MaxResults</code> set at 500. The service returns the first
     *         batch of results (up to 500) and a <code>NextToken</code> value. To see the next batch of results, you
     *         can submit the <code>ListItems</code> request a second time and specify the <code>NextToken</code>
     *         value.</p>
     *         <p>
     *         Tokens expire after 15 minutes.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that identifies which batch of results that you want to see. For example, you submit a
     * <code>ListItems</code> request with <code>MaxResults</code> set at 500. The service returns the first batch of
     * results (up to 500) and a <code>NextToken</code> value. To see the next batch of results, you can submit the
     * <code>ListItems</code> request a second time and specify the <code>NextToken</code> value.
     * </p>
     * <p>
     * Tokens expire after 15 minutes.
     * </p>
     * 
     * @param nextToken
     *        The token that identifies which batch of results that you want to see. For example, you submit a
     *        <code>ListItems</code> request with <code>MaxResults</code> set at 500. The service returns the first
     *        batch of results (up to 500) and a <code>NextToken</code> value. To see the next batch of results, you can
     *        submit the <code>ListItems</code> request a second time and specify the <code>NextToken</code> value.</p>
     *        <p>
     *        Tokens expire after 15 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListItemsRequest withNextToken(String nextToken) {
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
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
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

        if (obj instanceof ListItemsRequest == false)
            return false;
        ListItemsRequest other = (ListItemsRequest) obj;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
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

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListItemsRequest clone() {
        return (ListItemsRequest) super.clone();
    }

}
