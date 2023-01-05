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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/DescribeDeviceEc2Instances"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDeviceEc2InstancesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of instance IDs associated with the managed device.
     * </p>
     */
    private java.util.List<String> instanceIds;
    /**
     * <p>
     * The ID of the managed device.
     * </p>
     */
    private String managedDeviceId;

    /**
     * <p>
     * A list of instance IDs associated with the managed device.
     * </p>
     * 
     * @return A list of instance IDs associated with the managed device.
     */

    public java.util.List<String> getInstanceIds() {
        return instanceIds;
    }

    /**
     * <p>
     * A list of instance IDs associated with the managed device.
     * </p>
     * 
     * @param instanceIds
     *        A list of instance IDs associated with the managed device.
     */

    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }

        this.instanceIds = new java.util.ArrayList<String>(instanceIds);
    }

    /**
     * <p>
     * A list of instance IDs associated with the managed device.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceIds(java.util.Collection)} or {@link #withInstanceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instanceIds
     *        A list of instance IDs associated with the managed device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceEc2InstancesRequest withInstanceIds(String... instanceIds) {
        if (this.instanceIds == null) {
            setInstanceIds(new java.util.ArrayList<String>(instanceIds.length));
        }
        for (String ele : instanceIds) {
            this.instanceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of instance IDs associated with the managed device.
     * </p>
     * 
     * @param instanceIds
     *        A list of instance IDs associated with the managed device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceEc2InstancesRequest withInstanceIds(java.util.Collection<String> instanceIds) {
        setInstanceIds(instanceIds);
        return this;
    }

    /**
     * <p>
     * The ID of the managed device.
     * </p>
     * 
     * @param managedDeviceId
     *        The ID of the managed device.
     */

    public void setManagedDeviceId(String managedDeviceId) {
        this.managedDeviceId = managedDeviceId;
    }

    /**
     * <p>
     * The ID of the managed device.
     * </p>
     * 
     * @return The ID of the managed device.
     */

    public String getManagedDeviceId() {
        return this.managedDeviceId;
    }

    /**
     * <p>
     * The ID of the managed device.
     * </p>
     * 
     * @param managedDeviceId
     *        The ID of the managed device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceEc2InstancesRequest withManagedDeviceId(String managedDeviceId) {
        setManagedDeviceId(managedDeviceId);
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
        if (getInstanceIds() != null)
            sb.append("InstanceIds: ").append(getInstanceIds()).append(",");
        if (getManagedDeviceId() != null)
            sb.append("ManagedDeviceId: ").append(getManagedDeviceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDeviceEc2InstancesRequest == false)
            return false;
        DescribeDeviceEc2InstancesRequest other = (DescribeDeviceEc2InstancesRequest) obj;
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null)
            return false;
        if (other.getInstanceIds() != null && other.getInstanceIds().equals(this.getInstanceIds()) == false)
            return false;
        if (other.getManagedDeviceId() == null ^ this.getManagedDeviceId() == null)
            return false;
        if (other.getManagedDeviceId() != null && other.getManagedDeviceId().equals(this.getManagedDeviceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode());
        hashCode = prime * hashCode + ((getManagedDeviceId() == null) ? 0 : getManagedDeviceId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDeviceEc2InstancesRequest clone() {
        return (DescribeDeviceEc2InstancesRequest) super.clone();
    }

}
