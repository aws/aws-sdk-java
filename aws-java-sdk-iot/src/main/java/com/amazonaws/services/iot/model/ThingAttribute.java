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
 * The properties of the thing, including thing name, thing type name, and a list of thing attributes.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThingAttribute implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the thing.
     * </p>
     */
    private String thingName;
    /**
     * <p>
     * The name of the thing type, if the thing has been associated with a type.
     * </p>
     */
    private String thingTypeName;
    /**
     * <p>
     * The thing ARN.
     * </p>
     */
    private String thingArn;
    /**
     * <p>
     * A list of thing attributes which are name-value pairs.
     * </p>
     */
    private java.util.Map<String, String> attributes;
    /**
     * <p>
     * The version of the thing record in the registry.
     * </p>
     */
    private Long version;

    /**
     * <p>
     * The name of the thing.
     * </p>
     * 
     * @param thingName
     *        The name of the thing.
     */

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The name of the thing.
     * </p>
     * 
     * @return The name of the thing.
     */

    public String getThingName() {
        return this.thingName;
    }

    /**
     * <p>
     * The name of the thing.
     * </p>
     * 
     * @param thingName
     *        The name of the thing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingAttribute withThingName(String thingName) {
        setThingName(thingName);
        return this;
    }

    /**
     * <p>
     * The name of the thing type, if the thing has been associated with a type.
     * </p>
     * 
     * @param thingTypeName
     *        The name of the thing type, if the thing has been associated with a type.
     */

    public void setThingTypeName(String thingTypeName) {
        this.thingTypeName = thingTypeName;
    }

    /**
     * <p>
     * The name of the thing type, if the thing has been associated with a type.
     * </p>
     * 
     * @return The name of the thing type, if the thing has been associated with a type.
     */

    public String getThingTypeName() {
        return this.thingTypeName;
    }

    /**
     * <p>
     * The name of the thing type, if the thing has been associated with a type.
     * </p>
     * 
     * @param thingTypeName
     *        The name of the thing type, if the thing has been associated with a type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingAttribute withThingTypeName(String thingTypeName) {
        setThingTypeName(thingTypeName);
        return this;
    }

    /**
     * <p>
     * The thing ARN.
     * </p>
     * 
     * @param thingArn
     *        The thing ARN.
     */

    public void setThingArn(String thingArn) {
        this.thingArn = thingArn;
    }

    /**
     * <p>
     * The thing ARN.
     * </p>
     * 
     * @return The thing ARN.
     */

    public String getThingArn() {
        return this.thingArn;
    }

    /**
     * <p>
     * The thing ARN.
     * </p>
     * 
     * @param thingArn
     *        The thing ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingAttribute withThingArn(String thingArn) {
        setThingArn(thingArn);
        return this;
    }

    /**
     * <p>
     * A list of thing attributes which are name-value pairs.
     * </p>
     * 
     * @return A list of thing attributes which are name-value pairs.
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A list of thing attributes which are name-value pairs.
     * </p>
     * 
     * @param attributes
     *        A list of thing attributes which are name-value pairs.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * A list of thing attributes which are name-value pairs.
     * </p>
     * 
     * @param attributes
     *        A list of thing attributes which are name-value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingAttribute withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    public ThingAttribute addAttributesEntry(String key, String value) {
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

    public ThingAttribute clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * The version of the thing record in the registry.
     * </p>
     * 
     * @param version
     *        The version of the thing record in the registry.
     */

    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the thing record in the registry.
     * </p>
     * 
     * @return The version of the thing record in the registry.
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the thing record in the registry.
     * </p>
     * 
     * @param version
     *        The version of the thing record in the registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingAttribute withVersion(Long version) {
        setVersion(version);
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
        if (getThingName() != null)
            sb.append("ThingName: ").append(getThingName()).append(",");
        if (getThingTypeName() != null)
            sb.append("ThingTypeName: ").append(getThingTypeName()).append(",");
        if (getThingArn() != null)
            sb.append("ThingArn: ").append(getThingArn()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThingAttribute == false)
            return false;
        ThingAttribute other = (ThingAttribute) obj;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getThingTypeName() == null ^ this.getThingTypeName() == null)
            return false;
        if (other.getThingTypeName() != null && other.getThingTypeName().equals(this.getThingTypeName()) == false)
            return false;
        if (other.getThingArn() == null ^ this.getThingArn() == null)
            return false;
        if (other.getThingArn() != null && other.getThingArn().equals(this.getThingArn()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode + ((getThingTypeName() == null) ? 0 : getThingTypeName().hashCode());
        hashCode = prime * hashCode + ((getThingArn() == null) ? 0 : getThingArn().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public ThingAttribute clone() {
        try {
            return (ThingAttribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.ThingAttributeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
