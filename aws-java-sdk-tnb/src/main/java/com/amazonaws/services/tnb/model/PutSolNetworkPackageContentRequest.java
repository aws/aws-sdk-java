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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/PutSolNetworkPackageContent" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutSolNetworkPackageContentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Network package content type.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * Network package file.
     * </p>
     */
    private java.nio.ByteBuffer file;
    /**
     * <p>
     * Network service descriptor info ID.
     * </p>
     */
    private String nsdInfoId;

    /**
     * <p>
     * Network package content type.
     * </p>
     * 
     * @param contentType
     *        Network package content type.
     * @see PackageContentType
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * Network package content type.
     * </p>
     * 
     * @return Network package content type.
     * @see PackageContentType
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * Network package content type.
     * </p>
     * 
     * @param contentType
     *        Network package content type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageContentType
     */

    public PutSolNetworkPackageContentRequest withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * Network package content type.
     * </p>
     * 
     * @param contentType
     *        Network package content type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageContentType
     */

    public PutSolNetworkPackageContentRequest withContentType(PackageContentType contentType) {
        this.contentType = contentType.toString();
        return this;
    }

    /**
     * <p>
     * Network package file.
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
     * @param file
     *        Network package file.
     */

    public void setFile(java.nio.ByteBuffer file) {
        this.file = file;
    }

    /**
     * <p>
     * Network package file.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return Network package file.
     */

    public java.nio.ByteBuffer getFile() {
        return this.file;
    }

    /**
     * <p>
     * Network package file.
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
     * @param file
     *        Network package file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSolNetworkPackageContentRequest withFile(java.nio.ByteBuffer file) {
        setFile(file);
        return this;
    }

    /**
     * <p>
     * Network service descriptor info ID.
     * </p>
     * 
     * @param nsdInfoId
     *        Network service descriptor info ID.
     */

    public void setNsdInfoId(String nsdInfoId) {
        this.nsdInfoId = nsdInfoId;
    }

    /**
     * <p>
     * Network service descriptor info ID.
     * </p>
     * 
     * @return Network service descriptor info ID.
     */

    public String getNsdInfoId() {
        return this.nsdInfoId;
    }

    /**
     * <p>
     * Network service descriptor info ID.
     * </p>
     * 
     * @param nsdInfoId
     *        Network service descriptor info ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSolNetworkPackageContentRequest withNsdInfoId(String nsdInfoId) {
        setNsdInfoId(nsdInfoId);
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
        if (getFile() != null)
            sb.append("File: ").append(getFile()).append(",");
        if (getNsdInfoId() != null)
            sb.append("NsdInfoId: ").append(getNsdInfoId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutSolNetworkPackageContentRequest == false)
            return false;
        PutSolNetworkPackageContentRequest other = (PutSolNetworkPackageContentRequest) obj;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getFile() == null ^ this.getFile() == null)
            return false;
        if (other.getFile() != null && other.getFile().equals(this.getFile()) == false)
            return false;
        if (other.getNsdInfoId() == null ^ this.getNsdInfoId() == null)
            return false;
        if (other.getNsdInfoId() != null && other.getNsdInfoId().equals(this.getNsdInfoId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getFile() == null) ? 0 : getFile().hashCode());
        hashCode = prime * hashCode + ((getNsdInfoId() == null) ? 0 : getNsdInfoId().hashCode());
        return hashCode;
    }

    @Override
    public PutSolNetworkPackageContentRequest clone() {
        return (PutSolNetworkPackageContentRequest) super.clone();
    }

}
