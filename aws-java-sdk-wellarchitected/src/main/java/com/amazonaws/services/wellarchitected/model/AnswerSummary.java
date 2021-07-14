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
 * An answer summary of a lens review in a workload.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/AnswerSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnswerSummary implements Serializable, Cloneable, StructuredPojo {

    private String questionId;

    private String pillarId;

    private String questionTitle;

    private java.util.List<Choice> choices;

    private java.util.List<String> selectedChoices;
    /**
     * <p>
     * A list of selected choices to a question in your workload.
     * </p>
     */
    private java.util.List<ChoiceAnswerSummary> choiceAnswerSummaries;

    private Boolean isApplicable;

    private String risk;
    /**
     * <p>
     * The reason why a choice is non-applicable to a question in your workload.
     * </p>
     */
    private String reason;

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

    public AnswerSummary withQuestionId(String questionId) {
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

    public AnswerSummary withPillarId(String pillarId) {
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

    public AnswerSummary withQuestionTitle(String questionTitle) {
        setQuestionTitle(questionTitle);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Choice> getChoices() {
        return choices;
    }

    /**
     * @param choices
     */

    public void setChoices(java.util.Collection<Choice> choices) {
        if (choices == null) {
            this.choices = null;
            return;
        }

        this.choices = new java.util.ArrayList<Choice>(choices);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChoices(java.util.Collection)} or {@link #withChoices(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param choices
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnswerSummary withChoices(Choice... choices) {
        if (this.choices == null) {
            setChoices(new java.util.ArrayList<Choice>(choices.length));
        }
        for (Choice ele : choices) {
            this.choices.add(ele);
        }
        return this;
    }

    /**
     * @param choices
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnswerSummary withChoices(java.util.Collection<Choice> choices) {
        setChoices(choices);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getSelectedChoices() {
        return selectedChoices;
    }

    /**
     * @param selectedChoices
     */

    public void setSelectedChoices(java.util.Collection<String> selectedChoices) {
        if (selectedChoices == null) {
            this.selectedChoices = null;
            return;
        }

        this.selectedChoices = new java.util.ArrayList<String>(selectedChoices);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSelectedChoices(java.util.Collection)} or {@link #withSelectedChoices(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param selectedChoices
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnswerSummary withSelectedChoices(String... selectedChoices) {
        if (this.selectedChoices == null) {
            setSelectedChoices(new java.util.ArrayList<String>(selectedChoices.length));
        }
        for (String ele : selectedChoices) {
            this.selectedChoices.add(ele);
        }
        return this;
    }

    /**
     * @param selectedChoices
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnswerSummary withSelectedChoices(java.util.Collection<String> selectedChoices) {
        setSelectedChoices(selectedChoices);
        return this;
    }

    /**
     * <p>
     * A list of selected choices to a question in your workload.
     * </p>
     * 
     * @return A list of selected choices to a question in your workload.
     */

    public java.util.List<ChoiceAnswerSummary> getChoiceAnswerSummaries() {
        return choiceAnswerSummaries;
    }

    /**
     * <p>
     * A list of selected choices to a question in your workload.
     * </p>
     * 
     * @param choiceAnswerSummaries
     *        A list of selected choices to a question in your workload.
     */

    public void setChoiceAnswerSummaries(java.util.Collection<ChoiceAnswerSummary> choiceAnswerSummaries) {
        if (choiceAnswerSummaries == null) {
            this.choiceAnswerSummaries = null;
            return;
        }

        this.choiceAnswerSummaries = new java.util.ArrayList<ChoiceAnswerSummary>(choiceAnswerSummaries);
    }

    /**
     * <p>
     * A list of selected choices to a question in your workload.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChoiceAnswerSummaries(java.util.Collection)} or
     * {@link #withChoiceAnswerSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param choiceAnswerSummaries
     *        A list of selected choices to a question in your workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnswerSummary withChoiceAnswerSummaries(ChoiceAnswerSummary... choiceAnswerSummaries) {
        if (this.choiceAnswerSummaries == null) {
            setChoiceAnswerSummaries(new java.util.ArrayList<ChoiceAnswerSummary>(choiceAnswerSummaries.length));
        }
        for (ChoiceAnswerSummary ele : choiceAnswerSummaries) {
            this.choiceAnswerSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of selected choices to a question in your workload.
     * </p>
     * 
     * @param choiceAnswerSummaries
     *        A list of selected choices to a question in your workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnswerSummary withChoiceAnswerSummaries(java.util.Collection<ChoiceAnswerSummary> choiceAnswerSummaries) {
        setChoiceAnswerSummaries(choiceAnswerSummaries);
        return this;
    }

    /**
     * @param isApplicable
     */

    public void setIsApplicable(Boolean isApplicable) {
        this.isApplicable = isApplicable;
    }

    /**
     * @return
     */

    public Boolean getIsApplicable() {
        return this.isApplicable;
    }

    /**
     * @param isApplicable
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnswerSummary withIsApplicable(Boolean isApplicable) {
        setIsApplicable(isApplicable);
        return this;
    }

    /**
     * @return
     */

    public Boolean isApplicable() {
        return this.isApplicable;
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

    public AnswerSummary withRisk(String risk) {
        setRisk(risk);
        return this;
    }

    /**
     * @param risk
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Risk
     */

    public AnswerSummary withRisk(Risk risk) {
        this.risk = risk.toString();
        return this;
    }

    /**
     * <p>
     * The reason why a choice is non-applicable to a question in your workload.
     * </p>
     * 
     * @param reason
     *        The reason why a choice is non-applicable to a question in your workload.
     * @see AnswerReason
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason why a choice is non-applicable to a question in your workload.
     * </p>
     * 
     * @return The reason why a choice is non-applicable to a question in your workload.
     * @see AnswerReason
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason why a choice is non-applicable to a question in your workload.
     * </p>
     * 
     * @param reason
     *        The reason why a choice is non-applicable to a question in your workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnswerReason
     */

    public AnswerSummary withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The reason why a choice is non-applicable to a question in your workload.
     * </p>
     * 
     * @param reason
     *        The reason why a choice is non-applicable to a question in your workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnswerReason
     */

    public AnswerSummary withReason(AnswerReason reason) {
        this.reason = reason.toString();
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
        if (getChoices() != null)
            sb.append("Choices: ").append(getChoices()).append(",");
        if (getSelectedChoices() != null)
            sb.append("SelectedChoices: ").append(getSelectedChoices()).append(",");
        if (getChoiceAnswerSummaries() != null)
            sb.append("ChoiceAnswerSummaries: ").append(getChoiceAnswerSummaries()).append(",");
        if (getIsApplicable() != null)
            sb.append("IsApplicable: ").append(getIsApplicable()).append(",");
        if (getRisk() != null)
            sb.append("Risk: ").append(getRisk()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnswerSummary == false)
            return false;
        AnswerSummary other = (AnswerSummary) obj;
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
        if (other.getChoices() == null ^ this.getChoices() == null)
            return false;
        if (other.getChoices() != null && other.getChoices().equals(this.getChoices()) == false)
            return false;
        if (other.getSelectedChoices() == null ^ this.getSelectedChoices() == null)
            return false;
        if (other.getSelectedChoices() != null && other.getSelectedChoices().equals(this.getSelectedChoices()) == false)
            return false;
        if (other.getChoiceAnswerSummaries() == null ^ this.getChoiceAnswerSummaries() == null)
            return false;
        if (other.getChoiceAnswerSummaries() != null && other.getChoiceAnswerSummaries().equals(this.getChoiceAnswerSummaries()) == false)
            return false;
        if (other.getIsApplicable() == null ^ this.getIsApplicable() == null)
            return false;
        if (other.getIsApplicable() != null && other.getIsApplicable().equals(this.getIsApplicable()) == false)
            return false;
        if (other.getRisk() == null ^ this.getRisk() == null)
            return false;
        if (other.getRisk() != null && other.getRisk().equals(this.getRisk()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
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
        hashCode = prime * hashCode + ((getChoices() == null) ? 0 : getChoices().hashCode());
        hashCode = prime * hashCode + ((getSelectedChoices() == null) ? 0 : getSelectedChoices().hashCode());
        hashCode = prime * hashCode + ((getChoiceAnswerSummaries() == null) ? 0 : getChoiceAnswerSummaries().hashCode());
        hashCode = prime * hashCode + ((getIsApplicable() == null) ? 0 : getIsApplicable().hashCode());
        hashCode = prime * hashCode + ((getRisk() == null) ? 0 : getRisk().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public AnswerSummary clone() {
        try {
            return (AnswerSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.AnswerSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
