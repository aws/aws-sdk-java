/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListProjectMemberships" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProjectMembershipsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which you want to list project memberships.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The maximum number of memberships to return in a single call to <code>ListProjectMemberships</code>. When the
     * number of memberships to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     * <code>NextToken</code> value that you can use in a subsequent call to <code>ListProjectMemberships</code> to list
     * the next set of memberships.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * When the number of memberships is greater than the default value for the <code>MaxResults</code> parameter, or if
     * you explicitly specify a value for <code>MaxResults</code> that is less than the number of memberships, the
     * response includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code>
     * value in a subsequent call to <code>ListProjectMemberships</code> to list the next set of memberships.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The identifier of the project whose memberships you want to list.
     * </p>
     */
    private String projectIdentifier;
    /**
     * <p>
     * The method by which you want to sort the project memberships.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * The sort order of the project memberships.
     * </p>
     */
    private String sortOrder;

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which you want to list project memberships.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain in which you want to list project memberships.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which you want to list project memberships.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone domain in which you want to list project memberships.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which you want to list project memberships.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain in which you want to list project memberships.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProjectMembershipsRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The maximum number of memberships to return in a single call to <code>ListProjectMemberships</code>. When the
     * number of memberships to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     * <code>NextToken</code> value that you can use in a subsequent call to <code>ListProjectMemberships</code> to list
     * the next set of memberships.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of memberships to return in a single call to <code>ListProjectMemberships</code>. When
     *        the number of memberships to be listed is greater than the value of <code>MaxResults</code>, the response
     *        contains a <code>NextToken</code> value that you can use in a subsequent call to
     *        <code>ListProjectMemberships</code> to list the next set of memberships.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of memberships to return in a single call to <code>ListProjectMemberships</code>. When the
     * number of memberships to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     * <code>NextToken</code> value that you can use in a subsequent call to <code>ListProjectMemberships</code> to list
     * the next set of memberships.
     * </p>
     * 
     * @return The maximum number of memberships to return in a single call to <code>ListProjectMemberships</code>. When
     *         the number of memberships to be listed is greater than the value of <code>MaxResults</code>, the response
     *         contains a <code>NextToken</code> value that you can use in a subsequent call to
     *         <code>ListProjectMemberships</code> to list the next set of memberships.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of memberships to return in a single call to <code>ListProjectMemberships</code>. When the
     * number of memberships to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     * <code>NextToken</code> value that you can use in a subsequent call to <code>ListProjectMemberships</code> to list
     * the next set of memberships.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of memberships to return in a single call to <code>ListProjectMemberships</code>. When
     *        the number of memberships to be listed is greater than the value of <code>MaxResults</code>, the response
     *        contains a <code>NextToken</code> value that you can use in a subsequent call to
     *        <code>ListProjectMemberships</code> to list the next set of memberships.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProjectMembershipsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * When the number of memberships is greater than the default value for the <code>MaxResults</code> parameter, or if
     * you explicitly specify a value for <code>MaxResults</code> that is less than the number of memberships, the
     * response includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code>
     * value in a subsequent call to <code>ListProjectMemberships</code> to list the next set of memberships.
     * </p>
     * 
     * @param nextToken
     *        When the number of memberships is greater than the default value for the <code>MaxResults</code>
     *        parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number
     *        of memberships, the response includes a pagination token named <code>NextToken</code>. You can specify
     *        this <code>NextToken</code> value in a subsequent call to <code>ListProjectMemberships</code> to list the
     *        next set of memberships.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When the number of memberships is greater than the default value for the <code>MaxResults</code> parameter, or if
     * you explicitly specify a value for <code>MaxResults</code> that is less than the number of memberships, the
     * response includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code>
     * value in a subsequent call to <code>ListProjectMemberships</code> to list the next set of memberships.
     * </p>
     * 
     * @return When the number of memberships is greater than the default value for the <code>MaxResults</code>
     *         parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number
     *         of memberships, the response includes a pagination token named <code>NextToken</code>. You can specify
     *         this <code>NextToken</code> value in a subsequent call to <code>ListProjectMemberships</code> to list the
     *         next set of memberships.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When the number of memberships is greater than the default value for the <code>MaxResults</code> parameter, or if
     * you explicitly specify a value for <code>MaxResults</code> that is less than the number of memberships, the
     * response includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code>
     * value in a subsequent call to <code>ListProjectMemberships</code> to list the next set of memberships.
     * </p>
     * 
     * @param nextToken
     *        When the number of memberships is greater than the default value for the <code>MaxResults</code>
     *        parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number
     *        of memberships, the response includes a pagination token named <code>NextToken</code>. You can specify
     *        this <code>NextToken</code> value in a subsequent call to <code>ListProjectMemberships</code> to list the
     *        next set of memberships.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProjectMembershipsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The identifier of the project whose memberships you want to list.
     * </p>
     * 
     * @param projectIdentifier
     *        The identifier of the project whose memberships you want to list.
     */

    public void setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    /**
     * <p>
     * The identifier of the project whose memberships you want to list.
     * </p>
     * 
     * @return The identifier of the project whose memberships you want to list.
     */

    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

    /**
     * <p>
     * The identifier of the project whose memberships you want to list.
     * </p>
     * 
     * @param projectIdentifier
     *        The identifier of the project whose memberships you want to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProjectMembershipsRequest withProjectIdentifier(String projectIdentifier) {
        setProjectIdentifier(projectIdentifier);
        return this;
    }

    /**
     * <p>
     * The method by which you want to sort the project memberships.
     * </p>
     * 
     * @param sortBy
     *        The method by which you want to sort the project memberships.
     * @see SortFieldProject
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The method by which you want to sort the project memberships.
     * </p>
     * 
     * @return The method by which you want to sort the project memberships.
     * @see SortFieldProject
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The method by which you want to sort the project memberships.
     * </p>
     * 
     * @param sortBy
     *        The method by which you want to sort the project memberships.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortFieldProject
     */

    public ListProjectMembershipsRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The method by which you want to sort the project memberships.
     * </p>
     * 
     * @param sortBy
     *        The method by which you want to sort the project memberships.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortFieldProject
     */

    public ListProjectMembershipsRequest withSortBy(SortFieldProject sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The sort order of the project memberships.
     * </p>
     * 
     * @param sortOrder
     *        The sort order of the project memberships.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The sort order of the project memberships.
     * </p>
     * 
     * @return The sort order of the project memberships.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The sort order of the project memberships.
     * </p>
     * 
     * @param sortOrder
     *        The sort order of the project memberships.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListProjectMembershipsRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The sort order of the project memberships.
     * </p>
     * 
     * @param sortOrder
     *        The sort order of the project memberships.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListProjectMembershipsRequest withSortOrder(SortOrder sortOrder) {
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
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getProjectIdentifier() != null)
            sb.append("ProjectIdentifier: ").append(getProjectIdentifier()).append(",");
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

        if (obj instanceof ListProjectMembershipsRequest == false)
            return false;
        ListProjectMembershipsRequest other = (ListProjectMembershipsRequest) obj;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getProjectIdentifier() == null ^ this.getProjectIdentifier() == null)
            return false;
        if (other.getProjectIdentifier() != null && other.getProjectIdentifier().equals(this.getProjectIdentifier()) == false)
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

        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getProjectIdentifier() == null) ? 0 : getProjectIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public ListProjectMembershipsRequest clone() {
        return (ListProjectMembershipsRequest) super.clone();
    }

}
