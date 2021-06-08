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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the reaction values provided by users on a comment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ReactionForComment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReactionForComment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The reaction for a specified comment.
     * </p>
     */
    private ReactionValueFormats reaction;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) of users who have provided reactions to the comment.
     * </p>
     */
    private java.util.List<String> reactionUsers;
    /**
     * <p>
     * A numerical count of users who reacted with the specified emoji whose identities have been subsequently deleted
     * from IAM. While these IAM users or roles no longer exist, the reactions might still appear in total reaction
     * counts.
     * </p>
     */
    private Integer reactionsFromDeletedUsersCount;

    /**
     * <p>
     * The reaction for a specified comment.
     * </p>
     * 
     * @param reaction
     *        The reaction for a specified comment.
     */

    public void setReaction(ReactionValueFormats reaction) {
        this.reaction = reaction;
    }

    /**
     * <p>
     * The reaction for a specified comment.
     * </p>
     * 
     * @return The reaction for a specified comment.
     */

    public ReactionValueFormats getReaction() {
        return this.reaction;
    }

    /**
     * <p>
     * The reaction for a specified comment.
     * </p>
     * 
     * @param reaction
     *        The reaction for a specified comment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReactionForComment withReaction(ReactionValueFormats reaction) {
        setReaction(reaction);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of users who have provided reactions to the comment.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) of users who have provided reactions to the comment.
     */

    public java.util.List<String> getReactionUsers() {
        return reactionUsers;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of users who have provided reactions to the comment.
     * </p>
     * 
     * @param reactionUsers
     *        The Amazon Resource Names (ARNs) of users who have provided reactions to the comment.
     */

    public void setReactionUsers(java.util.Collection<String> reactionUsers) {
        if (reactionUsers == null) {
            this.reactionUsers = null;
            return;
        }

        this.reactionUsers = new java.util.ArrayList<String>(reactionUsers);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of users who have provided reactions to the comment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReactionUsers(java.util.Collection)} or {@link #withReactionUsers(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param reactionUsers
     *        The Amazon Resource Names (ARNs) of users who have provided reactions to the comment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReactionForComment withReactionUsers(String... reactionUsers) {
        if (this.reactionUsers == null) {
            setReactionUsers(new java.util.ArrayList<String>(reactionUsers.length));
        }
        for (String ele : reactionUsers) {
            this.reactionUsers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of users who have provided reactions to the comment.
     * </p>
     * 
     * @param reactionUsers
     *        The Amazon Resource Names (ARNs) of users who have provided reactions to the comment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReactionForComment withReactionUsers(java.util.Collection<String> reactionUsers) {
        setReactionUsers(reactionUsers);
        return this;
    }

    /**
     * <p>
     * A numerical count of users who reacted with the specified emoji whose identities have been subsequently deleted
     * from IAM. While these IAM users or roles no longer exist, the reactions might still appear in total reaction
     * counts.
     * </p>
     * 
     * @param reactionsFromDeletedUsersCount
     *        A numerical count of users who reacted with the specified emoji whose identities have been subsequently
     *        deleted from IAM. While these IAM users or roles no longer exist, the reactions might still appear in
     *        total reaction counts.
     */

    public void setReactionsFromDeletedUsersCount(Integer reactionsFromDeletedUsersCount) {
        this.reactionsFromDeletedUsersCount = reactionsFromDeletedUsersCount;
    }

    /**
     * <p>
     * A numerical count of users who reacted with the specified emoji whose identities have been subsequently deleted
     * from IAM. While these IAM users or roles no longer exist, the reactions might still appear in total reaction
     * counts.
     * </p>
     * 
     * @return A numerical count of users who reacted with the specified emoji whose identities have been subsequently
     *         deleted from IAM. While these IAM users or roles no longer exist, the reactions might still appear in
     *         total reaction counts.
     */

    public Integer getReactionsFromDeletedUsersCount() {
        return this.reactionsFromDeletedUsersCount;
    }

    /**
     * <p>
     * A numerical count of users who reacted with the specified emoji whose identities have been subsequently deleted
     * from IAM. While these IAM users or roles no longer exist, the reactions might still appear in total reaction
     * counts.
     * </p>
     * 
     * @param reactionsFromDeletedUsersCount
     *        A numerical count of users who reacted with the specified emoji whose identities have been subsequently
     *        deleted from IAM. While these IAM users or roles no longer exist, the reactions might still appear in
     *        total reaction counts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReactionForComment withReactionsFromDeletedUsersCount(Integer reactionsFromDeletedUsersCount) {
        setReactionsFromDeletedUsersCount(reactionsFromDeletedUsersCount);
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
        if (getReaction() != null)
            sb.append("Reaction: ").append(getReaction()).append(",");
        if (getReactionUsers() != null)
            sb.append("ReactionUsers: ").append(getReactionUsers()).append(",");
        if (getReactionsFromDeletedUsersCount() != null)
            sb.append("ReactionsFromDeletedUsersCount: ").append(getReactionsFromDeletedUsersCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReactionForComment == false)
            return false;
        ReactionForComment other = (ReactionForComment) obj;
        if (other.getReaction() == null ^ this.getReaction() == null)
            return false;
        if (other.getReaction() != null && other.getReaction().equals(this.getReaction()) == false)
            return false;
        if (other.getReactionUsers() == null ^ this.getReactionUsers() == null)
            return false;
        if (other.getReactionUsers() != null && other.getReactionUsers().equals(this.getReactionUsers()) == false)
            return false;
        if (other.getReactionsFromDeletedUsersCount() == null ^ this.getReactionsFromDeletedUsersCount() == null)
            return false;
        if (other.getReactionsFromDeletedUsersCount() != null
                && other.getReactionsFromDeletedUsersCount().equals(this.getReactionsFromDeletedUsersCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReaction() == null) ? 0 : getReaction().hashCode());
        hashCode = prime * hashCode + ((getReactionUsers() == null) ? 0 : getReactionUsers().hashCode());
        hashCode = prime * hashCode + ((getReactionsFromDeletedUsersCount() == null) ? 0 : getReactionsFromDeletedUsersCount().hashCode());
        return hashCode;
    }

    @Override
    public ReactionForComment clone() {
        try {
            return (ReactionForComment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.ReactionForCommentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
