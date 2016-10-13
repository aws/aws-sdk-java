/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request action.
 * </p>
 */
public class DescribeEC2InstanceLimitsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the computing
     * resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. GameLift
     * supports the following EC2 instance types. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2
     * Instance Types</a> for detailed descriptions. Leave this parameter blank to retrieve limits for all types.
     * </p>
     */
    private String eC2InstanceType;

    /**
     * <p>
     * Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the computing
     * resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. GameLift
     * supports the following EC2 instance types. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2
     * Instance Types</a> for detailed descriptions. Leave this parameter blank to retrieve limits for all types.
     * </p>
     * 
     * @param eC2InstanceType
     *        Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the
     *        computing resources of each instance in the fleet, including CPU, memory, storage, and networking
     *        capacity. GameLift supports the following EC2 instance types. See <a
     *        href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a> for detailed descriptions.
     *        Leave this parameter blank to retrieve limits for all types.
     * @see EC2InstanceType
     */

    public void setEC2InstanceType(String eC2InstanceType) {
        this.eC2InstanceType = eC2InstanceType;
    }

    /**
     * <p>
     * Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the computing
     * resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. GameLift
     * supports the following EC2 instance types. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2
     * Instance Types</a> for detailed descriptions. Leave this parameter blank to retrieve limits for all types.
     * </p>
     * 
     * @return Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the
     *         computing resources of each instance in the fleet, including CPU, memory, storage, and networking
     *         capacity. GameLift supports the following EC2 instance types. See <a
     *         href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a> for detailed descriptions.
     *         Leave this parameter blank to retrieve limits for all types.
     * @see EC2InstanceType
     */

    public String getEC2InstanceType() {
        return this.eC2InstanceType;
    }

    /**
     * <p>
     * Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the computing
     * resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. GameLift
     * supports the following EC2 instance types. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2
     * Instance Types</a> for detailed descriptions. Leave this parameter blank to retrieve limits for all types.
     * </p>
     * 
     * @param eC2InstanceType
     *        Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the
     *        computing resources of each instance in the fleet, including CPU, memory, storage, and networking
     *        capacity. GameLift supports the following EC2 instance types. See <a
     *        href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a> for detailed descriptions.
     *        Leave this parameter blank to retrieve limits for all types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EC2InstanceType
     */

    public DescribeEC2InstanceLimitsRequest withEC2InstanceType(String eC2InstanceType) {
        setEC2InstanceType(eC2InstanceType);
        return this;
    }

    /**
     * <p>
     * Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the computing
     * resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. GameLift
     * supports the following EC2 instance types. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2
     * Instance Types</a> for detailed descriptions. Leave this parameter blank to retrieve limits for all types.
     * </p>
     * 
     * @param eC2InstanceType
     *        Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the
     *        computing resources of each instance in the fleet, including CPU, memory, storage, and networking
     *        capacity. GameLift supports the following EC2 instance types. See <a
     *        href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a> for detailed descriptions.
     *        Leave this parameter blank to retrieve limits for all types.
     * @see EC2InstanceType
     */

    public void setEC2InstanceType(EC2InstanceType eC2InstanceType) {
        this.eC2InstanceType = eC2InstanceType.toString();
    }

    /**
     * <p>
     * Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the computing
     * resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. GameLift
     * supports the following EC2 instance types. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2
     * Instance Types</a> for detailed descriptions. Leave this parameter blank to retrieve limits for all types.
     * </p>
     * 
     * @param eC2InstanceType
     *        Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the
     *        computing resources of each instance in the fleet, including CPU, memory, storage, and networking
     *        capacity. GameLift supports the following EC2 instance types. See <a
     *        href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a> for detailed descriptions.
     *        Leave this parameter blank to retrieve limits for all types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EC2InstanceType
     */

    public DescribeEC2InstanceLimitsRequest withEC2InstanceType(EC2InstanceType eC2InstanceType) {
        setEC2InstanceType(eC2InstanceType);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("EC2InstanceType: " + getEC2InstanceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEC2InstanceLimitsRequest == false)
            return false;
        DescribeEC2InstanceLimitsRequest other = (DescribeEC2InstanceLimitsRequest) obj;
        if (other.getEC2InstanceType() == null ^ this.getEC2InstanceType() == null)
            return false;
        if (other.getEC2InstanceType() != null && other.getEC2InstanceType().equals(this.getEC2InstanceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEC2InstanceType() == null) ? 0 : getEC2InstanceType().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEC2InstanceLimitsRequest clone() {
        return (DescribeEC2InstanceLimitsRequest) super.clone();
    }
}
