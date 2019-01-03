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
import com.amazonaws.services.ec2.model.transform.RevokeClientVpnIngressRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RevokeClientVpnIngressRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<RevokeClientVpnIngressRequest> {

    /**
     * <p>
     * The ID of the Client VPN endpoint with which the authorization rule is associated.
     * </p>
     */
    private String clientVpnEndpointId;
    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the network for which access is being removed.
     * </p>
     */
    private String targetNetworkCidr;
    /**
     * <p>
     * The ID of the Active Directory group for which to revoke access.
     * </p>
     */
    private String accessGroupId;
    /**
     * <p>
     * Indicates whether access should be revoked for all clients.
     * </p>
     */
    private Boolean revokeAllGroups;

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

    public RevokeClientVpnIngressRequest withClientVpnEndpointId(String clientVpnEndpointId) {
        setClientVpnEndpointId(clientVpnEndpointId);
        return this;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the network for which access is being removed.
     * </p>
     * 
     * @param targetNetworkCidr
     *        The IPv4 address range, in CIDR notation, of the network for which access is being removed.
     */

    public void setTargetNetworkCidr(String targetNetworkCidr) {
        this.targetNetworkCidr = targetNetworkCidr;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the network for which access is being removed.
     * </p>
     * 
     * @return The IPv4 address range, in CIDR notation, of the network for which access is being removed.
     */

    public String getTargetNetworkCidr() {
        return this.targetNetworkCidr;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the network for which access is being removed.
     * </p>
     * 
     * @param targetNetworkCidr
     *        The IPv4 address range, in CIDR notation, of the network for which access is being removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeClientVpnIngressRequest withTargetNetworkCidr(String targetNetworkCidr) {
        setTargetNetworkCidr(targetNetworkCidr);
        return this;
    }

    /**
     * <p>
     * The ID of the Active Directory group for which to revoke access.
     * </p>
     * 
     * @param accessGroupId
     *        The ID of the Active Directory group for which to revoke access.
     */

    public void setAccessGroupId(String accessGroupId) {
        this.accessGroupId = accessGroupId;
    }

    /**
     * <p>
     * The ID of the Active Directory group for which to revoke access.
     * </p>
     * 
     * @return The ID of the Active Directory group for which to revoke access.
     */

    public String getAccessGroupId() {
        return this.accessGroupId;
    }

    /**
     * <p>
     * The ID of the Active Directory group for which to revoke access.
     * </p>
     * 
     * @param accessGroupId
     *        The ID of the Active Directory group for which to revoke access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeClientVpnIngressRequest withAccessGroupId(String accessGroupId) {
        setAccessGroupId(accessGroupId);
        return this;
    }

    /**
     * <p>
     * Indicates whether access should be revoked for all clients.
     * </p>
     * 
     * @param revokeAllGroups
     *        Indicates whether access should be revoked for all clients.
     */

    public void setRevokeAllGroups(Boolean revokeAllGroups) {
        this.revokeAllGroups = revokeAllGroups;
    }

    /**
     * <p>
     * Indicates whether access should be revoked for all clients.
     * </p>
     * 
     * @return Indicates whether access should be revoked for all clients.
     */

    public Boolean getRevokeAllGroups() {
        return this.revokeAllGroups;
    }

    /**
     * <p>
     * Indicates whether access should be revoked for all clients.
     * </p>
     * 
     * @param revokeAllGroups
     *        Indicates whether access should be revoked for all clients.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeClientVpnIngressRequest withRevokeAllGroups(Boolean revokeAllGroups) {
        setRevokeAllGroups(revokeAllGroups);
        return this;
    }

    /**
     * <p>
     * Indicates whether access should be revoked for all clients.
     * </p>
     * 
     * @return Indicates whether access should be revoked for all clients.
     */

    public Boolean isRevokeAllGroups() {
        return this.revokeAllGroups;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<RevokeClientVpnIngressRequest> getDryRunRequest() {
        Request<RevokeClientVpnIngressRequest> request = new RevokeClientVpnIngressRequestMarshaller().marshall(this);
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
        if (getRevokeAllGroups() != null)
            sb.append("RevokeAllGroups: ").append(getRevokeAllGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RevokeClientVpnIngressRequest == false)
            return false;
        RevokeClientVpnIngressRequest other = (RevokeClientVpnIngressRequest) obj;
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
        if (other.getRevokeAllGroups() == null ^ this.getRevokeAllGroups() == null)
            return false;
        if (other.getRevokeAllGroups() != null && other.getRevokeAllGroups().equals(this.getRevokeAllGroups()) == false)
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
        hashCode = prime * hashCode + ((getRevokeAllGroups() == null) ? 0 : getRevokeAllGroups().hashCode());
        return hashCode;
    }

    @Override
    public RevokeClientVpnIngressRequest clone() {
        return (RevokeClientVpnIngressRequest) super.clone();
    }
}
