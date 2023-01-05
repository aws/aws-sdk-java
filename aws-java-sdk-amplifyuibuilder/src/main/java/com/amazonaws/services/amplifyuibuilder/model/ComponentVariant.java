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
package com.amazonaws.services.amplifyuibuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the style configuration of a unique variation of a main component.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ComponentVariant" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComponentVariant implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The properties of the component variant that can be overriden when customizing an instance of the component. You
     * can't specify <code>tags</code> as a valid property for <code>overrides</code>.
     * </p>
     */
    private java.util.Map<String, java.util.Map<String, String>> overrides;
    /**
     * <p>
     * The combination of variants that comprise this variant. You can't specify <code>tags</code> as a valid property
     * for <code>variantValues</code>.
     * </p>
     */
    private java.util.Map<String, String> variantValues;

    /**
     * <p>
     * The properties of the component variant that can be overriden when customizing an instance of the component. You
     * can't specify <code>tags</code> as a valid property for <code>overrides</code>.
     * </p>
     * 
     * @return The properties of the component variant that can be overriden when customizing an instance of the
     *         component. You can't specify <code>tags</code> as a valid property for <code>overrides</code>.
     */

    public java.util.Map<String, java.util.Map<String, String>> getOverrides() {
        return overrides;
    }

    /**
     * <p>
     * The properties of the component variant that can be overriden when customizing an instance of the component. You
     * can't specify <code>tags</code> as a valid property for <code>overrides</code>.
     * </p>
     * 
     * @param overrides
     *        The properties of the component variant that can be overriden when customizing an instance of the
     *        component. You can't specify <code>tags</code> as a valid property for <code>overrides</code>.
     */

    public void setOverrides(java.util.Map<String, java.util.Map<String, String>> overrides) {
        this.overrides = overrides;
    }

    /**
     * <p>
     * The properties of the component variant that can be overriden when customizing an instance of the component. You
     * can't specify <code>tags</code> as a valid property for <code>overrides</code>.
     * </p>
     * 
     * @param overrides
     *        The properties of the component variant that can be overriden when customizing an instance of the
     *        component. You can't specify <code>tags</code> as a valid property for <code>overrides</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentVariant withOverrides(java.util.Map<String, java.util.Map<String, String>> overrides) {
        setOverrides(overrides);
        return this;
    }

    /**
     * Add a single Overrides entry
     *
     * @see ComponentVariant#withOverrides
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ComponentVariant addOverridesEntry(String key, java.util.Map<String, String> value) {
        if (null == this.overrides) {
            this.overrides = new java.util.HashMap<String, java.util.Map<String, String>>();
        }
        if (this.overrides.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.overrides.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Overrides.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentVariant clearOverridesEntries() {
        this.overrides = null;
        return this;
    }

    /**
     * <p>
     * The combination of variants that comprise this variant. You can't specify <code>tags</code> as a valid property
     * for <code>variantValues</code>.
     * </p>
     * 
     * @return The combination of variants that comprise this variant. You can't specify <code>tags</code> as a valid
     *         property for <code>variantValues</code>.
     */

    public java.util.Map<String, String> getVariantValues() {
        return variantValues;
    }

    /**
     * <p>
     * The combination of variants that comprise this variant. You can't specify <code>tags</code> as a valid property
     * for <code>variantValues</code>.
     * </p>
     * 
     * @param variantValues
     *        The combination of variants that comprise this variant. You can't specify <code>tags</code> as a valid
     *        property for <code>variantValues</code>.
     */

    public void setVariantValues(java.util.Map<String, String> variantValues) {
        this.variantValues = variantValues;
    }

    /**
     * <p>
     * The combination of variants that comprise this variant. You can't specify <code>tags</code> as a valid property
     * for <code>variantValues</code>.
     * </p>
     * 
     * @param variantValues
     *        The combination of variants that comprise this variant. You can't specify <code>tags</code> as a valid
     *        property for <code>variantValues</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentVariant withVariantValues(java.util.Map<String, String> variantValues) {
        setVariantValues(variantValues);
        return this;
    }

    /**
     * Add a single VariantValues entry
     *
     * @see ComponentVariant#withVariantValues
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ComponentVariant addVariantValuesEntry(String key, String value) {
        if (null == this.variantValues) {
            this.variantValues = new java.util.HashMap<String, String>();
        }
        if (this.variantValues.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.variantValues.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into VariantValues.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentVariant clearVariantValuesEntries() {
        this.variantValues = null;
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
        if (getOverrides() != null)
            sb.append("Overrides: ").append(getOverrides()).append(",");
        if (getVariantValues() != null)
            sb.append("VariantValues: ").append(getVariantValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComponentVariant == false)
            return false;
        ComponentVariant other = (ComponentVariant) obj;
        if (other.getOverrides() == null ^ this.getOverrides() == null)
            return false;
        if (other.getOverrides() != null && other.getOverrides().equals(this.getOverrides()) == false)
            return false;
        if (other.getVariantValues() == null ^ this.getVariantValues() == null)
            return false;
        if (other.getVariantValues() != null && other.getVariantValues().equals(this.getVariantValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOverrides() == null) ? 0 : getOverrides().hashCode());
        hashCode = prime * hashCode + ((getVariantValues() == null) ? 0 : getVariantValues().hashCode());
        return hashCode;
    }

    @Override
    public ComponentVariant clone() {
        try {
            return (ComponentVariant) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.ComponentVariantMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
