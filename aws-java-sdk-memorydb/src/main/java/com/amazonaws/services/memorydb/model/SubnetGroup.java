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
package com.amazonaws.services.memorydb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the output of one of the following operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * CreateSubnetGroup
 * </p>
 * </li>
 * <li>
 * <p>
 * UpdateSubnetGroup
 * </p>
 * </li>
 * </ul>
 * <p>
 * A subnet group is a collection of subnets (typically private) that you can designate for your clusters running in an
 * Amazon Virtual Private Cloud (VPC) environment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/SubnetGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubnetGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the subnet group
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the subnet group
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Virtual Private Cloud identifier (VPC ID) of the subnet group.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * A list of subnets associated with the subnet group.
     * </p>
     */
    private java.util.List<Subnet> subnets;
    /**
     * <p>
     * The ARN (Amazon Resource Name) of the subnet group.
     * </p>
     */
    private String aRN;

    /**
     * <p>
     * The name of the subnet group
     * </p>
     * 
     * @param name
     *        The name of the subnet group
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the subnet group
     * </p>
     * 
     * @return The name of the subnet group
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the subnet group
     * </p>
     * 
     * @param name
     *        The name of the subnet group
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubnetGroup withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the subnet group
     * </p>
     * 
     * @param description
     *        A description of the subnet group
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the subnet group
     * </p>
     * 
     * @return A description of the subnet group
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the subnet group
     * </p>
     * 
     * @param description
     *        A description of the subnet group
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubnetGroup withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Virtual Private Cloud identifier (VPC ID) of the subnet group.
     * </p>
     * 
     * @param vpcId
     *        The Amazon Virtual Private Cloud identifier (VPC ID) of the subnet group.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The Amazon Virtual Private Cloud identifier (VPC ID) of the subnet group.
     * </p>
     * 
     * @return The Amazon Virtual Private Cloud identifier (VPC ID) of the subnet group.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The Amazon Virtual Private Cloud identifier (VPC ID) of the subnet group.
     * </p>
     * 
     * @param vpcId
     *        The Amazon Virtual Private Cloud identifier (VPC ID) of the subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubnetGroup withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * A list of subnets associated with the subnet group.
     * </p>
     * 
     * @return A list of subnets associated with the subnet group.
     */

    public java.util.List<Subnet> getSubnets() {
        return subnets;
    }

    /**
     * <p>
     * A list of subnets associated with the subnet group.
     * </p>
     * 
     * @param subnets
     *        A list of subnets associated with the subnet group.
     */

    public void setSubnets(java.util.Collection<Subnet> subnets) {
        if (subnets == null) {
            this.subnets = null;
            return;
        }

        this.subnets = new java.util.ArrayList<Subnet>(subnets);
    }

    /**
     * <p>
     * A list of subnets associated with the subnet group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnets(java.util.Collection)} or {@link #withSubnets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param subnets
     *        A list of subnets associated with the subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubnetGroup withSubnets(Subnet... subnets) {
        if (this.subnets == null) {
            setSubnets(new java.util.ArrayList<Subnet>(subnets.length));
        }
        for (Subnet ele : subnets) {
            this.subnets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of subnets associated with the subnet group.
     * </p>
     * 
     * @param subnets
     *        A list of subnets associated with the subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubnetGroup withSubnets(java.util.Collection<Subnet> subnets) {
        setSubnets(subnets);
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the subnet group.
     * </p>
     * 
     * @param aRN
     *        The ARN (Amazon Resource Name) of the subnet group.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the subnet group.
     * </p>
     * 
     * @return The ARN (Amazon Resource Name) of the subnet group.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the subnet group.
     * </p>
     * 
     * @param aRN
     *        The ARN (Amazon Resource Name) of the subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubnetGroup withARN(String aRN) {
        setARN(aRN);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getSubnets() != null)
            sb.append("Subnets: ").append(getSubnets()).append(",");
        if (getARN() != null)
            sb.append("ARN: ").append(getARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubnetGroup == false)
            return false;
        SubnetGroup other = (SubnetGroup) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getSubnets() == null ^ this.getSubnets() == null)
            return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        return hashCode;
    }

    @Override
    public SubnetGroup clone() {
        try {
            return (SubnetGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.memorydb.model.transform.SubnetGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
