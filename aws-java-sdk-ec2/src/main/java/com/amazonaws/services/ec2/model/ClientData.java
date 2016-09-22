/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the client-specific data.
 * </p>
 */
public class ClientData implements Serializable, Cloneable {

    /**
     * <p>
     * The time that the disk upload starts.
     * </p>
     */
    private java.util.Date uploadStart;
    /**
     * <p>
     * The time that the disk upload ends.
     * </p>
     */
    private java.util.Date uploadEnd;
    /**
     * <p>
     * The size of the uploaded disk image, in GiB.
     * </p>
     */
    private Double uploadSize;
    /**
     * <p>
     * A user-defined comment about the disk upload.
     * </p>
     */
    private String comment;

    /**
     * <p>
     * The time that the disk upload starts.
     * </p>
     * 
     * @param uploadStart
     *        The time that the disk upload starts.
     */

    public void setUploadStart(java.util.Date uploadStart) {
        this.uploadStart = uploadStart;
    }

    /**
     * <p>
     * The time that the disk upload starts.
     * </p>
     * 
     * @return The time that the disk upload starts.
     */

    public java.util.Date getUploadStart() {
        return this.uploadStart;
    }

    /**
     * <p>
     * The time that the disk upload starts.
     * </p>
     * 
     * @param uploadStart
     *        The time that the disk upload starts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientData withUploadStart(java.util.Date uploadStart) {
        setUploadStart(uploadStart);
        return this;
    }

    /**
     * <p>
     * The time that the disk upload ends.
     * </p>
     * 
     * @param uploadEnd
     *        The time that the disk upload ends.
     */

    public void setUploadEnd(java.util.Date uploadEnd) {
        this.uploadEnd = uploadEnd;
    }

    /**
     * <p>
     * The time that the disk upload ends.
     * </p>
     * 
     * @return The time that the disk upload ends.
     */

    public java.util.Date getUploadEnd() {
        return this.uploadEnd;
    }

    /**
     * <p>
     * The time that the disk upload ends.
     * </p>
     * 
     * @param uploadEnd
     *        The time that the disk upload ends.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientData withUploadEnd(java.util.Date uploadEnd) {
        setUploadEnd(uploadEnd);
        return this;
    }

    /**
     * <p>
     * The size of the uploaded disk image, in GiB.
     * </p>
     * 
     * @param uploadSize
     *        The size of the uploaded disk image, in GiB.
     */

    public void setUploadSize(Double uploadSize) {
        this.uploadSize = uploadSize;
    }

    /**
     * <p>
     * The size of the uploaded disk image, in GiB.
     * </p>
     * 
     * @return The size of the uploaded disk image, in GiB.
     */

    public Double getUploadSize() {
        return this.uploadSize;
    }

    /**
     * <p>
     * The size of the uploaded disk image, in GiB.
     * </p>
     * 
     * @param uploadSize
     *        The size of the uploaded disk image, in GiB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientData withUploadSize(Double uploadSize) {
        setUploadSize(uploadSize);
        return this;
    }

    /**
     * <p>
     * A user-defined comment about the disk upload.
     * </p>
     * 
     * @param comment
     *        A user-defined comment about the disk upload.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * A user-defined comment about the disk upload.
     * </p>
     * 
     * @return A user-defined comment about the disk upload.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * A user-defined comment about the disk upload.
     * </p>
     * 
     * @param comment
     *        A user-defined comment about the disk upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientData withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUploadStart() != null)
            sb.append("UploadStart: " + getUploadStart() + ",");
        if (getUploadEnd() != null)
            sb.append("UploadEnd: " + getUploadEnd() + ",");
        if (getUploadSize() != null)
            sb.append("UploadSize: " + getUploadSize() + ",");
        if (getComment() != null)
            sb.append("Comment: " + getComment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClientData == false)
            return false;
        ClientData other = (ClientData) obj;
        if (other.getUploadStart() == null ^ this.getUploadStart() == null)
            return false;
        if (other.getUploadStart() != null && other.getUploadStart().equals(this.getUploadStart()) == false)
            return false;
        if (other.getUploadEnd() == null ^ this.getUploadEnd() == null)
            return false;
        if (other.getUploadEnd() != null && other.getUploadEnd().equals(this.getUploadEnd()) == false)
            return false;
        if (other.getUploadSize() == null ^ this.getUploadSize() == null)
            return false;
        if (other.getUploadSize() != null && other.getUploadSize().equals(this.getUploadSize()) == false)
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

        hashCode = prime * hashCode + ((getUploadStart() == null) ? 0 : getUploadStart().hashCode());
        hashCode = prime * hashCode + ((getUploadEnd() == null) ? 0 : getUploadEnd().hashCode());
        hashCode = prime * hashCode + ((getUploadSize() == null) ? 0 : getUploadSize().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        return hashCode;
    }

    @Override
    public ClientData clone() {
        try {
            return (ClientData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
