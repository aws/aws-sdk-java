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
package com.amazonaws.services.verifiedpermissions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The value of an attribute.
 * </p>
 * <p>
 * Contains information about the runtime context for a request for which an authorization decision is made.
 * </p>
 * <p>
 * This data type is used as a member of the <a
 * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_ContextDefinition.html"
 * >ContextDefinition</a> structure which is uses as a request parameter for the <a
 * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_IsAuthorized.html">IsAuthorized</a>, <a
 * href
 * ="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_BatchIsAuthorized.html">BatchIsAuthorized
 * </a>, and <a
 * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_IsAuthorizedWithToken.html"
 * >IsAuthorizedWithToken</a> operations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/AttributeValue" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttributeValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An attribute value of <a href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#boolean">Boolean</a>
     * type.
     * </p>
     * <p>
     * Example: <code>{"boolean": true}</code>
     * </p>
     */
    private Boolean booleanValue;
    /**
     * <p>
     * An attribute value of type <a
     * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_EntityIdentifier.html"
     * >EntityIdentifier</a>.
     * </p>
     * <p>
     * Example: <code>"entityIdentifier": { "entityId": "&lt;id&gt;", "entityType": "&lt;entity type&gt;"}</code>
     * </p>
     */
    private EntityIdentifier entityIdentifier;
    /**
     * <p>
     * An attribute value of <a href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#long">Long</a> type.
     * </p>
     * <p>
     * Example: <code>{"long": 0}</code>
     * </p>
     */
    private Long longValue;
    /**
     * <p>
     * An attribute value of <a href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#string">String</a>
     * type.
     * </p>
     * <p>
     * Example: <code>{"string": "abc"}</code>
     * </p>
     */
    private String string;
    /**
     * <p>
     * An attribute value of <a href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#set">Set</a> type.
     * </p>
     * <p>
     * Example: <code>{"set": [ {} ] }</code>
     * </p>
     */
    private java.util.List<AttributeValue> set;
    /**
     * <p>
     * An attribute value of <a href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#record">Record</a>
     * type.
     * </p>
     * <p>
     * Example: <code>{"record": { "keyName": {} } }</code>
     * </p>
     */
    private java.util.Map<String, AttributeValue> record;

    /**
     * <p>
     * An attribute value of <a href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#boolean">Boolean</a>
     * type.
     * </p>
     * <p>
     * Example: <code>{"boolean": true}</code>
     * </p>
     * 
     * @param booleanValue
     *        An attribute value of <a
     *        href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#boolean">Boolean</a> type.</p>
     *        <p>
     *        Example: <code>{"boolean": true}</code>
     */

    public void setBoolean(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    /**
     * <p>
     * An attribute value of <a href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#boolean">Boolean</a>
     * type.
     * </p>
     * <p>
     * Example: <code>{"boolean": true}</code>
     * </p>
     * 
     * @return An attribute value of <a
     *         href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#boolean">Boolean</a> type.</p>
     *         <p>
     *         Example: <code>{"boolean": true}</code>
     */

    public Boolean getBoolean() {
        return this.booleanValue;
    }

    /**
     * <p>
     * An attribute value of <a href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#boolean">Boolean</a>
     * type.
     * </p>
     * <p>
     * Example: <code>{"boolean": true}</code>
     * </p>
     * 
     * @param booleanValue
     *        An attribute value of <a
     *        href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#boolean">Boolean</a> type.</p>
     *        <p>
     *        Example: <code>{"boolean": true}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withBoolean(Boolean booleanValue) {
        setBoolean(booleanValue);
        return this;
    }

    /**
     * <p>
     * An attribute value of <a href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#boolean">Boolean</a>
     * type.
     * </p>
     * <p>
     * Example: <code>{"boolean": true}</code>
     * </p>
     * 
     * @return An attribute value of <a
     *         href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#boolean">Boolean</a> type.</p>
     *         <p>
     *         Example: <code>{"boolean": true}</code>
     */

    public Boolean isBoolean() {
        return this.booleanValue;
    }

    /**
     * <p>
     * An attribute value of type <a
     * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_EntityIdentifier.html"
     * >EntityIdentifier</a>.
     * </p>
     * <p>
     * Example: <code>"entityIdentifier": { "entityId": "&lt;id&gt;", "entityType": "&lt;entity type&gt;"}</code>
     * </p>
     * 
     * @param entityIdentifier
     *        An attribute value of type <a
     *        href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_EntityIdentifier.html"
     *        >EntityIdentifier</a>.</p>
     *        <p>
     *        Example: <code>"entityIdentifier": { "entityId": "&lt;id&gt;", "entityType": "&lt;entity type&gt;"}</code>
     */

    public void setEntityIdentifier(EntityIdentifier entityIdentifier) {
        this.entityIdentifier = entityIdentifier;
    }

    /**
     * <p>
     * An attribute value of type <a
     * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_EntityIdentifier.html"
     * >EntityIdentifier</a>.
     * </p>
     * <p>
     * Example: <code>"entityIdentifier": { "entityId": "&lt;id&gt;", "entityType": "&lt;entity type&gt;"}</code>
     * </p>
     * 
     * @return An attribute value of type <a
     *         href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_EntityIdentifier.html"
     *         >EntityIdentifier</a>.</p>
     *         <p>
     *         Example:
     *         <code>"entityIdentifier": { "entityId": "&lt;id&gt;", "entityType": "&lt;entity type&gt;"}</code>
     */

    public EntityIdentifier getEntityIdentifier() {
        return this.entityIdentifier;
    }

    /**
     * <p>
     * An attribute value of type <a
     * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_EntityIdentifier.html"
     * >EntityIdentifier</a>.
     * </p>
     * <p>
     * Example: <code>"entityIdentifier": { "entityId": "&lt;id&gt;", "entityType": "&lt;entity type&gt;"}</code>
     * </p>
     * 
     * @param entityIdentifier
     *        An attribute value of type <a
     *        href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_EntityIdentifier.html"
     *        >EntityIdentifier</a>.</p>
     *        <p>
     *        Example: <code>"entityIdentifier": { "entityId": "&lt;id&gt;", "entityType": "&lt;entity type&gt;"}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withEntityIdentifier(EntityIdentifier entityIdentifier) {
        setEntityIdentifier(entityIdentifier);
        return this;
    }

    /**
     * <p>
     * An attribute value of <a href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#long">Long</a> type.
     * </p>
     * <p>
     * Example: <code>{"long": 0}</code>
     * </p>
     * 
     * @param longValue
     *        An attribute value of <a href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#long">Long</a>
     *        type.</p>
     *        <p>
     *        Example: <code>{"long": 0}</code>
     */

    public void setLong(Long longValue) {
        this.longValue = longValue;
    }

    /**
     * <p>
     * An attribute value of <a href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#long">Long</a> type.
     * </p>
     * <p>
     * Example: <code>{"long": 0}</code>
     * </p>
     * 
     * @return An attribute value of <a href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#long">Long</a>
     *         type.</p>
     *         <p>
     *         Example: <code>{"long": 0}</code>
     */

    public Long getLong() {
        return this.longValue;
    }

    /**
     * <p>
     * An attribute value of <a href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#long">Long</a> type.
     * </p>
     * <p>
     * Example: <code>{"long": 0}</code>
     * </p>
     * 
     * @param longValue
     *        An attribute value of <a href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#long">Long</a>
     *        type.</p>
     *        <p>
     *        Example: <code>{"long": 0}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withLong(Long longValue) {
        setLong(longValue);
        return this;
    }

    /**
     * <p>
     * An attribute value of <a href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#string">String</a>
     * type.
     * </p>
     * <p>
     * Example: <code>{"string": "abc"}</code>
     * </p>
     * 
     * @param string
     *        An attribute value of <a
     *        href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#string">String</a> type.</p>
     *        <p>
     *        Example: <code>{"string": "abc"}</code>
     */

    public void setString(String string) {
        this.string = string;
    }

    /**
     * <p>
     * An attribute value of <a href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#string">String</a>
     * type.
     * </p>
     * <p>
     * Example: <code>{"string": "abc"}</code>
     * </p>
     * 
     * @return An attribute value of <a
     *         href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#string">String</a> type.</p>
     *         <p>
     *         Example: <code>{"string": "abc"}</code>
     */

    public String getString() {
        return this.string;
    }

    /**
     * <p>
     * An attribute value of <a href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#string">String</a>
     * type.
     * </p>
     * <p>
     * Example: <code>{"string": "abc"}</code>
     * </p>
     * 
     * @param string
     *        An attribute value of <a
     *        href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#string">String</a> type.</p>
     *        <p>
     *        Example: <code>{"string": "abc"}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withString(String string) {
        setString(string);
        return this;
    }

    /**
     * <p>
     * An attribute value of <a href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#set">Set</a> type.
     * </p>
     * <p>
     * Example: <code>{"set": [ {} ] }</code>
     * </p>
     * 
     * @return An attribute value of <a href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#set">Set</a>
     *         type.</p>
     *         <p>
     *         Example: <code>{"set": [ {} ] }</code>
     */

    public java.util.List<AttributeValue> getSet() {
        return set;
    }

    /**
     * <p>
     * An attribute value of <a href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#set">Set</a> type.
     * </p>
     * <p>
     * Example: <code>{"set": [ {} ] }</code>
     * </p>
     * 
     * @param set
     *        An attribute value of <a href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#set">Set</a>
     *        type.</p>
     *        <p>
     *        Example: <code>{"set": [ {} ] }</code>
     */

    public void setSet(java.util.Collection<AttributeValue> set) {
        if (set == null) {
            this.set = null;
            return;
        }

        this.set = new java.util.ArrayList<AttributeValue>(set);
    }

    /**
     * <p>
     * An attribute value of <a href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#set">Set</a> type.
     * </p>
     * <p>
     * Example: <code>{"set": [ {} ] }</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSet(java.util.Collection)} or {@link #withSet(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param set
     *        An attribute value of <a href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#set">Set</a>
     *        type.</p>
     *        <p>
     *        Example: <code>{"set": [ {} ] }</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withSet(AttributeValue... set) {
        if (this.set == null) {
            setSet(new java.util.ArrayList<AttributeValue>(set.length));
        }
        for (AttributeValue ele : set) {
            this.set.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An attribute value of <a href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#set">Set</a> type.
     * </p>
     * <p>
     * Example: <code>{"set": [ {} ] }</code>
     * </p>
     * 
     * @param set
     *        An attribute value of <a href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#set">Set</a>
     *        type.</p>
     *        <p>
     *        Example: <code>{"set": [ {} ] }</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withSet(java.util.Collection<AttributeValue> set) {
        setSet(set);
        return this;
    }

    /**
     * <p>
     * An attribute value of <a href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#record">Record</a>
     * type.
     * </p>
     * <p>
     * Example: <code>{"record": { "keyName": {} } }</code>
     * </p>
     * 
     * @return An attribute value of <a
     *         href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#record">Record</a> type.</p>
     *         <p>
     *         Example: <code>{"record": { "keyName": {} } }</code>
     */

    public java.util.Map<String, AttributeValue> getRecord() {
        return record;
    }

    /**
     * <p>
     * An attribute value of <a href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#record">Record</a>
     * type.
     * </p>
     * <p>
     * Example: <code>{"record": { "keyName": {} } }</code>
     * </p>
     * 
     * @param record
     *        An attribute value of <a
     *        href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#record">Record</a> type.</p>
     *        <p>
     *        Example: <code>{"record": { "keyName": {} } }</code>
     */

    public void setRecord(java.util.Map<String, AttributeValue> record) {
        this.record = record;
    }

    /**
     * <p>
     * An attribute value of <a href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#record">Record</a>
     * type.
     * </p>
     * <p>
     * Example: <code>{"record": { "keyName": {} } }</code>
     * </p>
     * 
     * @param record
     *        An attribute value of <a
     *        href="https://docs.cedarpolicy.com/policies/syntax-datatypes.html#record">Record</a> type.</p>
     *        <p>
     *        Example: <code>{"record": { "keyName": {} } }</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withRecord(java.util.Map<String, AttributeValue> record) {
        setRecord(record);
        return this;
    }

    /**
     * Add a single Record entry
     *
     * @see AttributeValue#withRecord
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue addRecordEntry(String key, AttributeValue value) {
        if (null == this.record) {
            this.record = new java.util.HashMap<String, AttributeValue>();
        }
        if (this.record.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.record.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Record.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue clearRecordEntries() {
        this.record = null;
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
        if (getBoolean() != null)
            sb.append("Boolean: ").append("***Sensitive Data Redacted***").append(",");
        if (getEntityIdentifier() != null)
            sb.append("EntityIdentifier: ").append(getEntityIdentifier()).append(",");
        if (getLong() != null)
            sb.append("Long: ").append("***Sensitive Data Redacted***").append(",");
        if (getString() != null)
            sb.append("String: ").append("***Sensitive Data Redacted***").append(",");
        if (getSet() != null)
            sb.append("Set: ").append(getSet()).append(",");
        if (getRecord() != null)
            sb.append("Record: ").append(getRecord());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttributeValue == false)
            return false;
        AttributeValue other = (AttributeValue) obj;
        if (other.getBoolean() == null ^ this.getBoolean() == null)
            return false;
        if (other.getBoolean() != null && other.getBoolean().equals(this.getBoolean()) == false)
            return false;
        if (other.getEntityIdentifier() == null ^ this.getEntityIdentifier() == null)
            return false;
        if (other.getEntityIdentifier() != null && other.getEntityIdentifier().equals(this.getEntityIdentifier()) == false)
            return false;
        if (other.getLong() == null ^ this.getLong() == null)
            return false;
        if (other.getLong() != null && other.getLong().equals(this.getLong()) == false)
            return false;
        if (other.getString() == null ^ this.getString() == null)
            return false;
        if (other.getString() != null && other.getString().equals(this.getString()) == false)
            return false;
        if (other.getSet() == null ^ this.getSet() == null)
            return false;
        if (other.getSet() != null && other.getSet().equals(this.getSet()) == false)
            return false;
        if (other.getRecord() == null ^ this.getRecord() == null)
            return false;
        if (other.getRecord() != null && other.getRecord().equals(this.getRecord()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBoolean() == null) ? 0 : getBoolean().hashCode());
        hashCode = prime * hashCode + ((getEntityIdentifier() == null) ? 0 : getEntityIdentifier().hashCode());
        hashCode = prime * hashCode + ((getLong() == null) ? 0 : getLong().hashCode());
        hashCode = prime * hashCode + ((getString() == null) ? 0 : getString().hashCode());
        hashCode = prime * hashCode + ((getSet() == null) ? 0 : getSet().hashCode());
        hashCode = prime * hashCode + ((getRecord() == null) ? 0 : getRecord().hashCode());
        return hashCode;
    }

    @Override
    public AttributeValue clone() {
        try {
            return (AttributeValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.verifiedpermissions.model.transform.AttributeValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
