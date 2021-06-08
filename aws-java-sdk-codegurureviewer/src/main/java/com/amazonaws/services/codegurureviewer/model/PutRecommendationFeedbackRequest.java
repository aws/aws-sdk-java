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
package com.amazonaws.services.codegurureviewer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/PutRecommendationFeedback"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutRecommendationFeedbackRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CodeReview.html"> <code>CodeReview</code> </a>
     * object.
     * </p>
     */
    private String codeReviewArn;
    /**
     * <p>
     * The recommendation ID that can be used to track the provided recommendations and then to collect the feedback.
     * </p>
     */
    private String recommendationId;
    /**
     * <p>
     * List for storing reactions. Reactions are utf-8 text code for emojis. If you send an empty list it clears all
     * your feedback.
     * </p>
     */
    private java.util.List<String> reactions;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CodeReview.html"> <code>CodeReview</code> </a>
     * object.
     * </p>
     * 
     * @param codeReviewArn
     *        The Amazon Resource Name (ARN) of the <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CodeReview.html">
     *        <code>CodeReview</code> </a> object.
     */

    public void setCodeReviewArn(String codeReviewArn) {
        this.codeReviewArn = codeReviewArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CodeReview.html"> <code>CodeReview</code> </a>
     * object.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the <a
     *         href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CodeReview.html">
     *         <code>CodeReview</code> </a> object.
     */

    public String getCodeReviewArn() {
        return this.codeReviewArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CodeReview.html"> <code>CodeReview</code> </a>
     * object.
     * </p>
     * 
     * @param codeReviewArn
     *        The Amazon Resource Name (ARN) of the <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CodeReview.html">
     *        <code>CodeReview</code> </a> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRecommendationFeedbackRequest withCodeReviewArn(String codeReviewArn) {
        setCodeReviewArn(codeReviewArn);
        return this;
    }

    /**
     * <p>
     * The recommendation ID that can be used to track the provided recommendations and then to collect the feedback.
     * </p>
     * 
     * @param recommendationId
     *        The recommendation ID that can be used to track the provided recommendations and then to collect the
     *        feedback.
     */

    public void setRecommendationId(String recommendationId) {
        this.recommendationId = recommendationId;
    }

    /**
     * <p>
     * The recommendation ID that can be used to track the provided recommendations and then to collect the feedback.
     * </p>
     * 
     * @return The recommendation ID that can be used to track the provided recommendations and then to collect the
     *         feedback.
     */

    public String getRecommendationId() {
        return this.recommendationId;
    }

    /**
     * <p>
     * The recommendation ID that can be used to track the provided recommendations and then to collect the feedback.
     * </p>
     * 
     * @param recommendationId
     *        The recommendation ID that can be used to track the provided recommendations and then to collect the
     *        feedback.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRecommendationFeedbackRequest withRecommendationId(String recommendationId) {
        setRecommendationId(recommendationId);
        return this;
    }

    /**
     * <p>
     * List for storing reactions. Reactions are utf-8 text code for emojis. If you send an empty list it clears all
     * your feedback.
     * </p>
     * 
     * @return List for storing reactions. Reactions are utf-8 text code for emojis. If you send an empty list it clears
     *         all your feedback.
     * @see Reaction
     */

    public java.util.List<String> getReactions() {
        return reactions;
    }

    /**
     * <p>
     * List for storing reactions. Reactions are utf-8 text code for emojis. If you send an empty list it clears all
     * your feedback.
     * </p>
     * 
     * @param reactions
     *        List for storing reactions. Reactions are utf-8 text code for emojis. If you send an empty list it clears
     *        all your feedback.
     * @see Reaction
     */

    public void setReactions(java.util.Collection<String> reactions) {
        if (reactions == null) {
            this.reactions = null;
            return;
        }

        this.reactions = new java.util.ArrayList<String>(reactions);
    }

    /**
     * <p>
     * List for storing reactions. Reactions are utf-8 text code for emojis. If you send an empty list it clears all
     * your feedback.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReactions(java.util.Collection)} or {@link #withReactions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param reactions
     *        List for storing reactions. Reactions are utf-8 text code for emojis. If you send an empty list it clears
     *        all your feedback.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Reaction
     */

    public PutRecommendationFeedbackRequest withReactions(String... reactions) {
        if (this.reactions == null) {
            setReactions(new java.util.ArrayList<String>(reactions.length));
        }
        for (String ele : reactions) {
            this.reactions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List for storing reactions. Reactions are utf-8 text code for emojis. If you send an empty list it clears all
     * your feedback.
     * </p>
     * 
     * @param reactions
     *        List for storing reactions. Reactions are utf-8 text code for emojis. If you send an empty list it clears
     *        all your feedback.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Reaction
     */

    public PutRecommendationFeedbackRequest withReactions(java.util.Collection<String> reactions) {
        setReactions(reactions);
        return this;
    }

    /**
     * <p>
     * List for storing reactions. Reactions are utf-8 text code for emojis. If you send an empty list it clears all
     * your feedback.
     * </p>
     * 
     * @param reactions
     *        List for storing reactions. Reactions are utf-8 text code for emojis. If you send an empty list it clears
     *        all your feedback.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Reaction
     */

    public PutRecommendationFeedbackRequest withReactions(Reaction... reactions) {
        java.util.ArrayList<String> reactionsCopy = new java.util.ArrayList<String>(reactions.length);
        for (Reaction value : reactions) {
            reactionsCopy.add(value.toString());
        }
        if (getReactions() == null) {
            setReactions(reactionsCopy);
        } else {
            getReactions().addAll(reactionsCopy);
        }
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
        if (getCodeReviewArn() != null)
            sb.append("CodeReviewArn: ").append(getCodeReviewArn()).append(",");
        if (getRecommendationId() != null)
            sb.append("RecommendationId: ").append(getRecommendationId()).append(",");
        if (getReactions() != null)
            sb.append("Reactions: ").append(getReactions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutRecommendationFeedbackRequest == false)
            return false;
        PutRecommendationFeedbackRequest other = (PutRecommendationFeedbackRequest) obj;
        if (other.getCodeReviewArn() == null ^ this.getCodeReviewArn() == null)
            return false;
        if (other.getCodeReviewArn() != null && other.getCodeReviewArn().equals(this.getCodeReviewArn()) == false)
            return false;
        if (other.getRecommendationId() == null ^ this.getRecommendationId() == null)
            return false;
        if (other.getRecommendationId() != null && other.getRecommendationId().equals(this.getRecommendationId()) == false)
            return false;
        if (other.getReactions() == null ^ this.getReactions() == null)
            return false;
        if (other.getReactions() != null && other.getReactions().equals(this.getReactions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCodeReviewArn() == null) ? 0 : getCodeReviewArn().hashCode());
        hashCode = prime * hashCode + ((getRecommendationId() == null) ? 0 : getRecommendationId().hashCode());
        hashCode = prime * hashCode + ((getReactions() == null) ? 0 : getReactions().hashCode());
        return hashCode;
    }

    @Override
    public PutRecommendationFeedbackRequest clone() {
        return (PutRecommendationFeedbackRequest) super.clone();
    }

}
