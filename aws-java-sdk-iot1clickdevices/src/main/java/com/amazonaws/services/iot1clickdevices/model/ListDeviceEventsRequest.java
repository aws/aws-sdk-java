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
package com.amazonaws.services.iot1clickdevices.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/ListDeviceEvents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDeviceEventsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the device.
     * </p>
     */
    private String deviceId;
    /**
     * <p>
     * The start date for the device event query, in ISO8061 format. For example, 2018-03-28T15:45:12.880Z
     * </p>
     */
    private java.util.Date fromTimeStamp;
    /**
     * <p>
     * The maximum number of results to return per request. If not set, a default value of 100 is used.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The end date for the device event query, in ISO8061 format. For example, 2018-03-28T15:45:12.880Z
     * </p>
     */
    private java.util.Date toTimeStamp;

    /**
     * <p>
     * The unique identifier of the device.
     * </p>
     * 
     * @param deviceId
     *        The unique identifier of the device.
     */

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * <p>
     * The unique identifier of the device.
     * </p>
     * 
     * @return The unique identifier of the device.
     */

    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * <p>
     * The unique identifier of the device.
     * </p>
     * 
     * @param deviceId
     *        The unique identifier of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeviceEventsRequest withDeviceId(String deviceId) {
        setDeviceId(deviceId);
        return this;
    }

    /**
     * <p>
     * The start date for the device event query, in ISO8061 format. For example, 2018-03-28T15:45:12.880Z
     * </p>
     * 
     * @param fromTimeStamp
     *        The start date for the device event query, in ISO8061 format. For example, 2018-03-28T15:45:12.880Z
     */

    public void setFromTimeStamp(java.util.Date fromTimeStamp) {
        this.fromTimeStamp = fromTimeStamp;
    }

    /**
     * <p>
     * The start date for the device event query, in ISO8061 format. For example, 2018-03-28T15:45:12.880Z
     * </p>
     * 
     * @return The start date for the device event query, in ISO8061 format. For example, 2018-03-28T15:45:12.880Z
     */

    public java.util.Date getFromTimeStamp() {
        return this.fromTimeStamp;
    }

    /**
     * <p>
     * The start date for the device event query, in ISO8061 format. For example, 2018-03-28T15:45:12.880Z
     * </p>
     * 
     * @param fromTimeStamp
     *        The start date for the device event query, in ISO8061 format. For example, 2018-03-28T15:45:12.880Z
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeviceEventsRequest withFromTimeStamp(java.util.Date fromTimeStamp) {
        setFromTimeStamp(fromTimeStamp);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per request. If not set, a default value of 100 is used.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per request. If not set, a default value of 100 is used.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per request. If not set, a default value of 100 is used.
     * </p>
     * 
     * @return The maximum number of results to return per request. If not set, a default value of 100 is used.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per request. If not set, a default value of 100 is used.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per request. If not set, a default value of 100 is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeviceEventsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @return The token to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeviceEventsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The end date for the device event query, in ISO8061 format. For example, 2018-03-28T15:45:12.880Z
     * </p>
     * 
     * @param toTimeStamp
     *        The end date for the device event query, in ISO8061 format. For example, 2018-03-28T15:45:12.880Z
     */

    public void setToTimeStamp(java.util.Date toTimeStamp) {
        this.toTimeStamp = toTimeStamp;
    }

    /**
     * <p>
     * The end date for the device event query, in ISO8061 format. For example, 2018-03-28T15:45:12.880Z
     * </p>
     * 
     * @return The end date for the device event query, in ISO8061 format. For example, 2018-03-28T15:45:12.880Z
     */

    public java.util.Date getToTimeStamp() {
        return this.toTimeStamp;
    }

    /**
     * <p>
     * The end date for the device event query, in ISO8061 format. For example, 2018-03-28T15:45:12.880Z
     * </p>
     * 
     * @param toTimeStamp
     *        The end date for the device event query, in ISO8061 format. For example, 2018-03-28T15:45:12.880Z
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeviceEventsRequest withToTimeStamp(java.util.Date toTimeStamp) {
        setToTimeStamp(toTimeStamp);
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
        if (getFromTimeStamp() != null)
            sb.append("FromTimeStamp: ").append(getFromTimeStamp()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getToTimeStamp() != null)
            sb.append("ToTimeStamp: ").append(getToTimeStamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDeviceEventsRequest == false)
            return false;
        ListDeviceEventsRequest other = (ListDeviceEventsRequest) obj;
        if (other.getDeviceId() == null ^ this.getDeviceId() == null)
            return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false)
            return false;
        if (other.getFromTimeStamp() == null ^ this.getFromTimeStamp() == null)
            return false;
        if (other.getFromTimeStamp() != null && other.getFromTimeStamp().equals(this.getFromTimeStamp()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getToTimeStamp() == null ^ this.getToTimeStamp() == null)
            return false;
        if (other.getToTimeStamp() != null && other.getToTimeStamp().equals(this.getToTimeStamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode + ((getFromTimeStamp() == null) ? 0 : getFromTimeStamp().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getToTimeStamp() == null) ? 0 : getToTimeStamp().hashCode());
        return hashCode;
    }

    @Override
    public ListDeviceEventsRequest clone() {
        return (ListDeviceEventsRequest) super.clone();
    }

}
