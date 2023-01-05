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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/DescribeDevice"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDeviceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the device that you are checking the information of.
     * </p>
     */
    private String managedDeviceId;

    /**
     * <p>
     * The ID of the device that you are checking the information of.
     * </p>
     * 
     * @param managedDeviceId
     *        The ID of the device that you are checking the information of.
     */

    public void setManagedDeviceId(String managedDeviceId) {
        this.managedDeviceId = managedDeviceId;
    }

    /**
     * <p>
     * The ID of the device that you are checking the information of.
     * </p>
     * 
     * @return The ID of the device that you are checking the information of.
     */

    public String getManagedDeviceId() {
        return this.managedDeviceId;
    }

    /**
     * <p>
     * The ID of the device that you are checking the information of.
     * </p>
     * 
     * @param managedDeviceId
     *        The ID of the device that you are checking the information of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceRequest withManagedDeviceId(String managedDeviceId) {
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

        if (obj instanceof DescribeDeviceRequest == false)
            return false;
        DescribeDeviceRequest other = (DescribeDeviceRequest) obj;
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

        hashCode = prime * hashCode + ((getManagedDeviceId() == null) ? 0 : getManagedDeviceId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDeviceRequest clone() {
        return (DescribeDeviceRequest) super.clone();
    }

}
