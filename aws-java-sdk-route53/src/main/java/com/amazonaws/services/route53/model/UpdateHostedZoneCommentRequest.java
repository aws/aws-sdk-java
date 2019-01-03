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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to update the comment for a hosted zone.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/UpdateHostedZoneComment" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateHostedZoneCommentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID for the hosted zone that you want to update the comment for.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The new comment for the hosted zone. If you don't specify a value for <code>Comment</code>, Amazon Route 53
     * deletes the existing value of the <code>Comment</code> element, if any.
     * </p>
     */
    private String comment;

    /**
     * <p>
     * The ID for the hosted zone that you want to update the comment for.
     * </p>
     * 
     * @param id
     *        The ID for the hosted zone that you want to update the comment for.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID for the hosted zone that you want to update the comment for.
     * </p>
     * 
     * @return The ID for the hosted zone that you want to update the comment for.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID for the hosted zone that you want to update the comment for.
     * </p>
     * 
     * @param id
     *        The ID for the hosted zone that you want to update the comment for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHostedZoneCommentRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The new comment for the hosted zone. If you don't specify a value for <code>Comment</code>, Amazon Route 53
     * deletes the existing value of the <code>Comment</code> element, if any.
     * </p>
     * 
     * @param comment
     *        The new comment for the hosted zone. If you don't specify a value for <code>Comment</code>, Amazon Route
     *        53 deletes the existing value of the <code>Comment</code> element, if any.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * The new comment for the hosted zone. If you don't specify a value for <code>Comment</code>, Amazon Route 53
     * deletes the existing value of the <code>Comment</code> element, if any.
     * </p>
     * 
     * @return The new comment for the hosted zone. If you don't specify a value for <code>Comment</code>, Amazon Route
     *         53 deletes the existing value of the <code>Comment</code> element, if any.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * The new comment for the hosted zone. If you don't specify a value for <code>Comment</code>, Amazon Route 53
     * deletes the existing value of the <code>Comment</code> element, if any.
     * </p>
     * 
     * @param comment
     *        The new comment for the hosted zone. If you don't specify a value for <code>Comment</code>, Amazon Route
     *        53 deletes the existing value of the <code>Comment</code> element, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHostedZoneCommentRequest withComment(String comment) {
        setComment(comment);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateHostedZoneCommentRequest == false)
            return false;
        UpdateHostedZoneCommentRequest other = (UpdateHostedZoneCommentRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        return hashCode;
    }

    @Override
    public UpdateHostedZoneCommentRequest clone() {
        return (UpdateHostedZoneCommentRequest) super.clone();
    }

}
