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

/**
 * <p>
 * Information about a Client VPN endpoint route.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ClientVpnRoute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClientVpnRoute implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Client VPN endpoint with which the route is associated.
     * </p>
     */
    private String clientVpnEndpointId;
    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the route destination.
     * </p>
     */
    private String destinationCidr;
    /**
     * <p>
     * The ID of the subnet through which traffic is routed.
     * </p>
     */
    private String targetSubnet;
    /**
     * <p>
     * The route type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Indicates how the route was associated with the Client VPN endpoint. <code>associate</code> indicates that the
     * route was automatically added when the target network was associated with the Client VPN endpoint.
     * <code>add-route</code> indicates that the route was manually added using the <b>CreateClientVpnRoute</b> action.
     * </p>
     */
    private String origin;
    /**
     * <p>
     * The current state of the route.
     * </p>
     */
    private ClientVpnRouteStatus status;
    /**
     * <p>
     * A brief description of the route.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The ID of the Client VPN endpoint with which the route is associated.
     * </p>
     * 
     * @param clientVpnEndpointId
     *        The ID of the Client VPN endpoint with which the route is associated.
     */

    public void setClientVpnEndpointId(String clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint with which the route is associated.
     * </p>
     * 
     * @return The ID of the Client VPN endpoint with which the route is associated.
     */

    public String getClientVpnEndpointId() {
        return this.clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint with which the route is associated.
     * </p>
     * 
     * @param clientVpnEndpointId
     *        The ID of the Client VPN endpoint with which the route is associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientVpnRoute withClientVpnEndpointId(String clientVpnEndpointId) {
        setClientVpnEndpointId(clientVpnEndpointId);
        return this;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the route destination.
     * </p>
     * 
     * @param destinationCidr
     *        The IPv4 address range, in CIDR notation, of the route destination.
     */

    public void setDestinationCidr(String destinationCidr) {
        this.destinationCidr = destinationCidr;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the route destination.
     * </p>
     * 
     * @return The IPv4 address range, in CIDR notation, of the route destination.
     */

    public String getDestinationCidr() {
        return this.destinationCidr;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the route destination.
     * </p>
     * 
     * @param destinationCidr
     *        The IPv4 address range, in CIDR notation, of the route destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientVpnRoute withDestinationCidr(String destinationCidr) {
        setDestinationCidr(destinationCidr);
        return this;
    }

    /**
     * <p>
     * The ID of the subnet through which traffic is routed.
     * </p>
     * 
     * @param targetSubnet
     *        The ID of the subnet through which traffic is routed.
     */

    public void setTargetSubnet(String targetSubnet) {
        this.targetSubnet = targetSubnet;
    }

    /**
     * <p>
     * The ID of the subnet through which traffic is routed.
     * </p>
     * 
     * @return The ID of the subnet through which traffic is routed.
     */

    public String getTargetSubnet() {
        return this.targetSubnet;
    }

    /**
     * <p>
     * The ID of the subnet through which traffic is routed.
     * </p>
     * 
     * @param targetSubnet
     *        The ID of the subnet through which traffic is routed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientVpnRoute withTargetSubnet(String targetSubnet) {
        setTargetSubnet(targetSubnet);
        return this;
    }

    /**
     * <p>
     * The route type.
     * </p>
     * 
     * @param type
     *        The route type.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The route type.
     * </p>
     * 
     * @return The route type.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The route type.
     * </p>
     * 
     * @param type
     *        The route type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientVpnRoute withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Indicates how the route was associated with the Client VPN endpoint. <code>associate</code> indicates that the
     * route was automatically added when the target network was associated with the Client VPN endpoint.
     * <code>add-route</code> indicates that the route was manually added using the <b>CreateClientVpnRoute</b> action.
     * </p>
     * 
     * @param origin
     *        Indicates how the route was associated with the Client VPN endpoint. <code>associate</code> indicates that
     *        the route was automatically added when the target network was associated with the Client VPN endpoint.
     *        <code>add-route</code> indicates that the route was manually added using the <b>CreateClientVpnRoute</b>
     *        action.
     */

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * <p>
     * Indicates how the route was associated with the Client VPN endpoint. <code>associate</code> indicates that the
     * route was automatically added when the target network was associated with the Client VPN endpoint.
     * <code>add-route</code> indicates that the route was manually added using the <b>CreateClientVpnRoute</b> action.
     * </p>
     * 
     * @return Indicates how the route was associated with the Client VPN endpoint. <code>associate</code> indicates
     *         that the route was automatically added when the target network was associated with the Client VPN
     *         endpoint. <code>add-route</code> indicates that the route was manually added using the
     *         <b>CreateClientVpnRoute</b> action.
     */

    public String getOrigin() {
        return this.origin;
    }

    /**
     * <p>
     * Indicates how the route was associated with the Client VPN endpoint. <code>associate</code> indicates that the
     * route was automatically added when the target network was associated with the Client VPN endpoint.
     * <code>add-route</code> indicates that the route was manually added using the <b>CreateClientVpnRoute</b> action.
     * </p>
     * 
     * @param origin
     *        Indicates how the route was associated with the Client VPN endpoint. <code>associate</code> indicates that
     *        the route was automatically added when the target network was associated with the Client VPN endpoint.
     *        <code>add-route</code> indicates that the route was manually added using the <b>CreateClientVpnRoute</b>
     *        action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientVpnRoute withOrigin(String origin) {
        setOrigin(origin);
        return this;
    }

    /**
     * <p>
     * The current state of the route.
     * </p>
     * 
     * @param status
     *        The current state of the route.
     */

    public void setStatus(ClientVpnRouteStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the route.
     * </p>
     * 
     * @return The current state of the route.
     */

    public ClientVpnRouteStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current state of the route.
     * </p>
     * 
     * @param status
     *        The current state of the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientVpnRoute withStatus(ClientVpnRouteStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A brief description of the route.
     * </p>
     * 
     * @param description
     *        A brief description of the route.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A brief description of the route.
     * </p>
     * 
     * @return A brief description of the route.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A brief description of the route.
     * </p>
     * 
     * @param description
     *        A brief description of the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientVpnRoute withDescription(String description) {
        setDescription(description);
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
        if (getDestinationCidr() != null)
            sb.append("DestinationCidr: ").append(getDestinationCidr()).append(",");
        if (getTargetSubnet() != null)
            sb.append("TargetSubnet: ").append(getTargetSubnet()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getOrigin() != null)
            sb.append("Origin: ").append(getOrigin()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClientVpnRoute == false)
            return false;
        ClientVpnRoute other = (ClientVpnRoute) obj;
        if (other.getClientVpnEndpointId() == null ^ this.getClientVpnEndpointId() == null)
            return false;
        if (other.getClientVpnEndpointId() != null && other.getClientVpnEndpointId().equals(this.getClientVpnEndpointId()) == false)
            return false;
        if (other.getDestinationCidr() == null ^ this.getDestinationCidr() == null)
            return false;
        if (other.getDestinationCidr() != null && other.getDestinationCidr().equals(this.getDestinationCidr()) == false)
            return false;
        if (other.getTargetSubnet() == null ^ this.getTargetSubnet() == null)
            return false;
        if (other.getTargetSubnet() != null && other.getTargetSubnet().equals(this.getTargetSubnet()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getOrigin() == null ^ this.getOrigin() == null)
            return false;
        if (other.getOrigin() != null && other.getOrigin().equals(this.getOrigin()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientVpnEndpointId() == null) ? 0 : getClientVpnEndpointId().hashCode());
        hashCode = prime * hashCode + ((getDestinationCidr() == null) ? 0 : getDestinationCidr().hashCode());
        hashCode = prime * hashCode + ((getTargetSubnet() == null) ? 0 : getTargetSubnet().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getOrigin() == null) ? 0 : getOrigin().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public ClientVpnRoute clone() {
        try {
            return (ClientVpnRoute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
