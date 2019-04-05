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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The binary blob response to <a>GetExport</a>, which contains the generated SDK.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetExportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The content-type header value in the HTTP response. This will correspond to a valid 'accept' type in the request.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * The content-disposition header value in the HTTP response.
     * </p>
     */
    private String contentDisposition;
    /**
     * <p>
     * The binary blob response to <a>GetExport</a>, which contains the export.
     * </p>
     */
    private java.nio.ByteBuffer body;

    /**
     * <p>
     * The content-type header value in the HTTP response. This will correspond to a valid 'accept' type in the request.
     * </p>
     * 
     * @param contentType
     *        The content-type header value in the HTTP response. This will correspond to a valid 'accept' type in the
     *        request.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The content-type header value in the HTTP response. This will correspond to a valid 'accept' type in the request.
     * </p>
     * 
     * @return The content-type header value in the HTTP response. This will correspond to a valid 'accept' type in the
     *         request.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The content-type header value in the HTTP response. This will correspond to a valid 'accept' type in the request.
     * </p>
     * 
     * @param contentType
     *        The content-type header value in the HTTP response. This will correspond to a valid 'accept' type in the
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExportResult withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The content-disposition header value in the HTTP response.
     * </p>
     * 
     * @param contentDisposition
     *        The content-disposition header value in the HTTP response.
     */

    public void setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
    }

    /**
     * <p>
     * The content-disposition header value in the HTTP response.
     * </p>
     * 
     * @return The content-disposition header value in the HTTP response.
     */

    public String getContentDisposition() {
        return this.contentDisposition;
    }

    /**
     * <p>
     * The content-disposition header value in the HTTP response.
     * </p>
     * 
     * @param contentDisposition
     *        The content-disposition header value in the HTTP response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExportResult withContentDisposition(String contentDisposition) {
        setContentDisposition(contentDisposition);
        return this;
    }

    /**
     * <p>
     * The binary blob response to <a>GetExport</a>, which contains the export.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param body
     *        The binary blob response to <a>GetExport</a>, which contains the export.
     */

    public void setBody(java.nio.ByteBuffer body) {
        this.body = body;
    }

    /**
     * <p>
     * The binary blob response to <a>GetExport</a>, which contains the export.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The binary blob response to <a>GetExport</a>, which contains the export.
     */

    public java.nio.ByteBuffer getBody() {
        return this.body;
    }

    /**
     * <p>
     * The binary blob response to <a>GetExport</a>, which contains the export.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param body
     *        The binary blob response to <a>GetExport</a>, which contains the export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExportResult withBody(java.nio.ByteBuffer body) {
        setBody(body);
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
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getContentDisposition() != null)
            sb.append("ContentDisposition: ").append(getContentDisposition()).append(",");
        if (getBody() != null)
            sb.append("Body: ").append(getBody());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetExportResult == false)
            return false;
        GetExportResult other = (GetExportResult) obj;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getContentDisposition() == null ^ this.getContentDisposition() == null)
            return false;
        if (other.getContentDisposition() != null && other.getContentDisposition().equals(this.getContentDisposition()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getContentDisposition() == null) ? 0 : getContentDisposition().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        return hashCode;
    }

    @Override
    public GetExportResult clone() {
        try {
            return (GetExportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
