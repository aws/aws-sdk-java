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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetServiceEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServiceEndpointResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The endpoint's service type.
     * </p>
     */
    private String serviceType;
    /**
     * <p>
     * The service endpoint value.
     * </p>
     */
    private String serviceEndpoint;
    /**
     * <p>
     * The Root CA of the server trust certificate.
     * </p>
     */
    private String serverTrust;

    /**
     * <p>
     * The endpoint's service type.
     * </p>
     * 
     * @param serviceType
     *        The endpoint's service type.
     * @see WirelessGatewayServiceType
     */

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * <p>
     * The endpoint's service type.
     * </p>
     * 
     * @return The endpoint's service type.
     * @see WirelessGatewayServiceType
     */

    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * <p>
     * The endpoint's service type.
     * </p>
     * 
     * @param serviceType
     *        The endpoint's service type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WirelessGatewayServiceType
     */

    public GetServiceEndpointResult withServiceType(String serviceType) {
        setServiceType(serviceType);
        return this;
    }

    /**
     * <p>
     * The endpoint's service type.
     * </p>
     * 
     * @param serviceType
     *        The endpoint's service type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WirelessGatewayServiceType
     */

    public GetServiceEndpointResult withServiceType(WirelessGatewayServiceType serviceType) {
        this.serviceType = serviceType.toString();
        return this;
    }

    /**
     * <p>
     * The service endpoint value.
     * </p>
     * 
     * @param serviceEndpoint
     *        The service endpoint value.
     */

    public void setServiceEndpoint(String serviceEndpoint) {
        this.serviceEndpoint = serviceEndpoint;
    }

    /**
     * <p>
     * The service endpoint value.
     * </p>
     * 
     * @return The service endpoint value.
     */

    public String getServiceEndpoint() {
        return this.serviceEndpoint;
    }

    /**
     * <p>
     * The service endpoint value.
     * </p>
     * 
     * @param serviceEndpoint
     *        The service endpoint value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceEndpointResult withServiceEndpoint(String serviceEndpoint) {
        setServiceEndpoint(serviceEndpoint);
        return this;
    }

    /**
     * <p>
     * The Root CA of the server trust certificate.
     * </p>
     * 
     * @param serverTrust
     *        The Root CA of the server trust certificate.
     */

    public void setServerTrust(String serverTrust) {
        this.serverTrust = serverTrust;
    }

    /**
     * <p>
     * The Root CA of the server trust certificate.
     * </p>
     * 
     * @return The Root CA of the server trust certificate.
     */

    public String getServerTrust() {
        return this.serverTrust;
    }

    /**
     * <p>
     * The Root CA of the server trust certificate.
     * </p>
     * 
     * @param serverTrust
     *        The Root CA of the server trust certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceEndpointResult withServerTrust(String serverTrust) {
        setServerTrust(serverTrust);
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
            sb.append("ServiceType: ").append(getServiceType()).append(",");
        if (getServiceEndpoint() != null)
            sb.append("ServiceEndpoint: ").append(getServiceEndpoint()).append(",");
        if (getServerTrust() != null)
            sb.append("ServerTrust: ").append(getServerTrust());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetServiceEndpointResult == false)
            return false;
        GetServiceEndpointResult other = (GetServiceEndpointResult) obj;
        if (other.getServiceType() == null ^ this.getServiceType() == null)
            return false;
        if (other.getServiceType() != null && other.getServiceType().equals(this.getServiceType()) == false)
            return false;
        if (other.getServiceEndpoint() == null ^ this.getServiceEndpoint() == null)
            return false;
        if (other.getServiceEndpoint() != null && other.getServiceEndpoint().equals(this.getServiceEndpoint()) == false)
            return false;
        if (other.getServerTrust() == null ^ this.getServerTrust() == null)
            return false;
        if (other.getServerTrust() != null && other.getServerTrust().equals(this.getServerTrust()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceType() == null) ? 0 : getServiceType().hashCode());
        hashCode = prime * hashCode + ((getServiceEndpoint() == null) ? 0 : getServiceEndpoint().hashCode());
        hashCode = prime * hashCode + ((getServerTrust() == null) ? 0 : getServerTrust().hashCode());
        return hashCode;
    }

    @Override
    public GetServiceEndpointResult clone() {
        try {
            return (GetServiceEndpointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
