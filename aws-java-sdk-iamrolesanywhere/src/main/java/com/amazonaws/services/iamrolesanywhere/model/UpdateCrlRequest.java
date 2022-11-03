/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iamrolesanywhere.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/UpdateCrl" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCrlRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The x509 v3 specified certificate revocation list
     * </p>
     */
    private java.nio.ByteBuffer crlData;
    /**
     * <p>
     * The unique identifier of the certificate revocation list (CRL).
     * </p>
     */
    private String crlId;
    /**
     * <p>
     * The name of the Crl.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The x509 v3 specified certificate revocation list
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
     * @param crlData
     *        The x509 v3 specified certificate revocation list
     */

    public void setCrlData(java.nio.ByteBuffer crlData) {
        this.crlData = crlData;
    }

    /**
     * <p>
     * The x509 v3 specified certificate revocation list
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The x509 v3 specified certificate revocation list
     */

    public java.nio.ByteBuffer getCrlData() {
        return this.crlData;
    }

    /**
     * <p>
     * The x509 v3 specified certificate revocation list
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
     * @param crlData
     *        The x509 v3 specified certificate revocation list
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCrlRequest withCrlData(java.nio.ByteBuffer crlData) {
        setCrlData(crlData);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the certificate revocation list (CRL).
     * </p>
     * 
     * @param crlId
     *        The unique identifier of the certificate revocation list (CRL).
     */

    public void setCrlId(String crlId) {
        this.crlId = crlId;
    }

    /**
     * <p>
     * The unique identifier of the certificate revocation list (CRL).
     * </p>
     * 
     * @return The unique identifier of the certificate revocation list (CRL).
     */

    public String getCrlId() {
        return this.crlId;
    }

    /**
     * <p>
     * The unique identifier of the certificate revocation list (CRL).
     * </p>
     * 
     * @param crlId
     *        The unique identifier of the certificate revocation list (CRL).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCrlRequest withCrlId(String crlId) {
        setCrlId(crlId);
        return this;
    }

    /**
     * <p>
     * The name of the Crl.
     * </p>
     * 
     * @param name
     *        The name of the Crl.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Crl.
     * </p>
     * 
     * @return The name of the Crl.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Crl.
     * </p>
     * 
     * @param name
     *        The name of the Crl.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCrlRequest withName(String name) {
        setName(name);
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
        if (getCrlData() != null)
            sb.append("CrlData: ").append(getCrlData()).append(",");
        if (getCrlId() != null)
            sb.append("CrlId: ").append(getCrlId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCrlRequest == false)
            return false;
        UpdateCrlRequest other = (UpdateCrlRequest) obj;
        if (other.getCrlData() == null ^ this.getCrlData() == null)
            return false;
        if (other.getCrlData() != null && other.getCrlData().equals(this.getCrlData()) == false)
            return false;
        if (other.getCrlId() == null ^ this.getCrlId() == null)
            return false;
        if (other.getCrlId() != null && other.getCrlId().equals(this.getCrlId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCrlData() == null) ? 0 : getCrlData().hashCode());
        hashCode = prime * hashCode + ((getCrlId() == null) ? 0 : getCrlId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCrlRequest clone() {
        return (UpdateCrlRequest) super.clone();
    }

}
