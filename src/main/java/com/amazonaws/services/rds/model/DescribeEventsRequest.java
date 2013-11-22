/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#describeEvents(DescribeEventsRequest) DescribeEvents operation}.
 * <p>
 * Returns events related to DB instances, DB security groups, DB snapshots, and DB parameter groups for the past 14 days. Events specific to a
 * particular DB instance, DB security group, database snapshot, or DB parameter group can be obtained by providing the name as a parameter. By default,
 * the past hour of events are returned.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#describeEvents(DescribeEventsRequest)
 */
public class DescribeEventsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The identifier of the event source for which events will be returned.
     * If not specified, then all sources are included in the response.
     * <p>Constraints: <ul> <li>If SourceIdentifier is supplied, SourceType
     * must also be provided.</li> <li>If the source type is
     * <code>DBInstance</code>, then a <code>DBInstanceIdentifier</code> must
     * be supplied.</li> <li>If the source type is
     * <code>DBSecurityGroup</code>, a <code>DBSecurityGroupName</code> must
     * be supplied.</li> <li>If the source type is
     * <code>DBParameterGroup</code>, a <code>DBParameterGroupName</code>
     * must be supplied.</li> <li>If the source type is
     * <code>DBSnapshot</code>, a <code>DBSnapshotIdentifier</code> must be
     * supplied.</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens.</li> </ul>
     */
    private String sourceIdentifier;

    /**
     * The event source to retrieve events for. If no value is specified, all
     * events are returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>db-instance, db-parameter-group, db-security-group, db-snapshot
     */
    private String sourceType;

    /**
     * The beginning of the time interval to retrieve events for, specified
     * in ISO 8601 format. For more information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     * page.</a> <p>Example: 2009-07-08T18:00Z
     */
    private java.util.Date startTime;

    /**
     * The end of the time interval for which to retrieve events, specified
     * in ISO 8601 format. For more information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     * page.</a> <p>Example: 2009-07-08T18:00Z
     */
    private java.util.Date endTime;

    /**
     * The number of minutes to retrieve events for. <p>Default: 60
     */
    private Integer duration;

    /**
     * A list of event categories that trigger notifications for a event
     * notification subscription.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> eventCategories;

    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * pagination token called a marker is included in the response so that
     * the remaining results may be retrieved. <p>Default: 100
     * <p>Constraints: minimum 20, maximum 100
     */
    private Integer maxRecords;

    /**
     * An optional pagination token provided by a previous DescribeEvents
     * request. If this parameter is specified, the response includes only
     * records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     */
    private String marker;

    /**
     * Default constructor for a new DescribeEventsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DescribeEventsRequest() {}
    
    /**
     * The identifier of the event source for which events will be returned.
     * If not specified, then all sources are included in the response.
     * <p>Constraints: <ul> <li>If SourceIdentifier is supplied, SourceType
     * must also be provided.</li> <li>If the source type is
     * <code>DBInstance</code>, then a <code>DBInstanceIdentifier</code> must
     * be supplied.</li> <li>If the source type is
     * <code>DBSecurityGroup</code>, a <code>DBSecurityGroupName</code> must
     * be supplied.</li> <li>If the source type is
     * <code>DBParameterGroup</code>, a <code>DBParameterGroupName</code>
     * must be supplied.</li> <li>If the source type is
     * <code>DBSnapshot</code>, a <code>DBSnapshotIdentifier</code> must be
     * supplied.</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens.</li> </ul>
     *
     * @return The identifier of the event source for which events will be returned.
     *         If not specified, then all sources are included in the response.
     *         <p>Constraints: <ul> <li>If SourceIdentifier is supplied, SourceType
     *         must also be provided.</li> <li>If the source type is
     *         <code>DBInstance</code>, then a <code>DBInstanceIdentifier</code> must
     *         be supplied.</li> <li>If the source type is
     *         <code>DBSecurityGroup</code>, a <code>DBSecurityGroupName</code> must
     *         be supplied.</li> <li>If the source type is
     *         <code>DBParameterGroup</code>, a <code>DBParameterGroupName</code>
     *         must be supplied.</li> <li>If the source type is
     *         <code>DBSnapshot</code>, a <code>DBSnapshotIdentifier</code> must be
     *         supplied.</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens.</li> </ul>
     */
    public String getSourceIdentifier() {
        return sourceIdentifier;
    }
    
    /**
     * The identifier of the event source for which events will be returned.
     * If not specified, then all sources are included in the response.
     * <p>Constraints: <ul> <li>If SourceIdentifier is supplied, SourceType
     * must also be provided.</li> <li>If the source type is
     * <code>DBInstance</code>, then a <code>DBInstanceIdentifier</code> must
     * be supplied.</li> <li>If the source type is
     * <code>DBSecurityGroup</code>, a <code>DBSecurityGroupName</code> must
     * be supplied.</li> <li>If the source type is
     * <code>DBParameterGroup</code>, a <code>DBParameterGroupName</code>
     * must be supplied.</li> <li>If the source type is
     * <code>DBSnapshot</code>, a <code>DBSnapshotIdentifier</code> must be
     * supplied.</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens.</li> </ul>
     *
     * @param sourceIdentifier The identifier of the event source for which events will be returned.
     *         If not specified, then all sources are included in the response.
     *         <p>Constraints: <ul> <li>If SourceIdentifier is supplied, SourceType
     *         must also be provided.</li> <li>If the source type is
     *         <code>DBInstance</code>, then a <code>DBInstanceIdentifier</code> must
     *         be supplied.</li> <li>If the source type is
     *         <code>DBSecurityGroup</code>, a <code>DBSecurityGroupName</code> must
     *         be supplied.</li> <li>If the source type is
     *         <code>DBParameterGroup</code>, a <code>DBParameterGroupName</code>
     *         must be supplied.</li> <li>If the source type is
     *         <code>DBSnapshot</code>, a <code>DBSnapshotIdentifier</code> must be
     *         supplied.</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens.</li> </ul>
     */
    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }
    
    /**
     * The identifier of the event source for which events will be returned.
     * If not specified, then all sources are included in the response.
     * <p>Constraints: <ul> <li>If SourceIdentifier is supplied, SourceType
     * must also be provided.</li> <li>If the source type is
     * <code>DBInstance</code>, then a <code>DBInstanceIdentifier</code> must
     * be supplied.</li> <li>If the source type is
     * <code>DBSecurityGroup</code>, a <code>DBSecurityGroupName</code> must
     * be supplied.</li> <li>If the source type is
     * <code>DBParameterGroup</code>, a <code>DBParameterGroupName</code>
     * must be supplied.</li> <li>If the source type is
     * <code>DBSnapshot</code>, a <code>DBSnapshotIdentifier</code> must be
     * supplied.</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceIdentifier The identifier of the event source for which events will be returned.
     *         If not specified, then all sources are included in the response.
     *         <p>Constraints: <ul> <li>If SourceIdentifier is supplied, SourceType
     *         must also be provided.</li> <li>If the source type is
     *         <code>DBInstance</code>, then a <code>DBInstanceIdentifier</code> must
     *         be supplied.</li> <li>If the source type is
     *         <code>DBSecurityGroup</code>, a <code>DBSecurityGroupName</code> must
     *         be supplied.</li> <li>If the source type is
     *         <code>DBParameterGroup</code>, a <code>DBParameterGroupName</code>
     *         must be supplied.</li> <li>If the source type is
     *         <code>DBSnapshot</code>, a <code>DBSnapshotIdentifier</code> must be
     *         supplied.</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeEventsRequest withSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
        return this;
    }

    /**
     * The event source to retrieve events for. If no value is specified, all
     * events are returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>db-instance, db-parameter-group, db-security-group, db-snapshot
     *
     * @return The event source to retrieve events for. If no value is specified, all
     *         events are returned.
     *
     * @see SourceType
     */
    public String getSourceType() {
        return sourceType;
    }
    
    /**
     * The event source to retrieve events for. If no value is specified, all
     * events are returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>db-instance, db-parameter-group, db-security-group, db-snapshot
     *
     * @param sourceType The event source to retrieve events for. If no value is specified, all
     *         events are returned.
     *
     * @see SourceType
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }
    
    /**
     * The event source to retrieve events for. If no value is specified, all
     * events are returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>db-instance, db-parameter-group, db-security-group, db-snapshot
     *
     * @param sourceType The event source to retrieve events for. If no value is specified, all
     *         events are returned.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see SourceType
     */
    public DescribeEventsRequest withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * The event source to retrieve events for. If no value is specified, all
     * events are returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>db-instance, db-parameter-group, db-security-group, db-snapshot
     *
     * @param sourceType The event source to retrieve events for. If no value is specified, all
     *         events are returned.
     *
     * @see SourceType
     */
    public void setSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
    }
    
    /**
     * The event source to retrieve events for. If no value is specified, all
     * events are returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>db-instance, db-parameter-group, db-security-group, db-snapshot
     *
     * @param sourceType The event source to retrieve events for. If no value is specified, all
     *         events are returned.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see SourceType
     */
    public DescribeEventsRequest withSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
        return this;
    }

    /**
     * The beginning of the time interval to retrieve events for, specified
     * in ISO 8601 format. For more information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     * page.</a> <p>Example: 2009-07-08T18:00Z
     *
     * @return The beginning of the time interval to retrieve events for, specified
     *         in ISO 8601 format. For more information about ISO 8601, go to the <a
     *         href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *         page.</a> <p>Example: 2009-07-08T18:00Z
     */
    public java.util.Date getStartTime() {
        return startTime;
    }
    
    /**
     * The beginning of the time interval to retrieve events for, specified
     * in ISO 8601 format. For more information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     * page.</a> <p>Example: 2009-07-08T18:00Z
     *
     * @param startTime The beginning of the time interval to retrieve events for, specified
     *         in ISO 8601 format. For more information about ISO 8601, go to the <a
     *         href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *         page.</a> <p>Example: 2009-07-08T18:00Z
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }
    
    /**
     * The beginning of the time interval to retrieve events for, specified
     * in ISO 8601 format. For more information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     * page.</a> <p>Example: 2009-07-08T18:00Z
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTime The beginning of the time interval to retrieve events for, specified
     *         in ISO 8601 format. For more information about ISO 8601, go to the <a
     *         href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *         page.</a> <p>Example: 2009-07-08T18:00Z
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeEventsRequest withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * The end of the time interval for which to retrieve events, specified
     * in ISO 8601 format. For more information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     * page.</a> <p>Example: 2009-07-08T18:00Z
     *
     * @return The end of the time interval for which to retrieve events, specified
     *         in ISO 8601 format. For more information about ISO 8601, go to the <a
     *         href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *         page.</a> <p>Example: 2009-07-08T18:00Z
     */
    public java.util.Date getEndTime() {
        return endTime;
    }
    
    /**
     * The end of the time interval for which to retrieve events, specified
     * in ISO 8601 format. For more information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     * page.</a> <p>Example: 2009-07-08T18:00Z
     *
     * @param endTime The end of the time interval for which to retrieve events, specified
     *         in ISO 8601 format. For more information about ISO 8601, go to the <a
     *         href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *         page.</a> <p>Example: 2009-07-08T18:00Z
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }
    
    /**
     * The end of the time interval for which to retrieve events, specified
     * in ISO 8601 format. For more information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     * page.</a> <p>Example: 2009-07-08T18:00Z
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endTime The end of the time interval for which to retrieve events, specified
     *         in ISO 8601 format. For more information about ISO 8601, go to the <a
     *         href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *         page.</a> <p>Example: 2009-07-08T18:00Z
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeEventsRequest withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * The number of minutes to retrieve events for. <p>Default: 60
     *
     * @return The number of minutes to retrieve events for. <p>Default: 60
     */
    public Integer getDuration() {
        return duration;
    }
    
    /**
     * The number of minutes to retrieve events for. <p>Default: 60
     *
     * @param duration The number of minutes to retrieve events for. <p>Default: 60
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }
    
    /**
     * The number of minutes to retrieve events for. <p>Default: 60
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param duration The number of minutes to retrieve events for. <p>Default: 60
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeEventsRequest withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * A list of event categories that trigger notifications for a event
     * notification subscription.
     *
     * @return A list of event categories that trigger notifications for a event
     *         notification subscription.
     */
    public java.util.List<String> getEventCategories() {
        if (eventCategories == null) {
              eventCategories = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              eventCategories.setAutoConstruct(true);
        }
        return eventCategories;
    }
    
    /**
     * A list of event categories that trigger notifications for a event
     * notification subscription.
     *
     * @param eventCategories A list of event categories that trigger notifications for a event
     *         notification subscription.
     */
    public void setEventCategories(java.util.Collection<String> eventCategories) {
        if (eventCategories == null) {
            this.eventCategories = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> eventCategoriesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(eventCategories.size());
        eventCategoriesCopy.addAll(eventCategories);
        this.eventCategories = eventCategoriesCopy;
    }
    
    /**
     * A list of event categories that trigger notifications for a event
     * notification subscription.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventCategories A list of event categories that trigger notifications for a event
     *         notification subscription.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeEventsRequest withEventCategories(String... eventCategories) {
        if (getEventCategories() == null) setEventCategories(new java.util.ArrayList<String>(eventCategories.length));
        for (String value : eventCategories) {
            getEventCategories().add(value);
        }
        return this;
    }
    
    /**
     * A list of event categories that trigger notifications for a event
     * notification subscription.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventCategories A list of event categories that trigger notifications for a event
     *         notification subscription.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeEventsRequest withEventCategories(java.util.Collection<String> eventCategories) {
        if (eventCategories == null) {
            this.eventCategories = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> eventCategoriesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(eventCategories.size());
            eventCategoriesCopy.addAll(eventCategories);
            this.eventCategories = eventCategoriesCopy;
        }

        return this;
    }

    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * pagination token called a marker is included in the response so that
     * the remaining results may be retrieved. <p>Default: 100
     * <p>Constraints: minimum 20, maximum 100
     *
     * @return The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         pagination token called a marker is included in the response so that
     *         the remaining results may be retrieved. <p>Default: 100
     *         <p>Constraints: minimum 20, maximum 100
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * pagination token called a marker is included in the response so that
     * the remaining results may be retrieved. <p>Default: 100
     * <p>Constraints: minimum 20, maximum 100
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         pagination token called a marker is included in the response so that
     *         the remaining results may be retrieved. <p>Default: 100
     *         <p>Constraints: minimum 20, maximum 100
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * pagination token called a marker is included in the response so that
     * the remaining results may be retrieved. <p>Default: 100
     * <p>Constraints: minimum 20, maximum 100
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         pagination token called a marker is included in the response so that
     *         the remaining results may be retrieved. <p>Default: 100
     *         <p>Constraints: minimum 20, maximum 100
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeEventsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * An optional pagination token provided by a previous DescribeEvents
     * request. If this parameter is specified, the response includes only
     * records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     *
     * @return An optional pagination token provided by a previous DescribeEvents
     *         request. If this parameter is specified, the response includes only
     *         records beyond the marker, up to the value specified by
     *         <code>MaxRecords</code>.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional pagination token provided by a previous DescribeEvents
     * request. If this parameter is specified, the response includes only
     * records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     *
     * @param marker An optional pagination token provided by a previous DescribeEvents
     *         request. If this parameter is specified, the response includes only
     *         records beyond the marker, up to the value specified by
     *         <code>MaxRecords</code>.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional pagination token provided by a previous DescribeEvents
     * request. If this parameter is specified, the response includes only
     * records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional pagination token provided by a previous DescribeEvents
     *         request. If this parameter is specified, the response includes only
     *         records beyond the marker, up to the value specified by
     *         <code>MaxRecords</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeEventsRequest withMarker(String marker) {
        this.marker = marker;
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
        if (getSourceIdentifier() != null) sb.append("SourceIdentifier: " + getSourceIdentifier() + ",");
        if (getSourceType() != null) sb.append("SourceType: " + getSourceType() + ",");
        if (getStartTime() != null) sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null) sb.append("EndTime: " + getEndTime() + ",");
        if (getDuration() != null) sb.append("Duration: " + getDuration() + ",");
        if (getEventCategories() != null) sb.append("EventCategories: " + getEventCategories() + ",");
        if (getMaxRecords() != null) sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
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
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeEventsRequest == false) return false;
        DescribeEventsRequest other = (DescribeEventsRequest)obj;
        
        if (other.getSourceIdentifier() == null ^ this.getSourceIdentifier() == null) return false;
        if (other.getSourceIdentifier() != null && other.getSourceIdentifier().equals(this.getSourceIdentifier()) == false) return false; 
        if (other.getSourceType() == null ^ this.getSourceType() == null) return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false) return false; 
        if (other.getStartTime() == null ^ this.getStartTime() == null) return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false) return false; 
        if (other.getEndTime() == null ^ this.getEndTime() == null) return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false) return false; 
        if (other.getDuration() == null ^ this.getDuration() == null) return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false) return false; 
        if (other.getEventCategories() == null ^ this.getEventCategories() == null) return false;
        if (other.getEventCategories() != null && other.getEventCategories().equals(this.getEventCategories()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    