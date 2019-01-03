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
import com.amazonaws.services.ec2.model.transform.ApplySecurityGroupsToClientVpnTargetNetworkRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplySecurityGroupsToClientVpnTargetNetworkRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ApplySecurityGroupsToClientVpnTargetNetworkRequest> {

    /**
     * <p>
     * The ID of the Client VPN endpoint.
     * </p>
     */
    private String clientVpnEndpointId;
    /**
     * <p>
     * The ID of the VPC in which the associated target network is located.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The IDs of the security groups to apply to the associated target network. Up to 5 security groups can be applied
     * to an associated target network.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> securityGroupIds;

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

    public ApplySecurityGroupsToClientVpnTargetNetworkRequest withClientVpnEndpointId(String clientVpnEndpointId) {
        setClientVpnEndpointId(clientVpnEndpointId);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC in which the associated target network is located.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC in which the associated target network is located.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC in which the associated target network is located.
     * </p>
     * 
     * @return The ID of the VPC in which the associated target network is located.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC in which the associated target network is located.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC in which the associated target network is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplySecurityGroupsToClientVpnTargetNetworkRequest withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The IDs of the security groups to apply to the associated target network. Up to 5 security groups can be applied
     * to an associated target network.
     * </p>
     * 
     * @return The IDs of the security groups to apply to the associated target network. Up to 5 security groups can be
     *         applied to an associated target network.
     */

    public java.util.List<String> getSecurityGroupIds() {
        if (securityGroupIds == null) {
            securityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return securityGroupIds;
    }

    /**
     * <p>
     * The IDs of the security groups to apply to the associated target network. Up to 5 security groups can be applied
     * to an associated target network.
     * </p>
     * 
     * @param securityGroupIds
     *        The IDs of the security groups to apply to the associated target network. Up to 5 security groups can be
     *        applied to an associated target network.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new com.amazonaws.internal.SdkInternalList<String>(securityGroupIds);
    }

    /**
     * <p>
     * The IDs of the security groups to apply to the associated target network. Up to 5 security groups can be applied
     * to an associated target network.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The IDs of the security groups to apply to the associated target network. Up to 5 security groups can be
     *        applied to an associated target network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplySecurityGroupsToClientVpnTargetNetworkRequest withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new com.amazonaws.internal.SdkInternalList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the security groups to apply to the associated target network. Up to 5 security groups can be applied
     * to an associated target network.
     * </p>
     * 
     * @param securityGroupIds
     *        The IDs of the security groups to apply to the associated target network. Up to 5 security groups can be
     *        applied to an associated target network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplySecurityGroupsToClientVpnTargetNetworkRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ApplySecurityGroupsToClientVpnTargetNetworkRequest> getDryRunRequest() {
        Request<ApplySecurityGroupsToClientVpnTargetNetworkRequest> request = new ApplySecurityGroupsToClientVpnTargetNetworkRequestMarshaller().marshall(this);
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
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplySecurityGroupsToClientVpnTargetNetworkRequest == false)
            return false;
        ApplySecurityGroupsToClientVpnTargetNetworkRequest other = (ApplySecurityGroupsToClientVpnTargetNetworkRequest) obj;
        if (other.getClientVpnEndpointId() == null ^ this.getClientVpnEndpointId() == null)
            return false;
        if (other.getClientVpnEndpointId() != null && other.getClientVpnEndpointId().equals(this.getClientVpnEndpointId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientVpnEndpointId() == null) ? 0 : getClientVpnEndpointId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        return hashCode;
    }

    @Override
    public ApplySecurityGroupsToClientVpnTargetNetworkRequest clone() {
        return (ApplySecurityGroupsToClientVpnTargetNetworkRequest) super.clone();
    }
}
