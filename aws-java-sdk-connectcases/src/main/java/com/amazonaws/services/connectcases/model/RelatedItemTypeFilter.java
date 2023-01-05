/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The list of types of related items and their parameters to use for filtering.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/RelatedItemTypeFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelatedItemTypeFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A filter for related items of type <code>Comment</code>.
     * </p>
     */
    private CommentFilter comment;
    /**
     * <p>
     * A filter for related items of type <code>Contact</code>.
     * </p>
     */
    private ContactFilter contact;

    /**
     * <p>
     * A filter for related items of type <code>Comment</code>.
     * </p>
     * 
     * @param comment
     *        A filter for related items of type <code>Comment</code>.
     */

    public void setComment(CommentFilter comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * A filter for related items of type <code>Comment</code>.
     * </p>
     * 
     * @return A filter for related items of type <code>Comment</code>.
     */

    public CommentFilter getComment() {
        return this.comment;
    }

    /**
     * <p>
     * A filter for related items of type <code>Comment</code>.
     * </p>
     * 
     * @param comment
     *        A filter for related items of type <code>Comment</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelatedItemTypeFilter withComment(CommentFilter comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * A filter for related items of type <code>Contact</code>.
     * </p>
     * 
     * @param contact
     *        A filter for related items of type <code>Contact</code>.
     */

    public void setContact(ContactFilter contact) {
        this.contact = contact;
    }

    /**
     * <p>
     * A filter for related items of type <code>Contact</code>.
     * </p>
     * 
     * @return A filter for related items of type <code>Contact</code>.
     */

    public ContactFilter getContact() {
        return this.contact;
    }

    /**
     * <p>
     * A filter for related items of type <code>Contact</code>.
     * </p>
     * 
     * @param contact
     *        A filter for related items of type <code>Contact</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelatedItemTypeFilter withContact(ContactFilter contact) {
        setContact(contact);
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
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getContact() != null)
            sb.append("Contact: ").append(getContact());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RelatedItemTypeFilter == false)
            return false;
        RelatedItemTypeFilter other = (RelatedItemTypeFilter) obj;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getContact() == null ^ this.getContact() == null)
            return false;
        if (other.getContact() != null && other.getContact().equals(this.getContact()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getContact() == null) ? 0 : getContact().hashCode());
        return hashCode;
    }

    @Override
    public RelatedItemTypeFilter clone() {
        try {
            return (RelatedItemTypeFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcases.model.transform.RelatedItemTypeFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
