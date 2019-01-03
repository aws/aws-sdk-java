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
import com.amazonaws.services.ec2.model.transform.CreateVpnConnectionRequestMarshaller;

/**
 * <p>
 * Contains the parameters for CreateVpnConnection.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVpnConnectionRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CreateVpnConnectionRequest> {

    /**
     * <p>
     * The ID of the customer gateway.
     * </p>
     */
    private String customerGatewayId;
    /**
     * <p>
     * The type of VPN connection (<code>ipsec.1</code>).
     * </p>
     */
    private String type;
    /**
     * <p>
     * The ID of the virtual private gateway. If you specify a virtual private gateway, you cannot specify a transit
     * gateway.
     * </p>
     */
    private String vpnGatewayId;
    /**
     * <p>
     * The ID of the transit gateway. If you specify a transit gateway, you cannot specify a virtual private gateway.
     * </p>
     */
    private String transitGatewayId;
    /**
     * <p>
     * The options for the VPN connection.
     * </p>
     */
    private VpnConnectionOptionsSpecification options;

    /**
     * Default constructor for CreateVpnConnectionRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public CreateVpnConnectionRequest() {
    }

    /**
     * Constructs a new CreateVpnConnectionRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param type
     *        The type of VPN connection (<code>ipsec.1</code>).
     * @param customerGatewayId
     *        The ID of the customer gateway.
     * @param vpnGatewayId
     *        The ID of the virtual private gateway. If you specify a virtual private gateway, you cannot specify a
     *        transit gateway.
     */
    public CreateVpnConnectionRequest(String type, String customerGatewayId, String vpnGatewayId) {
        setType(type);
        setCustomerGatewayId(customerGatewayId);
        setVpnGatewayId(vpnGatewayId);
    }

    /**
     * <p>
     * The ID of the customer gateway.
     * </p>
     * 
     * @param customerGatewayId
     *        The ID of the customer gateway.
     */

    public void setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
    }

    /**
     * <p>
     * The ID of the customer gateway.
     * </p>
     * 
     * @return The ID of the customer gateway.
     */

    public String getCustomerGatewayId() {
        return this.customerGatewayId;
    }

    /**
     * <p>
     * The ID of the customer gateway.
     * </p>
     * 
     * @param customerGatewayId
     *        The ID of the customer gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpnConnectionRequest withCustomerGatewayId(String customerGatewayId) {
        setCustomerGatewayId(customerGatewayId);
        return this;
    }

    /**
     * <p>
     * The type of VPN connection (<code>ipsec.1</code>).
     * </p>
     * 
     * @param type
     *        The type of VPN connection (<code>ipsec.1</code>).
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of VPN connection (<code>ipsec.1</code>).
     * </p>
     * 
     * @return The type of VPN connection (<code>ipsec.1</code>).
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of VPN connection (<code>ipsec.1</code>).
     * </p>
     * 
     * @param type
     *        The type of VPN connection (<code>ipsec.1</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpnConnectionRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The ID of the virtual private gateway. If you specify a virtual private gateway, you cannot specify a transit
     * gateway.
     * </p>
     * 
     * @param vpnGatewayId
     *        The ID of the virtual private gateway. If you specify a virtual private gateway, you cannot specify a
     *        transit gateway.
     */

    public void setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway. If you specify a virtual private gateway, you cannot specify a transit
     * gateway.
     * </p>
     * 
     * @return The ID of the virtual private gateway. If you specify a virtual private gateway, you cannot specify a
     *         transit gateway.
     */

    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway. If you specify a virtual private gateway, you cannot specify a transit
     * gateway.
     * </p>
     * 
     * @param vpnGatewayId
     *        The ID of the virtual private gateway. If you specify a virtual private gateway, you cannot specify a
     *        transit gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpnConnectionRequest withVpnGatewayId(String vpnGatewayId) {
        setVpnGatewayId(vpnGatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of the transit gateway. If you specify a transit gateway, you cannot specify a virtual private gateway.
     * </p>
     * 
     * @param transitGatewayId
     *        The ID of the transit gateway. If you specify a transit gateway, you cannot specify a virtual private
     *        gateway.
     */

    public void setTransitGatewayId(String transitGatewayId) {
        this.transitGatewayId = transitGatewayId;
    }

    /**
     * <p>
     * The ID of the transit gateway. If you specify a transit gateway, you cannot specify a virtual private gateway.
     * </p>
     * 
     * @return The ID of the transit gateway. If you specify a transit gateway, you cannot specify a virtual private
     *         gateway.
     */

    public String getTransitGatewayId() {
        return this.transitGatewayId;
    }

    /**
     * <p>
     * The ID of the transit gateway. If you specify a transit gateway, you cannot specify a virtual private gateway.
     * </p>
     * 
     * @param transitGatewayId
     *        The ID of the transit gateway. If you specify a transit gateway, you cannot specify a virtual private
     *        gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpnConnectionRequest withTransitGatewayId(String transitGatewayId) {
        setTransitGatewayId(transitGatewayId);
        return this;
    }

    /**
     * <p>
     * The options for the VPN connection.
     * </p>
     * 
     * @param options
     *        The options for the VPN connection.
     */

    public void setOptions(VpnConnectionOptionsSpecification options) {
        this.options = options;
    }

    /**
     * <p>
     * The options for the VPN connection.
     * </p>
     * 
     * @return The options for the VPN connection.
     */

    public VpnConnectionOptionsSpecification getOptions() {
        return this.options;
    }

    /**
     * <p>
     * The options for the VPN connection.
     * </p>
     * 
     * @param options
     *        The options for the VPN connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpnConnectionRequest withOptions(VpnConnectionOptionsSpecification options) {
        setOptions(options);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateVpnConnectionRequest> getDryRunRequest() {
        Request<CreateVpnConnectionRequest> request = new CreateVpnConnectionRequestMarshaller().marshall(this);
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
        if (getCustomerGatewayId() != null)
            sb.append("CustomerGatewayId: ").append(getCustomerGatewayId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getVpnGatewayId() != null)
            sb.append("VpnGatewayId: ").append(getVpnGatewayId()).append(",");
        if (getTransitGatewayId() != null)
            sb.append("TransitGatewayId: ").append(getTransitGatewayId()).append(",");
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVpnConnectionRequest == false)
            return false;
        CreateVpnConnectionRequest other = (CreateVpnConnectionRequest) obj;
        if (other.getCustomerGatewayId() == null ^ this.getCustomerGatewayId() == null)
            return false;
        if (other.getCustomerGatewayId() != null && other.getCustomerGatewayId().equals(this.getCustomerGatewayId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getVpnGatewayId() == null ^ this.getVpnGatewayId() == null)
            return false;
        if (other.getVpnGatewayId() != null && other.getVpnGatewayId().equals(this.getVpnGatewayId()) == false)
            return false;
        if (other.getTransitGatewayId() == null ^ this.getTransitGatewayId() == null)
            return false;
        if (other.getTransitGatewayId() != null && other.getTransitGatewayId().equals(this.getTransitGatewayId()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomerGatewayId() == null) ? 0 : getCustomerGatewayId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getVpnGatewayId() == null) ? 0 : getVpnGatewayId().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayId() == null) ? 0 : getTransitGatewayId().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        return hashCode;
    }

    @Override
    public CreateVpnConnectionRequest clone() {
        return (CreateVpnConnectionRequest) super.clone();
    }
}
