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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Maximum number of instances allowed based on the Amazon Elastic Compute Cloud (Amazon EC2) instance type. Instance
 * limits can be retrieved by calling <a>DescribeEC2InstanceLimits</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/EC2InstanceLimit" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EC2InstanceLimit implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the computing
     * resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. Amazon GameLift
     * supports the following EC2 instance types. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2
     * Instance Types</a> for detailed descriptions.
     * </p>
     */
    private String eC2InstanceType;
    /**
     * <p>
     * Number of instances of the specified type that are currently in use by this AWS account.
     * </p>
     */
    private Integer currentInstances;
    /**
     * <p>
     * Number of instances allowed.
     * </p>
     */
    private Integer instanceLimit;

    /**
     * <p>
     * Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the computing
     * resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. Amazon GameLift
     * supports the following EC2 instance types. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2
     * Instance Types</a> for detailed descriptions.
     * </p>
     * 
     * @param eC2InstanceType
     *        Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the
     *        computing resources of each instance in the fleet, including CPU, memory, storage, and networking
     *        capacity. Amazon GameLift supports the following EC2 instance types. See <a
     *        href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a> for detailed descriptions.
     * @see EC2InstanceType
     */

    public void setEC2InstanceType(String eC2InstanceType) {
        this.eC2InstanceType = eC2InstanceType;
    }

    /**
     * <p>
     * Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the computing
     * resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. Amazon GameLift
     * supports the following EC2 instance types. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2
     * Instance Types</a> for detailed descriptions.
     * </p>
     * 
     * @return Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the
     *         computing resources of each instance in the fleet, including CPU, memory, storage, and networking
     *         capacity. Amazon GameLift supports the following EC2 instance types. See <a
     *         href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a> for detailed descriptions.
     * @see EC2InstanceType
     */

    public String getEC2InstanceType() {
        return this.eC2InstanceType;
    }

    /**
     * <p>
     * Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the computing
     * resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. Amazon GameLift
     * supports the following EC2 instance types. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2
     * Instance Types</a> for detailed descriptions.
     * </p>
     * 
     * @param eC2InstanceType
     *        Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the
     *        computing resources of each instance in the fleet, including CPU, memory, storage, and networking
     *        capacity. Amazon GameLift supports the following EC2 instance types. See <a
     *        href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a> for detailed descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EC2InstanceType
     */

    public EC2InstanceLimit withEC2InstanceType(String eC2InstanceType) {
        setEC2InstanceType(eC2InstanceType);
        return this;
    }

    /**
     * <p>
     * Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the computing
     * resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. Amazon GameLift
     * supports the following EC2 instance types. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2
     * Instance Types</a> for detailed descriptions.
     * </p>
     * 
     * @param eC2InstanceType
     *        Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the
     *        computing resources of each instance in the fleet, including CPU, memory, storage, and networking
     *        capacity. Amazon GameLift supports the following EC2 instance types. See <a
     *        href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a> for detailed descriptions.
     * @see EC2InstanceType
     */

    public void setEC2InstanceType(EC2InstanceType eC2InstanceType) {
        withEC2InstanceType(eC2InstanceType);
    }

    /**
     * <p>
     * Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the computing
     * resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. Amazon GameLift
     * supports the following EC2 instance types. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2
     * Instance Types</a> for detailed descriptions.
     * </p>
     * 
     * @param eC2InstanceType
     *        Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the
     *        computing resources of each instance in the fleet, including CPU, memory, storage, and networking
     *        capacity. Amazon GameLift supports the following EC2 instance types. See <a
     *        href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a> for detailed descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EC2InstanceType
     */

    public EC2InstanceLimit withEC2InstanceType(EC2InstanceType eC2InstanceType) {
        this.eC2InstanceType = eC2InstanceType.toString();
        return this;
    }

    /**
     * <p>
     * Number of instances of the specified type that are currently in use by this AWS account.
     * </p>
     * 
     * @param currentInstances
     *        Number of instances of the specified type that are currently in use by this AWS account.
     */

    public void setCurrentInstances(Integer currentInstances) {
        this.currentInstances = currentInstances;
    }

    /**
     * <p>
     * Number of instances of the specified type that are currently in use by this AWS account.
     * </p>
     * 
     * @return Number of instances of the specified type that are currently in use by this AWS account.
     */

    public Integer getCurrentInstances() {
        return this.currentInstances;
    }

    /**
     * <p>
     * Number of instances of the specified type that are currently in use by this AWS account.
     * </p>
     * 
     * @param currentInstances
     *        Number of instances of the specified type that are currently in use by this AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2InstanceLimit withCurrentInstances(Integer currentInstances) {
        setCurrentInstances(currentInstances);
        return this;
    }

    /**
     * <p>
     * Number of instances allowed.
     * </p>
     * 
     * @param instanceLimit
     *        Number of instances allowed.
     */

    public void setInstanceLimit(Integer instanceLimit) {
        this.instanceLimit = instanceLimit;
    }

    /**
     * <p>
     * Number of instances allowed.
     * </p>
     * 
     * @return Number of instances allowed.
     */

    public Integer getInstanceLimit() {
        return this.instanceLimit;
    }

    /**
     * <p>
     * Number of instances allowed.
     * </p>
     * 
     * @param instanceLimit
     *        Number of instances allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2InstanceLimit withInstanceLimit(Integer instanceLimit) {
        setInstanceLimit(instanceLimit);
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
            sb.append("InstanceLimit: ").append(getInstanceLimit());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEC2InstanceType() == null) ? 0 : getEC2InstanceType().hashCode());
        hashCode = prime * hashCode + ((getCurrentInstances() == null) ? 0 : getCurrentInstances().hashCode());
        hashCode = prime * hashCode + ((getInstanceLimit() == null) ? 0 : getInstanceLimit().hashCode());
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
