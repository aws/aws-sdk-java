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
 * Information about a question from an evaluation form.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/EvaluationFormQuestion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationFormQuestion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The title of the question.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The instructions of the section.
     * </p>
     */
    private String instructions;
    /**
     * <p>
     * The identifier of the question. An identifier must be unique within the evaluation form.
     * </p>
     */
    private String refId;
    /**
     * <p>
     * The flag to enable not applicable answers to the question.
     * </p>
     */
    private Boolean notApplicableEnabled;
    /**
     * <p>
     * The type of the question.
     * </p>
     */
    private String questionType;
    /**
     * <p>
     * The properties of the type of question. Text questions do not have to define question type properties.
     * </p>
     */
    private EvaluationFormQuestionTypeProperties questionTypeProperties;
    /**
     * <p>
     * The scoring weight of the section.
     * </p>
     */
    private Double weight;

    /**
     * <p>
     * The title of the question.
     * </p>
     * 
     * @param title
     *        The title of the question.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the question.
     * </p>
     * 
     * @return The title of the question.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the question.
     * </p>
     * 
     * @param title
     *        The title of the question.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormQuestion withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The instructions of the section.
     * </p>
     * 
     * @param instructions
     *        The instructions of the section.
     */

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    /**
     * <p>
     * The instructions of the section.
     * </p>
     * 
     * @return The instructions of the section.
     */

    public String getInstructions() {
        return this.instructions;
    }

    /**
     * <p>
     * The instructions of the section.
     * </p>
     * 
     * @param instructions
     *        The instructions of the section.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormQuestion withInstructions(String instructions) {
        setInstructions(instructions);
        return this;
    }

    /**
     * <p>
     * The identifier of the question. An identifier must be unique within the evaluation form.
     * </p>
     * 
     * @param refId
     *        The identifier of the question. An identifier must be unique within the evaluation form.
     */

    public void setRefId(String refId) {
        this.refId = refId;
    }

    /**
     * <p>
     * The identifier of the question. An identifier must be unique within the evaluation form.
     * </p>
     * 
     * @return The identifier of the question. An identifier must be unique within the evaluation form.
     */

    public String getRefId() {
        return this.refId;
    }

    /**
     * <p>
     * The identifier of the question. An identifier must be unique within the evaluation form.
     * </p>
     * 
     * @param refId
     *        The identifier of the question. An identifier must be unique within the evaluation form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormQuestion withRefId(String refId) {
        setRefId(refId);
        return this;
    }

    /**
     * <p>
     * The flag to enable not applicable answers to the question.
     * </p>
     * 
     * @param notApplicableEnabled
     *        The flag to enable not applicable answers to the question.
     */

    public void setNotApplicableEnabled(Boolean notApplicableEnabled) {
        this.notApplicableEnabled = notApplicableEnabled;
    }

    /**
     * <p>
     * The flag to enable not applicable answers to the question.
     * </p>
     * 
     * @return The flag to enable not applicable answers to the question.
     */

    public Boolean getNotApplicableEnabled() {
        return this.notApplicableEnabled;
    }

    /**
     * <p>
     * The flag to enable not applicable answers to the question.
     * </p>
     * 
     * @param notApplicableEnabled
     *        The flag to enable not applicable answers to the question.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormQuestion withNotApplicableEnabled(Boolean notApplicableEnabled) {
        setNotApplicableEnabled(notApplicableEnabled);
        return this;
    }

    /**
     * <p>
     * The flag to enable not applicable answers to the question.
     * </p>
     * 
     * @return The flag to enable not applicable answers to the question.
     */

    public Boolean isNotApplicableEnabled() {
        return this.notApplicableEnabled;
    }

    /**
     * <p>
     * The type of the question.
     * </p>
     * 
     * @param questionType
     *        The type of the question.
     * @see EvaluationFormQuestionType
     */

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    /**
     * <p>
     * The type of the question.
     * </p>
     * 
     * @return The type of the question.
     * @see EvaluationFormQuestionType
     */

    public String getQuestionType() {
        return this.questionType;
    }

    /**
     * <p>
     * The type of the question.
     * </p>
     * 
     * @param questionType
     *        The type of the question.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationFormQuestionType
     */

    public EvaluationFormQuestion withQuestionType(String questionType) {
        setQuestionType(questionType);
        return this;
    }

    /**
     * <p>
     * The type of the question.
     * </p>
     * 
     * @param questionType
     *        The type of the question.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationFormQuestionType
     */

    public EvaluationFormQuestion withQuestionType(EvaluationFormQuestionType questionType) {
        this.questionType = questionType.toString();
        return this;
    }

    /**
     * <p>
     * The properties of the type of question. Text questions do not have to define question type properties.
     * </p>
     * 
     * @param questionTypeProperties
     *        The properties of the type of question. Text questions do not have to define question type properties.
     */

    public void setQuestionTypeProperties(EvaluationFormQuestionTypeProperties questionTypeProperties) {
        this.questionTypeProperties = questionTypeProperties;
    }

    /**
     * <p>
     * The properties of the type of question. Text questions do not have to define question type properties.
     * </p>
     * 
     * @return The properties of the type of question. Text questions do not have to define question type properties.
     */

    public EvaluationFormQuestionTypeProperties getQuestionTypeProperties() {
        return this.questionTypeProperties;
    }

    /**
     * <p>
     * The properties of the type of question. Text questions do not have to define question type properties.
     * </p>
     * 
     * @param questionTypeProperties
     *        The properties of the type of question. Text questions do not have to define question type properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormQuestion withQuestionTypeProperties(EvaluationFormQuestionTypeProperties questionTypeProperties) {
        setQuestionTypeProperties(questionTypeProperties);
        return this;
    }

    /**
     * <p>
     * The scoring weight of the section.
     * </p>
     * 
     * @param weight
     *        The scoring weight of the section.
     */

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /**
     * <p>
     * The scoring weight of the section.
     * </p>
     * 
     * @return The scoring weight of the section.
     */

    public Double getWeight() {
        return this.weight;
    }

    /**
     * <p>
     * The scoring weight of the section.
     * </p>
     * 
     * @param weight
     *        The scoring weight of the section.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormQuestion withWeight(Double weight) {
        setWeight(weight);
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
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getInstructions() != null)
            sb.append("Instructions: ").append(getInstructions()).append(",");
        if (getRefId() != null)
            sb.append("RefId: ").append(getRefId()).append(",");
        if (getNotApplicableEnabled() != null)
            sb.append("NotApplicableEnabled: ").append(getNotApplicableEnabled()).append(",");
        if (getQuestionType() != null)
            sb.append("QuestionType: ").append(getQuestionType()).append(",");
        if (getQuestionTypeProperties() != null)
            sb.append("QuestionTypeProperties: ").append(getQuestionTypeProperties()).append(",");
        if (getWeight() != null)
            sb.append("Weight: ").append(getWeight());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationFormQuestion == false)
            return false;
        EvaluationFormQuestion other = (EvaluationFormQuestion) obj;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getInstructions() == null ^ this.getInstructions() == null)
            return false;
        if (other.getInstructions() != null && other.getInstructions().equals(this.getInstructions()) == false)
            return false;
        if (other.getRefId() == null ^ this.getRefId() == null)
            return false;
        if (other.getRefId() != null && other.getRefId().equals(this.getRefId()) == false)
            return false;
        if (other.getNotApplicableEnabled() == null ^ this.getNotApplicableEnabled() == null)
            return false;
        if (other.getNotApplicableEnabled() != null && other.getNotApplicableEnabled().equals(this.getNotApplicableEnabled()) == false)
            return false;
        if (other.getQuestionType() == null ^ this.getQuestionType() == null)
            return false;
        if (other.getQuestionType() != null && other.getQuestionType().equals(this.getQuestionType()) == false)
            return false;
        if (other.getQuestionTypeProperties() == null ^ this.getQuestionTypeProperties() == null)
            return false;
        if (other.getQuestionTypeProperties() != null && other.getQuestionTypeProperties().equals(this.getQuestionTypeProperties()) == false)
            return false;
        if (other.getWeight() == null ^ this.getWeight() == null)
            return false;
        if (other.getWeight() != null && other.getWeight().equals(this.getWeight()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getInstructions() == null) ? 0 : getInstructions().hashCode());
        hashCode = prime * hashCode + ((getRefId() == null) ? 0 : getRefId().hashCode());
        hashCode = prime * hashCode + ((getNotApplicableEnabled() == null) ? 0 : getNotApplicableEnabled().hashCode());
        hashCode = prime * hashCode + ((getQuestionType() == null) ? 0 : getQuestionType().hashCode());
        hashCode = prime * hashCode + ((getQuestionTypeProperties() == null) ? 0 : getQuestionTypeProperties().hashCode());
        hashCode = prime * hashCode + ((getWeight() == null) ? 0 : getWeight().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationFormQuestion clone() {
        try {
            return (EvaluationFormQuestion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.EvaluationFormQuestionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
