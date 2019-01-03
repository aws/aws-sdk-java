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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The Amazon Glacier response to your request.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InitiateMultipartUploadResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The relative URI path of the multipart upload ID Amazon Glacier created.
     * </p>
     */
    private String location;
    /**
     * <p>
     * The ID of the multipart upload. This value is also included as part of the location.
     * </p>
     */
    private String uploadId;

    /**
     * <p>
     * The relative URI path of the multipart upload ID Amazon Glacier created.
     * </p>
     * 
     * @param location
     *        The relative URI path of the multipart upload ID Amazon Glacier created.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The relative URI path of the multipart upload ID Amazon Glacier created.
     * </p>
     * 
     * @return The relative URI path of the multipart upload ID Amazon Glacier created.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The relative URI path of the multipart upload ID Amazon Glacier created.
     * </p>
     * 
     * @param location
     *        The relative URI path of the multipart upload ID Amazon Glacier created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InitiateMultipartUploadResult withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The ID of the multipart upload. This value is also included as part of the location.
     * </p>
     * 
     * @param uploadId
     *        The ID of the multipart upload. This value is also included as part of the location.
     */

    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * <p>
     * The ID of the multipart upload. This value is also included as part of the location.
     * </p>
     * 
     * @return The ID of the multipart upload. This value is also included as part of the location.
     */

    public String getUploadId() {
        return this.uploadId;
    }

    /**
     * <p>
     * The ID of the multipart upload. This value is also included as part of the location.
     * </p>
     * 
     * @param uploadId
     *        The ID of the multipart upload. This value is also included as part of the location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InitiateMultipartUploadResult withUploadId(String uploadId) {
        setUploadId(uploadId);
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
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getUploadId() != null)
            sb.append("UploadId: ").append(getUploadId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InitiateMultipartUploadResult == false)
            return false;
        InitiateMultipartUploadResult other = (InitiateMultipartUploadResult) obj;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getUploadId() == null ^ this.getUploadId() == null)
            return false;
        if (other.getUploadId() != null && other.getUploadId().equals(this.getUploadId()) == false)
            return false;
        return true;
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
    public InitiateMultipartUploadResult clone() {
        try {
            return (InitiateMultipartUploadResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
