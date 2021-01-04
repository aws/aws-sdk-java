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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the subnet group for the database instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRdsDbSubnetGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRdsDbSubnetGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the subnet group.
     * </p>
     */
    private String dbSubnetGroupName;
    /**
     * <p>
     * The description of the subnet group.
     * </p>
     */
    private String dbSubnetGroupDescription;
    /**
     * <p>
     * The VPC ID of the subnet group.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The status of the subnet group.
     * </p>
     */
    private String subnetGroupStatus;
    /**
     * <p>
     * A list of subnets in the subnet group.
     * </p>
     */
    private java.util.List<AwsRdsDbSubnetGroupSubnet> subnets;
    /**
     * <p>
     * The ARN of the subnet group.
     * </p>
     */
    private String dbSubnetGroupArn;

    /**
     * <p>
     * The name of the subnet group.
     * </p>
     * 
     * @param dbSubnetGroupName
     *        The name of the subnet group.
     */

    public void setDbSubnetGroupName(String dbSubnetGroupName) {
        this.dbSubnetGroupName = dbSubnetGroupName;
    }

    /**
     * <p>
     * The name of the subnet group.
     * </p>
     * 
     * @return The name of the subnet group.
     */

    public String getDbSubnetGroupName() {
        return this.dbSubnetGroupName;
    }

    /**
     * <p>
     * The name of the subnet group.
     * </p>
     * 
     * @param dbSubnetGroupName
     *        The name of the subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSubnetGroup withDbSubnetGroupName(String dbSubnetGroupName) {
        setDbSubnetGroupName(dbSubnetGroupName);
        return this;
    }

    /**
     * <p>
     * The description of the subnet group.
     * </p>
     * 
     * @param dbSubnetGroupDescription
     *        The description of the subnet group.
     */

    public void setDbSubnetGroupDescription(String dbSubnetGroupDescription) {
        this.dbSubnetGroupDescription = dbSubnetGroupDescription;
    }

    /**
     * <p>
     * The description of the subnet group.
     * </p>
     * 
     * @return The description of the subnet group.
     */

    public String getDbSubnetGroupDescription() {
        return this.dbSubnetGroupDescription;
    }

    /**
     * <p>
     * The description of the subnet group.
     * </p>
     * 
     * @param dbSubnetGroupDescription
     *        The description of the subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSubnetGroup withDbSubnetGroupDescription(String dbSubnetGroupDescription) {
        setDbSubnetGroupDescription(dbSubnetGroupDescription);
        return this;
    }

    /**
     * <p>
     * The VPC ID of the subnet group.
     * </p>
     * 
     * @param vpcId
     *        The VPC ID of the subnet group.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The VPC ID of the subnet group.
     * </p>
     * 
     * @return The VPC ID of the subnet group.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The VPC ID of the subnet group.
     * </p>
     * 
     * @param vpcId
     *        The VPC ID of the subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSubnetGroup withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The status of the subnet group.
     * </p>
     * 
     * @param subnetGroupStatus
     *        The status of the subnet group.
     */

    public void setSubnetGroupStatus(String subnetGroupStatus) {
        this.subnetGroupStatus = subnetGroupStatus;
    }

    /**
     * <p>
     * The status of the subnet group.
     * </p>
     * 
     * @return The status of the subnet group.
     */

    public String getSubnetGroupStatus() {
        return this.subnetGroupStatus;
    }

    /**
     * <p>
     * The status of the subnet group.
     * </p>
     * 
     * @param subnetGroupStatus
     *        The status of the subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSubnetGroup withSubnetGroupStatus(String subnetGroupStatus) {
        setSubnetGroupStatus(subnetGroupStatus);
        return this;
    }

    /**
     * <p>
     * A list of subnets in the subnet group.
     * </p>
     * 
     * @return A list of subnets in the subnet group.
     */

    public java.util.List<AwsRdsDbSubnetGroupSubnet> getSubnets() {
        return subnets;
    }

    /**
     * <p>
     * A list of subnets in the subnet group.
     * </p>
     * 
     * @param subnets
     *        A list of subnets in the subnet group.
     */

    public void setSubnets(java.util.Collection<AwsRdsDbSubnetGroupSubnet> subnets) {
        if (subnets == null) {
            this.subnets = null;
            return;
        }

        this.subnets = new java.util.ArrayList<AwsRdsDbSubnetGroupSubnet>(subnets);
    }

    /**
     * <p>
     * A list of subnets in the subnet group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnets(java.util.Collection)} or {@link #withSubnets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param subnets
     *        A list of subnets in the subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSubnetGroup withSubnets(AwsRdsDbSubnetGroupSubnet... subnets) {
        if (this.subnets == null) {
            setSubnets(new java.util.ArrayList<AwsRdsDbSubnetGroupSubnet>(subnets.length));
        }
        for (AwsRdsDbSubnetGroupSubnet ele : subnets) {
            this.subnets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of subnets in the subnet group.
     * </p>
     * 
     * @param subnets
     *        A list of subnets in the subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSubnetGroup withSubnets(java.util.Collection<AwsRdsDbSubnetGroupSubnet> subnets) {
        setSubnets(subnets);
        return this;
    }

    /**
     * <p>
     * The ARN of the subnet group.
     * </p>
     * 
     * @param dbSubnetGroupArn
     *        The ARN of the subnet group.
     */

    public void setDbSubnetGroupArn(String dbSubnetGroupArn) {
        this.dbSubnetGroupArn = dbSubnetGroupArn;
    }

    /**
     * <p>
     * The ARN of the subnet group.
     * </p>
     * 
     * @return The ARN of the subnet group.
     */

    public String getDbSubnetGroupArn() {
        return this.dbSubnetGroupArn;
    }

    /**
     * <p>
     * The ARN of the subnet group.
     * </p>
     * 
     * @param dbSubnetGroupArn
     *        The ARN of the subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSubnetGroup withDbSubnetGroupArn(String dbSubnetGroupArn) {
        setDbSubnetGroupArn(dbSubnetGroupArn);
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
        if (getDbSubnetGroupName() != null)
            sb.append("DbSubnetGroupName: ").append(getDbSubnetGroupName()).append(",");
        if (getDbSubnetGroupDescription() != null)
            sb.append("DbSubnetGroupDescription: ").append(getDbSubnetGroupDescription()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getSubnetGroupStatus() != null)
            sb.append("SubnetGroupStatus: ").append(getSubnetGroupStatus()).append(",");
        if (getSubnets() != null)
            sb.append("Subnets: ").append(getSubnets()).append(",");
        if (getDbSubnetGroupArn() != null)
            sb.append("DbSubnetGroupArn: ").append(getDbSubnetGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsRdsDbSubnetGroup == false)
            return false;
        AwsRdsDbSubnetGroup other = (AwsRdsDbSubnetGroup) obj;
        if (other.getDbSubnetGroupName() == null ^ this.getDbSubnetGroupName() == null)
            return false;
        if (other.getDbSubnetGroupName() != null && other.getDbSubnetGroupName().equals(this.getDbSubnetGroupName()) == false)
            return false;
        if (other.getDbSubnetGroupDescription() == null ^ this.getDbSubnetGroupDescription() == null)
            return false;
        if (other.getDbSubnetGroupDescription() != null && other.getDbSubnetGroupDescription().equals(this.getDbSubnetGroupDescription()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getSubnetGroupStatus() == null ^ this.getSubnetGroupStatus() == null)
            return false;
        if (other.getSubnetGroupStatus() != null && other.getSubnetGroupStatus().equals(this.getSubnetGroupStatus()) == false)
            return false;
        if (other.getSubnets() == null ^ this.getSubnets() == null)
            return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false)
            return false;
        if (other.getDbSubnetGroupArn() == null ^ this.getDbSubnetGroupArn() == null)
            return false;
        if (other.getDbSubnetGroupArn() != null && other.getDbSubnetGroupArn().equals(this.getDbSubnetGroupArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDbSubnetGroupName() == null) ? 0 : getDbSubnetGroupName().hashCode());
        hashCode = prime * hashCode + ((getDbSubnetGroupDescription() == null) ? 0 : getDbSubnetGroupDescription().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getSubnetGroupStatus() == null) ? 0 : getSubnetGroupStatus().hashCode());
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode());
        hashCode = prime * hashCode + ((getDbSubnetGroupArn() == null) ? 0 : getDbSubnetGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public AwsRdsDbSubnetGroup clone() {
        try {
            return (AwsRdsDbSubnetGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsRdsDbSubnetGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
