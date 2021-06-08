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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListAppImageConfigs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAppImageConfigsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of AppImageConfigs to return in the response. The default value is 10.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If the previous call to <code>ListImages</code> didn't return the full set of AppImageConfigs, the call returns a
     * token for getting the next set of AppImageConfigs.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A filter that returns only AppImageConfigs whose name contains the specified string.
     * </p>
     */
    private String nameContains;
    /**
     * <p>
     * A filter that returns only AppImageConfigs created on or before the specified time.
     * </p>
     */
    private java.util.Date creationTimeBefore;
    /**
     * <p>
     * A filter that returns only AppImageConfigs created on or after the specified time.
     * </p>
     */
    private java.util.Date creationTimeAfter;
    /**
     * <p>
     * A filter that returns only AppImageConfigs modified on or before the specified time.
     * </p>
     */
    private java.util.Date modifiedTimeBefore;
    /**
     * <p>
     * A filter that returns only AppImageConfigs modified on or after the specified time.
     * </p>
     */
    private java.util.Date modifiedTimeAfter;
    /**
     * <p>
     * The property used to sort results. The default value is <code>CreationTime</code>.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * The sort order. The default value is <code>Descending</code>.
     * </p>
     */
    private String sortOrder;

    /**
     * <p>
     * The maximum number of AppImageConfigs to return in the response. The default value is 10.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of AppImageConfigs to return in the response. The default value is 10.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of AppImageConfigs to return in the response. The default value is 10.
     * </p>
     * 
     * @return The maximum number of AppImageConfigs to return in the response. The default value is 10.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of AppImageConfigs to return in the response. The default value is 10.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of AppImageConfigs to return in the response. The default value is 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppImageConfigsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If the previous call to <code>ListImages</code> didn't return the full set of AppImageConfigs, the call returns a
     * token for getting the next set of AppImageConfigs.
     * </p>
     * 
     * @param nextToken
     *        If the previous call to <code>ListImages</code> didn't return the full set of AppImageConfigs, the call
     *        returns a token for getting the next set of AppImageConfigs.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous call to <code>ListImages</code> didn't return the full set of AppImageConfigs, the call returns a
     * token for getting the next set of AppImageConfigs.
     * </p>
     * 
     * @return If the previous call to <code>ListImages</code> didn't return the full set of AppImageConfigs, the call
     *         returns a token for getting the next set of AppImageConfigs.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous call to <code>ListImages</code> didn't return the full set of AppImageConfigs, the call returns a
     * token for getting the next set of AppImageConfigs.
     * </p>
     * 
     * @param nextToken
     *        If the previous call to <code>ListImages</code> didn't return the full set of AppImageConfigs, the call
     *        returns a token for getting the next set of AppImageConfigs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppImageConfigsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A filter that returns only AppImageConfigs whose name contains the specified string.
     * </p>
     * 
     * @param nameContains
     *        A filter that returns only AppImageConfigs whose name contains the specified string.
     */

    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    /**
     * <p>
     * A filter that returns only AppImageConfigs whose name contains the specified string.
     * </p>
     * 
     * @return A filter that returns only AppImageConfigs whose name contains the specified string.
     */

    public String getNameContains() {
        return this.nameContains;
    }

    /**
     * <p>
     * A filter that returns only AppImageConfigs whose name contains the specified string.
     * </p>
     * 
     * @param nameContains
     *        A filter that returns only AppImageConfigs whose name contains the specified string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppImageConfigsRequest withNameContains(String nameContains) {
        setNameContains(nameContains);
        return this;
    }

    /**
     * <p>
     * A filter that returns only AppImageConfigs created on or before the specified time.
     * </p>
     * 
     * @param creationTimeBefore
     *        A filter that returns only AppImageConfigs created on or before the specified time.
     */

    public void setCreationTimeBefore(java.util.Date creationTimeBefore) {
        this.creationTimeBefore = creationTimeBefore;
    }

    /**
     * <p>
     * A filter that returns only AppImageConfigs created on or before the specified time.
     * </p>
     * 
     * @return A filter that returns only AppImageConfigs created on or before the specified time.
     */

    public java.util.Date getCreationTimeBefore() {
        return this.creationTimeBefore;
    }

    /**
     * <p>
     * A filter that returns only AppImageConfigs created on or before the specified time.
     * </p>
     * 
     * @param creationTimeBefore
     *        A filter that returns only AppImageConfigs created on or before the specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppImageConfigsRequest withCreationTimeBefore(java.util.Date creationTimeBefore) {
        setCreationTimeBefore(creationTimeBefore);
        return this;
    }

    /**
     * <p>
     * A filter that returns only AppImageConfigs created on or after the specified time.
     * </p>
     * 
     * @param creationTimeAfter
     *        A filter that returns only AppImageConfigs created on or after the specified time.
     */

    public void setCreationTimeAfter(java.util.Date creationTimeAfter) {
        this.creationTimeAfter = creationTimeAfter;
    }

    /**
     * <p>
     * A filter that returns only AppImageConfigs created on or after the specified time.
     * </p>
     * 
     * @return A filter that returns only AppImageConfigs created on or after the specified time.
     */

    public java.util.Date getCreationTimeAfter() {
        return this.creationTimeAfter;
    }

    /**
     * <p>
     * A filter that returns only AppImageConfigs created on or after the specified time.
     * </p>
     * 
     * @param creationTimeAfter
     *        A filter that returns only AppImageConfigs created on or after the specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppImageConfigsRequest withCreationTimeAfter(java.util.Date creationTimeAfter) {
        setCreationTimeAfter(creationTimeAfter);
        return this;
    }

    /**
     * <p>
     * A filter that returns only AppImageConfigs modified on or before the specified time.
     * </p>
     * 
     * @param modifiedTimeBefore
     *        A filter that returns only AppImageConfigs modified on or before the specified time.
     */

    public void setModifiedTimeBefore(java.util.Date modifiedTimeBefore) {
        this.modifiedTimeBefore = modifiedTimeBefore;
    }

    /**
     * <p>
     * A filter that returns only AppImageConfigs modified on or before the specified time.
     * </p>
     * 
     * @return A filter that returns only AppImageConfigs modified on or before the specified time.
     */

    public java.util.Date getModifiedTimeBefore() {
        return this.modifiedTimeBefore;
    }

    /**
     * <p>
     * A filter that returns only AppImageConfigs modified on or before the specified time.
     * </p>
     * 
     * @param modifiedTimeBefore
     *        A filter that returns only AppImageConfigs modified on or before the specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppImageConfigsRequest withModifiedTimeBefore(java.util.Date modifiedTimeBefore) {
        setModifiedTimeBefore(modifiedTimeBefore);
        return this;
    }

    /**
     * <p>
     * A filter that returns only AppImageConfigs modified on or after the specified time.
     * </p>
     * 
     * @param modifiedTimeAfter
     *        A filter that returns only AppImageConfigs modified on or after the specified time.
     */

    public void setModifiedTimeAfter(java.util.Date modifiedTimeAfter) {
        this.modifiedTimeAfter = modifiedTimeAfter;
    }

    /**
     * <p>
     * A filter that returns only AppImageConfigs modified on or after the specified time.
     * </p>
     * 
     * @return A filter that returns only AppImageConfigs modified on or after the specified time.
     */

    public java.util.Date getModifiedTimeAfter() {
        return this.modifiedTimeAfter;
    }

    /**
     * <p>
     * A filter that returns only AppImageConfigs modified on or after the specified time.
     * </p>
     * 
     * @param modifiedTimeAfter
     *        A filter that returns only AppImageConfigs modified on or after the specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppImageConfigsRequest withModifiedTimeAfter(java.util.Date modifiedTimeAfter) {
        setModifiedTimeAfter(modifiedTimeAfter);
        return this;
    }

    /**
     * <p>
     * The property used to sort results. The default value is <code>CreationTime</code>.
     * </p>
     * 
     * @param sortBy
     *        The property used to sort results. The default value is <code>CreationTime</code>.
     * @see AppImageConfigSortKey
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The property used to sort results. The default value is <code>CreationTime</code>.
     * </p>
     * 
     * @return The property used to sort results. The default value is <code>CreationTime</code>.
     * @see AppImageConfigSortKey
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The property used to sort results. The default value is <code>CreationTime</code>.
     * </p>
     * 
     * @param sortBy
     *        The property used to sort results. The default value is <code>CreationTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppImageConfigSortKey
     */

    public ListAppImageConfigsRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The property used to sort results. The default value is <code>CreationTime</code>.
     * </p>
     * 
     * @param sortBy
     *        The property used to sort results. The default value is <code>CreationTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppImageConfigSortKey
     */

    public ListAppImageConfigsRequest withSortBy(AppImageConfigSortKey sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The sort order. The default value is <code>Descending</code>.
     * </p>
     * 
     * @param sortOrder
     *        The sort order. The default value is <code>Descending</code>.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The sort order. The default value is <code>Descending</code>.
     * </p>
     * 
     * @return The sort order. The default value is <code>Descending</code>.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The sort order. The default value is <code>Descending</code>.
     * </p>
     * 
     * @param sortOrder
     *        The sort order. The default value is <code>Descending</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListAppImageConfigsRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The sort order. The default value is <code>Descending</code>.
     * </p>
     * 
     * @param sortOrder
     *        The sort order. The default value is <code>Descending</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListAppImageConfigsRequest withSortOrder(SortOrder sortOrder) {
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getNameContains() != null)
            sb.append("NameContains: ").append(getNameContains()).append(",");
        if (getCreationTimeBefore() != null)
            sb.append("CreationTimeBefore: ").append(getCreationTimeBefore()).append(",");
        if (getCreationTimeAfter() != null)
            sb.append("CreationTimeAfter: ").append(getCreationTimeAfter()).append(",");
        if (getModifiedTimeBefore() != null)
            sb.append("ModifiedTimeBefore: ").append(getModifiedTimeBefore()).append(",");
        if (getModifiedTimeAfter() != null)
            sb.append("ModifiedTimeAfter: ").append(getModifiedTimeAfter()).append(",");
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

        if (obj instanceof ListAppImageConfigsRequest == false)
            return false;
        ListAppImageConfigsRequest other = (ListAppImageConfigsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
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
        if (other.getModifiedTimeBefore() == null ^ this.getModifiedTimeBefore() == null)
            return false;
        if (other.getModifiedTimeBefore() != null && other.getModifiedTimeBefore().equals(this.getModifiedTimeBefore()) == false)
            return false;
        if (other.getModifiedTimeAfter() == null ^ this.getModifiedTimeAfter() == null)
            return false;
        if (other.getModifiedTimeAfter() != null && other.getModifiedTimeAfter().equals(this.getModifiedTimeAfter()) == false)
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

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getNameContains() == null) ? 0 : getNameContains().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeBefore() == null) ? 0 : getCreationTimeBefore().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeAfter() == null) ? 0 : getCreationTimeAfter().hashCode());
        hashCode = prime * hashCode + ((getModifiedTimeBefore() == null) ? 0 : getModifiedTimeBefore().hashCode());
        hashCode = prime * hashCode + ((getModifiedTimeAfter() == null) ? 0 : getModifiedTimeAfter().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public ListAppImageConfigsRequest clone() {
        return (ListAppImageConfigsRequest) super.clone();
    }

}
