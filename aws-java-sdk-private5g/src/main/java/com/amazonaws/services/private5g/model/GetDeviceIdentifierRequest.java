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
package com.amazonaws.services.private5g.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/GetDeviceIdentifier"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDeviceIdentifierRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device identifier.
     * </p>
     */
    private String deviceIdentifierArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device identifier.
     * </p>
     * 
     * @param deviceIdentifierArn
     *        The Amazon Resource Name (ARN) of the device identifier.
     */

    public void setDeviceIdentifierArn(String deviceIdentifierArn) {
        this.deviceIdentifierArn = deviceIdentifierArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device identifier.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the device identifier.
     */

    public String getDeviceIdentifierArn() {
        return this.deviceIdentifierArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device identifier.
     * </p>
     * 
     * @param deviceIdentifierArn
     *        The Amazon Resource Name (ARN) of the device identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeviceIdentifierRequest withDeviceIdentifierArn(String deviceIdentifierArn) {
        setDeviceIdentifierArn(deviceIdentifierArn);
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
        if (getDeviceIdentifierArn() != null)
            sb.append("DeviceIdentifierArn: ").append(getDeviceIdentifierArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDeviceIdentifierRequest == false)
            return false;
        GetDeviceIdentifierRequest other = (GetDeviceIdentifierRequest) obj;
        if (other.getDeviceIdentifierArn() == null ^ this.getDeviceIdentifierArn() == null)
            return false;
        if (other.getDeviceIdentifierArn() != null && other.getDeviceIdentifierArn().equals(this.getDeviceIdentifierArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceIdentifierArn() == null) ? 0 : getDeviceIdentifierArn().hashCode());
        return hashCode;
    }

    @Override
    public GetDeviceIdentifierRequest clone() {
        return (GetDeviceIdentifierRequest) super.clone();
    }

}
