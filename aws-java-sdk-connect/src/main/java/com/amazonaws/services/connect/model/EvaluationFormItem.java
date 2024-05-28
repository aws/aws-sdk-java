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
 * Information about an item from an evaluation form. The item must be either a section or a question.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/EvaluationFormItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationFormItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The information of the section.
     * </p>
     */
    private EvaluationFormSection section;
    /**
     * <p>
     * The information of the question.
     * </p>
     */
    private EvaluationFormQuestion question;

    /**
     * <p>
     * The information of the section.
     * </p>
     * 
     * @param section
     *        The information of the section.
     */

    public void setSection(EvaluationFormSection section) {
        this.section = section;
    }

    /**
     * <p>
     * The information of the section.
     * </p>
     * 
     * @return The information of the section.
     */

    public EvaluationFormSection getSection() {
        return this.section;
    }

    /**
     * <p>
     * The information of the section.
     * </p>
     * 
     * @param section
     *        The information of the section.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormItem withSection(EvaluationFormSection section) {
        setSection(section);
        return this;
    }

    /**
     * <p>
     * The information of the question.
     * </p>
     * 
     * @param question
     *        The information of the question.
     */

    public void setQuestion(EvaluationFormQuestion question) {
        this.question = question;
    }

    /**
     * <p>
     * The information of the question.
     * </p>
     * 
     * @return The information of the question.
     */

    public EvaluationFormQuestion getQuestion() {
        return this.question;
    }

    /**
     * <p>
     * The information of the question.
     * </p>
     * 
     * @param question
     *        The information of the question.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormItem withQuestion(EvaluationFormQuestion question) {
        setQuestion(question);
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
        if (getSection() != null)
            sb.append("Section: ").append(getSection()).append(",");
        if (getQuestion() != null)
            sb.append("Question: ").append(getQuestion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationFormItem == false)
            return false;
        EvaluationFormItem other = (EvaluationFormItem) obj;
        if (other.getSection() == null ^ this.getSection() == null)
            return false;
        if (other.getSection() != null && other.getSection().equals(this.getSection()) == false)
            return false;
        if (other.getQuestion() == null ^ this.getQuestion() == null)
            return false;
        if (other.getQuestion() != null && other.getQuestion().equals(this.getQuestion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSection() == null) ? 0 : getSection().hashCode());
        hashCode = prime * hashCode + ((getQuestion() == null) ? 0 : getQuestion().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationFormItem clone() {
        try {
            return (EvaluationFormItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.EvaluationFormItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
