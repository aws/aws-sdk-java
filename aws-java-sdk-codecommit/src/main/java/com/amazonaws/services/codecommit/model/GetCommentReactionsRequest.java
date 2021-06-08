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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetCommentReactions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCommentReactionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the comment for which you want to get reactions information.
     * </p>
     */
    private String commentId;
    /**
     * <p>
     * Optional. The Amazon Resource Name (ARN) of the user or identity for which you want to get reaction information.
     * </p>
     */
    private String reactionUserArn;
    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next batch of the results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A non-zero, non-negative integer used to limit the number of returned results. The default is the same as the
     * allowed maximum, 1,000.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ID of the comment for which you want to get reactions information.
     * </p>
     * 
     * @param commentId
     *        The ID of the comment for which you want to get reactions information.
     */

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    /**
     * <p>
     * The ID of the comment for which you want to get reactions information.
     * </p>
     * 
     * @return The ID of the comment for which you want to get reactions information.
     */

    public String getCommentId() {
        return this.commentId;
    }

    /**
     * <p>
     * The ID of the comment for which you want to get reactions information.
     * </p>
     * 
     * @param commentId
     *        The ID of the comment for which you want to get reactions information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommentReactionsRequest withCommentId(String commentId) {
        setCommentId(commentId);
        return this;
    }

    /**
     * <p>
     * Optional. The Amazon Resource Name (ARN) of the user or identity for which you want to get reaction information.
     * </p>
     * 
     * @param reactionUserArn
     *        Optional. The Amazon Resource Name (ARN) of the user or identity for which you want to get reaction
     *        information.
     */

    public void setReactionUserArn(String reactionUserArn) {
        this.reactionUserArn = reactionUserArn;
    }

    /**
     * <p>
     * Optional. The Amazon Resource Name (ARN) of the user or identity for which you want to get reaction information.
     * </p>
     * 
     * @return Optional. The Amazon Resource Name (ARN) of the user or identity for which you want to get reaction
     *         information.
     */

    public String getReactionUserArn() {
        return this.reactionUserArn;
    }

    /**
     * <p>
     * Optional. The Amazon Resource Name (ARN) of the user or identity for which you want to get reaction information.
     * </p>
     * 
     * @param reactionUserArn
     *        Optional. The Amazon Resource Name (ARN) of the user or identity for which you want to get reaction
     *        information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommentReactionsRequest withReactionUserArn(String reactionUserArn) {
        setReactionUserArn(reactionUserArn);
        return this;
    }

    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next batch of the results.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that, when provided in a request, returns the next batch of the results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next batch of the results.
     * </p>
     * 
     * @return An enumeration token that, when provided in a request, returns the next batch of the results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next batch of the results.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that, when provided in a request, returns the next batch of the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommentReactionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A non-zero, non-negative integer used to limit the number of returned results. The default is the same as the
     * allowed maximum, 1,000.
     * </p>
     * 
     * @param maxResults
     *        A non-zero, non-negative integer used to limit the number of returned results. The default is the same as
     *        the allowed maximum, 1,000.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * A non-zero, non-negative integer used to limit the number of returned results. The default is the same as the
     * allowed maximum, 1,000.
     * </p>
     * 
     * @return A non-zero, non-negative integer used to limit the number of returned results. The default is the same as
     *         the allowed maximum, 1,000.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * A non-zero, non-negative integer used to limit the number of returned results. The default is the same as the
     * allowed maximum, 1,000.
     * </p>
     * 
     * @param maxResults
     *        A non-zero, non-negative integer used to limit the number of returned results. The default is the same as
     *        the allowed maximum, 1,000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommentReactionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getCommentId() != null)
            sb.append("CommentId: ").append(getCommentId()).append(",");
        if (getReactionUserArn() != null)
            sb.append("ReactionUserArn: ").append(getReactionUserArn()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCommentReactionsRequest == false)
            return false;
        GetCommentReactionsRequest other = (GetCommentReactionsRequest) obj;
        if (other.getCommentId() == null ^ this.getCommentId() == null)
            return false;
        if (other.getCommentId() != null && other.getCommentId().equals(this.getCommentId()) == false)
            return false;
        if (other.getReactionUserArn() == null ^ this.getReactionUserArn() == null)
            return false;
        if (other.getReactionUserArn() != null && other.getReactionUserArn().equals(this.getReactionUserArn()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommentId() == null) ? 0 : getCommentId().hashCode());
        hashCode = prime * hashCode + ((getReactionUserArn() == null) ? 0 : getReactionUserArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetCommentReactionsRequest clone() {
        return (GetCommentReactionsRequest) super.clone();
    }

}
