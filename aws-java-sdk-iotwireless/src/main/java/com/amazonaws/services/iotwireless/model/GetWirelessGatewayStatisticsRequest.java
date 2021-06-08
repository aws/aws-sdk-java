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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessGatewayStatistics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWirelessGatewayStatisticsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the wireless gateway for which to get the data.
     * </p>
     */
    private String wirelessGatewayId;

    /**
     * <p>
     * The ID of the wireless gateway for which to get the data.
     * </p>
     * 
     * @param wirelessGatewayId
     *        The ID of the wireless gateway for which to get the data.
     */

    public void setWirelessGatewayId(String wirelessGatewayId) {
        this.wirelessGatewayId = wirelessGatewayId;
    }

    /**
     * <p>
     * The ID of the wireless gateway for which to get the data.
     * </p>
     * 
     * @return The ID of the wireless gateway for which to get the data.
     */

    public String getWirelessGatewayId() {
        return this.wirelessGatewayId;
    }

    /**
     * <p>
     * The ID of the wireless gateway for which to get the data.
     * </p>
     * 
     * @param wirelessGatewayId
     *        The ID of the wireless gateway for which to get the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessGatewayStatisticsRequest withWirelessGatewayId(String wirelessGatewayId) {
        setWirelessGatewayId(wirelessGatewayId);
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
        if (getWirelessGatewayId() != null)
            sb.append("WirelessGatewayId: ").append(getWirelessGatewayId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetWirelessGatewayStatisticsRequest == false)
            return false;
        GetWirelessGatewayStatisticsRequest other = (GetWirelessGatewayStatisticsRequest) obj;
        if (other.getWirelessGatewayId() == null ^ this.getWirelessGatewayId() == null)
            return false;
        if (other.getWirelessGatewayId() != null && other.getWirelessGatewayId().equals(this.getWirelessGatewayId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWirelessGatewayId() == null) ? 0 : getWirelessGatewayId().hashCode());
        return hashCode;
    }

    @Override
    public GetWirelessGatewayStatisticsRequest clone() {
        return (GetWirelessGatewayStatisticsRequest) super.clone();
    }

}
