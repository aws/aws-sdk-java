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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Current resource capacity settings in a specified fleet or location. The location value might refer to a fleet's
 * remote location or its home Region.
 * </p>
 * <p>
 * <b>Related actions</b>
 * </p>
 * <p>
 * <a>DescribeFleetCapacity</a> | <a>DescribeFleetLocationCapacity</a> | <a>UpdateFleetCapacity</a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/FleetCapacity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FleetCapacity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the fleet associated with the location.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions.
     * Format is <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     * </p>
     */
    private String fleetArn;
    /**
     * <p>
     * The EC2 instance type that is used for all instances in a fleet. The instance type determines the computing
     * resources in use, including CPU, memory, storage, and networking capacity. See <a
     * href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a> for detailed descriptions.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The current instance count and capacity settings for the fleet location.
     * </p>
     */
    private EC2InstanceCounts instanceCounts;
    /**
     * <p>
     * The fleet location for the instance count information, expressed as an AWS Region code, such as
     * <code>us-west-2</code>.
     * </p>
     */
    private String location;

    /**
     * <p>
     * A unique identifier for the fleet associated with the location.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet associated with the location.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet associated with the location.
     * </p>
     * 
     * @return A unique identifier for the fleet associated with the location.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet associated with the location.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet associated with the location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetCapacity withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions.
     * Format is <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     * </p>
     * 
     * @param fleetArn
     *        The Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to a
     *        GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions. Format is
     *        <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     */

    public void setFleetArn(String fleetArn) {
        this.fleetArn = fleetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions.
     * Format is <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (<a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to a
     *         GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions. Format is
     *         <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     */

    public String getFleetArn() {
        return this.fleetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions.
     * Format is <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     * </p>
     * 
     * @param fleetArn
     *        The Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to a
     *        GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions. Format is
     *        <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetCapacity withFleetArn(String fleetArn) {
        setFleetArn(fleetArn);
        return this;
    }

    /**
     * <p>
     * The EC2 instance type that is used for all instances in a fleet. The instance type determines the computing
     * resources in use, including CPU, memory, storage, and networking capacity. See <a
     * href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a> for detailed descriptions.
     * </p>
     * 
     * @param instanceType
     *        The EC2 instance type that is used for all instances in a fleet. The instance type determines the
     *        computing resources in use, including CPU, memory, storage, and networking capacity. See <a
     *        href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a> for detailed descriptions.
     * @see EC2InstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The EC2 instance type that is used for all instances in a fleet. The instance type determines the computing
     * resources in use, including CPU, memory, storage, and networking capacity. See <a
     * href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a> for detailed descriptions.
     * </p>
     * 
     * @return The EC2 instance type that is used for all instances in a fleet. The instance type determines the
     *         computing resources in use, including CPU, memory, storage, and networking capacity. See <a
     *         href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a> for detailed descriptions.
     * @see EC2InstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The EC2 instance type that is used for all instances in a fleet. The instance type determines the computing
     * resources in use, including CPU, memory, storage, and networking capacity. See <a
     * href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a> for detailed descriptions.
     * </p>
     * 
     * @param instanceType
     *        The EC2 instance type that is used for all instances in a fleet. The instance type determines the
     *        computing resources in use, including CPU, memory, storage, and networking capacity. See <a
     *        href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a> for detailed descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EC2InstanceType
     */

    public FleetCapacity withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The EC2 instance type that is used for all instances in a fleet. The instance type determines the computing
     * resources in use, including CPU, memory, storage, and networking capacity. See <a
     * href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a> for detailed descriptions.
     * </p>
     * 
     * @param instanceType
     *        The EC2 instance type that is used for all instances in a fleet. The instance type determines the
     *        computing resources in use, including CPU, memory, storage, and networking capacity. See <a
     *        href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a> for detailed descriptions.
     * @see EC2InstanceType
     */

    public void setInstanceType(EC2InstanceType instanceType) {
        withInstanceType(instanceType);
    }

    /**
     * <p>
     * The EC2 instance type that is used for all instances in a fleet. The instance type determines the computing
     * resources in use, including CPU, memory, storage, and networking capacity. See <a
     * href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a> for detailed descriptions.
     * </p>
     * 
     * @param instanceType
     *        The EC2 instance type that is used for all instances in a fleet. The instance type determines the
     *        computing resources in use, including CPU, memory, storage, and networking capacity. See <a
     *        href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a> for detailed descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EC2InstanceType
     */

    public FleetCapacity withInstanceType(EC2InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The current instance count and capacity settings for the fleet location.
     * </p>
     * 
     * @param instanceCounts
     *        The current instance count and capacity settings for the fleet location.
     */

    public void setInstanceCounts(EC2InstanceCounts instanceCounts) {
        this.instanceCounts = instanceCounts;
    }

    /**
     * <p>
     * The current instance count and capacity settings for the fleet location.
     * </p>
     * 
     * @return The current instance count and capacity settings for the fleet location.
     */

    public EC2InstanceCounts getInstanceCounts() {
        return this.instanceCounts;
    }

    /**
     * <p>
     * The current instance count and capacity settings for the fleet location.
     * </p>
     * 
     * @param instanceCounts
     *        The current instance count and capacity settings for the fleet location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetCapacity withInstanceCounts(EC2InstanceCounts instanceCounts) {
        setInstanceCounts(instanceCounts);
        return this;
    }

    /**
     * <p>
     * The fleet location for the instance count information, expressed as an AWS Region code, such as
     * <code>us-west-2</code>.
     * </p>
     * 
     * @param location
     *        The fleet location for the instance count information, expressed as an AWS Region code, such as
     *        <code>us-west-2</code>.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The fleet location for the instance count information, expressed as an AWS Region code, such as
     * <code>us-west-2</code>.
     * </p>
     * 
     * @return The fleet location for the instance count information, expressed as an AWS Region code, such as
     *         <code>us-west-2</code>.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The fleet location for the instance count information, expressed as an AWS Region code, such as
     * <code>us-west-2</code>.
     * </p>
     * 
     * @param location
     *        The fleet location for the instance count information, expressed as an AWS Region code, such as
     *        <code>us-west-2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetCapacity withLocation(String location) {
        setLocation(location);
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
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
        if (getFleetArn() != null)
            sb.append("FleetArn: ").append(getFleetArn()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getInstanceCounts() != null)
            sb.append("InstanceCounts: ").append(getInstanceCounts()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FleetCapacity == false)
            return false;
        FleetCapacity other = (FleetCapacity) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getFleetArn() == null ^ this.getFleetArn() == null)
            return false;
        if (other.getFleetArn() != null && other.getFleetArn().equals(this.getFleetArn()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getInstanceCounts() == null ^ this.getInstanceCounts() == null)
            return false;
        if (other.getInstanceCounts() != null && other.getInstanceCounts().equals(this.getInstanceCounts()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getFleetArn() == null) ? 0 : getFleetArn().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getInstanceCounts() == null) ? 0 : getInstanceCounts().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public FleetCapacity clone() {
        try {
            return (FleetCapacity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.FleetCapacityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
