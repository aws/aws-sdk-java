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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListReviewTemplateAnswers"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListReviewTemplateAnswersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the review template.
     * </p>
     */
    private String templateArn;

    private String lensAlias;
    /**
     * <p>
     * List of answer summaries of a lens review in a review template.
     * </p>
     */
    private java.util.List<ReviewTemplateAnswerSummary> answerSummaries;

    private String nextToken;

    /**
     * <p>
     * The ARN of the review template.
     * </p>
     * 
     * @param templateArn
     *        The ARN of the review template.
     */

    public void setTemplateArn(String templateArn) {
        this.templateArn = templateArn;
    }

    /**
     * <p>
     * The ARN of the review template.
     * </p>
     * 
     * @return The ARN of the review template.
     */

    public String getTemplateArn() {
        return this.templateArn;
    }

    /**
     * <p>
     * The ARN of the review template.
     * </p>
     * 
     * @param templateArn
     *        The ARN of the review template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReviewTemplateAnswersResult withTemplateArn(String templateArn) {
        setTemplateArn(templateArn);
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

    public ListReviewTemplateAnswersResult withLensAlias(String lensAlias) {
        setLensAlias(lensAlias);
        return this;
    }

    /**
     * <p>
     * List of answer summaries of a lens review in a review template.
     * </p>
     * 
     * @return List of answer summaries of a lens review in a review template.
     */

    public java.util.List<ReviewTemplateAnswerSummary> getAnswerSummaries() {
        return answerSummaries;
    }

    /**
     * <p>
     * List of answer summaries of a lens review in a review template.
     * </p>
     * 
     * @param answerSummaries
     *        List of answer summaries of a lens review in a review template.
     */

    public void setAnswerSummaries(java.util.Collection<ReviewTemplateAnswerSummary> answerSummaries) {
        if (answerSummaries == null) {
            this.answerSummaries = null;
            return;
        }

        this.answerSummaries = new java.util.ArrayList<ReviewTemplateAnswerSummary>(answerSummaries);
    }

    /**
     * <p>
     * List of answer summaries of a lens review in a review template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnswerSummaries(java.util.Collection)} or {@link #withAnswerSummaries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param answerSummaries
     *        List of answer summaries of a lens review in a review template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReviewTemplateAnswersResult withAnswerSummaries(ReviewTemplateAnswerSummary... answerSummaries) {
        if (this.answerSummaries == null) {
            setAnswerSummaries(new java.util.ArrayList<ReviewTemplateAnswerSummary>(answerSummaries.length));
        }
        for (ReviewTemplateAnswerSummary ele : answerSummaries) {
            this.answerSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of answer summaries of a lens review in a review template.
     * </p>
     * 
     * @param answerSummaries
     *        List of answer summaries of a lens review in a review template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReviewTemplateAnswersResult withAnswerSummaries(java.util.Collection<ReviewTemplateAnswerSummary> answerSummaries) {
        setAnswerSummaries(answerSummaries);
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

    public ListReviewTemplateAnswersResult withNextToken(String nextToken) {
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
        if (getTemplateArn() != null)
            sb.append("TemplateArn: ").append(getTemplateArn()).append(",");
        if (getLensAlias() != null)
            sb.append("LensAlias: ").append(getLensAlias()).append(",");
        if (getAnswerSummaries() != null)
            sb.append("AnswerSummaries: ").append(getAnswerSummaries()).append(",");
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

        if (obj instanceof ListReviewTemplateAnswersResult == false)
            return false;
        ListReviewTemplateAnswersResult other = (ListReviewTemplateAnswersResult) obj;
        if (other.getTemplateArn() == null ^ this.getTemplateArn() == null)
            return false;
        if (other.getTemplateArn() != null && other.getTemplateArn().equals(this.getTemplateArn()) == false)
            return false;
        if (other.getLensAlias() == null ^ this.getLensAlias() == null)
            return false;
        if (other.getLensAlias() != null && other.getLensAlias().equals(this.getLensAlias()) == false)
            return false;
        if (other.getAnswerSummaries() == null ^ this.getAnswerSummaries() == null)
            return false;
        if (other.getAnswerSummaries() != null && other.getAnswerSummaries().equals(this.getAnswerSummaries()) == false)
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

        hashCode = prime * hashCode + ((getTemplateArn() == null) ? 0 : getTemplateArn().hashCode());
        hashCode = prime * hashCode + ((getLensAlias() == null) ? 0 : getLensAlias().hashCode());
        hashCode = prime * hashCode + ((getAnswerSummaries() == null) ? 0 : getAnswerSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListReviewTemplateAnswersResult clone() {
        try {
            return (ListReviewTemplateAnswersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
