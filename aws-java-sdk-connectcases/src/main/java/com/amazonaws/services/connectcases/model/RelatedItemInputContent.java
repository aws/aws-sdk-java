/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents the content of a related item to be created.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/RelatedItemInputContent"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelatedItemInputContent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Represents the content of a comment to be returned to agents.
     * </p>
     */
    private CommentContent comment;
    /**
     * <p>
     * Object representing a contact in Amazon Connect as an API request field.
     * </p>
     */
    private Contact contact;

    /**
     * <p>
     * Represents the content of a comment to be returned to agents.
     * </p>
     * 
     * @param comment
     *        Represents the content of a comment to be returned to agents.
     */

    public void setComment(CommentContent comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * Represents the content of a comment to be returned to agents.
     * </p>
     * 
     * @return Represents the content of a comment to be returned to agents.
     */

    public CommentContent getComment() {
        return this.comment;
    }

    /**
     * <p>
     * Represents the content of a comment to be returned to agents.
     * </p>
     * 
     * @param comment
     *        Represents the content of a comment to be returned to agents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelatedItemInputContent withComment(CommentContent comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * Object representing a contact in Amazon Connect as an API request field.
     * </p>
     * 
     * @param contact
     *        Object representing a contact in Amazon Connect as an API request field.
     */

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    /**
     * <p>
     * Object representing a contact in Amazon Connect as an API request field.
     * </p>
     * 
     * @return Object representing a contact in Amazon Connect as an API request field.
     */

    public Contact getContact() {
        return this.contact;
    }

    /**
     * <p>
     * Object representing a contact in Amazon Connect as an API request field.
     * </p>
     * 
     * @param contact
     *        Object representing a contact in Amazon Connect as an API request field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelatedItemInputContent withContact(Contact contact) {
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

        if (obj instanceof RelatedItemInputContent == false)
            return false;
        RelatedItemInputContent other = (RelatedItemInputContent) obj;
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
    public RelatedItemInputContent clone() {
        try {
            return (RelatedItemInputContent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcases.model.transform.RelatedItemInputContentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
