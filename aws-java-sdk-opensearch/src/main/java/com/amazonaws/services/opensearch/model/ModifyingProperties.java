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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the domain properties that are currently being modified.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyingProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the property that is currently being modified.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The current value of the domain property that is being modified.
     * </p>
     */
    private String activeValue;
    /**
     * <p>
     * The value that the property that is currently being modified will eventually have.
     * </p>
     */
    private String pendingValue;
    /**
     * <p>
     * The type of value that is currently being modified. Properties can have two types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PLAIN_TEXT</code>: Contain direct values such as "1", "True", or "c5.large.search".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STRINGIFIED_JSON</code>: Contain content in JSON format, such as {"Enabled":"True"}".
     * </p>
     * </li>
     * </ul>
     */
    private String valueType;

    /**
     * <p>
     * The name of the property that is currently being modified.
     * </p>
     * 
     * @param name
     *        The name of the property that is currently being modified.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the property that is currently being modified.
     * </p>
     * 
     * @return The name of the property that is currently being modified.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the property that is currently being modified.
     * </p>
     * 
     * @param name
     *        The name of the property that is currently being modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyingProperties withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The current value of the domain property that is being modified.
     * </p>
     * 
     * @param activeValue
     *        The current value of the domain property that is being modified.
     */

    public void setActiveValue(String activeValue) {
        this.activeValue = activeValue;
    }

    /**
     * <p>
     * The current value of the domain property that is being modified.
     * </p>
     * 
     * @return The current value of the domain property that is being modified.
     */

    public String getActiveValue() {
        return this.activeValue;
    }

    /**
     * <p>
     * The current value of the domain property that is being modified.
     * </p>
     * 
     * @param activeValue
     *        The current value of the domain property that is being modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyingProperties withActiveValue(String activeValue) {
        setActiveValue(activeValue);
        return this;
    }

    /**
     * <p>
     * The value that the property that is currently being modified will eventually have.
     * </p>
     * 
     * @param pendingValue
     *        The value that the property that is currently being modified will eventually have.
     */

    public void setPendingValue(String pendingValue) {
        this.pendingValue = pendingValue;
    }

    /**
     * <p>
     * The value that the property that is currently being modified will eventually have.
     * </p>
     * 
     * @return The value that the property that is currently being modified will eventually have.
     */

    public String getPendingValue() {
        return this.pendingValue;
    }

    /**
     * <p>
     * The value that the property that is currently being modified will eventually have.
     * </p>
     * 
     * @param pendingValue
     *        The value that the property that is currently being modified will eventually have.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyingProperties withPendingValue(String pendingValue) {
        setPendingValue(pendingValue);
        return this;
    }

    /**
     * <p>
     * The type of value that is currently being modified. Properties can have two types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PLAIN_TEXT</code>: Contain direct values such as "1", "True", or "c5.large.search".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STRINGIFIED_JSON</code>: Contain content in JSON format, such as {"Enabled":"True"}".
     * </p>
     * </li>
     * </ul>
     * 
     * @param valueType
     *        The type of value that is currently being modified. Properties can have two types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PLAIN_TEXT</code>: Contain direct values such as "1", "True", or "c5.large.search".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STRINGIFIED_JSON</code>: Contain content in JSON format, such as {"Enabled":"True"}".
     *        </p>
     *        </li>
     * @see PropertyValueType
     */

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    /**
     * <p>
     * The type of value that is currently being modified. Properties can have two types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PLAIN_TEXT</code>: Contain direct values such as "1", "True", or "c5.large.search".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STRINGIFIED_JSON</code>: Contain content in JSON format, such as {"Enabled":"True"}".
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of value that is currently being modified. Properties can have two types:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PLAIN_TEXT</code>: Contain direct values such as "1", "True", or "c5.large.search".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STRINGIFIED_JSON</code>: Contain content in JSON format, such as {"Enabled":"True"}".
     *         </p>
     *         </li>
     * @see PropertyValueType
     */

    public String getValueType() {
        return this.valueType;
    }

    /**
     * <p>
     * The type of value that is currently being modified. Properties can have two types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PLAIN_TEXT</code>: Contain direct values such as "1", "True", or "c5.large.search".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STRINGIFIED_JSON</code>: Contain content in JSON format, such as {"Enabled":"True"}".
     * </p>
     * </li>
     * </ul>
     * 
     * @param valueType
     *        The type of value that is currently being modified. Properties can have two types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PLAIN_TEXT</code>: Contain direct values such as "1", "True", or "c5.large.search".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STRINGIFIED_JSON</code>: Contain content in JSON format, such as {"Enabled":"True"}".
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PropertyValueType
     */

    public ModifyingProperties withValueType(String valueType) {
        setValueType(valueType);
        return this;
    }

    /**
     * <p>
     * The type of value that is currently being modified. Properties can have two types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PLAIN_TEXT</code>: Contain direct values such as "1", "True", or "c5.large.search".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STRINGIFIED_JSON</code>: Contain content in JSON format, such as {"Enabled":"True"}".
     * </p>
     * </li>
     * </ul>
     * 
     * @param valueType
     *        The type of value that is currently being modified. Properties can have two types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PLAIN_TEXT</code>: Contain direct values such as "1", "True", or "c5.large.search".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STRINGIFIED_JSON</code>: Contain content in JSON format, such as {"Enabled":"True"}".
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PropertyValueType
     */

    public ModifyingProperties withValueType(PropertyValueType valueType) {
        this.valueType = valueType.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getActiveValue() != null)
            sb.append("ActiveValue: ").append(getActiveValue()).append(",");
        if (getPendingValue() != null)
            sb.append("PendingValue: ").append(getPendingValue()).append(",");
        if (getValueType() != null)
            sb.append("ValueType: ").append(getValueType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyingProperties == false)
            return false;
        ModifyingProperties other = (ModifyingProperties) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getActiveValue() == null ^ this.getActiveValue() == null)
            return false;
        if (other.getActiveValue() != null && other.getActiveValue().equals(this.getActiveValue()) == false)
            return false;
        if (other.getPendingValue() == null ^ this.getPendingValue() == null)
            return false;
        if (other.getPendingValue() != null && other.getPendingValue().equals(this.getPendingValue()) == false)
            return false;
        if (other.getValueType() == null ^ this.getValueType() == null)
            return false;
        if (other.getValueType() != null && other.getValueType().equals(this.getValueType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getActiveValue() == null) ? 0 : getActiveValue().hashCode());
        hashCode = prime * hashCode + ((getPendingValue() == null) ? 0 : getPendingValue().hashCode());
        hashCode = prime * hashCode + ((getValueType() == null) ? 0 : getValueType().hashCode());
        return hashCode;
    }

    @Override
    public ModifyingProperties clone() {
        try {
            return (ModifyingProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.ModifyingPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
