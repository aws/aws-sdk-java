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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateCertificate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCertificateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the certificate.
     * </p>
     */
    private String certificateName;
    /**
     * <p>
     * The domain name (e.g., <code>example.com</code>) for the certificate.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * An array of strings that specify the alternate domains (e.g., <code>example2.com</code>) and subdomains (e.g.,
     * <code>blog.example.com</code>) for the certificate.
     * </p>
     * <p>
     * You can specify a maximum of nine alternate domains (in addition to the primary domain name).
     * </p>
     * <p>
     * Wildcard domain entries (e.g., <code>*.example.com</code>) are not supported.
     * </p>
     */
    private java.util.List<String> subjectAlternativeNames;
    /**
     * <p>
     * The tag keys and optional values to add to the certificate during create.
     * </p>
     * <p>
     * Use the <code>TagResource</code> action to tag a resource after it's created.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name for the certificate.
     * </p>
     * 
     * @param certificateName
     *        The name for the certificate.
     */

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    /**
     * <p>
     * The name for the certificate.
     * </p>
     * 
     * @return The name for the certificate.
     */

    public String getCertificateName() {
        return this.certificateName;
    }

    /**
     * <p>
     * The name for the certificate.
     * </p>
     * 
     * @param certificateName
     *        The name for the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCertificateRequest withCertificateName(String certificateName) {
        setCertificateName(certificateName);
        return this;
    }

    /**
     * <p>
     * The domain name (e.g., <code>example.com</code>) for the certificate.
     * </p>
     * 
     * @param domainName
     *        The domain name (e.g., <code>example.com</code>) for the certificate.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name (e.g., <code>example.com</code>) for the certificate.
     * </p>
     * 
     * @return The domain name (e.g., <code>example.com</code>) for the certificate.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The domain name (e.g., <code>example.com</code>) for the certificate.
     * </p>
     * 
     * @param domainName
     *        The domain name (e.g., <code>example.com</code>) for the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCertificateRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * An array of strings that specify the alternate domains (e.g., <code>example2.com</code>) and subdomains (e.g.,
     * <code>blog.example.com</code>) for the certificate.
     * </p>
     * <p>
     * You can specify a maximum of nine alternate domains (in addition to the primary domain name).
     * </p>
     * <p>
     * Wildcard domain entries (e.g., <code>*.example.com</code>) are not supported.
     * </p>
     * 
     * @return An array of strings that specify the alternate domains (e.g., <code>example2.com</code>) and subdomains
     *         (e.g., <code>blog.example.com</code>) for the certificate.</p>
     *         <p>
     *         You can specify a maximum of nine alternate domains (in addition to the primary domain name).
     *         </p>
     *         <p>
     *         Wildcard domain entries (e.g., <code>*.example.com</code>) are not supported.
     */

    public java.util.List<String> getSubjectAlternativeNames() {
        return subjectAlternativeNames;
    }

    /**
     * <p>
     * An array of strings that specify the alternate domains (e.g., <code>example2.com</code>) and subdomains (e.g.,
     * <code>blog.example.com</code>) for the certificate.
     * </p>
     * <p>
     * You can specify a maximum of nine alternate domains (in addition to the primary domain name).
     * </p>
     * <p>
     * Wildcard domain entries (e.g., <code>*.example.com</code>) are not supported.
     * </p>
     * 
     * @param subjectAlternativeNames
     *        An array of strings that specify the alternate domains (e.g., <code>example2.com</code>) and subdomains
     *        (e.g., <code>blog.example.com</code>) for the certificate.</p>
     *        <p>
     *        You can specify a maximum of nine alternate domains (in addition to the primary domain name).
     *        </p>
     *        <p>
     *        Wildcard domain entries (e.g., <code>*.example.com</code>) are not supported.
     */

    public void setSubjectAlternativeNames(java.util.Collection<String> subjectAlternativeNames) {
        if (subjectAlternativeNames == null) {
            this.subjectAlternativeNames = null;
            return;
        }

        this.subjectAlternativeNames = new java.util.ArrayList<String>(subjectAlternativeNames);
    }

    /**
     * <p>
     * An array of strings that specify the alternate domains (e.g., <code>example2.com</code>) and subdomains (e.g.,
     * <code>blog.example.com</code>) for the certificate.
     * </p>
     * <p>
     * You can specify a maximum of nine alternate domains (in addition to the primary domain name).
     * </p>
     * <p>
     * Wildcard domain entries (e.g., <code>*.example.com</code>) are not supported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubjectAlternativeNames(java.util.Collection)} or
     * {@link #withSubjectAlternativeNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param subjectAlternativeNames
     *        An array of strings that specify the alternate domains (e.g., <code>example2.com</code>) and subdomains
     *        (e.g., <code>blog.example.com</code>) for the certificate.</p>
     *        <p>
     *        You can specify a maximum of nine alternate domains (in addition to the primary domain name).
     *        </p>
     *        <p>
     *        Wildcard domain entries (e.g., <code>*.example.com</code>) are not supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCertificateRequest withSubjectAlternativeNames(String... subjectAlternativeNames) {
        if (this.subjectAlternativeNames == null) {
            setSubjectAlternativeNames(new java.util.ArrayList<String>(subjectAlternativeNames.length));
        }
        for (String ele : subjectAlternativeNames) {
            this.subjectAlternativeNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings that specify the alternate domains (e.g., <code>example2.com</code>) and subdomains (e.g.,
     * <code>blog.example.com</code>) for the certificate.
     * </p>
     * <p>
     * You can specify a maximum of nine alternate domains (in addition to the primary domain name).
     * </p>
     * <p>
     * Wildcard domain entries (e.g., <code>*.example.com</code>) are not supported.
     * </p>
     * 
     * @param subjectAlternativeNames
     *        An array of strings that specify the alternate domains (e.g., <code>example2.com</code>) and subdomains
     *        (e.g., <code>blog.example.com</code>) for the certificate.</p>
     *        <p>
     *        You can specify a maximum of nine alternate domains (in addition to the primary domain name).
     *        </p>
     *        <p>
     *        Wildcard domain entries (e.g., <code>*.example.com</code>) are not supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCertificateRequest withSubjectAlternativeNames(java.util.Collection<String> subjectAlternativeNames) {
        setSubjectAlternativeNames(subjectAlternativeNames);
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the certificate during create.
     * </p>
     * <p>
     * Use the <code>TagResource</code> action to tag a resource after it's created.
     * </p>
     * 
     * @return The tag keys and optional values to add to the certificate during create.</p>
     *         <p>
     *         Use the <code>TagResource</code> action to tag a resource after it's created.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the certificate during create.
     * </p>
     * <p>
     * Use the <code>TagResource</code> action to tag a resource after it's created.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values to add to the certificate during create.</p>
     *        <p>
     *        Use the <code>TagResource</code> action to tag a resource after it's created.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tag keys and optional values to add to the certificate during create.
     * </p>
     * <p>
     * Use the <code>TagResource</code> action to tag a resource after it's created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values to add to the certificate during create.</p>
     *        <p>
     *        Use the <code>TagResource</code> action to tag a resource after it's created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCertificateRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the certificate during create.
     * </p>
     * <p>
     * Use the <code>TagResource</code> action to tag a resource after it's created.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values to add to the certificate during create.</p>
     *        <p>
     *        Use the <code>TagResource</code> action to tag a resource after it's created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCertificateRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getCertificateName() != null)
            sb.append("CertificateName: ").append(getCertificateName()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getSubjectAlternativeNames() != null)
            sb.append("SubjectAlternativeNames: ").append(getSubjectAlternativeNames()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCertificateRequest == false)
            return false;
        CreateCertificateRequest other = (CreateCertificateRequest) obj;
        if (other.getCertificateName() == null ^ this.getCertificateName() == null)
            return false;
        if (other.getCertificateName() != null && other.getCertificateName().equals(this.getCertificateName()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getSubjectAlternativeNames() == null ^ this.getSubjectAlternativeNames() == null)
            return false;
        if (other.getSubjectAlternativeNames() != null && other.getSubjectAlternativeNames().equals(this.getSubjectAlternativeNames()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateName() == null) ? 0 : getCertificateName().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getSubjectAlternativeNames() == null) ? 0 : getSubjectAlternativeNames().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateCertificateRequest clone() {
        return (CreateCertificateRequest) super.clone();
    }

}
