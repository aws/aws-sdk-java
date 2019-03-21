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
 * The thing search index document.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThingDocument implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The thing name.
     * </p>
     */
    private String thingName;
    /**
     * <p>
     * The thing ID.
     * </p>
     */
    private String thingId;
    /**
     * <p>
     * The thing type name.
     * </p>
     */
    private String thingTypeName;
    /**
     * <p>
     * Thing group names.
     * </p>
     */
    private java.util.List<String> thingGroupNames;
    /**
     * <p>
     * The attributes.
     * </p>
     */
    private java.util.Map<String, String> attributes;
    /**
     * <p>
     * The shadow.
     * </p>
     */
    private String shadow;
    /**
     * <p>
     * Indicates whether the thing is connected to the AWS IoT service.
     * </p>
     */
    private ThingConnectivity connectivity;

    /**
     * <p>
     * The thing name.
     * </p>
     * 
     * @param thingName
     *        The thing name.
     */

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The thing name.
     * </p>
     * 
     * @return The thing name.
     */

    public String getThingName() {
        return this.thingName;
    }

    /**
     * <p>
     * The thing name.
     * </p>
     * 
     * @param thingName
     *        The thing name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingDocument withThingName(String thingName) {
        setThingName(thingName);
        return this;
    }

    /**
     * <p>
     * The thing ID.
     * </p>
     * 
     * @param thingId
     *        The thing ID.
     */

    public void setThingId(String thingId) {
        this.thingId = thingId;
    }

    /**
     * <p>
     * The thing ID.
     * </p>
     * 
     * @return The thing ID.
     */

    public String getThingId() {
        return this.thingId;
    }

    /**
     * <p>
     * The thing ID.
     * </p>
     * 
     * @param thingId
     *        The thing ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingDocument withThingId(String thingId) {
        setThingId(thingId);
        return this;
    }

    /**
     * <p>
     * The thing type name.
     * </p>
     * 
     * @param thingTypeName
     *        The thing type name.
     */

    public void setThingTypeName(String thingTypeName) {
        this.thingTypeName = thingTypeName;
    }

    /**
     * <p>
     * The thing type name.
     * </p>
     * 
     * @return The thing type name.
     */

    public String getThingTypeName() {
        return this.thingTypeName;
    }

    /**
     * <p>
     * The thing type name.
     * </p>
     * 
     * @param thingTypeName
     *        The thing type name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingDocument withThingTypeName(String thingTypeName) {
        setThingTypeName(thingTypeName);
        return this;
    }

    /**
     * <p>
     * Thing group names.
     * </p>
     * 
     * @return Thing group names.
     */

    public java.util.List<String> getThingGroupNames() {
        return thingGroupNames;
    }

    /**
     * <p>
     * Thing group names.
     * </p>
     * 
     * @param thingGroupNames
     *        Thing group names.
     */

    public void setThingGroupNames(java.util.Collection<String> thingGroupNames) {
        if (thingGroupNames == null) {
            this.thingGroupNames = null;
            return;
        }

        this.thingGroupNames = new java.util.ArrayList<String>(thingGroupNames);
    }

    /**
     * <p>
     * Thing group names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setThingGroupNames(java.util.Collection)} or {@link #withThingGroupNames(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param thingGroupNames
     *        Thing group names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingDocument withThingGroupNames(String... thingGroupNames) {
        if (this.thingGroupNames == null) {
            setThingGroupNames(new java.util.ArrayList<String>(thingGroupNames.length));
        }
        for (String ele : thingGroupNames) {
            this.thingGroupNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Thing group names.
     * </p>
     * 
     * @param thingGroupNames
     *        Thing group names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingDocument withThingGroupNames(java.util.Collection<String> thingGroupNames) {
        setThingGroupNames(thingGroupNames);
        return this;
    }

    /**
     * <p>
     * The attributes.
     * </p>
     * 
     * @return The attributes.
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The attributes.
     * </p>
     * 
     * @param attributes
     *        The attributes.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * The attributes.
     * </p>
     * 
     * @param attributes
     *        The attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingDocument withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    public ThingDocument addAttributesEntry(String key, String value) {
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

    public ThingDocument clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * The shadow.
     * </p>
     * 
     * @param shadow
     *        The shadow.
     */

    public void setShadow(String shadow) {
        this.shadow = shadow;
    }

    /**
     * <p>
     * The shadow.
     * </p>
     * 
     * @return The shadow.
     */

    public String getShadow() {
        return this.shadow;
    }

    /**
     * <p>
     * The shadow.
     * </p>
     * 
     * @param shadow
     *        The shadow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingDocument withShadow(String shadow) {
        setShadow(shadow);
        return this;
    }

    /**
     * <p>
     * Indicates whether the thing is connected to the AWS IoT service.
     * </p>
     * 
     * @param connectivity
     *        Indicates whether the thing is connected to the AWS IoT service.
     */

    public void setConnectivity(ThingConnectivity connectivity) {
        this.connectivity = connectivity;
    }

    /**
     * <p>
     * Indicates whether the thing is connected to the AWS IoT service.
     * </p>
     * 
     * @return Indicates whether the thing is connected to the AWS IoT service.
     */

    public ThingConnectivity getConnectivity() {
        return this.connectivity;
    }

    /**
     * <p>
     * Indicates whether the thing is connected to the AWS IoT service.
     * </p>
     * 
     * @param connectivity
     *        Indicates whether the thing is connected to the AWS IoT service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingDocument withConnectivity(ThingConnectivity connectivity) {
        setConnectivity(connectivity);
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
        if (getThingId() != null)
            sb.append("ThingId: ").append(getThingId()).append(",");
        if (getThingTypeName() != null)
            sb.append("ThingTypeName: ").append(getThingTypeName()).append(",");
        if (getThingGroupNames() != null)
            sb.append("ThingGroupNames: ").append(getThingGroupNames()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getShadow() != null)
            sb.append("Shadow: ").append(getShadow()).append(",");
        if (getConnectivity() != null)
            sb.append("Connectivity: ").append(getConnectivity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThingDocument == false)
            return false;
        ThingDocument other = (ThingDocument) obj;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getThingId() == null ^ this.getThingId() == null)
            return false;
        if (other.getThingId() != null && other.getThingId().equals(this.getThingId()) == false)
            return false;
        if (other.getThingTypeName() == null ^ this.getThingTypeName() == null)
            return false;
        if (other.getThingTypeName() != null && other.getThingTypeName().equals(this.getThingTypeName()) == false)
            return false;
        if (other.getThingGroupNames() == null ^ this.getThingGroupNames() == null)
            return false;
        if (other.getThingGroupNames() != null && other.getThingGroupNames().equals(this.getThingGroupNames()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getShadow() == null ^ this.getShadow() == null)
            return false;
        if (other.getShadow() != null && other.getShadow().equals(this.getShadow()) == false)
            return false;
        if (other.getConnectivity() == null ^ this.getConnectivity() == null)
            return false;
        if (other.getConnectivity() != null && other.getConnectivity().equals(this.getConnectivity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode + ((getThingId() == null) ? 0 : getThingId().hashCode());
        hashCode = prime * hashCode + ((getThingTypeName() == null) ? 0 : getThingTypeName().hashCode());
        hashCode = prime * hashCode + ((getThingGroupNames() == null) ? 0 : getThingGroupNames().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getShadow() == null) ? 0 : getShadow().hashCode());
        hashCode = prime * hashCode + ((getConnectivity() == null) ? 0 : getConnectivity().hashCode());
        return hashCode;
    }

    @Override
    public ThingDocument clone() {
        try {
            return (ThingDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.ThingDocumentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
