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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateComment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCommentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The system-generated ID of the comment you want to update. To get this ID, use
     * <a>GetCommentsForComparedCommit</a> or <a>GetCommentsForPullRequest</a>.
     * </p>
     */
    private String commentId;
    /**
     * <p>
     * The updated content with which you want to replace the existing content of the comment.
     * </p>
     */
    private String content;

    /**
     * <p>
     * The system-generated ID of the comment you want to update. To get this ID, use
     * <a>GetCommentsForComparedCommit</a> or <a>GetCommentsForPullRequest</a>.
     * </p>
     * 
     * @param commentId
     *        The system-generated ID of the comment you want to update. To get this ID, use
     *        <a>GetCommentsForComparedCommit</a> or <a>GetCommentsForPullRequest</a>.
     */

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    /**
     * <p>
     * The system-generated ID of the comment you want to update. To get this ID, use
     * <a>GetCommentsForComparedCommit</a> or <a>GetCommentsForPullRequest</a>.
     * </p>
     * 
     * @return The system-generated ID of the comment you want to update. To get this ID, use
     *         <a>GetCommentsForComparedCommit</a> or <a>GetCommentsForPullRequest</a>.
     */

    public String getCommentId() {
        return this.commentId;
    }

    /**
     * <p>
     * The system-generated ID of the comment you want to update. To get this ID, use
     * <a>GetCommentsForComparedCommit</a> or <a>GetCommentsForPullRequest</a>.
     * </p>
     * 
     * @param commentId
     *        The system-generated ID of the comment you want to update. To get this ID, use
     *        <a>GetCommentsForComparedCommit</a> or <a>GetCommentsForPullRequest</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCommentRequest withCommentId(String commentId) {
        setCommentId(commentId);
        return this;
    }

    /**
     * <p>
     * The updated content with which you want to replace the existing content of the comment.
     * </p>
     * 
     * @param content
     *        The updated content with which you want to replace the existing content of the comment.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The updated content with which you want to replace the existing content of the comment.
     * </p>
     * 
     * @return The updated content with which you want to replace the existing content of the comment.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The updated content with which you want to replace the existing content of the comment.
     * </p>
     * 
     * @param content
     *        The updated content with which you want to replace the existing content of the comment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCommentRequest withContent(String content) {
        setContent(content);
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
        if (getContent() != null)
            sb.append("Content: ").append(getContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCommentRequest == false)
            return false;
        UpdateCommentRequest other = (UpdateCommentRequest) obj;
        if (other.getCommentId() == null ^ this.getCommentId() == null)
            return false;
        if (other.getCommentId() != null && other.getCommentId().equals(this.getCommentId()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommentId() == null) ? 0 : getCommentId().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCommentRequest clone() {
        return (UpdateCommentRequest) super.clone();
    }

}
