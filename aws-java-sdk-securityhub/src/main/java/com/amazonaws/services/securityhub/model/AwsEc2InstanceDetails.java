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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of an AWS EC2 instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2InstanceDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2InstanceDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The instance type of the instance.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The Amazon Machine Image (AMI) ID of the instance.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * The IPv4 addresses associated with the instance.
     * </p>
     */
    private java.util.List<String> ipV4Addresses;
    /**
     * <p>
     * The IPv6 addresses associated with the instance.
     * </p>
     */
    private java.util.List<String> ipV6Addresses;
    /**
     * <p>
     * The key name associated with the instance.
     * </p>
     */
    private String keyName;
    /**
     * <p>
     * The IAM profile ARN of the instance.
     * </p>
     */
    private String iamInstanceProfileArn;
    /**
     * <p>
     * The identifier of the VPC in which the instance was launched.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The identifier of the subnet in which the instance was launched.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The date/time the instance was launched.
     * </p>
     */
    private String launchedAt;

    /**
     * <p>
     * The instance type of the instance.
     * </p>
     * 
     * @param type
     *        The instance type of the instance.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The instance type of the instance.
     * </p>
     * 
     * @return The instance type of the instance.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The instance type of the instance.
     * </p>
     * 
     * @param type
     *        The instance type of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2InstanceDetails withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The Amazon Machine Image (AMI) ID of the instance.
     * </p>
     * 
     * @param imageId
     *        The Amazon Machine Image (AMI) ID of the instance.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The Amazon Machine Image (AMI) ID of the instance.
     * </p>
     * 
     * @return The Amazon Machine Image (AMI) ID of the instance.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The Amazon Machine Image (AMI) ID of the instance.
     * </p>
     * 
     * @param imageId
     *        The Amazon Machine Image (AMI) ID of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2InstanceDetails withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * The IPv4 addresses associated with the instance.
     * </p>
     * 
     * @return The IPv4 addresses associated with the instance.
     */

    public java.util.List<String> getIpV4Addresses() {
        return ipV4Addresses;
    }

    /**
     * <p>
     * The IPv4 addresses associated with the instance.
     * </p>
     * 
     * @param ipV4Addresses
     *        The IPv4 addresses associated with the instance.
     */

    public void setIpV4Addresses(java.util.Collection<String> ipV4Addresses) {
        if (ipV4Addresses == null) {
            this.ipV4Addresses = null;
            return;
        }

        this.ipV4Addresses = new java.util.ArrayList<String>(ipV4Addresses);
    }

    /**
     * <p>
     * The IPv4 addresses associated with the instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpV4Addresses(java.util.Collection)} or {@link #withIpV4Addresses(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param ipV4Addresses
     *        The IPv4 addresses associated with the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2InstanceDetails withIpV4Addresses(String... ipV4Addresses) {
        if (this.ipV4Addresses == null) {
            setIpV4Addresses(new java.util.ArrayList<String>(ipV4Addresses.length));
        }
        for (String ele : ipV4Addresses) {
            this.ipV4Addresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IPv4 addresses associated with the instance.
     * </p>
     * 
     * @param ipV4Addresses
     *        The IPv4 addresses associated with the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2InstanceDetails withIpV4Addresses(java.util.Collection<String> ipV4Addresses) {
        setIpV4Addresses(ipV4Addresses);
        return this;
    }

    /**
     * <p>
     * The IPv6 addresses associated with the instance.
     * </p>
     * 
     * @return The IPv6 addresses associated with the instance.
     */

    public java.util.List<String> getIpV6Addresses() {
        return ipV6Addresses;
    }

    /**
     * <p>
     * The IPv6 addresses associated with the instance.
     * </p>
     * 
     * @param ipV6Addresses
     *        The IPv6 addresses associated with the instance.
     */

    public void setIpV6Addresses(java.util.Collection<String> ipV6Addresses) {
        if (ipV6Addresses == null) {
            this.ipV6Addresses = null;
            return;
        }

        this.ipV6Addresses = new java.util.ArrayList<String>(ipV6Addresses);
    }

    /**
     * <p>
     * The IPv6 addresses associated with the instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpV6Addresses(java.util.Collection)} or {@link #withIpV6Addresses(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param ipV6Addresses
     *        The IPv6 addresses associated with the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2InstanceDetails withIpV6Addresses(String... ipV6Addresses) {
        if (this.ipV6Addresses == null) {
            setIpV6Addresses(new java.util.ArrayList<String>(ipV6Addresses.length));
        }
        for (String ele : ipV6Addresses) {
            this.ipV6Addresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IPv6 addresses associated with the instance.
     * </p>
     * 
     * @param ipV6Addresses
     *        The IPv6 addresses associated with the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2InstanceDetails withIpV6Addresses(java.util.Collection<String> ipV6Addresses) {
        setIpV6Addresses(ipV6Addresses);
        return this;
    }

    /**
     * <p>
     * The key name associated with the instance.
     * </p>
     * 
     * @param keyName
     *        The key name associated with the instance.
     */

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * The key name associated with the instance.
     * </p>
     * 
     * @return The key name associated with the instance.
     */

    public String getKeyName() {
        return this.keyName;
    }

    /**
     * <p>
     * The key name associated with the instance.
     * </p>
     * 
     * @param keyName
     *        The key name associated with the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2InstanceDetails withKeyName(String keyName) {
        setKeyName(keyName);
        return this;
    }

    /**
     * <p>
     * The IAM profile ARN of the instance.
     * </p>
     * 
     * @param iamInstanceProfileArn
     *        The IAM profile ARN of the instance.
     */

    public void setIamInstanceProfileArn(String iamInstanceProfileArn) {
        this.iamInstanceProfileArn = iamInstanceProfileArn;
    }

    /**
     * <p>
     * The IAM profile ARN of the instance.
     * </p>
     * 
     * @return The IAM profile ARN of the instance.
     */

    public String getIamInstanceProfileArn() {
        return this.iamInstanceProfileArn;
    }

    /**
     * <p>
     * The IAM profile ARN of the instance.
     * </p>
     * 
     * @param iamInstanceProfileArn
     *        The IAM profile ARN of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2InstanceDetails withIamInstanceProfileArn(String iamInstanceProfileArn) {
        setIamInstanceProfileArn(iamInstanceProfileArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the VPC in which the instance was launched.
     * </p>
     * 
     * @param vpcId
     *        The identifier of the VPC in which the instance was launched.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The identifier of the VPC in which the instance was launched.
     * </p>
     * 
     * @return The identifier of the VPC in which the instance was launched.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The identifier of the VPC in which the instance was launched.
     * </p>
     * 
     * @param vpcId
     *        The identifier of the VPC in which the instance was launched.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2InstanceDetails withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The identifier of the subnet in which the instance was launched.
     * </p>
     * 
     * @param subnetId
     *        The identifier of the subnet in which the instance was launched.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The identifier of the subnet in which the instance was launched.
     * </p>
     * 
     * @return The identifier of the subnet in which the instance was launched.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The identifier of the subnet in which the instance was launched.
     * </p>
     * 
     * @param subnetId
     *        The identifier of the subnet in which the instance was launched.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2InstanceDetails withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The date/time the instance was launched.
     * </p>
     * 
     * @param launchedAt
     *        The date/time the instance was launched.
     */

    public void setLaunchedAt(String launchedAt) {
        this.launchedAt = launchedAt;
    }

    /**
     * <p>
     * The date/time the instance was launched.
     * </p>
     * 
     * @return The date/time the instance was launched.
     */

    public String getLaunchedAt() {
        return this.launchedAt;
    }

    /**
     * <p>
     * The date/time the instance was launched.
     * </p>
     * 
     * @param launchedAt
     *        The date/time the instance was launched.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2InstanceDetails withLaunchedAt(String launchedAt) {
        setLaunchedAt(launchedAt);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId()).append(",");
        if (getIpV4Addresses() != null)
            sb.append("IpV4Addresses: ").append(getIpV4Addresses()).append(",");
        if (getIpV6Addresses() != null)
            sb.append("IpV6Addresses: ").append(getIpV6Addresses()).append(",");
        if (getKeyName() != null)
            sb.append("KeyName: ").append(getKeyName()).append(",");
        if (getIamInstanceProfileArn() != null)
            sb.append("IamInstanceProfileArn: ").append(getIamInstanceProfileArn()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getLaunchedAt() != null)
            sb.append("LaunchedAt: ").append(getLaunchedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2InstanceDetails == false)
            return false;
        AwsEc2InstanceDetails other = (AwsEc2InstanceDetails) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getIpV4Addresses() == null ^ this.getIpV4Addresses() == null)
            return false;
        if (other.getIpV4Addresses() != null && other.getIpV4Addresses().equals(this.getIpV4Addresses()) == false)
            return false;
        if (other.getIpV6Addresses() == null ^ this.getIpV6Addresses() == null)
            return false;
        if (other.getIpV6Addresses() != null && other.getIpV6Addresses().equals(this.getIpV6Addresses()) == false)
            return false;
        if (other.getKeyName() == null ^ this.getKeyName() == null)
            return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false)
            return false;
        if (other.getIamInstanceProfileArn() == null ^ this.getIamInstanceProfileArn() == null)
            return false;
        if (other.getIamInstanceProfileArn() != null && other.getIamInstanceProfileArn().equals(this.getIamInstanceProfileArn()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getLaunchedAt() == null ^ this.getLaunchedAt() == null)
            return false;
        if (other.getLaunchedAt() != null && other.getLaunchedAt().equals(this.getLaunchedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getIpV4Addresses() == null) ? 0 : getIpV4Addresses().hashCode());
        hashCode = prime * hashCode + ((getIpV6Addresses() == null) ? 0 : getIpV6Addresses().hashCode());
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime * hashCode + ((getIamInstanceProfileArn() == null) ? 0 : getIamInstanceProfileArn().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getLaunchedAt() == null) ? 0 : getLaunchedAt().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2InstanceDetails clone() {
        try {
            return (AwsEc2InstanceDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2InstanceDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
