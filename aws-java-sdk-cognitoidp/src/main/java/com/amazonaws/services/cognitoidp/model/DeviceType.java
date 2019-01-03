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
 * The device type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DeviceType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The device key.
     * </p>
     */
    private String deviceKey;
    /**
     * <p>
     * The device attributes.
     * </p>
     */
    private java.util.List<AttributeType> deviceAttributes;
    /**
     * <p>
     * The creation date of the device.
     * </p>
     */
    private java.util.Date deviceCreateDate;
    /**
     * <p>
     * The last modified date of the device.
     * </p>
     */
    private java.util.Date deviceLastModifiedDate;
    /**
     * <p>
     * The date in which the device was last authenticated.
     * </p>
     */
    private java.util.Date deviceLastAuthenticatedDate;

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

    public DeviceType withDeviceKey(String deviceKey) {
        setDeviceKey(deviceKey);
        return this;
    }

    /**
     * <p>
     * The device attributes.
     * </p>
     * 
     * @return The device attributes.
     */

    public java.util.List<AttributeType> getDeviceAttributes() {
        return deviceAttributes;
    }

    /**
     * <p>
     * The device attributes.
     * </p>
     * 
     * @param deviceAttributes
     *        The device attributes.
     */

    public void setDeviceAttributes(java.util.Collection<AttributeType> deviceAttributes) {
        if (deviceAttributes == null) {
            this.deviceAttributes = null;
            return;
        }

        this.deviceAttributes = new java.util.ArrayList<AttributeType>(deviceAttributes);
    }

    /**
     * <p>
     * The device attributes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeviceAttributes(java.util.Collection)} or {@link #withDeviceAttributes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param deviceAttributes
     *        The device attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceType withDeviceAttributes(AttributeType... deviceAttributes) {
        if (this.deviceAttributes == null) {
            setDeviceAttributes(new java.util.ArrayList<AttributeType>(deviceAttributes.length));
        }
        for (AttributeType ele : deviceAttributes) {
            this.deviceAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The device attributes.
     * </p>
     * 
     * @param deviceAttributes
     *        The device attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceType withDeviceAttributes(java.util.Collection<AttributeType> deviceAttributes) {
        setDeviceAttributes(deviceAttributes);
        return this;
    }

    /**
     * <p>
     * The creation date of the device.
     * </p>
     * 
     * @param deviceCreateDate
     *        The creation date of the device.
     */

    public void setDeviceCreateDate(java.util.Date deviceCreateDate) {
        this.deviceCreateDate = deviceCreateDate;
    }

    /**
     * <p>
     * The creation date of the device.
     * </p>
     * 
     * @return The creation date of the device.
     */

    public java.util.Date getDeviceCreateDate() {
        return this.deviceCreateDate;
    }

    /**
     * <p>
     * The creation date of the device.
     * </p>
     * 
     * @param deviceCreateDate
     *        The creation date of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceType withDeviceCreateDate(java.util.Date deviceCreateDate) {
        setDeviceCreateDate(deviceCreateDate);
        return this;
    }

    /**
     * <p>
     * The last modified date of the device.
     * </p>
     * 
     * @param deviceLastModifiedDate
     *        The last modified date of the device.
     */

    public void setDeviceLastModifiedDate(java.util.Date deviceLastModifiedDate) {
        this.deviceLastModifiedDate = deviceLastModifiedDate;
    }

    /**
     * <p>
     * The last modified date of the device.
     * </p>
     * 
     * @return The last modified date of the device.
     */

    public java.util.Date getDeviceLastModifiedDate() {
        return this.deviceLastModifiedDate;
    }

    /**
     * <p>
     * The last modified date of the device.
     * </p>
     * 
     * @param deviceLastModifiedDate
     *        The last modified date of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceType withDeviceLastModifiedDate(java.util.Date deviceLastModifiedDate) {
        setDeviceLastModifiedDate(deviceLastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The date in which the device was last authenticated.
     * </p>
     * 
     * @param deviceLastAuthenticatedDate
     *        The date in which the device was last authenticated.
     */

    public void setDeviceLastAuthenticatedDate(java.util.Date deviceLastAuthenticatedDate) {
        this.deviceLastAuthenticatedDate = deviceLastAuthenticatedDate;
    }

    /**
     * <p>
     * The date in which the device was last authenticated.
     * </p>
     * 
     * @return The date in which the device was last authenticated.
     */

    public java.util.Date getDeviceLastAuthenticatedDate() {
        return this.deviceLastAuthenticatedDate;
    }

    /**
     * <p>
     * The date in which the device was last authenticated.
     * </p>
     * 
     * @param deviceLastAuthenticatedDate
     *        The date in which the device was last authenticated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceType withDeviceLastAuthenticatedDate(java.util.Date deviceLastAuthenticatedDate) {
        setDeviceLastAuthenticatedDate(deviceLastAuthenticatedDate);
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
        if (getDeviceAttributes() != null)
            sb.append("DeviceAttributes: ").append(getDeviceAttributes()).append(",");
        if (getDeviceCreateDate() != null)
            sb.append("DeviceCreateDate: ").append(getDeviceCreateDate()).append(",");
        if (getDeviceLastModifiedDate() != null)
            sb.append("DeviceLastModifiedDate: ").append(getDeviceLastModifiedDate()).append(",");
        if (getDeviceLastAuthenticatedDate() != null)
            sb.append("DeviceLastAuthenticatedDate: ").append(getDeviceLastAuthenticatedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceType == false)
            return false;
        DeviceType other = (DeviceType) obj;
        if (other.getDeviceKey() == null ^ this.getDeviceKey() == null)
            return false;
        if (other.getDeviceKey() != null && other.getDeviceKey().equals(this.getDeviceKey()) == false)
            return false;
        if (other.getDeviceAttributes() == null ^ this.getDeviceAttributes() == null)
            return false;
        if (other.getDeviceAttributes() != null && other.getDeviceAttributes().equals(this.getDeviceAttributes()) == false)
            return false;
        if (other.getDeviceCreateDate() == null ^ this.getDeviceCreateDate() == null)
            return false;
        if (other.getDeviceCreateDate() != null && other.getDeviceCreateDate().equals(this.getDeviceCreateDate()) == false)
            return false;
        if (other.getDeviceLastModifiedDate() == null ^ this.getDeviceLastModifiedDate() == null)
            return false;
        if (other.getDeviceLastModifiedDate() != null && other.getDeviceLastModifiedDate().equals(this.getDeviceLastModifiedDate()) == false)
            return false;
        if (other.getDeviceLastAuthenticatedDate() == null ^ this.getDeviceLastAuthenticatedDate() == null)
            return false;
        if (other.getDeviceLastAuthenticatedDate() != null && other.getDeviceLastAuthenticatedDate().equals(this.getDeviceLastAuthenticatedDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceKey() == null) ? 0 : getDeviceKey().hashCode());
        hashCode = prime * hashCode + ((getDeviceAttributes() == null) ? 0 : getDeviceAttributes().hashCode());
        hashCode = prime * hashCode + ((getDeviceCreateDate() == null) ? 0 : getDeviceCreateDate().hashCode());
        hashCode = prime * hashCode + ((getDeviceLastModifiedDate() == null) ? 0 : getDeviceLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getDeviceLastAuthenticatedDate() == null) ? 0 : getDeviceLastAuthenticatedDate().hashCode());
        return hashCode;
    }

    @Override
    public DeviceType clone() {
        try {
            return (DeviceType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.DeviceTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
