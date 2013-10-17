/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Network Interface Attachment Changes
 */
public class NetworkInterfaceAttachmentChanges implements Serializable {

    private String attachmentId;

    private Boolean deleteOnTermination;

    /**
     * Returns the value of the AttachmentId property for this object.
     *
     * @return The value of the AttachmentId property for this object.
     */
    public String getAttachmentId() {
        return attachmentId;
    }
    
    /**
     * Sets the value of the AttachmentId property for this object.
     *
     * @param attachmentId The new value for the AttachmentId property for this object.
     */
    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }
    
    /**
     * Sets the value of the AttachmentId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attachmentId The new value for the AttachmentId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public NetworkInterfaceAttachmentChanges withAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
        return this;
    }

    /**
     * Returns the value of the DeleteOnTermination property for this object.
     *
     * @return The value of the DeleteOnTermination property for this object.
     */
    public Boolean isDeleteOnTermination() {
        return deleteOnTermination;
    }
    
    /**
     * Sets the value of the DeleteOnTermination property for this object.
     *
     * @param deleteOnTermination The new value for the DeleteOnTermination property for this object.
     */
    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }
    
    /**
     * Sets the value of the DeleteOnTermination property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deleteOnTermination The new value for the DeleteOnTermination property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public NetworkInterfaceAttachmentChanges withDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    /**
     * Returns the value of the DeleteOnTermination property for this object.
     *
     * @return The value of the DeleteOnTermination property for this object.
     */
    public Boolean getDeleteOnTermination() {
        return deleteOnTermination;
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
        if (getAttachmentId() != null) sb.append("AttachmentId: " + getAttachmentId() + ",");
        if (isDeleteOnTermination() != null) sb.append("DeleteOnTermination: " + isDeleteOnTermination() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAttachmentId() == null) ? 0 : getAttachmentId().hashCode()); 
        hashCode = prime * hashCode + ((isDeleteOnTermination() == null) ? 0 : isDeleteOnTermination().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof NetworkInterfaceAttachmentChanges == false) return false;
        NetworkInterfaceAttachmentChanges other = (NetworkInterfaceAttachmentChanges)obj;
        
        if (other.getAttachmentId() == null ^ this.getAttachmentId() == null) return false;
        if (other.getAttachmentId() != null && other.getAttachmentId().equals(this.getAttachmentId()) == false) return false; 
        if (other.isDeleteOnTermination() == null ^ this.isDeleteOnTermination() == null) return false;
        if (other.isDeleteOnTermination() != null && other.isDeleteOnTermination().equals(this.isDeleteOnTermination()) == false) return false; 
        return true;
    }
    
}
    