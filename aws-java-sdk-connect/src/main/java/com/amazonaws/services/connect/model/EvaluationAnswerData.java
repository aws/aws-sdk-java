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
 * Information about answer data for a contact evaluation. Answer data must be either string, numeric, or not
 * applicable.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/EvaluationAnswerData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationAnswerData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The string value for an answer in a contact evaluation.
     * </p>
     */
    private String stringValue;
    /**
     * <p>
     * The numeric value for an answer in a contact evaluation.
     * </p>
     */
    private Double numericValue;
    /**
     * <p>
     * The flag to mark the question as not applicable.
     * </p>
     */
    private Boolean notApplicable;

    /**
     * <p>
     * The string value for an answer in a contact evaluation.
     * </p>
     * 
     * @param stringValue
     *        The string value for an answer in a contact evaluation.
     */

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    /**
     * <p>
     * The string value for an answer in a contact evaluation.
     * </p>
     * 
     * @return The string value for an answer in a contact evaluation.
     */

    public String getStringValue() {
        return this.stringValue;
    }

    /**
     * <p>
     * The string value for an answer in a contact evaluation.
     * </p>
     * 
     * @param stringValue
     *        The string value for an answer in a contact evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationAnswerData withStringValue(String stringValue) {
        setStringValue(stringValue);
        return this;
    }

    /**
     * <p>
     * The numeric value for an answer in a contact evaluation.
     * </p>
     * 
     * @param numericValue
     *        The numeric value for an answer in a contact evaluation.
     */

    public void setNumericValue(Double numericValue) {
        this.numericValue = numericValue;
    }

    /**
     * <p>
     * The numeric value for an answer in a contact evaluation.
     * </p>
     * 
     * @return The numeric value for an answer in a contact evaluation.
     */

    public Double getNumericValue() {
        return this.numericValue;
    }

    /**
     * <p>
     * The numeric value for an answer in a contact evaluation.
     * </p>
     * 
     * @param numericValue
     *        The numeric value for an answer in a contact evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationAnswerData withNumericValue(Double numericValue) {
        setNumericValue(numericValue);
        return this;
    }

    /**
     * <p>
     * The flag to mark the question as not applicable.
     * </p>
     * 
     * @param notApplicable
     *        The flag to mark the question as not applicable.
     */

    public void setNotApplicable(Boolean notApplicable) {
        this.notApplicable = notApplicable;
    }

    /**
     * <p>
     * The flag to mark the question as not applicable.
     * </p>
     * 
     * @return The flag to mark the question as not applicable.
     */

    public Boolean getNotApplicable() {
        return this.notApplicable;
    }

    /**
     * <p>
     * The flag to mark the question as not applicable.
     * </p>
     * 
     * @param notApplicable
     *        The flag to mark the question as not applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationAnswerData withNotApplicable(Boolean notApplicable) {
        setNotApplicable(notApplicable);
        return this;
    }

    /**
     * <p>
     * The flag to mark the question as not applicable.
     * </p>
     * 
     * @return The flag to mark the question as not applicable.
     */

    public Boolean isNotApplicable() {
        return this.notApplicable;
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
        if (getStringValue() != null)
            sb.append("StringValue: ").append(getStringValue()).append(",");
        if (getNumericValue() != null)
            sb.append("NumericValue: ").append(getNumericValue()).append(",");
        if (getNotApplicable() != null)
            sb.append("NotApplicable: ").append(getNotApplicable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationAnswerData == false)
            return false;
        EvaluationAnswerData other = (EvaluationAnswerData) obj;
        if (other.getStringValue() == null ^ this.getStringValue() == null)
            return false;
        if (other.getStringValue() != null && other.getStringValue().equals(this.getStringValue()) == false)
            return false;
        if (other.getNumericValue() == null ^ this.getNumericValue() == null)
            return false;
        if (other.getNumericValue() != null && other.getNumericValue().equals(this.getNumericValue()) == false)
            return false;
        if (other.getNotApplicable() == null ^ this.getNotApplicable() == null)
            return false;
        if (other.getNotApplicable() != null && other.getNotApplicable().equals(this.getNotApplicable()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStringValue() == null) ? 0 : getStringValue().hashCode());
        hashCode = prime * hashCode + ((getNumericValue() == null) ? 0 : getNumericValue().hashCode());
        hashCode = prime * hashCode + ((getNotApplicable() == null) ? 0 : getNotApplicable().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationAnswerData clone() {
        try {
            return (EvaluationAnswerData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.EvaluationAnswerDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
