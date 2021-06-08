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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeEC2InstanceLimits" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEC2InstanceLimitsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of an EC2 instance type that is supported in GameLift. A fleet instance type determines the computing
     * resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. Do not specify
     * a value for this parameter to retrieve limits for all instance types.
     * </p>
     */
    private String eC2InstanceType;
    /**
     * <p>
     * The name of a remote location to request instance limits for, in the form of an AWS Region code such as
     * <code>us-west-2</code>.
     * </p>
     */
    private String location;

    /**
     * <p>
     * Name of an EC2 instance type that is supported in GameLift. A fleet instance type determines the computing
     * resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. Do not specify
     * a value for this parameter to retrieve limits for all instance types.
     * </p>
     * 
     * @param eC2InstanceType
     *        Name of an EC2 instance type that is supported in GameLift. A fleet instance type determines the computing
     *        resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. Do not
     *        specify a value for this parameter to retrieve limits for all instance types.
     * @see EC2InstanceType
     */

    public void setEC2InstanceType(String eC2InstanceType) {
        this.eC2InstanceType = eC2InstanceType;
    }

    /**
     * <p>
     * Name of an EC2 instance type that is supported in GameLift. A fleet instance type determines the computing
     * resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. Do not specify
     * a value for this parameter to retrieve limits for all instance types.
     * </p>
     * 
     * @return Name of an EC2 instance type that is supported in GameLift. A fleet instance type determines the
     *         computing resources of each instance in the fleet, including CPU, memory, storage, and networking
     *         capacity. Do not specify a value for this parameter to retrieve limits for all instance types.
     * @see EC2InstanceType
     */

    public String getEC2InstanceType() {
        return this.eC2InstanceType;
    }

    /**
     * <p>
     * Name of an EC2 instance type that is supported in GameLift. A fleet instance type determines the computing
     * resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. Do not specify
     * a value for this parameter to retrieve limits for all instance types.
     * </p>
     * 
     * @param eC2InstanceType
     *        Name of an EC2 instance type that is supported in GameLift. A fleet instance type determines the computing
     *        resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. Do not
     *        specify a value for this parameter to retrieve limits for all instance types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EC2InstanceType
     */

    public DescribeEC2InstanceLimitsRequest withEC2InstanceType(String eC2InstanceType) {
        setEC2InstanceType(eC2InstanceType);
        return this;
    }

    /**
     * <p>
     * Name of an EC2 instance type that is supported in GameLift. A fleet instance type determines the computing
     * resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. Do not specify
     * a value for this parameter to retrieve limits for all instance types.
     * </p>
     * 
     * @param eC2InstanceType
     *        Name of an EC2 instance type that is supported in GameLift. A fleet instance type determines the computing
     *        resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. Do not
     *        specify a value for this parameter to retrieve limits for all instance types.
     * @see EC2InstanceType
     */

    public void setEC2InstanceType(EC2InstanceType eC2InstanceType) {
        withEC2InstanceType(eC2InstanceType);
    }

    /**
     * <p>
     * Name of an EC2 instance type that is supported in GameLift. A fleet instance type determines the computing
     * resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. Do not specify
     * a value for this parameter to retrieve limits for all instance types.
     * </p>
     * 
     * @param eC2InstanceType
     *        Name of an EC2 instance type that is supported in GameLift. A fleet instance type determines the computing
     *        resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. Do not
     *        specify a value for this parameter to retrieve limits for all instance types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EC2InstanceType
     */

    public DescribeEC2InstanceLimitsRequest withEC2InstanceType(EC2InstanceType eC2InstanceType) {
        this.eC2InstanceType = eC2InstanceType.toString();
        return this;
    }

    /**
     * <p>
     * The name of a remote location to request instance limits for, in the form of an AWS Region code such as
     * <code>us-west-2</code>.
     * </p>
     * 
     * @param location
     *        The name of a remote location to request instance limits for, in the form of an AWS Region code such as
     *        <code>us-west-2</code>.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The name of a remote location to request instance limits for, in the form of an AWS Region code such as
     * <code>us-west-2</code>.
     * </p>
     * 
     * @return The name of a remote location to request instance limits for, in the form of an AWS Region code such as
     *         <code>us-west-2</code>.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The name of a remote location to request instance limits for, in the form of an AWS Region code such as
     * <code>us-west-2</code>.
     * </p>
     * 
     * @param location
     *        The name of a remote location to request instance limits for, in the form of an AWS Region code such as
     *        <code>us-west-2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEC2InstanceLimitsRequest withLocation(String location) {
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

        if (obj instanceof DescribeEC2InstanceLimitsRequest == false)
            return false;
        DescribeEC2InstanceLimitsRequest other = (DescribeEC2InstanceLimitsRequest) obj;
        if (other.getEC2InstanceType() == null ^ this.getEC2InstanceType() == null)
            return false;
        if (other.getEC2InstanceType() != null && other.getEC2InstanceType().equals(this.getEC2InstanceType()) == false)
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
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEC2InstanceLimitsRequest clone() {
        return (DescribeEC2InstanceLimitsRequest) super.clone();
    }

}
