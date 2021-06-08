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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetCommentReactions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCommentReactionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of reactions to the specified comment.
     * </p>
     */
    private java.util.List<ReactionForComment> reactionsForComment;
    /**
     * <p>
     * An enumeration token that can be used in a request to return the next batch of the results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of reactions to the specified comment.
     * </p>
     * 
     * @return An array of reactions to the specified comment.
     */

    public java.util.List<ReactionForComment> getReactionsForComment() {
        return reactionsForComment;
    }

    /**
     * <p>
     * An array of reactions to the specified comment.
     * </p>
     * 
     * @param reactionsForComment
     *        An array of reactions to the specified comment.
     */

    public void setReactionsForComment(java.util.Collection<ReactionForComment> reactionsForComment) {
        if (reactionsForComment == null) {
            this.reactionsForComment = null;
            return;
        }

        this.reactionsForComment = new java.util.ArrayList<ReactionForComment>(reactionsForComment);
    }

    /**
     * <p>
     * An array of reactions to the specified comment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReactionsForComment(java.util.Collection)} or {@link #withReactionsForComment(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param reactionsForComment
     *        An array of reactions to the specified comment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommentReactionsResult withReactionsForComment(ReactionForComment... reactionsForComment) {
        if (this.reactionsForComment == null) {
            setReactionsForComment(new java.util.ArrayList<ReactionForComment>(reactionsForComment.length));
        }
        for (ReactionForComment ele : reactionsForComment) {
            this.reactionsForComment.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of reactions to the specified comment.
     * </p>
     * 
     * @param reactionsForComment
     *        An array of reactions to the specified comment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommentReactionsResult withReactionsForComment(java.util.Collection<ReactionForComment> reactionsForComment) {
        setReactionsForComment(reactionsForComment);
        return this;
    }

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next batch of the results.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that can be used in a request to return the next batch of the results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next batch of the results.
     * </p>
     * 
     * @return An enumeration token that can be used in a request to return the next batch of the results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next batch of the results.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that can be used in a request to return the next batch of the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommentReactionsResult withNextToken(String nextToken) {
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
        if (getReactionsForComment() != null)
            sb.append("ReactionsForComment: ").append(getReactionsForComment()).append(",");
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

        if (obj instanceof GetCommentReactionsResult == false)
            return false;
        GetCommentReactionsResult other = (GetCommentReactionsResult) obj;
        if (other.getReactionsForComment() == null ^ this.getReactionsForComment() == null)
            return false;
        if (other.getReactionsForComment() != null && other.getReactionsForComment().equals(this.getReactionsForComment()) == false)
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

        hashCode = prime * hashCode + ((getReactionsForComment() == null) ? 0 : getReactionsForComment().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetCommentReactionsResult clone() {
        try {
            return (GetCommentReactionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
