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
 * The lens review of a review template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ReviewTemplateLensReview"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReviewTemplateLensReview implements Serializable, Cloneable, StructuredPojo {

    private String lensAlias;
    /**
     * <p>
     * The lens ARN.
     * </p>
     */
    private String lensArn;
    /**
     * <p>
     * The version of the lens.
     * </p>
     */
    private String lensVersion;

    private String lensName;
    /**
     * <p>
     * The status of the lens.
     * </p>
     */
    private String lensStatus;
    /**
     * <p>
     * Pillar review summaries of a lens review.
     * </p>
     */
    private java.util.List<ReviewTemplatePillarReviewSummary> pillarReviewSummaries;

    private java.util.Date updatedAt;

    private String notes;
    /**
     * <p>
     * A count of how many questions are answered and unanswered in the lens review.
     * </p>
     */
    private java.util.Map<String, Integer> questionCounts;

    private String nextToken;

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

    public ReviewTemplateLensReview withLensAlias(String lensAlias) {
        setLensAlias(lensAlias);
        return this;
    }

    /**
     * <p>
     * The lens ARN.
     * </p>
     * 
     * @param lensArn
     *        The lens ARN.
     */

    public void setLensArn(String lensArn) {
        this.lensArn = lensArn;
    }

    /**
     * <p>
     * The lens ARN.
     * </p>
     * 
     * @return The lens ARN.
     */

    public String getLensArn() {
        return this.lensArn;
    }

    /**
     * <p>
     * The lens ARN.
     * </p>
     * 
     * @param lensArn
     *        The lens ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewTemplateLensReview withLensArn(String lensArn) {
        setLensArn(lensArn);
        return this;
    }

    /**
     * <p>
     * The version of the lens.
     * </p>
     * 
     * @param lensVersion
     *        The version of the lens.
     */

    public void setLensVersion(String lensVersion) {
        this.lensVersion = lensVersion;
    }

    /**
     * <p>
     * The version of the lens.
     * </p>
     * 
     * @return The version of the lens.
     */

    public String getLensVersion() {
        return this.lensVersion;
    }

    /**
     * <p>
     * The version of the lens.
     * </p>
     * 
     * @param lensVersion
     *        The version of the lens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewTemplateLensReview withLensVersion(String lensVersion) {
        setLensVersion(lensVersion);
        return this;
    }

    /**
     * @param lensName
     */

    public void setLensName(String lensName) {
        this.lensName = lensName;
    }

    /**
     * @return
     */

    public String getLensName() {
        return this.lensName;
    }

    /**
     * @param lensName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewTemplateLensReview withLensName(String lensName) {
        setLensName(lensName);
        return this;
    }

    /**
     * <p>
     * The status of the lens.
     * </p>
     * 
     * @param lensStatus
     *        The status of the lens.
     * @see LensStatus
     */

    public void setLensStatus(String lensStatus) {
        this.lensStatus = lensStatus;
    }

    /**
     * <p>
     * The status of the lens.
     * </p>
     * 
     * @return The status of the lens.
     * @see LensStatus
     */

    public String getLensStatus() {
        return this.lensStatus;
    }

    /**
     * <p>
     * The status of the lens.
     * </p>
     * 
     * @param lensStatus
     *        The status of the lens.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LensStatus
     */

    public ReviewTemplateLensReview withLensStatus(String lensStatus) {
        setLensStatus(lensStatus);
        return this;
    }

    /**
     * <p>
     * The status of the lens.
     * </p>
     * 
     * @param lensStatus
     *        The status of the lens.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LensStatus
     */

    public ReviewTemplateLensReview withLensStatus(LensStatus lensStatus) {
        this.lensStatus = lensStatus.toString();
        return this;
    }

    /**
     * <p>
     * Pillar review summaries of a lens review.
     * </p>
     * 
     * @return Pillar review summaries of a lens review.
     */

    public java.util.List<ReviewTemplatePillarReviewSummary> getPillarReviewSummaries() {
        return pillarReviewSummaries;
    }

    /**
     * <p>
     * Pillar review summaries of a lens review.
     * </p>
     * 
     * @param pillarReviewSummaries
     *        Pillar review summaries of a lens review.
     */

    public void setPillarReviewSummaries(java.util.Collection<ReviewTemplatePillarReviewSummary> pillarReviewSummaries) {
        if (pillarReviewSummaries == null) {
            this.pillarReviewSummaries = null;
            return;
        }

        this.pillarReviewSummaries = new java.util.ArrayList<ReviewTemplatePillarReviewSummary>(pillarReviewSummaries);
    }

    /**
     * <p>
     * Pillar review summaries of a lens review.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPillarReviewSummaries(java.util.Collection)} or
     * {@link #withPillarReviewSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param pillarReviewSummaries
     *        Pillar review summaries of a lens review.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewTemplateLensReview withPillarReviewSummaries(ReviewTemplatePillarReviewSummary... pillarReviewSummaries) {
        if (this.pillarReviewSummaries == null) {
            setPillarReviewSummaries(new java.util.ArrayList<ReviewTemplatePillarReviewSummary>(pillarReviewSummaries.length));
        }
        for (ReviewTemplatePillarReviewSummary ele : pillarReviewSummaries) {
            this.pillarReviewSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Pillar review summaries of a lens review.
     * </p>
     * 
     * @param pillarReviewSummaries
     *        Pillar review summaries of a lens review.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewTemplateLensReview withPillarReviewSummaries(java.util.Collection<ReviewTemplatePillarReviewSummary> pillarReviewSummaries) {
        setPillarReviewSummaries(pillarReviewSummaries);
        return this;
    }

    /**
     * @param updatedAt
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @param updatedAt
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewTemplateLensReview withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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

    public ReviewTemplateLensReview withNotes(String notes) {
        setNotes(notes);
        return this;
    }

    /**
     * <p>
     * A count of how many questions are answered and unanswered in the lens review.
     * </p>
     * 
     * @return A count of how many questions are answered and unanswered in the lens review.
     */

    public java.util.Map<String, Integer> getQuestionCounts() {
        return questionCounts;
    }

    /**
     * <p>
     * A count of how many questions are answered and unanswered in the lens review.
     * </p>
     * 
     * @param questionCounts
     *        A count of how many questions are answered and unanswered in the lens review.
     */

    public void setQuestionCounts(java.util.Map<String, Integer> questionCounts) {
        this.questionCounts = questionCounts;
    }

    /**
     * <p>
     * A count of how many questions are answered and unanswered in the lens review.
     * </p>
     * 
     * @param questionCounts
     *        A count of how many questions are answered and unanswered in the lens review.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewTemplateLensReview withQuestionCounts(java.util.Map<String, Integer> questionCounts) {
        setQuestionCounts(questionCounts);
        return this;
    }

    /**
     * Add a single QuestionCounts entry
     *
     * @see ReviewTemplateLensReview#withQuestionCounts
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ReviewTemplateLensReview addQuestionCountsEntry(String key, Integer value) {
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

    public ReviewTemplateLensReview clearQuestionCountsEntries() {
        this.questionCounts = null;
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewTemplateLensReview withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getLensAlias() != null)
            sb.append("LensAlias: ").append(getLensAlias()).append(",");
        if (getLensArn() != null)
            sb.append("LensArn: ").append(getLensArn()).append(",");
        if (getLensVersion() != null)
            sb.append("LensVersion: ").append(getLensVersion()).append(",");
        if (getLensName() != null)
            sb.append("LensName: ").append(getLensName()).append(",");
        if (getLensStatus() != null)
            sb.append("LensStatus: ").append(getLensStatus()).append(",");
        if (getPillarReviewSummaries() != null)
            sb.append("PillarReviewSummaries: ").append(getPillarReviewSummaries()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getNotes() != null)
            sb.append("Notes: ").append(getNotes()).append(",");
        if (getQuestionCounts() != null)
            sb.append("QuestionCounts: ").append(getQuestionCounts()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReviewTemplateLensReview == false)
            return false;
        ReviewTemplateLensReview other = (ReviewTemplateLensReview) obj;
        if (other.getLensAlias() == null ^ this.getLensAlias() == null)
            return false;
        if (other.getLensAlias() != null && other.getLensAlias().equals(this.getLensAlias()) == false)
            return false;
        if (other.getLensArn() == null ^ this.getLensArn() == null)
            return false;
        if (other.getLensArn() != null && other.getLensArn().equals(this.getLensArn()) == false)
            return false;
        if (other.getLensVersion() == null ^ this.getLensVersion() == null)
            return false;
        if (other.getLensVersion() != null && other.getLensVersion().equals(this.getLensVersion()) == false)
            return false;
        if (other.getLensName() == null ^ this.getLensName() == null)
            return false;
        if (other.getLensName() != null && other.getLensName().equals(this.getLensName()) == false)
            return false;
        if (other.getLensStatus() == null ^ this.getLensStatus() == null)
            return false;
        if (other.getLensStatus() != null && other.getLensStatus().equals(this.getLensStatus()) == false)
            return false;
        if (other.getPillarReviewSummaries() == null ^ this.getPillarReviewSummaries() == null)
            return false;
        if (other.getPillarReviewSummaries() != null && other.getPillarReviewSummaries().equals(this.getPillarReviewSummaries()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getNotes() == null ^ this.getNotes() == null)
            return false;
        if (other.getNotes() != null && other.getNotes().equals(this.getNotes()) == false)
            return false;
        if (other.getQuestionCounts() == null ^ this.getQuestionCounts() == null)
            return false;
        if (other.getQuestionCounts() != null && other.getQuestionCounts().equals(this.getQuestionCounts()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLensAlias() == null) ? 0 : getLensAlias().hashCode());
        hashCode = prime * hashCode + ((getLensArn() == null) ? 0 : getLensArn().hashCode());
        hashCode = prime * hashCode + ((getLensVersion() == null) ? 0 : getLensVersion().hashCode());
        hashCode = prime * hashCode + ((getLensName() == null) ? 0 : getLensName().hashCode());
        hashCode = prime * hashCode + ((getLensStatus() == null) ? 0 : getLensStatus().hashCode());
        hashCode = prime * hashCode + ((getPillarReviewSummaries() == null) ? 0 : getPillarReviewSummaries().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getNotes() == null) ? 0 : getNotes().hashCode());
        hashCode = prime * hashCode + ((getQuestionCounts() == null) ? 0 : getQuestionCounts().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ReviewTemplateLensReview clone() {
        try {
            return (ReviewTemplateLensReview) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.ReviewTemplateLensReviewMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
