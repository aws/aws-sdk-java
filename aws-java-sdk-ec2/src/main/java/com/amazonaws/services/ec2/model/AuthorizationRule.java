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
 * Information about an authorization rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AuthorizationRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthorizationRule implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Client VPN endpoint with which the authorization rule is associated.
     * </p>
     */
    private String clientVpnEndpointId;
    /**
     * <p>
     * A brief description of the authorization rule.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of the Active Directory group to which the authorization rule grants access.
     * </p>
     */
    private String groupId;
    /**
     * <p>
     * Indicates whether the authorization rule grants access to all clients.
     * </p>
     */
    private Boolean accessAll;
    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the network to which the authorization rule applies.
     * </p>
     */
    private String destinationCidr;
    /**
     * <p>
     * The current state of the authorization rule.
     * </p>
     */
    private ClientVpnAuthorizationRuleStatus status;

    /**
     * <p>
     * The ID of the Client VPN endpoint with which the authorization rule is associated.
     * </p>
     * 
     * @param clientVpnEndpointId
     *        The ID of the Client VPN endpoint with which the authorization rule is associated.
     */

    public void setClientVpnEndpointId(String clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint with which the authorization rule is associated.
     * </p>
     * 
     * @return The ID of the Client VPN endpoint with which the authorization rule is associated.
     */

    public String getClientVpnEndpointId() {
        return this.clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint with which the authorization rule is associated.
     * </p>
     * 
     * @param clientVpnEndpointId
     *        The ID of the Client VPN endpoint with which the authorization rule is associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizationRule withClientVpnEndpointId(String clientVpnEndpointId) {
        setClientVpnEndpointId(clientVpnEndpointId);
        return this;
    }

    /**
     * <p>
     * A brief description of the authorization rule.
     * </p>
     * 
     * @param description
     *        A brief description of the authorization rule.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A brief description of the authorization rule.
     * </p>
     * 
     * @return A brief description of the authorization rule.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A brief description of the authorization rule.
     * </p>
     * 
     * @param description
     *        A brief description of the authorization rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizationRule withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of the Active Directory group to which the authorization rule grants access.
     * </p>
     * 
     * @param groupId
     *        The ID of the Active Directory group to which the authorization rule grants access.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The ID of the Active Directory group to which the authorization rule grants access.
     * </p>
     * 
     * @return The ID of the Active Directory group to which the authorization rule grants access.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * <p>
     * The ID of the Active Directory group to which the authorization rule grants access.
     * </p>
     * 
     * @param groupId
     *        The ID of the Active Directory group to which the authorization rule grants access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizationRule withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * <p>
     * Indicates whether the authorization rule grants access to all clients.
     * </p>
     * 
     * @param accessAll
     *        Indicates whether the authorization rule grants access to all clients.
     */

    public void setAccessAll(Boolean accessAll) {
        this.accessAll = accessAll;
    }

    /**
     * <p>
     * Indicates whether the authorization rule grants access to all clients.
     * </p>
     * 
     * @return Indicates whether the authorization rule grants access to all clients.
     */

    public Boolean getAccessAll() {
        return this.accessAll;
    }

    /**
     * <p>
     * Indicates whether the authorization rule grants access to all clients.
     * </p>
     * 
     * @param accessAll
     *        Indicates whether the authorization rule grants access to all clients.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizationRule withAccessAll(Boolean accessAll) {
        setAccessAll(accessAll);
        return this;
    }

    /**
     * <p>
     * Indicates whether the authorization rule grants access to all clients.
     * </p>
     * 
     * @return Indicates whether the authorization rule grants access to all clients.
     */

    public Boolean isAccessAll() {
        return this.accessAll;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the network to which the authorization rule applies.
     * </p>
     * 
     * @param destinationCidr
     *        The IPv4 address range, in CIDR notation, of the network to which the authorization rule applies.
     */

    public void setDestinationCidr(String destinationCidr) {
        this.destinationCidr = destinationCidr;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the network to which the authorization rule applies.
     * </p>
     * 
     * @return The IPv4 address range, in CIDR notation, of the network to which the authorization rule applies.
     */

    public String getDestinationCidr() {
        return this.destinationCidr;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the network to which the authorization rule applies.
     * </p>
     * 
     * @param destinationCidr
     *        The IPv4 address range, in CIDR notation, of the network to which the authorization rule applies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizationRule withDestinationCidr(String destinationCidr) {
        setDestinationCidr(destinationCidr);
        return this;
    }

    /**
     * <p>
     * The current state of the authorization rule.
     * </p>
     * 
     * @param status
     *        The current state of the authorization rule.
     */

    public void setStatus(ClientVpnAuthorizationRuleStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the authorization rule.
     * </p>
     * 
     * @return The current state of the authorization rule.
     */

    public ClientVpnAuthorizationRuleStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current state of the authorization rule.
     * </p>
     * 
     * @param status
     *        The current state of the authorization rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizationRule withStatus(ClientVpnAuthorizationRuleStatus status) {
        setStatus(status);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId()).append(",");
        if (getAccessAll() != null)
            sb.append("AccessAll: ").append(getAccessAll()).append(",");
        if (getDestinationCidr() != null)
            sb.append("DestinationCidr: ").append(getDestinationCidr()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthorizationRule == false)
            return false;
        AuthorizationRule other = (AuthorizationRule) obj;
        if (other.getClientVpnEndpointId() == null ^ this.getClientVpnEndpointId() == null)
            return false;
        if (other.getClientVpnEndpointId() != null && other.getClientVpnEndpointId().equals(this.getClientVpnEndpointId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getAccessAll() == null ^ this.getAccessAll() == null)
            return false;
        if (other.getAccessAll() != null && other.getAccessAll().equals(this.getAccessAll()) == false)
            return false;
        if (other.getDestinationCidr() == null ^ this.getDestinationCidr() == null)
            return false;
        if (other.getDestinationCidr() != null && other.getDestinationCidr().equals(this.getDestinationCidr()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientVpnEndpointId() == null) ? 0 : getClientVpnEndpointId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getAccessAll() == null) ? 0 : getAccessAll().hashCode());
        hashCode = prime * hashCode + ((getDestinationCidr() == null) ? 0 : getDestinationCidr().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public AuthorizationRule clone() {
        try {
            return (AuthorizationRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
