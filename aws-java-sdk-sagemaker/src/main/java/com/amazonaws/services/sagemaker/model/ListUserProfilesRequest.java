/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListUserProfiles" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListUserProfilesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use it in your next request to receive the
     * next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Returns a list up to a specified limit.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The sort order for the results. The default is Ascending.
     * </p>
     */
    private String sortOrder;
    /**
     * <p>
     * The parameter by which to sort the results. The default is CreationTime.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * A parameter by which to filter the results.
     * </p>
     */
    private String domainIdEquals;
    /**
     * <p>
     * A parameter by which to filter the results.
     * </p>
     */
    private String userProfileNameContains;

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use it in your next request to receive the
     * next set of results.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was truncated, you will receive this token. Use it in your next request to
     *        receive the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use it in your next request to receive the
     * next set of results.
     * </p>
     * 
     * @return If the previous response was truncated, you will receive this token. Use it in your next request to
     *         receive the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use it in your next request to receive the
     * next set of results.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was truncated, you will receive this token. Use it in your next request to
     *        receive the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUserProfilesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Returns a list up to a specified limit.
     * </p>
     * 
     * @param maxResults
     *        Returns a list up to a specified limit.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Returns a list up to a specified limit.
     * </p>
     * 
     * @return Returns a list up to a specified limit.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Returns a list up to a specified limit.
     * </p>
     * 
     * @param maxResults
     *        Returns a list up to a specified limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUserProfilesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The sort order for the results. The default is Ascending.
     * </p>
     * 
     * @param sortOrder
     *        The sort order for the results. The default is Ascending.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The sort order for the results. The default is Ascending.
     * </p>
     * 
     * @return The sort order for the results. The default is Ascending.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The sort order for the results. The default is Ascending.
     * </p>
     * 
     * @param sortOrder
     *        The sort order for the results. The default is Ascending.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListUserProfilesRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The sort order for the results. The default is Ascending.
     * </p>
     * 
     * @param sortOrder
     *        The sort order for the results. The default is Ascending.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListUserProfilesRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is CreationTime.
     * </p>
     * 
     * @param sortBy
     *        The parameter by which to sort the results. The default is CreationTime.
     * @see UserProfileSortKey
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is CreationTime.
     * </p>
     * 
     * @return The parameter by which to sort the results. The default is CreationTime.
     * @see UserProfileSortKey
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is CreationTime.
     * </p>
     * 
     * @param sortBy
     *        The parameter by which to sort the results. The default is CreationTime.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserProfileSortKey
     */

    public ListUserProfilesRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is CreationTime.
     * </p>
     * 
     * @param sortBy
     *        The parameter by which to sort the results. The default is CreationTime.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserProfileSortKey
     */

    public ListUserProfilesRequest withSortBy(UserProfileSortKey sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * A parameter by which to filter the results.
     * </p>
     * 
     * @param domainIdEquals
     *        A parameter by which to filter the results.
     */

    public void setDomainIdEquals(String domainIdEquals) {
        this.domainIdEquals = domainIdEquals;
    }

    /**
     * <p>
     * A parameter by which to filter the results.
     * </p>
     * 
     * @return A parameter by which to filter the results.
     */

    public String getDomainIdEquals() {
        return this.domainIdEquals;
    }

    /**
     * <p>
     * A parameter by which to filter the results.
     * </p>
     * 
     * @param domainIdEquals
     *        A parameter by which to filter the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUserProfilesRequest withDomainIdEquals(String domainIdEquals) {
        setDomainIdEquals(domainIdEquals);
        return this;
    }

    /**
     * <p>
     * A parameter by which to filter the results.
     * </p>
     * 
     * @param userProfileNameContains
     *        A parameter by which to filter the results.
     */

    public void setUserProfileNameContains(String userProfileNameContains) {
        this.userProfileNameContains = userProfileNameContains;
    }

    /**
     * <p>
     * A parameter by which to filter the results.
     * </p>
     * 
     * @return A parameter by which to filter the results.
     */

    public String getUserProfileNameContains() {
        return this.userProfileNameContains;
    }

    /**
     * <p>
     * A parameter by which to filter the results.
     * </p>
     * 
     * @param userProfileNameContains
     *        A parameter by which to filter the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUserProfilesRequest withUserProfileNameContains(String userProfileNameContains) {
        setUserProfileNameContains(userProfileNameContains);
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
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getDomainIdEquals() != null)
            sb.append("DomainIdEquals: ").append(getDomainIdEquals()).append(",");
        if (getUserProfileNameContains() != null)
            sb.append("UserProfileNameContains: ").append(getUserProfileNameContains());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListUserProfilesRequest == false)
            return false;
        ListUserProfilesRequest other = (ListUserProfilesRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getDomainIdEquals() == null ^ this.getDomainIdEquals() == null)
            return false;
        if (other.getDomainIdEquals() != null && other.getDomainIdEquals().equals(this.getDomainIdEquals()) == false)
            return false;
        if (other.getUserProfileNameContains() == null ^ this.getUserProfileNameContains() == null)
            return false;
        if (other.getUserProfileNameContains() != null && other.getUserProfileNameContains().equals(this.getUserProfileNameContains()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getDomainIdEquals() == null) ? 0 : getDomainIdEquals().hashCode());
        hashCode = prime * hashCode + ((getUserProfileNameContains() == null) ? 0 : getUserProfileNameContains().hashCode());
        return hashCode;
    }

    @Override
    public ListUserProfilesRequest clone() {
        return (ListUserProfilesRequest) super.clone();
    }

}
