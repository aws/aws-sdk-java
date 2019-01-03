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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/UpdateVTLDeviceType" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateVTLDeviceTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the medium changer you want to select.
     * </p>
     */
    private String vTLDeviceARN;
    /**
     * <p>
     * The type of medium changer you want to select.
     * </p>
     * <p>
     * Valid Values: "STK-L700", "AWS-Gateway-VTL"
     * </p>
     */
    private String deviceType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the medium changer you want to select.
     * </p>
     * 
     * @param vTLDeviceARN
     *        The Amazon Resource Name (ARN) of the medium changer you want to select.
     */

    public void setVTLDeviceARN(String vTLDeviceARN) {
        this.vTLDeviceARN = vTLDeviceARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the medium changer you want to select.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the medium changer you want to select.
     */

    public String getVTLDeviceARN() {
        return this.vTLDeviceARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the medium changer you want to select.
     * </p>
     * 
     * @param vTLDeviceARN
     *        The Amazon Resource Name (ARN) of the medium changer you want to select.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVTLDeviceTypeRequest withVTLDeviceARN(String vTLDeviceARN) {
        setVTLDeviceARN(vTLDeviceARN);
        return this;
    }

    /**
     * <p>
     * The type of medium changer you want to select.
     * </p>
     * <p>
     * Valid Values: "STK-L700", "AWS-Gateway-VTL"
     * </p>
     * 
     * @param deviceType
     *        The type of medium changer you want to select.</p>
     *        <p>
     *        Valid Values: "STK-L700", "AWS-Gateway-VTL"
     */

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * <p>
     * The type of medium changer you want to select.
     * </p>
     * <p>
     * Valid Values: "STK-L700", "AWS-Gateway-VTL"
     * </p>
     * 
     * @return The type of medium changer you want to select.</p>
     *         <p>
     *         Valid Values: "STK-L700", "AWS-Gateway-VTL"
     */

    public String getDeviceType() {
        return this.deviceType;
    }

    /**
     * <p>
     * The type of medium changer you want to select.
     * </p>
     * <p>
     * Valid Values: "STK-L700", "AWS-Gateway-VTL"
     * </p>
     * 
     * @param deviceType
     *        The type of medium changer you want to select.</p>
     *        <p>
     *        Valid Values: "STK-L700", "AWS-Gateway-VTL"
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVTLDeviceTypeRequest withDeviceType(String deviceType) {
        setDeviceType(deviceType);
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
        if (getVTLDeviceARN() != null)
            sb.append("VTLDeviceARN: ").append(getVTLDeviceARN()).append(",");
        if (getDeviceType() != null)
            sb.append("DeviceType: ").append(getDeviceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateVTLDeviceTypeRequest == false)
            return false;
        UpdateVTLDeviceTypeRequest other = (UpdateVTLDeviceTypeRequest) obj;
        if (other.getVTLDeviceARN() == null ^ this.getVTLDeviceARN() == null)
            return false;
        if (other.getVTLDeviceARN() != null && other.getVTLDeviceARN().equals(this.getVTLDeviceARN()) == false)
            return false;
        if (other.getDeviceType() == null ^ this.getDeviceType() == null)
            return false;
        if (other.getDeviceType() != null && other.getDeviceType().equals(this.getDeviceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVTLDeviceARN() == null) ? 0 : getVTLDeviceARN().hashCode());
        hashCode = prime * hashCode + ((getDeviceType() == null) ? 0 : getDeviceType().hashCode());
        return hashCode;
    }

    @Override
    public UpdateVTLDeviceTypeRequest clone() {
        return (UpdateVTLDeviceTypeRequest) super.clone();
    }

}
