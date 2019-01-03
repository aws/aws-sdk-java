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
package com.amazonaws.services.iot1clickdevices.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/InvokeDeviceMethod" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvokeDeviceMethodResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A JSON encoded string containing the device method response.
     * </p>
     */
    private String deviceMethodResponse;

    /**
     * <p>
     * A JSON encoded string containing the device method response.
     * </p>
     * 
     * @param deviceMethodResponse
     *        A JSON encoded string containing the device method response.
     */

    public void setDeviceMethodResponse(String deviceMethodResponse) {
        this.deviceMethodResponse = deviceMethodResponse;
    }

    /**
     * <p>
     * A JSON encoded string containing the device method response.
     * </p>
     * 
     * @return A JSON encoded string containing the device method response.
     */

    public String getDeviceMethodResponse() {
        return this.deviceMethodResponse;
    }

    /**
     * <p>
     * A JSON encoded string containing the device method response.
     * </p>
     * 
     * @param deviceMethodResponse
     *        A JSON encoded string containing the device method response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeDeviceMethodResult withDeviceMethodResponse(String deviceMethodResponse) {
        setDeviceMethodResponse(deviceMethodResponse);
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
        if (getDeviceMethodResponse() != null)
            sb.append("DeviceMethodResponse: ").append(getDeviceMethodResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InvokeDeviceMethodResult == false)
            return false;
        InvokeDeviceMethodResult other = (InvokeDeviceMethodResult) obj;
        if (other.getDeviceMethodResponse() == null ^ this.getDeviceMethodResponse() == null)
            return false;
        if (other.getDeviceMethodResponse() != null && other.getDeviceMethodResponse().equals(this.getDeviceMethodResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceMethodResponse() == null) ? 0 : getDeviceMethodResponse().hashCode());
        return hashCode;
    }

    @Override
    public InvokeDeviceMethodResult clone() {
        try {
            return (InvokeDeviceMethodResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
