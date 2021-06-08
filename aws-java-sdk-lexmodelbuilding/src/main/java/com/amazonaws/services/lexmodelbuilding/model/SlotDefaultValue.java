/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexmodelbuilding.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A default value for a slot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/SlotDefaultValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SlotDefaultValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The default value for the slot. You can specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>#context-name.slot-name</code> - The slot value "slot-name" in the context "context-name."
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>{attribute}</code> - The slot value of the session attribute "attribute."
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>'value'</code> - The discrete value "value."
     * </p>
     * </li>
     * </ul>
     */
    private String defaultValue;

    /**
     * <p>
     * The default value for the slot. You can specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>#context-name.slot-name</code> - The slot value "slot-name" in the context "context-name."
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>{attribute}</code> - The slot value of the session attribute "attribute."
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>'value'</code> - The discrete value "value."
     * </p>
     * </li>
     * </ul>
     * 
     * @param defaultValue
     *        The default value for the slot. You can specify one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>#context-name.slot-name</code> - The slot value "slot-name" in the context "context-name."
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>{attribute}</code> - The slot value of the session attribute "attribute."
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>'value'</code> - The discrete value "value."
     *        </p>
     *        </li>
     */

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default value for the slot. You can specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>#context-name.slot-name</code> - The slot value "slot-name" in the context "context-name."
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>{attribute}</code> - The slot value of the session attribute "attribute."
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>'value'</code> - The discrete value "value."
     * </p>
     * </li>
     * </ul>
     * 
     * @return The default value for the slot. You can specify one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>#context-name.slot-name</code> - The slot value "slot-name" in the context "context-name."
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>{attribute}</code> - The slot value of the session attribute "attribute."
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>'value'</code> - The discrete value "value."
     *         </p>
     *         </li>
     */

    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * <p>
     * The default value for the slot. You can specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>#context-name.slot-name</code> - The slot value "slot-name" in the context "context-name."
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>{attribute}</code> - The slot value of the session attribute "attribute."
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>'value'</code> - The discrete value "value."
     * </p>
     * </li>
     * </ul>
     * 
     * @param defaultValue
     *        The default value for the slot. You can specify one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>#context-name.slot-name</code> - The slot value "slot-name" in the context "context-name."
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>{attribute}</code> - The slot value of the session attribute "attribute."
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>'value'</code> - The discrete value "value."
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotDefaultValue withDefaultValue(String defaultValue) {
        setDefaultValue(defaultValue);
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
        if (getDefaultValue() != null)
            sb.append("DefaultValue: ").append(getDefaultValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SlotDefaultValue == false)
            return false;
        SlotDefaultValue other = (SlotDefaultValue) obj;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        return hashCode;
    }

    @Override
    public SlotDefaultValue clone() {
        try {
            return (SlotDefaultValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelbuilding.model.transform.SlotDefaultValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
