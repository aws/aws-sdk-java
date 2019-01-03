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
 * The thing group search index document.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThingGroupDocument implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The thing group name.
     * </p>
     */
    private String thingGroupName;
    /**
     * <p>
     * The thing group ID.
     * </p>
     */
    private String thingGroupId;
    /**
     * <p>
     * The thing group description.
     * </p>
     */
    private String thingGroupDescription;
    /**
     * <p>
     * The thing group attributes.
     * </p>
     */
    private java.util.Map<String, String> attributes;
    /**
     * <p>
     * Parent group names.
     * </p>
     */
    private java.util.List<String> parentGroupNames;

    /**
     * <p>
     * The thing group name.
     * </p>
     * 
     * @param thingGroupName
     *        The thing group name.
     */

    public void setThingGroupName(String thingGroupName) {
        this.thingGroupName = thingGroupName;
    }

    /**
     * <p>
     * The thing group name.
     * </p>
     * 
     * @return The thing group name.
     */

    public String getThingGroupName() {
        return this.thingGroupName;
    }

    /**
     * <p>
     * The thing group name.
     * </p>
     * 
     * @param thingGroupName
     *        The thing group name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingGroupDocument withThingGroupName(String thingGroupName) {
        setThingGroupName(thingGroupName);
        return this;
    }

    /**
     * <p>
     * The thing group ID.
     * </p>
     * 
     * @param thingGroupId
     *        The thing group ID.
     */

    public void setThingGroupId(String thingGroupId) {
        this.thingGroupId = thingGroupId;
    }

    /**
     * <p>
     * The thing group ID.
     * </p>
     * 
     * @return The thing group ID.
     */

    public String getThingGroupId() {
        return this.thingGroupId;
    }

    /**
     * <p>
     * The thing group ID.
     * </p>
     * 
     * @param thingGroupId
     *        The thing group ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingGroupDocument withThingGroupId(String thingGroupId) {
        setThingGroupId(thingGroupId);
        return this;
    }

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

    public ThingGroupDocument withThingGroupDescription(String thingGroupDescription) {
        setThingGroupDescription(thingGroupDescription);
        return this;
    }

    /**
     * <p>
     * The thing group attributes.
     * </p>
     * 
     * @return The thing group attributes.
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The thing group attributes.
     * </p>
     * 
     * @param attributes
     *        The thing group attributes.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * The thing group attributes.
     * </p>
     * 
     * @param attributes
     *        The thing group attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingGroupDocument withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    public ThingGroupDocument addAttributesEntry(String key, String value) {
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

    public ThingGroupDocument clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * Parent group names.
     * </p>
     * 
     * @return Parent group names.
     */

    public java.util.List<String> getParentGroupNames() {
        return parentGroupNames;
    }

    /**
     * <p>
     * Parent group names.
     * </p>
     * 
     * @param parentGroupNames
     *        Parent group names.
     */

    public void setParentGroupNames(java.util.Collection<String> parentGroupNames) {
        if (parentGroupNames == null) {
            this.parentGroupNames = null;
            return;
        }

        this.parentGroupNames = new java.util.ArrayList<String>(parentGroupNames);
    }

    /**
     * <p>
     * Parent group names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParentGroupNames(java.util.Collection)} or {@link #withParentGroupNames(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param parentGroupNames
     *        Parent group names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingGroupDocument withParentGroupNames(String... parentGroupNames) {
        if (this.parentGroupNames == null) {
            setParentGroupNames(new java.util.ArrayList<String>(parentGroupNames.length));
        }
        for (String ele : parentGroupNames) {
            this.parentGroupNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Parent group names.
     * </p>
     * 
     * @param parentGroupNames
     *        Parent group names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingGroupDocument withParentGroupNames(java.util.Collection<String> parentGroupNames) {
        setParentGroupNames(parentGroupNames);
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
        if (getThingGroupName() != null)
            sb.append("ThingGroupName: ").append(getThingGroupName()).append(",");
        if (getThingGroupId() != null)
            sb.append("ThingGroupId: ").append(getThingGroupId()).append(",");
        if (getThingGroupDescription() != null)
            sb.append("ThingGroupDescription: ").append(getThingGroupDescription()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getParentGroupNames() != null)
            sb.append("ParentGroupNames: ").append(getParentGroupNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThingGroupDocument == false)
            return false;
        ThingGroupDocument other = (ThingGroupDocument) obj;
        if (other.getThingGroupName() == null ^ this.getThingGroupName() == null)
            return false;
        if (other.getThingGroupName() != null && other.getThingGroupName().equals(this.getThingGroupName()) == false)
            return false;
        if (other.getThingGroupId() == null ^ this.getThingGroupId() == null)
            return false;
        if (other.getThingGroupId() != null && other.getThingGroupId().equals(this.getThingGroupId()) == false)
            return false;
        if (other.getThingGroupDescription() == null ^ this.getThingGroupDescription() == null)
            return false;
        if (other.getThingGroupDescription() != null && other.getThingGroupDescription().equals(this.getThingGroupDescription()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getParentGroupNames() == null ^ this.getParentGroupNames() == null)
            return false;
        if (other.getParentGroupNames() != null && other.getParentGroupNames().equals(this.getParentGroupNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingGroupName() == null) ? 0 : getThingGroupName().hashCode());
        hashCode = prime * hashCode + ((getThingGroupId() == null) ? 0 : getThingGroupId().hashCode());
        hashCode = prime * hashCode + ((getThingGroupDescription() == null) ? 0 : getThingGroupDescription().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getParentGroupNames() == null) ? 0 : getParentGroupNames().hashCode());
        return hashCode;
    }

    @Override
    public ThingGroupDocument clone() {
        try {
            return (ThingGroupDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.ThingGroupDocumentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
