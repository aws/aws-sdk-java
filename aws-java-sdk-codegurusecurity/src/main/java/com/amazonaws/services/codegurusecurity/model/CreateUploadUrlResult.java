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
package com.amazonaws.services.codegurusecurity.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/CreateUploadUrl" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUploadUrlResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the uploaded code resource.
     * </p>
     */
    private String codeArtifactId;
    /**
     * <p>
     * A set of key-value pairs that contain the required headers when uploading your resource.
     * </p>
     */
    private java.util.Map<String, String> requestHeaders;
    /**
     * <p>
     * A pre-signed S3 URL. You can upload the code file you want to scan and add the required
     * <code>requestHeaders</code> using any HTTP client.
     * </p>
     */
    private String s3Url;

    /**
     * <p>
     * The identifier for the uploaded code resource.
     * </p>
     * 
     * @param codeArtifactId
     *        The identifier for the uploaded code resource.
     */

    public void setCodeArtifactId(String codeArtifactId) {
        this.codeArtifactId = codeArtifactId;
    }

    /**
     * <p>
     * The identifier for the uploaded code resource.
     * </p>
     * 
     * @return The identifier for the uploaded code resource.
     */

    public String getCodeArtifactId() {
        return this.codeArtifactId;
    }

    /**
     * <p>
     * The identifier for the uploaded code resource.
     * </p>
     * 
     * @param codeArtifactId
     *        The identifier for the uploaded code resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUploadUrlResult withCodeArtifactId(String codeArtifactId) {
        setCodeArtifactId(codeArtifactId);
        return this;
    }

    /**
     * <p>
     * A set of key-value pairs that contain the required headers when uploading your resource.
     * </p>
     * 
     * @return A set of key-value pairs that contain the required headers when uploading your resource.
     */

    public java.util.Map<String, String> getRequestHeaders() {
        return requestHeaders;
    }

    /**
     * <p>
     * A set of key-value pairs that contain the required headers when uploading your resource.
     * </p>
     * 
     * @param requestHeaders
     *        A set of key-value pairs that contain the required headers when uploading your resource.
     */

    public void setRequestHeaders(java.util.Map<String, String> requestHeaders) {
        this.requestHeaders = requestHeaders;
    }

    /**
     * <p>
     * A set of key-value pairs that contain the required headers when uploading your resource.
     * </p>
     * 
     * @param requestHeaders
     *        A set of key-value pairs that contain the required headers when uploading your resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUploadUrlResult withRequestHeaders(java.util.Map<String, String> requestHeaders) {
        setRequestHeaders(requestHeaders);
        return this;
    }

    /**
     * Add a single RequestHeaders entry
     *
     * @see CreateUploadUrlResult#withRequestHeaders
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateUploadUrlResult addRequestHeadersEntry(String key, String value) {
        if (null == this.requestHeaders) {
            this.requestHeaders = new java.util.HashMap<String, String>();
        }
        if (this.requestHeaders.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.requestHeaders.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RequestHeaders.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUploadUrlResult clearRequestHeadersEntries() {
        this.requestHeaders = null;
        return this;
    }

    /**
     * <p>
     * A pre-signed S3 URL. You can upload the code file you want to scan and add the required
     * <code>requestHeaders</code> using any HTTP client.
     * </p>
     * 
     * @param s3Url
     *        A pre-signed S3 URL. You can upload the code file you want to scan and add the required
     *        <code>requestHeaders</code> using any HTTP client.
     */

    public void setS3Url(String s3Url) {
        this.s3Url = s3Url;
    }

    /**
     * <p>
     * A pre-signed S3 URL. You can upload the code file you want to scan and add the required
     * <code>requestHeaders</code> using any HTTP client.
     * </p>
     * 
     * @return A pre-signed S3 URL. You can upload the code file you want to scan and add the required
     *         <code>requestHeaders</code> using any HTTP client.
     */

    public String getS3Url() {
        return this.s3Url;
    }

    /**
     * <p>
     * A pre-signed S3 URL. You can upload the code file you want to scan and add the required
     * <code>requestHeaders</code> using any HTTP client.
     * </p>
     * 
     * @param s3Url
     *        A pre-signed S3 URL. You can upload the code file you want to scan and add the required
     *        <code>requestHeaders</code> using any HTTP client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUploadUrlResult withS3Url(String s3Url) {
        setS3Url(s3Url);
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
        if (getCodeArtifactId() != null)
            sb.append("CodeArtifactId: ").append(getCodeArtifactId()).append(",");
        if (getRequestHeaders() != null)
            sb.append("RequestHeaders: ").append("***Sensitive Data Redacted***").append(",");
        if (getS3Url() != null)
            sb.append("S3Url: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUploadUrlResult == false)
            return false;
        CreateUploadUrlResult other = (CreateUploadUrlResult) obj;
        if (other.getCodeArtifactId() == null ^ this.getCodeArtifactId() == null)
            return false;
        if (other.getCodeArtifactId() != null && other.getCodeArtifactId().equals(this.getCodeArtifactId()) == false)
            return false;
        if (other.getRequestHeaders() == null ^ this.getRequestHeaders() == null)
            return false;
        if (other.getRequestHeaders() != null && other.getRequestHeaders().equals(this.getRequestHeaders()) == false)
            return false;
        if (other.getS3Url() == null ^ this.getS3Url() == null)
            return false;
        if (other.getS3Url() != null && other.getS3Url().equals(this.getS3Url()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCodeArtifactId() == null) ? 0 : getCodeArtifactId().hashCode());
        hashCode = prime * hashCode + ((getRequestHeaders() == null) ? 0 : getRequestHeaders().hashCode());
        hashCode = prime * hashCode + ((getS3Url() == null) ? 0 : getS3Url().hashCode());
        return hashCode;
    }

    @Override
    public CreateUploadUrlResult clone() {
        try {
            return (CreateUploadUrlResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
