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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A metric for a particular question in the pillar.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/QuestionMetric" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QuestionMetric implements Serializable, Cloneable, StructuredPojo {

    private String questionId;

    private String risk;
    /**
     * <p>
     * The best practices, or choices, that have been identified as contributing to risk in a question.
     * </p>
     */
    private java.util.List<BestPractice> bestPractices;

    /**
     * @param questionId
     */

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    /**
     * @return
     */

    public String getQuestionId() {
        return this.questionId;
    }

    /**
     * @param questionId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuestionMetric withQuestionId(String questionId) {
        setQuestionId(questionId);
        return this;
    }

    /**
     * @param risk
     * @see Risk
     */

    public void setRisk(String risk) {
        this.risk = risk;
    }

    /**
     * @return
     * @see Risk
     */

    public String getRisk() {
        return this.risk;
    }

    /**
     * @param risk
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Risk
     */

    public QuestionMetric withRisk(String risk) {
        setRisk(risk);
        return this;
    }

    /**
     * @param risk
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Risk
     */

    public QuestionMetric withRisk(Risk risk) {
        this.risk = risk.toString();
        return this;
    }

    /**
     * <p>
     * The best practices, or choices, that have been identified as contributing to risk in a question.
     * </p>
     * 
     * @return The best practices, or choices, that have been identified as contributing to risk in a question.
     */

    public java.util.List<BestPractice> getBestPractices() {
        return bestPractices;
    }

    /**
     * <p>
     * The best practices, or choices, that have been identified as contributing to risk in a question.
     * </p>
     * 
     * @param bestPractices
     *        The best practices, or choices, that have been identified as contributing to risk in a question.
     */

    public void setBestPractices(java.util.Collection<BestPractice> bestPractices) {
        if (bestPractices == null) {
            this.bestPractices = null;
            return;
        }

        this.bestPractices = new java.util.ArrayList<BestPractice>(bestPractices);
    }

    /**
     * <p>
     * The best practices, or choices, that have been identified as contributing to risk in a question.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBestPractices(java.util.Collection)} or {@link #withBestPractices(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param bestPractices
     *        The best practices, or choices, that have been identified as contributing to risk in a question.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuestionMetric withBestPractices(BestPractice... bestPractices) {
        if (this.bestPractices == null) {
            setBestPractices(new java.util.ArrayList<BestPractice>(bestPractices.length));
        }
        for (BestPractice ele : bestPractices) {
            this.bestPractices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The best practices, or choices, that have been identified as contributing to risk in a question.
     * </p>
     * 
     * @param bestPractices
     *        The best practices, or choices, that have been identified as contributing to risk in a question.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuestionMetric withBestPractices(java.util.Collection<BestPractice> bestPractices) {
        setBestPractices(bestPractices);
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
        if (getQuestionId() != null)
            sb.append("QuestionId: ").append(getQuestionId()).append(",");
        if (getRisk() != null)
            sb.append("Risk: ").append(getRisk()).append(",");
        if (getBestPractices() != null)
            sb.append("BestPractices: ").append(getBestPractices());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QuestionMetric == false)
            return false;
        QuestionMetric other = (QuestionMetric) obj;
        if (other.getQuestionId() == null ^ this.getQuestionId() == null)
            return false;
        if (other.getQuestionId() != null && other.getQuestionId().equals(this.getQuestionId()) == false)
            return false;
        if (other.getRisk() == null ^ this.getRisk() == null)
            return false;
        if (other.getRisk() != null && other.getRisk().equals(this.getRisk()) == false)
            return false;
        if (other.getBestPractices() == null ^ this.getBestPractices() == null)
            return false;
        if (other.getBestPractices() != null && other.getBestPractices().equals(this.getBestPractices()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQuestionId() == null) ? 0 : getQuestionId().hashCode());
        hashCode = prime * hashCode + ((getRisk() == null) ? 0 : getRisk().hashCode());
        hashCode = prime * hashCode + ((getBestPractices() == null) ? 0 : getBestPractices().hashCode());
        return hashCode;
    }

    @Override
    public QuestionMetric clone() {
        try {
            return (QuestionMetric) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.QuestionMetricMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
