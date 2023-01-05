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
 * Provides details about the placement of an Amazon EC2 instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2LaunchTemplateDataPlacementDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2LaunchTemplateDataPlacementDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The affinity setting for an instance on an EC2 Dedicated Host.
     * </p>
     */
    private String affinity;
    /**
     * <p>
     * The Availability Zone for the instance.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The name of the placement group for the instance.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The ID of the Dedicated Host for the instance.
     * </p>
     */
    private String hostId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the host resource group in which to launch the instances.
     * </p>
     */
    private String hostResourceGroupArn;
    /**
     * <p>
     * The number of the partition the instance should launch in.
     * </p>
     */
    private Integer partitionNumber;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String spreadDomain;
    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of dedicated runs
     * on single-tenant hardware.
     * </p>
     */
    private String tenancy;

    /**
     * <p>
     * The affinity setting for an instance on an EC2 Dedicated Host.
     * </p>
     * 
     * @param affinity
     *        The affinity setting for an instance on an EC2 Dedicated Host.
     */

    public void setAffinity(String affinity) {
        this.affinity = affinity;
    }

    /**
     * <p>
     * The affinity setting for an instance on an EC2 Dedicated Host.
     * </p>
     * 
     * @return The affinity setting for an instance on an EC2 Dedicated Host.
     */

    public String getAffinity() {
        return this.affinity;
    }

    /**
     * <p>
     * The affinity setting for an instance on an EC2 Dedicated Host.
     * </p>
     * 
     * @param affinity
     *        The affinity setting for an instance on an EC2 Dedicated Host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataPlacementDetails withAffinity(String affinity) {
        setAffinity(affinity);
        return this;
    }

    /**
     * <p>
     * The Availability Zone for the instance.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone for the instance.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone for the instance.
     * </p>
     * 
     * @return The Availability Zone for the instance.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone for the instance.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataPlacementDetails withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The name of the placement group for the instance.
     * </p>
     * 
     * @param groupName
     *        The name of the placement group for the instance.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the placement group for the instance.
     * </p>
     * 
     * @return The name of the placement group for the instance.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of the placement group for the instance.
     * </p>
     * 
     * @param groupName
     *        The name of the placement group for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataPlacementDetails withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The ID of the Dedicated Host for the instance.
     * </p>
     * 
     * @param hostId
     *        The ID of the Dedicated Host for the instance.
     */

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    /**
     * <p>
     * The ID of the Dedicated Host for the instance.
     * </p>
     * 
     * @return The ID of the Dedicated Host for the instance.
     */

    public String getHostId() {
        return this.hostId;
    }

    /**
     * <p>
     * The ID of the Dedicated Host for the instance.
     * </p>
     * 
     * @param hostId
     *        The ID of the Dedicated Host for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataPlacementDetails withHostId(String hostId) {
        setHostId(hostId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the host resource group in which to launch the instances.
     * </p>
     * 
     * @param hostResourceGroupArn
     *        The Amazon Resource Name (ARN) of the host resource group in which to launch the instances.
     */

    public void setHostResourceGroupArn(String hostResourceGroupArn) {
        this.hostResourceGroupArn = hostResourceGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the host resource group in which to launch the instances.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the host resource group in which to launch the instances.
     */

    public String getHostResourceGroupArn() {
        return this.hostResourceGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the host resource group in which to launch the instances.
     * </p>
     * 
     * @param hostResourceGroupArn
     *        The Amazon Resource Name (ARN) of the host resource group in which to launch the instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataPlacementDetails withHostResourceGroupArn(String hostResourceGroupArn) {
        setHostResourceGroupArn(hostResourceGroupArn);
        return this;
    }

    /**
     * <p>
     * The number of the partition the instance should launch in.
     * </p>
     * 
     * @param partitionNumber
     *        The number of the partition the instance should launch in.
     */

    public void setPartitionNumber(Integer partitionNumber) {
        this.partitionNumber = partitionNumber;
    }

    /**
     * <p>
     * The number of the partition the instance should launch in.
     * </p>
     * 
     * @return The number of the partition the instance should launch in.
     */

    public Integer getPartitionNumber() {
        return this.partitionNumber;
    }

    /**
     * <p>
     * The number of the partition the instance should launch in.
     * </p>
     * 
     * @param partitionNumber
     *        The number of the partition the instance should launch in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataPlacementDetails withPartitionNumber(Integer partitionNumber) {
        setPartitionNumber(partitionNumber);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param spreadDomain
     *        Reserved for future use.
     */

    public void setSpreadDomain(String spreadDomain) {
        this.spreadDomain = spreadDomain;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getSpreadDomain() {
        return this.spreadDomain;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param spreadDomain
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataPlacementDetails withSpreadDomain(String spreadDomain) {
        setSpreadDomain(spreadDomain);
        return this;
    }

    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of dedicated runs
     * on single-tenant hardware.
     * </p>
     * 
     * @param tenancy
     *        The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of dedicated
     *        runs on single-tenant hardware.
     */

    public void setTenancy(String tenancy) {
        this.tenancy = tenancy;
    }

    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of dedicated runs
     * on single-tenant hardware.
     * </p>
     * 
     * @return The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of
     *         dedicated runs on single-tenant hardware.
     */

    public String getTenancy() {
        return this.tenancy;
    }

    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of dedicated runs
     * on single-tenant hardware.
     * </p>
     * 
     * @param tenancy
     *        The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of dedicated
     *        runs on single-tenant hardware.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataPlacementDetails withTenancy(String tenancy) {
        setTenancy(tenancy);
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
        if (getAffinity() != null)
            sb.append("Affinity: ").append(getAffinity()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getHostId() != null)
            sb.append("HostId: ").append(getHostId()).append(",");
        if (getHostResourceGroupArn() != null)
            sb.append("HostResourceGroupArn: ").append(getHostResourceGroupArn()).append(",");
        if (getPartitionNumber() != null)
            sb.append("PartitionNumber: ").append(getPartitionNumber()).append(",");
        if (getSpreadDomain() != null)
            sb.append("SpreadDomain: ").append(getSpreadDomain()).append(",");
        if (getTenancy() != null)
            sb.append("Tenancy: ").append(getTenancy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2LaunchTemplateDataPlacementDetails == false)
            return false;
        AwsEc2LaunchTemplateDataPlacementDetails other = (AwsEc2LaunchTemplateDataPlacementDetails) obj;
        if (other.getAffinity() == null ^ this.getAffinity() == null)
            return false;
        if (other.getAffinity() != null && other.getAffinity().equals(this.getAffinity()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getHostId() == null ^ this.getHostId() == null)
            return false;
        if (other.getHostId() != null && other.getHostId().equals(this.getHostId()) == false)
            return false;
        if (other.getHostResourceGroupArn() == null ^ this.getHostResourceGroupArn() == null)
            return false;
        if (other.getHostResourceGroupArn() != null && other.getHostResourceGroupArn().equals(this.getHostResourceGroupArn()) == false)
            return false;
        if (other.getPartitionNumber() == null ^ this.getPartitionNumber() == null)
            return false;
        if (other.getPartitionNumber() != null && other.getPartitionNumber().equals(this.getPartitionNumber()) == false)
            return false;
        if (other.getSpreadDomain() == null ^ this.getSpreadDomain() == null)
            return false;
        if (other.getSpreadDomain() != null && other.getSpreadDomain().equals(this.getSpreadDomain()) == false)
            return false;
        if (other.getTenancy() == null ^ this.getTenancy() == null)
            return false;
        if (other.getTenancy() != null && other.getTenancy().equals(this.getTenancy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAffinity() == null) ? 0 : getAffinity().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getHostId() == null) ? 0 : getHostId().hashCode());
        hashCode = prime * hashCode + ((getHostResourceGroupArn() == null) ? 0 : getHostResourceGroupArn().hashCode());
        hashCode = prime * hashCode + ((getPartitionNumber() == null) ? 0 : getPartitionNumber().hashCode());
        hashCode = prime * hashCode + ((getSpreadDomain() == null) ? 0 : getSpreadDomain().hashCode());
        hashCode = prime * hashCode + ((getTenancy() == null) ? 0 : getTenancy().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2LaunchTemplateDataPlacementDetails clone() {
        try {
            return (AwsEc2LaunchTemplateDataPlacementDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2LaunchTemplateDataPlacementDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
