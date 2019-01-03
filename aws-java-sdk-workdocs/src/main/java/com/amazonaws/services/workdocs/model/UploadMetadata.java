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
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the upload.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/UploadMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UploadMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URL of the upload.
     * </p>
     */
    private String uploadUrl;
    /**
     * <p>
     * The signed headers.
     * </p>
     */
    private java.util.Map<String, String> signedHeaders;

    /**
     * <p>
     * The URL of the upload.
     * </p>
     * 
     * @param uploadUrl
     *        The URL of the upload.
     */

    public void setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
    }

    /**
     * <p>
     * The URL of the upload.
     * </p>
     * 
     * @return The URL of the upload.
     */

    public String getUploadUrl() {
        return this.uploadUrl;
    }

    /**
     * <p>
     * The URL of the upload.
     * </p>
     * 
     * @param uploadUrl
     *        The URL of the upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadMetadata withUploadUrl(String uploadUrl) {
        setUploadUrl(uploadUrl);
        return this;
    }

    /**
     * <p>
     * The signed headers.
     * </p>
     * 
     * @return The signed headers.
     */

    public java.util.Map<String, String> getSignedHeaders() {
        return signedHeaders;
    }

    /**
     * <p>
     * The signed headers.
     * </p>
     * 
     * @param signedHeaders
     *        The signed headers.
     */

    public void setSignedHeaders(java.util.Map<String, String> signedHeaders) {
        this.signedHeaders = signedHeaders;
    }

    /**
     * <p>
     * The signed headers.
     * </p>
     * 
     * @param signedHeaders
     *        The signed headers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadMetadata withSignedHeaders(java.util.Map<String, String> signedHeaders) {
        setSignedHeaders(signedHeaders);
        return this;
    }

    public UploadMetadata addSignedHeadersEntry(String key, String value) {
        if (null == this.signedHeaders) {
            this.signedHeaders = new java.util.HashMap<String, String>();
        }
        if (this.signedHeaders.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.signedHeaders.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SignedHeaders.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadMetadata clearSignedHeadersEntries() {
        this.signedHeaders = null;
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
        if (getUploadUrl() != null)
            sb.append("UploadUrl: ").append("***Sensitive Data Redacted***").append(",");
        if (getSignedHeaders() != null)
            sb.append("SignedHeaders: ").append(getSignedHeaders());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UploadMetadata == false)
            return false;
        UploadMetadata other = (UploadMetadata) obj;
        if (other.getUploadUrl() == null ^ this.getUploadUrl() == null)
            return false;
        if (other.getUploadUrl() != null && other.getUploadUrl().equals(this.getUploadUrl()) == false)
            return false;
        if (other.getSignedHeaders() == null ^ this.getSignedHeaders() == null)
            return false;
        if (other.getSignedHeaders() != null && other.getSignedHeaders().equals(this.getSignedHeaders()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUploadUrl() == null) ? 0 : getUploadUrl().hashCode());
        hashCode = prime * hashCode + ((getSignedHeaders() == null) ? 0 : getSignedHeaders().hashCode());
        return hashCode;
    }

    @Override
    public UploadMetadata clone() {
        try {
            return (UploadMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workdocs.model.transform.UploadMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
