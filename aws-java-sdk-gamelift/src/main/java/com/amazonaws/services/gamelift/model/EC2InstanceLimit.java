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
 * The GameLift service limits for an EC2 instance type and current utilization. GameLift allows AWS accounts a maximum
 * number of instances, per instance type, per AWS Region or location, for use with GameLift. You can request an limit
 * increase for your account by using the <b>Service limits</b> page in the GameLift console.
 * </p>
 * <p>
 * <b>Related actions</b>
 * </p>
 * <p>
 * <a>DescribeEC2InstanceLimits</a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/EC2InstanceLimit" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EC2InstanceLimit implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of an EC2 instance type. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance
     * Types</a> for detailed descriptions.
     * </p>
     */
    private String eC2InstanceType;
    /**
     * <p>
     * The number of instances for the specified type and location that are currently being used by the AWS account.
     * </p>
     */
    private Integer currentInstances;
    /**
     * <p>
     * The number of instances that is allowed for the specified instance type and location.
     * </p>
     */
    private Integer instanceLimit;
    /**
     * <p>
     * An AWS Region code, such as <code>us-west-2</code>.
     * </p>
     */
    private String location;

    /**
     * <p>
     * The name of an EC2 instance type. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance
     * Types</a> for detailed descriptions.
     * </p>
     * 
     * @param eC2InstanceType
     *        The name of an EC2 instance type. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2
     *        Instance Types</a> for detailed descriptions.
     * @see EC2InstanceType
     */

    public void setEC2InstanceType(String eC2InstanceType) {
        this.eC2InstanceType = eC2InstanceType;
    }

    /**
     * <p>
     * The name of an EC2 instance type. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance
     * Types</a> for detailed descriptions.
     * </p>
     * 
     * @return The name of an EC2 instance type. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2
     *         Instance Types</a> for detailed descriptions.
     * @see EC2InstanceType
     */

    public String getEC2InstanceType() {
        return this.eC2InstanceType;
    }

    /**
     * <p>
     * The name of an EC2 instance type. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance
     * Types</a> for detailed descriptions.
     * </p>
     * 
     * @param eC2InstanceType
     *        The name of an EC2 instance type. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2
     *        Instance Types</a> for detailed descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EC2InstanceType
     */

    public EC2InstanceLimit withEC2InstanceType(String eC2InstanceType) {
        setEC2InstanceType(eC2InstanceType);
        return this;
    }

    /**
     * <p>
     * The name of an EC2 instance type. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance
     * Types</a> for detailed descriptions.
     * </p>
     * 
     * @param eC2InstanceType
     *        The name of an EC2 instance type. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2
     *        Instance Types</a> for detailed descriptions.
     * @see EC2InstanceType
     */

    public void setEC2InstanceType(EC2InstanceType eC2InstanceType) {
        withEC2InstanceType(eC2InstanceType);
    }

    /**
     * <p>
     * The name of an EC2 instance type. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance
     * Types</a> for detailed descriptions.
     * </p>
     * 
     * @param eC2InstanceType
     *        The name of an EC2 instance type. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2
     *        Instance Types</a> for detailed descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EC2InstanceType
     */

    public EC2InstanceLimit withEC2InstanceType(EC2InstanceType eC2InstanceType) {
        this.eC2InstanceType = eC2InstanceType.toString();
        return this;
    }

    /**
     * <p>
     * The number of instances for the specified type and location that are currently being used by the AWS account.
     * </p>
     * 
     * @param currentInstances
     *        The number of instances for the specified type and location that are currently being used by the AWS
     *        account.
     */

    public void setCurrentInstances(Integer currentInstances) {
        this.currentInstances = currentInstances;
    }

    /**
     * <p>
     * The number of instances for the specified type and location that are currently being used by the AWS account.
     * </p>
     * 
     * @return The number of instances for the specified type and location that are currently being used by the AWS
     *         account.
     */

    public Integer getCurrentInstances() {
        return this.currentInstances;
    }

    /**
     * <p>
     * The number of instances for the specified type and location that are currently being used by the AWS account.
     * </p>
     * 
     * @param currentInstances
     *        The number of instances for the specified type and location that are currently being used by the AWS
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2InstanceLimit withCurrentInstances(Integer currentInstances) {
        setCurrentInstances(currentInstances);
        return this;
    }

    /**
     * <p>
     * The number of instances that is allowed for the specified instance type and location.
     * </p>
     * 
     * @param instanceLimit
     *        The number of instances that is allowed for the specified instance type and location.
     */

    public void setInstanceLimit(Integer instanceLimit) {
        this.instanceLimit = instanceLimit;
    }

    /**
     * <p>
     * The number of instances that is allowed for the specified instance type and location.
     * </p>
     * 
     * @return The number of instances that is allowed for the specified instance type and location.
     */

    public Integer getInstanceLimit() {
        return this.instanceLimit;
    }

    /**
     * <p>
     * The number of instances that is allowed for the specified instance type and location.
     * </p>
     * 
     * @param instanceLimit
     *        The number of instances that is allowed for the specified instance type and location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2InstanceLimit withInstanceLimit(Integer instanceLimit) {
        setInstanceLimit(instanceLimit);
        return this;
    }

    /**
     * <p>
     * An AWS Region code, such as <code>us-west-2</code>.
     * </p>
     * 
     * @param location
     *        An AWS Region code, such as <code>us-west-2</code>.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * An AWS Region code, such as <code>us-west-2</code>.
     * </p>
     * 
     * @return An AWS Region code, such as <code>us-west-2</code>.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * An AWS Region code, such as <code>us-west-2</code>.
     * </p>
     * 
     * @param location
     *        An AWS Region code, such as <code>us-west-2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2InstanceLimit withLocation(String location) {
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
        if (getEC2InstanceType() != null)
            sb.append("EC2InstanceType: ").append(getEC2InstanceType()).append(",");
        if (getCurrentInstances() != null)
            sb.append("CurrentInstances: ").append(getCurrentInstances()).append(",");
        if (getInstanceLimit() != null)
            sb.append("InstanceLimit: ").append(getInstanceLimit()).append(",");
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

        if (obj instanceof EC2InstanceLimit == false)
            return false;
        EC2InstanceLimit other = (EC2InstanceLimit) obj;
        if (other.getEC2InstanceType() == null ^ this.getEC2InstanceType() == null)
            return false;
        if (other.getEC2InstanceType() != null && other.getEC2InstanceType().equals(this.getEC2InstanceType()) == false)
            return false;
        if (other.getCurrentInstances() == null ^ this.getCurrentInstances() == null)
            return false;
        if (other.getCurrentInstances() != null && other.getCurrentInstances().equals(this.getCurrentInstances()) == false)
            return false;
        if (other.getInstanceLimit() == null ^ this.getInstanceLimit() == null)
            return false;
        if (other.getInstanceLimit() != null && other.getInstanceLimit().equals(this.getInstanceLimit()) == false)
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

        hashCode = prime * hashCode + ((getEC2InstanceType() == null) ? 0 : getEC2InstanceType().hashCode());
        hashCode = prime * hashCode + ((getCurrentInstances() == null) ? 0 : getCurrentInstances().hashCode());
        hashCode = prime * hashCode + ((getInstanceLimit() == null) ? 0 : getInstanceLimit().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public EC2InstanceLimit clone() {
        try {
            return (EC2InstanceLimit) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.EC2InstanceLimitMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
