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
import com.amazonaws.services.ec2.model.transform.AuthorizeClientVpnIngressRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthorizeClientVpnIngressRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<AuthorizeClientVpnIngressRequest> {

    /**
     * <p>
     * The ID of the Client VPN endpoint.
     * </p>
     */
    private String clientVpnEndpointId;
    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the network for which access is being authorized.
     * </p>
     */
    private String targetNetworkCidr;
    /**
     * <p>
     * The ID of the Active Directory group to grant access.
     * </p>
     */
    private String accessGroupId;
    /**
     * <p>
     * Indicates whether to grant access to all clients. Use <code>true</code> to grant all clients who successfully
     * establish a VPN connection access to the network.
     * </p>
     */
    private Boolean authorizeAllGroups;
    /**
     * <p>
     * A brief description of the authorization rule.
     * </p>
     */
    private String description;

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

    public AuthorizeClientVpnIngressRequest withClientVpnEndpointId(String clientVpnEndpointId) {
        setClientVpnEndpointId(clientVpnEndpointId);
        return this;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the network for which access is being authorized.
     * </p>
     * 
     * @param targetNetworkCidr
     *        The IPv4 address range, in CIDR notation, of the network for which access is being authorized.
     */

    public void setTargetNetworkCidr(String targetNetworkCidr) {
        this.targetNetworkCidr = targetNetworkCidr;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the network for which access is being authorized.
     * </p>
     * 
     * @return The IPv4 address range, in CIDR notation, of the network for which access is being authorized.
     */

    public String getTargetNetworkCidr() {
        return this.targetNetworkCidr;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the network for which access is being authorized.
     * </p>
     * 
     * @param targetNetworkCidr
     *        The IPv4 address range, in CIDR notation, of the network for which access is being authorized.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeClientVpnIngressRequest withTargetNetworkCidr(String targetNetworkCidr) {
        setTargetNetworkCidr(targetNetworkCidr);
        return this;
    }

    /**
     * <p>
     * The ID of the Active Directory group to grant access.
     * </p>
     * 
     * @param accessGroupId
     *        The ID of the Active Directory group to grant access.
     */

    public void setAccessGroupId(String accessGroupId) {
        this.accessGroupId = accessGroupId;
    }

    /**
     * <p>
     * The ID of the Active Directory group to grant access.
     * </p>
     * 
     * @return The ID of the Active Directory group to grant access.
     */

    public String getAccessGroupId() {
        return this.accessGroupId;
    }

    /**
     * <p>
     * The ID of the Active Directory group to grant access.
     * </p>
     * 
     * @param accessGroupId
     *        The ID of the Active Directory group to grant access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeClientVpnIngressRequest withAccessGroupId(String accessGroupId) {
        setAccessGroupId(accessGroupId);
        return this;
    }

    /**
     * <p>
     * Indicates whether to grant access to all clients. Use <code>true</code> to grant all clients who successfully
     * establish a VPN connection access to the network.
     * </p>
     * 
     * @param authorizeAllGroups
     *        Indicates whether to grant access to all clients. Use <code>true</code> to grant all clients who
     *        successfully establish a VPN connection access to the network.
     */

    public void setAuthorizeAllGroups(Boolean authorizeAllGroups) {
        this.authorizeAllGroups = authorizeAllGroups;
    }

    /**
     * <p>
     * Indicates whether to grant access to all clients. Use <code>true</code> to grant all clients who successfully
     * establish a VPN connection access to the network.
     * </p>
     * 
     * @return Indicates whether to grant access to all clients. Use <code>true</code> to grant all clients who
     *         successfully establish a VPN connection access to the network.
     */

    public Boolean getAuthorizeAllGroups() {
        return this.authorizeAllGroups;
    }

    /**
     * <p>
     * Indicates whether to grant access to all clients. Use <code>true</code> to grant all clients who successfully
     * establish a VPN connection access to the network.
     * </p>
     * 
     * @param authorizeAllGroups
     *        Indicates whether to grant access to all clients. Use <code>true</code> to grant all clients who
     *        successfully establish a VPN connection access to the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeClientVpnIngressRequest withAuthorizeAllGroups(Boolean authorizeAllGroups) {
        setAuthorizeAllGroups(authorizeAllGroups);
        return this;
    }

    /**
     * <p>
     * Indicates whether to grant access to all clients. Use <code>true</code> to grant all clients who successfully
     * establish a VPN connection access to the network.
     * </p>
     * 
     * @return Indicates whether to grant access to all clients. Use <code>true</code> to grant all clients who
     *         successfully establish a VPN connection access to the network.
     */

    public Boolean isAuthorizeAllGroups() {
        return this.authorizeAllGroups;
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

    public AuthorizeClientVpnIngressRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<AuthorizeClientVpnIngressRequest> getDryRunRequest() {
        Request<AuthorizeClientVpnIngressRequest> request = new AuthorizeClientVpnIngressRequestMarshaller().marshall(this);
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
        if (getClientVpnEndpointId() != null)
            sb.append("ClientVpnEndpointId: ").append(getClientVpnEndpointId()).append(",");
        if (getTargetNetworkCidr() != null)
            sb.append("TargetNetworkCidr: ").append(getTargetNetworkCidr()).append(",");
        if (getAccessGroupId() != null)
            sb.append("AccessGroupId: ").append(getAccessGroupId()).append(",");
        if (getAuthorizeAllGroups() != null)
            sb.append("AuthorizeAllGroups: ").append(getAuthorizeAllGroups()).append(",");
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

        if (obj instanceof AuthorizeClientVpnIngressRequest == false)
            return false;
        AuthorizeClientVpnIngressRequest other = (AuthorizeClientVpnIngressRequest) obj;
        if (other.getClientVpnEndpointId() == null ^ this.getClientVpnEndpointId() == null)
            return false;
        if (other.getClientVpnEndpointId() != null && other.getClientVpnEndpointId().equals(this.getClientVpnEndpointId()) == false)
            return false;
        if (other.getTargetNetworkCidr() == null ^ this.getTargetNetworkCidr() == null)
            return false;
        if (other.getTargetNetworkCidr() != null && other.getTargetNetworkCidr().equals(this.getTargetNetworkCidr()) == false)
            return false;
        if (other.getAccessGroupId() == null ^ this.getAccessGroupId() == null)
            return false;
        if (other.getAccessGroupId() != null && other.getAccessGroupId().equals(this.getAccessGroupId()) == false)
            return false;
        if (other.getAuthorizeAllGroups() == null ^ this.getAuthorizeAllGroups() == null)
            return false;
        if (other.getAuthorizeAllGroups() != null && other.getAuthorizeAllGroups().equals(this.getAuthorizeAllGroups()) == false)
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
        hashCode = prime * hashCode + ((getTargetNetworkCidr() == null) ? 0 : getTargetNetworkCidr().hashCode());
        hashCode = prime * hashCode + ((getAccessGroupId() == null) ? 0 : getAccessGroupId().hashCode());
        hashCode = prime * hashCode + ((getAuthorizeAllGroups() == null) ? 0 : getAuthorizeAllGroups().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public AuthorizeClientVpnIngressRequest clone() {
        return (AuthorizeClientVpnIngressRequest) super.clone();
    }
}
