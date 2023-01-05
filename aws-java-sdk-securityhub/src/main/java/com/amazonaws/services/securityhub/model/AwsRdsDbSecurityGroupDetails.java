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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about an Amazon RDS DB security group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRdsDbSecurityGroupDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRdsDbSecurityGroupDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN for the DB security group.
     * </p>
     */
    private String dbSecurityGroupArn;
    /**
     * <p>
     * Provides the description of the DB security group.
     * </p>
     */
    private String dbSecurityGroupDescription;
    /**
     * <p>
     * Specifies the name of the DB security group.
     * </p>
     */
    private String dbSecurityGroupName;
    /**
     * <p>
     * Contains a list of EC2 security groups.
     * </p>
     */
    private java.util.List<AwsRdsDbSecurityGroupEc2SecurityGroup> ec2SecurityGroups;
    /**
     * <p>
     * Contains a list of IP ranges.
     * </p>
     */
    private java.util.List<AwsRdsDbSecurityGroupIpRange> ipRanges;
    /**
     * <p>
     * Provides the Amazon Web Services ID of the owner of a specific DB security group.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * Provides VPC ID associated with the DB security group.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The ARN for the DB security group.
     * </p>
     * 
     * @param dbSecurityGroupArn
     *        The ARN for the DB security group.
     */

    public void setDbSecurityGroupArn(String dbSecurityGroupArn) {
        this.dbSecurityGroupArn = dbSecurityGroupArn;
    }

    /**
     * <p>
     * The ARN for the DB security group.
     * </p>
     * 
     * @return The ARN for the DB security group.
     */

    public String getDbSecurityGroupArn() {
        return this.dbSecurityGroupArn;
    }

    /**
     * <p>
     * The ARN for the DB security group.
     * </p>
     * 
     * @param dbSecurityGroupArn
     *        The ARN for the DB security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSecurityGroupDetails withDbSecurityGroupArn(String dbSecurityGroupArn) {
        setDbSecurityGroupArn(dbSecurityGroupArn);
        return this;
    }

    /**
     * <p>
     * Provides the description of the DB security group.
     * </p>
     * 
     * @param dbSecurityGroupDescription
     *        Provides the description of the DB security group.
     */

    public void setDbSecurityGroupDescription(String dbSecurityGroupDescription) {
        this.dbSecurityGroupDescription = dbSecurityGroupDescription;
    }

    /**
     * <p>
     * Provides the description of the DB security group.
     * </p>
     * 
     * @return Provides the description of the DB security group.
     */

    public String getDbSecurityGroupDescription() {
        return this.dbSecurityGroupDescription;
    }

    /**
     * <p>
     * Provides the description of the DB security group.
     * </p>
     * 
     * @param dbSecurityGroupDescription
     *        Provides the description of the DB security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSecurityGroupDetails withDbSecurityGroupDescription(String dbSecurityGroupDescription) {
        setDbSecurityGroupDescription(dbSecurityGroupDescription);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the DB security group.
     * </p>
     * 
     * @param dbSecurityGroupName
     *        Specifies the name of the DB security group.
     */

    public void setDbSecurityGroupName(String dbSecurityGroupName) {
        this.dbSecurityGroupName = dbSecurityGroupName;
    }

    /**
     * <p>
     * Specifies the name of the DB security group.
     * </p>
     * 
     * @return Specifies the name of the DB security group.
     */

    public String getDbSecurityGroupName() {
        return this.dbSecurityGroupName;
    }

    /**
     * <p>
     * Specifies the name of the DB security group.
     * </p>
     * 
     * @param dbSecurityGroupName
     *        Specifies the name of the DB security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSecurityGroupDetails withDbSecurityGroupName(String dbSecurityGroupName) {
        setDbSecurityGroupName(dbSecurityGroupName);
        return this;
    }

    /**
     * <p>
     * Contains a list of EC2 security groups.
     * </p>
     * 
     * @return Contains a list of EC2 security groups.
     */

    public java.util.List<AwsRdsDbSecurityGroupEc2SecurityGroup> getEc2SecurityGroups() {
        return ec2SecurityGroups;
    }

    /**
     * <p>
     * Contains a list of EC2 security groups.
     * </p>
     * 
     * @param ec2SecurityGroups
     *        Contains a list of EC2 security groups.
     */

    public void setEc2SecurityGroups(java.util.Collection<AwsRdsDbSecurityGroupEc2SecurityGroup> ec2SecurityGroups) {
        if (ec2SecurityGroups == null) {
            this.ec2SecurityGroups = null;
            return;
        }

        this.ec2SecurityGroups = new java.util.ArrayList<AwsRdsDbSecurityGroupEc2SecurityGroup>(ec2SecurityGroups);
    }

    /**
     * <p>
     * Contains a list of EC2 security groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEc2SecurityGroups(java.util.Collection)} or {@link #withEc2SecurityGroups(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param ec2SecurityGroups
     *        Contains a list of EC2 security groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSecurityGroupDetails withEc2SecurityGroups(AwsRdsDbSecurityGroupEc2SecurityGroup... ec2SecurityGroups) {
        if (this.ec2SecurityGroups == null) {
            setEc2SecurityGroups(new java.util.ArrayList<AwsRdsDbSecurityGroupEc2SecurityGroup>(ec2SecurityGroups.length));
        }
        for (AwsRdsDbSecurityGroupEc2SecurityGroup ele : ec2SecurityGroups) {
            this.ec2SecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains a list of EC2 security groups.
     * </p>
     * 
     * @param ec2SecurityGroups
     *        Contains a list of EC2 security groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSecurityGroupDetails withEc2SecurityGroups(java.util.Collection<AwsRdsDbSecurityGroupEc2SecurityGroup> ec2SecurityGroups) {
        setEc2SecurityGroups(ec2SecurityGroups);
        return this;
    }

    /**
     * <p>
     * Contains a list of IP ranges.
     * </p>
     * 
     * @return Contains a list of IP ranges.
     */

    public java.util.List<AwsRdsDbSecurityGroupIpRange> getIpRanges() {
        return ipRanges;
    }

    /**
     * <p>
     * Contains a list of IP ranges.
     * </p>
     * 
     * @param ipRanges
     *        Contains a list of IP ranges.
     */

    public void setIpRanges(java.util.Collection<AwsRdsDbSecurityGroupIpRange> ipRanges) {
        if (ipRanges == null) {
            this.ipRanges = null;
            return;
        }

        this.ipRanges = new java.util.ArrayList<AwsRdsDbSecurityGroupIpRange>(ipRanges);
    }

    /**
     * <p>
     * Contains a list of IP ranges.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpRanges(java.util.Collection)} or {@link #withIpRanges(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param ipRanges
     *        Contains a list of IP ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSecurityGroupDetails withIpRanges(AwsRdsDbSecurityGroupIpRange... ipRanges) {
        if (this.ipRanges == null) {
            setIpRanges(new java.util.ArrayList<AwsRdsDbSecurityGroupIpRange>(ipRanges.length));
        }
        for (AwsRdsDbSecurityGroupIpRange ele : ipRanges) {
            this.ipRanges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains a list of IP ranges.
     * </p>
     * 
     * @param ipRanges
     *        Contains a list of IP ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSecurityGroupDetails withIpRanges(java.util.Collection<AwsRdsDbSecurityGroupIpRange> ipRanges) {
        setIpRanges(ipRanges);
        return this;
    }

    /**
     * <p>
     * Provides the Amazon Web Services ID of the owner of a specific DB security group.
     * </p>
     * 
     * @param ownerId
     *        Provides the Amazon Web Services ID of the owner of a specific DB security group.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * Provides the Amazon Web Services ID of the owner of a specific DB security group.
     * </p>
     * 
     * @return Provides the Amazon Web Services ID of the owner of a specific DB security group.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * Provides the Amazon Web Services ID of the owner of a specific DB security group.
     * </p>
     * 
     * @param ownerId
     *        Provides the Amazon Web Services ID of the owner of a specific DB security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSecurityGroupDetails withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * Provides VPC ID associated with the DB security group.
     * </p>
     * 
     * @param vpcId
     *        Provides VPC ID associated with the DB security group.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * Provides VPC ID associated with the DB security group.
     * </p>
     * 
     * @return Provides VPC ID associated with the DB security group.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * Provides VPC ID associated with the DB security group.
     * </p>
     * 
     * @param vpcId
     *        Provides VPC ID associated with the DB security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSecurityGroupDetails withVpcId(String vpcId) {
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
        if (getDbSecurityGroupArn() != null)
            sb.append("DbSecurityGroupArn: ").append(getDbSecurityGroupArn()).append(",");
        if (getDbSecurityGroupDescription() != null)
            sb.append("DbSecurityGroupDescription: ").append(getDbSecurityGroupDescription()).append(",");
        if (getDbSecurityGroupName() != null)
            sb.append("DbSecurityGroupName: ").append(getDbSecurityGroupName()).append(",");
        if (getEc2SecurityGroups() != null)
            sb.append("Ec2SecurityGroups: ").append(getEc2SecurityGroups()).append(",");
        if (getIpRanges() != null)
            sb.append("IpRanges: ").append(getIpRanges()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
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

        if (obj instanceof AwsRdsDbSecurityGroupDetails == false)
            return false;
        AwsRdsDbSecurityGroupDetails other = (AwsRdsDbSecurityGroupDetails) obj;
        if (other.getDbSecurityGroupArn() == null ^ this.getDbSecurityGroupArn() == null)
            return false;
        if (other.getDbSecurityGroupArn() != null && other.getDbSecurityGroupArn().equals(this.getDbSecurityGroupArn()) == false)
            return false;
        if (other.getDbSecurityGroupDescription() == null ^ this.getDbSecurityGroupDescription() == null)
            return false;
        if (other.getDbSecurityGroupDescription() != null && other.getDbSecurityGroupDescription().equals(this.getDbSecurityGroupDescription()) == false)
            return false;
        if (other.getDbSecurityGroupName() == null ^ this.getDbSecurityGroupName() == null)
            return false;
        if (other.getDbSecurityGroupName() != null && other.getDbSecurityGroupName().equals(this.getDbSecurityGroupName()) == false)
            return false;
        if (other.getEc2SecurityGroups() == null ^ this.getEc2SecurityGroups() == null)
            return false;
        if (other.getEc2SecurityGroups() != null && other.getEc2SecurityGroups().equals(this.getEc2SecurityGroups()) == false)
            return false;
        if (other.getIpRanges() == null ^ this.getIpRanges() == null)
            return false;
        if (other.getIpRanges() != null && other.getIpRanges().equals(this.getIpRanges()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
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

        hashCode = prime * hashCode + ((getDbSecurityGroupArn() == null) ? 0 : getDbSecurityGroupArn().hashCode());
        hashCode = prime * hashCode + ((getDbSecurityGroupDescription() == null) ? 0 : getDbSecurityGroupDescription().hashCode());
        hashCode = prime * hashCode + ((getDbSecurityGroupName() == null) ? 0 : getDbSecurityGroupName().hashCode());
        hashCode = prime * hashCode + ((getEc2SecurityGroups() == null) ? 0 : getEc2SecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getIpRanges() == null) ? 0 : getIpRanges().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public AwsRdsDbSecurityGroupDetails clone() {
        try {
            return (AwsRdsDbSecurityGroupDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsRdsDbSecurityGroupDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
