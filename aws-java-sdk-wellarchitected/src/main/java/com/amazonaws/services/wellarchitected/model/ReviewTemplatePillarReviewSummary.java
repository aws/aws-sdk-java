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
 * Summary of a review template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ReviewTemplatePillarReviewSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReviewTemplatePillarReviewSummary implements Serializable, Cloneable, StructuredPojo {

    private String pillarId;

    private String pillarName;

    private String notes;
    /**
     * <p>
     * A count of how many questions are answered and unanswered in the requested pillar of the lens review.
     * </p>
     */
    private java.util.Map<String, Integer> questionCounts;

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

    public ReviewTemplatePillarReviewSummary withPillarId(String pillarId) {
        setPillarId(pillarId);
        return this;
    }

    /**
     * @param pillarName
     */

    public void setPillarName(String pillarName) {
        this.pillarName = pillarName;
    }

    /**
     * @return
     */

    public String getPillarName() {
        return this.pillarName;
    }

    /**
     * @param pillarName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewTemplatePillarReviewSummary withPillarName(String pillarName) {
        setPillarName(pillarName);
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

    public ReviewTemplatePillarReviewSummary withNotes(String notes) {
        setNotes(notes);
        return this;
    }

    /**
     * <p>
     * A count of how many questions are answered and unanswered in the requested pillar of the lens review.
     * </p>
     * 
     * @return A count of how many questions are answered and unanswered in the requested pillar of the lens review.
     */

    public java.util.Map<String, Integer> getQuestionCounts() {
        return questionCounts;
    }

    /**
     * <p>
     * A count of how many questions are answered and unanswered in the requested pillar of the lens review.
     * </p>
     * 
     * @param questionCounts
     *        A count of how many questions are answered and unanswered in the requested pillar of the lens review.
     */

    public void setQuestionCounts(java.util.Map<String, Integer> questionCounts) {
        this.questionCounts = questionCounts;
    }

    /**
     * <p>
     * A count of how many questions are answered and unanswered in the requested pillar of the lens review.
     * </p>
     * 
     * @param questionCounts
     *        A count of how many questions are answered and unanswered in the requested pillar of the lens review.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewTemplatePillarReviewSummary withQuestionCounts(java.util.Map<String, Integer> questionCounts) {
        setQuestionCounts(questionCounts);
        return this;
    }

    /**
     * Add a single QuestionCounts entry
     *
     * @see ReviewTemplatePillarReviewSummary#withQuestionCounts
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ReviewTemplatePillarReviewSummary addQuestionCountsEntry(String key, Integer value) {
        if (null == this.questionCounts) {
            this.questionCounts = new java.util.HashMap<String, Integer>();
        }
        if (this.questionCounts.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.questionCounts.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into QuestionCounts.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewTemplatePillarReviewSummary clearQuestionCountsEntries() {
        this.questionCounts = null;
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
        if (getPillarName() != null)
            sb.append("PillarName: ").append(getPillarName()).append(",");
        if (getNotes() != null)
            sb.append("Notes: ").append(getNotes()).append(",");
        if (getQuestionCounts() != null)
            sb.append("QuestionCounts: ").append(getQuestionCounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReviewTemplatePillarReviewSummary == false)
            return false;
        ReviewTemplatePillarReviewSummary other = (ReviewTemplatePillarReviewSummary) obj;
        if (other.getPillarId() == null ^ this.getPillarId() == null)
            return false;
        if (other.getPillarId() != null && other.getPillarId().equals(this.getPillarId()) == false)
            return false;
        if (other.getPillarName() == null ^ this.getPillarName() == null)
            return false;
        if (other.getPillarName() != null && other.getPillarName().equals(this.getPillarName()) == false)
            return false;
        if (other.getNotes() == null ^ this.getNotes() == null)
            return false;
        if (other.getNotes() != null && other.getNotes().equals(this.getNotes()) == false)
            return false;
        if (other.getQuestionCounts() == null ^ this.getQuestionCounts() == null)
            return false;
        if (other.getQuestionCounts() != null && other.getQuestionCounts().equals(this.getQuestionCounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPillarId() == null) ? 0 : getPillarId().hashCode());
        hashCode = prime * hashCode + ((getPillarName() == null) ? 0 : getPillarName().hashCode());
        hashCode = prime * hashCode + ((getNotes() == null) ? 0 : getNotes().hashCode());
        hashCode = prime * hashCode + ((getQuestionCounts() == null) ? 0 : getQuestionCounts().hashCode());
        return hashCode;
    }

    @Override
    public ReviewTemplatePillarReviewSummary clone() {
        try {
            return (ReviewTemplatePillarReviewSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.ReviewTemplatePillarReviewSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
