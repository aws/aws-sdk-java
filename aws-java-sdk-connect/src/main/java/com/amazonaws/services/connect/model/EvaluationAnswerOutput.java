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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about output answers for a contact evaluation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/EvaluationAnswerOutput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationAnswerOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value for an answer in a contact evaluation.
     * </p>
     */
    private EvaluationAnswerData value;
    /**
     * <p>
     * The system suggested value for an answer in a contact evaluation.
     * </p>
     */
    private EvaluationAnswerData systemSuggestedValue;

    /**
     * <p>
     * The value for an answer in a contact evaluation.
     * </p>
     * 
     * @param value
     *        The value for an answer in a contact evaluation.
     */

    public void setValue(EvaluationAnswerData value) {
        this.value = value;
    }

    /**
     * <p>
     * The value for an answer in a contact evaluation.
     * </p>
     * 
     * @return The value for an answer in a contact evaluation.
     */

    public EvaluationAnswerData getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value for an answer in a contact evaluation.
     * </p>
     * 
     * @param value
     *        The value for an answer in a contact evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationAnswerOutput withValue(EvaluationAnswerData value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The system suggested value for an answer in a contact evaluation.
     * </p>
     * 
     * @param systemSuggestedValue
     *        The system suggested value for an answer in a contact evaluation.
     */

    public void setSystemSuggestedValue(EvaluationAnswerData systemSuggestedValue) {
        this.systemSuggestedValue = systemSuggestedValue;
    }

    /**
     * <p>
     * The system suggested value for an answer in a contact evaluation.
     * </p>
     * 
     * @return The system suggested value for an answer in a contact evaluation.
     */

    public EvaluationAnswerData getSystemSuggestedValue() {
        return this.systemSuggestedValue;
    }

    /**
     * <p>
     * The system suggested value for an answer in a contact evaluation.
     * </p>
     * 
     * @param systemSuggestedValue
     *        The system suggested value for an answer in a contact evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationAnswerOutput withSystemSuggestedValue(EvaluationAnswerData systemSuggestedValue) {
        setSystemSuggestedValue(systemSuggestedValue);
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getSystemSuggestedValue() != null)
            sb.append("SystemSuggestedValue: ").append(getSystemSuggestedValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationAnswerOutput == false)
            return false;
        EvaluationAnswerOutput other = (EvaluationAnswerOutput) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getSystemSuggestedValue() == null ^ this.getSystemSuggestedValue() == null)
            return false;
        if (other.getSystemSuggestedValue() != null && other.getSystemSuggestedValue().equals(this.getSystemSuggestedValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getSystemSuggestedValue() == null) ? 0 : getSystemSuggestedValue().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationAnswerOutput clone() {
        try {
            return (EvaluationAnswerOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.EvaluationAnswerOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
