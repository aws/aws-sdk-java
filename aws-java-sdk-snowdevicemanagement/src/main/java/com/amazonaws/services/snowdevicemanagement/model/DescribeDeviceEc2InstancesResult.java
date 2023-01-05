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
package com.amazonaws.services.snowdevicemanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/DescribeDeviceEc2Instances"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDeviceEc2InstancesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of structures containing information about each instance.
     * </p>
     */
    private java.util.List<InstanceSummary> instances;

    /**
     * <p>
     * A list of structures containing information about each instance.
     * </p>
     * 
     * @return A list of structures containing information about each instance.
     */

    public java.util.List<InstanceSummary> getInstances() {
        return instances;
    }

    /**
     * <p>
     * A list of structures containing information about each instance.
     * </p>
     * 
     * @param instances
     *        A list of structures containing information about each instance.
     */

    public void setInstances(java.util.Collection<InstanceSummary> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }

        this.instances = new java.util.ArrayList<InstanceSummary>(instances);
    }

    /**
     * <p>
     * A list of structures containing information about each instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstances(java.util.Collection)} or {@link #withInstances(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instances
     *        A list of structures containing information about each instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceEc2InstancesResult withInstances(InstanceSummary... instances) {
        if (this.instances == null) {
            setInstances(new java.util.ArrayList<InstanceSummary>(instances.length));
        }
        for (InstanceSummary ele : instances) {
            this.instances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of structures containing information about each instance.
     * </p>
     * 
     * @param instances
     *        A list of structures containing information about each instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceEc2InstancesResult withInstances(java.util.Collection<InstanceSummary> instances) {
        setInstances(instances);
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
        if (getInstances() != null)
            sb.append("Instances: ").append(getInstances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDeviceEc2InstancesResult == false)
            return false;
        DescribeDeviceEc2InstancesResult other = (DescribeDeviceEc2InstancesResult) obj;
        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null && other.getInstances().equals(this.getInstances()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDeviceEc2InstancesResult clone() {
        try {
            return (DescribeDeviceEc2InstancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
