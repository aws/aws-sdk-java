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
 * EC2 security group information for an RDS DB security group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRdsDbSecurityGroupEc2SecurityGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRdsDbSecurityGroupEc2SecurityGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the ID for the EC2 security group.
     * </p>
     */
    private String ec2SecurityGroupId;
    /**
     * <p>
     * Specifies the name of the EC2 security group.
     * </p>
     */
    private String ec2SecurityGroupName;
    /**
     * <p>
     * Provides the Amazon Web Services ID of the owner of the EC2 security group.
     * </p>
     */
    private String ec2SecurityGroupOwnerId;
    /**
     * <p>
     * Provides the status of the EC2 security group.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Specifies the ID for the EC2 security group.
     * </p>
     * 
     * @param ec2SecurityGroupId
     *        Specifies the ID for the EC2 security group.
     */

    public void setEc2SecurityGroupId(String ec2SecurityGroupId) {
        this.ec2SecurityGroupId = ec2SecurityGroupId;
    }

    /**
     * <p>
     * Specifies the ID for the EC2 security group.
     * </p>
     * 
     * @return Specifies the ID for the EC2 security group.
     */

    public String getEc2SecurityGroupId() {
        return this.ec2SecurityGroupId;
    }

    /**
     * <p>
     * Specifies the ID for the EC2 security group.
     * </p>
     * 
     * @param ec2SecurityGroupId
     *        Specifies the ID for the EC2 security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSecurityGroupEc2SecurityGroup withEc2SecurityGroupId(String ec2SecurityGroupId) {
        setEc2SecurityGroupId(ec2SecurityGroupId);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the EC2 security group.
     * </p>
     * 
     * @param ec2SecurityGroupName
     *        Specifies the name of the EC2 security group.
     */

    public void setEc2SecurityGroupName(String ec2SecurityGroupName) {
        this.ec2SecurityGroupName = ec2SecurityGroupName;
    }

    /**
     * <p>
     * Specifies the name of the EC2 security group.
     * </p>
     * 
     * @return Specifies the name of the EC2 security group.
     */

    public String getEc2SecurityGroupName() {
        return this.ec2SecurityGroupName;
    }

    /**
     * <p>
     * Specifies the name of the EC2 security group.
     * </p>
     * 
     * @param ec2SecurityGroupName
     *        Specifies the name of the EC2 security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSecurityGroupEc2SecurityGroup withEc2SecurityGroupName(String ec2SecurityGroupName) {
        setEc2SecurityGroupName(ec2SecurityGroupName);
        return this;
    }

    /**
     * <p>
     * Provides the Amazon Web Services ID of the owner of the EC2 security group.
     * </p>
     * 
     * @param ec2SecurityGroupOwnerId
     *        Provides the Amazon Web Services ID of the owner of the EC2 security group.
     */

    public void setEc2SecurityGroupOwnerId(String ec2SecurityGroupOwnerId) {
        this.ec2SecurityGroupOwnerId = ec2SecurityGroupOwnerId;
    }

    /**
     * <p>
     * Provides the Amazon Web Services ID of the owner of the EC2 security group.
     * </p>
     * 
     * @return Provides the Amazon Web Services ID of the owner of the EC2 security group.
     */

    public String getEc2SecurityGroupOwnerId() {
        return this.ec2SecurityGroupOwnerId;
    }

    /**
     * <p>
     * Provides the Amazon Web Services ID of the owner of the EC2 security group.
     * </p>
     * 
     * @param ec2SecurityGroupOwnerId
     *        Provides the Amazon Web Services ID of the owner of the EC2 security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSecurityGroupEc2SecurityGroup withEc2SecurityGroupOwnerId(String ec2SecurityGroupOwnerId) {
        setEc2SecurityGroupOwnerId(ec2SecurityGroupOwnerId);
        return this;
    }

    /**
     * <p>
     * Provides the status of the EC2 security group.
     * </p>
     * 
     * @param status
     *        Provides the status of the EC2 security group.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Provides the status of the EC2 security group.
     * </p>
     * 
     * @return Provides the status of the EC2 security group.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Provides the status of the EC2 security group.
     * </p>
     * 
     * @param status
     *        Provides the status of the EC2 security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSecurityGroupEc2SecurityGroup withStatus(String status) {
        setStatus(status);
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
        if (getEc2SecurityGroupId() != null)
            sb.append("Ec2SecurityGroupId: ").append(getEc2SecurityGroupId()).append(",");
        if (getEc2SecurityGroupName() != null)
            sb.append("Ec2SecurityGroupName: ").append(getEc2SecurityGroupName()).append(",");
        if (getEc2SecurityGroupOwnerId() != null)
            sb.append("Ec2SecurityGroupOwnerId: ").append(getEc2SecurityGroupOwnerId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsRdsDbSecurityGroupEc2SecurityGroup == false)
            return false;
        AwsRdsDbSecurityGroupEc2SecurityGroup other = (AwsRdsDbSecurityGroupEc2SecurityGroup) obj;
        if (other.getEc2SecurityGroupId() == null ^ this.getEc2SecurityGroupId() == null)
            return false;
        if (other.getEc2SecurityGroupId() != null && other.getEc2SecurityGroupId().equals(this.getEc2SecurityGroupId()) == false)
            return false;
        if (other.getEc2SecurityGroupName() == null ^ this.getEc2SecurityGroupName() == null)
            return false;
        if (other.getEc2SecurityGroupName() != null && other.getEc2SecurityGroupName().equals(this.getEc2SecurityGroupName()) == false)
            return false;
        if (other.getEc2SecurityGroupOwnerId() == null ^ this.getEc2SecurityGroupOwnerId() == null)
            return false;
        if (other.getEc2SecurityGroupOwnerId() != null && other.getEc2SecurityGroupOwnerId().equals(this.getEc2SecurityGroupOwnerId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEc2SecurityGroupId() == null) ? 0 : getEc2SecurityGroupId().hashCode());
        hashCode = prime * hashCode + ((getEc2SecurityGroupName() == null) ? 0 : getEc2SecurityGroupName().hashCode());
        hashCode = prime * hashCode + ((getEc2SecurityGroupOwnerId() == null) ? 0 : getEc2SecurityGroupOwnerId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public AwsRdsDbSecurityGroupEc2SecurityGroup clone() {
        try {
            return (AwsRdsDbSecurityGroupEc2SecurityGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsRdsDbSecurityGroupEc2SecurityGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
