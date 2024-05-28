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
 * A metric for a particular pillar in a lens.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/PillarMetric" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PillarMetric implements Serializable, Cloneable, StructuredPojo {

    private String pillarId;

    private java.util.Map<String, Integer> riskCounts;
    /**
     * <p>
     * The questions that have been identified as risks in the pillar.
     * </p>
     */
    private java.util.List<QuestionMetric> questions;

    /**
     * @param pillarId
     */

    public void setPillarId(String pillarId) {
        this.pillarId = pillarId;
    }

    /**
     * @return
     */

    public String getPillarId() {
        return this.pillarId;
    }

    /**
     * @param pillarId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PillarMetric withPillarId(String pillarId) {
        setPillarId(pillarId);
        return this;
    }

    /**
     * @return
     */

    public java.util.Map<String, Integer> getRiskCounts() {
        return riskCounts;
    }

    /**
     * @param riskCounts
     */

    public void setRiskCounts(java.util.Map<String, Integer> riskCounts) {
        this.riskCounts = riskCounts;
    }

    /**
     * @param riskCounts
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PillarMetric withRiskCounts(java.util.Map<String, Integer> riskCounts) {
        setRiskCounts(riskCounts);
        return this;
    }

    /**
     * Add a single RiskCounts entry
     *
     * @see PillarMetric#withRiskCounts
     * @returns a reference to this object so that method calls can be chained together.
     */

    public PillarMetric addRiskCountsEntry(String key, Integer value) {
        if (null == this.riskCounts) {
            this.riskCounts = new java.util.HashMap<String, Integer>();
        }
        if (this.riskCounts.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.riskCounts.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RiskCounts.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PillarMetric clearRiskCountsEntries() {
        this.riskCounts = null;
        return this;
    }

    /**
     * <p>
     * The questions that have been identified as risks in the pillar.
     * </p>
     * 
     * @return The questions that have been identified as risks in the pillar.
     */

    public java.util.List<QuestionMetric> getQuestions() {
        return questions;
    }

    /**
     * <p>
     * The questions that have been identified as risks in the pillar.
     * </p>
     * 
     * @param questions
     *        The questions that have been identified as risks in the pillar.
     */

    public void setQuestions(java.util.Collection<QuestionMetric> questions) {
        if (questions == null) {
            this.questions = null;
            return;
        }

        this.questions = new java.util.ArrayList<QuestionMetric>(questions);
    }

    /**
     * <p>
     * The questions that have been identified as risks in the pillar.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQuestions(java.util.Collection)} or {@link #withQuestions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param questions
     *        The questions that have been identified as risks in the pillar.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PillarMetric withQuestions(QuestionMetric... questions) {
        if (this.questions == null) {
            setQuestions(new java.util.ArrayList<QuestionMetric>(questions.length));
        }
        for (QuestionMetric ele : questions) {
            this.questions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The questions that have been identified as risks in the pillar.
     * </p>
     * 
     * @param questions
     *        The questions that have been identified as risks in the pillar.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PillarMetric withQuestions(java.util.Collection<QuestionMetric> questions) {
        setQuestions(questions);
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
        if (getPillarId() != null)
            sb.append("PillarId: ").append(getPillarId()).append(",");
        if (getRiskCounts() != null)
            sb.append("RiskCounts: ").append(getRiskCounts()).append(",");
        if (getQuestions() != null)
            sb.append("Questions: ").append(getQuestions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PillarMetric == false)
            return false;
        PillarMetric other = (PillarMetric) obj;
        if (other.getPillarId() == null ^ this.getPillarId() == null)
            return false;
        if (other.getPillarId() != null && other.getPillarId().equals(this.getPillarId()) == false)
            return false;
        if (other.getRiskCounts() == null ^ this.getRiskCounts() == null)
            return false;
        if (other.getRiskCounts() != null && other.getRiskCounts().equals(this.getRiskCounts()) == false)
            return false;
        if (other.getQuestions() == null ^ this.getQuestions() == null)
            return false;
        if (other.getQuestions() != null && other.getQuestions().equals(this.getQuestions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPillarId() == null) ? 0 : getPillarId().hashCode());
        hashCode = prime * hashCode + ((getRiskCounts() == null) ? 0 : getRiskCounts().hashCode());
        hashCode = prime * hashCode + ((getQuestions() == null) ? 0 : getQuestions().hashCode());
        return hashCode;
    }

    @Override
    public PillarMetric clone() {
        try {
            return (PillarMetric) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.PillarMetricMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
