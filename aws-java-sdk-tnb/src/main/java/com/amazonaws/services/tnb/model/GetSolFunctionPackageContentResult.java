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
package com.amazonaws.services.tnb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolFunctionPackageContent" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSolFunctionPackageContentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates the media type of the resource.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * Contents of the function package.
     * </p>
     */
    private java.nio.ByteBuffer packageContent;

    /**
     * <p>
     * Indicates the media type of the resource.
     * </p>
     * 
     * @param contentType
     *        Indicates the media type of the resource.
     * @see PackageContentType
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * Indicates the media type of the resource.
     * </p>
     * 
     * @return Indicates the media type of the resource.
     * @see PackageContentType
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * Indicates the media type of the resource.
     * </p>
     * 
     * @param contentType
     *        Indicates the media type of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageContentType
     */

    public GetSolFunctionPackageContentResult withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * Indicates the media type of the resource.
     * </p>
     * 
     * @param contentType
     *        Indicates the media type of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageContentType
     */

    public GetSolFunctionPackageContentResult withContentType(PackageContentType contentType) {
        this.contentType = contentType.toString();
        return this;
    }

    /**
     * <p>
     * Contents of the function package.
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
     * @param packageContent
     *        Contents of the function package.
     */

    public void setPackageContent(java.nio.ByteBuffer packageContent) {
        this.packageContent = packageContent;
    }

    /**
     * <p>
     * Contents of the function package.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return Contents of the function package.
     */

    public java.nio.ByteBuffer getPackageContent() {
        return this.packageContent;
    }

    /**
     * <p>
     * Contents of the function package.
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
     * @param packageContent
     *        Contents of the function package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolFunctionPackageContentResult withPackageContent(java.nio.ByteBuffer packageContent) {
        setPackageContent(packageContent);
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
        if (getPackageContent() != null)
            sb.append("PackageContent: ").append(getPackageContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSolFunctionPackageContentResult == false)
            return false;
        GetSolFunctionPackageContentResult other = (GetSolFunctionPackageContentResult) obj;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getPackageContent() == null ^ this.getPackageContent() == null)
            return false;
        if (other.getPackageContent() != null && other.getPackageContent().equals(this.getPackageContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getPackageContent() == null) ? 0 : getPackageContent().hashCode());
        return hashCode;
    }

    @Override
    public GetSolFunctionPackageContentResult clone() {
        try {
            return (GetSolFunctionPackageContentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
