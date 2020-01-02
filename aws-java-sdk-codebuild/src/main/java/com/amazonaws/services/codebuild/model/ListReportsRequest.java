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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListReports" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListReportsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the sort order for the list of returned reports. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: return reports in chronological order based on their creation date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: return reports in the reverse chronological order based on their creation date.
     * </p>
     * </li>
     * </ul>
     */
    private String sortOrder;
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
     * The maximum number of paginated reports returned per response. Use <code>nextToken</code> to iterate pages in the
     * list of returned <code>Report</code> objects. The default value is 100.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A <code>ReportFilter</code> object used to filter the returned reports.
     * </p>
     */
    private ReportFilter filter;

    /**
     * <p>
     * Specifies the sort order for the list of returned reports. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: return reports in chronological order based on their creation date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: return reports in the reverse chronological order based on their creation date.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sortOrder
     *        Specifies the sort order for the list of returned reports. Valid values are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ASCENDING</code>: return reports in chronological order based on their creation date.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DESCENDING</code>: return reports in the reverse chronological order based on their creation date.
     *        </p>
     *        </li>
     * @see SortOrderType
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * Specifies the sort order for the list of returned reports. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: return reports in chronological order based on their creation date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: return reports in the reverse chronological order based on their creation date.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the sort order for the list of returned reports. Valid values are: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ASCENDING</code>: return reports in chronological order based on their creation date.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DESCENDING</code>: return reports in the reverse chronological order based on their creation date.
     *         </p>
     *         </li>
     * @see SortOrderType
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * Specifies the sort order for the list of returned reports. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: return reports in chronological order based on their creation date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: return reports in the reverse chronological order based on their creation date.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sortOrder
     *        Specifies the sort order for the list of returned reports. Valid values are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ASCENDING</code>: return reports in chronological order based on their creation date.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DESCENDING</code>: return reports in the reverse chronological order based on their creation date.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrderType
     */

    public ListReportsRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * Specifies the sort order for the list of returned reports. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: return reports in chronological order based on their creation date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: return reports in the reverse chronological order based on their creation date.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sortOrder
     *        Specifies the sort order for the list of returned reports. Valid values are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ASCENDING</code>: return reports in chronological order based on their creation date.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DESCENDING</code>: return reports in the reverse chronological order based on their creation date.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrderType
     */

    public ListReportsRequest withSortOrder(SortOrderType sortOrder) {
        this.sortOrder = sortOrder.toString();
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

    public ListReportsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of paginated reports returned per response. Use <code>nextToken</code> to iterate pages in the
     * list of returned <code>Report</code> objects. The default value is 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of paginated reports returned per response. Use <code>nextToken</code> to iterate pages
     *        in the list of returned <code>Report</code> objects. The default value is 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of paginated reports returned per response. Use <code>nextToken</code> to iterate pages in the
     * list of returned <code>Report</code> objects. The default value is 100.
     * </p>
     * 
     * @return The maximum number of paginated reports returned per response. Use <code>nextToken</code> to iterate
     *         pages in the list of returned <code>Report</code> objects. The default value is 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of paginated reports returned per response. Use <code>nextToken</code> to iterate pages in the
     * list of returned <code>Report</code> objects. The default value is 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of paginated reports returned per response. Use <code>nextToken</code> to iterate pages
     *        in the list of returned <code>Report</code> objects. The default value is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReportsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A <code>ReportFilter</code> object used to filter the returned reports.
     * </p>
     * 
     * @param filter
     *        A <code>ReportFilter</code> object used to filter the returned reports.
     */

    public void setFilter(ReportFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * A <code>ReportFilter</code> object used to filter the returned reports.
     * </p>
     * 
     * @return A <code>ReportFilter</code> object used to filter the returned reports.
     */

    public ReportFilter getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * A <code>ReportFilter</code> object used to filter the returned reports.
     * </p>
     * 
     * @param filter
     *        A <code>ReportFilter</code> object used to filter the returned reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReportsRequest withFilter(ReportFilter filter) {
        setFilter(filter);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListReportsRequest == false)
            return false;
        ListReportsRequest other = (ListReportsRequest) obj;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        return hashCode;
    }

    @Override
    public ListReportsRequest clone() {
        return (ListReportsRequest) super.clone();
    }

}
