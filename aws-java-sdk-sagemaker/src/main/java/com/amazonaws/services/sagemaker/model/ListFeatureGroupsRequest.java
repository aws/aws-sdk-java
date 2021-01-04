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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListFeatureGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFeatureGroupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A string that partially matches one or more <code>FeatureGroup</code>s names. Filters <code>FeatureGroup</code>s
     * by name.
     * </p>
     */
    private String nameContains;
    /**
     * <p>
     * A <code>FeatureGroup</code> status. Filters by <code>FeatureGroup</code> status.
     * </p>
     */
    private String featureGroupStatusEquals;
    /**
     * <p>
     * An <code>OfflineStore</code> status. Filters by <code>OfflineStore</code> status.
     * </p>
     */
    private String offlineStoreStatusEquals;
    /**
     * <p>
     * Use this parameter to search for <code>FeatureGroups</code>s created after a specific date and time.
     * </p>
     */
    private java.util.Date creationTimeAfter;
    /**
     * <p>
     * Use this parameter to search for <code>FeatureGroups</code>s created before a specific date and time.
     * </p>
     */
    private java.util.Date creationTimeBefore;
    /**
     * <p>
     * The order in which feature groups are listed.
     * </p>
     */
    private String sortOrder;
    /**
     * <p>
     * The value on which the feature group list is sorted.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * The maximum number of results returned by <code>ListFeatureGroups</code>.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token to resume pagination of <code>ListFeatureGroups</code> results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A string that partially matches one or more <code>FeatureGroup</code>s names. Filters <code>FeatureGroup</code>s
     * by name.
     * </p>
     * 
     * @param nameContains
     *        A string that partially matches one or more <code>FeatureGroup</code>s names. Filters
     *        <code>FeatureGroup</code>s by name.
     */

    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    /**
     * <p>
     * A string that partially matches one or more <code>FeatureGroup</code>s names. Filters <code>FeatureGroup</code>s
     * by name.
     * </p>
     * 
     * @return A string that partially matches one or more <code>FeatureGroup</code>s names. Filters
     *         <code>FeatureGroup</code>s by name.
     */

    public String getNameContains() {
        return this.nameContains;
    }

    /**
     * <p>
     * A string that partially matches one or more <code>FeatureGroup</code>s names. Filters <code>FeatureGroup</code>s
     * by name.
     * </p>
     * 
     * @param nameContains
     *        A string that partially matches one or more <code>FeatureGroup</code>s names. Filters
     *        <code>FeatureGroup</code>s by name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFeatureGroupsRequest withNameContains(String nameContains) {
        setNameContains(nameContains);
        return this;
    }

    /**
     * <p>
     * A <code>FeatureGroup</code> status. Filters by <code>FeatureGroup</code> status.
     * </p>
     * 
     * @param featureGroupStatusEquals
     *        A <code>FeatureGroup</code> status. Filters by <code>FeatureGroup</code> status.
     * @see FeatureGroupStatus
     */

    public void setFeatureGroupStatusEquals(String featureGroupStatusEquals) {
        this.featureGroupStatusEquals = featureGroupStatusEquals;
    }

    /**
     * <p>
     * A <code>FeatureGroup</code> status. Filters by <code>FeatureGroup</code> status.
     * </p>
     * 
     * @return A <code>FeatureGroup</code> status. Filters by <code>FeatureGroup</code> status.
     * @see FeatureGroupStatus
     */

    public String getFeatureGroupStatusEquals() {
        return this.featureGroupStatusEquals;
    }

    /**
     * <p>
     * A <code>FeatureGroup</code> status. Filters by <code>FeatureGroup</code> status.
     * </p>
     * 
     * @param featureGroupStatusEquals
     *        A <code>FeatureGroup</code> status. Filters by <code>FeatureGroup</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureGroupStatus
     */

    public ListFeatureGroupsRequest withFeatureGroupStatusEquals(String featureGroupStatusEquals) {
        setFeatureGroupStatusEquals(featureGroupStatusEquals);
        return this;
    }

    /**
     * <p>
     * A <code>FeatureGroup</code> status. Filters by <code>FeatureGroup</code> status.
     * </p>
     * 
     * @param featureGroupStatusEquals
     *        A <code>FeatureGroup</code> status. Filters by <code>FeatureGroup</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureGroupStatus
     */

    public ListFeatureGroupsRequest withFeatureGroupStatusEquals(FeatureGroupStatus featureGroupStatusEquals) {
        this.featureGroupStatusEquals = featureGroupStatusEquals.toString();
        return this;
    }

    /**
     * <p>
     * An <code>OfflineStore</code> status. Filters by <code>OfflineStore</code> status.
     * </p>
     * 
     * @param offlineStoreStatusEquals
     *        An <code>OfflineStore</code> status. Filters by <code>OfflineStore</code> status.
     * @see OfflineStoreStatusValue
     */

    public void setOfflineStoreStatusEquals(String offlineStoreStatusEquals) {
        this.offlineStoreStatusEquals = offlineStoreStatusEquals;
    }

    /**
     * <p>
     * An <code>OfflineStore</code> status. Filters by <code>OfflineStore</code> status.
     * </p>
     * 
     * @return An <code>OfflineStore</code> status. Filters by <code>OfflineStore</code> status.
     * @see OfflineStoreStatusValue
     */

    public String getOfflineStoreStatusEquals() {
        return this.offlineStoreStatusEquals;
    }

    /**
     * <p>
     * An <code>OfflineStore</code> status. Filters by <code>OfflineStore</code> status.
     * </p>
     * 
     * @param offlineStoreStatusEquals
     *        An <code>OfflineStore</code> status. Filters by <code>OfflineStore</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OfflineStoreStatusValue
     */

    public ListFeatureGroupsRequest withOfflineStoreStatusEquals(String offlineStoreStatusEquals) {
        setOfflineStoreStatusEquals(offlineStoreStatusEquals);
        return this;
    }

    /**
     * <p>
     * An <code>OfflineStore</code> status. Filters by <code>OfflineStore</code> status.
     * </p>
     * 
     * @param offlineStoreStatusEquals
     *        An <code>OfflineStore</code> status. Filters by <code>OfflineStore</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OfflineStoreStatusValue
     */

    public ListFeatureGroupsRequest withOfflineStoreStatusEquals(OfflineStoreStatusValue offlineStoreStatusEquals) {
        this.offlineStoreStatusEquals = offlineStoreStatusEquals.toString();
        return this;
    }

    /**
     * <p>
     * Use this parameter to search for <code>FeatureGroups</code>s created after a specific date and time.
     * </p>
     * 
     * @param creationTimeAfter
     *        Use this parameter to search for <code>FeatureGroups</code>s created after a specific date and time.
     */

    public void setCreationTimeAfter(java.util.Date creationTimeAfter) {
        this.creationTimeAfter = creationTimeAfter;
    }

    /**
     * <p>
     * Use this parameter to search for <code>FeatureGroups</code>s created after a specific date and time.
     * </p>
     * 
     * @return Use this parameter to search for <code>FeatureGroups</code>s created after a specific date and time.
     */

    public java.util.Date getCreationTimeAfter() {
        return this.creationTimeAfter;
    }

    /**
     * <p>
     * Use this parameter to search for <code>FeatureGroups</code>s created after a specific date and time.
     * </p>
     * 
     * @param creationTimeAfter
     *        Use this parameter to search for <code>FeatureGroups</code>s created after a specific date and time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFeatureGroupsRequest withCreationTimeAfter(java.util.Date creationTimeAfter) {
        setCreationTimeAfter(creationTimeAfter);
        return this;
    }

    /**
     * <p>
     * Use this parameter to search for <code>FeatureGroups</code>s created before a specific date and time.
     * </p>
     * 
     * @param creationTimeBefore
     *        Use this parameter to search for <code>FeatureGroups</code>s created before a specific date and time.
     */

    public void setCreationTimeBefore(java.util.Date creationTimeBefore) {
        this.creationTimeBefore = creationTimeBefore;
    }

    /**
     * <p>
     * Use this parameter to search for <code>FeatureGroups</code>s created before a specific date and time.
     * </p>
     * 
     * @return Use this parameter to search for <code>FeatureGroups</code>s created before a specific date and time.
     */

    public java.util.Date getCreationTimeBefore() {
        return this.creationTimeBefore;
    }

    /**
     * <p>
     * Use this parameter to search for <code>FeatureGroups</code>s created before a specific date and time.
     * </p>
     * 
     * @param creationTimeBefore
     *        Use this parameter to search for <code>FeatureGroups</code>s created before a specific date and time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFeatureGroupsRequest withCreationTimeBefore(java.util.Date creationTimeBefore) {
        setCreationTimeBefore(creationTimeBefore);
        return this;
    }

    /**
     * <p>
     * The order in which feature groups are listed.
     * </p>
     * 
     * @param sortOrder
     *        The order in which feature groups are listed.
     * @see FeatureGroupSortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The order in which feature groups are listed.
     * </p>
     * 
     * @return The order in which feature groups are listed.
     * @see FeatureGroupSortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The order in which feature groups are listed.
     * </p>
     * 
     * @param sortOrder
     *        The order in which feature groups are listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureGroupSortOrder
     */

    public ListFeatureGroupsRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The order in which feature groups are listed.
     * </p>
     * 
     * @param sortOrder
     *        The order in which feature groups are listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureGroupSortOrder
     */

    public ListFeatureGroupsRequest withSortOrder(FeatureGroupSortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * The value on which the feature group list is sorted.
     * </p>
     * 
     * @param sortBy
     *        The value on which the feature group list is sorted.
     * @see FeatureGroupSortBy
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The value on which the feature group list is sorted.
     * </p>
     * 
     * @return The value on which the feature group list is sorted.
     * @see FeatureGroupSortBy
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The value on which the feature group list is sorted.
     * </p>
     * 
     * @param sortBy
     *        The value on which the feature group list is sorted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureGroupSortBy
     */

    public ListFeatureGroupsRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The value on which the feature group list is sorted.
     * </p>
     * 
     * @param sortBy
     *        The value on which the feature group list is sorted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureGroupSortBy
     */

    public ListFeatureGroupsRequest withSortBy(FeatureGroupSortBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of results returned by <code>ListFeatureGroups</code>.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results returned by <code>ListFeatureGroups</code>.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results returned by <code>ListFeatureGroups</code>.
     * </p>
     * 
     * @return The maximum number of results returned by <code>ListFeatureGroups</code>.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results returned by <code>ListFeatureGroups</code>.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results returned by <code>ListFeatureGroups</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFeatureGroupsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token to resume pagination of <code>ListFeatureGroups</code> results.
     * </p>
     * 
     * @param nextToken
     *        A token to resume pagination of <code>ListFeatureGroups</code> results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to resume pagination of <code>ListFeatureGroups</code> results.
     * </p>
     * 
     * @return A token to resume pagination of <code>ListFeatureGroups</code> results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to resume pagination of <code>ListFeatureGroups</code> results.
     * </p>
     * 
     * @param nextToken
     *        A token to resume pagination of <code>ListFeatureGroups</code> results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFeatureGroupsRequest withNextToken(String nextToken) {
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
        if (getFeatureGroupStatusEquals() != null)
            sb.append("FeatureGroupStatusEquals: ").append(getFeatureGroupStatusEquals()).append(",");
        if (getOfflineStoreStatusEquals() != null)
            sb.append("OfflineStoreStatusEquals: ").append(getOfflineStoreStatusEquals()).append(",");
        if (getCreationTimeAfter() != null)
            sb.append("CreationTimeAfter: ").append(getCreationTimeAfter()).append(",");
        if (getCreationTimeBefore() != null)
            sb.append("CreationTimeBefore: ").append(getCreationTimeBefore()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
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

        if (obj instanceof ListFeatureGroupsRequest == false)
            return false;
        ListFeatureGroupsRequest other = (ListFeatureGroupsRequest) obj;
        if (other.getNameContains() == null ^ this.getNameContains() == null)
            return false;
        if (other.getNameContains() != null && other.getNameContains().equals(this.getNameContains()) == false)
            return false;
        if (other.getFeatureGroupStatusEquals() == null ^ this.getFeatureGroupStatusEquals() == null)
            return false;
        if (other.getFeatureGroupStatusEquals() != null && other.getFeatureGroupStatusEquals().equals(this.getFeatureGroupStatusEquals()) == false)
            return false;
        if (other.getOfflineStoreStatusEquals() == null ^ this.getOfflineStoreStatusEquals() == null)
            return false;
        if (other.getOfflineStoreStatusEquals() != null && other.getOfflineStoreStatusEquals().equals(this.getOfflineStoreStatusEquals()) == false)
            return false;
        if (other.getCreationTimeAfter() == null ^ this.getCreationTimeAfter() == null)
            return false;
        if (other.getCreationTimeAfter() != null && other.getCreationTimeAfter().equals(this.getCreationTimeAfter()) == false)
            return false;
        if (other.getCreationTimeBefore() == null ^ this.getCreationTimeBefore() == null)
            return false;
        if (other.getCreationTimeBefore() != null && other.getCreationTimeBefore().equals(this.getCreationTimeBefore()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
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
        hashCode = prime * hashCode + ((getFeatureGroupStatusEquals() == null) ? 0 : getFeatureGroupStatusEquals().hashCode());
        hashCode = prime * hashCode + ((getOfflineStoreStatusEquals() == null) ? 0 : getOfflineStoreStatusEquals().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeAfter() == null) ? 0 : getCreationTimeAfter().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeBefore() == null) ? 0 : getCreationTimeBefore().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListFeatureGroupsRequest clone() {
        return (ListFeatureGroupsRequest) super.clone();
    }

}
