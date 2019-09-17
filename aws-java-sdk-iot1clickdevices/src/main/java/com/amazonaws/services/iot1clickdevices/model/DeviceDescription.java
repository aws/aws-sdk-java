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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/DeviceDescription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the device.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * An array of zero or more elements of DeviceAttribute objects providing user specified device attributes.
     * </p>
     */
    private java.util.Map<String, String> attributes;
    /**
     * <p>
     * The unique identifier of the device.
     * </p>
     */
    private String deviceId;
    /**
     * <p>
     * A Boolean value indicating whether or not the device is enabled.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * A value between 0 and 1 inclusive, representing the fraction of life remaining for the device.
     * </p>
     */
    private Double remainingLife;
    /**
     * <p>
     * The type of the device, such as "button".
     * </p>
     */
    private String type;
    /**
     * <p>
     * The tags currently associated with the AWS IoT 1-Click device.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ARN of the device.
     * </p>
     * 
     * @param arn
     *        The ARN of the device.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the device.
     * </p>
     * 
     * @return The ARN of the device.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the device.
     * </p>
     * 
     * @param arn
     *        The ARN of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceDescription withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * An array of zero or more elements of DeviceAttribute objects providing user specified device attributes.
     * </p>
     * 
     * @return An array of zero or more elements of DeviceAttribute objects providing user specified device attributes.
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * An array of zero or more elements of DeviceAttribute objects providing user specified device attributes.
     * </p>
     * 
     * @param attributes
     *        An array of zero or more elements of DeviceAttribute objects providing user specified device attributes.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * An array of zero or more elements of DeviceAttribute objects providing user specified device attributes.
     * </p>
     * 
     * @param attributes
     *        An array of zero or more elements of DeviceAttribute objects providing user specified device attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceDescription withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    public DeviceDescription addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceDescription clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * The unique identifier of the device.
     * </p>
     * 
     * @param deviceId
     *        The unique identifier of the device.
     */

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * <p>
     * The unique identifier of the device.
     * </p>
     * 
     * @return The unique identifier of the device.
     */

    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * <p>
     * The unique identifier of the device.
     * </p>
     * 
     * @param deviceId
     *        The unique identifier of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceDescription withDeviceId(String deviceId) {
        setDeviceId(deviceId);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether or not the device is enabled.
     * </p>
     * 
     * @param enabled
     *        A Boolean value indicating whether or not the device is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * A Boolean value indicating whether or not the device is enabled.
     * </p>
     * 
     * @return A Boolean value indicating whether or not the device is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * A Boolean value indicating whether or not the device is enabled.
     * </p>
     * 
     * @param enabled
     *        A Boolean value indicating whether or not the device is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceDescription withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether or not the device is enabled.
     * </p>
     * 
     * @return A Boolean value indicating whether or not the device is enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * A value between 0 and 1 inclusive, representing the fraction of life remaining for the device.
     * </p>
     * 
     * @param remainingLife
     *        A value between 0 and 1 inclusive, representing the fraction of life remaining for the device.
     */

    public void setRemainingLife(Double remainingLife) {
        this.remainingLife = remainingLife;
    }

    /**
     * <p>
     * A value between 0 and 1 inclusive, representing the fraction of life remaining for the device.
     * </p>
     * 
     * @return A value between 0 and 1 inclusive, representing the fraction of life remaining for the device.
     */

    public Double getRemainingLife() {
        return this.remainingLife;
    }

    /**
     * <p>
     * A value between 0 and 1 inclusive, representing the fraction of life remaining for the device.
     * </p>
     * 
     * @param remainingLife
     *        A value between 0 and 1 inclusive, representing the fraction of life remaining for the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceDescription withRemainingLife(Double remainingLife) {
        setRemainingLife(remainingLife);
        return this;
    }

    /**
     * <p>
     * The type of the device, such as "button".
     * </p>
     * 
     * @param type
     *        The type of the device, such as "button".
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the device, such as "button".
     * </p>
     * 
     * @return The type of the device, such as "button".
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the device, such as "button".
     * </p>
     * 
     * @param type
     *        The type of the device, such as "button".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceDescription withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The tags currently associated with the AWS IoT 1-Click device.
     * </p>
     * 
     * @return The tags currently associated with the AWS IoT 1-Click device.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags currently associated with the AWS IoT 1-Click device.
     * </p>
     * 
     * @param tags
     *        The tags currently associated with the AWS IoT 1-Click device.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags currently associated with the AWS IoT 1-Click device.
     * </p>
     * 
     * @param tags
     *        The tags currently associated with the AWS IoT 1-Click device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceDescription withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public DeviceDescription addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceDescription clearTagsEntries() {
        this.tags = null;
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getDeviceId() != null)
            sb.append("DeviceId: ").append(getDeviceId()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getRemainingLife() != null)
            sb.append("RemainingLife: ").append(getRemainingLife()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceDescription == false)
            return false;
        DeviceDescription other = (DeviceDescription) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getDeviceId() == null ^ this.getDeviceId() == null)
            return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getRemainingLife() == null ^ this.getRemainingLife() == null)
            return false;
        if (other.getRemainingLife() != null && other.getRemainingLife().equals(this.getRemainingLife()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getRemainingLife() == null) ? 0 : getRemainingLife().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public DeviceDescription clone() {
        try {
            return (DeviceDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot1clickdevices.model.transform.DeviceDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
