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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about recommendation feedback summaries.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/RecommendationFeedbackSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationFeedbackSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The recommendation ID that can be used to track the provided recommendations. Later on it can be used to collect
     * the feedback.
     * </p>
     */
    private String recommendationId;
    /**
     * <p>
     * List for storing reactions. Reactions are utf-8 text code for emojis.
     * </p>
     */
    private java.util.List<String> reactions;
    /**
     * <p>
     * The ID of the user that gave the feedback.
     * </p>
     * <p>
     * The <code>UserId</code> is an IAM principal that can be specified as an AWS account ID or an Amazon Resource Name
     * (ARN). For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#Principal_specifying"
     * > Specifying a Principal</a> in the <i>AWS Identity and Access Management User Guide</i>.
     * </p>
     */
    private String userId;

    /**
     * <p>
     * The recommendation ID that can be used to track the provided recommendations. Later on it can be used to collect
     * the feedback.
     * </p>
     * 
     * @param recommendationId
     *        The recommendation ID that can be used to track the provided recommendations. Later on it can be used to
     *        collect the feedback.
     */

    public void setRecommendationId(String recommendationId) {
        this.recommendationId = recommendationId;
    }

    /**
     * <p>
     * The recommendation ID that can be used to track the provided recommendations. Later on it can be used to collect
     * the feedback.
     * </p>
     * 
     * @return The recommendation ID that can be used to track the provided recommendations. Later on it can be used to
     *         collect the feedback.
     */

    public String getRecommendationId() {
        return this.recommendationId;
    }

    /**
     * <p>
     * The recommendation ID that can be used to track the provided recommendations. Later on it can be used to collect
     * the feedback.
     * </p>
     * 
     * @param recommendationId
     *        The recommendation ID that can be used to track the provided recommendations. Later on it can be used to
     *        collect the feedback.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationFeedbackSummary withRecommendationId(String recommendationId) {
        setRecommendationId(recommendationId);
        return this;
    }

    /**
     * <p>
     * List for storing reactions. Reactions are utf-8 text code for emojis.
     * </p>
     * 
     * @return List for storing reactions. Reactions are utf-8 text code for emojis.
     * @see Reaction
     */

    public java.util.List<String> getReactions() {
        return reactions;
    }

    /**
     * <p>
     * List for storing reactions. Reactions are utf-8 text code for emojis.
     * </p>
     * 
     * @param reactions
     *        List for storing reactions. Reactions are utf-8 text code for emojis.
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
     * List for storing reactions. Reactions are utf-8 text code for emojis.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReactions(java.util.Collection)} or {@link #withReactions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param reactions
     *        List for storing reactions. Reactions are utf-8 text code for emojis.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Reaction
     */

    public RecommendationFeedbackSummary withReactions(String... reactions) {
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
     * List for storing reactions. Reactions are utf-8 text code for emojis.
     * </p>
     * 
     * @param reactions
     *        List for storing reactions. Reactions are utf-8 text code for emojis.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Reaction
     */

    public RecommendationFeedbackSummary withReactions(java.util.Collection<String> reactions) {
        setReactions(reactions);
        return this;
    }

    /**
     * <p>
     * List for storing reactions. Reactions are utf-8 text code for emojis.
     * </p>
     * 
     * @param reactions
     *        List for storing reactions. Reactions are utf-8 text code for emojis.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Reaction
     */

    public RecommendationFeedbackSummary withReactions(Reaction... reactions) {
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
     * <p>
     * The ID of the user that gave the feedback.
     * </p>
     * <p>
     * The <code>UserId</code> is an IAM principal that can be specified as an AWS account ID or an Amazon Resource Name
     * (ARN). For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#Principal_specifying"
     * > Specifying a Principal</a> in the <i>AWS Identity and Access Management User Guide</i>.
     * </p>
     * 
     * @param userId
     *        The ID of the user that gave the feedback. </p>
     *        <p>
     *        The <code>UserId</code> is an IAM principal that can be specified as an AWS account ID or an Amazon
     *        Resource Name (ARN). For more information, see <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#Principal_specifying"
     *        > Specifying a Principal</a> in the <i>AWS Identity and Access Management User Guide</i>.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The ID of the user that gave the feedback.
     * </p>
     * <p>
     * The <code>UserId</code> is an IAM principal that can be specified as an AWS account ID or an Amazon Resource Name
     * (ARN). For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#Principal_specifying"
     * > Specifying a Principal</a> in the <i>AWS Identity and Access Management User Guide</i>.
     * </p>
     * 
     * @return The ID of the user that gave the feedback. </p>
     *         <p>
     *         The <code>UserId</code> is an IAM principal that can be specified as an AWS account ID or an Amazon
     *         Resource Name (ARN). For more information, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#Principal_specifying"
     *         > Specifying a Principal</a> in the <i>AWS Identity and Access Management User Guide</i>.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The ID of the user that gave the feedback.
     * </p>
     * <p>
     * The <code>UserId</code> is an IAM principal that can be specified as an AWS account ID or an Amazon Resource Name
     * (ARN). For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#Principal_specifying"
     * > Specifying a Principal</a> in the <i>AWS Identity and Access Management User Guide</i>.
     * </p>
     * 
     * @param userId
     *        The ID of the user that gave the feedback. </p>
     *        <p>
     *        The <code>UserId</code> is an IAM principal that can be specified as an AWS account ID or an Amazon
     *        Resource Name (ARN). For more information, see <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#Principal_specifying"
     *        > Specifying a Principal</a> in the <i>AWS Identity and Access Management User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationFeedbackSummary withUserId(String userId) {
        setUserId(userId);
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
        if (getRecommendationId() != null)
            sb.append("RecommendationId: ").append(getRecommendationId()).append(",");
        if (getReactions() != null)
            sb.append("Reactions: ").append(getReactions()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendationFeedbackSummary == false)
            return false;
        RecommendationFeedbackSummary other = (RecommendationFeedbackSummary) obj;
        if (other.getRecommendationId() == null ^ this.getRecommendationId() == null)
            return false;
        if (other.getRecommendationId() != null && other.getRecommendationId().equals(this.getRecommendationId()) == false)
            return false;
        if (other.getReactions() == null ^ this.getReactions() == null)
            return false;
        if (other.getReactions() != null && other.getReactions().equals(this.getReactions()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecommendationId() == null) ? 0 : getRecommendationId().hashCode());
        hashCode = prime * hashCode + ((getReactions() == null) ? 0 : getReactions().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return hashCode;
    }

    @Override
    public RecommendationFeedbackSummary clone() {
        try {
            return (RecommendationFeedbackSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codegurureviewer.model.transform.RecommendationFeedbackSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
