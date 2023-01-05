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
package com.amazonaws.services.pipes.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This structure specifies the VPC subnets and security groups for the stream, and whether a public IP address is to be
 * used.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/SelfManagedKafkaAccessConfigurationVpc"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SelfManagedKafkaAccessConfigurationVpc implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the security groups associated with the stream. These security groups must all be in the same VPC. You
     * can specify as many as five security groups. If you do not specify a security group, the default security group
     * for the VPC is used.
     * </p>
     */
    private java.util.List<String> securityGroup;
    /**
     * <p>
     * Specifies the subnets associated with the stream. These subnets must all be in the same VPC. You can specify as
     * many as 16 subnets.
     * </p>
     */
    private java.util.List<String> subnets;

    /**
     * <p>
     * Specifies the security groups associated with the stream. These security groups must all be in the same VPC. You
     * can specify as many as five security groups. If you do not specify a security group, the default security group
     * for the VPC is used.
     * </p>
     * 
     * @return Specifies the security groups associated with the stream. These security groups must all be in the same
     *         VPC. You can specify as many as five security groups. If you do not specify a security group, the default
     *         security group for the VPC is used.
     */

    public java.util.List<String> getSecurityGroup() {
        return securityGroup;
    }

    /**
     * <p>
     * Specifies the security groups associated with the stream. These security groups must all be in the same VPC. You
     * can specify as many as five security groups. If you do not specify a security group, the default security group
     * for the VPC is used.
     * </p>
     * 
     * @param securityGroup
     *        Specifies the security groups associated with the stream. These security groups must all be in the same
     *        VPC. You can specify as many as five security groups. If you do not specify a security group, the default
     *        security group for the VPC is used.
     */

    public void setSecurityGroup(java.util.Collection<String> securityGroup) {
        if (securityGroup == null) {
            this.securityGroup = null;
            return;
        }

        this.securityGroup = new java.util.ArrayList<String>(securityGroup);
    }

    /**
     * <p>
     * Specifies the security groups associated with the stream. These security groups must all be in the same VPC. You
     * can specify as many as five security groups. If you do not specify a security group, the default security group
     * for the VPC is used.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroup(java.util.Collection)} or {@link #withSecurityGroup(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroup
     *        Specifies the security groups associated with the stream. These security groups must all be in the same
     *        VPC. You can specify as many as five security groups. If you do not specify a security group, the default
     *        security group for the VPC is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfManagedKafkaAccessConfigurationVpc withSecurityGroup(String... securityGroup) {
        if (this.securityGroup == null) {
            setSecurityGroup(new java.util.ArrayList<String>(securityGroup.length));
        }
        for (String ele : securityGroup) {
            this.securityGroup.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the security groups associated with the stream. These security groups must all be in the same VPC. You
     * can specify as many as five security groups. If you do not specify a security group, the default security group
     * for the VPC is used.
     * </p>
     * 
     * @param securityGroup
     *        Specifies the security groups associated with the stream. These security groups must all be in the same
     *        VPC. You can specify as many as five security groups. If you do not specify a security group, the default
     *        security group for the VPC is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfManagedKafkaAccessConfigurationVpc withSecurityGroup(java.util.Collection<String> securityGroup) {
        setSecurityGroup(securityGroup);
        return this;
    }

    /**
     * <p>
     * Specifies the subnets associated with the stream. These subnets must all be in the same VPC. You can specify as
     * many as 16 subnets.
     * </p>
     * 
     * @return Specifies the subnets associated with the stream. These subnets must all be in the same VPC. You can
     *         specify as many as 16 subnets.
     */

    public java.util.List<String> getSubnets() {
        return subnets;
    }

    /**
     * <p>
     * Specifies the subnets associated with the stream. These subnets must all be in the same VPC. You can specify as
     * many as 16 subnets.
     * </p>
     * 
     * @param subnets
     *        Specifies the subnets associated with the stream. These subnets must all be in the same VPC. You can
     *        specify as many as 16 subnets.
     */

    public void setSubnets(java.util.Collection<String> subnets) {
        if (subnets == null) {
            this.subnets = null;
            return;
        }

        this.subnets = new java.util.ArrayList<String>(subnets);
    }

    /**
     * <p>
     * Specifies the subnets associated with the stream. These subnets must all be in the same VPC. You can specify as
     * many as 16 subnets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnets(java.util.Collection)} or {@link #withSubnets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param subnets
     *        Specifies the subnets associated with the stream. These subnets must all be in the same VPC. You can
     *        specify as many as 16 subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfManagedKafkaAccessConfigurationVpc withSubnets(String... subnets) {
        if (this.subnets == null) {
            setSubnets(new java.util.ArrayList<String>(subnets.length));
        }
        for (String ele : subnets) {
            this.subnets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the subnets associated with the stream. These subnets must all be in the same VPC. You can specify as
     * many as 16 subnets.
     * </p>
     * 
     * @param subnets
     *        Specifies the subnets associated with the stream. These subnets must all be in the same VPC. You can
     *        specify as many as 16 subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfManagedKafkaAccessConfigurationVpc withSubnets(java.util.Collection<String> subnets) {
        setSubnets(subnets);
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
        if (getSecurityGroup() != null)
            sb.append("SecurityGroup: ").append("***Sensitive Data Redacted***").append(",");
        if (getSubnets() != null)
            sb.append("Subnets: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SelfManagedKafkaAccessConfigurationVpc == false)
            return false;
        SelfManagedKafkaAccessConfigurationVpc other = (SelfManagedKafkaAccessConfigurationVpc) obj;
        if (other.getSecurityGroup() == null ^ this.getSecurityGroup() == null)
            return false;
        if (other.getSecurityGroup() != null && other.getSecurityGroup().equals(this.getSecurityGroup()) == false)
            return false;
        if (other.getSubnets() == null ^ this.getSubnets() == null)
            return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecurityGroup() == null) ? 0 : getSecurityGroup().hashCode());
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode());
        return hashCode;
    }

    @Override
    public SelfManagedKafkaAccessConfigurationVpc clone() {
        try {
            return (SelfManagedKafkaAccessConfigurationVpc) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pipes.model.transform.SelfManagedKafkaAccessConfigurationVpcMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
