/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * An object that returns information about the composite component types of a component type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/CompositeComponentTypeResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CompositeComponentTypeResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * This is the <code>componentTypeId</code> that this <code>compositeComponentType</code> refers to.
     * </p>
     */
    private String componentTypeId;
    /**
     * <p>
     * This boolean indicates whether this <code>compositeComponentType</code> is inherited from its parent.
     * </p>
     */
    private Boolean isInherited;

    /**
     * <p>
     * This is the <code>componentTypeId</code> that this <code>compositeComponentType</code> refers to.
     * </p>
     * 
     * @param componentTypeId
     *        This is the <code>componentTypeId</code> that this <code>compositeComponentType</code> refers to.
     */

    public void setComponentTypeId(String componentTypeId) {
        this.componentTypeId = componentTypeId;
    }

    /**
     * <p>
     * This is the <code>componentTypeId</code> that this <code>compositeComponentType</code> refers to.
     * </p>
     * 
     * @return This is the <code>componentTypeId</code> that this <code>compositeComponentType</code> refers to.
     */

    public String getComponentTypeId() {
        return this.componentTypeId;
    }

    /**
     * <p>
     * This is the <code>componentTypeId</code> that this <code>compositeComponentType</code> refers to.
     * </p>
     * 
     * @param componentTypeId
     *        This is the <code>componentTypeId</code> that this <code>compositeComponentType</code> refers to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompositeComponentTypeResponse withComponentTypeId(String componentTypeId) {
        setComponentTypeId(componentTypeId);
        return this;
    }

    /**
     * <p>
     * This boolean indicates whether this <code>compositeComponentType</code> is inherited from its parent.
     * </p>
     * 
     * @param isInherited
     *        This boolean indicates whether this <code>compositeComponentType</code> is inherited from its parent.
     */

    public void setIsInherited(Boolean isInherited) {
        this.isInherited = isInherited;
    }

    /**
     * <p>
     * This boolean indicates whether this <code>compositeComponentType</code> is inherited from its parent.
     * </p>
     * 
     * @return This boolean indicates whether this <code>compositeComponentType</code> is inherited from its parent.
     */

    public Boolean getIsInherited() {
        return this.isInherited;
    }

    /**
     * <p>
     * This boolean indicates whether this <code>compositeComponentType</code> is inherited from its parent.
     * </p>
     * 
     * @param isInherited
     *        This boolean indicates whether this <code>compositeComponentType</code> is inherited from its parent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompositeComponentTypeResponse withIsInherited(Boolean isInherited) {
        setIsInherited(isInherited);
        return this;
    }

    /**
     * <p>
     * This boolean indicates whether this <code>compositeComponentType</code> is inherited from its parent.
     * </p>
     * 
     * @return This boolean indicates whether this <code>compositeComponentType</code> is inherited from its parent.
     */

    public Boolean isInherited() {
        return this.isInherited;
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
        if (getComponentTypeId() != null)
            sb.append("ComponentTypeId: ").append(getComponentTypeId()).append(",");
        if (getIsInherited() != null)
            sb.append("IsInherited: ").append(getIsInherited());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompositeComponentTypeResponse == false)
            return false;
        CompositeComponentTypeResponse other = (CompositeComponentTypeResponse) obj;
        if (other.getComponentTypeId() == null ^ this.getComponentTypeId() == null)
            return false;
        if (other.getComponentTypeId() != null && other.getComponentTypeId().equals(this.getComponentTypeId()) == false)
            return false;
        if (other.getIsInherited() == null ^ this.getIsInherited() == null)
            return false;
        if (other.getIsInherited() != null && other.getIsInherited().equals(this.getIsInherited()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComponentTypeId() == null) ? 0 : getComponentTypeId().hashCode());
        hashCode = prime * hashCode + ((getIsInherited() == null) ? 0 : getIsInherited().hashCode());
        return hashCode;
    }

    @Override
    public CompositeComponentTypeResponse clone() {
        try {
            return (CompositeComponentTypeResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.CompositeComponentTypeResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
