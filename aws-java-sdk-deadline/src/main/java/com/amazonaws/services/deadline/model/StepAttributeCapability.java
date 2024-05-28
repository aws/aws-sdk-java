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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The list of step attributes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/StepAttributeCapability" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StepAttributeCapability implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Requires all of the step attribute values.
     * </p>
     */
    private java.util.List<String> allOf;
    /**
     * <p>
     * Requires any of the step attributes in a given list.
     * </p>
     */
    private java.util.List<String> anyOf;
    /**
     * <p>
     * The name of the step attribute.
     * </p>
     */
    private String name;

    /**
     * <p>
     * Requires all of the step attribute values.
     * </p>
     * 
     * @return Requires all of the step attribute values.
     */

    public java.util.List<String> getAllOf() {
        return allOf;
    }

    /**
     * <p>
     * Requires all of the step attribute values.
     * </p>
     * 
     * @param allOf
     *        Requires all of the step attribute values.
     */

    public void setAllOf(java.util.Collection<String> allOf) {
        if (allOf == null) {
            this.allOf = null;
            return;
        }

        this.allOf = new java.util.ArrayList<String>(allOf);
    }

    /**
     * <p>
     * Requires all of the step attribute values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllOf(java.util.Collection)} or {@link #withAllOf(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param allOf
     *        Requires all of the step attribute values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepAttributeCapability withAllOf(String... allOf) {
        if (this.allOf == null) {
            setAllOf(new java.util.ArrayList<String>(allOf.length));
        }
        for (String ele : allOf) {
            this.allOf.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Requires all of the step attribute values.
     * </p>
     * 
     * @param allOf
     *        Requires all of the step attribute values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepAttributeCapability withAllOf(java.util.Collection<String> allOf) {
        setAllOf(allOf);
        return this;
    }

    /**
     * <p>
     * Requires any of the step attributes in a given list.
     * </p>
     * 
     * @return Requires any of the step attributes in a given list.
     */

    public java.util.List<String> getAnyOf() {
        return anyOf;
    }

    /**
     * <p>
     * Requires any of the step attributes in a given list.
     * </p>
     * 
     * @param anyOf
     *        Requires any of the step attributes in a given list.
     */

    public void setAnyOf(java.util.Collection<String> anyOf) {
        if (anyOf == null) {
            this.anyOf = null;
            return;
        }

        this.anyOf = new java.util.ArrayList<String>(anyOf);
    }

    /**
     * <p>
     * Requires any of the step attributes in a given list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnyOf(java.util.Collection)} or {@link #withAnyOf(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param anyOf
     *        Requires any of the step attributes in a given list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepAttributeCapability withAnyOf(String... anyOf) {
        if (this.anyOf == null) {
            setAnyOf(new java.util.ArrayList<String>(anyOf.length));
        }
        for (String ele : anyOf) {
            this.anyOf.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Requires any of the step attributes in a given list.
     * </p>
     * 
     * @param anyOf
     *        Requires any of the step attributes in a given list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepAttributeCapability withAnyOf(java.util.Collection<String> anyOf) {
        setAnyOf(anyOf);
        return this;
    }

    /**
     * <p>
     * The name of the step attribute.
     * </p>
     * 
     * @param name
     *        The name of the step attribute.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the step attribute.
     * </p>
     * 
     * @return The name of the step attribute.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the step attribute.
     * </p>
     * 
     * @param name
     *        The name of the step attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepAttributeCapability withName(String name) {
        setName(name);
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
        if (getAllOf() != null)
            sb.append("AllOf: ").append(getAllOf()).append(",");
        if (getAnyOf() != null)
            sb.append("AnyOf: ").append(getAnyOf()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StepAttributeCapability == false)
            return false;
        StepAttributeCapability other = (StepAttributeCapability) obj;
        if (other.getAllOf() == null ^ this.getAllOf() == null)
            return false;
        if (other.getAllOf() != null && other.getAllOf().equals(this.getAllOf()) == false)
            return false;
        if (other.getAnyOf() == null ^ this.getAnyOf() == null)
            return false;
        if (other.getAnyOf() != null && other.getAnyOf().equals(this.getAnyOf()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllOf() == null) ? 0 : getAllOf().hashCode());
        hashCode = prime * hashCode + ((getAnyOf() == null) ? 0 : getAnyOf().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public StepAttributeCapability clone() {
        try {
            return (StepAttributeCapability) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.StepAttributeCapabilityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
