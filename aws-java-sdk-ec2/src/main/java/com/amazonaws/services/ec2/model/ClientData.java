/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Client-specific data.
 * </p>
 */
public class ClientData implements Serializable, Cloneable {

    /**
     * The time that the disk upload starts.
     */
    private java.util.Date uploadStart;

    /**
     * The time that the disk upload ends.
     */
    private java.util.Date uploadEnd;

    /**
     * The size of the uploaded disk image.
     */
    private Double uploadSize;

    /**
     * User-defined comment about the upload.
     */
    private String comment;

    /**
     * The time that the disk upload starts.
     *
     * @return The time that the disk upload starts.
     */
    public java.util.Date getUploadStart() {
        return uploadStart;
    }
    
    /**
     * The time that the disk upload starts.
     *
     * @param uploadStart The time that the disk upload starts.
     */
    public void setUploadStart(java.util.Date uploadStart) {
        this.uploadStart = uploadStart;
    }
    
    /**
     * The time that the disk upload starts.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param uploadStart The time that the disk upload starts.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ClientData withUploadStart(java.util.Date uploadStart) {
        this.uploadStart = uploadStart;
        return this;
    }

    /**
     * The time that the disk upload ends.
     *
     * @return The time that the disk upload ends.
     */
    public java.util.Date getUploadEnd() {
        return uploadEnd;
    }
    
    /**
     * The time that the disk upload ends.
     *
     * @param uploadEnd The time that the disk upload ends.
     */
    public void setUploadEnd(java.util.Date uploadEnd) {
        this.uploadEnd = uploadEnd;
    }
    
    /**
     * The time that the disk upload ends.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param uploadEnd The time that the disk upload ends.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ClientData withUploadEnd(java.util.Date uploadEnd) {
        this.uploadEnd = uploadEnd;
        return this;
    }

    /**
     * The size of the uploaded disk image.
     *
     * @return The size of the uploaded disk image.
     */
    public Double getUploadSize() {
        return uploadSize;
    }
    
    /**
     * The size of the uploaded disk image.
     *
     * @param uploadSize The size of the uploaded disk image.
     */
    public void setUploadSize(Double uploadSize) {
        this.uploadSize = uploadSize;
    }
    
    /**
     * The size of the uploaded disk image.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param uploadSize The size of the uploaded disk image.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ClientData withUploadSize(Double uploadSize) {
        this.uploadSize = uploadSize;
        return this;
    }

    /**
     * User-defined comment about the upload.
     *
     * @return User-defined comment about the upload.
     */
    public String getComment() {
        return comment;
    }
    
    /**
     * User-defined comment about the upload.
     *
     * @param comment User-defined comment about the upload.
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
    
    /**
     * User-defined comment about the upload.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param comment User-defined comment about the upload.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ClientData withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUploadStart() != null) sb.append("UploadStart: " + getUploadStart() + ",");
        if (getUploadEnd() != null) sb.append("UploadEnd: " + getUploadEnd() + ",");
        if (getUploadSize() != null) sb.append("UploadSize: " + getUploadSize() + ",");
        if (getComment() != null) sb.append("Comment: " + getComment() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ClientData == false) return false;
        ClientData other = (ClientData)obj;
        
        if (other.getUploadStart() == null ^ this.getUploadStart() == null) return false;
        if (other.getUploadStart() != null && other.getUploadStart().equals(this.getUploadStart()) == false) return false; 
        if (other.getUploadEnd() == null ^ this.getUploadEnd() == null) return false;
        if (other.getUploadEnd() != null && other.getUploadEnd().equals(this.getUploadEnd()) == false) return false; 
        if (other.getUploadSize() == null ^ this.getUploadSize() == null) return false;
        if (other.getUploadSize() != null && other.getUploadSize().equals(this.getUploadSize()) == false) return false; 
        if (other.getComment() == null ^ this.getComment() == null) return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false) return false; 
        return true;
    }
    
    @Override
    public ClientData clone() {
        try {
            return (ClientData) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    