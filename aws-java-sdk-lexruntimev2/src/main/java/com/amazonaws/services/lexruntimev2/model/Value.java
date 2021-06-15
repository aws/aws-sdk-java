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
package com.amazonaws.services.lexruntimev2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The value of a slot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/Value" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Value implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The text of the utterance from the user that was entered for the slot.
     * </p>
     */
    private String originalValue;
    /**
     * <p>
     * The value that Amazon Lex V2 determines for the slot. The actual value depends on the setting of the value
     * selection strategy for the bot. You can choose to use the value entered by the user, or you can have Amazon Lex
     * V2 choose the first value in the <code>resolvedValues</code> list.
     * </p>
     */
    private String interpretedValue;
    /**
     * <p>
     * A list of additional values that have been recognized for the slot.
     * </p>
     */
    private java.util.List<String> resolvedValues;

    /**
     * <p>
     * The text of the utterance from the user that was entered for the slot.
     * </p>
     * 
     * @param originalValue
     *        The text of the utterance from the user that was entered for the slot.
     */

    public void setOriginalValue(String originalValue) {
        this.originalValue = originalValue;
    }

    /**
     * <p>
     * The text of the utterance from the user that was entered for the slot.
     * </p>
     * 
     * @return The text of the utterance from the user that was entered for the slot.
     */

    public String getOriginalValue() {
        return this.originalValue;
    }

    /**
     * <p>
     * The text of the utterance from the user that was entered for the slot.
     * </p>
     * 
     * @param originalValue
     *        The text of the utterance from the user that was entered for the slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Value withOriginalValue(String originalValue) {
        setOriginalValue(originalValue);
        return this;
    }

    /**
     * <p>
     * The value that Amazon Lex V2 determines for the slot. The actual value depends on the setting of the value
     * selection strategy for the bot. You can choose to use the value entered by the user, or you can have Amazon Lex
     * V2 choose the first value in the <code>resolvedValues</code> list.
     * </p>
     * 
     * @param interpretedValue
     *        The value that Amazon Lex V2 determines for the slot. The actual value depends on the setting of the value
     *        selection strategy for the bot. You can choose to use the value entered by the user, or you can have
     *        Amazon Lex V2 choose the first value in the <code>resolvedValues</code> list.
     */

    public void setInterpretedValue(String interpretedValue) {
        this.interpretedValue = interpretedValue;
    }

    /**
     * <p>
     * The value that Amazon Lex V2 determines for the slot. The actual value depends on the setting of the value
     * selection strategy for the bot. You can choose to use the value entered by the user, or you can have Amazon Lex
     * V2 choose the first value in the <code>resolvedValues</code> list.
     * </p>
     * 
     * @return The value that Amazon Lex V2 determines for the slot. The actual value depends on the setting of the
     *         value selection strategy for the bot. You can choose to use the value entered by the user, or you can
     *         have Amazon Lex V2 choose the first value in the <code>resolvedValues</code> list.
     */

    public String getInterpretedValue() {
        return this.interpretedValue;
    }

    /**
     * <p>
     * The value that Amazon Lex V2 determines for the slot. The actual value depends on the setting of the value
     * selection strategy for the bot. You can choose to use the value entered by the user, or you can have Amazon Lex
     * V2 choose the first value in the <code>resolvedValues</code> list.
     * </p>
     * 
     * @param interpretedValue
     *        The value that Amazon Lex V2 determines for the slot. The actual value depends on the setting of the value
     *        selection strategy for the bot. You can choose to use the value entered by the user, or you can have
     *        Amazon Lex V2 choose the first value in the <code>resolvedValues</code> list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Value withInterpretedValue(String interpretedValue) {
        setInterpretedValue(interpretedValue);
        return this;
    }

    /**
     * <p>
     * A list of additional values that have been recognized for the slot.
     * </p>
     * 
     * @return A list of additional values that have been recognized for the slot.
     */

    public java.util.List<String> getResolvedValues() {
        return resolvedValues;
    }

    /**
     * <p>
     * A list of additional values that have been recognized for the slot.
     * </p>
     * 
     * @param resolvedValues
     *        A list of additional values that have been recognized for the slot.
     */

    public void setResolvedValues(java.util.Collection<String> resolvedValues) {
        if (resolvedValues == null) {
            this.resolvedValues = null;
            return;
        }

        this.resolvedValues = new java.util.ArrayList<String>(resolvedValues);
    }

    /**
     * <p>
     * A list of additional values that have been recognized for the slot.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResolvedValues(java.util.Collection)} or {@link #withResolvedValues(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resolvedValues
     *        A list of additional values that have been recognized for the slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Value withResolvedValues(String... resolvedValues) {
        if (this.resolvedValues == null) {
            setResolvedValues(new java.util.ArrayList<String>(resolvedValues.length));
        }
        for (String ele : resolvedValues) {
            this.resolvedValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of additional values that have been recognized for the slot.
     * </p>
     * 
     * @param resolvedValues
     *        A list of additional values that have been recognized for the slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Value withResolvedValues(java.util.Collection<String> resolvedValues) {
        setResolvedValues(resolvedValues);
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
        if (getOriginalValue() != null)
            sb.append("OriginalValue: ").append(getOriginalValue()).append(",");
        if (getInterpretedValue() != null)
            sb.append("InterpretedValue: ").append(getInterpretedValue()).append(",");
        if (getResolvedValues() != null)
            sb.append("ResolvedValues: ").append(getResolvedValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Value == false)
            return false;
        Value other = (Value) obj;
        if (other.getOriginalValue() == null ^ this.getOriginalValue() == null)
            return false;
        if (other.getOriginalValue() != null && other.getOriginalValue().equals(this.getOriginalValue()) == false)
            return false;
        if (other.getInterpretedValue() == null ^ this.getInterpretedValue() == null)
            return false;
        if (other.getInterpretedValue() != null && other.getInterpretedValue().equals(this.getInterpretedValue()) == false)
            return false;
        if (other.getResolvedValues() == null ^ this.getResolvedValues() == null)
            return false;
        if (other.getResolvedValues() != null && other.getResolvedValues().equals(this.getResolvedValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOriginalValue() == null) ? 0 : getOriginalValue().hashCode());
        hashCode = prime * hashCode + ((getInterpretedValue() == null) ? 0 : getInterpretedValue().hashCode());
        hashCode = prime * hashCode + ((getResolvedValues() == null) ? 0 : getResolvedValues().hashCode());
        return hashCode;
    }

    @Override
    public Value clone() {
        try {
            return (Value) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexruntimev2.model.transform.ValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
