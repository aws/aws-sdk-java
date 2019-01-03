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
 * Represents the custom MAIL FROM attributes for a list of identities.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetIdentityMailFromDomainAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIdentityMailFromDomainAttributesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A map of identities to custom MAIL FROM attributes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, IdentityMailFromDomainAttributes> mailFromDomainAttributes;

    /**
     * <p>
     * A map of identities to custom MAIL FROM attributes.
     * </p>
     * 
     * @return A map of identities to custom MAIL FROM attributes.
     */

    public java.util.Map<String, IdentityMailFromDomainAttributes> getMailFromDomainAttributes() {
        if (mailFromDomainAttributes == null) {
            mailFromDomainAttributes = new com.amazonaws.internal.SdkInternalMap<String, IdentityMailFromDomainAttributes>();
        }
        return mailFromDomainAttributes;
    }

    /**
     * <p>
     * A map of identities to custom MAIL FROM attributes.
     * </p>
     * 
     * @param mailFromDomainAttributes
     *        A map of identities to custom MAIL FROM attributes.
     */

    public void setMailFromDomainAttributes(java.util.Map<String, IdentityMailFromDomainAttributes> mailFromDomainAttributes) {
        this.mailFromDomainAttributes = mailFromDomainAttributes == null ? null
                : new com.amazonaws.internal.SdkInternalMap<String, IdentityMailFromDomainAttributes>(mailFromDomainAttributes);
    }

    /**
     * <p>
     * A map of identities to custom MAIL FROM attributes.
     * </p>
     * 
     * @param mailFromDomainAttributes
     *        A map of identities to custom MAIL FROM attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIdentityMailFromDomainAttributesResult withMailFromDomainAttributes(
            java.util.Map<String, IdentityMailFromDomainAttributes> mailFromDomainAttributes) {
        setMailFromDomainAttributes(mailFromDomainAttributes);
        return this;
    }

    public GetIdentityMailFromDomainAttributesResult addMailFromDomainAttributesEntry(String key, IdentityMailFromDomainAttributes value) {
        if (null == this.mailFromDomainAttributes) {
            this.mailFromDomainAttributes = new com.amazonaws.internal.SdkInternalMap<String, IdentityMailFromDomainAttributes>();
        }
        if (this.mailFromDomainAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.mailFromDomainAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into MailFromDomainAttributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIdentityMailFromDomainAttributesResult clearMailFromDomainAttributesEntries() {
        this.mailFromDomainAttributes = null;
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
        if (getMailFromDomainAttributes() != null)
            sb.append("MailFromDomainAttributes: ").append(getMailFromDomainAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIdentityMailFromDomainAttributesResult == false)
            return false;
        GetIdentityMailFromDomainAttributesResult other = (GetIdentityMailFromDomainAttributesResult) obj;
        if (other.getMailFromDomainAttributes() == null ^ this.getMailFromDomainAttributes() == null)
            return false;
        if (other.getMailFromDomainAttributes() != null && other.getMailFromDomainAttributes().equals(this.getMailFromDomainAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMailFromDomainAttributes() == null) ? 0 : getMailFromDomainAttributes().hashCode());
        return hashCode;
    }

    @Override
    public GetIdentityMailFromDomainAttributesResult clone() {
        try {
            return (GetIdentityMailFromDomainAttributesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
