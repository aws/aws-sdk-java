/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.RevokeSecurityGroupEgressRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#revokeSecurityGroupEgress(RevokeSecurityGroupEgressRequest) RevokeSecurityGroupEgress operation}.
 * <p>
 * [EC2-VPC only] Removes one or more egress rules from a security group
 * for EC2-VPC. This action doesn't apply to security groups for use in
 * EC2-Classic. The values that you specify in the revoke request (for
 * example, ports) must match the existing rule's values for the rule to
 * be revoked.
 * </p>
 * <p>
 * Each rule consists of the protocol and the CIDR range or source
 * security group. For the TCP and UDP protocols, you must also specify
 * the destination port or range of ports. For the ICMP protocol, you
 * must also specify the ICMP type and code.
 * </p>
 * <p>
 * Rule changes are propagated to instances within the security group as
 * quickly as possible. However, a small delay might occur.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#revokeSecurityGroupEgress(RevokeSecurityGroupEgressRequest)
 */
public class RevokeSecurityGroupEgressRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<RevokeSecurityGroupEgressRequest> {

    /**
     * The ID of the security group.
     */
    private String groupId;

    /**
     * The name of a destination security group. To revoke outbound access to
     * a destination security group, we recommend that you use a set of IP
     * permissions instead.
     */
    private String sourceSecurityGroupName;

    /**
     * The AWS account number for a destination security group. To revoke
     * outbound access to a destination security group, we recommend that you
     * use a set of IP permissions instead.
     */
    private String sourceSecurityGroupOwnerId;

    /**
     * The IP protocol name or number. We recommend that you specify the
     * protocol in a set of IP permissions instead.
     */
    private String ipProtocol;

    /**
     * The start of port range for the TCP and UDP protocols, or an ICMP type
     * number. We recommend that you specify the port range in a set of IP
     * permissions instead.
     */
    private Integer fromPort;

    /**
     * The end of port range for the TCP and UDP protocols, or an ICMP type
     * number. We recommend that you specify the port range in a set of IP
     * permissions instead.
     */
    private Integer toPort;

    /**
     * The CIDR IP address range. We recommend that you specify the CIDR
     * range in a set of IP permissions instead.
     */
    private String cidrIp;

    /**
     * A set of IP permissions. You can't specify a destination security
     * group and a CIDR IP address range.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<IpPermission> ipPermissions;

    /**
     * The ID of the security group.
     *
     * @return The ID of the security group.
     */
    public String getGroupId() {
        return groupId;
    }
    
    /**
     * The ID of the security group.
     *
     * @param groupId The ID of the security group.
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
    
    /**
     * The ID of the security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupId The ID of the security group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RevokeSecurityGroupEgressRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * The name of a destination security group. To revoke outbound access to
     * a destination security group, we recommend that you use a set of IP
     * permissions instead.
     *
     * @return The name of a destination security group. To revoke outbound access to
     *         a destination security group, we recommend that you use a set of IP
     *         permissions instead.
     */
    public String getSourceSecurityGroupName() {
        return sourceSecurityGroupName;
    }
    
    /**
     * The name of a destination security group. To revoke outbound access to
     * a destination security group, we recommend that you use a set of IP
     * permissions instead.
     *
     * @param sourceSecurityGroupName The name of a destination security group. To revoke outbound access to
     *         a destination security group, we recommend that you use a set of IP
     *         permissions instead.
     */
    public void setSourceSecurityGroupName(String sourceSecurityGroupName) {
        this.sourceSecurityGroupName = sourceSecurityGroupName;
    }
    
