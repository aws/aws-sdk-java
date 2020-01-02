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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListReportGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListReportGroupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Used to specify the order to sort the list of returned report groups. Valid values are <code>ASCENDING</code> and
     * <code>DESCENDING</code>.
     * </p>
     */
    private String sortOrder;
    /**
     * <p>
     * The criterion to be used to list build report groups. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED_TIME</code>: List based on when each report group was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAST_MODIFIED_TIME</code>: List based on when each report group was last changed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NAME</code>: List based on each report group's name.
     * </p>
     * </li>
     * </ul>
     */
    private String sortBy;
    /**
     * <p>
     * During a previous call, the maximum number of items that can be returned is the value specified in
     * <code>maxResults</code>. If there more items in the list, then a unique string called a <i>nextToken</i> is
     * returned. To get the next batch of items in the list, call this operation again, adding the next token to the
     * call. To get all of the items in the list, keep calling this operation with each subsequent next token that is
     * returned, until no more next tokens are returned.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of paginated report groups returned per response. Use <code>nextToken</code> to iterate pages
     * in the list of returned <code>ReportGroup</code> objects. The default value is 100.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * Used to specify the order to sort the list of returned report groups. Valid values are <code>ASCENDING</code> and
     * <code>DESCENDING</code>.
     * </p>
     * 
     * @param sortOrder
     *        Used to specify the order to sort the list of returned report groups. Valid values are
     *        <code>ASCENDING</code> and <code>DESCENDING</code>.
     * @see SortOrderType
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * Used to specify the order to sort the list of returned report groups. Valid values are <code>ASCENDING</code> and
     * <code>DESCENDING</code>.
     * </p>
     * 
     * @return Used to specify the order to sort the list of returned report groups. Valid values are
     *         <code>ASCENDING</code> and <code>DESCENDING</code>.
     * @see SortOrderType
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * Used to specify the order to sort the list of returned report groups. Valid values are <code>ASCENDING</code> and
     * <code>DESCENDING</code>.
     * </p>
     * 
     * @param sortOrder
     *        Used to specify the order to sort the list of returned report groups. Valid values are
     *        <code>ASCENDING</code> and <code>DESCENDING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrderType
     */

    public ListReportGroupsRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * Used to specify the order to sort the list of returned report groups. Valid values are <code>ASCENDING</code> and
     * <code>DESCENDING</code>.
     * </p>
     * 
     * @param sortOrder
     *        Used to specify the order to sort the list of returned report groups. Valid values are
     *        <code>ASCENDING</code> and <code>DESCENDING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrderType
     */

    public ListReportGroupsRequest withSortOrder(SortOrderType sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * The criterion to be used to list build report groups. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED_TIME</code>: List based on when each report group was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAST_MODIFIED_TIME</code>: List based on when each report group was last changed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NAME</code>: List based on each report group's name.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sortBy
     *        The criterion to be used to list build report groups. Valid values include: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATED_TIME</code>: List based on when each report group was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LAST_MODIFIED_TIME</code>: List based on when each report group was last changed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NAME</code>: List based on each report group's name.
     *        </p>
     *        </li>
     * @see ReportGroupSortByType
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The criterion to be used to list build report groups. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED_TIME</code>: List based on when each report group was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAST_MODIFIED_TIME</code>: List based on when each report group was last changed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NAME</code>: List based on each report group's name.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The criterion to be used to list build report groups. Valid values include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATED_TIME</code>: List based on when each report group was created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LAST_MODIFIED_TIME</code>: List based on when each report group was last changed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NAME</code>: List based on each report group's name.
     *         </p>
     *         </li>
     * @see ReportGroupSortByType
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The criterion to be used to list build report groups. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED_TIME</code>: List based on when each report group was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAST_MODIFIED_TIME</code>: List based on when each report group was last changed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NAME</code>: List based on each report group's name.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sortBy
     *        The criterion to be used to list build report groups. Valid values include: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATED_TIME</code>: List based on when each report group was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LAST_MODIFIED_TIME</code>: List based on when each report group was last changed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NAME</code>: List based on each report group's name.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportGroupSortByType
     */

    public ListReportGroupsRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The criterion to be used to list build report groups. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED_TIME</code>: List based on when each report group was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAST_MODIFIED_TIME</code>: List based on when each report group was last changed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NAME</code>: List based on each report group's name.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sortBy
     *        The criterion to be used to list build report groups. Valid values include: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATED_TIME</code>: List based on when each report group was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LAST_MODIFIED_TIME</code>: List based on when each report group was last changed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NAME</code>: List based on each report group's name.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportGroupSortByType
     */

    public ListReportGroupsRequest withSortBy(ReportGroupSortByType sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * During a previous call, the maximum number of items that can be returned is the value specified in
     * <code>maxResults</code>. If there more items in the list, then a unique string called a <i>nextToken</i> is
     * returned. To get the next batch of items in the list, call this operation again, adding the next token to the
     * call. To get all of the items in the list, keep calling this operation with each subsequent next token that is
     * returned, until no more next tokens are returned.
     * </p>
     * 
     * @param nextToken
     *        During a previous call, the maximum number of items that can be returned is the value specified in
     *        <code>maxResults</code>. If there more items in the list, then a unique string called a <i>nextToken</i>
     *        is returned. To get the next batch of items in the list, call this operation again, adding the next token
     *        to the call. To get all of the items in the list, keep calling this operation with each subsequent next
     *        token that is returned, until no more next tokens are returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * During a previous call, the maximum number of items that can be returned is the value specified in
     * <code>maxResults</code>. If there more items in the list, then a unique string called a <i>nextToken</i> is
     * returned. To get the next batch of items in the list, call this operation again, adding the next token to the
     * call. To get all of the items in the list, keep calling this operation with each subsequent next token that is
     * returned, until no more next tokens are returned.
     * </p>
     * 
     * @return During a previous call, the maximum number of items that can be returned is the value specified in
     *         <code>maxResults</code>. If there more items in the list, then a unique string called a <i>nextToken</i>
     *         is returned. To get the next batch of items in the list, call this operation again, adding the next token
     *         to the call. To get all of the items in the list, keep calling this operation with each subsequent next
     *         token that is returned, until no more next tokens are returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * During a previous call, the maximum number of items that can be returned is the value specified in
     * <code>maxResults</code>. If there more items in the list, then a unique string called a <i>nextToken</i> is
     * returned. To get the next batch of items in the list, call this operation again, adding the next token to the
     * call. To get all of the items in the list, keep calling this operation with each subsequent next token that is
     * returned, until no more next tokens are returned.
     * </p>
     * 
     * @param nextToken
     *        During a previous call, the maximum number of items that can be returned is the value specified in
     *        <code>maxResults</code>. If there more items in the list, then a unique string called a <i>nextToken</i>
     *        is returned. To get the next batch of items in the list, call this operation again, adding the next token
     *        to the call. To get all of the items in the list, keep calling this operation with each subsequent next
     *        token that is returned, until no more next tokens are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReportGroupsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of paginated report groups returned per response. Use <code>nextToken</code> to iterate pages
     * in the list of returned <code>ReportGroup</code> objects. The default value is 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of paginated report groups returned per response. Use <code>nextToken</code> to iterate
     *        pages in the list of returned <code>ReportGroup</code> objects. The default value is 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of paginated report groups returned per response. Use <code>nextToken</code> to iterate pages
     * in the list of returned <code>ReportGroup</code> objects. The default value is 100.
     * </p>
     * 
     * @return The maximum number of paginated report groups returned per response. Use <code>nextToken</code> to
     *         iterate pages in the list of returned <code>ReportGroup</code> objects. The default value is 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of paginated report groups returned per response. Use <code>nextToken</code> to iterate pages
     * in the list of returned <code>ReportGroup</code> objects. The default value is 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of paginated report groups returned per response. Use <code>nextToken</code> to iterate
     *        pages in the list of returned <code>ReportGroup</code> objects. The default value is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReportGroupsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListReportGroupsRequest == false)
            return false;
        ListReportGroupsRequest other = (ListReportGroupsRequest) obj;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListReportGroupsRequest clone() {
        return (ListReportGroupsRequest) super.clone();
    }

}
