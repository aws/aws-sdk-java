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
 * Information about properties for a question in an evaluation form. The question type properties must be either for a
 * numeric question or a single select question.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/EvaluationFormQuestionTypeProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationFormQuestionTypeProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The properties of the numeric question.
     * </p>
     */
    private EvaluationFormNumericQuestionProperties numeric;
    /**
     * <p>
     * The properties of the numeric question.
     * </p>
     */
    private EvaluationFormSingleSelectQuestionProperties singleSelect;

    /**
     * <p>
     * The properties of the numeric question.
     * </p>
     * 
     * @param numeric
     *        The properties of the numeric question.
     */

    public void setNumeric(EvaluationFormNumericQuestionProperties numeric) {
        this.numeric = numeric;
    }

    /**
     * <p>
     * The properties of the numeric question.
     * </p>
     * 
     * @return The properties of the numeric question.
     */

    public EvaluationFormNumericQuestionProperties getNumeric() {
        return this.numeric;
    }

    /**
     * <p>
     * The properties of the numeric question.
     * </p>
     * 
     * @param numeric
     *        The properties of the numeric question.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormQuestionTypeProperties withNumeric(EvaluationFormNumericQuestionProperties numeric) {
        setNumeric(numeric);
        return this;
    }

    /**
     * <p>
     * The properties of the numeric question.
     * </p>
     * 
     * @param singleSelect
     *        The properties of the numeric question.
     */

    public void setSingleSelect(EvaluationFormSingleSelectQuestionProperties singleSelect) {
        this.singleSelect = singleSelect;
    }

    /**
     * <p>
     * The properties of the numeric question.
     * </p>
     * 
     * @return The properties of the numeric question.
     */

    public EvaluationFormSingleSelectQuestionProperties getSingleSelect() {
        return this.singleSelect;
    }

    /**
     * <p>
     * The properties of the numeric question.
     * </p>
     * 
     * @param singleSelect
     *        The properties of the numeric question.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormQuestionTypeProperties withSingleSelect(EvaluationFormSingleSelectQuestionProperties singleSelect) {
        setSingleSelect(singleSelect);
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
        if (getNumeric() != null)
            sb.append("Numeric: ").append(getNumeric()).append(",");
        if (getSingleSelect() != null)
            sb.append("SingleSelect: ").append(getSingleSelect());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationFormQuestionTypeProperties == false)
            return false;
        EvaluationFormQuestionTypeProperties other = (EvaluationFormQuestionTypeProperties) obj;
        if (other.getNumeric() == null ^ this.getNumeric() == null)
            return false;
        if (other.getNumeric() != null && other.getNumeric().equals(this.getNumeric()) == false)
            return false;
        if (other.getSingleSelect() == null ^ this.getSingleSelect() == null)
            return false;
        if (other.getSingleSelect() != null && other.getSingleSelect().equals(this.getSingleSelect()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumeric() == null) ? 0 : getNumeric().hashCode());
        hashCode = prime * hashCode + ((getSingleSelect() == null) ? 0 : getSingleSelect().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationFormQuestionTypeProperties clone() {
        try {
            return (EvaluationFormQuestionTypeProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.EvaluationFormQuestionTypePropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
