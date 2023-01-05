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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListHubContents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListHubContentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the hub to list the contents of.
     * </p>
     */
    private String hubName;
    /**
     * <p>
     * The type of hub content to list.
     * </p>
     */
    private String hubContentType;
    /**
     * <p>
     * Only list hub content if the name contains the specified string.
     * </p>
     */
    private String nameContains;
    /**
     * <p>
     * The upper bound of the hub content schema verion.
     * </p>
     */
    private String maxSchemaVersion;
    /**
     * <p>
     * Only list hub content that was created before the time specified.
     * </p>
     */
    private java.util.Date creationTimeBefore;
    /**
     * <p>
     * Only list hub content that was created after the time specified.
     * </p>
     */
    private java.util.Date creationTimeAfter;
    /**
     * <p>
     * Sort hub content versions by either name or creation time.
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
     * The maximum amount of hub content to list.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If the response to a previous <code>ListHubContents</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of hub content, use the token in the next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the hub to list the contents of.
     * </p>
     * 
     * @param hubName
     *        The name of the hub to list the contents of.
     */

    public void setHubName(String hubName) {
        this.hubName = hubName;
    }

    /**
     * <p>
     * The name of the hub to list the contents of.
     * </p>
     * 
     * @return The name of the hub to list the contents of.
     */

    public String getHubName() {
        return this.hubName;
    }

    /**
     * <p>
     * The name of the hub to list the contents of.
     * </p>
     * 
     * @param hubName
     *        The name of the hub to list the contents of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHubContentsRequest withHubName(String hubName) {
        setHubName(hubName);
        return this;
    }

    /**
     * <p>
     * The type of hub content to list.
     * </p>
     * 
     * @param hubContentType
     *        The type of hub content to list.
     * @see HubContentType
     */

    public void setHubContentType(String hubContentType) {
        this.hubContentType = hubContentType;
    }

    /**
     * <p>
     * The type of hub content to list.
     * </p>
     * 
     * @return The type of hub content to list.
     * @see HubContentType
     */

    public String getHubContentType() {
        return this.hubContentType;
    }

    /**
     * <p>
     * The type of hub content to list.
     * </p>
     * 
     * @param hubContentType
     *        The type of hub content to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HubContentType
     */

    public ListHubContentsRequest withHubContentType(String hubContentType) {
        setHubContentType(hubContentType);
        return this;
    }

    /**
     * <p>
     * The type of hub content to list.
     * </p>
     * 
     * @param hubContentType
     *        The type of hub content to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HubContentType
     */

    public ListHubContentsRequest withHubContentType(HubContentType hubContentType) {
        this.hubContentType = hubContentType.toString();
        return this;
    }

    /**
     * <p>
     * Only list hub content if the name contains the specified string.
     * </p>
     * 
     * @param nameContains
     *        Only list hub content if the name contains the specified string.
     */

    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    /**
     * <p>
     * Only list hub content if the name contains the specified string.
     * </p>
     * 
     * @return Only list hub content if the name contains the specified string.
     */

    public String getNameContains() {
        return this.nameContains;
    }

    /**
     * <p>
     * Only list hub content if the name contains the specified string.
     * </p>
     * 
     * @param nameContains
     *        Only list hub content if the name contains the specified string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHubContentsRequest withNameContains(String nameContains) {
        setNameContains(nameContains);
        return this;
    }

    /**
     * <p>
     * The upper bound of the hub content schema verion.
     * </p>
     * 
     * @param maxSchemaVersion
     *        The upper bound of the hub content schema verion.
     */

    public void setMaxSchemaVersion(String maxSchemaVersion) {
        this.maxSchemaVersion = maxSchemaVersion;
    }

    /**
     * <p>
     * The upper bound of the hub content schema verion.
     * </p>
     * 
     * @return The upper bound of the hub content schema verion.
     */

    public String getMaxSchemaVersion() {
        return this.maxSchemaVersion;
    }

    /**
     * <p>
     * The upper bound of the hub content schema verion.
     * </p>
     * 
     * @param maxSchemaVersion
     *        The upper bound of the hub content schema verion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHubContentsRequest withMaxSchemaVersion(String maxSchemaVersion) {
        setMaxSchemaVersion(maxSchemaVersion);
        return this;
    }

    /**
     * <p>
     * Only list hub content that was created before the time specified.
     * </p>
     * 
     * @param creationTimeBefore
     *        Only list hub content that was created before the time specified.
     */

    public void setCreationTimeBefore(java.util.Date creationTimeBefore) {
        this.creationTimeBefore = creationTimeBefore;
    }

    /**
     * <p>
     * Only list hub content that was created before the time specified.
     * </p>
     * 
     * @return Only list hub content that was created before the time specified.
     */

    public java.util.Date getCreationTimeBefore() {
        return this.creationTimeBefore;
    }

    /**
     * <p>
     * Only list hub content that was created before the time specified.
     * </p>
     * 
     * @param creationTimeBefore
     *        Only list hub content that was created before the time specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHubContentsRequest withCreationTimeBefore(java.util.Date creationTimeBefore) {
        setCreationTimeBefore(creationTimeBefore);
        return this;
    }

    /**
     * <p>
     * Only list hub content that was created after the time specified.
     * </p>
     * 
     * @param creationTimeAfter
     *        Only list hub content that was created after the time specified.
     */

    public void setCreationTimeAfter(java.util.Date creationTimeAfter) {
        this.creationTimeAfter = creationTimeAfter;
    }

    /**
     * <p>
     * Only list hub content that was created after the time specified.
     * </p>
     * 
     * @return Only list hub content that was created after the time specified.
     */

    public java.util.Date getCreationTimeAfter() {
        return this.creationTimeAfter;
    }

    /**
     * <p>
     * Only list hub content that was created after the time specified.
     * </p>
     * 
     * @param creationTimeAfter
     *        Only list hub content that was created after the time specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHubContentsRequest withCreationTimeAfter(java.util.Date creationTimeAfter) {
        setCreationTimeAfter(creationTimeAfter);
        return this;
    }

    /**
     * <p>
     * Sort hub content versions by either name or creation time.
     * </p>
     * 
     * @param sortBy
     *        Sort hub content versions by either name or creation time.
     * @see HubContentSortBy
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * Sort hub content versions by either name or creation time.
     * </p>
     * 
     * @return Sort hub content versions by either name or creation time.
     * @see HubContentSortBy
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * Sort hub content versions by either name or creation time.
     * </p>
     * 
     * @param sortBy
     *        Sort hub content versions by either name or creation time.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HubContentSortBy
     */

    public ListHubContentsRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * Sort hub content versions by either name or creation time.
     * </p>
     * 
     * @param sortBy
     *        Sort hub content versions by either name or creation time.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HubContentSortBy
     */

    public ListHubContentsRequest withSortBy(HubContentSortBy sortBy) {
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

    public ListHubContentsRequest withSortOrder(String sortOrder) {
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

    public ListHubContentsRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * The maximum amount of hub content to list.
     * </p>
     * 
     * @param maxResults
     *        The maximum amount of hub content to list.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum amount of hub content to list.
     * </p>
     * 
     * @return The maximum amount of hub content to list.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum amount of hub content to list.
     * </p>
     * 
     * @param maxResults
     *        The maximum amount of hub content to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHubContentsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If the response to a previous <code>ListHubContents</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of hub content, use the token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the response to a previous <code>ListHubContents</code> request was truncated, the response includes a
     *        <code>NextToken</code>. To retrieve the next set of hub content, use the token in the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response to a previous <code>ListHubContents</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of hub content, use the token in the next request.
     * </p>
     * 
     * @return If the response to a previous <code>ListHubContents</code> request was truncated, the response includes a
     *         <code>NextToken</code>. To retrieve the next set of hub content, use the token in the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response to a previous <code>ListHubContents</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of hub content, use the token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the response to a previous <code>ListHubContents</code> request was truncated, the response includes a
     *        <code>NextToken</code>. To retrieve the next set of hub content, use the token in the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHubContentsRequest withNextToken(String nextToken) {
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
        if (getHubName() != null)
            sb.append("HubName: ").append(getHubName()).append(",");
        if (getHubContentType() != null)
            sb.append("HubContentType: ").append(getHubContentType()).append(",");
        if (getNameContains() != null)
            sb.append("NameContains: ").append(getNameContains()).append(",");
        if (getMaxSchemaVersion() != null)
            sb.append("MaxSchemaVersion: ").append(getMaxSchemaVersion()).append(",");
        if (getCreationTimeBefore() != null)
            sb.append("CreationTimeBefore: ").append(getCreationTimeBefore()).append(",");
        if (getCreationTimeAfter() != null)
            sb.append("CreationTimeAfter: ").append(getCreationTimeAfter()).append(",");
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

        if (obj instanceof ListHubContentsRequest == false)
            return false;
        ListHubContentsRequest other = (ListHubContentsRequest) obj;
        if (other.getHubName() == null ^ this.getHubName() == null)
            return false;
        if (other.getHubName() != null && other.getHubName().equals(this.getHubName()) == false)
            return false;
        if (other.getHubContentType() == null ^ this.getHubContentType() == null)
            return false;
        if (other.getHubContentType() != null && other.getHubContentType().equals(this.getHubContentType()) == false)
            return false;
        if (other.getNameContains() == null ^ this.getNameContains() == null)
            return false;
        if (other.getNameContains() != null && other.getNameContains().equals(this.getNameContains()) == false)
            return false;
        if (other.getMaxSchemaVersion() == null ^ this.getMaxSchemaVersion() == null)
            return false;
        if (other.getMaxSchemaVersion() != null && other.getMaxSchemaVersion().equals(this.getMaxSchemaVersion()) == false)
            return false;
        if (other.getCreationTimeBefore() == null ^ this.getCreationTimeBefore() == null)
            return false;
        if (other.getCreationTimeBefore() != null && other.getCreationTimeBefore().equals(this.getCreationTimeBefore()) == false)
            return false;
        if (other.getCreationTimeAfter() == null ^ this.getCreationTimeAfter() == null)
            return false;
        if (other.getCreationTimeAfter() != null && other.getCreationTimeAfter().equals(this.getCreationTimeAfter()) == false)
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

        hashCode = prime * hashCode + ((getHubName() == null) ? 0 : getHubName().hashCode());
        hashCode = prime * hashCode + ((getHubContentType() == null) ? 0 : getHubContentType().hashCode());
        hashCode = prime * hashCode + ((getNameContains() == null) ? 0 : getNameContains().hashCode());
        hashCode = prime * hashCode + ((getMaxSchemaVersion() == null) ? 0 : getMaxSchemaVersion().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeBefore() == null) ? 0 : getCreationTimeBefore().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeAfter() == null) ? 0 : getCreationTimeAfter().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListHubContentsRequest clone() {
        return (ListHubContentsRequest) super.clone();
    }

}
