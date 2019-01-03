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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents an EC2 instance provisioned as part of cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/Instance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Instance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the instance in Amazon EMR.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The unique identifier of the instance in Amazon EC2.
     * </p>
     */
    private String ec2InstanceId;
    /**
     * <p>
     * The public DNS name of the instance.
     * </p>
     */
    private String publicDnsName;
    /**
     * <p>
     * The public IP address of the instance.
     * </p>
     */
    private String publicIpAddress;
    /**
     * <p>
     * The private DNS name of the instance.
     * </p>
     */
    private String privateDnsName;
    /**
     * <p>
     * The private IP address of the instance.
     * </p>
     */
    private String privateIpAddress;
    /**
     * <p>
     * The current status of the instance.
     * </p>
     */
    private InstanceStatus status;
    /**
     * <p>
     * The identifier of the instance group to which this instance belongs.
     * </p>
     */
    private String instanceGroupId;
    /**
     * <p>
     * The unique identifier of the instance fleet to which an EC2 instance belongs.
     * </p>
     */
    private String instanceFleetId;
    /**
     * <p>
     * The instance purchasing option. Valid values are <code>ON_DEMAND</code> or <code>SPOT</code>.
     * </p>
     */
    private String market;
    /**
     * <p>
     * The EC2 instance type, for example <code>m3.xlarge</code>.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The list of EBS volumes that are attached to this instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<EbsVolume> ebsVolumes;

    /**
     * <p>
     * The unique identifier for the instance in Amazon EMR.
     * </p>
     * 
     * @param id
     *        The unique identifier for the instance in Amazon EMR.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the instance in Amazon EMR.
     * </p>
     * 
     * @return The unique identifier for the instance in Amazon EMR.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the instance in Amazon EMR.
     * </p>
     * 
     * @param id
     *        The unique identifier for the instance in Amazon EMR.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the instance in Amazon EC2.
     * </p>
     * 
     * @param ec2InstanceId
     *        The unique identifier of the instance in Amazon EC2.
     */

    public void setEc2InstanceId(String ec2InstanceId) {
        this.ec2InstanceId = ec2InstanceId;
    }

    /**
     * <p>
     * The unique identifier of the instance in Amazon EC2.
     * </p>
     * 
     * @return The unique identifier of the instance in Amazon EC2.
     */

    public String getEc2InstanceId() {
        return this.ec2InstanceId;
    }

    /**
     * <p>
     * The unique identifier of the instance in Amazon EC2.
     * </p>
     * 
     * @param ec2InstanceId
     *        The unique identifier of the instance in Amazon EC2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withEc2InstanceId(String ec2InstanceId) {
        setEc2InstanceId(ec2InstanceId);
        return this;
    }

    /**
     * <p>
     * The public DNS name of the instance.
     * </p>
     * 
     * @param publicDnsName
     *        The public DNS name of the instance.
     */

    public void setPublicDnsName(String publicDnsName) {
        this.publicDnsName = publicDnsName;
    }

    /**
     * <p>
     * The public DNS name of the instance.
     * </p>
     * 
     * @return The public DNS name of the instance.
     */

    public String getPublicDnsName() {
        return this.publicDnsName;
    }

    /**
     * <p>
     * The public DNS name of the instance.
     * </p>
     * 
     * @param publicDnsName
     *        The public DNS name of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withPublicDnsName(String publicDnsName) {
        setPublicDnsName(publicDnsName);
        return this;
    }

    /**
     * <p>
     * The public IP address of the instance.
     * </p>
     * 
     * @param publicIpAddress
     *        The public IP address of the instance.
     */

    public void setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
    }

    /**
     * <p>
     * The public IP address of the instance.
     * </p>
     * 
     * @return The public IP address of the instance.
     */

    public String getPublicIpAddress() {
        return this.publicIpAddress;
    }

    /**
     * <p>
     * The public IP address of the instance.
     * </p>
     * 
     * @param publicIpAddress
     *        The public IP address of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withPublicIpAddress(String publicIpAddress) {
        setPublicIpAddress(publicIpAddress);
        return this;
    }

    /**
     * <p>
     * The private DNS name of the instance.
     * </p>
     * 
     * @param privateDnsName
     *        The private DNS name of the instance.
     */

    public void setPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
    }

    /**
     * <p>
     * The private DNS name of the instance.
     * </p>
     * 
     * @return The private DNS name of the instance.
     */

    public String getPrivateDnsName() {
        return this.privateDnsName;
    }

    /**
     * <p>
     * The private DNS name of the instance.
     * </p>
     * 
     * @param privateDnsName
     *        The private DNS name of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withPrivateDnsName(String privateDnsName) {
        setPrivateDnsName(privateDnsName);
        return this;
    }

    /**
     * <p>
     * The private IP address of the instance.
     * </p>
     * 
     * @param privateIpAddress
     *        The private IP address of the instance.
     */

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * <p>
     * The private IP address of the instance.
     * </p>
     * 
     * @return The private IP address of the instance.
     */

    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * <p>
     * The private IP address of the instance.
     * </p>
     * 
     * @param privateIpAddress
     *        The private IP address of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withPrivateIpAddress(String privateIpAddress) {
        setPrivateIpAddress(privateIpAddress);
        return this;
    }

    /**
     * <p>
     * The current status of the instance.
     * </p>
     * 
     * @param status
     *        The current status of the instance.
     */

    public void setStatus(InstanceStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the instance.
     * </p>
     * 
     * @return The current status of the instance.
     */

    public InstanceStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the instance.
     * </p>
     * 
     * @param status
     *        The current status of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withStatus(InstanceStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The identifier of the instance group to which this instance belongs.
     * </p>
     * 
     * @param instanceGroupId
     *        The identifier of the instance group to which this instance belongs.
     */

    public void setInstanceGroupId(String instanceGroupId) {
        this.instanceGroupId = instanceGroupId;
    }

    /**
     * <p>
     * The identifier of the instance group to which this instance belongs.
     * </p>
     * 
     * @return The identifier of the instance group to which this instance belongs.
     */

    public String getInstanceGroupId() {
        return this.instanceGroupId;
    }

    /**
     * <p>
     * The identifier of the instance group to which this instance belongs.
     * </p>
     * 
     * @param instanceGroupId
     *        The identifier of the instance group to which this instance belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withInstanceGroupId(String instanceGroupId) {
        setInstanceGroupId(instanceGroupId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the instance fleet to which an EC2 instance belongs.
     * </p>
     * 
     * @param instanceFleetId
     *        The unique identifier of the instance fleet to which an EC2 instance belongs.
     */

    public void setInstanceFleetId(String instanceFleetId) {
        this.instanceFleetId = instanceFleetId;
    }

    /**
     * <p>
     * The unique identifier of the instance fleet to which an EC2 instance belongs.
     * </p>
     * 
     * @return The unique identifier of the instance fleet to which an EC2 instance belongs.
     */

    public String getInstanceFleetId() {
        return this.instanceFleetId;
    }

    /**
     * <p>
     * The unique identifier of the instance fleet to which an EC2 instance belongs.
     * </p>
     * 
     * @param instanceFleetId
     *        The unique identifier of the instance fleet to which an EC2 instance belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withInstanceFleetId(String instanceFleetId) {
        setInstanceFleetId(instanceFleetId);
        return this;
    }

    /**
     * <p>
     * The instance purchasing option. Valid values are <code>ON_DEMAND</code> or <code>SPOT</code>.
     * </p>
     * 
     * @param market
     *        The instance purchasing option. Valid values are <code>ON_DEMAND</code> or <code>SPOT</code>.
     * @see MarketType
     */

    public void setMarket(String market) {
        this.market = market;
    }

    /**
     * <p>
     * The instance purchasing option. Valid values are <code>ON_DEMAND</code> or <code>SPOT</code>.
     * </p>
     * 
     * @return The instance purchasing option. Valid values are <code>ON_DEMAND</code> or <code>SPOT</code>.
     * @see MarketType
     */

    public String getMarket() {
        return this.market;
    }

    /**
     * <p>
     * The instance purchasing option. Valid values are <code>ON_DEMAND</code> or <code>SPOT</code>.
     * </p>
     * 
     * @param market
     *        The instance purchasing option. Valid values are <code>ON_DEMAND</code> or <code>SPOT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MarketType
     */

    public Instance withMarket(String market) {
        setMarket(market);
        return this;
    }

    /**
     * <p>
     * The instance purchasing option. Valid values are <code>ON_DEMAND</code> or <code>SPOT</code>.
     * </p>
     * 
     * @param market
     *        The instance purchasing option. Valid values are <code>ON_DEMAND</code> or <code>SPOT</code>.
     * @see MarketType
     */

    public void setMarket(MarketType market) {
        withMarket(market);
    }

    /**
     * <p>
     * The instance purchasing option. Valid values are <code>ON_DEMAND</code> or <code>SPOT</code>.
     * </p>
     * 
     * @param market
     *        The instance purchasing option. Valid values are <code>ON_DEMAND</code> or <code>SPOT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MarketType
     */

    public Instance withMarket(MarketType market) {
        this.market = market.toString();
        return this;
    }

    /**
     * <p>
     * The EC2 instance type, for example <code>m3.xlarge</code>.
     * </p>
     * 
     * @param instanceType
     *        The EC2 instance type, for example <code>m3.xlarge</code>.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The EC2 instance type, for example <code>m3.xlarge</code>.
     * </p>
     * 
     * @return The EC2 instance type, for example <code>m3.xlarge</code>.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The EC2 instance type, for example <code>m3.xlarge</code>.
     * </p>
     * 
     * @param instanceType
     *        The EC2 instance type, for example <code>m3.xlarge</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The list of EBS volumes that are attached to this instance.
     * </p>
     * 
     * @return The list of EBS volumes that are attached to this instance.
     */

    public java.util.List<EbsVolume> getEbsVolumes() {
        if (ebsVolumes == null) {
            ebsVolumes = new com.amazonaws.internal.SdkInternalList<EbsVolume>();
        }
        return ebsVolumes;
    }

    /**
     * <p>
     * The list of EBS volumes that are attached to this instance.
     * </p>
     * 
     * @param ebsVolumes
     *        The list of EBS volumes that are attached to this instance.
     */

    public void setEbsVolumes(java.util.Collection<EbsVolume> ebsVolumes) {
        if (ebsVolumes == null) {
            this.ebsVolumes = null;
            return;
        }

        this.ebsVolumes = new com.amazonaws.internal.SdkInternalList<EbsVolume>(ebsVolumes);
    }

    /**
     * <p>
     * The list of EBS volumes that are attached to this instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEbsVolumes(java.util.Collection)} or {@link #withEbsVolumes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ebsVolumes
     *        The list of EBS volumes that are attached to this instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withEbsVolumes(EbsVolume... ebsVolumes) {
        if (this.ebsVolumes == null) {
            setEbsVolumes(new com.amazonaws.internal.SdkInternalList<EbsVolume>(ebsVolumes.length));
        }
        for (EbsVolume ele : ebsVolumes) {
            this.ebsVolumes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of EBS volumes that are attached to this instance.
     * </p>
     * 
     * @param ebsVolumes
     *        The list of EBS volumes that are attached to this instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withEbsVolumes(java.util.Collection<EbsVolume> ebsVolumes) {
        setEbsVolumes(ebsVolumes);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getEc2InstanceId() != null)
            sb.append("Ec2InstanceId: ").append(getEc2InstanceId()).append(",");
        if (getPublicDnsName() != null)
            sb.append("PublicDnsName: ").append(getPublicDnsName()).append(",");
        if (getPublicIpAddress() != null)
            sb.append("PublicIpAddress: ").append(getPublicIpAddress()).append(",");
        if (getPrivateDnsName() != null)
            sb.append("PrivateDnsName: ").append(getPrivateDnsName()).append(",");
        if (getPrivateIpAddress() != null)
            sb.append("PrivateIpAddress: ").append(getPrivateIpAddress()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getInstanceGroupId() != null)
            sb.append("InstanceGroupId: ").append(getInstanceGroupId()).append(",");
        if (getInstanceFleetId() != null)
            sb.append("InstanceFleetId: ").append(getInstanceFleetId()).append(",");
        if (getMarket() != null)
            sb.append("Market: ").append(getMarket()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getEbsVolumes() != null)
            sb.append("EbsVolumes: ").append(getEbsVolumes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Instance == false)
            return false;
        Instance other = (Instance) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getEc2InstanceId() == null ^ this.getEc2InstanceId() == null)
            return false;
        if (other.getEc2InstanceId() != null && other.getEc2InstanceId().equals(this.getEc2InstanceId()) == false)
            return false;
        if (other.getPublicDnsName() == null ^ this.getPublicDnsName() == null)
            return false;
        if (other.getPublicDnsName() != null && other.getPublicDnsName().equals(this.getPublicDnsName()) == false)
            return false;
        if (other.getPublicIpAddress() == null ^ this.getPublicIpAddress() == null)
            return false;
        if (other.getPublicIpAddress() != null && other.getPublicIpAddress().equals(this.getPublicIpAddress()) == false)
            return false;
        if (other.getPrivateDnsName() == null ^ this.getPrivateDnsName() == null)
            return false;
        if (other.getPrivateDnsName() != null && other.getPrivateDnsName().equals(this.getPrivateDnsName()) == false)
            return false;
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null)
            return false;
        if (other.getPrivateIpAddress() != null && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getInstanceGroupId() == null ^ this.getInstanceGroupId() == null)
            return false;
        if (other.getInstanceGroupId() != null && other.getInstanceGroupId().equals(this.getInstanceGroupId()) == false)
            return false;
        if (other.getInstanceFleetId() == null ^ this.getInstanceFleetId() == null)
            return false;
        if (other.getInstanceFleetId() != null && other.getInstanceFleetId().equals(this.getInstanceFleetId()) == false)
            return false;
        if (other.getMarket() == null ^ this.getMarket() == null)
            return false;
        if (other.getMarket() != null && other.getMarket().equals(this.getMarket()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getEbsVolumes() == null ^ this.getEbsVolumes() == null)
            return false;
        if (other.getEbsVolumes() != null && other.getEbsVolumes().equals(this.getEbsVolumes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getEc2InstanceId() == null) ? 0 : getEc2InstanceId().hashCode());
        hashCode = prime * hashCode + ((getPublicDnsName() == null) ? 0 : getPublicDnsName().hashCode());
        hashCode = prime * hashCode + ((getPublicIpAddress() == null) ? 0 : getPublicIpAddress().hashCode());
        hashCode = prime * hashCode + ((getPrivateDnsName() == null) ? 0 : getPrivateDnsName().hashCode());
        hashCode = prime * hashCode + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getInstanceGroupId() == null) ? 0 : getInstanceGroupId().hashCode());
        hashCode = prime * hashCode + ((getInstanceFleetId() == null) ? 0 : getInstanceFleetId().hashCode());
        hashCode = prime * hashCode + ((getMarket() == null) ? 0 : getMarket().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getEbsVolumes() == null) ? 0 : getEbsVolumes().hashCode());
        return hashCode;
    }

    @Override
    public Instance clone() {
        try {
            return (Instance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.InstanceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
