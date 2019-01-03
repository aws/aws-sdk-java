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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/InitiateLayerUpload" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InitiateLayerUploadResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The upload ID for the layer upload. This parameter is passed to further <a>UploadLayerPart</a> and
     * <a>CompleteLayerUpload</a> operations.
     * </p>
     */
    private String uploadId;
    /**
     * <p>
     * The size, in bytes, that Amazon ECR expects future layer part uploads to be.
     * </p>
     */
    private Long partSize;

    /**
     * <p>
     * The upload ID for the layer upload. This parameter is passed to further <a>UploadLayerPart</a> and
     * <a>CompleteLayerUpload</a> operations.
     * </p>
     * 
     * @param uploadId
     *        The upload ID for the layer upload. This parameter is passed to further <a>UploadLayerPart</a> and
     *        <a>CompleteLayerUpload</a> operations.
     */

    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * <p>
     * The upload ID for the layer upload. This parameter is passed to further <a>UploadLayerPart</a> and
     * <a>CompleteLayerUpload</a> operations.
     * </p>
     * 
     * @return The upload ID for the layer upload. This parameter is passed to further <a>UploadLayerPart</a> and
     *         <a>CompleteLayerUpload</a> operations.
     */

    public String getUploadId() {
        return this.uploadId;
    }

    /**
     * <p>
     * The upload ID for the layer upload. This parameter is passed to further <a>UploadLayerPart</a> and
     * <a>CompleteLayerUpload</a> operations.
     * </p>
     * 
     * @param uploadId
     *        The upload ID for the layer upload. This parameter is passed to further <a>UploadLayerPart</a> and
     *        <a>CompleteLayerUpload</a> operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InitiateLayerUploadResult withUploadId(String uploadId) {
        setUploadId(uploadId);
        return this;
    }

    /**
     * <p>
     * The size, in bytes, that Amazon ECR expects future layer part uploads to be.
     * </p>
     * 
     * @param partSize
     *        The size, in bytes, that Amazon ECR expects future layer part uploads to be.
     */

    public void setPartSize(Long partSize) {
        this.partSize = partSize;
    }

    /**
     * <p>
     * The size, in bytes, that Amazon ECR expects future layer part uploads to be.
     * </p>
     * 
     * @return The size, in bytes, that Amazon ECR expects future layer part uploads to be.
     */

    public Long getPartSize() {
        return this.partSize;
    }

    /**
     * <p>
     * The size, in bytes, that Amazon ECR expects future layer part uploads to be.
     * </p>
     * 
     * @param partSize
     *        The size, in bytes, that Amazon ECR expects future layer part uploads to be.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InitiateLayerUploadResult withPartSize(Long partSize) {
        setPartSize(partSize);
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
        if (getUploadId() != null)
            sb.append("UploadId: ").append(getUploadId()).append(",");
        if (getPartSize() != null)
            sb.append("PartSize: ").append(getPartSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InitiateLayerUploadResult == false)
            return false;
        InitiateLayerUploadResult other = (InitiateLayerUploadResult) obj;
        if (other.getUploadId() == null ^ this.getUploadId() == null)
            return false;
        if (other.getUploadId() != null && other.getUploadId().equals(this.getUploadId()) == false)
            return false;
        if (other.getPartSize() == null ^ this.getPartSize() == null)
            return false;
        if (other.getPartSize() != null && other.getPartSize().equals(this.getPartSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUploadId() == null) ? 0 : getUploadId().hashCode());
        hashCode = prime * hashCode + ((getPartSize() == null) ? 0 : getPartSize().hashCode());
        return hashCode;
    }

    @Override
    public InitiateLayerUploadResult clone() {
        try {
            return (InitiateLayerUploadResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
