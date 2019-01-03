/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The Amazon SES verification status of a list of identities. For domain identities, this response also contains the
 * verification token.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetIdentityVerificationAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIdentityVerificationAttributesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A map of Identities to IdentityVerificationAttributes objects.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, IdentityVerificationAttributes> verificationAttributes;

    /**
     * <p>
     * A map of Identities to IdentityVerificationAttributes objects.
     * </p>
     * 
     * @return A map of Identities to IdentityVerificationAttributes objects.
     */

    public java.util.Map<String, IdentityVerificationAttributes> getVerificationAttributes() {
        if (verificationAttributes == null) {
            verificationAttributes = new com.amazonaws.internal.SdkInternalMap<String, IdentityVerificationAttributes>();
        }
        return verificationAttributes;
    }

    /**
     * <p>
     * A map of Identities to IdentityVerificationAttributes objects.
     * </p>
     * 
     * @param verificationAttributes
     *        A map of Identities to IdentityVerificationAttributes objects.
     */

    public void setVerificationAttributes(java.util.Map<String, IdentityVerificationAttributes> verificationAttributes) {
        this.verificationAttributes = verificationAttributes == null ? null
                : new com.amazonaws.internal.SdkInternalMap<String, IdentityVerificationAttributes>(verificationAttributes);
    }

    /**
     * <p>
     * A map of Identities to IdentityVerificationAttributes objects.
     * </p>
     * 
     * @param verificationAttributes
     *        A map of Identities to IdentityVerificationAttributes objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIdentityVerificationAttributesResult withVerificationAttributes(java.util.Map<String, IdentityVerificationAttributes> verificationAttributes) {
        setVerificationAttributes(verificationAttributes);
        return this;
    }

    public GetIdentityVerificationAttributesResult addVerificationAttributesEntry(String key, IdentityVerificationAttributes value) {
        if (null == this.verificationAttributes) {
            this.verificationAttributes = new com.amazonaws.internal.SdkInternalMap<String, IdentityVerificationAttributes>();
        }
        if (this.verificationAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.verificationAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into VerificationAttributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIdentityVerificationAttributesResult clearVerificationAttributesEntries() {
        this.verificationAttributes = null;
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
        if (getVerificationAttributes() != null)
            sb.append("VerificationAttributes: ").append(getVerificationAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIdentityVerificationAttributesResult == false)
            return false;
        GetIdentityVerificationAttributesResult other = (GetIdentityVerificationAttributesResult) obj;
        if (other.getVerificationAttributes() == null ^ this.getVerificationAttributes() == null)
            return false;
        if (other.getVerificationAttributes() != null && other.getVerificationAttributes().equals(this.getVerificationAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVerificationAttributes() == null) ? 0 : getVerificationAttributes().hashCode());
        return hashCode;
    }

    @Override
    public GetIdentityVerificationAttributesResult clone() {
        try {
            return (GetIdentityVerificationAttributesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
