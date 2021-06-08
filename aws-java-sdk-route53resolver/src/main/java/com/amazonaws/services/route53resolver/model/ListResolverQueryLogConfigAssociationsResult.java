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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverQueryLogConfigAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResolverQueryLogConfigAssociationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * If there are more than <code>MaxResults</code> query logging associations, you can submit another
     * <code>ListResolverQueryLogConfigAssociations</code> request to get the next group of associations. In the next
     * request, specify the value of <code>NextToken</code> from the previous response.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The total number of query logging associations that were created by the current account in the specified Region.
     * This count can differ from the number of associations that are returned in a
     * <code>ListResolverQueryLogConfigAssociations</code> response, depending on the values that you specify in the
     * request.
     * </p>
     */
    private Integer totalCount;
    /**
     * <p>
     * The total number of query logging associations that were created by the current account in the specified Region
     * and that match the filters that were specified in the <code>ListResolverQueryLogConfigAssociations</code>
     * request. For the total number of associations that were created by the current account in the specified Region,
     * see <code>TotalCount</code>.
     * </p>
     */
    private Integer totalFilteredCount;
    /**
     * <p>
     * A list that contains one <code>ResolverQueryLogConfigAssociations</code> element for each query logging
     * association that matches the values that you specified for <code>Filter</code>.
     * </p>
     */
    private java.util.List<ResolverQueryLogConfigAssociation> resolverQueryLogConfigAssociations;

    /**
     * <p>
     * If there are more than <code>MaxResults</code> query logging associations, you can submit another
     * <code>ListResolverQueryLogConfigAssociations</code> request to get the next group of associations. In the next
     * request, specify the value of <code>NextToken</code> from the previous response.
     * </p>
     * 
     * @param nextToken
     *        If there are more than <code>MaxResults</code> query logging associations, you can submit another
     *        <code>ListResolverQueryLogConfigAssociations</code> request to get the next group of associations. In the
     *        next request, specify the value of <code>NextToken</code> from the previous response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more than <code>MaxResults</code> query logging associations, you can submit another
     * <code>ListResolverQueryLogConfigAssociations</code> request to get the next group of associations. In the next
     * request, specify the value of <code>NextToken</code> from the previous response.
     * </p>
     * 
     * @return If there are more than <code>MaxResults</code> query logging associations, you can submit another
     *         <code>ListResolverQueryLogConfigAssociations</code> request to get the next group of associations. In the
     *         next request, specify the value of <code>NextToken</code> from the previous response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are more than <code>MaxResults</code> query logging associations, you can submit another
     * <code>ListResolverQueryLogConfigAssociations</code> request to get the next group of associations. In the next
     * request, specify the value of <code>NextToken</code> from the previous response.
     * </p>
     * 
     * @param nextToken
     *        If there are more than <code>MaxResults</code> query logging associations, you can submit another
     *        <code>ListResolverQueryLogConfigAssociations</code> request to get the next group of associations. In the
     *        next request, specify the value of <code>NextToken</code> from the previous response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverQueryLogConfigAssociationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The total number of query logging associations that were created by the current account in the specified Region.
     * This count can differ from the number of associations that are returned in a
     * <code>ListResolverQueryLogConfigAssociations</code> response, depending on the values that you specify in the
     * request.
     * </p>
     * 
     * @param totalCount
     *        The total number of query logging associations that were created by the current account in the specified
     *        Region. This count can differ from the number of associations that are returned in a
     *        <code>ListResolverQueryLogConfigAssociations</code> response, depending on the values that you specify in
     *        the request.
     */

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * <p>
     * The total number of query logging associations that were created by the current account in the specified Region.
     * This count can differ from the number of associations that are returned in a
     * <code>ListResolverQueryLogConfigAssociations</code> response, depending on the values that you specify in the
     * request.
     * </p>
     * 
     * @return The total number of query logging associations that were created by the current account in the specified
     *         Region. This count can differ from the number of associations that are returned in a
     *         <code>ListResolverQueryLogConfigAssociations</code> response, depending on the values that you specify in
     *         the request.
     */

    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * <p>
     * The total number of query logging associations that were created by the current account in the specified Region.
     * This count can differ from the number of associations that are returned in a
     * <code>ListResolverQueryLogConfigAssociations</code> response, depending on the values that you specify in the
     * request.
     * </p>
     * 
     * @param totalCount
     *        The total number of query logging associations that were created by the current account in the specified
     *        Region. This count can differ from the number of associations that are returned in a
     *        <code>ListResolverQueryLogConfigAssociations</code> response, depending on the values that you specify in
     *        the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverQueryLogConfigAssociationsResult withTotalCount(Integer totalCount) {
        setTotalCount(totalCount);
        return this;
    }

    /**
     * <p>
     * The total number of query logging associations that were created by the current account in the specified Region
     * and that match the filters that were specified in the <code>ListResolverQueryLogConfigAssociations</code>
     * request. For the total number of associations that were created by the current account in the specified Region,
     * see <code>TotalCount</code>.
     * </p>
     * 
     * @param totalFilteredCount
     *        The total number of query logging associations that were created by the current account in the specified
     *        Region and that match the filters that were specified in the
     *        <code>ListResolverQueryLogConfigAssociations</code> request. For the total number of associations that
     *        were created by the current account in the specified Region, see <code>TotalCount</code>.
     */

    public void setTotalFilteredCount(Integer totalFilteredCount) {
        this.totalFilteredCount = totalFilteredCount;
    }

    /**
     * <p>
     * The total number of query logging associations that were created by the current account in the specified Region
     * and that match the filters that were specified in the <code>ListResolverQueryLogConfigAssociations</code>
     * request. For the total number of associations that were created by the current account in the specified Region,
     * see <code>TotalCount</code>.
     * </p>
     * 
     * @return The total number of query logging associations that were created by the current account in the specified
     *         Region and that match the filters that were specified in the
     *         <code>ListResolverQueryLogConfigAssociations</code> request. For the total number of associations that
     *         were created by the current account in the specified Region, see <code>TotalCount</code>.
     */

    public Integer getTotalFilteredCount() {
        return this.totalFilteredCount;
    }

    /**
     * <p>
     * The total number of query logging associations that were created by the current account in the specified Region
     * and that match the filters that were specified in the <code>ListResolverQueryLogConfigAssociations</code>
     * request. For the total number of associations that were created by the current account in the specified Region,
     * see <code>TotalCount</code>.
     * </p>
     * 
     * @param totalFilteredCount
     *        The total number of query logging associations that were created by the current account in the specified
     *        Region and that match the filters that were specified in the
     *        <code>ListResolverQueryLogConfigAssociations</code> request. For the total number of associations that
     *        were created by the current account in the specified Region, see <code>TotalCount</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverQueryLogConfigAssociationsResult withTotalFilteredCount(Integer totalFilteredCount) {
        setTotalFilteredCount(totalFilteredCount);
        return this;
    }

    /**
     * <p>
     * A list that contains one <code>ResolverQueryLogConfigAssociations</code> element for each query logging
     * association that matches the values that you specified for <code>Filter</code>.
     * </p>
     * 
     * @return A list that contains one <code>ResolverQueryLogConfigAssociations</code> element for each query logging
     *         association that matches the values that you specified for <code>Filter</code>.
     */

    public java.util.List<ResolverQueryLogConfigAssociation> getResolverQueryLogConfigAssociations() {
        return resolverQueryLogConfigAssociations;
    }

    /**
     * <p>
     * A list that contains one <code>ResolverQueryLogConfigAssociations</code> element for each query logging
     * association that matches the values that you specified for <code>Filter</code>.
     * </p>
     * 
     * @param resolverQueryLogConfigAssociations
     *        A list that contains one <code>ResolverQueryLogConfigAssociations</code> element for each query logging
     *        association that matches the values that you specified for <code>Filter</code>.
     */

    public void setResolverQueryLogConfigAssociations(java.util.Collection<ResolverQueryLogConfigAssociation> resolverQueryLogConfigAssociations) {
        if (resolverQueryLogConfigAssociations == null) {
            this.resolverQueryLogConfigAssociations = null;
            return;
        }

        this.resolverQueryLogConfigAssociations = new java.util.ArrayList<ResolverQueryLogConfigAssociation>(resolverQueryLogConfigAssociations);
    }

    /**
     * <p>
     * A list that contains one <code>ResolverQueryLogConfigAssociations</code> element for each query logging
     * association that matches the values that you specified for <code>Filter</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResolverQueryLogConfigAssociations(java.util.Collection)} or
     * {@link #withResolverQueryLogConfigAssociations(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param resolverQueryLogConfigAssociations
     *        A list that contains one <code>ResolverQueryLogConfigAssociations</code> element for each query logging
     *        association that matches the values that you specified for <code>Filter</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverQueryLogConfigAssociationsResult withResolverQueryLogConfigAssociations(
            ResolverQueryLogConfigAssociation... resolverQueryLogConfigAssociations) {
        if (this.resolverQueryLogConfigAssociations == null) {
            setResolverQueryLogConfigAssociations(new java.util.ArrayList<ResolverQueryLogConfigAssociation>(resolverQueryLogConfigAssociations.length));
        }
        for (ResolverQueryLogConfigAssociation ele : resolverQueryLogConfigAssociations) {
            this.resolverQueryLogConfigAssociations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that contains one <code>ResolverQueryLogConfigAssociations</code> element for each query logging
     * association that matches the values that you specified for <code>Filter</code>.
     * </p>
     * 
     * @param resolverQueryLogConfigAssociations
     *        A list that contains one <code>ResolverQueryLogConfigAssociations</code> element for each query logging
     *        association that matches the values that you specified for <code>Filter</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverQueryLogConfigAssociationsResult withResolverQueryLogConfigAssociations(
            java.util.Collection<ResolverQueryLogConfigAssociation> resolverQueryLogConfigAssociations) {
        setResolverQueryLogConfigAssociations(resolverQueryLogConfigAssociations);
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
        if (getTotalCount() != null)
            sb.append("TotalCount: ").append(getTotalCount()).append(",");
        if (getTotalFilteredCount() != null)
            sb.append("TotalFilteredCount: ").append(getTotalFilteredCount()).append(",");
        if (getResolverQueryLogConfigAssociations() != null)
            sb.append("ResolverQueryLogConfigAssociations: ").append(getResolverQueryLogConfigAssociations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListResolverQueryLogConfigAssociationsResult == false)
            return false;
        ListResolverQueryLogConfigAssociationsResult other = (ListResolverQueryLogConfigAssociationsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTotalCount() == null ^ this.getTotalCount() == null)
            return false;
        if (other.getTotalCount() != null && other.getTotalCount().equals(this.getTotalCount()) == false)
            return false;
        if (other.getTotalFilteredCount() == null ^ this.getTotalFilteredCount() == null)
            return false;
        if (other.getTotalFilteredCount() != null && other.getTotalFilteredCount().equals(this.getTotalFilteredCount()) == false)
            return false;
        if (other.getResolverQueryLogConfigAssociations() == null ^ this.getResolverQueryLogConfigAssociations() == null)
            return false;
        if (other.getResolverQueryLogConfigAssociations() != null
                && other.getResolverQueryLogConfigAssociations().equals(this.getResolverQueryLogConfigAssociations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTotalCount() == null) ? 0 : getTotalCount().hashCode());
        hashCode = prime * hashCode + ((getTotalFilteredCount() == null) ? 0 : getTotalFilteredCount().hashCode());
        hashCode = prime * hashCode + ((getResolverQueryLogConfigAssociations() == null) ? 0 : getResolverQueryLogConfigAssociations().hashCode());
        return hashCode;
    }

    @Override
    public ListResolverQueryLogConfigAssociationsResult clone() {
        try {
            return (ListResolverQueryLogConfigAssociationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
