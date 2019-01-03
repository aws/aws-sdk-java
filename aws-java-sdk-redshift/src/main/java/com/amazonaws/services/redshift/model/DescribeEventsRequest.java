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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeEvents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEventsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the event source for which events will be returned. If this parameter is not specified, then
     * all sources are included in the response.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <p>
     * If <i>SourceIdentifier</i> is supplied, <i>SourceType</i> must also be provided.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify a cluster identifier when <i>SourceType</i> is <code>cluster</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify a cluster security group name when <i>SourceType</i> is <code>cluster-security-group</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify a cluster parameter group name when <i>SourceType</i> is <code>cluster-parameter-group</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify a cluster snapshot identifier when <i>SourceType</i> is <code>cluster-snapshot</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String sourceIdentifier;
    /**
     * <p>
     * The event source to retrieve events for. If no value is specified, all events are returned.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <p>
     * If <i>SourceType</i> is supplied, <i>SourceIdentifier</i> must also be provided.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify <code>cluster</code> when <i>SourceIdentifier</i> is a cluster identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>cluster-security-group</code> when <i>SourceIdentifier</i> is a cluster security group name.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>cluster-parameter-group</code> when <i>SourceIdentifier</i> is a cluster parameter group name.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>cluster-snapshot</code> when <i>SourceIdentifier</i> is a cluster snapshot identifier.
     * </p>
     * </li>
     * </ul>
     */
    private String sourceType;
    /**
     * <p>
     * The beginning of the time interval to retrieve events for, specified in ISO 8601 format. For more information
     * about ISO 8601, go to the <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <p>
     * Example: <code>2009-07-08T18:00Z</code>
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end of the time interval for which to retrieve events, specified in ISO 8601 format. For more information
     * about ISO 8601, go to the <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <p>
     * Example: <code>2009-07-08T18:00Z</code>
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The number of minutes prior to the time of the request for which to retrieve events. For example, if the request
     * is sent at 18:00 and you specify a duration of 60, then only events which have occurred after 17:00 will be
     * returned.
     * </p>
     * <p>
     * Default: <code>60</code>
     * </p>
     */
    private Integer duration;
    /**
     * <p>
     * The maximum number of response records to return in each call. If the number of remaining response records
     * exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of the
     * response. You can retrieve the next set of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set of response records. When the results of
     * a <a>DescribeEvents</a> request exceed the value specified in <code>MaxRecords</code>, AWS returns a value in the
     * <code>Marker</code> field of the response. You can retrieve the next set of response records by providing the
     * returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The identifier of the event source for which events will be returned. If this parameter is not specified, then
     * all sources are included in the response.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <p>
     * If <i>SourceIdentifier</i> is supplied, <i>SourceType</i> must also be provided.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify a cluster identifier when <i>SourceType</i> is <code>cluster</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify a cluster security group name when <i>SourceType</i> is <code>cluster-security-group</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify a cluster parameter group name when <i>SourceType</i> is <code>cluster-parameter-group</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify a cluster snapshot identifier when <i>SourceType</i> is <code>cluster-snapshot</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceIdentifier
     *        The identifier of the event source for which events will be returned. If this parameter is not specified,
     *        then all sources are included in the response.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <p>
     *        If <i>SourceIdentifier</i> is supplied, <i>SourceType</i> must also be provided.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specify a cluster identifier when <i>SourceType</i> is <code>cluster</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify a cluster security group name when <i>SourceType</i> is <code>cluster-security-group</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify a cluster parameter group name when <i>SourceType</i> is <code>cluster-parameter-group</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify a cluster snapshot identifier when <i>SourceType</i> is <code>cluster-snapshot</code>.
     *        </p>
     *        </li>
     */

    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }

    /**
     * <p>
     * The identifier of the event source for which events will be returned. If this parameter is not specified, then
     * all sources are included in the response.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <p>
     * If <i>SourceIdentifier</i> is supplied, <i>SourceType</i> must also be provided.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify a cluster identifier when <i>SourceType</i> is <code>cluster</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify a cluster security group name when <i>SourceType</i> is <code>cluster-security-group</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify a cluster parameter group name when <i>SourceType</i> is <code>cluster-parameter-group</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify a cluster snapshot identifier when <i>SourceType</i> is <code>cluster-snapshot</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The identifier of the event source for which events will be returned. If this parameter is not specified,
     *         then all sources are included in the response.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <p>
     *         If <i>SourceIdentifier</i> is supplied, <i>SourceType</i> must also be provided.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Specify a cluster identifier when <i>SourceType</i> is <code>cluster</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specify a cluster security group name when <i>SourceType</i> is <code>cluster-security-group</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specify a cluster parameter group name when <i>SourceType</i> is <code>cluster-parameter-group</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specify a cluster snapshot identifier when <i>SourceType</i> is <code>cluster-snapshot</code>.
     *         </p>
     *         </li>
     */

    public String getSourceIdentifier() {
        return this.sourceIdentifier;
    }

    /**
     * <p>
     * The identifier of the event source for which events will be returned. If this parameter is not specified, then
     * all sources are included in the response.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <p>
     * If <i>SourceIdentifier</i> is supplied, <i>SourceType</i> must also be provided.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify a cluster identifier when <i>SourceType</i> is <code>cluster</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify a cluster security group name when <i>SourceType</i> is <code>cluster-security-group</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify a cluster parameter group name when <i>SourceType</i> is <code>cluster-parameter-group</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify a cluster snapshot identifier when <i>SourceType</i> is <code>cluster-snapshot</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceIdentifier
     *        The identifier of the event source for which events will be returned. If this parameter is not specified,
     *        then all sources are included in the response.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <p>
     *        If <i>SourceIdentifier</i> is supplied, <i>SourceType</i> must also be provided.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specify a cluster identifier when <i>SourceType</i> is <code>cluster</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify a cluster security group name when <i>SourceType</i> is <code>cluster-security-group</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify a cluster parameter group name when <i>SourceType</i> is <code>cluster-parameter-group</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify a cluster snapshot identifier when <i>SourceType</i> is <code>cluster-snapshot</code>.
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
     * <p>
     * Constraints:
     * </p>
     * <p>
     * If <i>SourceType</i> is supplied, <i>SourceIdentifier</i> must also be provided.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify <code>cluster</code> when <i>SourceIdentifier</i> is a cluster identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>cluster-security-group</code> when <i>SourceIdentifier</i> is a cluster security group name.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>cluster-parameter-group</code> when <i>SourceIdentifier</i> is a cluster parameter group name.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>cluster-snapshot</code> when <i>SourceIdentifier</i> is a cluster snapshot identifier.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceType
     *        The event source to retrieve events for. If no value is specified, all events are returned.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <p>
     *        If <i>SourceType</i> is supplied, <i>SourceIdentifier</i> must also be provided.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specify <code>cluster</code> when <i>SourceIdentifier</i> is a cluster identifier.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify <code>cluster-security-group</code> when <i>SourceIdentifier</i> is a cluster security group name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify <code>cluster-parameter-group</code> when <i>SourceIdentifier</i> is a cluster parameter group
     *        name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify <code>cluster-snapshot</code> when <i>SourceIdentifier</i> is a cluster snapshot identifier.
     *        </p>
     *        </li>
     * @see SourceType
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The event source to retrieve events for. If no value is specified, all events are returned.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <p>
     * If <i>SourceType</i> is supplied, <i>SourceIdentifier</i> must also be provided.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify <code>cluster</code> when <i>SourceIdentifier</i> is a cluster identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>cluster-security-group</code> when <i>SourceIdentifier</i> is a cluster security group name.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>cluster-parameter-group</code> when <i>SourceIdentifier</i> is a cluster parameter group name.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>cluster-snapshot</code> when <i>SourceIdentifier</i> is a cluster snapshot identifier.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The event source to retrieve events for. If no value is specified, all events are returned.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <p>
     *         If <i>SourceType</i> is supplied, <i>SourceIdentifier</i> must also be provided.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Specify <code>cluster</code> when <i>SourceIdentifier</i> is a cluster identifier.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specify <code>cluster-security-group</code> when <i>SourceIdentifier</i> is a cluster security group
     *         name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specify <code>cluster-parameter-group</code> when <i>SourceIdentifier</i> is a cluster parameter group
     *         name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specify <code>cluster-snapshot</code> when <i>SourceIdentifier</i> is a cluster snapshot identifier.
     *         </p>
     *         </li>
     * @see SourceType
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * The event source to retrieve events for. If no value is specified, all events are returned.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <p>
     * If <i>SourceType</i> is supplied, <i>SourceIdentifier</i> must also be provided.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify <code>cluster</code> when <i>SourceIdentifier</i> is a cluster identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>cluster-security-group</code> when <i>SourceIdentifier</i> is a cluster security group name.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>cluster-parameter-group</code> when <i>SourceIdentifier</i> is a cluster parameter group name.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>cluster-snapshot</code> when <i>SourceIdentifier</i> is a cluster snapshot identifier.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceType
     *        The event source to retrieve events for. If no value is specified, all events are returned.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <p>
     *        If <i>SourceType</i> is supplied, <i>SourceIdentifier</i> must also be provided.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specify <code>cluster</code> when <i>SourceIdentifier</i> is a cluster identifier.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify <code>cluster-security-group</code> when <i>SourceIdentifier</i> is a cluster security group name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify <code>cluster-parameter-group</code> when <i>SourceIdentifier</i> is a cluster parameter group
     *        name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify <code>cluster-snapshot</code> when <i>SourceIdentifier</i> is a cluster snapshot identifier.
     *        </p>
     *        </li>
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
     * <p>
     * Constraints:
     * </p>
     * <p>
     * If <i>SourceType</i> is supplied, <i>SourceIdentifier</i> must also be provided.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify <code>cluster</code> when <i>SourceIdentifier</i> is a cluster identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>cluster-security-group</code> when <i>SourceIdentifier</i> is a cluster security group name.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>cluster-parameter-group</code> when <i>SourceIdentifier</i> is a cluster parameter group name.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>cluster-snapshot</code> when <i>SourceIdentifier</i> is a cluster snapshot identifier.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceType
     *        The event source to retrieve events for. If no value is specified, all events are returned.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <p>
     *        If <i>SourceType</i> is supplied, <i>SourceIdentifier</i> must also be provided.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specify <code>cluster</code> when <i>SourceIdentifier</i> is a cluster identifier.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify <code>cluster-security-group</code> when <i>SourceIdentifier</i> is a cluster security group name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify <code>cluster-parameter-group</code> when <i>SourceIdentifier</i> is a cluster parameter group
     *        name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify <code>cluster-snapshot</code> when <i>SourceIdentifier</i> is a cluster snapshot identifier.
     *        </p>
     *        </li>
     * @see SourceType
     */

    public void setSourceType(SourceType sourceType) {
        withSourceType(sourceType);
    }

    /**
     * <p>
     * The event source to retrieve events for. If no value is specified, all events are returned.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <p>
     * If <i>SourceType</i> is supplied, <i>SourceIdentifier</i> must also be provided.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify <code>cluster</code> when <i>SourceIdentifier</i> is a cluster identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>cluster-security-group</code> when <i>SourceIdentifier</i> is a cluster security group name.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>cluster-parameter-group</code> when <i>SourceIdentifier</i> is a cluster parameter group name.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>cluster-snapshot</code> when <i>SourceIdentifier</i> is a cluster snapshot identifier.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceType
     *        The event source to retrieve events for. If no value is specified, all events are returned.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <p>
     *        If <i>SourceType</i> is supplied, <i>SourceIdentifier</i> must also be provided.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specify <code>cluster</code> when <i>SourceIdentifier</i> is a cluster identifier.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify <code>cluster-security-group</code> when <i>SourceIdentifier</i> is a cluster security group name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify <code>cluster-parameter-group</code> when <i>SourceIdentifier</i> is a cluster parameter group
     *        name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify <code>cluster-snapshot</code> when <i>SourceIdentifier</i> is a cluster snapshot identifier.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public DescribeEventsRequest withSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
        return this;
    }

    /**
     * <p>
     * The beginning of the time interval to retrieve events for, specified in ISO 8601 format. For more information
     * about ISO 8601, go to the <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <p>
     * Example: <code>2009-07-08T18:00Z</code>
     * </p>
     * 
     * @param startTime
     *        The beginning of the time interval to retrieve events for, specified in ISO 8601 format. For more
     *        information about ISO 8601, go to the <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *        page.</a> </p>
     *        <p>
     *        Example: <code>2009-07-08T18:00Z</code>
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The beginning of the time interval to retrieve events for, specified in ISO 8601 format. For more information
     * about ISO 8601, go to the <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <p>
     * Example: <code>2009-07-08T18:00Z</code>
     * </p>
     * 
     * @return The beginning of the time interval to retrieve events for, specified in ISO 8601 format. For more
     *         information about ISO 8601, go to the <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *         page.</a> </p>
     *         <p>
     *         Example: <code>2009-07-08T18:00Z</code>
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The beginning of the time interval to retrieve events for, specified in ISO 8601 format. For more information
     * about ISO 8601, go to the <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <p>
     * Example: <code>2009-07-08T18:00Z</code>
     * </p>
     * 
     * @param startTime
     *        The beginning of the time interval to retrieve events for, specified in ISO 8601 format. For more
     *        information about ISO 8601, go to the <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *        page.</a> </p>
     *        <p>
     *        Example: <code>2009-07-08T18:00Z</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventsRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end of the time interval for which to retrieve events, specified in ISO 8601 format. For more information
     * about ISO 8601, go to the <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <p>
     * Example: <code>2009-07-08T18:00Z</code>
     * </p>
     * 
     * @param endTime
     *        The end of the time interval for which to retrieve events, specified in ISO 8601 format. For more
     *        information about ISO 8601, go to the <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *        page.</a> </p>
     *        <p>
     *        Example: <code>2009-07-08T18:00Z</code>
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end of the time interval for which to retrieve events, specified in ISO 8601 format. For more information
     * about ISO 8601, go to the <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <p>
     * Example: <code>2009-07-08T18:00Z</code>
     * </p>
     * 
     * @return The end of the time interval for which to retrieve events, specified in ISO 8601 format. For more
     *         information about ISO 8601, go to the <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *         page.</a> </p>
     *         <p>
     *         Example: <code>2009-07-08T18:00Z</code>
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end of the time interval for which to retrieve events, specified in ISO 8601 format. For more information
     * about ISO 8601, go to the <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <p>
     * Example: <code>2009-07-08T18:00Z</code>
     * </p>
     * 
     * @param endTime
     *        The end of the time interval for which to retrieve events, specified in ISO 8601 format. For more
     *        information about ISO 8601, go to the <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *        page.</a> </p>
     *        <p>
     *        Example: <code>2009-07-08T18:00Z</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventsRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The number of minutes prior to the time of the request for which to retrieve events. For example, if the request
     * is sent at 18:00 and you specify a duration of 60, then only events which have occurred after 17:00 will be
     * returned.
     * </p>
     * <p>
     * Default: <code>60</code>
     * </p>
     * 
     * @param duration
     *        The number of minutes prior to the time of the request for which to retrieve events. For example, if the
     *        request is sent at 18:00 and you specify a duration of 60, then only events which have occurred after
     *        17:00 will be returned.</p>
     *        <p>
     *        Default: <code>60</code>
     */

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The number of minutes prior to the time of the request for which to retrieve events. For example, if the request
     * is sent at 18:00 and you specify a duration of 60, then only events which have occurred after 17:00 will be
     * returned.
     * </p>
     * <p>
     * Default: <code>60</code>
     * </p>
     * 
     * @return The number of minutes prior to the time of the request for which to retrieve events. For example, if the
     *         request is sent at 18:00 and you specify a duration of 60, then only events which have occurred after
     *         17:00 will be returned.</p>
     *         <p>
     *         Default: <code>60</code>
     */

    public Integer getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * The number of minutes prior to the time of the request for which to retrieve events. For example, if the request
     * is sent at 18:00 and you specify a duration of 60, then only events which have occurred after 17:00 will be
     * returned.
     * </p>
     * <p>
     * Default: <code>60</code>
     * </p>
     * 
     * @param duration
     *        The number of minutes prior to the time of the request for which to retrieve events. For example, if the
     *        request is sent at 18:00 and you specify a duration of 60, then only events which have occurred after
     *        17:00 will be returned.</p>
     *        <p>
     *        Default: <code>60</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventsRequest withDuration(Integer duration) {
        setDuration(duration);
        return this;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the number of remaining response records
     * exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of the
     * response. You can retrieve the next set of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of response records to return in each call. If the number of remaining response records
     *        exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of
     *        the response. You can retrieve the next set of records by retrying the command with the returned marker
     *        value. </p>
     *        <p>
     *        Default: <code>100</code>
     *        </p>
     *        <p>
     *        Constraints: minimum 20, maximum 100.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the number of remaining response records
     * exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of the
     * response. You can retrieve the next set of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     * 
     * @return The maximum number of response records to return in each call. If the number of remaining response
     *         records exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code>
     *         field of the response. You can retrieve the next set of records by retrying the command with the returned
     *         marker value. </p>
     *         <p>
     *         Default: <code>100</code>
     *         </p>
     *         <p>
     *         Constraints: minimum 20, maximum 100.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the number of remaining response records
     * exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of the
     * response. You can retrieve the next set of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of response records to return in each call. If the number of remaining response records
     *        exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of
     *        the response. You can retrieve the next set of records by retrying the command with the returned marker
     *        value. </p>
     *        <p>
     *        Default: <code>100</code>
     *        </p>
     *        <p>
     *        Constraints: minimum 20, maximum 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventsRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set of response records. When the results of
     * a <a>DescribeEvents</a> request exceed the value specified in <code>MaxRecords</code>, AWS returns a value in the
     * <code>Marker</code> field of the response. You can retrieve the next set of response records by providing the
     * returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     * 
     * @param marker
     *        An optional parameter that specifies the starting point to return a set of response records. When the
     *        results of a <a>DescribeEvents</a> request exceed the value specified in <code>MaxRecords</code>, AWS
     *        returns a value in the <code>Marker</code> field of the response. You can retrieve the next set of
     *        response records by providing the returned marker value in the <code>Marker</code> parameter and retrying
     *        the request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set of response records. When the results of
     * a <a>DescribeEvents</a> request exceed the value specified in <code>MaxRecords</code>, AWS returns a value in the
     * <code>Marker</code> field of the response. You can retrieve the next set of response records by providing the
     * returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     * 
     * @return An optional parameter that specifies the starting point to return a set of response records. When the
     *         results of a <a>DescribeEvents</a> request exceed the value specified in <code>MaxRecords</code>, AWS
     *         returns a value in the <code>Marker</code> field of the response. You can retrieve the next set of
     *         response records by providing the returned marker value in the <code>Marker</code> parameter and retrying
     *         the request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set of response records. When the results of
     * a <a>DescribeEvents</a> request exceed the value specified in <code>MaxRecords</code>, AWS returns a value in the
     * <code>Marker</code> field of the response. You can retrieve the next set of response records by providing the
     * returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     * 
     * @param marker
     *        An optional parameter that specifies the starting point to return a set of response records. When the
     *        results of a <a>DescribeEvents</a> request exceed the value specified in <code>MaxRecords</code>, AWS
     *        returns a value in the <code>Marker</code> field of the response. You can retrieve the next set of
     *        response records by providing the returned marker value in the <code>Marker</code> parameter and retrying
     *        the request.
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
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEventsRequest clone() {
        return (DescribeEventsRequest) super.clone();
    }

}
