/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workspacesweb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A network settings resource that can be associated with a web portal. Once associated with a web portal, network
 * settings define how streaming instances will connect with your specified VPC.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/NetworkSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of web portal ARNs that this network settings is associated with.
     * </p>
     */
    private java.util.List<String> associatedPortalArns;
    /**
     * <p>
     * The ARN of the network settings.
     * </p>
     */
    private String networkSettingsArn;
    /**
     * <p>
     * One or more security groups used to control access from streaming instances to your VPC.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * The subnets in which network interfaces are created to connect streaming instances to your VPC. At least two of
     * these subnets must be in different availability zones.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * The VPC that streaming instances will connect to.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * A list of web portal ARNs that this network settings is associated with.
     * </p>
     * 
     * @return A list of web portal ARNs that this network settings is associated with.
     */

    public java.util.List<String> getAssociatedPortalArns() {
        return associatedPortalArns;
    }

    /**
     * <p>
     * A list of web portal ARNs that this network settings is associated with.
     * </p>
     * 
     * @param associatedPortalArns
     *        A list of web portal ARNs that this network settings is associated with.
     */

    public void setAssociatedPortalArns(java.util.Collection<String> associatedPortalArns) {
        if (associatedPortalArns == null) {
            this.associatedPortalArns = null;
            return;
        }

        this.associatedPortalArns = new java.util.ArrayList<String>(associatedPortalArns);
    }

    /**
     * <p>
     * A list of web portal ARNs that this network settings is associated with.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociatedPortalArns(java.util.Collection)} or {@link #withAssociatedPortalArns(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param associatedPortalArns
     *        A list of web portal ARNs that this network settings is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkSettings withAssociatedPortalArns(String... associatedPortalArns) {
        if (this.associatedPortalArns == null) {
            setAssociatedPortalArns(new java.util.ArrayList<String>(associatedPortalArns.length));
        }
        for (String ele : associatedPortalArns) {
            this.associatedPortalArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of web portal ARNs that this network settings is associated with.
     * </p>
     * 
     * @param associatedPortalArns
     *        A list of web portal ARNs that this network settings is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkSettings withAssociatedPortalArns(java.util.Collection<String> associatedPortalArns) {
        setAssociatedPortalArns(associatedPortalArns);
        return this;
    }

    /**
     * <p>
     * The ARN of the network settings.
     * </p>
     * 
     * @param networkSettingsArn
     *        The ARN of the network settings.
     */

    public void setNetworkSettingsArn(String networkSettingsArn) {
        this.networkSettingsArn = networkSettingsArn;
    }

    /**
     * <p>
     * The ARN of the network settings.
     * </p>
     * 
     * @return The ARN of the network settings.
     */

    public String getNetworkSettingsArn() {
        return this.networkSettingsArn;
    }

    /**
     * <p>
     * The ARN of the network settings.
     * </p>
     * 
     * @param networkSettingsArn
     *        The ARN of the network settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkSettings withNetworkSettingsArn(String networkSettingsArn) {
        setNetworkSettingsArn(networkSettingsArn);
        return this;
    }

    /**
     * <p>
     * One or more security groups used to control access from streaming instances to your VPC.
     * </p>
     * 
     * @return One or more security groups used to control access from streaming instances to your VPC.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * One or more security groups used to control access from streaming instances to your VPC.
     * </p>
     * 
     * @param securityGroupIds
     *        One or more security groups used to control access from streaming instances to your VPC.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * One or more security groups used to control access from streaming instances to your VPC.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        One or more security groups used to control access from streaming instances to your VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkSettings withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more security groups used to control access from streaming instances to your VPC.
     * </p>
     * 
     * @param securityGroupIds
     *        One or more security groups used to control access from streaming instances to your VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkSettings withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The subnets in which network interfaces are created to connect streaming instances to your VPC. At least two of
     * these subnets must be in different availability zones.
     * </p>
     * 
     * @return The subnets in which network interfaces are created to connect streaming instances to your VPC. At least
     *         two of these subnets must be in different availability zones.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * The subnets in which network interfaces are created to connect streaming instances to your VPC. At least two of
     * these subnets must be in different availability zones.
     * </p>
     * 
     * @param subnetIds
     *        The subnets in which network interfaces are created to connect streaming instances to your VPC. At least
     *        two of these subnets must be in different availability zones.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * The subnets in which network interfaces are created to connect streaming instances to your VPC. At least two of
     * these subnets must be in different availability zones.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The subnets in which network interfaces are created to connect streaming instances to your VPC. At least
     *        two of these subnets must be in different availability zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkSettings withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The subnets in which network interfaces are created to connect streaming instances to your VPC. At least two of
     * these subnets must be in different availability zones.
     * </p>
     * 
     * @param subnetIds
     *        The subnets in which network interfaces are created to connect streaming instances to your VPC. At least
     *        two of these subnets must be in different availability zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkSettings withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The VPC that streaming instances will connect to.
     * </p>
     * 
     * @param vpcId
     *        The VPC that streaming instances will connect to.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The VPC that streaming instances will connect to.
     * </p>
     * 
     * @return The VPC that streaming instances will connect to.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The VPC that streaming instances will connect to.
     * </p>
     * 
     * @param vpcId
     *        The VPC that streaming instances will connect to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkSettings withVpcId(String vpcId) {
        setVpcId(vpcId);
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
        if (getAssociatedPortalArns() != null)
            sb.append("AssociatedPortalArns: ").append(getAssociatedPortalArns()).append(",");
        if (getNetworkSettingsArn() != null)
            sb.append("NetworkSettingsArn: ").append(getNetworkSettingsArn()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkSettings == false)
            return false;
        NetworkSettings other = (NetworkSettings) obj;
        if (other.getAssociatedPortalArns() == null ^ this.getAssociatedPortalArns() == null)
            return false;
        if (other.getAssociatedPortalArns() != null && other.getAssociatedPortalArns().equals(this.getAssociatedPortalArns()) == false)
            return false;
        if (other.getNetworkSettingsArn() == null ^ this.getNetworkSettingsArn() == null)
            return false;
        if (other.getNetworkSettingsArn() != null && other.getNetworkSettingsArn().equals(this.getNetworkSettingsArn()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociatedPortalArns() == null) ? 0 : getAssociatedPortalArns().hashCode());
        hashCode = prime * hashCode + ((getNetworkSettingsArn() == null) ? 0 : getNetworkSettingsArn().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public NetworkSettings clone() {
        try {
            return (NetworkSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspacesweb.model.transform.NetworkSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
