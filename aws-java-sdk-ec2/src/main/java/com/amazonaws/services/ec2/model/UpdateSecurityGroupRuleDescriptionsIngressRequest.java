/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.UpdateSecurityGroupRuleDescriptionsIngressRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSecurityGroupRuleDescriptionsIngressRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<UpdateSecurityGroupRuleDescriptionsIngressRequest> {

    /**
     * <p>
     * The ID of the security group. You must specify either the security group ID or the security group name in the
     * request. For security groups in a nondefault VPC, you must specify the security group ID.
     * </p>
     */
    private String groupId;
    /**
     * <p>
     * [EC2-Classic, default VPC] The name of the security group. You must specify either the security group ID or the
     * security group name in the request.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The IP permissions for the security group rule. You must specify either IP permissions or a description.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<IpPermission> ipPermissions;
    /**
     * <p>
     * [VPC only] The description for the ingress security group rules. You must specify either a description or IP
     * permissions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SecurityGroupRuleDescription> securityGroupRuleDescriptions;

    /**
     * <p>
     * The ID of the security group. You must specify either the security group ID or the security group name in the
     * request. For security groups in a nondefault VPC, you must specify the security group ID.
     * </p>
     * 
     * @param groupId
     *        The ID of the security group. You must specify either the security group ID or the security group name in
     *        the request. For security groups in a nondefault VPC, you must specify the security group ID.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The ID of the security group. You must specify either the security group ID or the security group name in the
     * request. For security groups in a nondefault VPC, you must specify the security group ID.
     * </p>
     * 
     * @return The ID of the security group. You must specify either the security group ID or the security group name in
     *         the request. For security groups in a nondefault VPC, you must specify the security group ID.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * <p>
     * The ID of the security group. You must specify either the security group ID or the security group name in the
     * request. For security groups in a nondefault VPC, you must specify the security group ID.
     * </p>
     * 
     * @param groupId
     *        The ID of the security group. You must specify either the security group ID or the security group name in
     *        the request. For security groups in a nondefault VPC, you must specify the security group ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityGroupRuleDescriptionsIngressRequest withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * <p>
     * [EC2-Classic, default VPC] The name of the security group. You must specify either the security group ID or the
     * security group name in the request.
     * </p>
     * 
     * @param groupName
     *        [EC2-Classic, default VPC] The name of the security group. You must specify either the security group ID
     *        or the security group name in the request.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * [EC2-Classic, default VPC] The name of the security group. You must specify either the security group ID or the
     * security group name in the request.
     * </p>
     * 
     * @return [EC2-Classic, default VPC] The name of the security group. You must specify either the security group ID
     *         or the security group name in the request.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * [EC2-Classic, default VPC] The name of the security group. You must specify either the security group ID or the
     * security group name in the request.
     * </p>
     * 
     * @param groupName
     *        [EC2-Classic, default VPC] The name of the security group. You must specify either the security group ID
     *        or the security group name in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityGroupRuleDescriptionsIngressRequest withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The IP permissions for the security group rule. You must specify either IP permissions or a description.
     * </p>
     * 
     * @return The IP permissions for the security group rule. You must specify either IP permissions or a description.
     */

    public java.util.List<IpPermission> getIpPermissions() {
        if (ipPermissions == null) {
            ipPermissions = new com.amazonaws.internal.SdkInternalList<IpPermission>();
        }
        return ipPermissions;
    }

    /**
     * <p>
     * The IP permissions for the security group rule. You must specify either IP permissions or a description.
     * </p>
     * 
     * @param ipPermissions
     *        The IP permissions for the security group rule. You must specify either IP permissions or a description.
     */

    public void setIpPermissions(java.util.Collection<IpPermission> ipPermissions) {
        if (ipPermissions == null) {
            this.ipPermissions = null;
            return;
        }

        this.ipPermissions = new com.amazonaws.internal.SdkInternalList<IpPermission>(ipPermissions);
    }

    /**
     * <p>
     * The IP permissions for the security group rule. You must specify either IP permissions or a description.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpPermissions(java.util.Collection)} or {@link #withIpPermissions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param ipPermissions
     *        The IP permissions for the security group rule. You must specify either IP permissions or a description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityGroupRuleDescriptionsIngressRequest withIpPermissions(IpPermission... ipPermissions) {
        if (this.ipPermissions == null) {
            setIpPermissions(new com.amazonaws.internal.SdkInternalList<IpPermission>(ipPermissions.length));
        }
        for (IpPermission ele : ipPermissions) {
            this.ipPermissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IP permissions for the security group rule. You must specify either IP permissions or a description.
     * </p>
     * 
     * @param ipPermissions
     *        The IP permissions for the security group rule. You must specify either IP permissions or a description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityGroupRuleDescriptionsIngressRequest withIpPermissions(java.util.Collection<IpPermission> ipPermissions) {
        setIpPermissions(ipPermissions);
        return this;
    }

    /**
     * <p>
     * [VPC only] The description for the ingress security group rules. You must specify either a description or IP
     * permissions.
     * </p>
     * 
     * @return [VPC only] The description for the ingress security group rules. You must specify either a description or
     *         IP permissions.
     */

    public java.util.List<SecurityGroupRuleDescription> getSecurityGroupRuleDescriptions() {
        if (securityGroupRuleDescriptions == null) {
            securityGroupRuleDescriptions = new com.amazonaws.internal.SdkInternalList<SecurityGroupRuleDescription>();
        }
        return securityGroupRuleDescriptions;
    }

    /**
     * <p>
     * [VPC only] The description for the ingress security group rules. You must specify either a description or IP
     * permissions.
     * </p>
     * 
     * @param securityGroupRuleDescriptions
     *        [VPC only] The description for the ingress security group rules. You must specify either a description or
     *        IP permissions.
     */

    public void setSecurityGroupRuleDescriptions(java.util.Collection<SecurityGroupRuleDescription> securityGroupRuleDescriptions) {
        if (securityGroupRuleDescriptions == null) {
            this.securityGroupRuleDescriptions = null;
            return;
        }

        this.securityGroupRuleDescriptions = new com.amazonaws.internal.SdkInternalList<SecurityGroupRuleDescription>(securityGroupRuleDescriptions);
    }

    /**
     * <p>
     * [VPC only] The description for the ingress security group rules. You must specify either a description or IP
     * permissions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupRuleDescriptions(java.util.Collection)} or
     * {@link #withSecurityGroupRuleDescriptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param securityGroupRuleDescriptions
     *        [VPC only] The description for the ingress security group rules. You must specify either a description or
     *        IP permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityGroupRuleDescriptionsIngressRequest withSecurityGroupRuleDescriptions(SecurityGroupRuleDescription... securityGroupRuleDescriptions) {
        if (this.securityGroupRuleDescriptions == null) {
            setSecurityGroupRuleDescriptions(new com.amazonaws.internal.SdkInternalList<SecurityGroupRuleDescription>(securityGroupRuleDescriptions.length));
        }
        for (SecurityGroupRuleDescription ele : securityGroupRuleDescriptions) {
            this.securityGroupRuleDescriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * [VPC only] The description for the ingress security group rules. You must specify either a description or IP
     * permissions.
     * </p>
     * 
     * @param securityGroupRuleDescriptions
     *        [VPC only] The description for the ingress security group rules. You must specify either a description or
     *        IP permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityGroupRuleDescriptionsIngressRequest withSecurityGroupRuleDescriptions(
            java.util.Collection<SecurityGroupRuleDescription> securityGroupRuleDescriptions) {
        setSecurityGroupRuleDescriptions(securityGroupRuleDescriptions);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<UpdateSecurityGroupRuleDescriptionsIngressRequest> getDryRunRequest() {
        Request<UpdateSecurityGroupRuleDescriptionsIngressRequest> request = new UpdateSecurityGroupRuleDescriptionsIngressRequestMarshaller().marshall(this);
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
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId()).append(",");
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getIpPermissions() != null)
            sb.append("IpPermissions: ").append(getIpPermissions()).append(",");
        if (getSecurityGroupRuleDescriptions() != null)
            sb.append("SecurityGroupRuleDescriptions: ").append(getSecurityGroupRuleDescriptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSecurityGroupRuleDescriptionsIngressRequest == false)
            return false;
        UpdateSecurityGroupRuleDescriptionsIngressRequest other = (UpdateSecurityGroupRuleDescriptionsIngressRequest) obj;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getIpPermissions() == null ^ this.getIpPermissions() == null)
            return false;
        if (other.getIpPermissions() != null && other.getIpPermissions().equals(this.getIpPermissions()) == false)
            return false;
        if (other.getSecurityGroupRuleDescriptions() == null ^ this.getSecurityGroupRuleDescriptions() == null)
            return false;
        if (other.getSecurityGroupRuleDescriptions() != null
                && other.getSecurityGroupRuleDescriptions().equals(this.getSecurityGroupRuleDescriptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getIpPermissions() == null) ? 0 : getIpPermissions().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupRuleDescriptions() == null) ? 0 : getSecurityGroupRuleDescriptions().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSecurityGroupRuleDescriptionsIngressRequest clone() {
        return (UpdateSecurityGroupRuleDescriptionsIngressRequest) super.clone();
    }
}
