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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListOpsItemRelatedItems" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListOpsItemRelatedItemsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the OpsItem for which you want to list all related-item resources.
     * </p>
     */
    private String opsItemId;
    /**
     * <p>
     * One or more OpsItem filters. Use a filter to return a more specific list of results.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<OpsItemRelatedItemsFilter> filters;
    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the OpsItem for which you want to list all related-item resources.
     * </p>
     * 
     * @param opsItemId
     *        The ID of the OpsItem for which you want to list all related-item resources.
     */

    public void setOpsItemId(String opsItemId) {
        this.opsItemId = opsItemId;
    }

    /**
     * <p>
     * The ID of the OpsItem for which you want to list all related-item resources.
     * </p>
     * 
     * @return The ID of the OpsItem for which you want to list all related-item resources.
     */

    public String getOpsItemId() {
        return this.opsItemId;
    }

    /**
     * <p>
     * The ID of the OpsItem for which you want to list all related-item resources.
     * </p>
     * 
     * @param opsItemId
     *        The ID of the OpsItem for which you want to list all related-item resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOpsItemRelatedItemsRequest withOpsItemId(String opsItemId) {
        setOpsItemId(opsItemId);
        return this;
    }

    /**
     * <p>
     * One or more OpsItem filters. Use a filter to return a more specific list of results.
     * </p>
     * 
     * @return One or more OpsItem filters. Use a filter to return a more specific list of results.
     */

    public java.util.List<OpsItemRelatedItemsFilter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<OpsItemRelatedItemsFilter>();
        }
        return filters;
    }

    /**
     * <p>
     * One or more OpsItem filters. Use a filter to return a more specific list of results.
     * </p>
     * 
     * @param filters
     *        One or more OpsItem filters. Use a filter to return a more specific list of results.
     */

    public void setFilters(java.util.Collection<OpsItemRelatedItemsFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<OpsItemRelatedItemsFilter>(filters);
    }

    /**
     * <p>
     * One or more OpsItem filters. Use a filter to return a more specific list of results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        One or more OpsItem filters. Use a filter to return a more specific list of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOpsItemRelatedItemsRequest withFilters(OpsItemRelatedItemsFilter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<OpsItemRelatedItemsFilter>(filters.length));
        }
        for (OpsItemRelatedItemsFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more OpsItem filters. Use a filter to return a more specific list of results.
     * </p>
     * 
     * @param filters
     *        One or more OpsItem filters. Use a filter to return a more specific list of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOpsItemRelatedItemsRequest withFilters(java.util.Collection<OpsItemRelatedItemsFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also returns a token that you can specify in
     *        a subsequent call to get the next set of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @return The maximum number of items to return for this call. The call also returns a token that you can specify
     *         in a subsequent call to get the next set of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also returns a token that you can specify in
     *        a subsequent call to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOpsItemRelatedItemsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this token from a previous call.)
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @return The token for the next set of items to return. (You received this token from a previous call.)
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this token from a previous call.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOpsItemRelatedItemsRequest withNextToken(String nextToken) {
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
        if (getOpsItemId() != null)
            sb.append("OpsItemId: ").append(getOpsItemId()).append(",");
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

        if (obj instanceof ListOpsItemRelatedItemsRequest == false)
            return false;
        ListOpsItemRelatedItemsRequest other = (ListOpsItemRelatedItemsRequest) obj;
        if (other.getOpsItemId() == null ^ this.getOpsItemId() == null)
            return false;
        if (other.getOpsItemId() != null && other.getOpsItemId().equals(this.getOpsItemId()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getOpsItemId() == null) ? 0 : getOpsItemId().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListOpsItemRelatedItemsRequest clone() {
        return (ListOpsItemRelatedItemsRequest) super.clone();
    }

}
