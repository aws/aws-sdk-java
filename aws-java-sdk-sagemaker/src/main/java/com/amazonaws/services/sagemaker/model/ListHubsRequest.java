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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListHubs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListHubsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Only list hubs with names that contain the specified string.
     * </p>
     */
    private String nameContains;
    /**
     * <p>
     * Only list hubs that were created before the time specified.
     * </p>
     */
    private java.util.Date creationTimeBefore;
    /**
     * <p>
     * Only list hubs that were created after the time specified.
     * </p>
     */
    private java.util.Date creationTimeAfter;
    /**
     * <p>
     * Only list hubs that were last modified before the time specified.
     * </p>
     */
    private java.util.Date lastModifiedTimeBefore;
    /**
     * <p>
     * Only list hubs that were last modified after the time specified.
     * </p>
     */
    private java.util.Date lastModifiedTimeAfter;
    /**
     * <p>
     * Sort hubs by either name or creation time.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * Sort hubs by ascending or descending order.
     * </p>
     */
    private String sortOrder;
    /**
     * <p>
     * The maximum number of hubs to list.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If the response to a previous <code>ListHubs</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of hubs, use the token in the next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Only list hubs with names that contain the specified string.
     * </p>
     * 
     * @param nameContains
     *        Only list hubs with names that contain the specified string.
     */

    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    /**
     * <p>
     * Only list hubs with names that contain the specified string.
     * </p>
     * 
     * @return Only list hubs with names that contain the specified string.
     */

    public String getNameContains() {
        return this.nameContains;
    }

    /**
     * <p>
     * Only list hubs with names that contain the specified string.
     * </p>
     * 
     * @param nameContains
     *        Only list hubs with names that contain the specified string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHubsRequest withNameContains(String nameContains) {
        setNameContains(nameContains);
        return this;
    }

    /**
     * <p>
     * Only list hubs that were created before the time specified.
     * </p>
     * 
     * @param creationTimeBefore
     *        Only list hubs that were created before the time specified.
     */

    public void setCreationTimeBefore(java.util.Date creationTimeBefore) {
        this.creationTimeBefore = creationTimeBefore;
    }

    /**
     * <p>
     * Only list hubs that were created before the time specified.
     * </p>
     * 
     * @return Only list hubs that were created before the time specified.
     */

    public java.util.Date getCreationTimeBefore() {
        return this.creationTimeBefore;
    }

    /**
     * <p>
     * Only list hubs that were created before the time specified.
     * </p>
     * 
     * @param creationTimeBefore
     *        Only list hubs that were created before the time specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHubsRequest withCreationTimeBefore(java.util.Date creationTimeBefore) {
        setCreationTimeBefore(creationTimeBefore);
        return this;
    }

    /**
     * <p>
     * Only list hubs that were created after the time specified.
     * </p>
     * 
     * @param creationTimeAfter
     *        Only list hubs that were created after the time specified.
     */

    public void setCreationTimeAfter(java.util.Date creationTimeAfter) {
        this.creationTimeAfter = creationTimeAfter;
    }

    /**
     * <p>
     * Only list hubs that were created after the time specified.
     * </p>
     * 
     * @return Only list hubs that were created after the time specified.
     */

    public java.util.Date getCreationTimeAfter() {
        return this.creationTimeAfter;
    }

    /**
     * <p>
     * Only list hubs that were created after the time specified.
     * </p>
     * 
     * @param creationTimeAfter
     *        Only list hubs that were created after the time specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHubsRequest withCreationTimeAfter(java.util.Date creationTimeAfter) {
        setCreationTimeAfter(creationTimeAfter);
        return this;
    }

    /**
     * <p>
     * Only list hubs that were last modified before the time specified.
     * </p>
     * 
     * @param lastModifiedTimeBefore
     *        Only list hubs that were last modified before the time specified.
     */

    public void setLastModifiedTimeBefore(java.util.Date lastModifiedTimeBefore) {
        this.lastModifiedTimeBefore = lastModifiedTimeBefore;
    }

    /**
     * <p>
     * Only list hubs that were last modified before the time specified.
     * </p>
     * 
     * @return Only list hubs that were last modified before the time specified.
     */

    public java.util.Date getLastModifiedTimeBefore() {
        return this.lastModifiedTimeBefore;
    }

    /**
     * <p>
     * Only list hubs that were last modified before the time specified.
     * </p>
     * 
     * @param lastModifiedTimeBefore
     *        Only list hubs that were last modified before the time specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHubsRequest withLastModifiedTimeBefore(java.util.Date lastModifiedTimeBefore) {
        setLastModifiedTimeBefore(lastModifiedTimeBefore);
        return this;
    }

    /**
     * <p>
     * Only list hubs that were last modified after the time specified.
     * </p>
     * 
     * @param lastModifiedTimeAfter
     *        Only list hubs that were last modified after the time specified.
     */

    public void setLastModifiedTimeAfter(java.util.Date lastModifiedTimeAfter) {
        this.lastModifiedTimeAfter = lastModifiedTimeAfter;
    }

    /**
     * <p>
     * Only list hubs that were last modified after the time specified.
     * </p>
     * 
     * @return Only list hubs that were last modified after the time specified.
     */

    public java.util.Date getLastModifiedTimeAfter() {
        return this.lastModifiedTimeAfter;
    }

    /**
     * <p>
     * Only list hubs that were last modified after the time specified.
     * </p>
     * 
     * @param lastModifiedTimeAfter
     *        Only list hubs that were last modified after the time specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHubsRequest withLastModifiedTimeAfter(java.util.Date lastModifiedTimeAfter) {
        setLastModifiedTimeAfter(lastModifiedTimeAfter);
        return this;
    }

    /**
     * <p>
     * Sort hubs by either name or creation time.
     * </p>
     * 
     * @param sortBy
     *        Sort hubs by either name or creation time.
     * @see HubSortBy
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * Sort hubs by either name or creation time.
     * </p>
     * 
     * @return Sort hubs by either name or creation time.
     * @see HubSortBy
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * Sort hubs by either name or creation time.
     * </p>
     * 
     * @param sortBy
     *        Sort hubs by either name or creation time.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HubSortBy
     */

    public ListHubsRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * Sort hubs by either name or creation time.
     * </p>
     * 
     * @param sortBy
     *        Sort hubs by either name or creation time.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HubSortBy
     */

    public ListHubsRequest withSortBy(HubSortBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * Sort hubs by ascending or descending order.
     * </p>
     * 
     * @param sortOrder
     *        Sort hubs by ascending or descending order.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * Sort hubs by ascending or descending order.
     * </p>
     * 
     * @return Sort hubs by ascending or descending order.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * Sort hubs by ascending or descending order.
     * </p>
     * 
     * @param sortOrder
     *        Sort hubs by ascending or descending order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListHubsRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * Sort hubs by ascending or descending order.
     * </p>
     * 
     * @param sortOrder
     *        Sort hubs by ascending or descending order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListHubsRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of hubs to list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of hubs to list.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of hubs to list.
     * </p>
     * 
     * @return The maximum number of hubs to list.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of hubs to list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of hubs to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHubsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If the response to a previous <code>ListHubs</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of hubs, use the token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the response to a previous <code>ListHubs</code> request was truncated, the response includes a
     *        <code>NextToken</code>. To retrieve the next set of hubs, use the token in the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response to a previous <code>ListHubs</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of hubs, use the token in the next request.
     * </p>
     * 
     * @return If the response to a previous <code>ListHubs</code> request was truncated, the response includes a
     *         <code>NextToken</code>. To retrieve the next set of hubs, use the token in the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response to a previous <code>ListHubs</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of hubs, use the token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the response to a previous <code>ListHubs</code> request was truncated, the response includes a
     *        <code>NextToken</code>. To retrieve the next set of hubs, use the token in the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHubsRequest withNextToken(String nextToken) {
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
        if (getNameContains() != null)
            sb.append("NameContains: ").append(getNameContains()).append(",");
        if (getCreationTimeBefore() != null)
            sb.append("CreationTimeBefore: ").append(getCreationTimeBefore()).append(",");
        if (getCreationTimeAfter() != null)
            sb.append("CreationTimeAfter: ").append(getCreationTimeAfter()).append(",");
        if (getLastModifiedTimeBefore() != null)
            sb.append("LastModifiedTimeBefore: ").append(getLastModifiedTimeBefore()).append(",");
        if (getLastModifiedTimeAfter() != null)
            sb.append("LastModifiedTimeAfter: ").append(getLastModifiedTimeAfter()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder()).append(",");
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

        if (obj instanceof ListHubsRequest == false)
            return false;
        ListHubsRequest other = (ListHubsRequest) obj;
        if (other.getNameContains() == null ^ this.getNameContains() == null)
            return false;
        if (other.getNameContains() != null && other.getNameContains().equals(this.getNameContains()) == false)
            return false;
        if (other.getCreationTimeBefore() == null ^ this.getCreationTimeBefore() == null)
            return false;
        if (other.getCreationTimeBefore() != null && other.getCreationTimeBefore().equals(this.getCreationTimeBefore()) == false)
            return false;
        if (other.getCreationTimeAfter() == null ^ this.getCreationTimeAfter() == null)
            return false;
        if (other.getCreationTimeAfter() != null && other.getCreationTimeAfter().equals(this.getCreationTimeAfter()) == false)
            return false;
        if (other.getLastModifiedTimeBefore() == null ^ this.getLastModifiedTimeBefore() == null)
            return false;
        if (other.getLastModifiedTimeBefore() != null && other.getLastModifiedTimeBefore().equals(this.getLastModifiedTimeBefore()) == false)
            return false;
        if (other.getLastModifiedTimeAfter() == null ^ this.getLastModifiedTimeAfter() == null)
            return false;
        if (other.getLastModifiedTimeAfter() != null && other.getLastModifiedTimeAfter().equals(this.getLastModifiedTimeAfter()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
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

        hashCode = prime * hashCode + ((getNameContains() == null) ? 0 : getNameContains().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeBefore() == null) ? 0 : getCreationTimeBefore().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeAfter() == null) ? 0 : getCreationTimeAfter().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTimeBefore() == null) ? 0 : getLastModifiedTimeBefore().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTimeAfter() == null) ? 0 : getLastModifiedTimeAfter().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListHubsRequest clone() {
        return (ListHubsRequest) super.clone();
    }

}
