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
 * An answer of the question.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/Answer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Answer implements Serializable, Cloneable, StructuredPojo {

    private String questionId;

    private String pillarId;

    private String questionTitle;

    private String questionDescription;

    private String improvementPlanUrl;

    private String helpfulResourceUrl;

    private java.util.List<Choice> choices;

    private java.util.List<String> selectedChoices;
    /**
     * <p>
     * A list of selected choices to a question in your workload.
     * </p>
     */
    private java.util.List<ChoiceAnswer> choiceAnswers;

    private Boolean isApplicable;

    private String risk;

    private String notes;
    /**
     * <p>
     * The reason why the question is not applicable to your workload.
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

    public Answer withQuestionId(String questionId) {
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

    public Answer withPillarId(String pillarId) {
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

    public Answer withQuestionTitle(String questionTitle) {
        setQuestionTitle(questionTitle);
        return this;
    }

    /**
     * @param questionDescription
     */

    public void setQuestionDescription(String questionDescription) {
        this.questionDescription = questionDescription;
    }

    /**
     * @return
     */

    public String getQuestionDescription() {
        return this.questionDescription;
    }

    /**
     * @param questionDescription
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Answer withQuestionDescription(String questionDescription) {
        setQuestionDescription(questionDescription);
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

    public Answer withImprovementPlanUrl(String improvementPlanUrl) {
        setImprovementPlanUrl(improvementPlanUrl);
        return this;
    }

    /**
     * @param helpfulResourceUrl
     */

    public void setHelpfulResourceUrl(String helpfulResourceUrl) {
        this.helpfulResourceUrl = helpfulResourceUrl;
    }

    /**
     * @return
     */

    public String getHelpfulResourceUrl() {
        return this.helpfulResourceUrl;
    }

    /**
     * @param helpfulResourceUrl
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Answer withHelpfulResourceUrl(String helpfulResourceUrl) {
        setHelpfulResourceUrl(helpfulResourceUrl);
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

    public Answer withChoices(Choice... choices) {
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

    public Answer withChoices(java.util.Collection<Choice> choices) {
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

    public Answer withSelectedChoices(String... selectedChoices) {
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

    public Answer withSelectedChoices(java.util.Collection<String> selectedChoices) {
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

    public java.util.List<ChoiceAnswer> getChoiceAnswers() {
        return choiceAnswers;
    }

    /**
     * <p>
     * A list of selected choices to a question in your workload.
     * </p>
     * 
     * @param choiceAnswers
     *        A list of selected choices to a question in your workload.
     */

    public void setChoiceAnswers(java.util.Collection<ChoiceAnswer> choiceAnswers) {
        if (choiceAnswers == null) {
            this.choiceAnswers = null;
            return;
        }

        this.choiceAnswers = new java.util.ArrayList<ChoiceAnswer>(choiceAnswers);
    }

    /**
     * <p>
     * A list of selected choices to a question in your workload.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChoiceAnswers(java.util.Collection)} or {@link #withChoiceAnswers(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param choiceAnswers
     *        A list of selected choices to a question in your workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Answer withChoiceAnswers(ChoiceAnswer... choiceAnswers) {
        if (this.choiceAnswers == null) {
            setChoiceAnswers(new java.util.ArrayList<ChoiceAnswer>(choiceAnswers.length));
        }
        for (ChoiceAnswer ele : choiceAnswers) {
            this.choiceAnswers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of selected choices to a question in your workload.
     * </p>
     * 
     * @param choiceAnswers
     *        A list of selected choices to a question in your workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Answer withChoiceAnswers(java.util.Collection<ChoiceAnswer> choiceAnswers) {
        setChoiceAnswers(choiceAnswers);
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

    public Answer withIsApplicable(Boolean isApplicable) {
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

    public Answer withRisk(String risk) {
        setRisk(risk);
        return this;
    }

    /**
     * @param risk
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Risk
     */

    public Answer withRisk(Risk risk) {
        this.risk = risk.toString();
        return this;
    }

    /**
     * @param notes
     */

    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * @return
     */

    public String getNotes() {
        return this.notes;
    }

    /**
     * @param notes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Answer withNotes(String notes) {
        setNotes(notes);
        return this;
    }

    /**
     * <p>
     * The reason why the question is not applicable to your workload.
     * </p>
     * 
     * @param reason
     *        The reason why the question is not applicable to your workload.
     * @see AnswerReason
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason why the question is not applicable to your workload.
     * </p>
     * 
     * @return The reason why the question is not applicable to your workload.
     * @see AnswerReason
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason why the question is not applicable to your workload.
     * </p>
     * 
     * @param reason
     *        The reason why the question is not applicable to your workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnswerReason
     */

    public Answer withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The reason why the question is not applicable to your workload.
     * </p>
     * 
     * @param reason
     *        The reason why the question is not applicable to your workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnswerReason
     */

    public Answer withReason(AnswerReason reason) {
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
        if (getQuestionDescription() != null)
            sb.append("QuestionDescription: ").append(getQuestionDescription()).append(",");
        if (getImprovementPlanUrl() != null)
            sb.append("ImprovementPlanUrl: ").append(getImprovementPlanUrl()).append(",");
        if (getHelpfulResourceUrl() != null)
            sb.append("HelpfulResourceUrl: ").append(getHelpfulResourceUrl()).append(",");
        if (getChoices() != null)
            sb.append("Choices: ").append(getChoices()).append(",");
        if (getSelectedChoices() != null)
            sb.append("SelectedChoices: ").append(getSelectedChoices()).append(",");
        if (getChoiceAnswers() != null)
            sb.append("ChoiceAnswers: ").append(getChoiceAnswers()).append(",");
        if (getIsApplicable() != null)
            sb.append("IsApplicable: ").append(getIsApplicable()).append(",");
        if (getRisk() != null)
            sb.append("Risk: ").append(getRisk()).append(",");
        if (getNotes() != null)
            sb.append("Notes: ").append(getNotes()).append(",");
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

        if (obj instanceof Answer == false)
            return false;
        Answer other = (Answer) obj;
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
        if (other.getQuestionDescription() == null ^ this.getQuestionDescription() == null)
            return false;
        if (other.getQuestionDescription() != null && other.getQuestionDescription().equals(this.getQuestionDescription()) == false)
            return false;
        if (other.getImprovementPlanUrl() == null ^ this.getImprovementPlanUrl() == null)
            return false;
        if (other.getImprovementPlanUrl() != null && other.getImprovementPlanUrl().equals(this.getImprovementPlanUrl()) == false)
            return false;
        if (other.getHelpfulResourceUrl() == null ^ this.getHelpfulResourceUrl() == null)
            return false;
        if (other.getHelpfulResourceUrl() != null && other.getHelpfulResourceUrl().equals(this.getHelpfulResourceUrl()) == false)
            return false;
        if (other.getChoices() == null ^ this.getChoices() == null)
            return false;
        if (other.getChoices() != null && other.getChoices().equals(this.getChoices()) == false)
            return false;
        if (other.getSelectedChoices() == null ^ this.getSelectedChoices() == null)
            return false;
        if (other.getSelectedChoices() != null && other.getSelectedChoices().equals(this.getSelectedChoices()) == false)
            return false;
        if (other.getChoiceAnswers() == null ^ this.getChoiceAnswers() == null)
            return false;
        if (other.getChoiceAnswers() != null && other.getChoiceAnswers().equals(this.getChoiceAnswers()) == false)
            return false;
        if (other.getIsApplicable() == null ^ this.getIsApplicable() == null)
            return false;
        if (other.getIsApplicable() != null && other.getIsApplicable().equals(this.getIsApplicable()) == false)
            return false;
        if (other.getRisk() == null ^ this.getRisk() == null)
            return false;
        if (other.getRisk() != null && other.getRisk().equals(this.getRisk()) == false)
            return false;
        if (other.getNotes() == null ^ this.getNotes() == null)
            return false;
        if (other.getNotes() != null && other.getNotes().equals(this.getNotes()) == false)
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
        hashCode = prime * hashCode + ((getQuestionDescription() == null) ? 0 : getQuestionDescription().hashCode());
        hashCode = prime * hashCode + ((getImprovementPlanUrl() == null) ? 0 : getImprovementPlanUrl().hashCode());
        hashCode = prime * hashCode + ((getHelpfulResourceUrl() == null) ? 0 : getHelpfulResourceUrl().hashCode());
        hashCode = prime * hashCode + ((getChoices() == null) ? 0 : getChoices().hashCode());
        hashCode = prime * hashCode + ((getSelectedChoices() == null) ? 0 : getSelectedChoices().hashCode());
        hashCode = prime * hashCode + ((getChoiceAnswers() == null) ? 0 : getChoiceAnswers().hashCode());
        hashCode = prime * hashCode + ((getIsApplicable() == null) ? 0 : getIsApplicable().hashCode());
        hashCode = prime * hashCode + ((getRisk() == null) ? 0 : getRisk().hashCode());
        hashCode = prime * hashCode + ((getNotes() == null) ? 0 : getNotes().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public Answer clone() {
        try {
            return (Answer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.AnswerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
