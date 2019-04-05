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
package com.amazonaws.services.cloudsearchdomain.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to the <code>UploadDocuments</code> request.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UploadDocumentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A batch of documents formatted in JSON or HTML.
     * </p>
     */
    private java.io.InputStream documents;
    /**
     * <p>
     * The format of the batch you are uploading. Amazon CloudSearch supports two document batch formats:
     * </p>
     * <ul>
     * <li>application/json</li>
     * <li>application/xml</li>
     * </ul>
     */
    private String contentType;

    private Long contentLength;

    /**
     * <p>
     * A batch of documents formatted in JSON or HTML.
     * </p>
     * 
     * @param documents
     *        A batch of documents formatted in JSON or HTML.
     */

    public void setDocuments(java.io.InputStream documents) {
        this.documents = documents;
    }

    /**
     * <p>
     * A batch of documents formatted in JSON or HTML.
     * </p>
     * 
     * @return A batch of documents formatted in JSON or HTML.
     */

    public java.io.InputStream getDocuments() {
        return this.documents;
    }

    /**
     * <p>
     * A batch of documents formatted in JSON or HTML.
     * </p>
     * 
     * @param documents
     *        A batch of documents formatted in JSON or HTML.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadDocumentsRequest withDocuments(java.io.InputStream documents) {
        setDocuments(documents);
        return this;
    }

    /**
     * <p>
     * The format of the batch you are uploading. Amazon CloudSearch supports two document batch formats:
     * </p>
     * <ul>
     * <li>application/json</li>
     * <li>application/xml</li>
     * </ul>
     * 
     * @param contentType
     *        The format of the batch you are uploading. Amazon CloudSearch supports two document batch formats:</p>
     *        <ul>
     *        <li>application/json</li>
     *        <li>application/xml</li>
     * @see ContentType
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The format of the batch you are uploading. Amazon CloudSearch supports two document batch formats:
     * </p>
     * <ul>
     * <li>application/json</li>
     * <li>application/xml</li>
     * </ul>
     * 
     * @return The format of the batch you are uploading. Amazon CloudSearch supports two document batch formats:</p>
     *         <ul>
     *         <li>application/json</li>
     *         <li>application/xml</li>
     * @see ContentType
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The format of the batch you are uploading. Amazon CloudSearch supports two document batch formats:
     * </p>
     * <ul>
     * <li>application/json</li>
     * <li>application/xml</li>
     * </ul>
     * 
     * @param contentType
     *        The format of the batch you are uploading. Amazon CloudSearch supports two document batch formats:</p>
     *        <ul>
     *        <li>application/json</li>
     *        <li>application/xml</li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentType
     */

    public UploadDocumentsRequest withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The format of the batch you are uploading. Amazon CloudSearch supports two document batch formats:
     * </p>
     * <ul>
     * <li>application/json</li>
     * <li>application/xml</li>
     * </ul>
     * 
     * @param contentType
     *        The format of the batch you are uploading. Amazon CloudSearch supports two document batch formats:</p>
     *        <ul>
     *        <li>application/json</li>
     *        <li>application/xml</li>
     * @see ContentType
     */

    public void setContentType(ContentType contentType) {
        withContentType(contentType);
    }

    /**
     * <p>
     * The format of the batch you are uploading. Amazon CloudSearch supports two document batch formats:
     * </p>
     * <ul>
     * <li>application/json</li>
     * <li>application/xml</li>
     * </ul>
     * 
     * @param contentType
     *        The format of the batch you are uploading. Amazon CloudSearch supports two document batch formats:</p>
     *        <ul>
     *        <li>application/json</li>
     *        <li>application/xml</li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentType
     */

    public UploadDocumentsRequest withContentType(ContentType contentType) {
        this.contentType = contentType.toString();
        return this;
    }

    /**
     * @param contentLength
     */

    public void setContentLength(Long contentLength) {
        this.contentLength = contentLength;
    }

    /**
     * @return
     */

    public Long getContentLength() {
        return this.contentLength;
    }

    /**
     * @param contentLength
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadDocumentsRequest withContentLength(Long contentLength) {
        setContentLength(contentLength);
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
        if (getDocuments() != null)
            sb.append("Documents: ").append(getDocuments()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getContentLength() != null)
            sb.append("ContentLength: ").append(getContentLength());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UploadDocumentsRequest == false)
            return false;
        UploadDocumentsRequest other = (UploadDocumentsRequest) obj;
        if (other.getDocuments() == null ^ this.getDocuments() == null)
            return false;
        if (other.getDocuments() != null && other.getDocuments().equals(this.getDocuments()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getContentLength() == null ^ this.getContentLength() == null)
            return false;
        if (other.getContentLength() != null && other.getContentLength().equals(this.getContentLength()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocuments() == null) ? 0 : getDocuments().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getContentLength() == null) ? 0 : getContentLength().hashCode());
        return hashCode;
    }

    @Override
    public UploadDocumentsRequest clone() {
        return (UploadDocumentsRequest) super.clone();
    }

}
