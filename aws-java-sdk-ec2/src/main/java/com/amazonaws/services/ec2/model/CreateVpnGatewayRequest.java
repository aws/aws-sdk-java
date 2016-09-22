/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateVpnGatewayRequestMarshaller;

/**
 * <p>
 * Contains the parameters for CreateVpnGateway.
 * </p>
 */
public class CreateVpnGatewayRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CreateVpnGatewayRequest> {

    /**
     * <p>
     * The type of VPN connection this virtual private gateway supports.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The Availability Zone for the virtual private gateway.
     * </p>
     */
    private String availabilityZone;

    /**
     * Default constructor for CreateVpnGatewayRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public CreateVpnGatewayRequest() {
    }

    /**
     * Constructs a new CreateVpnGatewayRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     * 
     * @param type
     *        The type of VPN connection this virtual private gateway supports.
     */
    public CreateVpnGatewayRequest(String type) {
        setType(type);
    }

    /**
     * Constructs a new CreateVpnGatewayRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     * 
     * @param type
     *        The type of VPN connection this virtual private gateway supports.
     */
    public CreateVpnGatewayRequest(GatewayType type) {
        setType(type.toString());
    }

    /**
     * <p>
     * The type of VPN connection this virtual private gateway supports.
     * </p>
     * 
     * @param type
     *        The type of VPN connection this virtual private gateway supports.
     * @see GatewayType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of VPN connection this virtual private gateway supports.
     * </p>
     * 
     * @return The type of VPN connection this virtual private gateway supports.
     * @see GatewayType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of VPN connection this virtual private gateway supports.
     * </p>
     * 
     * @param type
     *        The type of VPN connection this virtual private gateway supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GatewayType
     */

    public CreateVpnGatewayRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of VPN connection this virtual private gateway supports.
     * </p>
     * 
     * @param type
     *        The type of VPN connection this virtual private gateway supports.
     * @see GatewayType
     */

    public void setType(GatewayType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of VPN connection this virtual private gateway supports.
     * </p>
     * 
     * @param type
     *        The type of VPN connection this virtual private gateway supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GatewayType
     */

    public CreateVpnGatewayRequest withType(GatewayType type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The Availability Zone for the virtual private gateway.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone for the virtual private gateway.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone for the virtual private gateway.
     * </p>
     * 
     * @return The Availability Zone for the virtual private gateway.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone for the virtual private gateway.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone for the virtual private gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpnGatewayRequest withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateVpnGatewayRequest> getDryRunRequest() {
        Request<CreateVpnGatewayRequest> request = new CreateVpnGatewayRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVpnGatewayRequest == false)
            return false;
        CreateVpnGatewayRequest other = (CreateVpnGatewayRequest) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        return true;
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
    public CreateVpnGatewayRequest clone() {
        return (CreateVpnGatewayRequest) super.clone();
    }
}
