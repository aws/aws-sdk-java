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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeDevice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDeviceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Next token of device description.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The unique ID of the device.
     * </p>
     */
    private String deviceName;
    /**
     * <p>
     * The name of the fleet the devices belong to.
     * </p>
     */
    private String deviceFleetName;

    /**
     * <p>
     * Next token of device description.
     * </p>
     * 
     * @param nextToken
     *        Next token of device description.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Next token of device description.
     * </p>
     * 
     * @return Next token of device description.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Next token of device description.
     * </p>
     * 
     * @param nextToken
     *        Next token of device description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The unique ID of the device.
     * </p>
     * 
     * @param deviceName
     *        The unique ID of the device.
     */

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The unique ID of the device.
     * </p>
     * 
     * @return The unique ID of the device.
     */

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * <p>
     * The unique ID of the device.
     * </p>
     * 
     * @param deviceName
     *        The unique ID of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceRequest withDeviceName(String deviceName) {
        setDeviceName(deviceName);
        return this;
    }

    /**
     * <p>
     * The name of the fleet the devices belong to.
     * </p>
     * 
     * @param deviceFleetName
     *        The name of the fleet the devices belong to.
     */

    public void setDeviceFleetName(String deviceFleetName) {
        this.deviceFleetName = deviceFleetName;
    }

    /**
     * <p>
     * The name of the fleet the devices belong to.
     * </p>
     * 
     * @return The name of the fleet the devices belong to.
     */

    public String getDeviceFleetName() {
        return this.deviceFleetName;
    }

    /**
     * <p>
     * The name of the fleet the devices belong to.
     * </p>
     * 
     * @param deviceFleetName
     *        The name of the fleet the devices belong to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceRequest withDeviceFleetName(String deviceFleetName) {
        setDeviceFleetName(deviceFleetName);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getDeviceName() != null)
            sb.append("DeviceName: ").append(getDeviceName()).append(",");
        if (getDeviceFleetName() != null)
            sb.append("DeviceFleetName: ").append(getDeviceFleetName());
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
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        if (other.getDeviceFleetName() == null ^ this.getDeviceFleetName() == null)
            return false;
        if (other.getDeviceFleetName() != null && other.getDeviceFleetName().equals(this.getDeviceFleetName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        hashCode = prime * hashCode + ((getDeviceFleetName() == null) ? 0 : getDeviceFleetName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDeviceRequest clone() {
        return (DescribeDeviceRequest) super.clone();
    }

}
