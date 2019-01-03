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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Thing group properties.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThingGroupProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The thing group description.
     * </p>
     */
    private String thingGroupDescription;
    /**
     * <p>
     * The thing group attributes in JSON format.
     * </p>
     */
    private AttributePayload attributePayload;

    /**
     * <p>
     * The thing group description.
     * </p>
     * 
     * @param thingGroupDescription
     *        The thing group description.
     */

    public void setThingGroupDescription(String thingGroupDescription) {
        this.thingGroupDescription = thingGroupDescription;
    }

    /**
     * <p>
     * The thing group description.
     * </p>
     * 
     * @return The thing group description.
     */

    public String getThingGroupDescription() {
        return this.thingGroupDescription;
    }

    /**
     * <p>
     * The thing group description.
     * </p>
     * 
     * @param thingGroupDescription
     *        The thing group description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingGroupProperties withThingGroupDescription(String thingGroupDescription) {
        setThingGroupDescription(thingGroupDescription);
        return this;
    }

    /**
     * <p>
     * The thing group attributes in JSON format.
     * </p>
     * 
     * @param attributePayload
     *        The thing group attributes in JSON format.
     */

    public void setAttributePayload(AttributePayload attributePayload) {
        this.attributePayload = attributePayload;
    }

    /**
     * <p>
     * The thing group attributes in JSON format.
     * </p>
     * 
     * @return The thing group attributes in JSON format.
     */

    public AttributePayload getAttributePayload() {
        return this.attributePayload;
    }

    /**
     * <p>
     * The thing group attributes in JSON format.
     * </p>
     * 
     * @param attributePayload
     *        The thing group attributes in JSON format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingGroupProperties withAttributePayload(AttributePayload attributePayload) {
        setAttributePayload(attributePayload);
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
        if (getThingGroupDescription() != null)
            sb.append("ThingGroupDescription: ").append(getThingGroupDescription()).append(",");
        if (getAttributePayload() != null)
            sb.append("AttributePayload: ").append(getAttributePayload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThingGroupProperties == false)
            return false;
        ThingGroupProperties other = (ThingGroupProperties) obj;
        if (other.getThingGroupDescription() == null ^ this.getThingGroupDescription() == null)
            return false;
        if (other.getThingGroupDescription() != null && other.getThingGroupDescription().equals(this.getThingGroupDescription()) == false)
            return false;
        if (other.getAttributePayload() == null ^ this.getAttributePayload() == null)
            return false;
        if (other.getAttributePayload() != null && other.getAttributePayload().equals(this.getAttributePayload()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingGroupDescription() == null) ? 0 : getThingGroupDescription().hashCode());
        hashCode = prime * hashCode + ((getAttributePayload() == null) ? 0 : getAttributePayload().hashCode());
        return hashCode;
    }

    @Override
    public ThingGroupProperties clone() {
        try {
            return (ThingGroupProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.ThingGroupPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
