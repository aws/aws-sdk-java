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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains VPC information for the <a>CreateDirectory</a> or <a>CreateMicrosoftAD</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DirectoryVpcSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DirectoryVpcSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the VPC in which to create the directory.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The identifiers of the subnets for the directory servers. The two subnets must be in different Availability
     * Zones. AWS Directory Service creates a directory server and a DNS server in each of these subnets.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> subnetIds;

    /**
     * <p>
     * The identifier of the VPC in which to create the directory.
     * </p>
     * 
     * @param vpcId
     *        The identifier of the VPC in which to create the directory.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The identifier of the VPC in which to create the directory.
     * </p>
     * 
     * @return The identifier of the VPC in which to create the directory.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The identifier of the VPC in which to create the directory.
     * </p>
     * 
     * @param vpcId
     *        The identifier of the VPC in which to create the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryVpcSettings withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The identifiers of the subnets for the directory servers. The two subnets must be in different Availability
     * Zones. AWS Directory Service creates a directory server and a DNS server in each of these subnets.
     * </p>
     * 
     * @return The identifiers of the subnets for the directory servers. The two subnets must be in different
     *         Availability Zones. AWS Directory Service creates a directory server and a DNS server in each of these
     *         subnets.
     */

    public java.util.List<String> getSubnetIds() {
        if (subnetIds == null) {
            subnetIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return subnetIds;
    }

    /**
     * <p>
     * The identifiers of the subnets for the directory servers. The two subnets must be in different Availability
     * Zones. AWS Directory Service creates a directory server and a DNS server in each of these subnets.
     * </p>
     * 
     * @param subnetIds
     *        The identifiers of the subnets for the directory servers. The two subnets must be in different
     *        Availability Zones. AWS Directory Service creates a directory server and a DNS server in each of these
     *        subnets.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new com.amazonaws.internal.SdkInternalList<String>(subnetIds);
    }

    /**
     * <p>
     * The identifiers of the subnets for the directory servers. The two subnets must be in different Availability
     * Zones. AWS Directory Service creates a directory server and a DNS server in each of these subnets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The identifiers of the subnets for the directory servers. The two subnets must be in different
     *        Availability Zones. AWS Directory Service creates a directory server and a DNS server in each of these
     *        subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryVpcSettings withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new com.amazonaws.internal.SdkInternalList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifiers of the subnets for the directory servers. The two subnets must be in different Availability
     * Zones. AWS Directory Service creates a directory server and a DNS server in each of these subnets.
     * </p>
     * 
     * @param subnetIds
     *        The identifiers of the subnets for the directory servers. The two subnets must be in different
     *        Availability Zones. AWS Directory Service creates a directory server and a DNS server in each of these
     *        subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryVpcSettings withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
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
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DirectoryVpcSettings == false)
            return false;
        DirectoryVpcSettings other = (DirectoryVpcSettings) obj;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        return hashCode;
    }

    @Override
    public DirectoryVpcSettings clone() {
        try {
            return (DirectoryVpcSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directory.model.transform.DirectoryVpcSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
