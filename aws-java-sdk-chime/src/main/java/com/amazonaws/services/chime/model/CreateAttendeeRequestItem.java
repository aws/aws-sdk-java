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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon Chime SDK attendee fields to create, used with the BatchCreateAttendee action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateAttendeeRequestItem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAttendeeRequestItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Chime SDK external user ID. An idempotency token. Links the attendee to an identity managed by a
     * builder application.
     * </p>
     */
    private String externalUserId;
    /**
     * <p>
     * The tag key-value pairs.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon Chime SDK external user ID. An idempotency token. Links the attendee to an identity managed by a
     * builder application.
     * </p>
     * 
     * @param externalUserId
     *        The Amazon Chime SDK external user ID. An idempotency token. Links the attendee to an identity managed by
     *        a builder application.
     */

    public void setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
    }

    /**
     * <p>
     * The Amazon Chime SDK external user ID. An idempotency token. Links the attendee to an identity managed by a
     * builder application.
     * </p>
     * 
     * @return The Amazon Chime SDK external user ID. An idempotency token. Links the attendee to an identity managed by
     *         a builder application.
     */

    public String getExternalUserId() {
        return this.externalUserId;
    }

    /**
     * <p>
     * The Amazon Chime SDK external user ID. An idempotency token. Links the attendee to an identity managed by a
     * builder application.
     * </p>
     * 
     * @param externalUserId
     *        The Amazon Chime SDK external user ID. An idempotency token. Links the attendee to an identity managed by
     *        a builder application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAttendeeRequestItem withExternalUserId(String externalUserId) {
        setExternalUserId(externalUserId);
        return this;
    }

    /**
     * <p>
     * The tag key-value pairs.
     * </p>
     * 
     * @return The tag key-value pairs.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag key-value pairs.
     * </p>
     * 
     * @param tags
     *        The tag key-value pairs.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tag key-value pairs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tag key-value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAttendeeRequestItem withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tag key-value pairs.
     * </p>
     * 
     * @param tags
     *        The tag key-value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAttendeeRequestItem withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getExternalUserId() != null)
            sb.append("ExternalUserId: ").append("***Sensitive Data Redacted***").append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAttendeeRequestItem == false)
            return false;
        CreateAttendeeRequestItem other = (CreateAttendeeRequestItem) obj;
        if (other.getExternalUserId() == null ^ this.getExternalUserId() == null)
            return false;
        if (other.getExternalUserId() != null && other.getExternalUserId().equals(this.getExternalUserId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExternalUserId() == null) ? 0 : getExternalUserId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateAttendeeRequestItem clone() {
        try {
            return (CreateAttendeeRequestItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.CreateAttendeeRequestItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
