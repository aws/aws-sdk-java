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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessDeviceStatistics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWirelessDeviceStatisticsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the wireless device for which to get the data.
     * </p>
     */
    private String wirelessDeviceId;

    /**
     * <p>
     * The ID of the wireless device for which to get the data.
     * </p>
     * 
     * @param wirelessDeviceId
     *        The ID of the wireless device for which to get the data.
     */

    public void setWirelessDeviceId(String wirelessDeviceId) {
        this.wirelessDeviceId = wirelessDeviceId;
    }

    /**
     * <p>
     * The ID of the wireless device for which to get the data.
     * </p>
     * 
     * @return The ID of the wireless device for which to get the data.
     */

    public String getWirelessDeviceId() {
        return this.wirelessDeviceId;
    }

    /**
     * <p>
     * The ID of the wireless device for which to get the data.
     * </p>
     * 
     * @param wirelessDeviceId
     *        The ID of the wireless device for which to get the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessDeviceStatisticsRequest withWirelessDeviceId(String wirelessDeviceId) {
        setWirelessDeviceId(wirelessDeviceId);
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
        if (getWirelessDeviceId() != null)
            sb.append("WirelessDeviceId: ").append(getWirelessDeviceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetWirelessDeviceStatisticsRequest == false)
            return false;
        GetWirelessDeviceStatisticsRequest other = (GetWirelessDeviceStatisticsRequest) obj;
        if (other.getWirelessDeviceId() == null ^ this.getWirelessDeviceId() == null)
            return false;
        if (other.getWirelessDeviceId() != null && other.getWirelessDeviceId().equals(this.getWirelessDeviceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWirelessDeviceId() == null) ? 0 : getWirelessDeviceId().hashCode());
        return hashCode;
    }

    @Override
    public GetWirelessDeviceStatisticsRequest clone() {
        return (GetWirelessDeviceStatisticsRequest) super.clone();
    }

}
