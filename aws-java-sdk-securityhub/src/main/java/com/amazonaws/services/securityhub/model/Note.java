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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A user-defined note added to a finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/Note" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Note implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The text of a note.
     * </p>
     */
    private String text;
    /**
     * <p>
     * The principal that created a note.
     * </p>
     */
    private String updatedBy;
    /**
     * <p>
     * The timestamp of when the note was updated.
     * </p>
     */
    private String updatedAt;

    /**
     * <p>
     * The text of a note.
     * </p>
     * 
     * @param text
     *        The text of a note.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The text of a note.
     * </p>
     * 
     * @return The text of a note.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * The text of a note.
     * </p>
     * 
     * @param text
     *        The text of a note.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Note withText(String text) {
        setText(text);
        return this;
    }

    /**
     * <p>
     * The principal that created a note.
     * </p>
     * 
     * @param updatedBy
     *        The principal that created a note.
     */

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * <p>
     * The principal that created a note.
     * </p>
     * 
     * @return The principal that created a note.
     */

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * <p>
     * The principal that created a note.
     * </p>
     * 
     * @param updatedBy
     *        The principal that created a note.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Note withUpdatedBy(String updatedBy) {
        setUpdatedBy(updatedBy);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the note was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the note was updated.
     */

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the note was updated.
     * </p>
     * 
     * @return The timestamp of when the note was updated.
     */

    public String getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the note was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the note was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Note withUpdatedAt(String updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getText() != null)
            sb.append("Text: ").append(getText()).append(",");
        if (getUpdatedBy() != null)
            sb.append("UpdatedBy: ").append(getUpdatedBy()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Note == false)
            return false;
        Note other = (Note) obj;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getUpdatedBy() == null ^ this.getUpdatedBy() == null)
            return false;
        if (other.getUpdatedBy() != null && other.getUpdatedBy().equals(this.getUpdatedBy()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getUpdatedBy() == null) ? 0 : getUpdatedBy().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public Note clone() {
        try {
            return (Note) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.NoteMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
