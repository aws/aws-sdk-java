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
 */
public class InitiateMultipartUploadResult implements Serializable {

    /**
     * The relative URI path of the multipart upload ID Amazon Glacier
     * created.
     */
    private String location;

    /**
     * The ID of the multipart upload. This value is also included as part of
     * the location.
     */
    private String uploadId;

    /**
     * The relative URI path of the multipart upload ID Amazon Glacier
     * created.
     *
     * @return The relative URI path of the multipart upload ID Amazon Glacier
     *         created.
     */
    public String getLocation() {
        return location;
    }
    
    /**
     * The relative URI path of the multipart upload ID Amazon Glacier
     * created.
     *
     * @param location The relative URI path of the multipart upload ID Amazon Glacier
     *         created.
     */
    public void setLocation(String location) {
        this.location = location;
    }
    
    /**
     * The relative URI path of the multipart upload ID Amazon Glacier
     * created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param location The relative URI path of the multipart upload ID Amazon Glacier
     *         created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InitiateMultipartUploadResult withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * The ID of the multipart upload. This value is also included as part of
     * the location.
     *
     * @return The ID of the multipart upload. This value is also included as part of
     *         the location.
     */
    public String getUploadId() {
        return uploadId;
    }
    
    /**
     * The ID of the multipart upload. This value is also included as part of
     * the location.
     *
     * @param uploadId The ID of the multipart upload. This value is also included as part of
     *         the location.
     */
    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }
    
    /**
     * The ID of the multipart upload. This value is also included as part of
     * the location.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param uploadId The ID of the multipart upload. This value is also included as part of
     *         the location.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InitiateMultipartUploadResult withUploadId(String uploadId) {
        this.uploadId = uploadId;
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
        if (getUploadId() != null) sb.append("UploadId: " + getUploadId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode()); 
        hashCode = prime * hashCode + ((getUploadId() == null) ? 0 : getUploadId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InitiateMultipartUploadResult == false) return false;
        InitiateMultipartUploadResult other = (InitiateMultipartUploadResult)obj;
        
        if (other.getLocation() == null ^ this.getLocation() == null) return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false) return false; 
        if (other.getUploadId() == null ^ this.getUploadId() == null) return false;
        if (other.getUploadId() != null && other.getUploadId().equals(this.getUploadId()) == false) return false; 
        return true;
    }
    
}
    