    /**
     * The name of a destination security group. To revoke outbound access to
     * a destination security group, we recommend that you use a set of IP
     * permissions instead.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceSecurityGroupName The name of a destination security group. To revoke outbound access to
     *         a destination security group, we recommend that you use a set of IP
     *         permissions instead.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RevokeSecurityGroupEgressRequest withSourceSecurityGroupName(String sourceSecurityGroupName) {
        this.sourceSecurityGroupName = sourceSecurityGroupName;
        return this;
    }

    /**
     * The AWS account number for a destination security group. To revoke
     * outbound access to a destination security group, we recommend that you
     * use a set of IP permissions instead.
     *
     * @return The AWS account number for a destination security group. To revoke
     *         outbound access to a destination security group, we recommend that you
     *         use a set of IP permissions instead.
     */
    public String getSourceSecurityGroupOwnerId() {
        return sourceSecurityGroupOwnerId;
    }
    
    /**
     * The AWS account number for a destination security group. To revoke
     * outbound access to a destination security group, we recommend that you
     * use a set of IP permissions instead.
     *
     * @param sourceSecurityGroupOwnerId The AWS account number for a destination security group. To revoke
     *         outbound access to a destination security group, we recommend that you
     *         use a set of IP permissions instead.
     */
    public void setSourceSecurityGroupOwnerId(String sourceSecurityGroupOwnerId) {
        this.sourceSecurityGroupOwnerId = sourceSecurityGroupOwnerId;
    }
    
    /**
     * The AWS account number for a destination security group. To revoke
     * outbound access to a destination security group, we recommend that you
     * use a set of IP permissions instead.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceSecurityGroupOwnerId The AWS account number for a destination security group. To revoke
     *         outbound access to a destination security group, we recommend that you
     *         use a set of IP permissions instead.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RevokeSecurityGroupEgressRequest withSourceSecurityGroupOwnerId(String sourceSecurityGroupOwnerId) {
        this.sourceSecurityGroupOwnerId = sourceSecurityGroupOwnerId;
        return this;
    }

    /**
     * The IP protocol name or number. We recommend that you specify the
     * protocol in a set of IP permissions instead.
     *
     * @return The IP protocol name or number. We recommend that you specify the
     *         protocol in a set of IP permissions instead.
     */
    public String getIpProtocol() {
        return ipProtocol;
    }
    
