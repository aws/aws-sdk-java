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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListModelCards" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListModelCardsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Only list model cards that were created after the time specified.
     * </p>
     */
    private java.util.Date creationTimeAfter;
    /**
     * <p>
     * Only list model cards that were created before the time specified.
     * </p>
     */
    private java.util.Date creationTimeBefore;
    /**
     * <p>
     * The maximum number of model cards to list.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Only list model cards with names that contain the specified string.
     * </p>
     */
    private String nameContains;
    /**
     * <p>
     * Only list model cards with the specified approval status.
     * </p>
     */
    private String modelCardStatus;
    /**
     * <p>
     * If the response to a previous <code>ListModelCards</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of model cards, use the token in the next request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Sort model cards by either name or creation time. Sorts by creation time by default.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * Sort model cards by ascending or descending order.
     * </p>
     */
    private String sortOrder;

    /**
     * <p>
     * Only list model cards that were created after the time specified.
     * </p>
     * 
     * @param creationTimeAfter
     *        Only list model cards that were created after the time specified.
     */

    public void setCreationTimeAfter(java.util.Date creationTimeAfter) {
        this.creationTimeAfter = creationTimeAfter;
    }

    /**
     * <p>
     * Only list model cards that were created after the time specified.
     * </p>
     * 
     * @return Only list model cards that were created after the time specified.
     */

    public java.util.Date getCreationTimeAfter() {
        return this.creationTimeAfter;
    }

    /**
     * <p>
     * Only list model cards that were created after the time specified.
     * </p>
     * 
     * @param creationTimeAfter
     *        Only list model cards that were created after the time specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelCardsRequest withCreationTimeAfter(java.util.Date creationTimeAfter) {
        setCreationTimeAfter(creationTimeAfter);
        return this;
    }

    /**
     * <p>
     * Only list model cards that were created before the time specified.
     * </p>
     * 
     * @param creationTimeBefore
     *        Only list model cards that were created before the time specified.
     */

    public void setCreationTimeBefore(java.util.Date creationTimeBefore) {
        this.creationTimeBefore = creationTimeBefore;
    }

    /**
     * <p>
     * Only list model cards that were created before the time specified.
     * </p>
     * 
     * @return Only list model cards that were created before the time specified.
     */

    public java.util.Date getCreationTimeBefore() {
        return this.creationTimeBefore;
    }

    /**
     * <p>
     * Only list model cards that were created before the time specified.
     * </p>
     * 
     * @param creationTimeBefore
     *        Only list model cards that were created before the time specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelCardsRequest withCreationTimeBefore(java.util.Date creationTimeBefore) {
        setCreationTimeBefore(creationTimeBefore);
        return this;
    }

    /**
     * <p>
     * The maximum number of model cards to list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of model cards to list.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of model cards to list.
     * </p>
     * 
     * @return The maximum number of model cards to list.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of model cards to list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of model cards to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelCardsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Only list model cards with names that contain the specified string.
     * </p>
     * 
     * @param nameContains
     *        Only list model cards with names that contain the specified string.
     */

    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    /**
     * <p>
     * Only list model cards with names that contain the specified string.
     * </p>
     * 
     * @return Only list model cards with names that contain the specified string.
     */

    public String getNameContains() {
        return this.nameContains;
    }

    /**
     * <p>
     * Only list model cards with names that contain the specified string.
     * </p>
     * 
     * @param nameContains
     *        Only list model cards with names that contain the specified string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelCardsRequest withNameContains(String nameContains) {
        setNameContains(nameContains);
        return this;
    }

    /**
     * <p>
     * Only list model cards with the specified approval status.
     * </p>
     * 
     * @param modelCardStatus
     *        Only list model cards with the specified approval status.
     * @see ModelCardStatus
     */

    public void setModelCardStatus(String modelCardStatus) {
        this.modelCardStatus = modelCardStatus;
    }

    /**
     * <p>
     * Only list model cards with the specified approval status.
     * </p>
     * 
     * @return Only list model cards with the specified approval status.
     * @see ModelCardStatus
     */

    public String getModelCardStatus() {
        return this.modelCardStatus;
    }

    /**
     * <p>
     * Only list model cards with the specified approval status.
     * </p>
     * 
     * @param modelCardStatus
     *        Only list model cards with the specified approval status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelCardStatus
     */

    public ListModelCardsRequest withModelCardStatus(String modelCardStatus) {
        setModelCardStatus(modelCardStatus);
        return this;
    }

    /**
     * <p>
     * Only list model cards with the specified approval status.
     * </p>
     * 
     * @param modelCardStatus
     *        Only list model cards with the specified approval status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelCardStatus
     */

    public ListModelCardsRequest withModelCardStatus(ModelCardStatus modelCardStatus) {
        this.modelCardStatus = modelCardStatus.toString();
        return this;
    }

    /**
     * <p>
     * If the response to a previous <code>ListModelCards</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of model cards, use the token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the response to a previous <code>ListModelCards</code> request was truncated, the response includes a
     *        <code>NextToken</code>. To retrieve the next set of model cards, use the token in the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response to a previous <code>ListModelCards</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of model cards, use the token in the next request.
     * </p>
     * 
     * @return If the response to a previous <code>ListModelCards</code> request was truncated, the response includes a
     *         <code>NextToken</code>. To retrieve the next set of model cards, use the token in the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response to a previous <code>ListModelCards</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of model cards, use the token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the response to a previous <code>ListModelCards</code> request was truncated, the response includes a
     *        <code>NextToken</code>. To retrieve the next set of model cards, use the token in the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelCardsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Sort model cards by either name or creation time. Sorts by creation time by default.
     * </p>
     * 
     * @param sortBy
     *        Sort model cards by either name or creation time. Sorts by creation time by default.
     * @see ModelCardSortBy
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * Sort model cards by either name or creation time. Sorts by creation time by default.
     * </p>
     * 
     * @return Sort model cards by either name or creation time. Sorts by creation time by default.
     * @see ModelCardSortBy
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * Sort model cards by either name or creation time. Sorts by creation time by default.
     * </p>
     * 
     * @param sortBy
     *        Sort model cards by either name or creation time. Sorts by creation time by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelCardSortBy
     */

    public ListModelCardsRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * Sort model cards by either name or creation time. Sorts by creation time by default.
     * </p>
     * 
     * @param sortBy
     *        Sort model cards by either name or creation time. Sorts by creation time by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelCardSortBy
     */

    public ListModelCardsRequest withSortBy(ModelCardSortBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * Sort model cards by ascending or descending order.
     * </p>
     * 
     * @param sortOrder
     *        Sort model cards by ascending or descending order.
     * @see ModelCardSortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * Sort model cards by ascending or descending order.
     * </p>
     * 
     * @return Sort model cards by ascending or descending order.
     * @see ModelCardSortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * Sort model cards by ascending or descending order.
     * </p>
     * 
     * @param sortOrder
     *        Sort model cards by ascending or descending order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelCardSortOrder
     */

    public ListModelCardsRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * Sort model cards by ascending or descending order.
     * </p>
     * 
     * @param sortOrder
     *        Sort model cards by ascending or descending order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelCardSortOrder
     */

    public ListModelCardsRequest withSortOrder(ModelCardSortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
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
        if (getCreationTimeAfter() != null)
            sb.append("CreationTimeAfter: ").append(getCreationTimeAfter()).append(",");
        if (getCreationTimeBefore() != null)
            sb.append("CreationTimeBefore: ").append(getCreationTimeBefore()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNameContains() != null)
            sb.append("NameContains: ").append(getNameContains()).append(",");
        if (getModelCardStatus() != null)
            sb.append("ModelCardStatus: ").append(getModelCardStatus()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListModelCardsRequest == false)
            return false;
        ListModelCardsRequest other = (ListModelCardsRequest) obj;
        if (other.getCreationTimeAfter() == null ^ this.getCreationTimeAfter() == null)
            return false;
        if (other.getCreationTimeAfter() != null && other.getCreationTimeAfter().equals(this.getCreationTimeAfter()) == false)
            return false;
        if (other.getCreationTimeBefore() == null ^ this.getCreationTimeBefore() == null)
            return false;
        if (other.getCreationTimeBefore() != null && other.getCreationTimeBefore().equals(this.getCreationTimeBefore()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNameContains() == null ^ this.getNameContains() == null)
            return false;
        if (other.getNameContains() != null && other.getNameContains().equals(this.getNameContains()) == false)
            return false;
        if (other.getModelCardStatus() == null ^ this.getModelCardStatus() == null)
            return false;
        if (other.getModelCardStatus() != null && other.getModelCardStatus().equals(this.getModelCardStatus()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationTimeAfter() == null) ? 0 : getCreationTimeAfter().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeBefore() == null) ? 0 : getCreationTimeBefore().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNameContains() == null) ? 0 : getNameContains().hashCode());
        hashCode = prime * hashCode + ((getModelCardStatus() == null) ? 0 : getModelCardStatus().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public ListModelCardsRequest clone() {
        return (ListModelCardsRequest) super.clone();
    }

}
