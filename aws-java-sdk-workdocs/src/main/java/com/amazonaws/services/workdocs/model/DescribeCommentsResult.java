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
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeComments" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCommentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of comments for the specified document version.
     * </p>
     */
    private java.util.List<Comment> comments;
    /**
     * <p>
     * The marker for the next set of results. This marker was received from a previous call.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The list of comments for the specified document version.
     * </p>
     * 
     * @return The list of comments for the specified document version.
     */

    public java.util.List<Comment> getComments() {
        return comments;
    }

    /**
     * <p>
     * The list of comments for the specified document version.
     * </p>
     * 
     * @param comments
     *        The list of comments for the specified document version.
     */

    public void setComments(java.util.Collection<Comment> comments) {
        if (comments == null) {
            this.comments = null;
            return;
        }

        this.comments = new java.util.ArrayList<Comment>(comments);
    }

    /**
     * <p>
     * The list of comments for the specified document version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComments(java.util.Collection)} or {@link #withComments(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param comments
     *        The list of comments for the specified document version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCommentsResult withComments(Comment... comments) {
        if (this.comments == null) {
            setComments(new java.util.ArrayList<Comment>(comments.length));
        }
        for (Comment ele : comments) {
            this.comments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of comments for the specified document version.
     * </p>
     * 
     * @param comments
     *        The list of comments for the specified document version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCommentsResult withComments(java.util.Collection<Comment> comments) {
        setComments(comments);
        return this;
    }

    /**
     * <p>
     * The marker for the next set of results. This marker was received from a previous call.
     * </p>
     * 
     * @param marker
     *        The marker for the next set of results. This marker was received from a previous call.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The marker for the next set of results. This marker was received from a previous call.
     * </p>
     * 
     * @return The marker for the next set of results. This marker was received from a previous call.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The marker for the next set of results. This marker was received from a previous call.
     * </p>
     * 
     * @param marker
     *        The marker for the next set of results. This marker was received from a previous call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCommentsResult withMarker(String marker) {
        setMarker(marker);
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
        if (getComments() != null)
            sb.append("Comments: ").append(getComments()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCommentsResult == false)
            return false;
        DescribeCommentsResult other = (DescribeCommentsResult) obj;
        if (other.getComments() == null ^ this.getComments() == null)
            return false;
        if (other.getComments() != null && other.getComments().equals(this.getComments()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComments() == null) ? 0 : getComments().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCommentsResult clone() {
        try {
            return (DescribeCommentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
