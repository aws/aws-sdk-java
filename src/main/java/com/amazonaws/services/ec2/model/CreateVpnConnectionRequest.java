/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateVpnConnectionRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createVpnConnection(CreateVpnConnectionRequest) CreateVpnConnection operation}.
 * <p>
 * Creates a new VPN connection between an existing VPN gateway and customer gateway. The only supported connection type is ipsec.1.
 * </p>
 * <p>
 * The response includes information that you need to configure your customer gateway, in XML format. We recommend you use the command line version of
 * this operation ( <code>ec2-create-vpn-connection</code> ), which takes an <code>-f</code> option (for format) and returns configuration information
 * formatted as expected by the vendor you specified, or in a generic, human readable format. For information about the command, go to
 * <code>ec2-create-vpn-connection</code> in the Amazon Virtual Private Cloud Command Line Reference.
 * </p>
 * <p>
 * <b>IMPORTANT:</b> We strongly recommend you use HTTPS when calling this operation because the response contains sensitive cryptographic information
 * for configuring your customer gateway. If you decide to shut down your VPN connection for any reason and then create a new one, you must re-configure
 * your customer gateway with the new information returned from this call.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createVpnConnection(CreateVpnConnectionRequest)
 */
public class CreateVpnConnectionRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<CreateVpnConnectionRequest> {

    /**
     * The type of VPN connection.
     */
    private String type;

    /**
     * The ID of the customer gateway.
     */
    private String customerGatewayId;

    /**
     * The ID of the VPN gateway.
     */
    private String vpnGatewayId;

    private VpnConnectionOptionsSpecification options;

    /**
     * Default constructor for a new CreateVpnConnectionRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateVpnConnectionRequest() {}
    
    /**
     * Constructs a new CreateVpnConnectionRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param type The type of VPN connection.
     * @param customerGatewayId The ID of the customer gateway.
     * @param vpnGatewayId The ID of the VPN gateway.
     */
    public CreateVpnConnectionRequest(String type, String customerGatewayId, String vpnGatewayId) {
        setType(type);
        setCustomerGatewayId(customerGatewayId);
        setVpnGatewayId(vpnGatewayId);
    }

    /**
     * The type of VPN connection.
     *
     * @return The type of VPN connection.
     */
    public String getType() {
        return type;
    }
    
    /**
     * The type of VPN connection.
     *
     * @param type The type of VPN connection.
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * The type of VPN connection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param type The type of VPN connection.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateVpnConnectionRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * The ID of the customer gateway.
     *
     * @return The ID of the customer gateway.
     */
    public String getCustomerGatewayId() {
        return customerGatewayId;
    }
    
    /**
     * The ID of the customer gateway.
     *
     * @param customerGatewayId The ID of the customer gateway.
     */
    public void setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
    }
    
    /**
     * The ID of the customer gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customerGatewayId The ID of the customer gateway.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateVpnConnectionRequest withCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
        return this;
    }

    /**
     * The ID of the VPN gateway.
     *
     * @return The ID of the VPN gateway.
     */
    public String getVpnGatewayId() {
        return vpnGatewayId;
    }
    
    /**
     * The ID of the VPN gateway.
     *
     * @param vpnGatewayId The ID of the VPN gateway.
     */
    public void setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
    }
    
    /**
     * The ID of the VPN gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnGatewayId The ID of the VPN gateway.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateVpnConnectionRequest withVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }

    /**
     * Returns the value of the Options property for this object.
     *
     * @return The value of the Options property for this object.
     */
    public VpnConnectionOptionsSpecification getOptions() {
        return options;
    }
    
    /**
     * Sets the value of the Options property for this object.
     *
     * @param options The new value for the Options property for this object.
     */
    public void setOptions(VpnConnectionOptionsSpecification options) {
        this.options = options;
    }
    
    /**
     * Sets the value of the Options property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param options The new value for the Options property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateVpnConnectionRequest withOptions(VpnConnectionOptionsSpecification options) {
        this.options = options;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<CreateVpnConnectionRequest> getDryRunRequest() {
        Request<CreateVpnConnectionRequest> request = new CreateVpnConnectionRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getType() != null) sb.append("Type: " + getType() + ",");
        if (getCustomerGatewayId() != null) sb.append("CustomerGatewayId: " + getCustomerGatewayId() + ",");
        if (getVpnGatewayId() != null) sb.append("VpnGatewayId: " + getVpnGatewayId() + ",");
        if (getOptions() != null) sb.append("Options: " + getOptions() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode()); 
        hashCode = prime * hashCode + ((getCustomerGatewayId() == null) ? 0 : getCustomerGatewayId().hashCode()); 
        hashCode = prime * hashCode + ((getVpnGatewayId() == null) ? 0 : getVpnGatewayId().hashCode()); 
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateVpnConnectionRequest == false) return false;
        CreateVpnConnectionRequest other = (CreateVpnConnectionRequest)obj;
        
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false; 
        if (other.getCustomerGatewayId() == null ^ this.getCustomerGatewayId() == null) return false;
        if (other.getCustomerGatewayId() != null && other.getCustomerGatewayId().equals(this.getCustomerGatewayId()) == false) return false; 
        if (other.getVpnGatewayId() == null ^ this.getVpnGatewayId() == null) return false;
        if (other.getVpnGatewayId() != null && other.getVpnGatewayId().equals(this.getVpnGatewayId()) == false) return false; 
        if (other.getOptions() == null ^ this.getOptions() == null) return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false) return false; 
        return true;
    }
    
}
    