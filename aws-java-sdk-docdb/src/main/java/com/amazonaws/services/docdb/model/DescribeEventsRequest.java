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
package com.amazonaws.services.docdb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input to <a>DescribeEvents</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeEvents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEventsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the event source for which events are returned. If not specified, then all sources are included
     * in the response.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>SourceIdentifier</code> is provided, <code>SourceType</code> must also be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is <code>DBInstance</code>, a <code>DBInstanceIdentifier</code> must be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is <code>DBSecurityGroup</code>, a <code>DBSecurityGroupName</code> must be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is <code>DBParameterGroup</code>, a <code>DBParameterGroupName</code> must be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is <code>DBSnapshot</code>, a <code>DBSnapshotIdentifier</code> must be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     */
    private String sourceIdentifier;
    /**
     * <p>
     * The event source to retrieve events for. If no value is specified, all events are returned.
     * </p>
     */
    private String sourceType;
    /**
     * <p>
     * The beginning of the time interval to retrieve events for, specified in ISO 8601 format.
     * </p>
     * <p>
     * Example: 2009-07-08T18:00Z
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end of the time interval for which to retrieve events, specified in ISO 8601 format.
     * </p>
     * <p>
     * Example: 2009-07-08T18:00Z
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The number of minutes to retrieve events for.
     * </p>
     * <p>
     * Default: 60
     * </p>
     */
    private Integer duration;
    /**
     * <p>
     * A list of event categories that trigger notifications for an event notification subscription.
     * </p>
     */
    private java.util.List<String> eventCategories;
    /**
     * <p>
     * This parameter is not currently supported.
     * </p>
     */
    private java.util.List<Filter> filters;
    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token (marker) is included in the response so that the remaining
     * results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The identifier of the event source for which events are returned. If not specified, then all sources are included
     * in the response.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>SourceIdentifier</code> is provided, <code>SourceType</code> must also be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is <code>DBInstance</code>, a <code>DBInstanceIdentifier</code> must be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is <code>DBSecurityGroup</code>, a <code>DBSecurityGroupName</code> must be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is <code>DBParameterGroup</code>, a <code>DBParameterGroupName</code> must be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is <code>DBSnapshot</code>, a <code>DBSnapshotIdentifier</code> must be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceIdentifier
     *        The identifier of the event source for which events are returned. If not specified, then all sources are
     *        included in the response.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>SourceIdentifier</code> is provided, <code>SourceType</code> must also be provided.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source type is <code>DBInstance</code>, a <code>DBInstanceIdentifier</code> must be provided.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source type is <code>DBSecurityGroup</code>, a <code>DBSecurityGroupName</code> must be provided.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source type is <code>DBParameterGroup</code>, a <code>DBParameterGroupName</code> must be provided.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source type is <code>DBSnapshot</code>, a <code>DBSnapshotIdentifier</code> must be provided.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     */

    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }

    /**
     * <p>
     * The identifier of the event source for which events are returned. If not specified, then all sources are included
     * in the response.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>SourceIdentifier</code> is provided, <code>SourceType</code> must also be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is <code>DBInstance</code>, a <code>DBInstanceIdentifier</code> must be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is <code>DBSecurityGroup</code>, a <code>DBSecurityGroupName</code> must be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is <code>DBParameterGroup</code>, a <code>DBParameterGroupName</code> must be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is <code>DBSnapshot</code>, a <code>DBSnapshotIdentifier</code> must be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The identifier of the event source for which events are returned. If not specified, then all sources are
     *         included in the response.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <code>SourceIdentifier</code> is provided, <code>SourceType</code> must also be provided.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the source type is <code>DBInstance</code>, a <code>DBInstanceIdentifier</code> must be provided.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the source type is <code>DBSecurityGroup</code>, a <code>DBSecurityGroupName</code> must be provided.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the source type is <code>DBParameterGroup</code>, a <code>DBParameterGroupName</code> must be
     *         provided.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the source type is <code>DBSnapshot</code>, a <code>DBSnapshotIdentifier</code> must be provided.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     */

    public String getSourceIdentifier() {
        return this.sourceIdentifier;
    }

    /**
     * <p>
     * The identifier of the event source for which events are returned. If not specified, then all sources are included
     * in the response.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>SourceIdentifier</code> is provided, <code>SourceType</code> must also be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is <code>DBInstance</code>, a <code>DBInstanceIdentifier</code> must be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is <code>DBSecurityGroup</code>, a <code>DBSecurityGroupName</code> must be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is <code>DBParameterGroup</code>, a <code>DBParameterGroupName</code> must be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is <code>DBSnapshot</code>, a <code>DBSnapshotIdentifier</code> must be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceIdentifier
     *        The identifier of the event source for which events are returned. If not specified, then all sources are
     *        included in the response.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>SourceIdentifier</code> is provided, <code>SourceType</code> must also be provided.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source type is <code>DBInstance</code>, a <code>DBInstanceIdentifier</code> must be provided.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source type is <code>DBSecurityGroup</code>, a <code>DBSecurityGroupName</code> must be provided.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source type is <code>DBParameterGroup</code>, a <code>DBParameterGroupName</code> must be provided.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source type is <code>DBSnapshot</code>, a <code>DBSnapshotIdentifier</code> must be provided.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventsRequest withSourceIdentifier(String sourceIdentifier) {
        setSourceIdentifier(sourceIdentifier);
        return this;
    }

    /**
     * <p>
     * The event source to retrieve events for. If no value is specified, all events are returned.
     * </p>
     * 
     * @param sourceType
     *        The event source to retrieve events for. If no value is specified, all events are returned.
     * @see SourceType
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The event source to retrieve events for. If no value is specified, all events are returned.
     * </p>
     * 
     * @return The event source to retrieve events for. If no value is specified, all events are returned.
     * @see SourceType
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * The event source to retrieve events for. If no value is specified, all events are returned.
     * </p>
     * 
     * @param sourceType
     *        The event source to retrieve events for. If no value is specified, all events are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public DescribeEventsRequest withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * The event source to retrieve events for. If no value is specified, all events are returned.
     * </p>
     * 
     * @param sourceType
     *        The event source to retrieve events for. If no value is specified, all events are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public DescribeEventsRequest withSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
        return this;
    }

    /**
     * <p>
     * The beginning of the time interval to retrieve events for, specified in ISO 8601 format.
     * </p>
     * <p>
     * Example: 2009-07-08T18:00Z
     * </p>
     * 
     * @param startTime
     *        The beginning of the time interval to retrieve events for, specified in ISO 8601 format. </p>
     *        <p>
     *        Example: 2009-07-08T18:00Z
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The beginning of the time interval to retrieve events for, specified in ISO 8601 format.
     * </p>
     * <p>
     * Example: 2009-07-08T18:00Z
     * </p>
     * 
     * @return The beginning of the time interval to retrieve events for, specified in ISO 8601 format. </p>
     *         <p>
     *         Example: 2009-07-08T18:00Z
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The beginning of the time interval to retrieve events for, specified in ISO 8601 format.
     * </p>
     * <p>
     * Example: 2009-07-08T18:00Z
     * </p>
     * 
     * @param startTime
     *        The beginning of the time interval to retrieve events for, specified in ISO 8601 format. </p>
     *        <p>
     *        Example: 2009-07-08T18:00Z
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventsRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end of the time interval for which to retrieve events, specified in ISO 8601 format.
     * </p>
     * <p>
     * Example: 2009-07-08T18:00Z
     * </p>
     * 
     * @param endTime
     *        The end of the time interval for which to retrieve events, specified in ISO 8601 format. </p>
     *        <p>
     *        Example: 2009-07-08T18:00Z
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end of the time interval for which to retrieve events, specified in ISO 8601 format.
     * </p>
     * <p>
     * Example: 2009-07-08T18:00Z
     * </p>
     * 
     * @return The end of the time interval for which to retrieve events, specified in ISO 8601 format. </p>
     *         <p>
     *         Example: 2009-07-08T18:00Z
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end of the time interval for which to retrieve events, specified in ISO 8601 format.
     * </p>
     * <p>
     * Example: 2009-07-08T18:00Z
     * </p>
     * 
     * @param endTime
     *        The end of the time interval for which to retrieve events, specified in ISO 8601 format. </p>
     *        <p>
     *        Example: 2009-07-08T18:00Z
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventsRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The number of minutes to retrieve events for.
     * </p>
     * <p>
     * Default: 60
     * </p>
     * 
     * @param duration
     *        The number of minutes to retrieve events for.</p>
     *        <p>
     *        Default: 60
     */

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The number of minutes to retrieve events for.
     * </p>
     * <p>
     * Default: 60
     * </p>
     * 
     * @return The number of minutes to retrieve events for.</p>
     *         <p>
     *         Default: 60
     */

    public Integer getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * The number of minutes to retrieve events for.
     * </p>
     * <p>
     * Default: 60
     * </p>
     * 
     * @param duration
     *        The number of minutes to retrieve events for.</p>
     *        <p>
     *        Default: 60
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventsRequest withDuration(Integer duration) {
        setDuration(duration);
        return this;
    }

    /**
     * <p>
     * A list of event categories that trigger notifications for an event notification subscription.
     * </p>
     * 
     * @return A list of event categories that trigger notifications for an event notification subscription.
     */

    public java.util.List<String> getEventCategories() {
        return eventCategories;
    }

    /**
     * <p>
     * A list of event categories that trigger notifications for an event notification subscription.
     * </p>
     * 
     * @param eventCategories
     *        A list of event categories that trigger notifications for an event notification subscription.
     */

    public void setEventCategories(java.util.Collection<String> eventCategories) {
        if (eventCategories == null) {
            this.eventCategories = null;
            return;
        }

        this.eventCategories = new java.util.ArrayList<String>(eventCategories);
    }

    /**
     * <p>
     * A list of event categories that trigger notifications for an event notification subscription.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventCategories(java.util.Collection)} or {@link #withEventCategories(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param eventCategories
     *        A list of event categories that trigger notifications for an event notification subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventsRequest withEventCategories(String... eventCategories) {
        if (this.eventCategories == null) {
            setEventCategories(new java.util.ArrayList<String>(eventCategories.length));
        }
        for (String ele : eventCategories) {
            this.eventCategories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of event categories that trigger notifications for an event notification subscription.
     * </p>
     * 
     * @param eventCategories
     *        A list of event categories that trigger notifications for an event notification subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventsRequest withEventCategories(java.util.Collection<String> eventCategories) {
        setEventCategories(eventCategories);
        return this;
    }

    /**
     * <p>
     * This parameter is not currently supported.
     * </p>
     * 
     * @return This parameter is not currently supported.
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * This parameter is not currently supported.
     * </p>
     * 
     * @param filters
     *        This parameter is not currently supported.
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
     * This parameter is not currently supported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        This parameter is not currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventsRequest withFilters(Filter... filters) {
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
     * This parameter is not currently supported.
     * </p>
     * 
     * @param filters
     *        This parameter is not currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token (marker) is included in the response so that the remaining
     * results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        <code>MaxRecords</code> value, a pagination token (marker) is included in the response so that the
     *        remaining results can be retrieved.</p>
     *        <p>
     *        Default: 100
     *        </p>
     *        <p>
     *        Constraints: Minimum 20, maximum 100.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token (marker) is included in the response so that the remaining
     * results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @return The maximum number of records to include in the response. If more records exist than the specified
     *         <code>MaxRecords</code> value, a pagination token (marker) is included in the response so that the
     *         remaining results can be retrieved.</p>
     *         <p>
     *         Default: 100
     *         </p>
     *         <p>
     *         Constraints: Minimum 20, maximum 100.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token (marker) is included in the response so that the remaining
     * results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        <code>MaxRecords</code> value, a pagination token (marker) is included in the response so that the
     *        remaining results can be retrieved.</p>
     *        <p>
     *        Default: 100
     *        </p>
     *        <p>
     *        Constraints: Minimum 20, maximum 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventsRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous request. If this parameter is specified, the response
     *         includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventsRequest withMarker(String marker) {
        setMarker(marker);
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
        if (getSourceIdentifier() != null)
            sb.append("SourceIdentifier: ").append(getSourceIdentifier()).append(",");
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration()).append(",");
        if (getEventCategories() != null)
            sb.append("EventCategories: ").append(getEventCategories()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEventsRequest == false)
            return false;
        DescribeEventsRequest other = (DescribeEventsRequest) obj;
        if (other.getSourceIdentifier() == null ^ this.getSourceIdentifier() == null)
            return false;
        if (other.getSourceIdentifier() != null && other.getSourceIdentifier().equals(this.getSourceIdentifier()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getEventCategories() == null ^ this.getEventCategories() == null)
            return false;
        if (other.getEventCategories() != null && other.getEventCategories().equals(this.getEventCategories()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceIdentifier() == null) ? 0 : getSourceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getEventCategories() == null) ? 0 : getEventCategories().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEventsRequest clone() {
        return (DescribeEventsRequest) super.clone();
    }

}
