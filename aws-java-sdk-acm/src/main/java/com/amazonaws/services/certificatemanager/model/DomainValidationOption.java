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
package com.amazonaws.services.certificatemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the domain names that you want ACM to use to send you emails that enable you to validate
 * domain ownership.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/DomainValidationOption" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainValidationOption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A fully qualified domain name (FQDN) in the certificate request.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The domain name that you want ACM to use to send you validation emails. This domain name is the suffix of the
     * email addresses that you want ACM to use. This must be the same as the <code>DomainName</code> value or a
     * superdomain of the <code>DomainName</code> value. For example, if you request a certificate for
     * <code>testing.example.com</code>, you can specify <code>example.com</code> for this value. In that case, ACM
     * sends domain validation emails to the following five addresses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * admin@example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * administrator@example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * hostmaster@example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * postmaster@example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * webmaster@example.com
     * </p>
     * </li>
     * </ul>
     */
    private String validationDomain;

    /**
     * <p>
     * A fully qualified domain name (FQDN) in the certificate request.
     * </p>
     * 
     * @param domainName
     *        A fully qualified domain name (FQDN) in the certificate request.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * A fully qualified domain name (FQDN) in the certificate request.
     * </p>
     * 
     * @return A fully qualified domain name (FQDN) in the certificate request.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * A fully qualified domain name (FQDN) in the certificate request.
     * </p>
     * 
     * @param domainName
     *        A fully qualified domain name (FQDN) in the certificate request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainValidationOption withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The domain name that you want ACM to use to send you validation emails. This domain name is the suffix of the
     * email addresses that you want ACM to use. This must be the same as the <code>DomainName</code> value or a
     * superdomain of the <code>DomainName</code> value. For example, if you request a certificate for
     * <code>testing.example.com</code>, you can specify <code>example.com</code> for this value. In that case, ACM
     * sends domain validation emails to the following five addresses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * admin@example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * administrator@example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * hostmaster@example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * postmaster@example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * webmaster@example.com
     * </p>
     * </li>
     * </ul>
     * 
     * @param validationDomain
     *        The domain name that you want ACM to use to send you validation emails. This domain name is the suffix of
     *        the email addresses that you want ACM to use. This must be the same as the <code>DomainName</code> value
     *        or a superdomain of the <code>DomainName</code> value. For example, if you request a certificate for
     *        <code>testing.example.com</code>, you can specify <code>example.com</code> for this value. In that case,
     *        ACM sends domain validation emails to the following five addresses:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        admin@example.com
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        administrator@example.com
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        hostmaster@example.com
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        postmaster@example.com
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        webmaster@example.com
     *        </p>
     *        </li>
     */

    public void setValidationDomain(String validationDomain) {
        this.validationDomain = validationDomain;
    }

    /**
     * <p>
     * The domain name that you want ACM to use to send you validation emails. This domain name is the suffix of the
     * email addresses that you want ACM to use. This must be the same as the <code>DomainName</code> value or a
     * superdomain of the <code>DomainName</code> value. For example, if you request a certificate for
     * <code>testing.example.com</code>, you can specify <code>example.com</code> for this value. In that case, ACM
     * sends domain validation emails to the following five addresses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * admin@example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * administrator@example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * hostmaster@example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * postmaster@example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * webmaster@example.com
     * </p>
     * </li>
     * </ul>
     * 
     * @return The domain name that you want ACM to use to send you validation emails. This domain name is the suffix of
     *         the email addresses that you want ACM to use. This must be the same as the <code>DomainName</code> value
     *         or a superdomain of the <code>DomainName</code> value. For example, if you request a certificate for
     *         <code>testing.example.com</code>, you can specify <code>example.com</code> for this value. In that case,
     *         ACM sends domain validation emails to the following five addresses:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         admin@example.com
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         administrator@example.com
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         hostmaster@example.com
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         postmaster@example.com
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         webmaster@example.com
     *         </p>
     *         </li>
     */

    public String getValidationDomain() {
        return this.validationDomain;
    }

    /**
     * <p>
     * The domain name that you want ACM to use to send you validation emails. This domain name is the suffix of the
     * email addresses that you want ACM to use. This must be the same as the <code>DomainName</code> value or a
     * superdomain of the <code>DomainName</code> value. For example, if you request a certificate for
     * <code>testing.example.com</code>, you can specify <code>example.com</code> for this value. In that case, ACM
     * sends domain validation emails to the following five addresses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * admin@example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * administrator@example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * hostmaster@example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * postmaster@example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * webmaster@example.com
     * </p>
     * </li>
     * </ul>
     * 
     * @param validationDomain
     *        The domain name that you want ACM to use to send you validation emails. This domain name is the suffix of
     *        the email addresses that you want ACM to use. This must be the same as the <code>DomainName</code> value
     *        or a superdomain of the <code>DomainName</code> value. For example, if you request a certificate for
     *        <code>testing.example.com</code>, you can specify <code>example.com</code> for this value. In that case,
     *        ACM sends domain validation emails to the following five addresses:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        admin@example.com
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        administrator@example.com
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        hostmaster@example.com
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        postmaster@example.com
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        webmaster@example.com
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainValidationOption withValidationDomain(String validationDomain) {
        setValidationDomain(validationDomain);
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getValidationDomain() != null)
            sb.append("ValidationDomain: ").append(getValidationDomain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainValidationOption == false)
            return false;
        DomainValidationOption other = (DomainValidationOption) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getValidationDomain() == null ^ this.getValidationDomain() == null)
            return false;
        if (other.getValidationDomain() != null && other.getValidationDomain().equals(this.getValidationDomain()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getValidationDomain() == null) ? 0 : getValidationDomain().hashCode());
        return hashCode;
    }

    @Override
    public DomainValidationOption clone() {
        try {
            return (DomainValidationOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.certificatemanager.model.transform.DomainValidationOptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
