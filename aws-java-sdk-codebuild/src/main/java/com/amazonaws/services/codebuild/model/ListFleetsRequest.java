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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListFleets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFleetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * During a previous call, if there are more than 100 items in the list, only the first 100 items are returned,
     * along with a unique string called a <i>nextToken</i>. To get the next batch of items in the list, call this
     * operation again, adding the next token to the call. To get all of the items in the list, keep calling this
     * operation with each subsequent next token that is returned, until no more next tokens are returned.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of paginated compute fleets returned per response. Use <code>nextToken</code> to iterate pages
     * in the list of returned compute fleets.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The order in which to list compute fleets. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: List in ascending order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: List in descending order.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use <code>sortBy</code> to specify the criterion to be used to list compute fleet names.
     * </p>
     */
    private String sortOrder;
    /**
     * <p>
     * The criterion to be used to list compute fleet names. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED_TIME</code>: List based on when each compute fleet was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAST_MODIFIED_TIME</code>: List based on when information about each compute fleet was last changed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NAME</code>: List based on each compute fleet's name.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use <code>sortOrder</code> to specify in what order to list the compute fleet names based on the preceding
     * criteria.
     * </p>
     */
    private String sortBy;

    /**
     * <p>
     * During a previous call, if there are more than 100 items in the list, only the first 100 items are returned,
     * along with a unique string called a <i>nextToken</i>. To get the next batch of items in the list, call this
     * operation again, adding the next token to the call. To get all of the items in the list, keep calling this
     * operation with each subsequent next token that is returned, until no more next tokens are returned.
     * </p>
     * 
     * @param nextToken
     *        During a previous call, if there are more than 100 items in the list, only the first 100 items are
     *        returned, along with a unique string called a <i>nextToken</i>. To get the next batch of items in the
     *        list, call this operation again, adding the next token to the call. To get all of the items in the list,
     *        keep calling this operation with each subsequent next token that is returned, until no more next tokens
     *        are returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * During a previous call, if there are more than 100 items in the list, only the first 100 items are returned,
     * along with a unique string called a <i>nextToken</i>. To get the next batch of items in the list, call this
     * operation again, adding the next token to the call. To get all of the items in the list, keep calling this
     * operation with each subsequent next token that is returned, until no more next tokens are returned.
     * </p>
     * 
     * @return During a previous call, if there are more than 100 items in the list, only the first 100 items are
     *         returned, along with a unique string called a <i>nextToken</i>. To get the next batch of items in the
     *         list, call this operation again, adding the next token to the call. To get all of the items in the list,
     *         keep calling this operation with each subsequent next token that is returned, until no more next tokens
     *         are returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * During a previous call, if there are more than 100 items in the list, only the first 100 items are returned,
     * along with a unique string called a <i>nextToken</i>. To get the next batch of items in the list, call this
     * operation again, adding the next token to the call. To get all of the items in the list, keep calling this
     * operation with each subsequent next token that is returned, until no more next tokens are returned.
     * </p>
     * 
     * @param nextToken
     *        During a previous call, if there are more than 100 items in the list, only the first 100 items are
     *        returned, along with a unique string called a <i>nextToken</i>. To get the next batch of items in the
     *        list, call this operation again, adding the next token to the call. To get all of the items in the list,
     *        keep calling this operation with each subsequent next token that is returned, until no more next tokens
     *        are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFleetsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of paginated compute fleets returned per response. Use <code>nextToken</code> to iterate pages
     * in the list of returned compute fleets.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of paginated compute fleets returned per response. Use <code>nextToken</code> to
     *        iterate pages in the list of returned compute fleets.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of paginated compute fleets returned per response. Use <code>nextToken</code> to iterate pages
     * in the list of returned compute fleets.
     * </p>
     * 
     * @return The maximum number of paginated compute fleets returned per response. Use <code>nextToken</code> to
     *         iterate pages in the list of returned compute fleets.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of paginated compute fleets returned per response. Use <code>nextToken</code> to iterate pages
     * in the list of returned compute fleets.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of paginated compute fleets returned per response. Use <code>nextToken</code> to
     *        iterate pages in the list of returned compute fleets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFleetsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The order in which to list compute fleets. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: List in ascending order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: List in descending order.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use <code>sortBy</code> to specify the criterion to be used to list compute fleet names.
     * </p>
     * 
     * @param sortOrder
     *        The order in which to list compute fleets. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ASCENDING</code>: List in ascending order.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DESCENDING</code>: List in descending order.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Use <code>sortBy</code> to specify the criterion to be used to list compute fleet names.
     * @see SortOrderType
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The order in which to list compute fleets. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: List in ascending order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: List in descending order.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use <code>sortBy</code> to specify the criterion to be used to list compute fleet names.
     * </p>
     * 
     * @return The order in which to list compute fleets. Valid values include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ASCENDING</code>: List in ascending order.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DESCENDING</code>: List in descending order.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Use <code>sortBy</code> to specify the criterion to be used to list compute fleet names.
     * @see SortOrderType
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The order in which to list compute fleets. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: List in ascending order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: List in descending order.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use <code>sortBy</code> to specify the criterion to be used to list compute fleet names.
     * </p>
     * 
     * @param sortOrder
     *        The order in which to list compute fleets. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ASCENDING</code>: List in ascending order.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DESCENDING</code>: List in descending order.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Use <code>sortBy</code> to specify the criterion to be used to list compute fleet names.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrderType
     */

    public ListFleetsRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The order in which to list compute fleets. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: List in ascending order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: List in descending order.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use <code>sortBy</code> to specify the criterion to be used to list compute fleet names.
     * </p>
     * 
     * @param sortOrder
     *        The order in which to list compute fleets. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ASCENDING</code>: List in ascending order.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DESCENDING</code>: List in descending order.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Use <code>sortBy</code> to specify the criterion to be used to list compute fleet names.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrderType
     */

    public ListFleetsRequest withSortOrder(SortOrderType sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * The criterion to be used to list compute fleet names. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED_TIME</code>: List based on when each compute fleet was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAST_MODIFIED_TIME</code>: List based on when information about each compute fleet was last changed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NAME</code>: List based on each compute fleet's name.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use <code>sortOrder</code> to specify in what order to list the compute fleet names based on the preceding
     * criteria.
     * </p>
     * 
     * @param sortBy
     *        The criterion to be used to list compute fleet names. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATED_TIME</code>: List based on when each compute fleet was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LAST_MODIFIED_TIME</code>: List based on when information about each compute fleet was last changed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NAME</code>: List based on each compute fleet's name.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Use <code>sortOrder</code> to specify in what order to list the compute fleet names based on the preceding
     *        criteria.
     * @see FleetSortByType
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The criterion to be used to list compute fleet names. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED_TIME</code>: List based on when each compute fleet was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAST_MODIFIED_TIME</code>: List based on when information about each compute fleet was last changed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NAME</code>: List based on each compute fleet's name.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use <code>sortOrder</code> to specify in what order to list the compute fleet names based on the preceding
     * criteria.
     * </p>
     * 
     * @return The criterion to be used to list compute fleet names. Valid values include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATED_TIME</code>: List based on when each compute fleet was created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LAST_MODIFIED_TIME</code>: List based on when information about each compute fleet was last
     *         changed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NAME</code>: List based on each compute fleet's name.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Use <code>sortOrder</code> to specify in what order to list the compute fleet names based on the
     *         preceding criteria.
     * @see FleetSortByType
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The criterion to be used to list compute fleet names. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED_TIME</code>: List based on when each compute fleet was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAST_MODIFIED_TIME</code>: List based on when information about each compute fleet was last changed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NAME</code>: List based on each compute fleet's name.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use <code>sortOrder</code> to specify in what order to list the compute fleet names based on the preceding
     * criteria.
     * </p>
     * 
     * @param sortBy
     *        The criterion to be used to list compute fleet names. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATED_TIME</code>: List based on when each compute fleet was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LAST_MODIFIED_TIME</code>: List based on when information about each compute fleet was last changed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NAME</code>: List based on each compute fleet's name.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Use <code>sortOrder</code> to specify in what order to list the compute fleet names based on the preceding
     *        criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetSortByType
     */

    public ListFleetsRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The criterion to be used to list compute fleet names. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED_TIME</code>: List based on when each compute fleet was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAST_MODIFIED_TIME</code>: List based on when information about each compute fleet was last changed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NAME</code>: List based on each compute fleet's name.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use <code>sortOrder</code> to specify in what order to list the compute fleet names based on the preceding
     * criteria.
     * </p>
     * 
     * @param sortBy
     *        The criterion to be used to list compute fleet names. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATED_TIME</code>: List based on when each compute fleet was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LAST_MODIFIED_TIME</code>: List based on when information about each compute fleet was last changed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NAME</code>: List based on each compute fleet's name.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Use <code>sortOrder</code> to specify in what order to list the compute fleet names based on the preceding
     *        criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetSortByType
     */

    public ListFleetsRequest withSortBy(FleetSortByType sortBy) {
        this.sortBy = sortBy.toString();
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
            sb.append("NextToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFleetsRequest == false)
            return false;
        ListFleetsRequest other = (ListFleetsRequest) obj;
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
        return hashCode;
    }

    @Override
    public ListFleetsRequest clone() {
        return (ListFleetsRequest) super.clone();
    }

}
