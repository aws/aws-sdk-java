/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DeleteCommentContent" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteCommentContentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique, system-generated ID of the comment. To get this ID, use <a>GetCommentsForComparedCommit</a> or
     * <a>GetCommentsForPullRequest</a>.
     * </p>
     */
    private String commentId;

    /**
     * <p>
     * The unique, system-generated ID of the comment. To get this ID, use <a>GetCommentsForComparedCommit</a> or
     * <a>GetCommentsForPullRequest</a>.
     * </p>
     * 
     * @param commentId
     *        The unique, system-generated ID of the comment. To get this ID, use <a>GetCommentsForComparedCommit</a> or
     *        <a>GetCommentsForPullRequest</a>.
     */

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    /**
     * <p>
     * The unique, system-generated ID of the comment. To get this ID, use <a>GetCommentsForComparedCommit</a> or
     * <a>GetCommentsForPullRequest</a>.
     * </p>
     * 
     * @return The unique, system-generated ID of the comment. To get this ID, use <a>GetCommentsForComparedCommit</a>
     *         or <a>GetCommentsForPullRequest</a>.
     */

    public String getCommentId() {
        return this.commentId;
    }

    /**
     * <p>
     * The unique, system-generated ID of the comment. To get this ID, use <a>GetCommentsForComparedCommit</a> or
     * <a>GetCommentsForPullRequest</a>.
     * </p>
     * 
     * @param commentId
     *        The unique, system-generated ID of the comment. To get this ID, use <a>GetCommentsForComparedCommit</a> or
     *        <a>GetCommentsForPullRequest</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCommentContentRequest withCommentId(String commentId) {
        setCommentId(commentId);
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
            sb.append("CommentId: ").append(getCommentId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCommentContentRequest == false)
            return false;
        DeleteCommentContentRequest other = (DeleteCommentContentRequest) obj;
        if (other.getCommentId() == null ^ this.getCommentId() == null)
            return false;
        if (other.getCommentId() != null && other.getCommentId().equals(this.getCommentId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommentId() == null) ? 0 : getCommentId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteCommentContentRequest clone() {
        return (DeleteCommentContentRequest) super.clone();
    }

}
