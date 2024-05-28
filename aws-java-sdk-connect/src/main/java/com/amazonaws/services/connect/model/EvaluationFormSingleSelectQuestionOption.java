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
 * Information about the automation configuration in single select questions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/EvaluationFormSingleSelectQuestionOption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationFormSingleSelectQuestionOption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the answer option. An identifier must be unique within the question.
     * </p>
     */
    private String refId;
    /**
     * <p>
     * The title of the answer option.
     * </p>
     */
    private String text;
    /**
     * <p>
     * The score assigned to the answer option.
     * </p>
     */
    private Integer score;
    /**
     * <p>
     * The flag to mark the option as automatic fail. If an automatic fail answer is provided, the overall evaluation
     * gets a score of 0.
     * </p>
     */
    private Boolean automaticFail;

    /**
     * <p>
     * The identifier of the answer option. An identifier must be unique within the question.
     * </p>
     * 
     * @param refId
     *        The identifier of the answer option. An identifier must be unique within the question.
     */

    public void setRefId(String refId) {
        this.refId = refId;
    }

    /**
     * <p>
     * The identifier of the answer option. An identifier must be unique within the question.
     * </p>
     * 
     * @return The identifier of the answer option. An identifier must be unique within the question.
     */

    public String getRefId() {
        return this.refId;
    }

    /**
     * <p>
     * The identifier of the answer option. An identifier must be unique within the question.
     * </p>
     * 
     * @param refId
     *        The identifier of the answer option. An identifier must be unique within the question.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormSingleSelectQuestionOption withRefId(String refId) {
        setRefId(refId);
        return this;
    }

    /**
     * <p>
     * The title of the answer option.
     * </p>
     * 
     * @param text
     *        The title of the answer option.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The title of the answer option.
     * </p>
     * 
     * @return The title of the answer option.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * The title of the answer option.
     * </p>
     * 
     * @param text
     *        The title of the answer option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormSingleSelectQuestionOption withText(String text) {
        setText(text);
        return this;
    }

    /**
     * <p>
     * The score assigned to the answer option.
     * </p>
     * 
     * @param score
     *        The score assigned to the answer option.
     */

    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * <p>
     * The score assigned to the answer option.
     * </p>
     * 
     * @return The score assigned to the answer option.
     */

    public Integer getScore() {
        return this.score;
    }

    /**
     * <p>
     * The score assigned to the answer option.
     * </p>
     * 
     * @param score
     *        The score assigned to the answer option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormSingleSelectQuestionOption withScore(Integer score) {
        setScore(score);
        return this;
    }

    /**
     * <p>
     * The flag to mark the option as automatic fail. If an automatic fail answer is provided, the overall evaluation
     * gets a score of 0.
     * </p>
     * 
     * @param automaticFail
     *        The flag to mark the option as automatic fail. If an automatic fail answer is provided, the overall
     *        evaluation gets a score of 0.
     */

    public void setAutomaticFail(Boolean automaticFail) {
        this.automaticFail = automaticFail;
    }

    /**
     * <p>
     * The flag to mark the option as automatic fail. If an automatic fail answer is provided, the overall evaluation
     * gets a score of 0.
     * </p>
     * 
     * @return The flag to mark the option as automatic fail. If an automatic fail answer is provided, the overall
     *         evaluation gets a score of 0.
     */

    public Boolean getAutomaticFail() {
        return this.automaticFail;
    }

    /**
     * <p>
     * The flag to mark the option as automatic fail. If an automatic fail answer is provided, the overall evaluation
     * gets a score of 0.
     * </p>
     * 
     * @param automaticFail
     *        The flag to mark the option as automatic fail. If an automatic fail answer is provided, the overall
     *        evaluation gets a score of 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormSingleSelectQuestionOption withAutomaticFail(Boolean automaticFail) {
        setAutomaticFail(automaticFail);
        return this;
    }

    /**
     * <p>
     * The flag to mark the option as automatic fail. If an automatic fail answer is provided, the overall evaluation
     * gets a score of 0.
     * </p>
     * 
     * @return The flag to mark the option as automatic fail. If an automatic fail answer is provided, the overall
     *         evaluation gets a score of 0.
     */

    public Boolean isAutomaticFail() {
        return this.automaticFail;
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
        if (getRefId() != null)
            sb.append("RefId: ").append(getRefId()).append(",");
        if (getText() != null)
            sb.append("Text: ").append(getText()).append(",");
        if (getScore() != null)
            sb.append("Score: ").append(getScore()).append(",");
        if (getAutomaticFail() != null)
            sb.append("AutomaticFail: ").append(getAutomaticFail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationFormSingleSelectQuestionOption == false)
            return false;
        EvaluationFormSingleSelectQuestionOption other = (EvaluationFormSingleSelectQuestionOption) obj;
        if (other.getRefId() == null ^ this.getRefId() == null)
            return false;
        if (other.getRefId() != null && other.getRefId().equals(this.getRefId()) == false)
            return false;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        if (other.getAutomaticFail() == null ^ this.getAutomaticFail() == null)
            return false;
        if (other.getAutomaticFail() != null && other.getAutomaticFail().equals(this.getAutomaticFail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRefId() == null) ? 0 : getRefId().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        hashCode = prime * hashCode + ((getAutomaticFail() == null) ? 0 : getAutomaticFail().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationFormSingleSelectQuestionOption clone() {
        try {
            return (EvaluationFormSingleSelectQuestionOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.EvaluationFormSingleSelectQuestionOptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
