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
 * Returns CNAME records that you must publish to the DNS server of your domain to set up Easy DKIM with Amazon SES.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/VerifyDomainDkim" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VerifyDomainDkimResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A set of character strings that represent the domain's identity. If the identity is an email address, the tokens
     * represent the domain of that address.
     * </p>
     * <p>
     * Using these tokens, you will need to create DNS CNAME records that point to DKIM public keys hosted by Amazon
     * SES. Amazon Web Services will eventually detect that you have updated your DNS records; this detection process
     * may take up to 72 hours. Upon successful detection, Amazon SES will be able to DKIM-sign emails originating from
     * that domain.
     * </p>
     * <p>
     * For more information about creating DNS records using DKIM tokens, go to the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> dkimTokens;

    /**
     * <p>
     * A set of character strings that represent the domain's identity. If the identity is an email address, the tokens
     * represent the domain of that address.
     * </p>
     * <p>
     * Using these tokens, you will need to create DNS CNAME records that point to DKIM public keys hosted by Amazon
     * SES. Amazon Web Services will eventually detect that you have updated your DNS records; this detection process
     * may take up to 72 hours. Upon successful detection, Amazon SES will be able to DKIM-sign emails originating from
     * that domain.
     * </p>
     * <p>
     * For more information about creating DNS records using DKIM tokens, go to the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * 
     * @return A set of character strings that represent the domain's identity. If the identity is an email address, the
     *         tokens represent the domain of that address.</p>
     *         <p>
     *         Using these tokens, you will need to create DNS CNAME records that point to DKIM public keys hosted by
     *         Amazon SES. Amazon Web Services will eventually detect that you have updated your DNS records; this
     *         detection process may take up to 72 hours. Upon successful detection, Amazon SES will be able to
     *         DKIM-sign emails originating from that domain.
     *         </p>
     *         <p>
     *         For more information about creating DNS records using DKIM tokens, go to the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html">Amazon SES
     *         Developer Guide</a>.
     */

    public java.util.List<String> getDkimTokens() {
        if (dkimTokens == null) {
            dkimTokens = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return dkimTokens;
    }

    /**
     * <p>
     * A set of character strings that represent the domain's identity. If the identity is an email address, the tokens
     * represent the domain of that address.
     * </p>
     * <p>
     * Using these tokens, you will need to create DNS CNAME records that point to DKIM public keys hosted by Amazon
     * SES. Amazon Web Services will eventually detect that you have updated your DNS records; this detection process
     * may take up to 72 hours. Upon successful detection, Amazon SES will be able to DKIM-sign emails originating from
     * that domain.
     * </p>
     * <p>
     * For more information about creating DNS records using DKIM tokens, go to the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * 
     * @param dkimTokens
     *        A set of character strings that represent the domain's identity. If the identity is an email address, the
     *        tokens represent the domain of that address.</p>
     *        <p>
     *        Using these tokens, you will need to create DNS CNAME records that point to DKIM public keys hosted by
     *        Amazon SES. Amazon Web Services will eventually detect that you have updated your DNS records; this
     *        detection process may take up to 72 hours. Upon successful detection, Amazon SES will be able to DKIM-sign
     *        emails originating from that domain.
     *        </p>
     *        <p>
     *        For more information about creating DNS records using DKIM tokens, go to the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html">Amazon SES
     *        Developer Guide</a>.
     */

    public void setDkimTokens(java.util.Collection<String> dkimTokens) {
        if (dkimTokens == null) {
            this.dkimTokens = null;
            return;
        }

        this.dkimTokens = new com.amazonaws.internal.SdkInternalList<String>(dkimTokens);
    }

    /**
     * <p>
     * A set of character strings that represent the domain's identity. If the identity is an email address, the tokens
     * represent the domain of that address.
     * </p>
     * <p>
     * Using these tokens, you will need to create DNS CNAME records that point to DKIM public keys hosted by Amazon
     * SES. Amazon Web Services will eventually detect that you have updated your DNS records; this detection process
     * may take up to 72 hours. Upon successful detection, Amazon SES will be able to DKIM-sign emails originating from
     * that domain.
     * </p>
     * <p>
     * For more information about creating DNS records using DKIM tokens, go to the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDkimTokens(java.util.Collection)} or {@link #withDkimTokens(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dkimTokens
     *        A set of character strings that represent the domain's identity. If the identity is an email address, the
     *        tokens represent the domain of that address.</p>
     *        <p>
     *        Using these tokens, you will need to create DNS CNAME records that point to DKIM public keys hosted by
     *        Amazon SES. Amazon Web Services will eventually detect that you have updated your DNS records; this
     *        detection process may take up to 72 hours. Upon successful detection, Amazon SES will be able to DKIM-sign
     *        emails originating from that domain.
     *        </p>
     *        <p>
     *        For more information about creating DNS records using DKIM tokens, go to the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html">Amazon SES
     *        Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyDomainDkimResult withDkimTokens(String... dkimTokens) {
        if (this.dkimTokens == null) {
            setDkimTokens(new com.amazonaws.internal.SdkInternalList<String>(dkimTokens.length));
        }
        for (String ele : dkimTokens) {
            this.dkimTokens.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A set of character strings that represent the domain's identity. If the identity is an email address, the tokens
     * represent the domain of that address.
     * </p>
     * <p>
     * Using these tokens, you will need to create DNS CNAME records that point to DKIM public keys hosted by Amazon
     * SES. Amazon Web Services will eventually detect that you have updated your DNS records; this detection process
     * may take up to 72 hours. Upon successful detection, Amazon SES will be able to DKIM-sign emails originating from
     * that domain.
     * </p>
     * <p>
     * For more information about creating DNS records using DKIM tokens, go to the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * 
     * @param dkimTokens
     *        A set of character strings that represent the domain's identity. If the identity is an email address, the
     *        tokens represent the domain of that address.</p>
     *        <p>
     *        Using these tokens, you will need to create DNS CNAME records that point to DKIM public keys hosted by
     *        Amazon SES. Amazon Web Services will eventually detect that you have updated your DNS records; this
     *        detection process may take up to 72 hours. Upon successful detection, Amazon SES will be able to DKIM-sign
     *        emails originating from that domain.
     *        </p>
     *        <p>
     *        For more information about creating DNS records using DKIM tokens, go to the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html">Amazon SES
     *        Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyDomainDkimResult withDkimTokens(java.util.Collection<String> dkimTokens) {
        setDkimTokens(dkimTokens);
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
        if (getDkimTokens() != null)
            sb.append("DkimTokens: ").append(getDkimTokens());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerifyDomainDkimResult == false)
            return false;
        VerifyDomainDkimResult other = (VerifyDomainDkimResult) obj;
        if (other.getDkimTokens() == null ^ this.getDkimTokens() == null)
            return false;
        if (other.getDkimTokens() != null && other.getDkimTokens().equals(this.getDkimTokens()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDkimTokens() == null) ? 0 : getDkimTokens().hashCode());
        return hashCode;
    }

    @Override
    public VerifyDomainDkimResult clone() {
        try {
            return (VerifyDomainDkimResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
