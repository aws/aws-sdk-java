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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The new device metadata type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/NewDeviceMetadataType" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NewDeviceMetadataType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The device key.
     * </p>
     */
    private String deviceKey;
    /**
     * <p>
     * The device group key.
     * </p>
     */
    private String deviceGroupKey;

    /**
     * <p>
     * The device key.
     * </p>
     * 
     * @param deviceKey
     *        The device key.
     */

    public void setDeviceKey(String deviceKey) {
        this.deviceKey = deviceKey;
    }

    /**
     * <p>
     * The device key.
     * </p>
     * 
     * @return The device key.
     */

    public String getDeviceKey() {
        return this.deviceKey;
    }

    /**
     * <p>
     * The device key.
     * </p>
     * 
     * @param deviceKey
     *        The device key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewDeviceMetadataType withDeviceKey(String deviceKey) {
        setDeviceKey(deviceKey);
        return this;
    }

    /**
     * <p>
     * The device group key.
     * </p>
     * 
     * @param deviceGroupKey
     *        The device group key.
     */

    public void setDeviceGroupKey(String deviceGroupKey) {
        this.deviceGroupKey = deviceGroupKey;
    }

    /**
     * <p>
     * The device group key.
     * </p>
     * 
     * @return The device group key.
     */

    public String getDeviceGroupKey() {
        return this.deviceGroupKey;
    }

    /**
     * <p>
     * The device group key.
     * </p>
     * 
     * @param deviceGroupKey
     *        The device group key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewDeviceMetadataType withDeviceGroupKey(String deviceGroupKey) {
        setDeviceGroupKey(deviceGroupKey);
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
        if (getDeviceKey() != null)
            sb.append("DeviceKey: ").append(getDeviceKey()).append(",");
        if (getDeviceGroupKey() != null)
            sb.append("DeviceGroupKey: ").append(getDeviceGroupKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NewDeviceMetadataType == false)
            return false;
        NewDeviceMetadataType other = (NewDeviceMetadataType) obj;
        if (other.getDeviceKey() == null ^ this.getDeviceKey() == null)
            return false;
        if (other.getDeviceKey() != null && other.getDeviceKey().equals(this.getDeviceKey()) == false)
            return false;
        if (other.getDeviceGroupKey() == null ^ this.getDeviceGroupKey() == null)
            return false;
        if (other.getDeviceGroupKey() != null && other.getDeviceGroupKey().equals(this.getDeviceGroupKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceKey() == null) ? 0 : getDeviceKey().hashCode());
        hashCode = prime * hashCode + ((getDeviceGroupKey() == null) ? 0 : getDeviceGroupKey().hashCode());
        return hashCode;
    }

    @Override
    public NewDeviceMetadataType clone() {
        try {
            return (NewDeviceMetadataType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.NewDeviceMetadataTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
