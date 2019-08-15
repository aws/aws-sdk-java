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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ModifyVpnConnectionRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyVpnConnectionRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ModifyVpnConnectionRequest> {

    /**
     * <p>
     * The ID of the VPN connection.
     * </p>
     */
    private String vpnConnectionId;
    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     */
    private String transitGatewayId;
    /**
     * <p>
     * The ID of the customer gateway at your end of the VPN connection.
     * </p>
     */
    private String customerGatewayId;
    /**
     * <p>
     * The ID of the virtual private gateway at the AWS side of the VPN connection.
     * </p>
     */
    private String vpnGatewayId;

    /**
     * <p>
     * The ID of the VPN connection.
     * </p>
     * 
     * @param vpnConnectionId
     *        The ID of the VPN connection.
     */

    public void setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
    }

    /**
     * <p>
     * The ID of the VPN connection.
     * </p>
     * 
     * @return The ID of the VPN connection.
     */

    public String getVpnConnectionId() {
        return this.vpnConnectionId;
    }

    /**
     * <p>
     * The ID of the VPN connection.
     * </p>
     * 
     * @param vpnConnectionId
     *        The ID of the VPN connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpnConnectionRequest withVpnConnectionId(String vpnConnectionId) {
        setVpnConnectionId(vpnConnectionId);
        return this;
    }

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     * 
     * @param transitGatewayId
     *        The ID of the transit gateway.
     */

    public void setTransitGatewayId(String transitGatewayId) {
        this.transitGatewayId = transitGatewayId;
    }

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     * 
     * @return The ID of the transit gateway.
     */

    public String getTransitGatewayId() {
        return this.transitGatewayId;
    }

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     * 
     * @param transitGatewayId
     *        The ID of the transit gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpnConnectionRequest withTransitGatewayId(String transitGatewayId) {
        setTransitGatewayId(transitGatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of the customer gateway at your end of the VPN connection.
     * </p>
     * 
     * @param customerGatewayId
     *        The ID of the customer gateway at your end of the VPN connection.
     */

    public void setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
    }

    /**
     * <p>
     * The ID of the customer gateway at your end of the VPN connection.
     * </p>
     * 
     * @return The ID of the customer gateway at your end of the VPN connection.
     */

    public String getCustomerGatewayId() {
        return this.customerGatewayId;
    }

    /**
     * <p>
     * The ID of the customer gateway at your end of the VPN connection.
     * </p>
     * 
     * @param customerGatewayId
     *        The ID of the customer gateway at your end of the VPN connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpnConnectionRequest withCustomerGatewayId(String customerGatewayId) {
        setCustomerGatewayId(customerGatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of the virtual private gateway at the AWS side of the VPN connection.
     * </p>
     * 
     * @param vpnGatewayId
     *        The ID of the virtual private gateway at the AWS side of the VPN connection.
     */

    public void setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway at the AWS side of the VPN connection.
     * </p>
     * 
     * @return The ID of the virtual private gateway at the AWS side of the VPN connection.
     */

    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway at the AWS side of the VPN connection.
     * </p>
     * 
     * @param vpnGatewayId
     *        The ID of the virtual private gateway at the AWS side of the VPN connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpnConnectionRequest withVpnGatewayId(String vpnGatewayId) {
        setVpnGatewayId(vpnGatewayId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyVpnConnectionRequest> getDryRunRequest() {
        Request<ModifyVpnConnectionRequest> request = new ModifyVpnConnectionRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getVpnConnectionId() != null)
            sb.append("VpnConnectionId: ").append(getVpnConnectionId()).append(",");
        if (getTransitGatewayId() != null)
            sb.append("TransitGatewayId: ").append(getTransitGatewayId()).append(",");
        if (getCustomerGatewayId() != null)
            sb.append("CustomerGatewayId: ").append(getCustomerGatewayId()).append(",");
        if (getVpnGatewayId() != null)
            sb.append("VpnGatewayId: ").append(getVpnGatewayId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyVpnConnectionRequest == false)
            return false;
        ModifyVpnConnectionRequest other = (ModifyVpnConnectionRequest) obj;
        if (other.getVpnConnectionId() == null ^ this.getVpnConnectionId() == null)
            return false;
        if (other.getVpnConnectionId() != null && other.getVpnConnectionId().equals(this.getVpnConnectionId()) == false)
            return false;
        if (other.getTransitGatewayId() == null ^ this.getTransitGatewayId() == null)
            return false;
        if (other.getTransitGatewayId() != null && other.getTransitGatewayId().equals(this.getTransitGatewayId()) == false)
            return false;
        if (other.getCustomerGatewayId() == null ^ this.getCustomerGatewayId() == null)
            return false;
        if (other.getCustomerGatewayId() != null && other.getCustomerGatewayId().equals(this.getCustomerGatewayId()) == false)
            return false;
        if (other.getVpnGatewayId() == null ^ this.getVpnGatewayId() == null)
            return false;
        if (other.getVpnGatewayId() != null && other.getVpnGatewayId().equals(this.getVpnGatewayId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpnConnectionId() == null) ? 0 : getVpnConnectionId().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayId() == null) ? 0 : getTransitGatewayId().hashCode());
        hashCode = prime * hashCode + ((getCustomerGatewayId() == null) ? 0 : getCustomerGatewayId().hashCode());
        hashCode = prime * hashCode + ((getVpnGatewayId() == null) ? 0 : getVpnGatewayId().hashCode());
        return hashCode;
    }

    @Override
    public ModifyVpnConnectionRequest clone() {
        return (ModifyVpnConnectionRequest) super.clone();
    }
}
