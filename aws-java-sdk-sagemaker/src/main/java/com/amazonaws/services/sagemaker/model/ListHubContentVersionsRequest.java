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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListHubContentVersions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListHubContentVersionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the hub to list the content versions of.
     * </p>
     */
    private String hubName;
    /**
     * <p>
     * The type of hub content to list versions of.
     * </p>
     */
    private String hubContentType;
    /**
     * <p>
     * The name of the hub content.
     * </p>
     */
    private String hubContentName;
    /**
     * <p>
     * The lower bound of the hub content versions to list.
     * </p>
     */
    private String minVersion;
    /**
     * <p>
     * The upper bound of the hub content schema version.
     * </p>
     */
    private String maxSchemaVersion;
    /**
     * <p>
     * Only list hub content versions that were created before the time specified.
     * </p>
     */
    private java.util.Date creationTimeBefore;
    /**
     * <p>
     * Only list hub content versions that were created after the time specified.
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
     * Sort hub content versions by ascending or descending order.
     * </p>
     */
    private String sortOrder;
    /**
     * <p>
     * The maximum number of hub content versions to list.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If the response to a previous <code>ListHubContentVersions</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of hub content versions, use the token in the next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the hub to list the content versions of.
     * </p>
     * 
     * @param hubName
     *        The name of the hub to list the content versions of.
     */

    public void setHubName(String hubName) {
        this.hubName = hubName;
    }

    /**
     * <p>
     * The name of the hub to list the content versions of.
     * </p>
     * 
     * @return The name of the hub to list the content versions of.
     */

    public String getHubName() {
        return this.hubName;
    }

    /**
     * <p>
     * The name of the hub to list the content versions of.
     * </p>
     * 
     * @param hubName
     *        The name of the hub to list the content versions of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHubContentVersionsRequest withHubName(String hubName) {
        setHubName(hubName);
        return this;
    }

    /**
     * <p>
     * The type of hub content to list versions of.
     * </p>
     * 
     * @param hubContentType
     *        The type of hub content to list versions of.
     * @see HubContentType
     */

    public void setHubContentType(String hubContentType) {
        this.hubContentType = hubContentType;
    }

    /**
     * <p>
     * The type of hub content to list versions of.
     * </p>
     * 
     * @return The type of hub content to list versions of.
     * @see HubContentType
     */

    public String getHubContentType() {
        return this.hubContentType;
    }

    /**
     * <p>
     * The type of hub content to list versions of.
     * </p>
     * 
     * @param hubContentType
     *        The type of hub content to list versions of.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HubContentType
     */

    public ListHubContentVersionsRequest withHubContentType(String hubContentType) {
        setHubContentType(hubContentType);
        return this;
    }

    /**
     * <p>
     * The type of hub content to list versions of.
     * </p>
     * 
     * @param hubContentType
     *        The type of hub content to list versions of.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HubContentType
     */

    public ListHubContentVersionsRequest withHubContentType(HubContentType hubContentType) {
        this.hubContentType = hubContentType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the hub content.
     * </p>
     * 
     * @param hubContentName
     *        The name of the hub content.
     */

    public void setHubContentName(String hubContentName) {
        this.hubContentName = hubContentName;
    }

    /**
     * <p>
     * The name of the hub content.
     * </p>
     * 
     * @return The name of the hub content.
     */

    public String getHubContentName() {
        return this.hubContentName;
    }

    /**
     * <p>
     * The name of the hub content.
     * </p>
     * 
     * @param hubContentName
     *        The name of the hub content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHubContentVersionsRequest withHubContentName(String hubContentName) {
        setHubContentName(hubContentName);
        return this;
    }

    /**
     * <p>
     * The lower bound of the hub content versions to list.
     * </p>
     * 
     * @param minVersion
     *        The lower bound of the hub content versions to list.
     */

    public void setMinVersion(String minVersion) {
        this.minVersion = minVersion;
    }

    /**
     * <p>
     * The lower bound of the hub content versions to list.
     * </p>
     * 
     * @return The lower bound of the hub content versions to list.
     */

    public String getMinVersion() {
        return this.minVersion;
    }

    /**
     * <p>
     * The lower bound of the hub content versions to list.
     * </p>
     * 
     * @param minVersion
     *        The lower bound of the hub content versions to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHubContentVersionsRequest withMinVersion(String minVersion) {
        setMinVersion(minVersion);
        return this;
    }

    /**
     * <p>
     * The upper bound of the hub content schema version.
     * </p>
     * 
     * @param maxSchemaVersion
     *        The upper bound of the hub content schema version.
     */

    public void setMaxSchemaVersion(String maxSchemaVersion) {
        this.maxSchemaVersion = maxSchemaVersion;
    }

    /**
     * <p>
     * The upper bound of the hub content schema version.
     * </p>
     * 
     * @return The upper bound of the hub content schema version.
     */

    public String getMaxSchemaVersion() {
        return this.maxSchemaVersion;
    }

    /**
     * <p>
     * The upper bound of the hub content schema version.
     * </p>
     * 
     * @param maxSchemaVersion
     *        The upper bound of the hub content schema version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHubContentVersionsRequest withMaxSchemaVersion(String maxSchemaVersion) {
        setMaxSchemaVersion(maxSchemaVersion);
        return this;
    }

    /**
     * <p>
     * Only list hub content versions that were created before the time specified.
     * </p>
     * 
     * @param creationTimeBefore
     *        Only list hub content versions that were created before the time specified.
     */

    public void setCreationTimeBefore(java.util.Date creationTimeBefore) {
        this.creationTimeBefore = creationTimeBefore;
    }

    /**
     * <p>
     * Only list hub content versions that were created before the time specified.
     * </p>
     * 
     * @return Only list hub content versions that were created before the time specified.
     */

    public java.util.Date getCreationTimeBefore() {
        return this.creationTimeBefore;
    }

    /**
     * <p>
     * Only list hub content versions that were created before the time specified.
     * </p>
     * 
     * @param creationTimeBefore
     *        Only list hub content versions that were created before the time specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHubContentVersionsRequest withCreationTimeBefore(java.util.Date creationTimeBefore) {
        setCreationTimeBefore(creationTimeBefore);
        return this;
    }

    /**
     * <p>
     * Only list hub content versions that were created after the time specified.
     * </p>
     * 
     * @param creationTimeAfter
     *        Only list hub content versions that were created after the time specified.
     */

    public void setCreationTimeAfter(java.util.Date creationTimeAfter) {
        this.creationTimeAfter = creationTimeAfter;
    }

    /**
     * <p>
     * Only list hub content versions that were created after the time specified.
     * </p>
     * 
     * @return Only list hub content versions that were created after the time specified.
     */

    public java.util.Date getCreationTimeAfter() {
        return this.creationTimeAfter;
    }

    /**
     * <p>
     * Only list hub content versions that were created after the time specified.
     * </p>
     * 
     * @param creationTimeAfter
     *        Only list hub content versions that were created after the time specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHubContentVersionsRequest withCreationTimeAfter(java.util.Date creationTimeAfter) {
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

    public ListHubContentVersionsRequest withSortBy(String sortBy) {
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

    public ListHubContentVersionsRequest withSortBy(HubContentSortBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * Sort hub content versions by ascending or descending order.
     * </p>
     * 
     * @param sortOrder
     *        Sort hub content versions by ascending or descending order.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * Sort hub content versions by ascending or descending order.
     * </p>
     * 
     * @return Sort hub content versions by ascending or descending order.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * Sort hub content versions by ascending or descending order.
     * </p>
     * 
     * @param sortOrder
     *        Sort hub content versions by ascending or descending order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListHubContentVersionsRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * Sort hub content versions by ascending or descending order.
     * </p>
     * 
     * @param sortOrder
     *        Sort hub content versions by ascending or descending order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListHubContentVersionsRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of hub content versions to list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of hub content versions to list.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of hub content versions to list.
     * </p>
     * 
     * @return The maximum number of hub content versions to list.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of hub content versions to list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of hub content versions to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHubContentVersionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If the response to a previous <code>ListHubContentVersions</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of hub content versions, use the token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the response to a previous <code>ListHubContentVersions</code> request was truncated, the response
     *        includes a <code>NextToken</code>. To retrieve the next set of hub content versions, use the token in the
     *        next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response to a previous <code>ListHubContentVersions</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of hub content versions, use the token in the next request.
     * </p>
     * 
     * @return If the response to a previous <code>ListHubContentVersions</code> request was truncated, the response
     *         includes a <code>NextToken</code>. To retrieve the next set of hub content versions, use the token in the
     *         next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response to a previous <code>ListHubContentVersions</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of hub content versions, use the token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the response to a previous <code>ListHubContentVersions</code> request was truncated, the response
     *        includes a <code>NextToken</code>. To retrieve the next set of hub content versions, use the token in the
     *        next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHubContentVersionsRequest withNextToken(String nextToken) {
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
        if (getHubContentName() != null)
            sb.append("HubContentName: ").append(getHubContentName()).append(",");
        if (getMinVersion() != null)
            sb.append("MinVersion: ").append(getMinVersion()).append(",");
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

        if (obj instanceof ListHubContentVersionsRequest == false)
            return false;
        ListHubContentVersionsRequest other = (ListHubContentVersionsRequest) obj;
        if (other.getHubName() == null ^ this.getHubName() == null)
            return false;
        if (other.getHubName() != null && other.getHubName().equals(this.getHubName()) == false)
            return false;
        if (other.getHubContentType() == null ^ this.getHubContentType() == null)
            return false;
        if (other.getHubContentType() != null && other.getHubContentType().equals(this.getHubContentType()) == false)
            return false;
        if (other.getHubContentName() == null ^ this.getHubContentName() == null)
            return false;
        if (other.getHubContentName() != null && other.getHubContentName().equals(this.getHubContentName()) == false)
            return false;
        if (other.getMinVersion() == null ^ this.getMinVersion() == null)
            return false;
        if (other.getMinVersion() != null && other.getMinVersion().equals(this.getMinVersion()) == false)
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
        hashCode = prime * hashCode + ((getHubContentName() == null) ? 0 : getHubContentName().hashCode());
        hashCode = prime * hashCode + ((getMinVersion() == null) ? 0 : getMinVersion().hashCode());
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
    public ListHubContentVersionsRequest clone() {
        return (ListHubContentVersionsRequest) super.clone();
    }

}
