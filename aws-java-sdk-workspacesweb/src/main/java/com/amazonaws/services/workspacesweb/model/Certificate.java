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
package com.amazonaws.services.workspacesweb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The certificate.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/Certificate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Certificate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The body of the certificate.
     * </p>
     */
    private java.nio.ByteBuffer body;
    /**
     * <p>
     * The entity that issued the certificate.
     * </p>
     */
    private String issuer;
    /**
     * <p>
     * The certificate is not valid after this date.
     * </p>
     */
    private java.util.Date notValidAfter;
    /**
     * <p>
     * The certificate is not valid before this date.
     * </p>
     */
    private java.util.Date notValidBefore;
    /**
     * <p>
     * The entity the certificate belongs to.
     * </p>
     */
    private String subject;
    /**
     * <p>
     * A hexadecimal identifier for the certificate.
     * </p>
     */
    private String thumbprint;

    /**
     * <p>
     * The body of the certificate.
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
     *        The body of the certificate.
     */

    public void setBody(java.nio.ByteBuffer body) {
        this.body = body;
    }

    /**
     * <p>
     * The body of the certificate.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The body of the certificate.
     */

    public java.nio.ByteBuffer getBody() {
        return this.body;
    }

    /**
     * <p>
     * The body of the certificate.
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
     *        The body of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withBody(java.nio.ByteBuffer body) {
        setBody(body);
        return this;
    }

    /**
     * <p>
     * The entity that issued the certificate.
     * </p>
     * 
     * @param issuer
     *        The entity that issued the certificate.
     */

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    /**
     * <p>
     * The entity that issued the certificate.
     * </p>
     * 
     * @return The entity that issued the certificate.
     */

    public String getIssuer() {
        return this.issuer;
    }

    /**
     * <p>
     * The entity that issued the certificate.
     * </p>
     * 
     * @param issuer
     *        The entity that issued the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withIssuer(String issuer) {
        setIssuer(issuer);
        return this;
    }

    /**
     * <p>
     * The certificate is not valid after this date.
     * </p>
     * 
     * @param notValidAfter
     *        The certificate is not valid after this date.
     */

    public void setNotValidAfter(java.util.Date notValidAfter) {
        this.notValidAfter = notValidAfter;
    }

    /**
     * <p>
     * The certificate is not valid after this date.
     * </p>
     * 
     * @return The certificate is not valid after this date.
     */

    public java.util.Date getNotValidAfter() {
        return this.notValidAfter;
    }

    /**
     * <p>
     * The certificate is not valid after this date.
     * </p>
     * 
     * @param notValidAfter
     *        The certificate is not valid after this date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withNotValidAfter(java.util.Date notValidAfter) {
        setNotValidAfter(notValidAfter);
        return this;
    }

    /**
     * <p>
     * The certificate is not valid before this date.
     * </p>
     * 
     * @param notValidBefore
     *        The certificate is not valid before this date.
     */

    public void setNotValidBefore(java.util.Date notValidBefore) {
        this.notValidBefore = notValidBefore;
    }

    /**
     * <p>
     * The certificate is not valid before this date.
     * </p>
     * 
     * @return The certificate is not valid before this date.
     */

    public java.util.Date getNotValidBefore() {
        return this.notValidBefore;
    }

    /**
     * <p>
     * The certificate is not valid before this date.
     * </p>
     * 
     * @param notValidBefore
     *        The certificate is not valid before this date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withNotValidBefore(java.util.Date notValidBefore) {
        setNotValidBefore(notValidBefore);
        return this;
    }

    /**
     * <p>
     * The entity the certificate belongs to.
     * </p>
     * 
     * @param subject
     *        The entity the certificate belongs to.
     */

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * <p>
     * The entity the certificate belongs to.
     * </p>
     * 
     * @return The entity the certificate belongs to.
     */

    public String getSubject() {
        return this.subject;
    }

    /**
     * <p>
     * The entity the certificate belongs to.
     * </p>
     * 
     * @param subject
     *        The entity the certificate belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withSubject(String subject) {
        setSubject(subject);
        return this;
    }

    /**
     * <p>
     * A hexadecimal identifier for the certificate.
     * </p>
     * 
     * @param thumbprint
     *        A hexadecimal identifier for the certificate.
     */

    public void setThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
    }

    /**
     * <p>
     * A hexadecimal identifier for the certificate.
     * </p>
     * 
     * @return A hexadecimal identifier for the certificate.
     */

    public String getThumbprint() {
        return this.thumbprint;
    }

    /**
     * <p>
     * A hexadecimal identifier for the certificate.
     * </p>
     * 
     * @param thumbprint
     *        A hexadecimal identifier for the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withThumbprint(String thumbprint) {
        setThumbprint(thumbprint);
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
        if (getBody() != null)
            sb.append("Body: ").append(getBody()).append(",");
        if (getIssuer() != null)
            sb.append("Issuer: ").append(getIssuer()).append(",");
        if (getNotValidAfter() != null)
            sb.append("NotValidAfter: ").append(getNotValidAfter()).append(",");
        if (getNotValidBefore() != null)
            sb.append("NotValidBefore: ").append(getNotValidBefore()).append(",");
        if (getSubject() != null)
            sb.append("Subject: ").append(getSubject()).append(",");
        if (getThumbprint() != null)
            sb.append("Thumbprint: ").append(getThumbprint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Certificate == false)
            return false;
        Certificate other = (Certificate) obj;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getIssuer() == null ^ this.getIssuer() == null)
            return false;
        if (other.getIssuer() != null && other.getIssuer().equals(this.getIssuer()) == false)
            return false;
        if (other.getNotValidAfter() == null ^ this.getNotValidAfter() == null)
            return false;
        if (other.getNotValidAfter() != null && other.getNotValidAfter().equals(this.getNotValidAfter()) == false)
            return false;
        if (other.getNotValidBefore() == null ^ this.getNotValidBefore() == null)
            return false;
        if (other.getNotValidBefore() != null && other.getNotValidBefore().equals(this.getNotValidBefore()) == false)
            return false;
        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false)
            return false;
        if (other.getThumbprint() == null ^ this.getThumbprint() == null)
            return false;
        if (other.getThumbprint() != null && other.getThumbprint().equals(this.getThumbprint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getIssuer() == null) ? 0 : getIssuer().hashCode());
        hashCode = prime * hashCode + ((getNotValidAfter() == null) ? 0 : getNotValidAfter().hashCode());
        hashCode = prime * hashCode + ((getNotValidBefore() == null) ? 0 : getNotValidBefore().hashCode());
        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode());
        hashCode = prime * hashCode + ((getThumbprint() == null) ? 0 : getThumbprint().hashCode());
        return hashCode;
    }

    @Override
    public Certificate clone() {
        try {
            return (Certificate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspacesweb.model.transform.CertificateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
