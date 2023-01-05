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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains configuration for Bring Your Own DKIM (BYODKIM), or, for Easy DKIM
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/DkimSigningAttributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DkimSigningAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * [Bring Your Own DKIM] A string that's used to identify a public key in the DNS configuration for a domain.
     * </p>
     */
    private String domainSigningSelector;
    /**
     * <p>
     * [Bring Your Own DKIM] A private key that's used to generate a DKIM signature.
     * </p>
     * <p>
     * The private key must use 1024 or 2048-bit RSA encryption, and must be encoded using base64 encoding.
     * </p>
     */
    private String domainSigningPrivateKey;
    /**
     * <p>
     * [Easy DKIM] The key length of the future DKIM key pair to be generated. This can be changed at most once per day.
     * </p>
     */
    private String nextSigningKeyLength;

    /**
     * <p>
     * [Bring Your Own DKIM] A string that's used to identify a public key in the DNS configuration for a domain.
     * </p>
     * 
     * @param domainSigningSelector
     *        [Bring Your Own DKIM] A string that's used to identify a public key in the DNS configuration for a domain.
     */

    public void setDomainSigningSelector(String domainSigningSelector) {
        this.domainSigningSelector = domainSigningSelector;
    }

    /**
     * <p>
     * [Bring Your Own DKIM] A string that's used to identify a public key in the DNS configuration for a domain.
     * </p>
     * 
     * @return [Bring Your Own DKIM] A string that's used to identify a public key in the DNS configuration for a
     *         domain.
     */

    public String getDomainSigningSelector() {
        return this.domainSigningSelector;
    }

    /**
     * <p>
     * [Bring Your Own DKIM] A string that's used to identify a public key in the DNS configuration for a domain.
     * </p>
     * 
     * @param domainSigningSelector
     *        [Bring Your Own DKIM] A string that's used to identify a public key in the DNS configuration for a domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DkimSigningAttributes withDomainSigningSelector(String domainSigningSelector) {
        setDomainSigningSelector(domainSigningSelector);
        return this;
    }

    /**
     * <p>
     * [Bring Your Own DKIM] A private key that's used to generate a DKIM signature.
     * </p>
     * <p>
     * The private key must use 1024 or 2048-bit RSA encryption, and must be encoded using base64 encoding.
     * </p>
     * 
     * @param domainSigningPrivateKey
     *        [Bring Your Own DKIM] A private key that's used to generate a DKIM signature.</p>
     *        <p>
     *        The private key must use 1024 or 2048-bit RSA encryption, and must be encoded using base64 encoding.
     */

    public void setDomainSigningPrivateKey(String domainSigningPrivateKey) {
        this.domainSigningPrivateKey = domainSigningPrivateKey;
    }

    /**
     * <p>
     * [Bring Your Own DKIM] A private key that's used to generate a DKIM signature.
     * </p>
     * <p>
     * The private key must use 1024 or 2048-bit RSA encryption, and must be encoded using base64 encoding.
     * </p>
     * 
     * @return [Bring Your Own DKIM] A private key that's used to generate a DKIM signature.</p>
     *         <p>
     *         The private key must use 1024 or 2048-bit RSA encryption, and must be encoded using base64 encoding.
     */

    public String getDomainSigningPrivateKey() {
        return this.domainSigningPrivateKey;
    }

    /**
     * <p>
     * [Bring Your Own DKIM] A private key that's used to generate a DKIM signature.
     * </p>
     * <p>
     * The private key must use 1024 or 2048-bit RSA encryption, and must be encoded using base64 encoding.
     * </p>
     * 
     * @param domainSigningPrivateKey
     *        [Bring Your Own DKIM] A private key that's used to generate a DKIM signature.</p>
     *        <p>
     *        The private key must use 1024 or 2048-bit RSA encryption, and must be encoded using base64 encoding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DkimSigningAttributes withDomainSigningPrivateKey(String domainSigningPrivateKey) {
        setDomainSigningPrivateKey(domainSigningPrivateKey);
        return this;
    }

    /**
     * <p>
     * [Easy DKIM] The key length of the future DKIM key pair to be generated. This can be changed at most once per day.
     * </p>
     * 
     * @param nextSigningKeyLength
     *        [Easy DKIM] The key length of the future DKIM key pair to be generated. This can be changed at most once
     *        per day.
     * @see DkimSigningKeyLength
     */

    public void setNextSigningKeyLength(String nextSigningKeyLength) {
        this.nextSigningKeyLength = nextSigningKeyLength;
    }

    /**
     * <p>
     * [Easy DKIM] The key length of the future DKIM key pair to be generated. This can be changed at most once per day.
     * </p>
     * 
     * @return [Easy DKIM] The key length of the future DKIM key pair to be generated. This can be changed at most once
     *         per day.
     * @see DkimSigningKeyLength
     */

    public String getNextSigningKeyLength() {
        return this.nextSigningKeyLength;
    }

    /**
     * <p>
     * [Easy DKIM] The key length of the future DKIM key pair to be generated. This can be changed at most once per day.
     * </p>
     * 
     * @param nextSigningKeyLength
     *        [Easy DKIM] The key length of the future DKIM key pair to be generated. This can be changed at most once
     *        per day.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DkimSigningKeyLength
     */

    public DkimSigningAttributes withNextSigningKeyLength(String nextSigningKeyLength) {
        setNextSigningKeyLength(nextSigningKeyLength);
        return this;
    }

    /**
     * <p>
     * [Easy DKIM] The key length of the future DKIM key pair to be generated. This can be changed at most once per day.
     * </p>
     * 
     * @param nextSigningKeyLength
     *        [Easy DKIM] The key length of the future DKIM key pair to be generated. This can be changed at most once
     *        per day.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DkimSigningKeyLength
     */

    public DkimSigningAttributes withNextSigningKeyLength(DkimSigningKeyLength nextSigningKeyLength) {
        this.nextSigningKeyLength = nextSigningKeyLength.toString();
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
        if (getDomainSigningSelector() != null)
            sb.append("DomainSigningSelector: ").append(getDomainSigningSelector()).append(",");
        if (getDomainSigningPrivateKey() != null)
            sb.append("DomainSigningPrivateKey: ").append("***Sensitive Data Redacted***").append(",");
        if (getNextSigningKeyLength() != null)
            sb.append("NextSigningKeyLength: ").append(getNextSigningKeyLength());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DkimSigningAttributes == false)
            return false;
        DkimSigningAttributes other = (DkimSigningAttributes) obj;
        if (other.getDomainSigningSelector() == null ^ this.getDomainSigningSelector() == null)
            return false;
        if (other.getDomainSigningSelector() != null && other.getDomainSigningSelector().equals(this.getDomainSigningSelector()) == false)
            return false;
        if (other.getDomainSigningPrivateKey() == null ^ this.getDomainSigningPrivateKey() == null)
            return false;
        if (other.getDomainSigningPrivateKey() != null && other.getDomainSigningPrivateKey().equals(this.getDomainSigningPrivateKey()) == false)
            return false;
        if (other.getNextSigningKeyLength() == null ^ this.getNextSigningKeyLength() == null)
            return false;
        if (other.getNextSigningKeyLength() != null && other.getNextSigningKeyLength().equals(this.getNextSigningKeyLength()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainSigningSelector() == null) ? 0 : getDomainSigningSelector().hashCode());
        hashCode = prime * hashCode + ((getDomainSigningPrivateKey() == null) ? 0 : getDomainSigningPrivateKey().hashCode());
        hashCode = prime * hashCode + ((getNextSigningKeyLength() == null) ? 0 : getNextSigningKeyLength().hashCode());
        return hashCode;
    }

    @Override
    public DkimSigningAttributes clone() {
        try {
            return (DkimSigningAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.DkimSigningAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
