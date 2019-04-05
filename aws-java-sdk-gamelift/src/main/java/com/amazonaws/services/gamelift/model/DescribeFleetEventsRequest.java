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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetEvents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFleetEventsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for a fleet to get event logs for.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * Earliest date to retrieve event logs for. If no start time is specified, this call returns entries starting from
     * when the fleet was created to the specified end time. Format is a number expressed in Unix time as milliseconds
     * (ex: "1469498468.057").
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * Most recent date to retrieve event logs for. If no end time is specified, this call returns entries from the
     * specified start time up to the present. Format is a number expressed in Unix time as milliseconds (ex:
     * "1469498468.057").
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set of
     * sequential pages.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * Token that indicates the start of the next sequential page of results. Use the token that is returned with a
     * previous call to this action. To start at the beginning of the result set, do not specify a value.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Unique identifier for a fleet to get event logs for.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet to get event logs for.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet to get event logs for.
     * </p>
     * 
     * @return Unique identifier for a fleet to get event logs for.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet to get event logs for.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet to get event logs for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetEventsRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * Earliest date to retrieve event logs for. If no start time is specified, this call returns entries starting from
     * when the fleet was created to the specified end time. Format is a number expressed in Unix time as milliseconds
     * (ex: "1469498468.057").
     * </p>
     * 
     * @param startTime
     *        Earliest date to retrieve event logs for. If no start time is specified, this call returns entries
     *        starting from when the fleet was created to the specified end time. Format is a number expressed in Unix
     *        time as milliseconds (ex: "1469498468.057").
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * Earliest date to retrieve event logs for. If no start time is specified, this call returns entries starting from
     * when the fleet was created to the specified end time. Format is a number expressed in Unix time as milliseconds
     * (ex: "1469498468.057").
     * </p>
     * 
     * @return Earliest date to retrieve event logs for. If no start time is specified, this call returns entries
     *         starting from when the fleet was created to the specified end time. Format is a number expressed in Unix
     *         time as milliseconds (ex: "1469498468.057").
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * Earliest date to retrieve event logs for. If no start time is specified, this call returns entries starting from
     * when the fleet was created to the specified end time. Format is a number expressed in Unix time as milliseconds
     * (ex: "1469498468.057").
     * </p>
     * 
     * @param startTime
     *        Earliest date to retrieve event logs for. If no start time is specified, this call returns entries
     *        starting from when the fleet was created to the specified end time. Format is a number expressed in Unix
     *        time as milliseconds (ex: "1469498468.057").
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetEventsRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * Most recent date to retrieve event logs for. If no end time is specified, this call returns entries from the
     * specified start time up to the present. Format is a number expressed in Unix time as milliseconds (ex:
     * "1469498468.057").
     * </p>
     * 
     * @param endTime
     *        Most recent date to retrieve event logs for. If no end time is specified, this call returns entries from
     *        the specified start time up to the present. Format is a number expressed in Unix time as milliseconds (ex:
     *        "1469498468.057").
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * Most recent date to retrieve event logs for. If no end time is specified, this call returns entries from the
     * specified start time up to the present. Format is a number expressed in Unix time as milliseconds (ex:
     * "1469498468.057").
     * </p>
     * 
     * @return Most recent date to retrieve event logs for. If no end time is specified, this call returns entries from
     *         the specified start time up to the present. Format is a number expressed in Unix time as milliseconds
     *         (ex: "1469498468.057").
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * Most recent date to retrieve event logs for. If no end time is specified, this call returns entries from the
     * specified start time up to the present. Format is a number expressed in Unix time as milliseconds (ex:
     * "1469498468.057").
     * </p>
     * 
     * @param endTime
     *        Most recent date to retrieve event logs for. If no end time is specified, this call returns entries from
     *        the specified start time up to the present. Format is a number expressed in Unix time as milliseconds (ex:
     *        "1469498468.057").
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetEventsRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set of
     * sequential pages.
     * </p>
     * 
     * @param limit
     *        Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a
     *        set of sequential pages.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set of
     * sequential pages.
     * </p>
     * 
     * @return Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a
     *         set of sequential pages.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set of
     * sequential pages.
     * </p>
     * 
     * @param limit
     *        Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a
     *        set of sequential pages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetEventsRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * Token that indicates the start of the next sequential page of results. Use the token that is returned with a
     * previous call to this action. To start at the beginning of the result set, do not specify a value.
     * </p>
     * 
     * @param nextToken
     *        Token that indicates the start of the next sequential page of results. Use the token that is returned with
     *        a previous call to this action. To start at the beginning of the result set, do not specify a value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token that indicates the start of the next sequential page of results. Use the token that is returned with a
     * previous call to this action. To start at the beginning of the result set, do not specify a value.
     * </p>
     * 
     * @return Token that indicates the start of the next sequential page of results. Use the token that is returned
     *         with a previous call to this action. To start at the beginning of the result set, do not specify a value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token that indicates the start of the next sequential page of results. Use the token that is returned with a
     * previous call to this action. To start at the beginning of the result set, do not specify a value.
     * </p>
     * 
     * @param nextToken
     *        Token that indicates the start of the next sequential page of results. Use the token that is returned with
     *        a previous call to this action. To start at the beginning of the result set, do not specify a value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetEventsRequest withNextToken(String nextToken) {
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
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
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

        if (obj instanceof DescribeFleetEventsRequest == false)
            return false;
        DescribeFleetEventsRequest other = (DescribeFleetEventsRequest) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
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

        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFleetEventsRequest clone() {
        return (DescribeFleetEventsRequest) super.clone();
    }

}
