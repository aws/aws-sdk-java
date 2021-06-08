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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/ListTimelineEvents" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTimelineEventsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Filters the timeline events based on the provided conditional values. You can filter timeline events using the
     * following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>eventTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>eventType</code>
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident that the event is part of.
     * </p>
     */
    private String incidentRecordArn;
    /**
     * <p>
     * The maximum number of results per page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Sort by the specified key value pair.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * Sorts the order of timeline events by the value specified in the <code>sortBy</code> field.
     * </p>
     */
    private String sortOrder;

    /**
     * <p>
     * Filters the timeline events based on the provided conditional values. You can filter timeline events using the
     * following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>eventTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>eventType</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Filters the timeline events based on the provided conditional values. You can filter timeline events
     *         using the following keys:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>eventTime</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>eventType</code>
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Filters the timeline events based on the provided conditional values. You can filter timeline events using the
     * following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>eventTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>eventType</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        Filters the timeline events based on the provided conditional values. You can filter timeline events using
     *        the following keys:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>eventTime</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>eventType</code>
     *        </p>
     *        </li>
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
     * Filters the timeline events based on the provided conditional values. You can filter timeline events using the
     * following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>eventTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>eventType</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        Filters the timeline events based on the provided conditional values. You can filter timeline events using
     *        the following keys:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>eventTime</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>eventType</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTimelineEventsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters the timeline events based on the provided conditional values. You can filter timeline events using the
     * following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>eventTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>eventType</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        Filters the timeline events based on the provided conditional values. You can filter timeline events using
     *        the following keys:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>eventTime</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>eventType</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTimelineEventsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident that the event is part of.
     * </p>
     * 
     * @param incidentRecordArn
     *        The Amazon Resource Name (ARN) of the incident that the event is part of.
     */

    public void setIncidentRecordArn(String incidentRecordArn) {
        this.incidentRecordArn = incidentRecordArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident that the event is part of.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the incident that the event is part of.
     */

    public String getIncidentRecordArn() {
        return this.incidentRecordArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident that the event is part of.
     * </p>
     * 
     * @param incidentRecordArn
     *        The Amazon Resource Name (ARN) of the incident that the event is part of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTimelineEventsRequest withIncidentRecordArn(String incidentRecordArn) {
        setIncidentRecordArn(incidentRecordArn);
        return this;
    }

    /**
     * <p>
     * The maximum number of results per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results per page.
     * </p>
     * 
     * @return The maximum number of results per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTimelineEventsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to continue to the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     * 
     * @return The pagination token to continue to the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to continue to the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTimelineEventsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Sort by the specified key value pair.
     * </p>
     * 
     * @param sortBy
     *        Sort by the specified key value pair.
     * @see TimelineEventSort
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * Sort by the specified key value pair.
     * </p>
     * 
     * @return Sort by the specified key value pair.
     * @see TimelineEventSort
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * Sort by the specified key value pair.
     * </p>
     * 
     * @param sortBy
     *        Sort by the specified key value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimelineEventSort
     */

    public ListTimelineEventsRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * Sort by the specified key value pair.
     * </p>
     * 
     * @param sortBy
     *        Sort by the specified key value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimelineEventSort
     */

    public ListTimelineEventsRequest withSortBy(TimelineEventSort sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * Sorts the order of timeline events by the value specified in the <code>sortBy</code> field.
     * </p>
     * 
     * @param sortOrder
     *        Sorts the order of timeline events by the value specified in the <code>sortBy</code> field.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * Sorts the order of timeline events by the value specified in the <code>sortBy</code> field.
     * </p>
     * 
     * @return Sorts the order of timeline events by the value specified in the <code>sortBy</code> field.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * Sorts the order of timeline events by the value specified in the <code>sortBy</code> field.
     * </p>
     * 
     * @param sortOrder
     *        Sorts the order of timeline events by the value specified in the <code>sortBy</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListTimelineEventsRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * Sorts the order of timeline events by the value specified in the <code>sortBy</code> field.
     * </p>
     * 
     * @param sortOrder
     *        Sorts the order of timeline events by the value specified in the <code>sortBy</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListTimelineEventsRequest withSortOrder(SortOrder sortOrder) {
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getIncidentRecordArn() != null)
            sb.append("IncidentRecordArn: ").append(getIncidentRecordArn()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
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

        if (obj instanceof ListTimelineEventsRequest == false)
            return false;
        ListTimelineEventsRequest other = (ListTimelineEventsRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getIncidentRecordArn() == null ^ this.getIncidentRecordArn() == null)
            return false;
        if (other.getIncidentRecordArn() != null && other.getIncidentRecordArn().equals(this.getIncidentRecordArn()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
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

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getIncidentRecordArn() == null) ? 0 : getIncidentRecordArn().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public ListTimelineEventsRequest clone() {
        return (ListTimelineEventsRequest) super.clone();
    }

}
