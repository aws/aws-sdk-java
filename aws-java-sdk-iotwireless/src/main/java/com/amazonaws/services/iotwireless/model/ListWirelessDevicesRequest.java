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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListWirelessDevices" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWirelessDevicesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of results to return in this operation.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise
     * <b>null</b> to receive the first set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A filter to list only the wireless devices that use this destination.
     * </p>
     */
    private String destinationName;
    /**
     * <p>
     * A filter to list only the wireless devices that use this device profile.
     * </p>
     */
    private String deviceProfileId;
    /**
     * <p>
     * A filter to list only the wireless devices that use this service profile.
     * </p>
     */
    private String serviceProfileId;
    /**
     * <p>
     * A filter to list only the wireless devices that use this wireless device type.
     * </p>
     */
    private String wirelessDeviceType;

    /**
     * <p>
     * The maximum number of results to return in this operation.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in this operation.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in this operation.
     * </p>
     * 
     * @return The maximum number of results to return in this operation.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in this operation.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWirelessDevicesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise
     * <b>null</b> to receive the first set of results.
     * </p>
     * 
     * @param nextToken
     *        To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise
     *        <b>null</b> to receive the first set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise
     * <b>null</b> to receive the first set of results.
     * </p>
     * 
     * @return To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise
     *         <b>null</b> to receive the first set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise
     * <b>null</b> to receive the first set of results.
     * </p>
     * 
     * @param nextToken
     *        To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise
     *        <b>null</b> to receive the first set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWirelessDevicesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A filter to list only the wireless devices that use this destination.
     * </p>
     * 
     * @param destinationName
     *        A filter to list only the wireless devices that use this destination.
     */

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    /**
     * <p>
     * A filter to list only the wireless devices that use this destination.
     * </p>
     * 
     * @return A filter to list only the wireless devices that use this destination.
     */

    public String getDestinationName() {
        return this.destinationName;
    }

    /**
     * <p>
     * A filter to list only the wireless devices that use this destination.
     * </p>
     * 
     * @param destinationName
     *        A filter to list only the wireless devices that use this destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWirelessDevicesRequest withDestinationName(String destinationName) {
        setDestinationName(destinationName);
        return this;
    }

    /**
     * <p>
     * A filter to list only the wireless devices that use this device profile.
     * </p>
     * 
     * @param deviceProfileId
     *        A filter to list only the wireless devices that use this device profile.
     */

    public void setDeviceProfileId(String deviceProfileId) {
        this.deviceProfileId = deviceProfileId;
    }

    /**
     * <p>
     * A filter to list only the wireless devices that use this device profile.
     * </p>
     * 
     * @return A filter to list only the wireless devices that use this device profile.
     */

    public String getDeviceProfileId() {
        return this.deviceProfileId;
    }

    /**
     * <p>
     * A filter to list only the wireless devices that use this device profile.
     * </p>
     * 
     * @param deviceProfileId
     *        A filter to list only the wireless devices that use this device profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWirelessDevicesRequest withDeviceProfileId(String deviceProfileId) {
        setDeviceProfileId(deviceProfileId);
        return this;
    }

    /**
     * <p>
     * A filter to list only the wireless devices that use this service profile.
     * </p>
     * 
     * @param serviceProfileId
     *        A filter to list only the wireless devices that use this service profile.
     */

    public void setServiceProfileId(String serviceProfileId) {
        this.serviceProfileId = serviceProfileId;
    }

    /**
     * <p>
     * A filter to list only the wireless devices that use this service profile.
     * </p>
     * 
     * @return A filter to list only the wireless devices that use this service profile.
     */

    public String getServiceProfileId() {
        return this.serviceProfileId;
    }

    /**
     * <p>
     * A filter to list only the wireless devices that use this service profile.
     * </p>
     * 
     * @param serviceProfileId
     *        A filter to list only the wireless devices that use this service profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWirelessDevicesRequest withServiceProfileId(String serviceProfileId) {
        setServiceProfileId(serviceProfileId);
        return this;
    }

    /**
     * <p>
     * A filter to list only the wireless devices that use this wireless device type.
     * </p>
     * 
     * @param wirelessDeviceType
     *        A filter to list only the wireless devices that use this wireless device type.
     * @see WirelessDeviceType
     */

    public void setWirelessDeviceType(String wirelessDeviceType) {
        this.wirelessDeviceType = wirelessDeviceType;
    }

    /**
     * <p>
     * A filter to list only the wireless devices that use this wireless device type.
     * </p>
     * 
     * @return A filter to list only the wireless devices that use this wireless device type.
     * @see WirelessDeviceType
     */

    public String getWirelessDeviceType() {
        return this.wirelessDeviceType;
    }

    /**
     * <p>
     * A filter to list only the wireless devices that use this wireless device type.
     * </p>
     * 
     * @param wirelessDeviceType
     *        A filter to list only the wireless devices that use this wireless device type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WirelessDeviceType
     */

    public ListWirelessDevicesRequest withWirelessDeviceType(String wirelessDeviceType) {
        setWirelessDeviceType(wirelessDeviceType);
        return this;
    }

    /**
     * <p>
     * A filter to list only the wireless devices that use this wireless device type.
     * </p>
     * 
     * @param wirelessDeviceType
     *        A filter to list only the wireless devices that use this wireless device type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WirelessDeviceType
     */

    public ListWirelessDevicesRequest withWirelessDeviceType(WirelessDeviceType wirelessDeviceType) {
        this.wirelessDeviceType = wirelessDeviceType.toString();
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getDestinationName() != null)
            sb.append("DestinationName: ").append(getDestinationName()).append(",");
        if (getDeviceProfileId() != null)
            sb.append("DeviceProfileId: ").append(getDeviceProfileId()).append(",");
        if (getServiceProfileId() != null)
            sb.append("ServiceProfileId: ").append(getServiceProfileId()).append(",");
        if (getWirelessDeviceType() != null)
            sb.append("WirelessDeviceType: ").append(getWirelessDeviceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListWirelessDevicesRequest == false)
            return false;
        ListWirelessDevicesRequest other = (ListWirelessDevicesRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getDestinationName() == null ^ this.getDestinationName() == null)
            return false;
        if (other.getDestinationName() != null && other.getDestinationName().equals(this.getDestinationName()) == false)
            return false;
        if (other.getDeviceProfileId() == null ^ this.getDeviceProfileId() == null)
            return false;
        if (other.getDeviceProfileId() != null && other.getDeviceProfileId().equals(this.getDeviceProfileId()) == false)
            return false;
        if (other.getServiceProfileId() == null ^ this.getServiceProfileId() == null)
            return false;
        if (other.getServiceProfileId() != null && other.getServiceProfileId().equals(this.getServiceProfileId()) == false)
            return false;
        if (other.getWirelessDeviceType() == null ^ this.getWirelessDeviceType() == null)
            return false;
        if (other.getWirelessDeviceType() != null && other.getWirelessDeviceType().equals(this.getWirelessDeviceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getDestinationName() == null) ? 0 : getDestinationName().hashCode());
        hashCode = prime * hashCode + ((getDeviceProfileId() == null) ? 0 : getDeviceProfileId().hashCode());
        hashCode = prime * hashCode + ((getServiceProfileId() == null) ? 0 : getServiceProfileId().hashCode());
        hashCode = prime * hashCode + ((getWirelessDeviceType() == null) ? 0 : getWirelessDeviceType().hashCode());
        return hashCode;
    }

    @Override
    public ListWirelessDevicesRequest clone() {
        return (ListWirelessDevicesRequest) super.clone();
    }

}
