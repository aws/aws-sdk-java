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
package com.amazonaws.services.iot1clickprojects.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object defining the template for a placement.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/PlacementTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PlacementTemplate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The default attributes (key/value pairs) to be applied to all placements using this template.
     * </p>
     */
    private java.util.Map<String, String> defaultAttributes;
    /**
     * <p>
     * An object specifying the <a>DeviceTemplate</a> for all placements using this (<a>PlacementTemplate</a>) template.
     * </p>
     */
    private java.util.Map<String, DeviceTemplate> deviceTemplates;

    /**
     * <p>
     * The default attributes (key/value pairs) to be applied to all placements using this template.
     * </p>
     * 
     * @return The default attributes (key/value pairs) to be applied to all placements using this template.
     */

    public java.util.Map<String, String> getDefaultAttributes() {
        return defaultAttributes;
    }

    /**
     * <p>
     * The default attributes (key/value pairs) to be applied to all placements using this template.
     * </p>
     * 
     * @param defaultAttributes
     *        The default attributes (key/value pairs) to be applied to all placements using this template.
     */

    public void setDefaultAttributes(java.util.Map<String, String> defaultAttributes) {
        this.defaultAttributes = defaultAttributes;
    }

    /**
     * <p>
     * The default attributes (key/value pairs) to be applied to all placements using this template.
     * </p>
     * 
     * @param defaultAttributes
     *        The default attributes (key/value pairs) to be applied to all placements using this template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlacementTemplate withDefaultAttributes(java.util.Map<String, String> defaultAttributes) {
        setDefaultAttributes(defaultAttributes);
        return this;
    }

    public PlacementTemplate addDefaultAttributesEntry(String key, String value) {
        if (null == this.defaultAttributes) {
            this.defaultAttributes = new java.util.HashMap<String, String>();
        }
        if (this.defaultAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.defaultAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DefaultAttributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlacementTemplate clearDefaultAttributesEntries() {
        this.defaultAttributes = null;
        return this;
    }

    /**
     * <p>
     * An object specifying the <a>DeviceTemplate</a> for all placements using this (<a>PlacementTemplate</a>) template.
     * </p>
     * 
     * @return An object specifying the <a>DeviceTemplate</a> for all placements using this (<a>PlacementTemplate</a>)
     *         template.
     */

    public java.util.Map<String, DeviceTemplate> getDeviceTemplates() {
        return deviceTemplates;
    }

    /**
     * <p>
     * An object specifying the <a>DeviceTemplate</a> for all placements using this (<a>PlacementTemplate</a>) template.
     * </p>
     * 
     * @param deviceTemplates
     *        An object specifying the <a>DeviceTemplate</a> for all placements using this (<a>PlacementTemplate</a>)
     *        template.
     */

    public void setDeviceTemplates(java.util.Map<String, DeviceTemplate> deviceTemplates) {
        this.deviceTemplates = deviceTemplates;
    }

    /**
     * <p>
     * An object specifying the <a>DeviceTemplate</a> for all placements using this (<a>PlacementTemplate</a>) template.
     * </p>
     * 
     * @param deviceTemplates
     *        An object specifying the <a>DeviceTemplate</a> for all placements using this (<a>PlacementTemplate</a>)
     *        template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlacementTemplate withDeviceTemplates(java.util.Map<String, DeviceTemplate> deviceTemplates) {
        setDeviceTemplates(deviceTemplates);
        return this;
    }

    public PlacementTemplate addDeviceTemplatesEntry(String key, DeviceTemplate value) {
        if (null == this.deviceTemplates) {
            this.deviceTemplates = new java.util.HashMap<String, DeviceTemplate>();
        }
        if (this.deviceTemplates.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.deviceTemplates.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DeviceTemplates.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlacementTemplate clearDeviceTemplatesEntries() {
        this.deviceTemplates = null;
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
        if (getDefaultAttributes() != null)
            sb.append("DefaultAttributes: ").append(getDefaultAttributes()).append(",");
        if (getDeviceTemplates() != null)
            sb.append("DeviceTemplates: ").append(getDeviceTemplates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PlacementTemplate == false)
            return false;
        PlacementTemplate other = (PlacementTemplate) obj;
        if (other.getDefaultAttributes() == null ^ this.getDefaultAttributes() == null)
            return false;
        if (other.getDefaultAttributes() != null && other.getDefaultAttributes().equals(this.getDefaultAttributes()) == false)
            return false;
        if (other.getDeviceTemplates() == null ^ this.getDeviceTemplates() == null)
            return false;
        if (other.getDeviceTemplates() != null && other.getDeviceTemplates().equals(this.getDeviceTemplates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultAttributes() == null) ? 0 : getDefaultAttributes().hashCode());
        hashCode = prime * hashCode + ((getDeviceTemplates() == null) ? 0 : getDeviceTemplates().hashCode());
        return hashCode;
    }

    @Override
    public PlacementTemplate clone() {
        try {
            return (PlacementTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot1clickprojects.model.transform.PlacementTemplateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
