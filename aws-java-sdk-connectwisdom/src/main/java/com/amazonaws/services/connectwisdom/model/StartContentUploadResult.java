/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectwisdom.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/StartContentUpload" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartContentUploadResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The headers to include in the upload.
     * </p>
     */
    private java.util.Map<String, String> headersToInclude;
    /**
     * <p>
     * The identifier of the upload.
     * </p>
     */
    private String uploadId;
    /**
     * <p>
     * The URL of the upload.
     * </p>
     */
    private String url;
    /**
     * <p>
     * The expiration time of the URL as an epoch timestamp.
     * </p>
     */
    private java.util.Date urlExpiry;

    /**
     * <p>
     * The headers to include in the upload.
     * </p>
     * 
     * @return The headers to include in the upload.
     */

    public java.util.Map<String, String> getHeadersToInclude() {
        return headersToInclude;
    }

    /**
     * <p>
     * The headers to include in the upload.
     * </p>
     * 
     * @param headersToInclude
     *        The headers to include in the upload.
     */

    public void setHeadersToInclude(java.util.Map<String, String> headersToInclude) {
        this.headersToInclude = headersToInclude;
    }

    /**
     * <p>
     * The headers to include in the upload.
     * </p>
     * 
     * @param headersToInclude
     *        The headers to include in the upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartContentUploadResult withHeadersToInclude(java.util.Map<String, String> headersToInclude) {
        setHeadersToInclude(headersToInclude);
        return this;
    }

    /**
     * Add a single HeadersToInclude entry
     *
     * @see StartContentUploadResult#withHeadersToInclude
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartContentUploadResult addHeadersToIncludeEntry(String key, String value) {
        if (null == this.headersToInclude) {
            this.headersToInclude = new java.util.HashMap<String, String>();
        }
        if (this.headersToInclude.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.headersToInclude.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into HeadersToInclude.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartContentUploadResult clearHeadersToIncludeEntries() {
        this.headersToInclude = null;
        return this;
    }

    /**
     * <p>
     * The identifier of the upload.
     * </p>
     * 
     * @param uploadId
     *        The identifier of the upload.
     */

    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * <p>
     * The identifier of the upload.
     * </p>
     * 
     * @return The identifier of the upload.
     */

    public String getUploadId() {
        return this.uploadId;
    }

    /**
     * <p>
     * The identifier of the upload.
     * </p>
     * 
     * @param uploadId
     *        The identifier of the upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartContentUploadResult withUploadId(String uploadId) {
        setUploadId(uploadId);
        return this;
    }

    /**
     * <p>
     * The URL of the upload.
     * </p>
     * 
     * @param url
     *        The URL of the upload.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL of the upload.
     * </p>
     * 
     * @return The URL of the upload.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The URL of the upload.
     * </p>
     * 
     * @param url
     *        The URL of the upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartContentUploadResult withUrl(String url) {
        setUrl(url);
        return this;
    }

    /**
     * <p>
     * The expiration time of the URL as an epoch timestamp.
     * </p>
     * 
     * @param urlExpiry
     *        The expiration time of the URL as an epoch timestamp.
     */

    public void setUrlExpiry(java.util.Date urlExpiry) {
        this.urlExpiry = urlExpiry;
    }

    /**
     * <p>
     * The expiration time of the URL as an epoch timestamp.
     * </p>
     * 
     * @return The expiration time of the URL as an epoch timestamp.
     */

    public java.util.Date getUrlExpiry() {
        return this.urlExpiry;
    }

    /**
     * <p>
     * The expiration time of the URL as an epoch timestamp.
     * </p>
     * 
     * @param urlExpiry
     *        The expiration time of the URL as an epoch timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartContentUploadResult withUrlExpiry(java.util.Date urlExpiry) {
        setUrlExpiry(urlExpiry);
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
        if (getHeadersToInclude() != null)
            sb.append("HeadersToInclude: ").append(getHeadersToInclude()).append(",");
        if (getUploadId() != null)
            sb.append("UploadId: ").append(getUploadId()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append("***Sensitive Data Redacted***").append(",");
        if (getUrlExpiry() != null)
            sb.append("UrlExpiry: ").append(getUrlExpiry());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartContentUploadResult == false)
            return false;
        StartContentUploadResult other = (StartContentUploadResult) obj;
        if (other.getHeadersToInclude() == null ^ this.getHeadersToInclude() == null)
            return false;
        if (other.getHeadersToInclude() != null && other.getHeadersToInclude().equals(this.getHeadersToInclude()) == false)
            return false;
        if (other.getUploadId() == null ^ this.getUploadId() == null)
            return false;
        if (other.getUploadId() != null && other.getUploadId().equals(this.getUploadId()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getUrlExpiry() == null ^ this.getUrlExpiry() == null)
            return false;
        if (other.getUrlExpiry() != null && other.getUrlExpiry().equals(this.getUrlExpiry()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHeadersToInclude() == null) ? 0 : getHeadersToInclude().hashCode());
        hashCode = prime * hashCode + ((getUploadId() == null) ? 0 : getUploadId().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getUrlExpiry() == null) ? 0 : getUrlExpiry().hashCode());
        return hashCode;
    }

    @Override
    public StartContentUploadResult clone() {
        try {
            return (StartContentUploadResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
