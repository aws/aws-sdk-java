/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#describeEvents(DescribeEventsRequest) DescribeEvents operation}.
 * <p>
 * This API returns events related to DB Instances, DB Security Groups,
 * DB Snapshots and DB Parameter Groups for the past 14 das. Events
 * specific to a particular DB Instance, database security group,
 * database snapshot or database parameter group can be obtained by
 * providing the name as a parameter. By default, the past hour of events
 * are returned.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#describeEvents(DescribeEventsRequest)
 */
public class DescribeEventsRequest extends AmazonWebServiceRequest {

    /**
     * The identifier of the event source for which events will be returned.
     * If not specified, then all sources are included in the response.
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
     * in ISO 8601 format.
     */
    private java.util.Date startTime;

    /**
     * The end of the time interval for which to retrieve events, specified
     * in ISO 8601 format.
     */
    private java.util.Date endTime;

    /**
     * The number of minutes to retrieve events for.
     */
    private Integer duration;

    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <i>MaxRecords</i> value, a marker is
     * included in the response so that the remaining results may be
     * retrieved.
     */
    private Integer maxRecords;

    /**
     * An optional marker provided in the previous DescribeDBInstances
     * request. If this parameter is specified, the response includes only
     * records beyond the marker, up to the value specified by
     * <i>MaxRecords</i>.
     */
    private String marker;

    /**
     * The identifier of the event source for which events will be returned.
     * If not specified, then all sources are included in the response.
     *
     * @return The identifier of the event source for which events will be returned.
     *         If not specified, then all sources are included in the response.
     */
    public String getSourceIdentifier() {
        return sourceIdentifier;
    }
    
    /**
     * The identifier of the event source for which events will be returned.
     * If not specified, then all sources are included in the response.
     *
     * @param sourceIdentifier The identifier of the event source for which events will be returned.
     *         If not specified, then all sources are included in the response.
     */
    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }
    
    /**
     * The identifier of the event source for which events will be returned.
     * If not specified, then all sources are included in the response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceIdentifier The identifier of the event source for which events will be returned.
     *         If not specified, then all sources are included in the response.
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
     * The beginning of the time interval to retrieve events for, specified
     * in ISO 8601 format.
     *
     * @return The beginning of the time interval to retrieve events for, specified
     *         in ISO 8601 format.
     */
    public java.util.Date getStartTime() {
        return startTime;
    }
    
    /**
     * The beginning of the time interval to retrieve events for, specified
     * in ISO 8601 format.
     *
     * @param startTime The beginning of the time interval to retrieve events for, specified
     *         in ISO 8601 format.
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }
    
    /**
     * The beginning of the time interval to retrieve events for, specified
     * in ISO 8601 format.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTime The beginning of the time interval to retrieve events for, specified
     *         in ISO 8601 format.
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
     * in ISO 8601 format.
     *
     * @return The end of the time interval for which to retrieve events, specified
     *         in ISO 8601 format.
     */
    public java.util.Date getEndTime() {
        return endTime;
    }
    
    /**
     * The end of the time interval for which to retrieve events, specified
     * in ISO 8601 format.
     *
     * @param endTime The end of the time interval for which to retrieve events, specified
     *         in ISO 8601 format.
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }
    
    /**
     * The end of the time interval for which to retrieve events, specified
     * in ISO 8601 format.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endTime The end of the time interval for which to retrieve events, specified
     *         in ISO 8601 format.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeEventsRequest withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }
    
    
    /**
     * The number of minutes to retrieve events for.
     *
     * @return The number of minutes to retrieve events for.
     */
    public Integer getDuration() {
        return duration;
    }
    
    /**
     * The number of minutes to retrieve events for.
     *
     * @param duration The number of minutes to retrieve events for.
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }
    
    /**
     * The number of minutes to retrieve events for.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param duration The number of minutes to retrieve events for.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeEventsRequest withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <i>MaxRecords</i> value, a marker is
     * included in the response so that the remaining results may be
     * retrieved.
     *
     * @return The maximum number of records to include in the response. If more
     *         records exist than the specified <i>MaxRecords</i> value, a marker is
     *         included in the response so that the remaining results may be
     *         retrieved.
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <i>MaxRecords</i> value, a marker is
     * included in the response so that the remaining results may be
     * retrieved.
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <i>MaxRecords</i> value, a marker is
     *         included in the response so that the remaining results may be
     *         retrieved.
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <i>MaxRecords</i> value, a marker is
     * included in the response so that the remaining results may be
     * retrieved.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <i>MaxRecords</i> value, a marker is
     *         included in the response so that the remaining results may be
     *         retrieved.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeEventsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }
    
    
    /**
     * An optional marker provided in the previous DescribeDBInstances
     * request. If this parameter is specified, the response includes only
     * records beyond the marker, up to the value specified by
     * <i>MaxRecords</i>.
     *
     * @return An optional marker provided in the previous DescribeDBInstances
     *         request. If this parameter is specified, the response includes only
     *         records beyond the marker, up to the value specified by
     *         <i>MaxRecords</i>.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional marker provided in the previous DescribeDBInstances
     * request. If this parameter is specified, the response includes only
     * records beyond the marker, up to the value specified by
     * <i>MaxRecords</i>.
     *
     * @param marker An optional marker provided in the previous DescribeDBInstances
     *         request. If this parameter is specified, the response includes only
     *         records beyond the marker, up to the value specified by
     *         <i>MaxRecords</i>.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional marker provided in the previous DescribeDBInstances
     * request. If this parameter is specified, the response includes only
     * records beyond the marker, up to the value specified by
     * <i>MaxRecords</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional marker provided in the previous DescribeDBInstances
     *         request. If this parameter is specified, the response includes only
     *         records beyond the marker, up to the value specified by
     *         <i>MaxRecords</i>.
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
        sb.append("SourceIdentifier: " + sourceIdentifier + ", ");
        sb.append("SourceType: " + sourceType + ", ");
        sb.append("StartTime: " + startTime + ", ");
        sb.append("EndTime: " + endTime + ", ");
        sb.append("Duration: " + duration + ", ");
        sb.append("MaxRecords: " + maxRecords + ", ");
        sb.append("Marker: " + marker + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    