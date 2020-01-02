/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A configuration for Amazon EMR block public access. When <code>BlockPublicSecurityGroupRules</code> is set to
 * <code>true</code>, Amazon EMR prevents cluster creation if one of the cluster's security groups has a rule that
 * allows inbound traffic from 0.0.0.0/0 or ::/0 on a port, unless the port is specified as an exception using
 * <code>PermittedPublicSecurityGroupRuleRanges</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/BlockPublicAccessConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BlockPublicAccessConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether EMR block public access is enabled (<code>true</code>) or disabled (<code>false</code>). By
     * default, the value is <code>false</code> for accounts that have created EMR clusters before July 2019. For
     * accounts created after this, the default is <code>true</code>.
     * </p>
     */
    private Boolean blockPublicSecurityGroupRules;
    /**
     * <p>
     * Specifies ports and port ranges that are permitted to have security group rules that allow inbound traffic from
     * all public sources. For example, if Port 23 (Telnet) is specified for
     * <code>PermittedPublicSecurityGroupRuleRanges</code>, Amazon EMR allows cluster creation if a security group
     * associated with the cluster has a rule that allows inbound traffic on Port 23 from IPv4 0.0.0.0/0 or IPv6 port
     * ::/0 as the source.
     * </p>
     * <p>
     * By default, Port 22, which is used for SSH access to the cluster EC2 instances, is in the list of
     * <code>PermittedPublicSecurityGroupRuleRanges</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PortRange> permittedPublicSecurityGroupRuleRanges;

    /**
     * <p>
     * Indicates whether EMR block public access is enabled (<code>true</code>) or disabled (<code>false</code>). By
     * default, the value is <code>false</code> for accounts that have created EMR clusters before July 2019. For
     * accounts created after this, the default is <code>true</code>.
     * </p>
     * 
     * @param blockPublicSecurityGroupRules
     *        Indicates whether EMR block public access is enabled (<code>true</code>) or disabled (<code>false</code>).
     *        By default, the value is <code>false</code> for accounts that have created EMR clusters before July 2019.
     *        For accounts created after this, the default is <code>true</code>.
     */

    public void setBlockPublicSecurityGroupRules(Boolean blockPublicSecurityGroupRules) {
        this.blockPublicSecurityGroupRules = blockPublicSecurityGroupRules;
    }

    /**
     * <p>
     * Indicates whether EMR block public access is enabled (<code>true</code>) or disabled (<code>false</code>). By
     * default, the value is <code>false</code> for accounts that have created EMR clusters before July 2019. For
     * accounts created after this, the default is <code>true</code>.
     * </p>
     * 
     * @return Indicates whether EMR block public access is enabled (<code>true</code>) or disabled (<code>false</code>
     *         ). By default, the value is <code>false</code> for accounts that have created EMR clusters before July
     *         2019. For accounts created after this, the default is <code>true</code>.
     */

    public Boolean getBlockPublicSecurityGroupRules() {
        return this.blockPublicSecurityGroupRules;
    }

    /**
     * <p>
     * Indicates whether EMR block public access is enabled (<code>true</code>) or disabled (<code>false</code>). By
     * default, the value is <code>false</code> for accounts that have created EMR clusters before July 2019. For
     * accounts created after this, the default is <code>true</code>.
     * </p>
     * 
     * @param blockPublicSecurityGroupRules
     *        Indicates whether EMR block public access is enabled (<code>true</code>) or disabled (<code>false</code>).
     *        By default, the value is <code>false</code> for accounts that have created EMR clusters before July 2019.
     *        For accounts created after this, the default is <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockPublicAccessConfiguration withBlockPublicSecurityGroupRules(Boolean blockPublicSecurityGroupRules) {
        setBlockPublicSecurityGroupRules(blockPublicSecurityGroupRules);
        return this;
    }

    /**
     * <p>
     * Indicates whether EMR block public access is enabled (<code>true</code>) or disabled (<code>false</code>). By
     * default, the value is <code>false</code> for accounts that have created EMR clusters before July 2019. For
     * accounts created after this, the default is <code>true</code>.
     * </p>
     * 
     * @return Indicates whether EMR block public access is enabled (<code>true</code>) or disabled (<code>false</code>
     *         ). By default, the value is <code>false</code> for accounts that have created EMR clusters before July
     *         2019. For accounts created after this, the default is <code>true</code>.
     */

    public Boolean isBlockPublicSecurityGroupRules() {
        return this.blockPublicSecurityGroupRules;
    }

    /**
     * <p>
     * Specifies ports and port ranges that are permitted to have security group rules that allow inbound traffic from
     * all public sources. For example, if Port 23 (Telnet) is specified for
     * <code>PermittedPublicSecurityGroupRuleRanges</code>, Amazon EMR allows cluster creation if a security group
     * associated with the cluster has a rule that allows inbound traffic on Port 23 from IPv4 0.0.0.0/0 or IPv6 port
     * ::/0 as the source.
     * </p>
     * <p>
     * By default, Port 22, which is used for SSH access to the cluster EC2 instances, is in the list of
     * <code>PermittedPublicSecurityGroupRuleRanges</code>.
     * </p>
     * 
     * @return Specifies ports and port ranges that are permitted to have security group rules that allow inbound
     *         traffic from all public sources. For example, if Port 23 (Telnet) is specified for
     *         <code>PermittedPublicSecurityGroupRuleRanges</code>, Amazon EMR allows cluster creation if a security
     *         group associated with the cluster has a rule that allows inbound traffic on Port 23 from IPv4 0.0.0.0/0
     *         or IPv6 port ::/0 as the source.</p>
     *         <p>
     *         By default, Port 22, which is used for SSH access to the cluster EC2 instances, is in the list of
     *         <code>PermittedPublicSecurityGroupRuleRanges</code>.
     */

    public java.util.List<PortRange> getPermittedPublicSecurityGroupRuleRanges() {
        if (permittedPublicSecurityGroupRuleRanges == null) {
            permittedPublicSecurityGroupRuleRanges = new com.amazonaws.internal.SdkInternalList<PortRange>();
        }
        return permittedPublicSecurityGroupRuleRanges;
    }

    /**
     * <p>
     * Specifies ports and port ranges that are permitted to have security group rules that allow inbound traffic from
     * all public sources. For example, if Port 23 (Telnet) is specified for
     * <code>PermittedPublicSecurityGroupRuleRanges</code>, Amazon EMR allows cluster creation if a security group
     * associated with the cluster has a rule that allows inbound traffic on Port 23 from IPv4 0.0.0.0/0 or IPv6 port
     * ::/0 as the source.
     * </p>
     * <p>
     * By default, Port 22, which is used for SSH access to the cluster EC2 instances, is in the list of
     * <code>PermittedPublicSecurityGroupRuleRanges</code>.
     * </p>
     * 
     * @param permittedPublicSecurityGroupRuleRanges
     *        Specifies ports and port ranges that are permitted to have security group rules that allow inbound traffic
     *        from all public sources. For example, if Port 23 (Telnet) is specified for
     *        <code>PermittedPublicSecurityGroupRuleRanges</code>, Amazon EMR allows cluster creation if a security
     *        group associated with the cluster has a rule that allows inbound traffic on Port 23 from IPv4 0.0.0.0/0 or
     *        IPv6 port ::/0 as the source.</p>
     *        <p>
     *        By default, Port 22, which is used for SSH access to the cluster EC2 instances, is in the list of
     *        <code>PermittedPublicSecurityGroupRuleRanges</code>.
     */

    public void setPermittedPublicSecurityGroupRuleRanges(java.util.Collection<PortRange> permittedPublicSecurityGroupRuleRanges) {
        if (permittedPublicSecurityGroupRuleRanges == null) {
            this.permittedPublicSecurityGroupRuleRanges = null;
            return;
        }

        this.permittedPublicSecurityGroupRuleRanges = new com.amazonaws.internal.SdkInternalList<PortRange>(permittedPublicSecurityGroupRuleRanges);
    }

    /**
     * <p>
     * Specifies ports and port ranges that are permitted to have security group rules that allow inbound traffic from
     * all public sources. For example, if Port 23 (Telnet) is specified for
     * <code>PermittedPublicSecurityGroupRuleRanges</code>, Amazon EMR allows cluster creation if a security group
     * associated with the cluster has a rule that allows inbound traffic on Port 23 from IPv4 0.0.0.0/0 or IPv6 port
     * ::/0 as the source.
     * </p>
     * <p>
     * By default, Port 22, which is used for SSH access to the cluster EC2 instances, is in the list of
     * <code>PermittedPublicSecurityGroupRuleRanges</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPermittedPublicSecurityGroupRuleRanges(java.util.Collection)} or
     * {@link #withPermittedPublicSecurityGroupRuleRanges(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param permittedPublicSecurityGroupRuleRanges
     *        Specifies ports and port ranges that are permitted to have security group rules that allow inbound traffic
     *        from all public sources. For example, if Port 23 (Telnet) is specified for
     *        <code>PermittedPublicSecurityGroupRuleRanges</code>, Amazon EMR allows cluster creation if a security
     *        group associated with the cluster has a rule that allows inbound traffic on Port 23 from IPv4 0.0.0.0/0 or
     *        IPv6 port ::/0 as the source.</p>
     *        <p>
     *        By default, Port 22, which is used for SSH access to the cluster EC2 instances, is in the list of
     *        <code>PermittedPublicSecurityGroupRuleRanges</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockPublicAccessConfiguration withPermittedPublicSecurityGroupRuleRanges(PortRange... permittedPublicSecurityGroupRuleRanges) {
        if (this.permittedPublicSecurityGroupRuleRanges == null) {
            setPermittedPublicSecurityGroupRuleRanges(new com.amazonaws.internal.SdkInternalList<PortRange>(permittedPublicSecurityGroupRuleRanges.length));
        }
        for (PortRange ele : permittedPublicSecurityGroupRuleRanges) {
            this.permittedPublicSecurityGroupRuleRanges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies ports and port ranges that are permitted to have security group rules that allow inbound traffic from
     * all public sources. For example, if Port 23 (Telnet) is specified for
     * <code>PermittedPublicSecurityGroupRuleRanges</code>, Amazon EMR allows cluster creation if a security group
     * associated with the cluster has a rule that allows inbound traffic on Port 23 from IPv4 0.0.0.0/0 or IPv6 port
     * ::/0 as the source.
     * </p>
     * <p>
     * By default, Port 22, which is used for SSH access to the cluster EC2 instances, is in the list of
     * <code>PermittedPublicSecurityGroupRuleRanges</code>.
     * </p>
     * 
     * @param permittedPublicSecurityGroupRuleRanges
     *        Specifies ports and port ranges that are permitted to have security group rules that allow inbound traffic
     *        from all public sources. For example, if Port 23 (Telnet) is specified for
     *        <code>PermittedPublicSecurityGroupRuleRanges</code>, Amazon EMR allows cluster creation if a security
     *        group associated with the cluster has a rule that allows inbound traffic on Port 23 from IPv4 0.0.0.0/0 or
     *        IPv6 port ::/0 as the source.</p>
     *        <p>
     *        By default, Port 22, which is used for SSH access to the cluster EC2 instances, is in the list of
     *        <code>PermittedPublicSecurityGroupRuleRanges</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockPublicAccessConfiguration withPermittedPublicSecurityGroupRuleRanges(java.util.Collection<PortRange> permittedPublicSecurityGroupRuleRanges) {
        setPermittedPublicSecurityGroupRuleRanges(permittedPublicSecurityGroupRuleRanges);
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
        if (getBlockPublicSecurityGroupRules() != null)
            sb.append("BlockPublicSecurityGroupRules: ").append(getBlockPublicSecurityGroupRules()).append(",");
        if (getPermittedPublicSecurityGroupRuleRanges() != null)
            sb.append("PermittedPublicSecurityGroupRuleRanges: ").append(getPermittedPublicSecurityGroupRuleRanges());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BlockPublicAccessConfiguration == false)
            return false;
        BlockPublicAccessConfiguration other = (BlockPublicAccessConfiguration) obj;
        if (other.getBlockPublicSecurityGroupRules() == null ^ this.getBlockPublicSecurityGroupRules() == null)
            return false;
        if (other.getBlockPublicSecurityGroupRules() != null
                && other.getBlockPublicSecurityGroupRules().equals(this.getBlockPublicSecurityGroupRules()) == false)
            return false;
        if (other.getPermittedPublicSecurityGroupRuleRanges() == null ^ this.getPermittedPublicSecurityGroupRuleRanges() == null)
            return false;
        if (other.getPermittedPublicSecurityGroupRuleRanges() != null
                && other.getPermittedPublicSecurityGroupRuleRanges().equals(this.getPermittedPublicSecurityGroupRuleRanges()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlockPublicSecurityGroupRules() == null) ? 0 : getBlockPublicSecurityGroupRules().hashCode());
        hashCode = prime * hashCode + ((getPermittedPublicSecurityGroupRuleRanges() == null) ? 0 : getPermittedPublicSecurityGroupRuleRanges().hashCode());
        return hashCode;
    }

    @Override
    public BlockPublicAccessConfiguration clone() {
        try {
            return (BlockPublicAccessConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.BlockPublicAccessConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
