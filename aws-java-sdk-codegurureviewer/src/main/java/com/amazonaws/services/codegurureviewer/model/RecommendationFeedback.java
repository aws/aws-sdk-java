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
package com.amazonaws.services.codegurureviewer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the recommendation feedback.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/RecommendationFeedback"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationFeedback implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the code review.
     * </p>
     */
    private String codeReviewArn;
    /**
     * <p>
     * The recommendation ID that can be used to track the provided recommendations. Later on it can be used to collect
     * the feedback.
     * </p>
     */
    private String recommendationId;
    /**
     * <p>
     * List for storing reactions. Reactions are utf-8 text code for emojis. You can send an empty list to clear off all
     * your feedback.
     * </p>
     */
    private java.util.List<String> reactions;
    /**
     * <p>
     * The user principal that made the API call.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The time at which the feedback was created.
     * </p>
     */
    private java.util.Date createdTimeStamp;
    /**
     * <p>
     * The time at which the feedback was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTimeStamp;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the code review.
     * </p>
     * 
     * @param codeReviewArn
     *        The Amazon Resource Name (ARN) that identifies the code review.
     */

    public void setCodeReviewArn(String codeReviewArn) {
        this.codeReviewArn = codeReviewArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the code review.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that identifies the code review.
     */

    public String getCodeReviewArn() {
        return this.codeReviewArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the code review.
     * </p>
     * 
     * @param codeReviewArn
     *        The Amazon Resource Name (ARN) that identifies the code review.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationFeedback withCodeReviewArn(String codeReviewArn) {
        setCodeReviewArn(codeReviewArn);
        return this;
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

    public RecommendationFeedback withRecommendationId(String recommendationId) {
        setRecommendationId(recommendationId);
        return this;
    }

    /**
     * <p>
     * List for storing reactions. Reactions are utf-8 text code for emojis. You can send an empty list to clear off all
     * your feedback.
     * </p>
     * 
     * @return List for storing reactions. Reactions are utf-8 text code for emojis. You can send an empty list to clear
     *         off all your feedback.
     * @see Reaction
     */

    public java.util.List<String> getReactions() {
        return reactions;
    }

    /**
     * <p>
     * List for storing reactions. Reactions are utf-8 text code for emojis. You can send an empty list to clear off all
     * your feedback.
     * </p>
     * 
     * @param reactions
     *        List for storing reactions. Reactions are utf-8 text code for emojis. You can send an empty list to clear
     *        off all your feedback.
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
     * List for storing reactions. Reactions are utf-8 text code for emojis. You can send an empty list to clear off all
     * your feedback.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReactions(java.util.Collection)} or {@link #withReactions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param reactions
     *        List for storing reactions. Reactions are utf-8 text code for emojis. You can send an empty list to clear
     *        off all your feedback.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Reaction
     */

    public RecommendationFeedback withReactions(String... reactions) {
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
     * List for storing reactions. Reactions are utf-8 text code for emojis. You can send an empty list to clear off all
     * your feedback.
     * </p>
     * 
     * @param reactions
     *        List for storing reactions. Reactions are utf-8 text code for emojis. You can send an empty list to clear
     *        off all your feedback.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Reaction
     */

    public RecommendationFeedback withReactions(java.util.Collection<String> reactions) {
        setReactions(reactions);
        return this;
    }

    /**
     * <p>
     * List for storing reactions. Reactions are utf-8 text code for emojis. You can send an empty list to clear off all
     * your feedback.
     * </p>
     * 
     * @param reactions
     *        List for storing reactions. Reactions are utf-8 text code for emojis. You can send an empty list to clear
     *        off all your feedback.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Reaction
     */

    public RecommendationFeedback withReactions(Reaction... reactions) {
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
     * The user principal that made the API call.
     * </p>
     * 
     * @param userId
     *        The user principal that made the API call.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The user principal that made the API call.
     * </p>
     * 
     * @return The user principal that made the API call.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The user principal that made the API call.
     * </p>
     * 
     * @param userId
     *        The user principal that made the API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationFeedback withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The time at which the feedback was created.
     * </p>
     * 
     * @param createdTimeStamp
     *        The time at which the feedback was created.
     */

    public void setCreatedTimeStamp(java.util.Date createdTimeStamp) {
        this.createdTimeStamp = createdTimeStamp;
    }

    /**
     * <p>
     * The time at which the feedback was created.
     * </p>
     * 
     * @return The time at which the feedback was created.
     */

    public java.util.Date getCreatedTimeStamp() {
        return this.createdTimeStamp;
    }

    /**
     * <p>
     * The time at which the feedback was created.
     * </p>
     * 
     * @param createdTimeStamp
     *        The time at which the feedback was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationFeedback withCreatedTimeStamp(java.util.Date createdTimeStamp) {
        setCreatedTimeStamp(createdTimeStamp);
        return this;
    }

    /**
     * <p>
     * The time at which the feedback was last updated.
     * </p>
     * 
     * @param lastUpdatedTimeStamp
     *        The time at which the feedback was last updated.
     */

    public void setLastUpdatedTimeStamp(java.util.Date lastUpdatedTimeStamp) {
        this.lastUpdatedTimeStamp = lastUpdatedTimeStamp;
    }

    /**
     * <p>
     * The time at which the feedback was last updated.
     * </p>
     * 
     * @return The time at which the feedback was last updated.
     */

    public java.util.Date getLastUpdatedTimeStamp() {
        return this.lastUpdatedTimeStamp;
    }

    /**
     * <p>
     * The time at which the feedback was last updated.
     * </p>
     * 
     * @param lastUpdatedTimeStamp
     *        The time at which the feedback was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationFeedback withLastUpdatedTimeStamp(java.util.Date lastUpdatedTimeStamp) {
        setLastUpdatedTimeStamp(lastUpdatedTimeStamp);
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
            sb.append("Reactions: ").append(getReactions()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getCreatedTimeStamp() != null)
            sb.append("CreatedTimeStamp: ").append(getCreatedTimeStamp()).append(",");
        if (getLastUpdatedTimeStamp() != null)
            sb.append("LastUpdatedTimeStamp: ").append(getLastUpdatedTimeStamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendationFeedback == false)
            return false;
        RecommendationFeedback other = (RecommendationFeedback) obj;
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
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getCreatedTimeStamp() == null ^ this.getCreatedTimeStamp() == null)
            return false;
        if (other.getCreatedTimeStamp() != null && other.getCreatedTimeStamp().equals(this.getCreatedTimeStamp()) == false)
            return false;
        if (other.getLastUpdatedTimeStamp() == null ^ this.getLastUpdatedTimeStamp() == null)
            return false;
        if (other.getLastUpdatedTimeStamp() != null && other.getLastUpdatedTimeStamp().equals(this.getLastUpdatedTimeStamp()) == false)
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
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimeStamp() == null) ? 0 : getCreatedTimeStamp().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTimeStamp() == null) ? 0 : getLastUpdatedTimeStamp().hashCode());
        return hashCode;
    }

    @Override
    public RecommendationFeedback clone() {
        try {
            return (RecommendationFeedback) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codegurureviewer.model.transform.RecommendationFeedbackMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
