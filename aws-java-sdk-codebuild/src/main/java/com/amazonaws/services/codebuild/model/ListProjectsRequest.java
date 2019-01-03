/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListProjects" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProjectsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The criterion to be used to list build project names. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED_TIME</code>: List based on when each build project was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAST_MODIFIED_TIME</code>: List based on when information about each build project was last changed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NAME</code>: List based on each build project's name.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use <code>sortOrder</code> to specify in what order to list the build project names based on the preceding
     * criteria.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * The order in which to list build projects. Valid values include:
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
     * Use <code>sortBy</code> to specify the criterion to be used to list build project names.
     * </p>
     */
    private String sortOrder;
    /**
     * <p>
     * During a previous call, if there are more than 100 items in the list, only the first 100 items are returned,
     * along with a unique string called a <i>next token</i>. To get the next batch of items in the list, call this
     * operation again, adding the next token to the call. To get all of the items in the list, keep calling this
     * operation with each subsequent next token that is returned, until no more next tokens are returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The criterion to be used to list build project names. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED_TIME</code>: List based on when each build project was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAST_MODIFIED_TIME</code>: List based on when information about each build project was last changed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NAME</code>: List based on each build project's name.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use <code>sortOrder</code> to specify in what order to list the build project names based on the preceding
     * criteria.
     * </p>
     * 
     * @param sortBy
     *        The criterion to be used to list build project names. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATED_TIME</code>: List based on when each build project was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LAST_MODIFIED_TIME</code>: List based on when information about each build project was last changed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NAME</code>: List based on each build project's name.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Use <code>sortOrder</code> to specify in what order to list the build project names based on the preceding
     *        criteria.
     * @see ProjectSortByType
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The criterion to be used to list build project names. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED_TIME</code>: List based on when each build project was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAST_MODIFIED_TIME</code>: List based on when information about each build project was last changed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NAME</code>: List based on each build project's name.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use <code>sortOrder</code> to specify in what order to list the build project names based on the preceding
     * criteria.
     * </p>
     * 
     * @return The criterion to be used to list build project names. Valid values include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATED_TIME</code>: List based on when each build project was created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LAST_MODIFIED_TIME</code>: List based on when information about each build project was last
     *         changed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NAME</code>: List based on each build project's name.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Use <code>sortOrder</code> to specify in what order to list the build project names based on the
     *         preceding criteria.
     * @see ProjectSortByType
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The criterion to be used to list build project names. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED_TIME</code>: List based on when each build project was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAST_MODIFIED_TIME</code>: List based on when information about each build project was last changed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NAME</code>: List based on each build project's name.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use <code>sortOrder</code> to specify in what order to list the build project names based on the preceding
     * criteria.
     * </p>
     * 
     * @param sortBy
     *        The criterion to be used to list build project names. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATED_TIME</code>: List based on when each build project was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LAST_MODIFIED_TIME</code>: List based on when information about each build project was last changed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NAME</code>: List based on each build project's name.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Use <code>sortOrder</code> to specify in what order to list the build project names based on the preceding
     *        criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProjectSortByType
     */

    public ListProjectsRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The criterion to be used to list build project names. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED_TIME</code>: List based on when each build project was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAST_MODIFIED_TIME</code>: List based on when information about each build project was last changed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NAME</code>: List based on each build project's name.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use <code>sortOrder</code> to specify in what order to list the build project names based on the preceding
     * criteria.
     * </p>
     * 
     * @param sortBy
     *        The criterion to be used to list build project names. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATED_TIME</code>: List based on when each build project was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LAST_MODIFIED_TIME</code>: List based on when information about each build project was last changed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NAME</code>: List based on each build project's name.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Use <code>sortOrder</code> to specify in what order to list the build project names based on the preceding
     *        criteria.
     * @see ProjectSortByType
     */

    public void setSortBy(ProjectSortByType sortBy) {
        withSortBy(sortBy);
    }

    /**
     * <p>
     * The criterion to be used to list build project names. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED_TIME</code>: List based on when each build project was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAST_MODIFIED_TIME</code>: List based on when information about each build project was last changed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NAME</code>: List based on each build project's name.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use <code>sortOrder</code> to specify in what order to list the build project names based on the preceding
     * criteria.
     * </p>
     * 
     * @param sortBy
     *        The criterion to be used to list build project names. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATED_TIME</code>: List based on when each build project was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LAST_MODIFIED_TIME</code>: List based on when information about each build project was last changed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NAME</code>: List based on each build project's name.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Use <code>sortOrder</code> to specify in what order to list the build project names based on the preceding
     *        criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProjectSortByType
     */

    public ListProjectsRequest withSortBy(ProjectSortByType sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The order in which to list build projects. Valid values include:
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
     * Use <code>sortBy</code> to specify the criterion to be used to list build project names.
     * </p>
     * 
     * @param sortOrder
     *        The order in which to list build projects. Valid values include:</p>
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
     *        Use <code>sortBy</code> to specify the criterion to be used to list build project names.
     * @see SortOrderType
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The order in which to list build projects. Valid values include:
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
     * Use <code>sortBy</code> to specify the criterion to be used to list build project names.
     * </p>
     * 
     * @return The order in which to list build projects. Valid values include:</p>
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
     *         Use <code>sortBy</code> to specify the criterion to be used to list build project names.
     * @see SortOrderType
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The order in which to list build projects. Valid values include:
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
     * Use <code>sortBy</code> to specify the criterion to be used to list build project names.
     * </p>
     * 
     * @param sortOrder
     *        The order in which to list build projects. Valid values include:</p>
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
     *        Use <code>sortBy</code> to specify the criterion to be used to list build project names.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrderType
     */

    public ListProjectsRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The order in which to list build projects. Valid values include:
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
     * Use <code>sortBy</code> to specify the criterion to be used to list build project names.
     * </p>
     * 
     * @param sortOrder
     *        The order in which to list build projects. Valid values include:</p>
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
     *        Use <code>sortBy</code> to specify the criterion to be used to list build project names.
     * @see SortOrderType
     */

    public void setSortOrder(SortOrderType sortOrder) {
        withSortOrder(sortOrder);
    }

    /**
     * <p>
     * The order in which to list build projects. Valid values include:
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
     * Use <code>sortBy</code> to specify the criterion to be used to list build project names.
     * </p>
     * 
     * @param sortOrder
     *        The order in which to list build projects. Valid values include:</p>
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
     *        Use <code>sortBy</code> to specify the criterion to be used to list build project names.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrderType
     */

    public ListProjectsRequest withSortOrder(SortOrderType sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * During a previous call, if there are more than 100 items in the list, only the first 100 items are returned,
     * along with a unique string called a <i>next token</i>. To get the next batch of items in the list, call this
     * operation again, adding the next token to the call. To get all of the items in the list, keep calling this
     * operation with each subsequent next token that is returned, until no more next tokens are returned.
     * </p>
     * 
     * @param nextToken
     *        During a previous call, if there are more than 100 items in the list, only the first 100 items are
     *        returned, along with a unique string called a <i>next token</i>. To get the next batch of items in the
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
     * along with a unique string called a <i>next token</i>. To get the next batch of items in the list, call this
     * operation again, adding the next token to the call. To get all of the items in the list, keep calling this
     * operation with each subsequent next token that is returned, until no more next tokens are returned.
     * </p>
     * 
     * @return During a previous call, if there are more than 100 items in the list, only the first 100 items are
     *         returned, along with a unique string called a <i>next token</i>. To get the next batch of items in the
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
     * along with a unique string called a <i>next token</i>. To get the next batch of items in the list, call this
     * operation again, adding the next token to the call. To get all of the items in the list, keep calling this
     * operation with each subsequent next token that is returned, until no more next tokens are returned.
     * </p>
     * 
     * @param nextToken
     *        During a previous call, if there are more than 100 items in the list, only the first 100 items are
     *        returned, along with a unique string called a <i>next token</i>. To get the next batch of items in the
     *        list, call this operation again, adding the next token to the call. To get all of the items in the list,
     *        keep calling this operation with each subsequent next token that is returned, until no more next tokens
     *        are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProjectsRequest withNextToken(String nextToken) {
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
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder()).append(",");
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

        if (obj instanceof ListProjectsRequest == false)
            return false;
        ListProjectsRequest other = (ListProjectsRequest) obj;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
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

        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListProjectsRequest clone() {
        return (ListProjectsRequest) super.clone();
    }

}
