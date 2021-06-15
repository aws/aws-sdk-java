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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Indicates whether a slot can return multiple values.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/MultipleValuesSetting"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MultipleValuesSetting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether a slot can return multiple values. When <code>true</code>, the slot may return more than one
     * value in a response. When <code>false</code>, the slot returns only a single value.
     * </p>
     * <p>
     * Multi-value slots are only available in the en-US locale. If you set this value to <code>true</code> in any other
     * locale, Amazon Lex throws a <code>ValidationException</code>.
     * </p>
     * <p>
     * If the <code>allowMutlipleValues</code> is not set, the default value is <code>false</code>.
     * </p>
     */
    private Boolean allowMultipleValues;

    /**
     * <p>
     * Indicates whether a slot can return multiple values. When <code>true</code>, the slot may return more than one
     * value in a response. When <code>false</code>, the slot returns only a single value.
     * </p>
     * <p>
     * Multi-value slots are only available in the en-US locale. If you set this value to <code>true</code> in any other
     * locale, Amazon Lex throws a <code>ValidationException</code>.
     * </p>
     * <p>
     * If the <code>allowMutlipleValues</code> is not set, the default value is <code>false</code>.
     * </p>
     * 
     * @param allowMultipleValues
     *        Indicates whether a slot can return multiple values. When <code>true</code>, the slot may return more than
     *        one value in a response. When <code>false</code>, the slot returns only a single value.</p>
     *        <p>
     *        Multi-value slots are only available in the en-US locale. If you set this value to <code>true</code> in
     *        any other locale, Amazon Lex throws a <code>ValidationException</code>.
     *        </p>
     *        <p>
     *        If the <code>allowMutlipleValues</code> is not set, the default value is <code>false</code>.
     */

    public void setAllowMultipleValues(Boolean allowMultipleValues) {
        this.allowMultipleValues = allowMultipleValues;
    }

    /**
     * <p>
     * Indicates whether a slot can return multiple values. When <code>true</code>, the slot may return more than one
     * value in a response. When <code>false</code>, the slot returns only a single value.
     * </p>
     * <p>
     * Multi-value slots are only available in the en-US locale. If you set this value to <code>true</code> in any other
     * locale, Amazon Lex throws a <code>ValidationException</code>.
     * </p>
     * <p>
     * If the <code>allowMutlipleValues</code> is not set, the default value is <code>false</code>.
     * </p>
     * 
     * @return Indicates whether a slot can return multiple values. When <code>true</code>, the slot may return more
     *         than one value in a response. When <code>false</code>, the slot returns only a single value.</p>
     *         <p>
     *         Multi-value slots are only available in the en-US locale. If you set this value to <code>true</code> in
     *         any other locale, Amazon Lex throws a <code>ValidationException</code>.
     *         </p>
     *         <p>
     *         If the <code>allowMutlipleValues</code> is not set, the default value is <code>false</code>.
     */

    public Boolean getAllowMultipleValues() {
        return this.allowMultipleValues;
    }

    /**
     * <p>
     * Indicates whether a slot can return multiple values. When <code>true</code>, the slot may return more than one
     * value in a response. When <code>false</code>, the slot returns only a single value.
     * </p>
     * <p>
     * Multi-value slots are only available in the en-US locale. If you set this value to <code>true</code> in any other
     * locale, Amazon Lex throws a <code>ValidationException</code>.
     * </p>
     * <p>
     * If the <code>allowMutlipleValues</code> is not set, the default value is <code>false</code>.
     * </p>
     * 
     * @param allowMultipleValues
     *        Indicates whether a slot can return multiple values. When <code>true</code>, the slot may return more than
     *        one value in a response. When <code>false</code>, the slot returns only a single value.</p>
     *        <p>
     *        Multi-value slots are only available in the en-US locale. If you set this value to <code>true</code> in
     *        any other locale, Amazon Lex throws a <code>ValidationException</code>.
     *        </p>
     *        <p>
     *        If the <code>allowMutlipleValues</code> is not set, the default value is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultipleValuesSetting withAllowMultipleValues(Boolean allowMultipleValues) {
        setAllowMultipleValues(allowMultipleValues);
        return this;
    }

    /**
     * <p>
     * Indicates whether a slot can return multiple values. When <code>true</code>, the slot may return more than one
     * value in a response. When <code>false</code>, the slot returns only a single value.
     * </p>
     * <p>
     * Multi-value slots are only available in the en-US locale. If you set this value to <code>true</code> in any other
     * locale, Amazon Lex throws a <code>ValidationException</code>.
     * </p>
     * <p>
     * If the <code>allowMutlipleValues</code> is not set, the default value is <code>false</code>.
     * </p>
     * 
     * @return Indicates whether a slot can return multiple values. When <code>true</code>, the slot may return more
     *         than one value in a response. When <code>false</code>, the slot returns only a single value.</p>
     *         <p>
     *         Multi-value slots are only available in the en-US locale. If you set this value to <code>true</code> in
     *         any other locale, Amazon Lex throws a <code>ValidationException</code>.
     *         </p>
     *         <p>
     *         If the <code>allowMutlipleValues</code> is not set, the default value is <code>false</code>.
     */

    public Boolean isAllowMultipleValues() {
        return this.allowMultipleValues;
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
        if (getAllowMultipleValues() != null)
            sb.append("AllowMultipleValues: ").append(getAllowMultipleValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MultipleValuesSetting == false)
            return false;
        MultipleValuesSetting other = (MultipleValuesSetting) obj;
        if (other.getAllowMultipleValues() == null ^ this.getAllowMultipleValues() == null)
            return false;
        if (other.getAllowMultipleValues() != null && other.getAllowMultipleValues().equals(this.getAllowMultipleValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowMultipleValues() == null) ? 0 : getAllowMultipleValues().hashCode());
        return hashCode;
    }

    @Override
    public MultipleValuesSetting clone() {
        try {
            return (MultipleValuesSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.MultipleValuesSettingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