    /**
     * The IP protocol name or number. We recommend that you specify the
     * protocol in a set of IP permissions instead.
     *
     * @param ipProtocol The IP protocol name or number. We recommend that you specify the
     *         protocol in a set of IP permissions instead.
     */
    public void setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }
    
    /**
     * The IP protocol name or number. We recommend that you specify the
     * protocol in a set of IP permissions instead.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ipProtocol The IP protocol name or number. We recommend that you specify the
     *         protocol in a set of IP permissions instead.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RevokeSecurityGroupEgressRequest withIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }

    /**
     * The start of port range for the TCP and UDP protocols, or an ICMP type
     * number. We recommend that you specify the port range in a set of IP
     * permissions instead.
     *
     * @return The start of port range for the TCP and UDP protocols, or an ICMP type
     *         number. We recommend that you specify the port range in a set of IP
     *         permissions instead.
     */
    public Integer getFromPort() {
        return fromPort;
    }
    
    /**
     * The start of port range for the TCP and UDP protocols, or an ICMP type
     * number. We recommend that you specify the port range in a set of IP
     * permissions instead.
     *
     * @param fromPort The start of port range for the TCP and UDP protocols, or an ICMP type
     *         number. We recommend that you specify the port range in a set of IP
     *         permissions instead.
     */
    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }
    
    /**
     * The start of port range for the TCP and UDP protocols, or an ICMP type
     * number. We recommend that you specify the port range in a set of IP
     * permissions instead.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fromPort The start of port range for the TCP and UDP protocols, or an ICMP type
     *         number. We recommend that you specify the port range in a set of IP
     *         permissions instead.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RevokeSecurityGroupEgressRequest withFromPort(Integer fromPort) {
        this.fromPort = fromPort;
        return this;
    }

    /**
     * The end of port range for the TCP and UDP protocols, or an ICMP type
     * number. We recommend that you specify the port range in a set of IP
     * permissions instead.
     *
     * @return The end of port range for the TCP and UDP protocols, or an ICMP type
     *         number. We recommend that you specify the port range in a set of IP
     *         permissions instead.
     */
    public Integer getToPort() {
        return toPort;
    }
    
    /**
     * The end of port range for the TCP and UDP protocols, or an ICMP type
     * number. We recommend that you specify the port range in a set of IP
     * permissions instead.
     *
     * @param toPort The end of port range for the TCP and UDP protocols, or an ICMP type
     *         number. We recommend that you specify the port range in a set of IP
     *         permissions instead.
     */
    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }
    
    /**
     * The end of port range for the TCP and UDP protocols, or an ICMP type
     * number. We recommend that you specify the port range in a set of IP
     * permissions instead.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param toPort The end of port range for the TCP and UDP protocols, or an ICMP type
     *         number. We recommend that you specify the port range in a set of IP
     *         permissions instead.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RevokeSecurityGroupEgressRequest withToPort(Integer toPort) {
        this.toPort = toPort;
        return this;
    }

    /**
     * The CIDR IP address range. We recommend that you specify the CIDR
     * range in a set of IP permissions instead.
     *
     * @return The CIDR IP address range. We recommend that you specify the CIDR
     *         range in a set of IP permissions instead.
     */
    public String getCidrIp() {
        return cidrIp;
    }
    
    /**
     * The CIDR IP address range. We recommend that you specify the CIDR
     * range in a set of IP permissions instead.
     *
     * @param cidrIp The CIDR IP address range. We recommend that you specify the CIDR
     *         range in a set of IP permissions instead.
     */
    public void setCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
    }
    
    /**
     * The CIDR IP address range. We recommend that you specify the CIDR
     * range in a set of IP permissions instead.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cidrIp The CIDR IP address range. We recommend that you specify the CIDR
     *         range in a set of IP permissions instead.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RevokeSecurityGroupEgressRequest withCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
        return this;
    }

    /**
     * A set of IP permissions. You can't specify a destination security
     * group and a CIDR IP address range.
     *
     * @return A set of IP permissions. You can't specify a destination security
     *         group and a CIDR IP address range.
     */
    public java.util.List<IpPermission> getIpPermissions() {
        if (ipPermissions == null) {
              ipPermissions = new com.amazonaws.internal.ListWithAutoConstructFlag<IpPermission>();
              ipPermissions.setAutoConstruct(true);
        }
        return ipPermissions;
    }
    
    /**
     * A set of IP permissions. You can't specify a destination security
     * group and a CIDR IP address range.
     *
     * @param ipPermissions A set of IP permissions. You can't specify a destination security
     *         group and a CIDR IP address range.
     */
    public void setIpPermissions(java.util.Collection<IpPermission> ipPermissions) {
        if (ipPermissions == null) {
            this.ipPermissions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<IpPermission> ipPermissionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<IpPermission>(ipPermissions.size());
        ipPermissionsCopy.addAll(ipPermissions);
        this.ipPermissions = ipPermissionsCopy;
    }
    
    /**
     * A set of IP permissions. You can't specify a destination security
     * group and a CIDR IP address range.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setIpPermissions(java.util.Collection)} or {@link
     * #withIpPermissions(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ipPermissions A set of IP permissions. You can't specify a destination security
     *         group and a CIDR IP address range.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RevokeSecurityGroupEgressRequest withIpPermissions(IpPermission... ipPermissions) {
        if (getIpPermissions() == null) setIpPermissions(new java.util.ArrayList<IpPermission>(ipPermissions.length));
        for (IpPermission value : ipPermissions) {
            getIpPermissions().add(value);
        }
        return this;
    }
    
    /**
     * A set of IP permissions. You can't specify a destination security
     * group and a CIDR IP address range.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ipPermissions A set of IP permissions. You can't specify a destination security
     *         group and a CIDR IP address range.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RevokeSecurityGroupEgressRequest withIpPermissions(java.util.Collection<IpPermission> ipPermissions) {
        if (ipPermissions == null) {
            this.ipPermissions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<IpPermission> ipPermissionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<IpPermission>(ipPermissions.size());
            ipPermissionsCopy.addAll(ipPermissions);
            this.ipPermissions = ipPermissionsCopy;
        }

        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<RevokeSecurityGroupEgressRequest> getDryRunRequest() {
        Request<RevokeSecurityGroupEgressRequest> request = new RevokeSecurityGroupEgressRequestMarshaller().marshall(this);
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
        if (getGroupId() != null) sb.append("GroupId: " + getGroupId() + ",");
        if (getSourceSecurityGroupName() != null) sb.append("SourceSecurityGroupName: " + getSourceSecurityGroupName() + ",");
        if (getSourceSecurityGroupOwnerId() != null) sb.append("SourceSecurityGroupOwnerId: " + getSourceSecurityGroupOwnerId() + ",");
        if (getIpProtocol() != null) sb.append("IpProtocol: " + getIpProtocol() + ",");
        if (getFromPort() != null) sb.append("FromPort: " + getFromPort() + ",");
        if (getToPort() != null) sb.append("ToPort: " + getToPort() + ",");
        if (getCidrIp() != null) sb.append("CidrIp: " + getCidrIp() + ",");
        if (getIpPermissions() != null) sb.append("IpPermissions: " + getIpPermissions() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode()); 
        hashCode = prime * hashCode + ((getSourceSecurityGroupName() == null) ? 0 : getSourceSecurityGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getSourceSecurityGroupOwnerId() == null) ? 0 : getSourceSecurityGroupOwnerId().hashCode()); 
        hashCode = prime * hashCode + ((getIpProtocol() == null) ? 0 : getIpProtocol().hashCode()); 
        hashCode = prime * hashCode + ((getFromPort() == null) ? 0 : getFromPort().hashCode()); 
        hashCode = prime * hashCode + ((getToPort() == null) ? 0 : getToPort().hashCode()); 
        hashCode = prime * hashCode + ((getCidrIp() == null) ? 0 : getCidrIp().hashCode()); 
        hashCode = prime * hashCode + ((getIpPermissions() == null) ? 0 : getIpPermissions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RevokeSecurityGroupEgressRequest == false) return false;
        RevokeSecurityGroupEgressRequest other = (RevokeSecurityGroupEgressRequest)obj;
        
        if (other.getGroupId() == null ^ this.getGroupId() == null) return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false) return false; 
        if (other.getSourceSecurityGroupName() == null ^ this.getSourceSecurityGroupName() == null) return false;
        if (other.getSourceSecurityGroupName() != null && other.getSourceSecurityGroupName().equals(this.getSourceSecurityGroupName()) == false) return false; 
        if (other.getSourceSecurityGroupOwnerId() == null ^ this.getSourceSecurityGroupOwnerId() == null) return false;
        if (other.getSourceSecurityGroupOwnerId() != null && other.getSourceSecurityGroupOwnerId().equals(this.getSourceSecurityGroupOwnerId()) == false) return false; 
        if (other.getIpProtocol() == null ^ this.getIpProtocol() == null) return false;
        if (other.getIpProtocol() != null && other.getIpProtocol().equals(this.getIpProtocol()) == false) return false; 
        if (other.getFromPort() == null ^ this.getFromPort() == null) return false;
        if (other.getFromPort() != null && other.getFromPort().equals(this.getFromPort()) == false) return false; 
        if (other.getToPort() == null ^ this.getToPort() == null) return false;
        if (other.getToPort() != null && other.getToPort().equals(this.getToPort()) == false) return false; 
        if (other.getCidrIp() == null ^ this.getCidrIp() == null) return false;
        if (other.getCidrIp() != null && other.getCidrIp().equals(this.getCidrIp()) == false) return false; 
        if (other.getIpPermissions() == null ^ this.getIpPermissions() == null) return false;
        if (other.getIpPermissions() != null && other.getIpPermissions().equals(this.getIpPermissions()) == false) return false; 
        return true;
    }
    
    @Override
    public RevokeSecurityGroupEgressRequest clone() {
        
            return (RevokeSecurityGroupEgressRequest) super.clone();
    }

}
    