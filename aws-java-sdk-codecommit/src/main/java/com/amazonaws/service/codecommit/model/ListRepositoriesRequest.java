/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.service.codecommit.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a list repositories operation.
 * </p>
 */
public class ListRepositoriesRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * An enumeration token that allows the operation to batch the results of
     * the operation. Batch sizes are 1,000 for list repository operations. When
     * the client sends the token back to AWS CodeCommit, another page of 1,000
     * records is retrieved.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The criteria used to sort the results of a list repositories operation.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * The order in which to sort the results of a list repositories operation.
     * </p>
     */
    private String order;

    /**
     * <p>
     * An enumeration token that allows the operation to batch the results of
     * the operation. Batch sizes are 1,000 for list repository operations. When
     * the client sends the token back to AWS CodeCommit, another page of 1,000
     * records is retrieved.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that allows the operation to batch the
     *        results of the operation. Batch sizes are 1,000 for list
     *        repository operations. When the client sends the token back to AWS
     *        CodeCommit, another page of 1,000 records is retrieved.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An enumeration token that allows the operation to batch the results of
     * the operation. Batch sizes are 1,000 for list repository operations. When
     * the client sends the token back to AWS CodeCommit, another page of 1,000
     * records is retrieved.
     * </p>
     * 
     * @return An enumeration token that allows the operation to batch the
     *         results of the operation. Batch sizes are 1,000 for list
     *         repository operations. When the client sends the token back to
     *         AWS CodeCommit, another page of 1,000 records is retrieved.
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An enumeration token that allows the operation to batch the results of
     * the operation. Batch sizes are 1,000 for list repository operations. When
     * the client sends the token back to AWS CodeCommit, another page of 1,000
     * records is retrieved.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that allows the operation to batch the
     *        results of the operation. Batch sizes are 1,000 for list
     *        repository operations. When the client sends the token back to AWS
     *        CodeCommit, another page of 1,000 records is retrieved.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListRepositoriesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The criteria used to sort the results of a list repositories operation.
     * </p>
     * 
     * @param sortBy
     *        The criteria used to sort the results of a list repositories
     *        operation.
     * @see SortByEnum
     */
    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The criteria used to sort the results of a list repositories operation.
     * </p>
     * 
     * @return The criteria used to sort the results of a list repositories
     *         operation.
     * @see SortByEnum
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The criteria used to sort the results of a list repositories operation.
     * </p>
     * 
     * @param sortBy
     *        The criteria used to sort the results of a list repositories
     *        operation.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see SortByEnum
     */
    public ListRepositoriesRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The criteria used to sort the results of a list repositories operation.
     * </p>
     * 
     * @param sortBy
     *        The criteria used to sort the results of a list repositories
     *        operation.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see SortByEnum
     */
    public void setSortBy(SortByEnum sortBy) {
        this.sortBy = sortBy.toString();
    }

    /**
     * <p>
     * The criteria used to sort the results of a list repositories operation.
     * </p>
     * 
     * @param sortBy
     *        The criteria used to sort the results of a list repositories
     *        operation.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see SortByEnum
     */
    public ListRepositoriesRequest withSortBy(SortByEnum sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The order in which to sort the results of a list repositories operation.
     * </p>
     * 
     * @param order
     *        The order in which to sort the results of a list repositories
     *        operation.
     * @see OrderEnum
     */
    public void setOrder(String order) {
        this.order = order;
    }

    /**
     * <p>
     * The order in which to sort the results of a list repositories operation.
     * </p>
     * 
     * @return The order in which to sort the results of a list repositories
     *         operation.
     * @see OrderEnum
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * <p>
     * The order in which to sort the results of a list repositories operation.
     * </p>
     * 
     * @param order
     *        The order in which to sort the results of a list repositories
     *        operation.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see OrderEnum
     */
    public ListRepositoriesRequest withOrder(String order) {
        setOrder(order);
        return this;
    }

    /**
     * <p>
     * The order in which to sort the results of a list repositories operation.
     * </p>
     * 
     * @param order
     *        The order in which to sort the results of a list repositories
     *        operation.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see OrderEnum
     */
    public void setOrder(OrderEnum order) {
        this.order = order.toString();
    }

    /**
     * <p>
     * The order in which to sort the results of a list repositories operation.
     * </p>
     * 
     * @param order
     *        The order in which to sort the results of a list repositories
     *        operation.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see OrderEnum
     */
    public ListRepositoriesRequest withOrder(OrderEnum order) {
        setOrder(order);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
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
            sb.append("NextToken: " + getNextToken() + ",");
        if (getSortBy() != null)
            sb.append("SortBy: " + getSortBy() + ",");
        if (getOrder() != null)
            sb.append("Order: " + getOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRepositoriesRequest == false)
            return false;
        ListRepositoriesRequest other = (ListRepositoriesRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null
                && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getOrder() == null ^ this.getOrder() == null)
            return false;
        if (other.getOrder() != null
                && other.getOrder().equals(this.getOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode
                + ((getOrder() == null) ? 0 : getOrder().hashCode());
        return hashCode;
    }

    @Override
    public ListRepositoriesRequest clone() {
        return (ListRepositoriesRequest) super.clone();
    }
}