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
package com.amazonaws.services.ssmcontacts.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListPageReceipts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPageReceiptsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the engagement to a specific contact channel.
     * </p>
     */
    private String pageId;
    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of acknowledgements per page of results.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the engagement to a specific contact channel.
     * </p>
     * 
     * @param pageId
     *        The Amazon Resource Name (ARN) of the engagement to a specific contact channel.
     */

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the engagement to a specific contact channel.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the engagement to a specific contact channel.
     */

    public String getPageId() {
        return this.pageId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the engagement to a specific contact channel.
     * </p>
     * 
     * @param pageId
     *        The Amazon Resource Name (ARN) of the engagement to a specific contact channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPageReceiptsRequest withPageId(String pageId) {
        setPageId(pageId);
        return this;
    }

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to continue to the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     * 
     * @return The pagination token to continue to the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to continue to the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPageReceiptsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of acknowledgements per page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of acknowledgements per page of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of acknowledgements per page of results.
     * </p>
     * 
     * @return The maximum number of acknowledgements per page of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of acknowledgements per page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of acknowledgements per page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPageReceiptsRequest withMaxResults(Integer maxResults) {
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
        if (getPageId() != null)
            sb.append("PageId: ").append(getPageId()).append(",");
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

        if (obj instanceof ListPageReceiptsRequest == false)
            return false;
        ListPageReceiptsRequest other = (ListPageReceiptsRequest) obj;
        if (other.getPageId() == null ^ this.getPageId() == null)
            return false;
        if (other.getPageId() != null && other.getPageId().equals(this.getPageId()) == false)
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

        hashCode = prime * hashCode + ((getPageId() == null) ? 0 : getPageId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListPageReceiptsRequest clone() {
        return (ListPageReceiptsRequest) super.clone();
    }

}
