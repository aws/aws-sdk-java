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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ComponentPropertyGroupRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComponentPropertyGroupRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The group type.
     * </p>
     */
    private String groupType;
    /**
     * <p>
     * The property names.
     * </p>
     */
    private java.util.List<String> propertyNames;
    /**
     * <p>
     * The update type.
     * </p>
     */
    private String updateType;

    /**
     * <p>
     * The group type.
     * </p>
     * 
     * @param groupType
     *        The group type.
     * @see GroupType
     */

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    /**
     * <p>
     * The group type.
     * </p>
     * 
     * @return The group type.
     * @see GroupType
     */

    public String getGroupType() {
        return this.groupType;
    }

    /**
     * <p>
     * The group type.
     * </p>
     * 
     * @param groupType
     *        The group type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GroupType
     */

    public ComponentPropertyGroupRequest withGroupType(String groupType) {
        setGroupType(groupType);
        return this;
    }

    /**
     * <p>
     * The group type.
     * </p>
     * 
     * @param groupType
     *        The group type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GroupType
     */

    public ComponentPropertyGroupRequest withGroupType(GroupType groupType) {
        this.groupType = groupType.toString();
        return this;
    }

    /**
     * <p>
     * The property names.
     * </p>
     * 
     * @return The property names.
     */

    public java.util.List<String> getPropertyNames() {
        return propertyNames;
    }

    /**
     * <p>
     * The property names.
     * </p>
     * 
     * @param propertyNames
     *        The property names.
     */

    public void setPropertyNames(java.util.Collection<String> propertyNames) {
        if (propertyNames == null) {
            this.propertyNames = null;
            return;
        }

        this.propertyNames = new java.util.ArrayList<String>(propertyNames);
    }

    /**
     * <p>
     * The property names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPropertyNames(java.util.Collection)} or {@link #withPropertyNames(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param propertyNames
     *        The property names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentPropertyGroupRequest withPropertyNames(String... propertyNames) {
        if (this.propertyNames == null) {
            setPropertyNames(new java.util.ArrayList<String>(propertyNames.length));
        }
        for (String ele : propertyNames) {
            this.propertyNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The property names.
     * </p>
     * 
     * @param propertyNames
     *        The property names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentPropertyGroupRequest withPropertyNames(java.util.Collection<String> propertyNames) {
        setPropertyNames(propertyNames);
        return this;
    }

    /**
     * <p>
     * The update type.
     * </p>
     * 
     * @param updateType
     *        The update type.
     * @see PropertyGroupUpdateType
     */

    public void setUpdateType(String updateType) {
        this.updateType = updateType;
    }

    /**
     * <p>
     * The update type.
     * </p>
     * 
     * @return The update type.
     * @see PropertyGroupUpdateType
     */

    public String getUpdateType() {
        return this.updateType;
    }

    /**
     * <p>
     * The update type.
     * </p>
     * 
     * @param updateType
     *        The update type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PropertyGroupUpdateType
     */

    public ComponentPropertyGroupRequest withUpdateType(String updateType) {
        setUpdateType(updateType);
        return this;
    }

    /**
     * <p>
     * The update type.
     * </p>
     * 
     * @param updateType
     *        The update type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PropertyGroupUpdateType
     */

    public ComponentPropertyGroupRequest withUpdateType(PropertyGroupUpdateType updateType) {
        this.updateType = updateType.toString();
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
        if (getGroupType() != null)
            sb.append("GroupType: ").append(getGroupType()).append(",");
        if (getPropertyNames() != null)
            sb.append("PropertyNames: ").append(getPropertyNames()).append(",");
        if (getUpdateType() != null)
            sb.append("UpdateType: ").append(getUpdateType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComponentPropertyGroupRequest == false)
            return false;
        ComponentPropertyGroupRequest other = (ComponentPropertyGroupRequest) obj;
        if (other.getGroupType() == null ^ this.getGroupType() == null)
            return false;
        if (other.getGroupType() != null && other.getGroupType().equals(this.getGroupType()) == false)
            return false;
        if (other.getPropertyNames() == null ^ this.getPropertyNames() == null)
            return false;
        if (other.getPropertyNames() != null && other.getPropertyNames().equals(this.getPropertyNames()) == false)
            return false;
        if (other.getUpdateType() == null ^ this.getUpdateType() == null)
            return false;
        if (other.getUpdateType() != null && other.getUpdateType().equals(this.getUpdateType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupType() == null) ? 0 : getGroupType().hashCode());
        hashCode = prime * hashCode + ((getPropertyNames() == null) ? 0 : getPropertyNames().hashCode());
        hashCode = prime * hashCode + ((getUpdateType() == null) ? 0 : getUpdateType().hashCode());
        return hashCode;
    }

    @Override
    public ComponentPropertyGroupRequest clone() {
        try {
            return (ComponentPropertyGroupRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.ComponentPropertyGroupRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
