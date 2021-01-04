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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details associated with the issuer of a license.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/IssuerDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IssuerDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Issuer name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Asymmetric CMK from AWS Key Management Service. The CMK must have a key usage of sign and verify, and support the
     * RSASSA-PSS SHA-256 signing algorithm.
     * </p>
     */
    private String signKey;
    /**
     * <p>
     * Issuer key fingerprint.
     * </p>
     */
    private String keyFingerprint;

    /**
     * <p>
     * Issuer name.
     * </p>
     * 
     * @param name
     *        Issuer name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Issuer name.
     * </p>
     * 
     * @return Issuer name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Issuer name.
     * </p>
     * 
     * @param name
     *        Issuer name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IssuerDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Asymmetric CMK from AWS Key Management Service. The CMK must have a key usage of sign and verify, and support the
     * RSASSA-PSS SHA-256 signing algorithm.
     * </p>
     * 
     * @param signKey
     *        Asymmetric CMK from AWS Key Management Service. The CMK must have a key usage of sign and verify, and
     *        support the RSASSA-PSS SHA-256 signing algorithm.
     */

    public void setSignKey(String signKey) {
        this.signKey = signKey;
    }

    /**
     * <p>
     * Asymmetric CMK from AWS Key Management Service. The CMK must have a key usage of sign and verify, and support the
     * RSASSA-PSS SHA-256 signing algorithm.
     * </p>
     * 
     * @return Asymmetric CMK from AWS Key Management Service. The CMK must have a key usage of sign and verify, and
     *         support the RSASSA-PSS SHA-256 signing algorithm.
     */

    public String getSignKey() {
        return this.signKey;
    }

    /**
     * <p>
     * Asymmetric CMK from AWS Key Management Service. The CMK must have a key usage of sign and verify, and support the
     * RSASSA-PSS SHA-256 signing algorithm.
     * </p>
     * 
     * @param signKey
     *        Asymmetric CMK from AWS Key Management Service. The CMK must have a key usage of sign and verify, and
     *        support the RSASSA-PSS SHA-256 signing algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IssuerDetails withSignKey(String signKey) {
        setSignKey(signKey);
        return this;
    }

    /**
     * <p>
     * Issuer key fingerprint.
     * </p>
     * 
     * @param keyFingerprint
     *        Issuer key fingerprint.
     */

    public void setKeyFingerprint(String keyFingerprint) {
        this.keyFingerprint = keyFingerprint;
    }

    /**
     * <p>
     * Issuer key fingerprint.
     * </p>
     * 
     * @return Issuer key fingerprint.
     */

    public String getKeyFingerprint() {
        return this.keyFingerprint;
    }

    /**
     * <p>
     * Issuer key fingerprint.
     * </p>
     * 
     * @param keyFingerprint
     *        Issuer key fingerprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IssuerDetails withKeyFingerprint(String keyFingerprint) {
        setKeyFingerprint(keyFingerprint);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSignKey() != null)
            sb.append("SignKey: ").append(getSignKey()).append(",");
        if (getKeyFingerprint() != null)
            sb.append("KeyFingerprint: ").append(getKeyFingerprint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IssuerDetails == false)
            return false;
        IssuerDetails other = (IssuerDetails) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSignKey() == null ^ this.getSignKey() == null)
            return false;
        if (other.getSignKey() != null && other.getSignKey().equals(this.getSignKey()) == false)
            return false;
        if (other.getKeyFingerprint() == null ^ this.getKeyFingerprint() == null)
            return false;
        if (other.getKeyFingerprint() != null && other.getKeyFingerprint().equals(this.getKeyFingerprint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSignKey() == null) ? 0 : getSignKey().hashCode());
        hashCode = prime * hashCode + ((getKeyFingerprint() == null) ? 0 : getKeyFingerprint().hashCode());
        return hashCode;
    }

    @Override
    public IssuerDetails clone() {
        try {
            return (IssuerDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.licensemanager.model.transform.IssuerDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
