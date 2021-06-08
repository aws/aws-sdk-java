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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetServiceEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServiceEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The service type for which to get endpoint information about. Can be <code>CUPS</code> for the Configuration and
     * Update Server endpoint, or <code>LNS</code> for the LoRaWAN Network Server endpoint.
     * </p>
     */
    private String serviceType;

    /**
     * <p>
     * The service type for which to get endpoint information about. Can be <code>CUPS</code> for the Configuration and
     * Update Server endpoint, or <code>LNS</code> for the LoRaWAN Network Server endpoint.
     * </p>
     * 
     * @param serviceType
     *        The service type for which to get endpoint information about. Can be <code>CUPS</code> for the
     *        Configuration and Update Server endpoint, or <code>LNS</code> for the LoRaWAN Network Server endpoint.
     * @see WirelessGatewayServiceType
     */

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * <p>
     * The service type for which to get endpoint information about. Can be <code>CUPS</code> for the Configuration and
     * Update Server endpoint, or <code>LNS</code> for the LoRaWAN Network Server endpoint.
     * </p>
     * 
     * @return The service type for which to get endpoint information about. Can be <code>CUPS</code> for the
     *         Configuration and Update Server endpoint, or <code>LNS</code> for the LoRaWAN Network Server endpoint.
     * @see WirelessGatewayServiceType
     */

    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * <p>
     * The service type for which to get endpoint information about. Can be <code>CUPS</code> for the Configuration and
     * Update Server endpoint, or <code>LNS</code> for the LoRaWAN Network Server endpoint.
     * </p>
     * 
     * @param serviceType
     *        The service type for which to get endpoint information about. Can be <code>CUPS</code> for the
     *        Configuration and Update Server endpoint, or <code>LNS</code> for the LoRaWAN Network Server endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WirelessGatewayServiceType
     */

    public GetServiceEndpointRequest withServiceType(String serviceType) {
        setServiceType(serviceType);
        return this;
    }

    /**
     * <p>
     * The service type for which to get endpoint information about. Can be <code>CUPS</code> for the Configuration and
     * Update Server endpoint, or <code>LNS</code> for the LoRaWAN Network Server endpoint.
     * </p>
     * 
     * @param serviceType
     *        The service type for which to get endpoint information about. Can be <code>CUPS</code> for the
     *        Configuration and Update Server endpoint, or <code>LNS</code> for the LoRaWAN Network Server endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WirelessGatewayServiceType
     */

    public GetServiceEndpointRequest withServiceType(WirelessGatewayServiceType serviceType) {
        this.serviceType = serviceType.toString();
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
        if (getServiceType() != null)
            sb.append("ServiceType: ").append(getServiceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetServiceEndpointRequest == false)
            return false;
        GetServiceEndpointRequest other = (GetServiceEndpointRequest) obj;
        if (other.getServiceType() == null ^ this.getServiceType() == null)
            return false;
        if (other.getServiceType() != null && other.getServiceType().equals(this.getServiceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceType() == null) ? 0 : getServiceType().hashCode());
        return hashCode;
    }

    @Override
    public GetServiceEndpointRequest clone() {
        return (GetServiceEndpointRequest) super.clone();
    }

}
