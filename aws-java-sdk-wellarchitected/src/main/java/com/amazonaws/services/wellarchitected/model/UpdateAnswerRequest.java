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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Input to update answer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateAnswer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAnswerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String workloadId;

    private String lensAlias;

    private String questionId;

    private java.util.List<String> selectedChoices;
    /**
     * <p>
     * A list of choices to update on a question in your workload. The String key corresponds to the choice ID to be
     * updated.
     * </p>
     */
    private java.util.Map<String, ChoiceUpdate> choiceUpdates;

    private String notes;

    private Boolean isApplicable;
    /**
     * <p>
     * The reason why a question is not applicable to your workload.
     * </p>
     */
    private String reason;

    /**
     * @param workloadId
     */

    public void setWorkloadId(String workloadId) {
        this.workloadId = workloadId;
    }

    /**
     * @return
     */

    public String getWorkloadId() {
        return this.workloadId;
    }

    /**
     * @param workloadId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnswerRequest withWorkloadId(String workloadId) {
        setWorkloadId(workloadId);
        return this;
    }

    /**
     * @param lensAlias
     */

    public void setLensAlias(String lensAlias) {
        this.lensAlias = lensAlias;
    }

    /**
     * @return
     */

    public String getLensAlias() {
        return this.lensAlias;
    }

    /**
     * @param lensAlias
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnswerRequest withLensAlias(String lensAlias) {
        setLensAlias(lensAlias);
        return this;
    }

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

    public UpdateAnswerRequest withQuestionId(String questionId) {
        setQuestionId(questionId);
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

    public UpdateAnswerRequest withSelectedChoices(String... selectedChoices) {
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

    public UpdateAnswerRequest withSelectedChoices(java.util.Collection<String> selectedChoices) {
        setSelectedChoices(selectedChoices);
        return this;
    }

    /**
     * <p>
     * A list of choices to update on a question in your workload. The String key corresponds to the choice ID to be
     * updated.
     * </p>
     * 
     * @return A list of choices to update on a question in your workload. The String key corresponds to the choice ID
     *         to be updated.
     */

    public java.util.Map<String, ChoiceUpdate> getChoiceUpdates() {
        return choiceUpdates;
    }

    /**
     * <p>
     * A list of choices to update on a question in your workload. The String key corresponds to the choice ID to be
     * updated.
     * </p>
     * 
     * @param choiceUpdates
     *        A list of choices to update on a question in your workload. The String key corresponds to the choice ID to
     *        be updated.
     */

    public void setChoiceUpdates(java.util.Map<String, ChoiceUpdate> choiceUpdates) {
        this.choiceUpdates = choiceUpdates;
    }

    /**
     * <p>
     * A list of choices to update on a question in your workload. The String key corresponds to the choice ID to be
     * updated.
     * </p>
     * 
     * @param choiceUpdates
     *        A list of choices to update on a question in your workload. The String key corresponds to the choice ID to
     *        be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnswerRequest withChoiceUpdates(java.util.Map<String, ChoiceUpdate> choiceUpdates) {
        setChoiceUpdates(choiceUpdates);
        return this;
    }

    /**
     * Add a single ChoiceUpdates entry
     *
     * @see UpdateAnswerRequest#withChoiceUpdates
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnswerRequest addChoiceUpdatesEntry(String key, ChoiceUpdate value) {
        if (null == this.choiceUpdates) {
            this.choiceUpdates = new java.util.HashMap<String, ChoiceUpdate>();
        }
        if (this.choiceUpdates.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.choiceUpdates.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ChoiceUpdates.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnswerRequest clearChoiceUpdatesEntries() {
        this.choiceUpdates = null;
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

    public UpdateAnswerRequest withNotes(String notes) {
        setNotes(notes);
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

    public UpdateAnswerRequest withIsApplicable(Boolean isApplicable) {
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
     * <p>
     * The reason why a question is not applicable to your workload.
     * </p>
     * 
     * @param reason
     *        The reason why a question is not applicable to your workload.
     * @see AnswerReason
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason why a question is not applicable to your workload.
     * </p>
     * 
     * @return The reason why a question is not applicable to your workload.
     * @see AnswerReason
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason why a question is not applicable to your workload.
     * </p>
     * 
     * @param reason
     *        The reason why a question is not applicable to your workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnswerReason
     */

    public UpdateAnswerRequest withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The reason why a question is not applicable to your workload.
     * </p>
     * 
     * @param reason
     *        The reason why a question is not applicable to your workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnswerReason
     */

    public UpdateAnswerRequest withReason(AnswerReason reason) {
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
        if (getWorkloadId() != null)
            sb.append("WorkloadId: ").append(getWorkloadId()).append(",");
        if (getLensAlias() != null)
            sb.append("LensAlias: ").append(getLensAlias()).append(",");
        if (getQuestionId() != null)
            sb.append("QuestionId: ").append(getQuestionId()).append(",");
        if (getSelectedChoices() != null)
            sb.append("SelectedChoices: ").append(getSelectedChoices()).append(",");
        if (getChoiceUpdates() != null)
            sb.append("ChoiceUpdates: ").append(getChoiceUpdates()).append(",");
        if (getNotes() != null)
            sb.append("Notes: ").append(getNotes()).append(",");
        if (getIsApplicable() != null)
            sb.append("IsApplicable: ").append(getIsApplicable()).append(",");
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

        if (obj instanceof UpdateAnswerRequest == false)
            return false;
        UpdateAnswerRequest other = (UpdateAnswerRequest) obj;
        if (other.getWorkloadId() == null ^ this.getWorkloadId() == null)
            return false;
        if (other.getWorkloadId() != null && other.getWorkloadId().equals(this.getWorkloadId()) == false)
            return false;
        if (other.getLensAlias() == null ^ this.getLensAlias() == null)
            return false;
        if (other.getLensAlias() != null && other.getLensAlias().equals(this.getLensAlias()) == false)
            return false;
        if (other.getQuestionId() == null ^ this.getQuestionId() == null)
            return false;
        if (other.getQuestionId() != null && other.getQuestionId().equals(this.getQuestionId()) == false)
            return false;
        if (other.getSelectedChoices() == null ^ this.getSelectedChoices() == null)
            return false;
        if (other.getSelectedChoices() != null && other.getSelectedChoices().equals(this.getSelectedChoices()) == false)
            return false;
        if (other.getChoiceUpdates() == null ^ this.getChoiceUpdates() == null)
            return false;
        if (other.getChoiceUpdates() != null && other.getChoiceUpdates().equals(this.getChoiceUpdates()) == false)
            return false;
        if (other.getNotes() == null ^ this.getNotes() == null)
            return false;
        if (other.getNotes() != null && other.getNotes().equals(this.getNotes()) == false)
            return false;
        if (other.getIsApplicable() == null ^ this.getIsApplicable() == null)
            return false;
        if (other.getIsApplicable() != null && other.getIsApplicable().equals(this.getIsApplicable()) == false)
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

        hashCode = prime * hashCode + ((getWorkloadId() == null) ? 0 : getWorkloadId().hashCode());
        hashCode = prime * hashCode + ((getLensAlias() == null) ? 0 : getLensAlias().hashCode());
        hashCode = prime * hashCode + ((getQuestionId() == null) ? 0 : getQuestionId().hashCode());
        hashCode = prime * hashCode + ((getSelectedChoices() == null) ? 0 : getSelectedChoices().hashCode());
        hashCode = prime * hashCode + ((getChoiceUpdates() == null) ? 0 : getChoiceUpdates().hashCode());
        hashCode = prime * hashCode + ((getNotes() == null) ? 0 : getNotes().hashCode());
        hashCode = prime * hashCode + ((getIsApplicable() == null) ? 0 : getIsApplicable().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAnswerRequest clone() {
        return (UpdateAnswerRequest) super.clone();
    }

}
