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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetDevicePositionHistory" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDevicePositionHistoryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The device whose position history you want to retrieve.
     * </p>
     */
    private String deviceId;
    /**
     * <p>
     * Specify the end time for the position history in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. By default, the value will be the time that the request is made.
     * </p>
     * <p>
     * Requirement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The time specified for <code>EndTimeExclusive</code> must be after the time for <code>StartTimeInclusive</code>.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Date endTimeExclusive;
    /**
     * <p>
     * The pagination token specifying which page of results to return in the response. If no token is provided, the
     * default page is the first page.
     * </p>
     * <p>
     * Default value: <code>null</code>
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Specify the start time for the position history in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. By default, the value will be 24 hours prior to the time that the request
     * is made.
     * </p>
     * <p>
     * Requirement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The time specified for <code>StartTimeInclusive</code> must be before <code>EndTimeExclusive</code>.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Date startTimeInclusive;
    /**
     * <p>
     * The tracker resource receiving the request for the device position history.
     * </p>
     */
    private String trackerName;

    /**
     * <p>
     * The device whose position history you want to retrieve.
     * </p>
     * 
     * @param deviceId
     *        The device whose position history you want to retrieve.
     */

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * <p>
     * The device whose position history you want to retrieve.
     * </p>
     * 
     * @return The device whose position history you want to retrieve.
     */

    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * <p>
     * The device whose position history you want to retrieve.
     * </p>
     * 
     * @param deviceId
     *        The device whose position history you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDevicePositionHistoryRequest withDeviceId(String deviceId) {
        setDeviceId(deviceId);
        return this;
    }

    /**
     * <p>
     * Specify the end time for the position history in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. By default, the value will be the time that the request is made.
     * </p>
     * <p>
     * Requirement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The time specified for <code>EndTimeExclusive</code> must be after the time for <code>StartTimeInclusive</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param endTimeExclusive
     *        Specify the end time for the position history in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. By default, the value will be the time that the request is
     *        made.</p>
     *        <p>
     *        Requirement:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The time specified for <code>EndTimeExclusive</code> must be after the time for
     *        <code>StartTimeInclusive</code>.
     *        </p>
     *        </li>
     */

    public void setEndTimeExclusive(java.util.Date endTimeExclusive) {
        this.endTimeExclusive = endTimeExclusive;
    }

    /**
     * <p>
     * Specify the end time for the position history in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. By default, the value will be the time that the request is made.
     * </p>
     * <p>
     * Requirement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The time specified for <code>EndTimeExclusive</code> must be after the time for <code>StartTimeInclusive</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specify the end time for the position history in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *         <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. By default, the value will be the time that the request is
     *         made.</p>
     *         <p>
     *         Requirement:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The time specified for <code>EndTimeExclusive</code> must be after the time for
     *         <code>StartTimeInclusive</code>.
     *         </p>
     *         </li>
     */

    public java.util.Date getEndTimeExclusive() {
        return this.endTimeExclusive;
    }

    /**
     * <p>
     * Specify the end time for the position history in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. By default, the value will be the time that the request is made.
     * </p>
     * <p>
     * Requirement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The time specified for <code>EndTimeExclusive</code> must be after the time for <code>StartTimeInclusive</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param endTimeExclusive
     *        Specify the end time for the position history in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. By default, the value will be the time that the request is
     *        made.</p>
     *        <p>
     *        Requirement:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The time specified for <code>EndTimeExclusive</code> must be after the time for
     *        <code>StartTimeInclusive</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDevicePositionHistoryRequest withEndTimeExclusive(java.util.Date endTimeExclusive) {
        setEndTimeExclusive(endTimeExclusive);
        return this;
    }

    /**
     * <p>
     * The pagination token specifying which page of results to return in the response. If no token is provided, the
     * default page is the first page.
     * </p>
     * <p>
     * Default value: <code>null</code>
     * </p>
     * 
     * @param nextToken
     *        The pagination token specifying which page of results to return in the response. If no token is provided,
     *        the default page is the first page. </p>
     *        <p>
     *        Default value: <code>null</code>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token specifying which page of results to return in the response. If no token is provided, the
     * default page is the first page.
     * </p>
     * <p>
     * Default value: <code>null</code>
     * </p>
     * 
     * @return The pagination token specifying which page of results to return in the response. If no token is provided,
     *         the default page is the first page. </p>
     *         <p>
     *         Default value: <code>null</code>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token specifying which page of results to return in the response. If no token is provided, the
     * default page is the first page.
     * </p>
     * <p>
     * Default value: <code>null</code>
     * </p>
     * 
     * @param nextToken
     *        The pagination token specifying which page of results to return in the response. If no token is provided,
     *        the default page is the first page. </p>
     *        <p>
     *        Default value: <code>null</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDevicePositionHistoryRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Specify the start time for the position history in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. By default, the value will be 24 hours prior to the time that the request
     * is made.
     * </p>
     * <p>
     * Requirement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The time specified for <code>StartTimeInclusive</code> must be before <code>EndTimeExclusive</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param startTimeInclusive
     *        Specify the start time for the position history in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. By default, the value will be 24 hours prior to the time that the
     *        request is made.</p>
     *        <p>
     *        Requirement:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The time specified for <code>StartTimeInclusive</code> must be before <code>EndTimeExclusive</code>.
     *        </p>
     *        </li>
     */

    public void setStartTimeInclusive(java.util.Date startTimeInclusive) {
        this.startTimeInclusive = startTimeInclusive;
    }

    /**
     * <p>
     * Specify the start time for the position history in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. By default, the value will be 24 hours prior to the time that the request
     * is made.
     * </p>
     * <p>
     * Requirement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The time specified for <code>StartTimeInclusive</code> must be before <code>EndTimeExclusive</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specify the start time for the position history in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *         <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. By default, the value will be 24 hours prior to the time that the
     *         request is made.</p>
     *         <p>
     *         Requirement:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The time specified for <code>StartTimeInclusive</code> must be before <code>EndTimeExclusive</code>.
     *         </p>
     *         </li>
     */

    public java.util.Date getStartTimeInclusive() {
        return this.startTimeInclusive;
    }

    /**
     * <p>
     * Specify the start time for the position history in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. By default, the value will be 24 hours prior to the time that the request
     * is made.
     * </p>
     * <p>
     * Requirement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The time specified for <code>StartTimeInclusive</code> must be before <code>EndTimeExclusive</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param startTimeInclusive
     *        Specify the start time for the position history in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. By default, the value will be 24 hours prior to the time that the
     *        request is made.</p>
     *        <p>
     *        Requirement:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The time specified for <code>StartTimeInclusive</code> must be before <code>EndTimeExclusive</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDevicePositionHistoryRequest withStartTimeInclusive(java.util.Date startTimeInclusive) {
        setStartTimeInclusive(startTimeInclusive);
        return this;
    }

    /**
     * <p>
     * The tracker resource receiving the request for the device position history.
     * </p>
     * 
     * @param trackerName
     *        The tracker resource receiving the request for the device position history.
     */

    public void setTrackerName(String trackerName) {
        this.trackerName = trackerName;
    }

    /**
     * <p>
     * The tracker resource receiving the request for the device position history.
     * </p>
     * 
     * @return The tracker resource receiving the request for the device position history.
     */

    public String getTrackerName() {
        return this.trackerName;
    }

    /**
     * <p>
     * The tracker resource receiving the request for the device position history.
     * </p>
     * 
     * @param trackerName
     *        The tracker resource receiving the request for the device position history.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDevicePositionHistoryRequest withTrackerName(String trackerName) {
        setTrackerName(trackerName);
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
        if (getDeviceId() != null)
            sb.append("DeviceId: ").append(getDeviceId()).append(",");
        if (getEndTimeExclusive() != null)
            sb.append("EndTimeExclusive: ").append(getEndTimeExclusive()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getStartTimeInclusive() != null)
            sb.append("StartTimeInclusive: ").append(getStartTimeInclusive()).append(",");
        if (getTrackerName() != null)
            sb.append("TrackerName: ").append(getTrackerName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDevicePositionHistoryRequest == false)
            return false;
        GetDevicePositionHistoryRequest other = (GetDevicePositionHistoryRequest) obj;
        if (other.getDeviceId() == null ^ this.getDeviceId() == null)
            return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false)
            return false;
        if (other.getEndTimeExclusive() == null ^ this.getEndTimeExclusive() == null)
            return false;
        if (other.getEndTimeExclusive() != null && other.getEndTimeExclusive().equals(this.getEndTimeExclusive()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStartTimeInclusive() == null ^ this.getStartTimeInclusive() == null)
            return false;
        if (other.getStartTimeInclusive() != null && other.getStartTimeInclusive().equals(this.getStartTimeInclusive()) == false)
            return false;
        if (other.getTrackerName() == null ^ this.getTrackerName() == null)
            return false;
        if (other.getTrackerName() != null && other.getTrackerName().equals(this.getTrackerName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode + ((getEndTimeExclusive() == null) ? 0 : getEndTimeExclusive().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStartTimeInclusive() == null) ? 0 : getStartTimeInclusive().hashCode());
        hashCode = prime * hashCode + ((getTrackerName() == null) ? 0 : getTrackerName().hashCode());
        return hashCode;
    }

    @Override
    public GetDevicePositionHistoryRequest clone() {
        return (GetDevicePositionHistoryRequest) super.clone();
    }

}
