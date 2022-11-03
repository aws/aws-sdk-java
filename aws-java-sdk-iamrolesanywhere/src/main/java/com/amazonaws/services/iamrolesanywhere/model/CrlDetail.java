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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The state of the certificate revocation list (CRL) after a read or write operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/CrlDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CrlDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ISO-8601 timestamp when the certificate revocation list (CRL) was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The ARN of the certificate revocation list (CRL).
     * </p>
     */
    private String crlArn;
    /**
     * <p>
     * The state of the certificate revocation list (CRL) after a read or write operation.
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
     * Indicates whether the certificate revocation list (CRL) is enabled.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The name of the certificate revocation list (CRL).
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the TrustAnchor the certificate revocation list (CRL) will provide revocation for.
     * </p>
     */
    private String trustAnchorArn;
    /**
     * <p>
     * The ISO-8601 timestamp when the certificate revocation list (CRL) was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The ISO-8601 timestamp when the certificate revocation list (CRL) was created.
     * </p>
     * 
     * @param createdAt
     *        The ISO-8601 timestamp when the certificate revocation list (CRL) was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The ISO-8601 timestamp when the certificate revocation list (CRL) was created.
     * </p>
     * 
     * @return The ISO-8601 timestamp when the certificate revocation list (CRL) was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The ISO-8601 timestamp when the certificate revocation list (CRL) was created.
     * </p>
     * 
     * @param createdAt
     *        The ISO-8601 timestamp when the certificate revocation list (CRL) was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrlDetail withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The ARN of the certificate revocation list (CRL).
     * </p>
     * 
     * @param crlArn
     *        The ARN of the certificate revocation list (CRL).
     */

    public void setCrlArn(String crlArn) {
        this.crlArn = crlArn;
    }

    /**
     * <p>
     * The ARN of the certificate revocation list (CRL).
     * </p>
     * 
     * @return The ARN of the certificate revocation list (CRL).
     */

    public String getCrlArn() {
        return this.crlArn;
    }

    /**
     * <p>
     * The ARN of the certificate revocation list (CRL).
     * </p>
     * 
     * @param crlArn
     *        The ARN of the certificate revocation list (CRL).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrlDetail withCrlArn(String crlArn) {
        setCrlArn(crlArn);
        return this;
    }

    /**
     * <p>
     * The state of the certificate revocation list (CRL) after a read or write operation.
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
     *        The state of the certificate revocation list (CRL) after a read or write operation.
     */

    public void setCrlData(java.nio.ByteBuffer crlData) {
        this.crlData = crlData;
    }

    /**
     * <p>
     * The state of the certificate revocation list (CRL) after a read or write operation.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The state of the certificate revocation list (CRL) after a read or write operation.
     */

    public java.nio.ByteBuffer getCrlData() {
        return this.crlData;
    }

    /**
     * <p>
     * The state of the certificate revocation list (CRL) after a read or write operation.
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
     *        The state of the certificate revocation list (CRL) after a read or write operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrlDetail withCrlData(java.nio.ByteBuffer crlData) {
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

    public CrlDetail withCrlId(String crlId) {
        setCrlId(crlId);
        return this;
    }

    /**
     * <p>
     * Indicates whether the certificate revocation list (CRL) is enabled.
     * </p>
     * 
     * @param enabled
     *        Indicates whether the certificate revocation list (CRL) is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether the certificate revocation list (CRL) is enabled.
     * </p>
     * 
     * @return Indicates whether the certificate revocation list (CRL) is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Indicates whether the certificate revocation list (CRL) is enabled.
     * </p>
     * 
     * @param enabled
     *        Indicates whether the certificate revocation list (CRL) is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrlDetail withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether the certificate revocation list (CRL) is enabled.
     * </p>
     * 
     * @return Indicates whether the certificate revocation list (CRL) is enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The name of the certificate revocation list (CRL).
     * </p>
     * 
     * @param name
     *        The name of the certificate revocation list (CRL).
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the certificate revocation list (CRL).
     * </p>
     * 
     * @return The name of the certificate revocation list (CRL).
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the certificate revocation list (CRL).
     * </p>
     * 
     * @param name
     *        The name of the certificate revocation list (CRL).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrlDetail withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the TrustAnchor the certificate revocation list (CRL) will provide revocation for.
     * </p>
     * 
     * @param trustAnchorArn
     *        The ARN of the TrustAnchor the certificate revocation list (CRL) will provide revocation for.
     */

    public void setTrustAnchorArn(String trustAnchorArn) {
        this.trustAnchorArn = trustAnchorArn;
    }

    /**
     * <p>
     * The ARN of the TrustAnchor the certificate revocation list (CRL) will provide revocation for.
     * </p>
     * 
     * @return The ARN of the TrustAnchor the certificate revocation list (CRL) will provide revocation for.
     */

    public String getTrustAnchorArn() {
        return this.trustAnchorArn;
    }

    /**
     * <p>
     * The ARN of the TrustAnchor the certificate revocation list (CRL) will provide revocation for.
     * </p>
     * 
     * @param trustAnchorArn
     *        The ARN of the TrustAnchor the certificate revocation list (CRL) will provide revocation for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrlDetail withTrustAnchorArn(String trustAnchorArn) {
        setTrustAnchorArn(trustAnchorArn);
        return this;
    }

    /**
     * <p>
     * The ISO-8601 timestamp when the certificate revocation list (CRL) was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The ISO-8601 timestamp when the certificate revocation list (CRL) was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The ISO-8601 timestamp when the certificate revocation list (CRL) was last updated.
     * </p>
     * 
     * @return The ISO-8601 timestamp when the certificate revocation list (CRL) was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The ISO-8601 timestamp when the certificate revocation list (CRL) was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The ISO-8601 timestamp when the certificate revocation list (CRL) was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrlDetail withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCrlArn() != null)
            sb.append("CrlArn: ").append(getCrlArn()).append(",");
        if (getCrlData() != null)
            sb.append("CrlData: ").append(getCrlData()).append(",");
        if (getCrlId() != null)
            sb.append("CrlId: ").append(getCrlId()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTrustAnchorArn() != null)
            sb.append("TrustAnchorArn: ").append(getTrustAnchorArn()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CrlDetail == false)
            return false;
        CrlDetail other = (CrlDetail) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCrlArn() == null ^ this.getCrlArn() == null)
            return false;
        if (other.getCrlArn() != null && other.getCrlArn().equals(this.getCrlArn()) == false)
            return false;
        if (other.getCrlData() == null ^ this.getCrlData() == null)
            return false;
        if (other.getCrlData() != null && other.getCrlData().equals(this.getCrlData()) == false)
            return false;
        if (other.getCrlId() == null ^ this.getCrlId() == null)
            return false;
        if (other.getCrlId() != null && other.getCrlId().equals(this.getCrlId()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTrustAnchorArn() == null ^ this.getTrustAnchorArn() == null)
            return false;
        if (other.getTrustAnchorArn() != null && other.getTrustAnchorArn().equals(this.getTrustAnchorArn()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCrlArn() == null) ? 0 : getCrlArn().hashCode());
        hashCode = prime * hashCode + ((getCrlData() == null) ? 0 : getCrlData().hashCode());
        hashCode = prime * hashCode + ((getCrlId() == null) ? 0 : getCrlId().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTrustAnchorArn() == null) ? 0 : getTrustAnchorArn().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public CrlDetail clone() {
        try {
            return (CrlDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iamrolesanywhere.model.transform.CrlDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
