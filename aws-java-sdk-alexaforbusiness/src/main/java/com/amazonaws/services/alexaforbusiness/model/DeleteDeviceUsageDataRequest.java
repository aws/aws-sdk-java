/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteDeviceUsageData"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDeviceUsageDataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the device.
     * </p>
     */
    private String deviceArn;
    /**
     * <p>
     * The type of usage data to delete.
     * </p>
     */
    private String deviceUsageType;

    /**
     * <p>
     * The ARN of the device.
     * </p>
     * 
     * @param deviceArn
     *        The ARN of the device.
     */

    public void setDeviceArn(String deviceArn) {
        this.deviceArn = deviceArn;
    }

    /**
     * <p>
     * The ARN of the device.
     * </p>
     * 
     * @return The ARN of the device.
     */

    public String getDeviceArn() {
        return this.deviceArn;
    }

    /**
     * <p>
     * The ARN of the device.
     * </p>
     * 
     * @param deviceArn
     *        The ARN of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDeviceUsageDataRequest withDeviceArn(String deviceArn) {
        setDeviceArn(deviceArn);
        return this;
    }

    /**
     * <p>
     * The type of usage data to delete.
     * </p>
     * 
     * @param deviceUsageType
     *        The type of usage data to delete.
     * @see DeviceUsageType
     */

    public void setDeviceUsageType(String deviceUsageType) {
        this.deviceUsageType = deviceUsageType;
    }

    /**
     * <p>
     * The type of usage data to delete.
     * </p>
     * 
     * @return The type of usage data to delete.
     * @see DeviceUsageType
     */

    public String getDeviceUsageType() {
        return this.deviceUsageType;
    }

    /**
     * <p>
     * The type of usage data to delete.
     * </p>
     * 
     * @param deviceUsageType
     *        The type of usage data to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceUsageType
     */

    public DeleteDeviceUsageDataRequest withDeviceUsageType(String deviceUsageType) {
        setDeviceUsageType(deviceUsageType);
        return this;
    }

    /**
     * <p>
     * The type of usage data to delete.
     * </p>
     * 
     * @param deviceUsageType
     *        The type of usage data to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceUsageType
     */

    public DeleteDeviceUsageDataRequest withDeviceUsageType(DeviceUsageType deviceUsageType) {
        this.deviceUsageType = deviceUsageType.toString();
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
        if (getDeviceArn() != null)
            sb.append("DeviceArn: ").append(getDeviceArn()).append(",");
        if (getDeviceUsageType() != null)
            sb.append("DeviceUsageType: ").append(getDeviceUsageType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDeviceUsageDataRequest == false)
            return false;
        DeleteDeviceUsageDataRequest other = (DeleteDeviceUsageDataRequest) obj;
        if (other.getDeviceArn() == null ^ this.getDeviceArn() == null)
            return false;
        if (other.getDeviceArn() != null && other.getDeviceArn().equals(this.getDeviceArn()) == false)
            return false;
        if (other.getDeviceUsageType() == null ^ this.getDeviceUsageType() == null)
            return false;
        if (other.getDeviceUsageType() != null && other.getDeviceUsageType().equals(this.getDeviceUsageType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceArn() == null) ? 0 : getDeviceArn().hashCode());
        hashCode = prime * hashCode + ((getDeviceUsageType() == null) ? 0 : getDeviceUsageType().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDeviceUsageDataRequest clone() {
        return (DeleteDeviceUsageDataRequest) super.clone();
    }

}
