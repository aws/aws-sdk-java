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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the step associated with a finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/Step" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Step implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The component ID.
     * </p>
     */
    private String componentId;
    /**
     * <p>
     * The component type.
     * </p>
     */
    private String componentType;

    /**
     * <p>
     * The component ID.
     * </p>
     * 
     * @param componentId
     *        The component ID.
     */

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    /**
     * <p>
     * The component ID.
     * </p>
     * 
     * @return The component ID.
     */

    public String getComponentId() {
        return this.componentId;
    }

    /**
     * <p>
     * The component ID.
     * </p>
     * 
     * @param componentId
     *        The component ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step withComponentId(String componentId) {
        setComponentId(componentId);
        return this;
    }

    /**
     * <p>
     * The component type.
     * </p>
     * 
     * @param componentType
     *        The component type.
     */

    public void setComponentType(String componentType) {
        this.componentType = componentType;
    }

    /**
     * <p>
     * The component type.
     * </p>
     * 
     * @return The component type.
     */

    public String getComponentType() {
        return this.componentType;
    }

    /**
     * <p>
     * The component type.
     * </p>
     * 
     * @param componentType
     *        The component type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step withComponentType(String componentType) {
        setComponentType(componentType);
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
        if (getComponentId() != null)
            sb.append("ComponentId: ").append(getComponentId()).append(",");
        if (getComponentType() != null)
            sb.append("ComponentType: ").append(getComponentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Step == false)
            return false;
        Step other = (Step) obj;
        if (other.getComponentId() == null ^ this.getComponentId() == null)
            return false;
        if (other.getComponentId() != null && other.getComponentId().equals(this.getComponentId()) == false)
            return false;
        if (other.getComponentType() == null ^ this.getComponentType() == null)
            return false;
        if (other.getComponentType() != null && other.getComponentType().equals(this.getComponentType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComponentId() == null) ? 0 : getComponentId().hashCode());
        hashCode = prime * hashCode + ((getComponentType() == null) ? 0 : getComponentType().hashCode());
        return hashCode;
    }

    @Override
    public Step clone() {
        try {
            return (Step) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.StepMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
