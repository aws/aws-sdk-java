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
 * Information about the option range used for scoring in numeric questions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/EvaluationFormNumericQuestionOption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationFormNumericQuestionOption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The minimum answer value of the range option.
     * </p>
     */
    private Integer minValue;
    /**
     * <p>
     * The maximum answer value of the range option.
     * </p>
     */
    private Integer maxValue;
    /**
     * <p>
     * The score assigned to answer values within the range option.
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
     * The minimum answer value of the range option.
     * </p>
     * 
     * @param minValue
     *        The minimum answer value of the range option.
     */

    public void setMinValue(Integer minValue) {
        this.minValue = minValue;
    }

    /**
     * <p>
     * The minimum answer value of the range option.
     * </p>
     * 
     * @return The minimum answer value of the range option.
     */

    public Integer getMinValue() {
        return this.minValue;
    }

    /**
     * <p>
     * The minimum answer value of the range option.
     * </p>
     * 
     * @param minValue
     *        The minimum answer value of the range option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormNumericQuestionOption withMinValue(Integer minValue) {
        setMinValue(minValue);
        return this;
    }

    /**
     * <p>
     * The maximum answer value of the range option.
     * </p>
     * 
     * @param maxValue
     *        The maximum answer value of the range option.
     */

    public void setMaxValue(Integer maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * <p>
     * The maximum answer value of the range option.
     * </p>
     * 
     * @return The maximum answer value of the range option.
     */

    public Integer getMaxValue() {
        return this.maxValue;
    }

    /**
     * <p>
     * The maximum answer value of the range option.
     * </p>
     * 
     * @param maxValue
     *        The maximum answer value of the range option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormNumericQuestionOption withMaxValue(Integer maxValue) {
        setMaxValue(maxValue);
        return this;
    }

    /**
     * <p>
     * The score assigned to answer values within the range option.
     * </p>
     * 
     * @param score
     *        The score assigned to answer values within the range option.
     */

    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * <p>
     * The score assigned to answer values within the range option.
     * </p>
     * 
     * @return The score assigned to answer values within the range option.
     */

    public Integer getScore() {
        return this.score;
    }

    /**
     * <p>
     * The score assigned to answer values within the range option.
     * </p>
     * 
     * @param score
     *        The score assigned to answer values within the range option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormNumericQuestionOption withScore(Integer score) {
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

    public EvaluationFormNumericQuestionOption withAutomaticFail(Boolean automaticFail) {
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
        if (getMinValue() != null)
            sb.append("MinValue: ").append(getMinValue()).append(",");
        if (getMaxValue() != null)
            sb.append("MaxValue: ").append(getMaxValue()).append(",");
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

        if (obj instanceof EvaluationFormNumericQuestionOption == false)
            return false;
        EvaluationFormNumericQuestionOption other = (EvaluationFormNumericQuestionOption) obj;
        if (other.getMinValue() == null ^ this.getMinValue() == null)
            return false;
        if (other.getMinValue() != null && other.getMinValue().equals(this.getMinValue()) == false)
            return false;
        if (other.getMaxValue() == null ^ this.getMaxValue() == null)
            return false;
        if (other.getMaxValue() != null && other.getMaxValue().equals(this.getMaxValue()) == false)
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

        hashCode = prime * hashCode + ((getMinValue() == null) ? 0 : getMinValue().hashCode());
        hashCode = prime * hashCode + ((getMaxValue() == null) ? 0 : getMaxValue().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        hashCode = prime * hashCode + ((getAutomaticFail() == null) ? 0 : getAutomaticFail().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationFormNumericQuestionOption clone() {
        try {
            return (EvaluationFormNumericQuestionOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.EvaluationFormNumericQuestionOptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
