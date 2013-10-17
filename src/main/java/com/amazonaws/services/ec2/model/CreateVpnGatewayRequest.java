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
import com.amazonaws.services.ec2.model.transform.CreateVpnGatewayRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createVpnGateway(CreateVpnGatewayRequest) CreateVpnGateway operation}.
 * <p>
 * Creates a new VPN gateway. A VPN gateway is the VPC-side endpoint for your VPN connection. You can create a VPN gateway before creating the VPC
 * itself.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createVpnGateway(CreateVpnGatewayRequest)
 */
public class CreateVpnGatewayRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<CreateVpnGatewayRequest> {

    /**
     * The type of VPN connection this VPN gateway supports.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     */
    private String type;

    /**
     * The Availability Zone in which to create the VPN gateway.
     */
    private String availabilityZone;

    /**
     * Default constructor for a new CreateVpnGatewayRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateVpnGatewayRequest() {}
    
    /**
     * Constructs a new CreateVpnGatewayRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param type The type of VPN connection this VPN gateway supports.
     */
    public CreateVpnGatewayRequest(String type) {
        setType(type);
    }

    /**
     * Constructs a new CreateVpnGatewayRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param type The type of VPN connection this VPN gateway supports.
     */
    public CreateVpnGatewayRequest(GatewayType type) {
        this.type = type.toString();
    }

    /**
     * The type of VPN connection this VPN gateway supports.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @return The type of VPN connection this VPN gateway supports.
     *
     * @see GatewayType
     */
    public String getType() {
        return type;
    }
    
    /**
     * The type of VPN connection this VPN gateway supports.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @param type The type of VPN connection this VPN gateway supports.
     *
     * @see GatewayType
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * The type of VPN connection this VPN gateway supports.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @param type The type of VPN connection this VPN gateway supports.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see GatewayType
     */
    public CreateVpnGatewayRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * The type of VPN connection this VPN gateway supports.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @param type The type of VPN connection this VPN gateway supports.
     *
     * @see GatewayType
     */
    public void setType(GatewayType type) {
        this.type = type.toString();
    }
    
    /**
     * The type of VPN connection this VPN gateway supports.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @param type The type of VPN connection this VPN gateway supports.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see GatewayType
     */
    public CreateVpnGatewayRequest withType(GatewayType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * The Availability Zone in which to create the VPN gateway.
     *
     * @return The Availability Zone in which to create the VPN gateway.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The Availability Zone in which to create the VPN gateway.
     *
     * @param availabilityZone The Availability Zone in which to create the VPN gateway.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The Availability Zone in which to create the VPN gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The Availability Zone in which to create the VPN gateway.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateVpnGatewayRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<CreateVpnGatewayRequest> getDryRunRequest() {
        Request<CreateVpnGatewayRequest> request = new CreateVpnGatewayRequestMarshaller().marshall(this);
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
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateVpnGatewayRequest == false) return false;
        CreateVpnGatewayRequest other = (CreateVpnGatewayRequest)obj;
        
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        return true;
    }
    
}
    