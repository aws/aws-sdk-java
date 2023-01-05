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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a delegation signer (DS) record that was created in the registry by <a
 * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_AssociateDelegationSignerToDomain.html"
 * >AssociateDelegationSignerToDomain</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/DnssecSigningAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DnssecSigningAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Algorithm which was used to generate the digest from the public key.
     * </p>
     */
    private Integer algorithm;
    /**
     * <p>
     * Defines the type of key. It can be either a KSK (key-signing-key, value 257) or ZSK (zone-signing-key, value
     * 256). Using KSK is always encouraged. Only use ZSK if your DNS provider isn't Route 53 and you don’t have KSK
     * available.
     * </p>
     * <p>
     * If you have KSK and ZSK keys, always use KSK to create a delegations signer (DS) record. If you have ZSK keys
     * only – use ZSK to create a DS record.
     * </p>
     */
    private Integer flags;
    /**
     * <p>
     * The base64-encoded public key part of the key pair that is passed to the registry.
     * </p>
     */
    private String publicKey;

    /**
     * <p>
     * Algorithm which was used to generate the digest from the public key.
     * </p>
     * 
     * @param algorithm
     *        Algorithm which was used to generate the digest from the public key.
     */

    public void setAlgorithm(Integer algorithm) {
        this.algorithm = algorithm;
    }

    /**
     * <p>
     * Algorithm which was used to generate the digest from the public key.
     * </p>
     * 
     * @return Algorithm which was used to generate the digest from the public key.
     */

    public Integer getAlgorithm() {
        return this.algorithm;
    }

    /**
     * <p>
     * Algorithm which was used to generate the digest from the public key.
     * </p>
     * 
     * @param algorithm
     *        Algorithm which was used to generate the digest from the public key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnssecSigningAttributes withAlgorithm(Integer algorithm) {
        setAlgorithm(algorithm);
        return this;
    }

    /**
     * <p>
     * Defines the type of key. It can be either a KSK (key-signing-key, value 257) or ZSK (zone-signing-key, value
     * 256). Using KSK is always encouraged. Only use ZSK if your DNS provider isn't Route 53 and you don’t have KSK
     * available.
     * </p>
     * <p>
     * If you have KSK and ZSK keys, always use KSK to create a delegations signer (DS) record. If you have ZSK keys
     * only – use ZSK to create a DS record.
     * </p>
     * 
     * @param flags
     *        Defines the type of key. It can be either a KSK (key-signing-key, value 257) or ZSK (zone-signing-key,
     *        value 256). Using KSK is always encouraged. Only use ZSK if your DNS provider isn't Route 53 and you don’t
     *        have KSK available.</p>
     *        <p>
     *        If you have KSK and ZSK keys, always use KSK to create a delegations signer (DS) record. If you have ZSK
     *        keys only – use ZSK to create a DS record.
     */

    public void setFlags(Integer flags) {
        this.flags = flags;
    }

    /**
     * <p>
     * Defines the type of key. It can be either a KSK (key-signing-key, value 257) or ZSK (zone-signing-key, value
     * 256). Using KSK is always encouraged. Only use ZSK if your DNS provider isn't Route 53 and you don’t have KSK
     * available.
     * </p>
     * <p>
     * If you have KSK and ZSK keys, always use KSK to create a delegations signer (DS) record. If you have ZSK keys
     * only – use ZSK to create a DS record.
     * </p>
     * 
     * @return Defines the type of key. It can be either a KSK (key-signing-key, value 257) or ZSK (zone-signing-key,
     *         value 256). Using KSK is always encouraged. Only use ZSK if your DNS provider isn't Route 53 and you
     *         don’t have KSK available.</p>
     *         <p>
     *         If you have KSK and ZSK keys, always use KSK to create a delegations signer (DS) record. If you have ZSK
     *         keys only – use ZSK to create a DS record.
     */

    public Integer getFlags() {
        return this.flags;
    }

    /**
     * <p>
     * Defines the type of key. It can be either a KSK (key-signing-key, value 257) or ZSK (zone-signing-key, value
     * 256). Using KSK is always encouraged. Only use ZSK if your DNS provider isn't Route 53 and you don’t have KSK
     * available.
     * </p>
     * <p>
     * If you have KSK and ZSK keys, always use KSK to create a delegations signer (DS) record. If you have ZSK keys
     * only – use ZSK to create a DS record.
     * </p>
     * 
     * @param flags
     *        Defines the type of key. It can be either a KSK (key-signing-key, value 257) or ZSK (zone-signing-key,
     *        value 256). Using KSK is always encouraged. Only use ZSK if your DNS provider isn't Route 53 and you don’t
     *        have KSK available.</p>
     *        <p>
     *        If you have KSK and ZSK keys, always use KSK to create a delegations signer (DS) record. If you have ZSK
     *        keys only – use ZSK to create a DS record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnssecSigningAttributes withFlags(Integer flags) {
        setFlags(flags);
        return this;
    }

    /**
     * <p>
     * The base64-encoded public key part of the key pair that is passed to the registry.
     * </p>
     * 
     * @param publicKey
     *        The base64-encoded public key part of the key pair that is passed to the registry.
     */

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * <p>
     * The base64-encoded public key part of the key pair that is passed to the registry.
     * </p>
     * 
     * @return The base64-encoded public key part of the key pair that is passed to the registry.
     */

    public String getPublicKey() {
        return this.publicKey;
    }

    /**
     * <p>
     * The base64-encoded public key part of the key pair that is passed to the registry.
     * </p>
     * 
     * @param publicKey
     *        The base64-encoded public key part of the key pair that is passed to the registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnssecSigningAttributes withPublicKey(String publicKey) {
        setPublicKey(publicKey);
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
        if (getAlgorithm() != null)
            sb.append("Algorithm: ").append(getAlgorithm()).append(",");
        if (getFlags() != null)
            sb.append("Flags: ").append(getFlags()).append(",");
        if (getPublicKey() != null)
            sb.append("PublicKey: ").append(getPublicKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DnssecSigningAttributes == false)
            return false;
        DnssecSigningAttributes other = (DnssecSigningAttributes) obj;
        if (other.getAlgorithm() == null ^ this.getAlgorithm() == null)
            return false;
        if (other.getAlgorithm() != null && other.getAlgorithm().equals(this.getAlgorithm()) == false)
            return false;
        if (other.getFlags() == null ^ this.getFlags() == null)
            return false;
        if (other.getFlags() != null && other.getFlags().equals(this.getFlags()) == false)
            return false;
        if (other.getPublicKey() == null ^ this.getPublicKey() == null)
            return false;
        if (other.getPublicKey() != null && other.getPublicKey().equals(this.getPublicKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlgorithm() == null) ? 0 : getAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getFlags() == null) ? 0 : getFlags().hashCode());
        hashCode = prime * hashCode + ((getPublicKey() == null) ? 0 : getPublicKey().hashCode());
        return hashCode;
    }

    @Override
    public DnssecSigningAttributes clone() {
        try {
            return (DnssecSigningAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53domains.model.transform.DnssecSigningAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
