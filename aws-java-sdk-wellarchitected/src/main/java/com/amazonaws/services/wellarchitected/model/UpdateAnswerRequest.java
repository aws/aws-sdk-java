/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

    private String notes;

    private Boolean isApplicable;

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
        if (getNotes() != null)
            sb.append("Notes: ").append(getNotes()).append(",");
        if (getIsApplicable() != null)
            sb.append("IsApplicable: ").append(getIsApplicable());
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
        if (other.getNotes() == null ^ this.getNotes() == null)
            return false;
        if (other.getNotes() != null && other.getNotes().equals(this.getNotes()) == false)
            return false;
        if (other.getIsApplicable() == null ^ this.getIsApplicable() == null)
            return false;
        if (other.getIsApplicable() != null && other.getIsApplicable().equals(this.getIsApplicable()) == false)
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
        hashCode = prime * hashCode + ((getNotes() == null) ? 0 : getNotes().hashCode());
        hashCode = prime * hashCode + ((getIsApplicable() == null) ? 0 : getIsApplicable().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAnswerRequest clone() {
        return (UpdateAnswerRequest) super.clone();
    }

}
