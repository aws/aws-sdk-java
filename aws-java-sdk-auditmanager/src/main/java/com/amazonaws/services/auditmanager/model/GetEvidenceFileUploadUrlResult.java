/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetEvidenceFileUploadUrl"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEvidenceFileUploadUrlResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the uploaded manual evidence file that the presigned URL was generated for.
     * </p>
     */
    private String evidenceFileName;
    /**
     * <p>
     * The presigned URL that was generated.
     * </p>
     */
    private String uploadUrl;

    /**
     * <p>
     * The name of the uploaded manual evidence file that the presigned URL was generated for.
     * </p>
     * 
     * @param evidenceFileName
     *        The name of the uploaded manual evidence file that the presigned URL was generated for.
     */

    public void setEvidenceFileName(String evidenceFileName) {
        this.evidenceFileName = evidenceFileName;
    }

    /**
     * <p>
     * The name of the uploaded manual evidence file that the presigned URL was generated for.
     * </p>
     * 
     * @return The name of the uploaded manual evidence file that the presigned URL was generated for.
     */

    public String getEvidenceFileName() {
        return this.evidenceFileName;
    }

    /**
     * <p>
     * The name of the uploaded manual evidence file that the presigned URL was generated for.
     * </p>
     * 
     * @param evidenceFileName
     *        The name of the uploaded manual evidence file that the presigned URL was generated for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEvidenceFileUploadUrlResult withEvidenceFileName(String evidenceFileName) {
        setEvidenceFileName(evidenceFileName);
        return this;
    }

    /**
     * <p>
     * The presigned URL that was generated.
     * </p>
     * 
     * @param uploadUrl
     *        The presigned URL that was generated.
     */

    public void setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
    }

    /**
     * <p>
     * The presigned URL that was generated.
     * </p>
     * 
     * @return The presigned URL that was generated.
     */

    public String getUploadUrl() {
        return this.uploadUrl;
    }

    /**
     * <p>
     * The presigned URL that was generated.
     * </p>
     * 
     * @param uploadUrl
     *        The presigned URL that was generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEvidenceFileUploadUrlResult withUploadUrl(String uploadUrl) {
        setUploadUrl(uploadUrl);
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
        if (getEvidenceFileName() != null)
            sb.append("EvidenceFileName: ").append(getEvidenceFileName()).append(",");
        if (getUploadUrl() != null)
            sb.append("UploadUrl: ").append(getUploadUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEvidenceFileUploadUrlResult == false)
            return false;
        GetEvidenceFileUploadUrlResult other = (GetEvidenceFileUploadUrlResult) obj;
        if (other.getEvidenceFileName() == null ^ this.getEvidenceFileName() == null)
            return false;
        if (other.getEvidenceFileName() != null && other.getEvidenceFileName().equals(this.getEvidenceFileName()) == false)
            return false;
        if (other.getUploadUrl() == null ^ this.getUploadUrl() == null)
            return false;
        if (other.getUploadUrl() != null && other.getUploadUrl().equals(this.getUploadUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvidenceFileName() == null) ? 0 : getEvidenceFileName().hashCode());
        hashCode = prime * hashCode + ((getUploadUrl() == null) ? 0 : getUploadUrl().hashCode());
        return hashCode;
    }

    @Override
    public GetEvidenceFileUploadUrlResult clone() {
        try {
            return (GetEvidenceFileUploadUrlResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
