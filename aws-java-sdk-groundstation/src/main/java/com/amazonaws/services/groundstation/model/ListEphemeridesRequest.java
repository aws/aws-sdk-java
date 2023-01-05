/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ListEphemerides" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEphemeridesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The end time to list in UTC. The operation will return an ephemeris if its expiration time is within the time
     * range defined by the <code>startTime</code> and <code>endTime</code>.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * Maximum number of ephemerides to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Pagination token.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The AWS Ground Station satellite ID to list ephemeris for.
     * </p>
     */
    private String satelliteId;
    /**
     * <p>
     * The start time to list in UTC. The operation will return an ephemeris if its expiration time is within the time
     * range defined by the <code>startTime</code> and <code>endTime</code>.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The list of ephemeris status to return.
     * </p>
     */
    private java.util.List<String> statusList;

    /**
     * <p>
     * The end time to list in UTC. The operation will return an ephemeris if its expiration time is within the time
     * range defined by the <code>startTime</code> and <code>endTime</code>.
     * </p>
     * 
     * @param endTime
     *        The end time to list in UTC. The operation will return an ephemeris if its expiration time is within the
     *        time range defined by the <code>startTime</code> and <code>endTime</code>.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time to list in UTC. The operation will return an ephemeris if its expiration time is within the time
     * range defined by the <code>startTime</code> and <code>endTime</code>.
     * </p>
     * 
     * @return The end time to list in UTC. The operation will return an ephemeris if its expiration time is within the
     *         time range defined by the <code>startTime</code> and <code>endTime</code>.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time to list in UTC. The operation will return an ephemeris if its expiration time is within the time
     * range defined by the <code>startTime</code> and <code>endTime</code>.
     * </p>
     * 
     * @param endTime
     *        The end time to list in UTC. The operation will return an ephemeris if its expiration time is within the
     *        time range defined by the <code>startTime</code> and <code>endTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEphemeridesRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * Maximum number of ephemerides to return.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of ephemerides to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of ephemerides to return.
     * </p>
     * 
     * @return Maximum number of ephemerides to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of ephemerides to return.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of ephemerides to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEphemeridesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Pagination token.
     * </p>
     * 
     * @param nextToken
     *        Pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token.
     * </p>
     * 
     * @return Pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination token.
     * </p>
     * 
     * @param nextToken
     *        Pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEphemeridesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The AWS Ground Station satellite ID to list ephemeris for.
     * </p>
     * 
     * @param satelliteId
     *        The AWS Ground Station satellite ID to list ephemeris for.
     */

    public void setSatelliteId(String satelliteId) {
        this.satelliteId = satelliteId;
    }

    /**
     * <p>
     * The AWS Ground Station satellite ID to list ephemeris for.
     * </p>
     * 
     * @return The AWS Ground Station satellite ID to list ephemeris for.
     */

    public String getSatelliteId() {
        return this.satelliteId;
    }

    /**
     * <p>
     * The AWS Ground Station satellite ID to list ephemeris for.
     * </p>
     * 
     * @param satelliteId
     *        The AWS Ground Station satellite ID to list ephemeris for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEphemeridesRequest withSatelliteId(String satelliteId) {
        setSatelliteId(satelliteId);
        return this;
    }

    /**
     * <p>
     * The start time to list in UTC. The operation will return an ephemeris if its expiration time is within the time
     * range defined by the <code>startTime</code> and <code>endTime</code>.
     * </p>
     * 
     * @param startTime
     *        The start time to list in UTC. The operation will return an ephemeris if its expiration time is within the
     *        time range defined by the <code>startTime</code> and <code>endTime</code>.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time to list in UTC. The operation will return an ephemeris if its expiration time is within the time
     * range defined by the <code>startTime</code> and <code>endTime</code>.
     * </p>
     * 
     * @return The start time to list in UTC. The operation will return an ephemeris if its expiration time is within
     *         the time range defined by the <code>startTime</code> and <code>endTime</code>.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time to list in UTC. The operation will return an ephemeris if its expiration time is within the time
     * range defined by the <code>startTime</code> and <code>endTime</code>.
     * </p>
     * 
     * @param startTime
     *        The start time to list in UTC. The operation will return an ephemeris if its expiration time is within the
     *        time range defined by the <code>startTime</code> and <code>endTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEphemeridesRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The list of ephemeris status to return.
     * </p>
     * 
     * @return The list of ephemeris status to return.
     * @see EphemerisStatus
     */

    public java.util.List<String> getStatusList() {
        return statusList;
    }

    /**
     * <p>
     * The list of ephemeris status to return.
     * </p>
     * 
     * @param statusList
     *        The list of ephemeris status to return.
     * @see EphemerisStatus
     */

    public void setStatusList(java.util.Collection<String> statusList) {
        if (statusList == null) {
            this.statusList = null;
            return;
        }

        this.statusList = new java.util.ArrayList<String>(statusList);
    }

    /**
     * <p>
     * The list of ephemeris status to return.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatusList(java.util.Collection)} or {@link #withStatusList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param statusList
     *        The list of ephemeris status to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EphemerisStatus
     */

    public ListEphemeridesRequest withStatusList(String... statusList) {
        if (this.statusList == null) {
            setStatusList(new java.util.ArrayList<String>(statusList.length));
        }
        for (String ele : statusList) {
            this.statusList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of ephemeris status to return.
     * </p>
     * 
     * @param statusList
     *        The list of ephemeris status to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EphemerisStatus
     */

    public ListEphemeridesRequest withStatusList(java.util.Collection<String> statusList) {
        setStatusList(statusList);
        return this;
    }

    /**
     * <p>
     * The list of ephemeris status to return.
     * </p>
     * 
     * @param statusList
     *        The list of ephemeris status to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EphemerisStatus
     */

    public ListEphemeridesRequest withStatusList(EphemerisStatus... statusList) {
        java.util.ArrayList<String> statusListCopy = new java.util.ArrayList<String>(statusList.length);
        for (EphemerisStatus value : statusList) {
            statusListCopy.add(value.toString());
        }
        if (getStatusList() == null) {
            setStatusList(statusListCopy);
        } else {
            getStatusList().addAll(statusListCopy);
        }
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
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSatelliteId() != null)
            sb.append("SatelliteId: ").append(getSatelliteId()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getStatusList() != null)
            sb.append("StatusList: ").append(getStatusList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEphemeridesRequest == false)
            return false;
        ListEphemeridesRequest other = (ListEphemeridesRequest) obj;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSatelliteId() == null ^ this.getSatelliteId() == null)
            return false;
        if (other.getSatelliteId() != null && other.getSatelliteId().equals(this.getSatelliteId()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getStatusList() == null ^ this.getStatusList() == null)
            return false;
        if (other.getStatusList() != null && other.getStatusList().equals(this.getStatusList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSatelliteId() == null) ? 0 : getSatelliteId().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getStatusList() == null) ? 0 : getStatusList().hashCode());
        return hashCode;
    }

    @Override
    public ListEphemeridesRequest clone() {
        return (ListEphemeridesRequest) super.clone();
    }

}
