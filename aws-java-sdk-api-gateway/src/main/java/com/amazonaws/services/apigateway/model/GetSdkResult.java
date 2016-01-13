/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

/**
 * 
 */
public class GetSdkResult implements Serializable, Cloneable {

    private String contentType;

    private String contentDisposition;

    private java.nio.ByteBuffer body;

    /**
     * @param contentType
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * @return
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * @param contentType
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetSdkResult withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * @param contentDisposition
     */
    public void setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
    }

    /**
     * @return
     */
    public String getContentDisposition() {
        return this.contentDisposition;
    }

    /**
     * @param contentDisposition
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetSdkResult withContentDisposition(String contentDisposition) {
        setContentDisposition(contentDisposition);
        return this;
    }

    /**
     * <p>
     * AWS SDK for Java performs a Base64 encoding on this field before sending
     * this request to AWS service by default. Users of the SDK should not
     * perform Base64 encoding on this field.
     * </p>
     * 
     * @param body
     */
    public void setBody(java.nio.ByteBuffer body) {
        this.body = body;
    }

    /**
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods
     * changes their {@code position}. We recommend using
     * {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view
     * of the buffer with an independent {@code position}, and calling
     * {@code get} methods on this rather than directly on the returned
     * {@code ByteBuffer}. Doing so will ensure that anyone else using the
     * {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return
     */
    public java.nio.ByteBuffer getBody() {
        return this.body;
    }

    /**
     * @param body
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetSdkResult withBody(java.nio.ByteBuffer body) {
        setBody(body);
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
        if (getContentType() != null)
            sb.append("ContentType: " + getContentType() + ",");
        if (getContentDisposition() != null)
            sb.append("ContentDisposition: " + getContentDisposition() + ",");
        if (getBody() != null)
            sb.append("Body: " + getBody());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSdkResult == false)
            return false;
        GetSdkResult other = (GetSdkResult) obj;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null
                && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getContentDisposition() == null
                ^ this.getContentDisposition() == null)
            return false;
        if (other.getContentDisposition() != null
                && other.getContentDisposition().equals(
                        this.getContentDisposition()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null
                && other.getBody().equals(this.getBody()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime
                * hashCode
                + ((getContentDisposition() == null) ? 0
                        : getContentDisposition().hashCode());
        hashCode = prime * hashCode
                + ((getBody() == null) ? 0 : getBody().hashCode());
        return hashCode;
    }

    @Override
    public GetSdkResult clone() {
        try {
            return (GetSdkResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}