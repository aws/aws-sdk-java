/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.signer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Revocation information for a signing profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/SigningProfileRevocationRecord"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SigningProfileRevocationRecord implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time when revocation becomes effective.
     * </p>
     */
    private java.util.Date revocationEffectiveFrom;
    /**
     * <p>
     * The time when the signing profile was revoked.
     * </p>
     */
    private java.util.Date revokedAt;
    /**
     * <p>
     * The identity of the revoker.
     * </p>
     */
    private String revokedBy;

    /**
     * <p>
     * The time when revocation becomes effective.
     * </p>
     * 
     * @param revocationEffectiveFrom
     *        The time when revocation becomes effective.
     */

    public void setRevocationEffectiveFrom(java.util.Date revocationEffectiveFrom) {
        this.revocationEffectiveFrom = revocationEffectiveFrom;
    }

    /**
     * <p>
     * The time when revocation becomes effective.
     * </p>
     * 
     * @return The time when revocation becomes effective.
     */

    public java.util.Date getRevocationEffectiveFrom() {
        return this.revocationEffectiveFrom;
    }

    /**
     * <p>
     * The time when revocation becomes effective.
     * </p>
     * 
     * @param revocationEffectiveFrom
     *        The time when revocation becomes effective.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigningProfileRevocationRecord withRevocationEffectiveFrom(java.util.Date revocationEffectiveFrom) {
        setRevocationEffectiveFrom(revocationEffectiveFrom);
        return this;
    }

    /**
     * <p>
     * The time when the signing profile was revoked.
     * </p>
     * 
     * @param revokedAt
     *        The time when the signing profile was revoked.
     */

    public void setRevokedAt(java.util.Date revokedAt) {
        this.revokedAt = revokedAt;
    }

    /**
     * <p>
     * The time when the signing profile was revoked.
     * </p>
     * 
     * @return The time when the signing profile was revoked.
     */

    public java.util.Date getRevokedAt() {
        return this.revokedAt;
    }

    /**
     * <p>
     * The time when the signing profile was revoked.
     * </p>
     * 
     * @param revokedAt
     *        The time when the signing profile was revoked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigningProfileRevocationRecord withRevokedAt(java.util.Date revokedAt) {
        setRevokedAt(revokedAt);
        return this;
    }

    /**
     * <p>
     * The identity of the revoker.
     * </p>
     * 
     * @param revokedBy
     *        The identity of the revoker.
     */

    public void setRevokedBy(String revokedBy) {
        this.revokedBy = revokedBy;
    }

    /**
     * <p>
     * The identity of the revoker.
     * </p>
     * 
     * @return The identity of the revoker.
     */

    public String getRevokedBy() {
        return this.revokedBy;
    }

    /**
     * <p>
     * The identity of the revoker.
     * </p>
     * 
     * @param revokedBy
     *        The identity of the revoker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigningProfileRevocationRecord withRevokedBy(String revokedBy) {
        setRevokedBy(revokedBy);
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
        if (getRevocationEffectiveFrom() != null)
            sb.append("RevocationEffectiveFrom: ").append(getRevocationEffectiveFrom()).append(",");
        if (getRevokedAt() != null)
            sb.append("RevokedAt: ").append(getRevokedAt()).append(",");
        if (getRevokedBy() != null)
            sb.append("RevokedBy: ").append(getRevokedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SigningProfileRevocationRecord == false)
            return false;
        SigningProfileRevocationRecord other = (SigningProfileRevocationRecord) obj;
        if (other.getRevocationEffectiveFrom() == null ^ this.getRevocationEffectiveFrom() == null)
            return false;
        if (other.getRevocationEffectiveFrom() != null && other.getRevocationEffectiveFrom().equals(this.getRevocationEffectiveFrom()) == false)
            return false;
        if (other.getRevokedAt() == null ^ this.getRevokedAt() == null)
            return false;
        if (other.getRevokedAt() != null && other.getRevokedAt().equals(this.getRevokedAt()) == false)
            return false;
        if (other.getRevokedBy() == null ^ this.getRevokedBy() == null)
            return false;
        if (other.getRevokedBy() != null && other.getRevokedBy().equals(this.getRevokedBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRevocationEffectiveFrom() == null) ? 0 : getRevocationEffectiveFrom().hashCode());
        hashCode = prime * hashCode + ((getRevokedAt() == null) ? 0 : getRevokedAt().hashCode());
        hashCode = prime * hashCode + ((getRevokedBy() == null) ? 0 : getRevokedBy().hashCode());
        return hashCode;
    }

    @Override
    public SigningProfileRevocationRecord clone() {
        try {
            return (SigningProfileRevocationRecord) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.signer.model.transform.SigningProfileRevocationRecordMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
