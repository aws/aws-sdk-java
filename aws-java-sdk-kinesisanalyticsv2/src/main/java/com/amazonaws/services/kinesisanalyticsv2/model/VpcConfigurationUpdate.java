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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes updates to the VPC configuration used by the application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/VpcConfigurationUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcConfigurationUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes an update to the ID of the VPC configuration.
     * </p>
     */
    private String vpcConfigurationId;
    /**
     * <p>
     * Describes updates to the array of <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Subnet.html">Subnet</a> IDs used by the VPC
     * configuration.
     * </p>
     */
    private java.util.List<String> subnetIdUpdates;
    /**
     * <p>
     * Describes updates to the array of <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SecurityGroup.html">SecurityGroup</a> IDs used
     * by the VPC configuration.
     * </p>
     */
    private java.util.List<String> securityGroupIdUpdates;

    /**
     * <p>
     * Describes an update to the ID of the VPC configuration.
     * </p>
     * 
     * @param vpcConfigurationId
     *        Describes an update to the ID of the VPC configuration.
     */

    public void setVpcConfigurationId(String vpcConfigurationId) {
        this.vpcConfigurationId = vpcConfigurationId;
    }

    /**
     * <p>
     * Describes an update to the ID of the VPC configuration.
     * </p>
     * 
     * @return Describes an update to the ID of the VPC configuration.
     */

    public String getVpcConfigurationId() {
        return this.vpcConfigurationId;
    }

    /**
     * <p>
     * Describes an update to the ID of the VPC configuration.
     * </p>
     * 
     * @param vpcConfigurationId
     *        Describes an update to the ID of the VPC configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfigurationUpdate withVpcConfigurationId(String vpcConfigurationId) {
        setVpcConfigurationId(vpcConfigurationId);
        return this;
    }

    /**
     * <p>
     * Describes updates to the array of <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Subnet.html">Subnet</a> IDs used by the VPC
     * configuration.
     * </p>
     * 
     * @return Describes updates to the array of <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Subnet.html">Subnet</a> IDs used by the
     *         VPC configuration.
     */

    public java.util.List<String> getSubnetIdUpdates() {
        return subnetIdUpdates;
    }

    /**
     * <p>
     * Describes updates to the array of <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Subnet.html">Subnet</a> IDs used by the VPC
     * configuration.
     * </p>
     * 
     * @param subnetIdUpdates
     *        Describes updates to the array of <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Subnet.html">Subnet</a> IDs used by the
     *        VPC configuration.
     */

    public void setSubnetIdUpdates(java.util.Collection<String> subnetIdUpdates) {
        if (subnetIdUpdates == null) {
            this.subnetIdUpdates = null;
            return;
        }

        this.subnetIdUpdates = new java.util.ArrayList<String>(subnetIdUpdates);
    }

    /**
     * <p>
     * Describes updates to the array of <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Subnet.html">Subnet</a> IDs used by the VPC
     * configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIdUpdates(java.util.Collection)} or {@link #withSubnetIdUpdates(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param subnetIdUpdates
     *        Describes updates to the array of <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Subnet.html">Subnet</a> IDs used by the
     *        VPC configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfigurationUpdate withSubnetIdUpdates(String... subnetIdUpdates) {
        if (this.subnetIdUpdates == null) {
            setSubnetIdUpdates(new java.util.ArrayList<String>(subnetIdUpdates.length));
        }
        for (String ele : subnetIdUpdates) {
            this.subnetIdUpdates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes updates to the array of <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Subnet.html">Subnet</a> IDs used by the VPC
     * configuration.
     * </p>
     * 
     * @param subnetIdUpdates
     *        Describes updates to the array of <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Subnet.html">Subnet</a> IDs used by the
     *        VPC configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfigurationUpdate withSubnetIdUpdates(java.util.Collection<String> subnetIdUpdates) {
        setSubnetIdUpdates(subnetIdUpdates);
        return this;
    }

    /**
     * <p>
     * Describes updates to the array of <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SecurityGroup.html">SecurityGroup</a> IDs used
     * by the VPC configuration.
     * </p>
     * 
     * @return Describes updates to the array of <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SecurityGroup.html">SecurityGroup</a>
     *         IDs used by the VPC configuration.
     */

    public java.util.List<String> getSecurityGroupIdUpdates() {
        return securityGroupIdUpdates;
    }

    /**
     * <p>
     * Describes updates to the array of <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SecurityGroup.html">SecurityGroup</a> IDs used
     * by the VPC configuration.
     * </p>
     * 
     * @param securityGroupIdUpdates
     *        Describes updates to the array of <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SecurityGroup.html">SecurityGroup</a> IDs
     *        used by the VPC configuration.
     */

    public void setSecurityGroupIdUpdates(java.util.Collection<String> securityGroupIdUpdates) {
        if (securityGroupIdUpdates == null) {
            this.securityGroupIdUpdates = null;
            return;
        }

        this.securityGroupIdUpdates = new java.util.ArrayList<String>(securityGroupIdUpdates);
    }

    /**
     * <p>
     * Describes updates to the array of <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SecurityGroup.html">SecurityGroup</a> IDs used
     * by the VPC configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIdUpdates(java.util.Collection)} or
     * {@link #withSecurityGroupIdUpdates(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param securityGroupIdUpdates
     *        Describes updates to the array of <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SecurityGroup.html">SecurityGroup</a> IDs
     *        used by the VPC configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfigurationUpdate withSecurityGroupIdUpdates(String... securityGroupIdUpdates) {
        if (this.securityGroupIdUpdates == null) {
            setSecurityGroupIdUpdates(new java.util.ArrayList<String>(securityGroupIdUpdates.length));
        }
        for (String ele : securityGroupIdUpdates) {
            this.securityGroupIdUpdates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes updates to the array of <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SecurityGroup.html">SecurityGroup</a> IDs used
     * by the VPC configuration.
     * </p>
     * 
     * @param securityGroupIdUpdates
     *        Describes updates to the array of <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SecurityGroup.html">SecurityGroup</a> IDs
     *        used by the VPC configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfigurationUpdate withSecurityGroupIdUpdates(java.util.Collection<String> securityGroupIdUpdates) {
        setSecurityGroupIdUpdates(securityGroupIdUpdates);
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
        if (getVpcConfigurationId() != null)
            sb.append("VpcConfigurationId: ").append(getVpcConfigurationId()).append(",");
        if (getSubnetIdUpdates() != null)
            sb.append("SubnetIdUpdates: ").append(getSubnetIdUpdates()).append(",");
        if (getSecurityGroupIdUpdates() != null)
            sb.append("SecurityGroupIdUpdates: ").append(getSecurityGroupIdUpdates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcConfigurationUpdate == false)
            return false;
        VpcConfigurationUpdate other = (VpcConfigurationUpdate) obj;
        if (other.getVpcConfigurationId() == null ^ this.getVpcConfigurationId() == null)
            return false;
        if (other.getVpcConfigurationId() != null && other.getVpcConfigurationId().equals(this.getVpcConfigurationId()) == false)
            return false;
        if (other.getSubnetIdUpdates() == null ^ this.getSubnetIdUpdates() == null)
            return false;
        if (other.getSubnetIdUpdates() != null && other.getSubnetIdUpdates().equals(this.getSubnetIdUpdates()) == false)
            return false;
        if (other.getSecurityGroupIdUpdates() == null ^ this.getSecurityGroupIdUpdates() == null)
            return false;
        if (other.getSecurityGroupIdUpdates() != null && other.getSecurityGroupIdUpdates().equals(this.getSecurityGroupIdUpdates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcConfigurationId() == null) ? 0 : getVpcConfigurationId().hashCode());
        hashCode = prime * hashCode + ((getSubnetIdUpdates() == null) ? 0 : getSubnetIdUpdates().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIdUpdates() == null) ? 0 : getSecurityGroupIdUpdates().hashCode());
        return hashCode;
    }

    @Override
    public VpcConfigurationUpdate clone() {
        try {
            return (VpcConfigurationUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.VpcConfigurationUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
