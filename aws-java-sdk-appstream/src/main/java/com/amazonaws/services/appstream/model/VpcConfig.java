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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes VPC configuration information for fleets and image builders.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/VpcConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifiers of the subnets to which a network interface is attached from the fleet instance or image builder
     * instance. Fleet instances use one or two subnets. Image builder instances use one subnet.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * The identifiers of the security groups for the fleet or image builder.
     * </p>
     */
    private java.util.List<String> securityGroupIds;

    /**
     * <p>
     * The identifiers of the subnets to which a network interface is attached from the fleet instance or image builder
     * instance. Fleet instances use one or two subnets. Image builder instances use one subnet.
     * </p>
     * 
     * @return The identifiers of the subnets to which a network interface is attached from the fleet instance or image
     *         builder instance. Fleet instances use one or two subnets. Image builder instances use one subnet.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * The identifiers of the subnets to which a network interface is attached from the fleet instance or image builder
     * instance. Fleet instances use one or two subnets. Image builder instances use one subnet.
     * </p>
     * 
     * @param subnetIds
     *        The identifiers of the subnets to which a network interface is attached from the fleet instance or image
     *        builder instance. Fleet instances use one or two subnets. Image builder instances use one subnet.
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
     * The identifiers of the subnets to which a network interface is attached from the fleet instance or image builder
     * instance. Fleet instances use one or two subnets. Image builder instances use one subnet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The identifiers of the subnets to which a network interface is attached from the fleet instance or image
     *        builder instance. Fleet instances use one or two subnets. Image builder instances use one subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfig withSubnetIds(String... subnetIds) {
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
     * The identifiers of the subnets to which a network interface is attached from the fleet instance or image builder
     * instance. Fleet instances use one or two subnets. Image builder instances use one subnet.
     * </p>
     * 
     * @param subnetIds
     *        The identifiers of the subnets to which a network interface is attached from the fleet instance or image
     *        builder instance. Fleet instances use one or two subnets. Image builder instances use one subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfig withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The identifiers of the security groups for the fleet or image builder.
     * </p>
     * 
     * @return The identifiers of the security groups for the fleet or image builder.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The identifiers of the security groups for the fleet or image builder.
     * </p>
     * 
     * @param securityGroupIds
     *        The identifiers of the security groups for the fleet or image builder.
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
     * The identifiers of the security groups for the fleet or image builder.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The identifiers of the security groups for the fleet or image builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfig withSecurityGroupIds(String... securityGroupIds) {
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
     * The identifiers of the security groups for the fleet or image builder.
     * </p>
     * 
     * @param securityGroupIds
     *        The identifiers of the security groups for the fleet or image builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfig withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
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
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
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

        if (obj instanceof VpcConfig == false)
            return false;
        VpcConfig other = (VpcConfig) obj;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
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

        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        return hashCode;
    }

    @Override
    public VpcConfig clone() {
        try {
            return (VpcConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appstream.model.transform.VpcConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
