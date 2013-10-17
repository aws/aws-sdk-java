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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;


/**
 * <p>
 * Contains the Amazon Glacier response to your request.
 * </p>
 * <p>
 * For information about the underlying REST API, go to <a href="http://docs.amazonwebservices.com/amazonglacier/latest/dev/api-archive-post.html">
 * Upload Archive </a> . For conceptual information, go to <a
 * href="http://docs.amazonwebservices.com/amazonglacier/latest/dev/working-with-archives.html"> Working with Archives in Amazon Glacier </a> .
 * </p>
 */
public class UploadArchiveResult implements Serializable {

    /**
     * The relative URI path of the newly added archive resource.
     */
    private String location;

    /**
     * The checksum of the archive computed by Amazon Glacier.
     */
    private String checksum;

    /**
     * The ID of the archive. This value is also included as part of the
     * location.
     */
    private String archiveId;

    /**
     * The relative URI path of the newly added archive resource.
     *
     * @return The relative URI path of the newly added archive resource.
     */
    public String getLocation() {
        return location;
    }
    
    /**
     * The relative URI path of the newly added archive resource.
     *
     * @param location The relative URI path of the newly added archive resource.
     */
    public void setLocation(String location) {
        this.location = location;
    }
    
    /**
     * The relative URI path of the newly added archive resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param location The relative URI path of the newly added archive resource.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UploadArchiveResult withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * The checksum of the archive computed by Amazon Glacier.
     *
     * @return The checksum of the archive computed by Amazon Glacier.
     */
    public String getChecksum() {
        return checksum;
    }
    
    /**
     * The checksum of the archive computed by Amazon Glacier.
     *
     * @param checksum The checksum of the archive computed by Amazon Glacier.
     */
    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }
    
    /**
     * The checksum of the archive computed by Amazon Glacier.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param checksum The checksum of the archive computed by Amazon Glacier.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UploadArchiveResult withChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }

    /**
     * The ID of the archive. This value is also included as part of the
     * location.
     *
     * @return The ID of the archive. This value is also included as part of the
     *         location.
     */
    public String getArchiveId() {
        return archiveId;
    }
    
    /**
     * The ID of the archive. This value is also included as part of the
     * location.
     *
     * @param archiveId The ID of the archive. This value is also included as part of the
     *         location.
     */
    public void setArchiveId(String archiveId) {
        this.archiveId = archiveId;
    }
    
    /**
     * The ID of the archive. This value is also included as part of the
     * location.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param archiveId The ID of the archive. This value is also included as part of the
     *         location.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UploadArchiveResult withArchiveId(String archiveId) {
        this.archiveId = archiveId;
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
        if (getLocation() != null) sb.append("Location: " + getLocation() + ",");
        if (getChecksum() != null) sb.append("Checksum: " + getChecksum() + ",");
        if (getArchiveId() != null) sb.append("ArchiveId: " + getArchiveId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode()); 
        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode()); 
        hashCode = prime * hashCode + ((getArchiveId() == null) ? 0 : getArchiveId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UploadArchiveResult == false) return false;
        UploadArchiveResult other = (UploadArchiveResult)obj;
        
        if (other.getLocation() == null ^ this.getLocation() == null) return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false) return false; 
        if (other.getChecksum() == null ^ this.getChecksum() == null) return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false) return false; 
        if (other.getArchiveId() == null ^ this.getArchiveId() == null) return false;
        if (other.getArchiveId() != null && other.getArchiveId().equals(this.getArchiveId()) == false) return false; 
        return true;
    }
    
}
    