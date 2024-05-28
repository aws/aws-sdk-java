/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The override parameters for a single VPC connection that is imported.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AssetBundleImportJobVPCConnectionOverrideParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetBundleImportJobVPCConnectionOverrideParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the VPC Connection to apply overrides to.
     * </p>
     */
    private String vPCConnectionId;
    /**
     * <p>
     * A new name for the VPC connection.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A list of new subnet IDs for the VPC connection you are importing. This field is required if you are importing
     * the VPC connection from another Amazon Web Services account or Region.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * A new security group ID for the VPC connection you are importing. This field is required if you are importing the
     * VPC connection from another Amazon Web Services account or Region.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * An optional override of DNS resolvers to be used by the VPC connection.
     * </p>
     */
    private java.util.List<String> dnsResolvers;
    /**
     * <p>
     * An optional override of the role ARN to be used by the VPC connection.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The ID of the VPC Connection to apply overrides to.
     * </p>
     * 
     * @param vPCConnectionId
     *        The ID of the VPC Connection to apply overrides to.
     */

    public void setVPCConnectionId(String vPCConnectionId) {
        this.vPCConnectionId = vPCConnectionId;
    }

    /**
     * <p>
     * The ID of the VPC Connection to apply overrides to.
     * </p>
     * 
     * @return The ID of the VPC Connection to apply overrides to.
     */

    public String getVPCConnectionId() {
        return this.vPCConnectionId;
    }

    /**
     * <p>
     * The ID of the VPC Connection to apply overrides to.
     * </p>
     * 
     * @param vPCConnectionId
     *        The ID of the VPC Connection to apply overrides to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobVPCConnectionOverrideParameters withVPCConnectionId(String vPCConnectionId) {
        setVPCConnectionId(vPCConnectionId);
        return this;
    }

    /**
     * <p>
     * A new name for the VPC connection.
     * </p>
     * 
     * @param name
     *        A new name for the VPC connection.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A new name for the VPC connection.
     * </p>
     * 
     * @return A new name for the VPC connection.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A new name for the VPC connection.
     * </p>
     * 
     * @param name
     *        A new name for the VPC connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobVPCConnectionOverrideParameters withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A list of new subnet IDs for the VPC connection you are importing. This field is required if you are importing
     * the VPC connection from another Amazon Web Services account or Region.
     * </p>
     * 
     * @return A list of new subnet IDs for the VPC connection you are importing. This field is required if you are
     *         importing the VPC connection from another Amazon Web Services account or Region.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * A list of new subnet IDs for the VPC connection you are importing. This field is required if you are importing
     * the VPC connection from another Amazon Web Services account or Region.
     * </p>
     * 
     * @param subnetIds
     *        A list of new subnet IDs for the VPC connection you are importing. This field is required if you are
     *        importing the VPC connection from another Amazon Web Services account or Region.
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
     * A list of new subnet IDs for the VPC connection you are importing. This field is required if you are importing
     * the VPC connection from another Amazon Web Services account or Region.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        A list of new subnet IDs for the VPC connection you are importing. This field is required if you are
     *        importing the VPC connection from another Amazon Web Services account or Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobVPCConnectionOverrideParameters withSubnetIds(String... subnetIds) {
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
     * A list of new subnet IDs for the VPC connection you are importing. This field is required if you are importing
     * the VPC connection from another Amazon Web Services account or Region.
     * </p>
     * 
     * @param subnetIds
     *        A list of new subnet IDs for the VPC connection you are importing. This field is required if you are
     *        importing the VPC connection from another Amazon Web Services account or Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobVPCConnectionOverrideParameters withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * A new security group ID for the VPC connection you are importing. This field is required if you are importing the
     * VPC connection from another Amazon Web Services account or Region.
     * </p>
     * 
     * @return A new security group ID for the VPC connection you are importing. This field is required if you are
     *         importing the VPC connection from another Amazon Web Services account or Region.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * A new security group ID for the VPC connection you are importing. This field is required if you are importing the
     * VPC connection from another Amazon Web Services account or Region.
     * </p>
     * 
     * @param securityGroupIds
     *        A new security group ID for the VPC connection you are importing. This field is required if you are
     *        importing the VPC connection from another Amazon Web Services account or Region.
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
     * A new security group ID for the VPC connection you are importing. This field is required if you are importing the
     * VPC connection from another Amazon Web Services account or Region.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        A new security group ID for the VPC connection you are importing. This field is required if you are
     *        importing the VPC connection from another Amazon Web Services account or Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobVPCConnectionOverrideParameters withSecurityGroupIds(String... securityGroupIds) {
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
     * A new security group ID for the VPC connection you are importing. This field is required if you are importing the
     * VPC connection from another Amazon Web Services account or Region.
     * </p>
     * 
     * @param securityGroupIds
     *        A new security group ID for the VPC connection you are importing. This field is required if you are
     *        importing the VPC connection from another Amazon Web Services account or Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobVPCConnectionOverrideParameters withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * An optional override of DNS resolvers to be used by the VPC connection.
     * </p>
     * 
     * @return An optional override of DNS resolvers to be used by the VPC connection.
     */

    public java.util.List<String> getDnsResolvers() {
        return dnsResolvers;
    }

    /**
     * <p>
     * An optional override of DNS resolvers to be used by the VPC connection.
     * </p>
     * 
     * @param dnsResolvers
     *        An optional override of DNS resolvers to be used by the VPC connection.
     */

    public void setDnsResolvers(java.util.Collection<String> dnsResolvers) {
        if (dnsResolvers == null) {
            this.dnsResolvers = null;
            return;
        }

        this.dnsResolvers = new java.util.ArrayList<String>(dnsResolvers);
    }

    /**
     * <p>
     * An optional override of DNS resolvers to be used by the VPC connection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDnsResolvers(java.util.Collection)} or {@link #withDnsResolvers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dnsResolvers
     *        An optional override of DNS resolvers to be used by the VPC connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobVPCConnectionOverrideParameters withDnsResolvers(String... dnsResolvers) {
        if (this.dnsResolvers == null) {
            setDnsResolvers(new java.util.ArrayList<String>(dnsResolvers.length));
        }
        for (String ele : dnsResolvers) {
            this.dnsResolvers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An optional override of DNS resolvers to be used by the VPC connection.
     * </p>
     * 
     * @param dnsResolvers
     *        An optional override of DNS resolvers to be used by the VPC connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobVPCConnectionOverrideParameters withDnsResolvers(java.util.Collection<String> dnsResolvers) {
        setDnsResolvers(dnsResolvers);
        return this;
    }

    /**
     * <p>
     * An optional override of the role ARN to be used by the VPC connection.
     * </p>
     * 
     * @param roleArn
     *        An optional override of the role ARN to be used by the VPC connection.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * An optional override of the role ARN to be used by the VPC connection.
     * </p>
     * 
     * @return An optional override of the role ARN to be used by the VPC connection.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * An optional override of the role ARN to be used by the VPC connection.
     * </p>
     * 
     * @param roleArn
     *        An optional override of the role ARN to be used by the VPC connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobVPCConnectionOverrideParameters withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getVPCConnectionId() != null)
            sb.append("VPCConnectionId: ").append(getVPCConnectionId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getDnsResolvers() != null)
            sb.append("DnsResolvers: ").append(getDnsResolvers()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetBundleImportJobVPCConnectionOverrideParameters == false)
            return false;
        AssetBundleImportJobVPCConnectionOverrideParameters other = (AssetBundleImportJobVPCConnectionOverrideParameters) obj;
        if (other.getVPCConnectionId() == null ^ this.getVPCConnectionId() == null)
            return false;
        if (other.getVPCConnectionId() != null && other.getVPCConnectionId().equals(this.getVPCConnectionId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getDnsResolvers() == null ^ this.getDnsResolvers() == null)
            return false;
        if (other.getDnsResolvers() != null && other.getDnsResolvers().equals(this.getDnsResolvers()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVPCConnectionId() == null) ? 0 : getVPCConnectionId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getDnsResolvers() == null) ? 0 : getDnsResolvers().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public AssetBundleImportJobVPCConnectionOverrideParameters clone() {
        try {
            return (AssetBundleImportJobVPCConnectionOverrideParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AssetBundleImportJobVPCConnectionOverrideParametersMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
