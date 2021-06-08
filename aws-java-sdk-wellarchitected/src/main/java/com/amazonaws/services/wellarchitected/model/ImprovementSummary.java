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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An improvement summary of a lens review in a workload.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ImprovementSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImprovementSummary implements Serializable, Cloneable, StructuredPojo {

    private String questionId;

    private String pillarId;

    private String questionTitle;

    private String risk;

    private String improvementPlanUrl;

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

    public ImprovementSummary withQuestionId(String questionId) {
        setQuestionId(questionId);
        return this;
    }

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

    public ImprovementSummary withPillarId(String pillarId) {
        setPillarId(pillarId);
        return this;
    }

    /**
     * @param questionTitle
     */

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    /**
     * @return
     */

    public String getQuestionTitle() {
        return this.questionTitle;
    }

    /**
     * @param questionTitle
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImprovementSummary withQuestionTitle(String questionTitle) {
        setQuestionTitle(questionTitle);
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

    public ImprovementSummary withRisk(String risk) {
        setRisk(risk);
        return this;
    }

    /**
     * @param risk
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Risk
     */

    public ImprovementSummary withRisk(Risk risk) {
        this.risk = risk.toString();
        return this;
    }

    /**
     * @param improvementPlanUrl
     */

    public void setImprovementPlanUrl(String improvementPlanUrl) {
        this.improvementPlanUrl = improvementPlanUrl;
    }

    /**
     * @return
     */

    public String getImprovementPlanUrl() {
        return this.improvementPlanUrl;
    }

    /**
     * @param improvementPlanUrl
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImprovementSummary withImprovementPlanUrl(String improvementPlanUrl) {
        setImprovementPlanUrl(improvementPlanUrl);
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
        if (getPillarId() != null)
            sb.append("PillarId: ").append(getPillarId()).append(",");
        if (getQuestionTitle() != null)
            sb.append("QuestionTitle: ").append(getQuestionTitle()).append(",");
        if (getRisk() != null)
            sb.append("Risk: ").append(getRisk()).append(",");
        if (getImprovementPlanUrl() != null)
            sb.append("ImprovementPlanUrl: ").append(getImprovementPlanUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImprovementSummary == false)
            return false;
        ImprovementSummary other = (ImprovementSummary) obj;
        if (other.getQuestionId() == null ^ this.getQuestionId() == null)
            return false;
        if (other.getQuestionId() != null && other.getQuestionId().equals(this.getQuestionId()) == false)
            return false;
        if (other.getPillarId() == null ^ this.getPillarId() == null)
            return false;
        if (other.getPillarId() != null && other.getPillarId().equals(this.getPillarId()) == false)
            return false;
        if (other.getQuestionTitle() == null ^ this.getQuestionTitle() == null)
            return false;
        if (other.getQuestionTitle() != null && other.getQuestionTitle().equals(this.getQuestionTitle()) == false)
            return false;
        if (other.getRisk() == null ^ this.getRisk() == null)
            return false;
        if (other.getRisk() != null && other.getRisk().equals(this.getRisk()) == false)
            return false;
        if (other.getImprovementPlanUrl() == null ^ this.getImprovementPlanUrl() == null)
            return false;
        if (other.getImprovementPlanUrl() != null && other.getImprovementPlanUrl().equals(this.getImprovementPlanUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQuestionId() == null) ? 0 : getQuestionId().hashCode());
        hashCode = prime * hashCode + ((getPillarId() == null) ? 0 : getPillarId().hashCode());
        hashCode = prime * hashCode + ((getQuestionTitle() == null) ? 0 : getQuestionTitle().hashCode());
        hashCode = prime * hashCode + ((getRisk() == null) ? 0 : getRisk().hashCode());
        hashCode = prime * hashCode + ((getImprovementPlanUrl() == null) ? 0 : getImprovementPlanUrl().hashCode());
        return hashCode;
    }

    @Override
    public ImprovementSummary clone() {
        try {
            return (ImprovementSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.ImprovementSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
