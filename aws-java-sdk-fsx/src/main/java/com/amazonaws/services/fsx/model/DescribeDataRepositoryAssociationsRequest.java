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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeDataRepositoryAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDataRepositoryAssociationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * IDs of the data repository associations whose descriptions you want to retrieve (String).
     * </p>
     */
    private java.util.List<String> associationIds;

    private java.util.List<Filter> filters;
    /**
     * <p>
     * The maximum number of resources to return in the response. This value must be an integer greater than zero.
     * </p>
     */
    private Integer maxResults;

    private String nextToken;

    /**
     * <p>
     * IDs of the data repository associations whose descriptions you want to retrieve (String).
     * </p>
     * 
     * @return IDs of the data repository associations whose descriptions you want to retrieve (String).
     */

    public java.util.List<String> getAssociationIds() {
        return associationIds;
    }

    /**
     * <p>
     * IDs of the data repository associations whose descriptions you want to retrieve (String).
     * </p>
     * 
     * @param associationIds
     *        IDs of the data repository associations whose descriptions you want to retrieve (String).
     */

    public void setAssociationIds(java.util.Collection<String> associationIds) {
        if (associationIds == null) {
            this.associationIds = null;
            return;
        }

        this.associationIds = new java.util.ArrayList<String>(associationIds);
    }

    /**
     * <p>
     * IDs of the data repository associations whose descriptions you want to retrieve (String).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociationIds(java.util.Collection)} or {@link #withAssociationIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param associationIds
     *        IDs of the data repository associations whose descriptions you want to retrieve (String).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataRepositoryAssociationsRequest withAssociationIds(String... associationIds) {
        if (this.associationIds == null) {
            setAssociationIds(new java.util.ArrayList<String>(associationIds.length));
        }
        for (String ele : associationIds) {
            this.associationIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * IDs of the data repository associations whose descriptions you want to retrieve (String).
     * </p>
     * 
     * @param associationIds
     *        IDs of the data repository associations whose descriptions you want to retrieve (String).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataRepositoryAssociationsRequest withAssociationIds(java.util.Collection<String> associationIds) {
        setAssociationIds(associationIds);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * @param filters
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataRepositoryAssociationsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * @param filters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataRepositoryAssociationsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of resources to return in the response. This value must be an integer greater than zero.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of resources to return in the response. This value must be an integer greater than
     *        zero.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of resources to return in the response. This value must be an integer greater than zero.
     * </p>
     * 
     * @return The maximum number of resources to return in the response. This value must be an integer greater than
     *         zero.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of resources to return in the response. This value must be an integer greater than zero.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of resources to return in the response. This value must be an integer greater than
     *        zero.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataRepositoryAssociationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataRepositoryAssociationsRequest withNextToken(String nextToken) {
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
        if (getAssociationIds() != null)
            sb.append("AssociationIds: ").append(getAssociationIds()).append(",");
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

        if (obj instanceof DescribeDataRepositoryAssociationsRequest == false)
            return false;
        DescribeDataRepositoryAssociationsRequest other = (DescribeDataRepositoryAssociationsRequest) obj;
        if (other.getAssociationIds() == null ^ this.getAssociationIds() == null)
            return false;
        if (other.getAssociationIds() != null && other.getAssociationIds().equals(this.getAssociationIds()) == false)
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

        hashCode = prime * hashCode + ((getAssociationIds() == null) ? 0 : getAssociationIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDataRepositoryAssociationsRequest clone() {
        return (DescribeDataRepositoryAssociationsRequest) super.clone();
    }

}
