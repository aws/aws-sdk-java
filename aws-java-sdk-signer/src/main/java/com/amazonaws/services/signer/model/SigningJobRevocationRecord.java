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
 * Revocation information for a signing job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/SigningJobRevocationRecord" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SigningJobRevocationRecord implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A caller-supplied reason for revocation.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * The time of revocation.
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
     * A caller-supplied reason for revocation.
     * </p>
     * 
     * @param reason
     *        A caller-supplied reason for revocation.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * A caller-supplied reason for revocation.
     * </p>
     * 
     * @return A caller-supplied reason for revocation.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * A caller-supplied reason for revocation.
     * </p>
     * 
     * @param reason
     *        A caller-supplied reason for revocation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigningJobRevocationRecord withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The time of revocation.
     * </p>
     * 
     * @param revokedAt
     *        The time of revocation.
     */

    public void setRevokedAt(java.util.Date revokedAt) {
        this.revokedAt = revokedAt;
    }

    /**
     * <p>
     * The time of revocation.
     * </p>
     * 
     * @return The time of revocation.
     */

    public java.util.Date getRevokedAt() {
        return this.revokedAt;
    }

    /**
     * <p>
     * The time of revocation.
     * </p>
     * 
     * @param revokedAt
     *        The time of revocation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigningJobRevocationRecord withRevokedAt(java.util.Date revokedAt) {
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

    public SigningJobRevocationRecord withRevokedBy(String revokedBy) {
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
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
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

        if (obj instanceof SigningJobRevocationRecord == false)
            return false;
        SigningJobRevocationRecord other = (SigningJobRevocationRecord) obj;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
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

        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getRevokedAt() == null) ? 0 : getRevokedAt().hashCode());
        hashCode = prime * hashCode + ((getRevokedBy() == null) ? 0 : getRevokedBy().hashCode());
        return hashCode;
    }

    @Override
    public SigningJobRevocationRecord clone() {
        try {
            return (SigningJobRevocationRecord) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.signer.model.transform.SigningJobRevocationRecordMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
