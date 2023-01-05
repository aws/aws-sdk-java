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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The value to set in a slot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/SlotValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SlotValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value that Amazon Lex determines for the slot. The actual value depends on the setting of the value selection
     * strategy for the bot. You can choose to use the value entered by the user, or you can have Amazon Lex choose the
     * first value in the <code>resolvedValues</code> list.
     * </p>
     */
    private String interpretedValue;

    /**
     * <p>
     * The value that Amazon Lex determines for the slot. The actual value depends on the setting of the value selection
     * strategy for the bot. You can choose to use the value entered by the user, or you can have Amazon Lex choose the
     * first value in the <code>resolvedValues</code> list.
     * </p>
     * 
     * @param interpretedValue
     *        The value that Amazon Lex determines for the slot. The actual value depends on the setting of the value
     *        selection strategy for the bot. You can choose to use the value entered by the user, or you can have
     *        Amazon Lex choose the first value in the <code>resolvedValues</code> list.
     */

    public void setInterpretedValue(String interpretedValue) {
        this.interpretedValue = interpretedValue;
    }

    /**
     * <p>
     * The value that Amazon Lex determines for the slot. The actual value depends on the setting of the value selection
     * strategy for the bot. You can choose to use the value entered by the user, or you can have Amazon Lex choose the
     * first value in the <code>resolvedValues</code> list.
     * </p>
     * 
     * @return The value that Amazon Lex determines for the slot. The actual value depends on the setting of the value
     *         selection strategy for the bot. You can choose to use the value entered by the user, or you can have
     *         Amazon Lex choose the first value in the <code>resolvedValues</code> list.
     */

    public String getInterpretedValue() {
        return this.interpretedValue;
    }

    /**
     * <p>
     * The value that Amazon Lex determines for the slot. The actual value depends on the setting of the value selection
     * strategy for the bot. You can choose to use the value entered by the user, or you can have Amazon Lex choose the
     * first value in the <code>resolvedValues</code> list.
     * </p>
     * 
     * @param interpretedValue
     *        The value that Amazon Lex determines for the slot. The actual value depends on the setting of the value
     *        selection strategy for the bot. You can choose to use the value entered by the user, or you can have
     *        Amazon Lex choose the first value in the <code>resolvedValues</code> list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotValue withInterpretedValue(String interpretedValue) {
        setInterpretedValue(interpretedValue);
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
        if (getInterpretedValue() != null)
            sb.append("InterpretedValue: ").append(getInterpretedValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SlotValue == false)
            return false;
        SlotValue other = (SlotValue) obj;
        if (other.getInterpretedValue() == null ^ this.getInterpretedValue() == null)
            return false;
        if (other.getInterpretedValue() != null && other.getInterpretedValue().equals(this.getInterpretedValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInterpretedValue() == null) ? 0 : getInterpretedValue().hashCode());
        return hashCode;
    }

    @Override
    public SlotValue clone() {
        try {
            return (SlotValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.SlotValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
