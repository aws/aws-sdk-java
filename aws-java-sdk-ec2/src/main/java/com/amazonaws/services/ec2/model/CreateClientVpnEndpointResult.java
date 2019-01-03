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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateClientVpnEndpointResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Client VPN endpoint.
     * </p>
     */
    private String clientVpnEndpointId;
    /**
     * <p>
     * The current state of the Client VPN endpoint.
     * </p>
     */
    private ClientVpnEndpointStatus status;
    /**
     * <p>
     * The DNS name to be used by clients when establishing their VPN session.
     * </p>
     */
    private String dnsName;

    /**
     * <p>
     * The ID of the Client VPN endpoint.
     * </p>
     * 
     * @param clientVpnEndpointId
     *        The ID of the Client VPN endpoint.
     */

    public void setClientVpnEndpointId(String clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint.
     * </p>
     * 
     * @return The ID of the Client VPN endpoint.
     */

    public String getClientVpnEndpointId() {
        return this.clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint.
     * </p>
     * 
     * @param clientVpnEndpointId
     *        The ID of the Client VPN endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClientVpnEndpointResult withClientVpnEndpointId(String clientVpnEndpointId) {
        setClientVpnEndpointId(clientVpnEndpointId);
        return this;
    }

    /**
     * <p>
     * The current state of the Client VPN endpoint.
     * </p>
     * 
     * @param status
     *        The current state of the Client VPN endpoint.
     */

    public void setStatus(ClientVpnEndpointStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the Client VPN endpoint.
     * </p>
     * 
     * @return The current state of the Client VPN endpoint.
     */

    public ClientVpnEndpointStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current state of the Client VPN endpoint.
     * </p>
     * 
     * @param status
     *        The current state of the Client VPN endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClientVpnEndpointResult withStatus(ClientVpnEndpointStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The DNS name to be used by clients when establishing their VPN session.
     * </p>
     * 
     * @param dnsName
     *        The DNS name to be used by clients when establishing their VPN session.
     */

    public void setDnsName(String dnsName) {
        this.dnsName = dnsName;
    }

    /**
     * <p>
     * The DNS name to be used by clients when establishing their VPN session.
     * </p>
     * 
     * @return The DNS name to be used by clients when establishing their VPN session.
     */

    public String getDnsName() {
        return this.dnsName;
    }

    /**
     * <p>
     * The DNS name to be used by clients when establishing their VPN session.
     * </p>
     * 
     * @param dnsName
     *        The DNS name to be used by clients when establishing their VPN session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClientVpnEndpointResult withDnsName(String dnsName) {
        setDnsName(dnsName);
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
        if (getClientVpnEndpointId() != null)
            sb.append("ClientVpnEndpointId: ").append(getClientVpnEndpointId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDnsName() != null)
            sb.append("DnsName: ").append(getDnsName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateClientVpnEndpointResult == false)
            return false;
        CreateClientVpnEndpointResult other = (CreateClientVpnEndpointResult) obj;
        if (other.getClientVpnEndpointId() == null ^ this.getClientVpnEndpointId() == null)
            return false;
        if (other.getClientVpnEndpointId() != null && other.getClientVpnEndpointId().equals(this.getClientVpnEndpointId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDnsName() == null ^ this.getDnsName() == null)
            return false;
        if (other.getDnsName() != null && other.getDnsName().equals(this.getDnsName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientVpnEndpointId() == null) ? 0 : getClientVpnEndpointId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDnsName() == null) ? 0 : getDnsName().hashCode());
        return hashCode;
    }

    @Override
    public CreateClientVpnEndpointResult clone() {
        try {
            return (CreateClientVpnEndpointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
