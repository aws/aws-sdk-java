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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about a revocation file in use by a trust store.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/TrustStoreRevocation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrustStoreRevocation implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trust store.
     * </p>
     */
    private String trustStoreArn;
    /**
     * <p>
     * The revocation ID of the revocation file.
     * </p>
     */
    private Long revocationId;
    /**
     * <p>
     * The type of revocation file.
     * </p>
     */
    private String revocationType;
    /**
     * <p>
     * The number of revoked certificates.
     * </p>
     */
    private Long numberOfRevokedEntries;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trust store.
     * </p>
     * 
     * @param trustStoreArn
     *        The Amazon Resource Name (ARN) of the trust store.
     */

    public void setTrustStoreArn(String trustStoreArn) {
        this.trustStoreArn = trustStoreArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trust store.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the trust store.
     */

    public String getTrustStoreArn() {
        return this.trustStoreArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trust store.
     * </p>
     * 
     * @param trustStoreArn
     *        The Amazon Resource Name (ARN) of the trust store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustStoreRevocation withTrustStoreArn(String trustStoreArn) {
        setTrustStoreArn(trustStoreArn);
        return this;
    }

    /**
     * <p>
     * The revocation ID of the revocation file.
     * </p>
     * 
     * @param revocationId
     *        The revocation ID of the revocation file.
     */

    public void setRevocationId(Long revocationId) {
        this.revocationId = revocationId;
    }

    /**
     * <p>
     * The revocation ID of the revocation file.
     * </p>
     * 
     * @return The revocation ID of the revocation file.
     */

    public Long getRevocationId() {
        return this.revocationId;
    }

    /**
     * <p>
     * The revocation ID of the revocation file.
     * </p>
     * 
     * @param revocationId
     *        The revocation ID of the revocation file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustStoreRevocation withRevocationId(Long revocationId) {
        setRevocationId(revocationId);
        return this;
    }

    /**
     * <p>
     * The type of revocation file.
     * </p>
     * 
     * @param revocationType
     *        The type of revocation file.
     * @see RevocationType
     */

    public void setRevocationType(String revocationType) {
        this.revocationType = revocationType;
    }

    /**
     * <p>
     * The type of revocation file.
     * </p>
     * 
     * @return The type of revocation file.
     * @see RevocationType
     */

    public String getRevocationType() {
        return this.revocationType;
    }

    /**
     * <p>
     * The type of revocation file.
     * </p>
     * 
     * @param revocationType
     *        The type of revocation file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RevocationType
     */

    public TrustStoreRevocation withRevocationType(String revocationType) {
        setRevocationType(revocationType);
        return this;
    }

    /**
     * <p>
     * The type of revocation file.
     * </p>
     * 
     * @param revocationType
     *        The type of revocation file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RevocationType
     */

    public TrustStoreRevocation withRevocationType(RevocationType revocationType) {
        this.revocationType = revocationType.toString();
        return this;
    }

    /**
     * <p>
     * The number of revoked certificates.
     * </p>
     * 
     * @param numberOfRevokedEntries
     *        The number of revoked certificates.
     */

    public void setNumberOfRevokedEntries(Long numberOfRevokedEntries) {
        this.numberOfRevokedEntries = numberOfRevokedEntries;
    }

    /**
     * <p>
     * The number of revoked certificates.
     * </p>
     * 
     * @return The number of revoked certificates.
     */

    public Long getNumberOfRevokedEntries() {
        return this.numberOfRevokedEntries;
    }

    /**
     * <p>
     * The number of revoked certificates.
     * </p>
     * 
     * @param numberOfRevokedEntries
     *        The number of revoked certificates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustStoreRevocation withNumberOfRevokedEntries(Long numberOfRevokedEntries) {
        setNumberOfRevokedEntries(numberOfRevokedEntries);
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
        if (getTrustStoreArn() != null)
            sb.append("TrustStoreArn: ").append(getTrustStoreArn()).append(",");
        if (getRevocationId() != null)
            sb.append("RevocationId: ").append(getRevocationId()).append(",");
        if (getRevocationType() != null)
            sb.append("RevocationType: ").append(getRevocationType()).append(",");
        if (getNumberOfRevokedEntries() != null)
            sb.append("NumberOfRevokedEntries: ").append(getNumberOfRevokedEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrustStoreRevocation == false)
            return false;
        TrustStoreRevocation other = (TrustStoreRevocation) obj;
        if (other.getTrustStoreArn() == null ^ this.getTrustStoreArn() == null)
            return false;
        if (other.getTrustStoreArn() != null && other.getTrustStoreArn().equals(this.getTrustStoreArn()) == false)
            return false;
        if (other.getRevocationId() == null ^ this.getRevocationId() == null)
            return false;
        if (other.getRevocationId() != null && other.getRevocationId().equals(this.getRevocationId()) == false)
            return false;
        if (other.getRevocationType() == null ^ this.getRevocationType() == null)
            return false;
        if (other.getRevocationType() != null && other.getRevocationType().equals(this.getRevocationType()) == false)
            return false;
        if (other.getNumberOfRevokedEntries() == null ^ this.getNumberOfRevokedEntries() == null)
            return false;
        if (other.getNumberOfRevokedEntries() != null && other.getNumberOfRevokedEntries().equals(this.getNumberOfRevokedEntries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrustStoreArn() == null) ? 0 : getTrustStoreArn().hashCode());
        hashCode = prime * hashCode + ((getRevocationId() == null) ? 0 : getRevocationId().hashCode());
        hashCode = prime * hashCode + ((getRevocationType() == null) ? 0 : getRevocationType().hashCode());
        hashCode = prime * hashCode + ((getNumberOfRevokedEntries() == null) ? 0 : getNumberOfRevokedEntries().hashCode());
        return hashCode;
    }

    @Override
    public TrustStoreRevocation clone() {
        try {
            return (TrustStoreRevocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
