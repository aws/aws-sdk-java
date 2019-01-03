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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains information about the DKIM configuration for an email identity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/DkimAttributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DkimAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If the value is <code>true</code>, then the messages that Amazon Pinpoint sends from the identity are
     * DKIM-signed. If the value is <code>false</code>, then the messages that Amazon Pinpoint sends from the identity
     * aren't DKIM-signed.
     * </p>
     */
    private Boolean signingEnabled;
    /**
     * <p>
     * Describes whether or not Amazon Pinpoint has successfully located the DKIM records in the DNS records for the
     * domain. The status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> – Amazon Pinpoint hasn't yet located the DKIM records in the DNS configuration for the
     * domain, but will continue to attempt to locate them.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code> – Amazon Pinpoint located the DKIM records in the DNS configuration for the domain and
     * determined that they're correct. Amazon Pinpoint can now send DKIM-signed email from the identity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – Amazon Pinpoint was unable to locate the DKIM records in the DNS settings for the domain,
     * and won't continue to search for them.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEMPORARY_FAILURE</code> – A temporary issue occurred, which prevented Amazon Pinpoint from determining the
     * DKIM status for the domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_STARTED</code> – Amazon Pinpoint hasn't yet started searching for the DKIM records in the DKIM records
     * for the domain.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * A set of unique strings that you use to create a set of CNAME records that you add to the DNS configuration for
     * your domain. When Amazon Pinpoint detects these records in the DNS configuration for your domain, the DKIM
     * authentication process is complete. Amazon Pinpoint usually detects these records within about 72 hours of adding
     * them to the DNS configuration for your domain.
     * </p>
     */
    private java.util.List<String> tokens;

    /**
     * <p>
     * If the value is <code>true</code>, then the messages that Amazon Pinpoint sends from the identity are
     * DKIM-signed. If the value is <code>false</code>, then the messages that Amazon Pinpoint sends from the identity
     * aren't DKIM-signed.
     * </p>
     * 
     * @param signingEnabled
     *        If the value is <code>true</code>, then the messages that Amazon Pinpoint sends from the identity are
     *        DKIM-signed. If the value is <code>false</code>, then the messages that Amazon Pinpoint sends from the
     *        identity aren't DKIM-signed.
     */

    public void setSigningEnabled(Boolean signingEnabled) {
        this.signingEnabled = signingEnabled;
    }

    /**
     * <p>
     * If the value is <code>true</code>, then the messages that Amazon Pinpoint sends from the identity are
     * DKIM-signed. If the value is <code>false</code>, then the messages that Amazon Pinpoint sends from the identity
     * aren't DKIM-signed.
     * </p>
     * 
     * @return If the value is <code>true</code>, then the messages that Amazon Pinpoint sends from the identity are
     *         DKIM-signed. If the value is <code>false</code>, then the messages that Amazon Pinpoint sends from the
     *         identity aren't DKIM-signed.
     */

    public Boolean getSigningEnabled() {
        return this.signingEnabled;
    }

    /**
     * <p>
     * If the value is <code>true</code>, then the messages that Amazon Pinpoint sends from the identity are
     * DKIM-signed. If the value is <code>false</code>, then the messages that Amazon Pinpoint sends from the identity
     * aren't DKIM-signed.
     * </p>
     * 
     * @param signingEnabled
     *        If the value is <code>true</code>, then the messages that Amazon Pinpoint sends from the identity are
     *        DKIM-signed. If the value is <code>false</code>, then the messages that Amazon Pinpoint sends from the
     *        identity aren't DKIM-signed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DkimAttributes withSigningEnabled(Boolean signingEnabled) {
        setSigningEnabled(signingEnabled);
        return this;
    }

    /**
     * <p>
     * If the value is <code>true</code>, then the messages that Amazon Pinpoint sends from the identity are
     * DKIM-signed. If the value is <code>false</code>, then the messages that Amazon Pinpoint sends from the identity
     * aren't DKIM-signed.
     * </p>
     * 
     * @return If the value is <code>true</code>, then the messages that Amazon Pinpoint sends from the identity are
     *         DKIM-signed. If the value is <code>false</code>, then the messages that Amazon Pinpoint sends from the
     *         identity aren't DKIM-signed.
     */

    public Boolean isSigningEnabled() {
        return this.signingEnabled;
    }

    /**
     * <p>
     * Describes whether or not Amazon Pinpoint has successfully located the DKIM records in the DNS records for the
     * domain. The status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> – Amazon Pinpoint hasn't yet located the DKIM records in the DNS configuration for the
     * domain, but will continue to attempt to locate them.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code> – Amazon Pinpoint located the DKIM records in the DNS configuration for the domain and
     * determined that they're correct. Amazon Pinpoint can now send DKIM-signed email from the identity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – Amazon Pinpoint was unable to locate the DKIM records in the DNS settings for the domain,
     * and won't continue to search for them.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEMPORARY_FAILURE</code> – A temporary issue occurred, which prevented Amazon Pinpoint from determining the
     * DKIM status for the domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_STARTED</code> – Amazon Pinpoint hasn't yet started searching for the DKIM records in the DKIM records
     * for the domain.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Describes whether or not Amazon Pinpoint has successfully located the DKIM records in the DNS records for
     *        the domain. The status can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> – Amazon Pinpoint hasn't yet located the DKIM records in the DNS configuration for
     *        the domain, but will continue to attempt to locate them.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCESS</code> – Amazon Pinpoint located the DKIM records in the DNS configuration for the domain
     *        and determined that they're correct. Amazon Pinpoint can now send DKIM-signed email from the identity.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> – Amazon Pinpoint was unable to locate the DKIM records in the DNS settings for the
     *        domain, and won't continue to search for them.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TEMPORARY_FAILURE</code> – A temporary issue occurred, which prevented Amazon Pinpoint from
     *        determining the DKIM status for the domain.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_STARTED</code> – Amazon Pinpoint hasn't yet started searching for the DKIM records in the DKIM
     *        records for the domain.
     *        </p>
     *        </li>
     * @see DkimStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Describes whether or not Amazon Pinpoint has successfully located the DKIM records in the DNS records for the
     * domain. The status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> – Amazon Pinpoint hasn't yet located the DKIM records in the DNS configuration for the
     * domain, but will continue to attempt to locate them.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code> – Amazon Pinpoint located the DKIM records in the DNS configuration for the domain and
     * determined that they're correct. Amazon Pinpoint can now send DKIM-signed email from the identity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – Amazon Pinpoint was unable to locate the DKIM records in the DNS settings for the domain,
     * and won't continue to search for them.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEMPORARY_FAILURE</code> – A temporary issue occurred, which prevented Amazon Pinpoint from determining the
     * DKIM status for the domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_STARTED</code> – Amazon Pinpoint hasn't yet started searching for the DKIM records in the DKIM records
     * for the domain.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Describes whether or not Amazon Pinpoint has successfully located the DKIM records in the DNS records for
     *         the domain. The status can be one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PENDING</code> – Amazon Pinpoint hasn't yet located the DKIM records in the DNS configuration for
     *         the domain, but will continue to attempt to locate them.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUCCESS</code> – Amazon Pinpoint located the DKIM records in the DNS configuration for the domain
     *         and determined that they're correct. Amazon Pinpoint can now send DKIM-signed email from the identity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> – Amazon Pinpoint was unable to locate the DKIM records in the DNS settings for the
     *         domain, and won't continue to search for them.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TEMPORARY_FAILURE</code> – A temporary issue occurred, which prevented Amazon Pinpoint from
     *         determining the DKIM status for the domain.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOT_STARTED</code> – Amazon Pinpoint hasn't yet started searching for the DKIM records in the DKIM
     *         records for the domain.
     *         </p>
     *         </li>
     * @see DkimStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Describes whether or not Amazon Pinpoint has successfully located the DKIM records in the DNS records for the
     * domain. The status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> – Amazon Pinpoint hasn't yet located the DKIM records in the DNS configuration for the
     * domain, but will continue to attempt to locate them.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code> – Amazon Pinpoint located the DKIM records in the DNS configuration for the domain and
     * determined that they're correct. Amazon Pinpoint can now send DKIM-signed email from the identity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – Amazon Pinpoint was unable to locate the DKIM records in the DNS settings for the domain,
     * and won't continue to search for them.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEMPORARY_FAILURE</code> – A temporary issue occurred, which prevented Amazon Pinpoint from determining the
     * DKIM status for the domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_STARTED</code> – Amazon Pinpoint hasn't yet started searching for the DKIM records in the DKIM records
     * for the domain.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Describes whether or not Amazon Pinpoint has successfully located the DKIM records in the DNS records for
     *        the domain. The status can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> – Amazon Pinpoint hasn't yet located the DKIM records in the DNS configuration for
     *        the domain, but will continue to attempt to locate them.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCESS</code> – Amazon Pinpoint located the DKIM records in the DNS configuration for the domain
     *        and determined that they're correct. Amazon Pinpoint can now send DKIM-signed email from the identity.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> – Amazon Pinpoint was unable to locate the DKIM records in the DNS settings for the
     *        domain, and won't continue to search for them.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TEMPORARY_FAILURE</code> – A temporary issue occurred, which prevented Amazon Pinpoint from
     *        determining the DKIM status for the domain.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_STARTED</code> – Amazon Pinpoint hasn't yet started searching for the DKIM records in the DKIM
     *        records for the domain.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DkimStatus
     */

    public DkimAttributes withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Describes whether or not Amazon Pinpoint has successfully located the DKIM records in the DNS records for the
     * domain. The status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> – Amazon Pinpoint hasn't yet located the DKIM records in the DNS configuration for the
     * domain, but will continue to attempt to locate them.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code> – Amazon Pinpoint located the DKIM records in the DNS configuration for the domain and
     * determined that they're correct. Amazon Pinpoint can now send DKIM-signed email from the identity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – Amazon Pinpoint was unable to locate the DKIM records in the DNS settings for the domain,
     * and won't continue to search for them.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEMPORARY_FAILURE</code> – A temporary issue occurred, which prevented Amazon Pinpoint from determining the
     * DKIM status for the domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_STARTED</code> – Amazon Pinpoint hasn't yet started searching for the DKIM records in the DKIM records
     * for the domain.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Describes whether or not Amazon Pinpoint has successfully located the DKIM records in the DNS records for
     *        the domain. The status can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> – Amazon Pinpoint hasn't yet located the DKIM records in the DNS configuration for
     *        the domain, but will continue to attempt to locate them.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCESS</code> – Amazon Pinpoint located the DKIM records in the DNS configuration for the domain
     *        and determined that they're correct. Amazon Pinpoint can now send DKIM-signed email from the identity.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> – Amazon Pinpoint was unable to locate the DKIM records in the DNS settings for the
     *        domain, and won't continue to search for them.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TEMPORARY_FAILURE</code> – A temporary issue occurred, which prevented Amazon Pinpoint from
     *        determining the DKIM status for the domain.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_STARTED</code> – Amazon Pinpoint hasn't yet started searching for the DKIM records in the DKIM
     *        records for the domain.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DkimStatus
     */

    public DkimAttributes withStatus(DkimStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A set of unique strings that you use to create a set of CNAME records that you add to the DNS configuration for
     * your domain. When Amazon Pinpoint detects these records in the DNS configuration for your domain, the DKIM
     * authentication process is complete. Amazon Pinpoint usually detects these records within about 72 hours of adding
     * them to the DNS configuration for your domain.
     * </p>
     * 
     * @return A set of unique strings that you use to create a set of CNAME records that you add to the DNS
     *         configuration for your domain. When Amazon Pinpoint detects these records in the DNS configuration for
     *         your domain, the DKIM authentication process is complete. Amazon Pinpoint usually detects these records
     *         within about 72 hours of adding them to the DNS configuration for your domain.
     */

    public java.util.List<String> getTokens() {
        return tokens;
    }

    /**
     * <p>
     * A set of unique strings that you use to create a set of CNAME records that you add to the DNS configuration for
     * your domain. When Amazon Pinpoint detects these records in the DNS configuration for your domain, the DKIM
     * authentication process is complete. Amazon Pinpoint usually detects these records within about 72 hours of adding
     * them to the DNS configuration for your domain.
     * </p>
     * 
     * @param tokens
     *        A set of unique strings that you use to create a set of CNAME records that you add to the DNS
     *        configuration for your domain. When Amazon Pinpoint detects these records in the DNS configuration for
     *        your domain, the DKIM authentication process is complete. Amazon Pinpoint usually detects these records
     *        within about 72 hours of adding them to the DNS configuration for your domain.
     */

    public void setTokens(java.util.Collection<String> tokens) {
        if (tokens == null) {
            this.tokens = null;
            return;
        }

        this.tokens = new java.util.ArrayList<String>(tokens);
    }

    /**
     * <p>
     * A set of unique strings that you use to create a set of CNAME records that you add to the DNS configuration for
     * your domain. When Amazon Pinpoint detects these records in the DNS configuration for your domain, the DKIM
     * authentication process is complete. Amazon Pinpoint usually detects these records within about 72 hours of adding
     * them to the DNS configuration for your domain.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTokens(java.util.Collection)} or {@link #withTokens(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tokens
     *        A set of unique strings that you use to create a set of CNAME records that you add to the DNS
     *        configuration for your domain. When Amazon Pinpoint detects these records in the DNS configuration for
     *        your domain, the DKIM authentication process is complete. Amazon Pinpoint usually detects these records
     *        within about 72 hours of adding them to the DNS configuration for your domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DkimAttributes withTokens(String... tokens) {
        if (this.tokens == null) {
            setTokens(new java.util.ArrayList<String>(tokens.length));
        }
        for (String ele : tokens) {
            this.tokens.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A set of unique strings that you use to create a set of CNAME records that you add to the DNS configuration for
     * your domain. When Amazon Pinpoint detects these records in the DNS configuration for your domain, the DKIM
     * authentication process is complete. Amazon Pinpoint usually detects these records within about 72 hours of adding
     * them to the DNS configuration for your domain.
     * </p>
     * 
     * @param tokens
     *        A set of unique strings that you use to create a set of CNAME records that you add to the DNS
     *        configuration for your domain. When Amazon Pinpoint detects these records in the DNS configuration for
     *        your domain, the DKIM authentication process is complete. Amazon Pinpoint usually detects these records
     *        within about 72 hours of adding them to the DNS configuration for your domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DkimAttributes withTokens(java.util.Collection<String> tokens) {
        setTokens(tokens);
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
        if (getSigningEnabled() != null)
            sb.append("SigningEnabled: ").append(getSigningEnabled()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTokens() != null)
            sb.append("Tokens: ").append(getTokens());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DkimAttributes == false)
            return false;
        DkimAttributes other = (DkimAttributes) obj;
        if (other.getSigningEnabled() == null ^ this.getSigningEnabled() == null)
            return false;
        if (other.getSigningEnabled() != null && other.getSigningEnabled().equals(this.getSigningEnabled()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTokens() == null ^ this.getTokens() == null)
            return false;
        if (other.getTokens() != null && other.getTokens().equals(this.getTokens()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSigningEnabled() == null) ? 0 : getSigningEnabled().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTokens() == null) ? 0 : getTokens().hashCode());
        return hashCode;
    }

    @Override
    public DkimAttributes clone() {
        try {
            return (DkimAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointemail.model.transform.DkimAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
