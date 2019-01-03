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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateLoadBalancerTlsCertificate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLoadBalancerTlsCertificateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The load balancer name where you want to create the SSL/TLS certificate.
     * </p>
     */
    private String loadBalancerName;
    /**
     * <p>
     * The SSL/TLS certificate name.
     * </p>
     * <p>
     * You can have up to 10 certificates in your account at one time. Each Lightsail load balancer can have up to 2
     * certificates associated with it at one time. There is also an overall limit to the number of certificates that
     * can be issue in a 365-day period. For more information, see <a
     * href="http://docs.aws.amazon.com/acm/latest/userguide/acm-limits.html">Limits</a>.
     * </p>
     */
    private String certificateName;
    /**
     * <p>
     * The domain name (e.g., <code>example.com</code>) for your SSL/TLS certificate.
     * </p>
     */
    private String certificateDomainName;
    /**
     * <p>
     * An array of strings listing alternative domains and subdomains for your SSL/TLS certificate. Lightsail will
     * de-dupe the names for you. You can have a maximum of 9 alternative names (in addition to the 1 primary domain).
     * We do not support wildcards (e.g., <code>*.example.com</code>).
     * </p>
     */
    private java.util.List<String> certificateAlternativeNames;
    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The load balancer name where you want to create the SSL/TLS certificate.
     * </p>
     * 
     * @param loadBalancerName
     *        The load balancer name where you want to create the SSL/TLS certificate.
     */

    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    /**
     * <p>
     * The load balancer name where you want to create the SSL/TLS certificate.
     * </p>
     * 
     * @return The load balancer name where you want to create the SSL/TLS certificate.
     */

    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * <p>
     * The load balancer name where you want to create the SSL/TLS certificate.
     * </p>
     * 
     * @param loadBalancerName
     *        The load balancer name where you want to create the SSL/TLS certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerTlsCertificateRequest withLoadBalancerName(String loadBalancerName) {
        setLoadBalancerName(loadBalancerName);
        return this;
    }

    /**
     * <p>
     * The SSL/TLS certificate name.
     * </p>
     * <p>
     * You can have up to 10 certificates in your account at one time. Each Lightsail load balancer can have up to 2
     * certificates associated with it at one time. There is also an overall limit to the number of certificates that
     * can be issue in a 365-day period. For more information, see <a
     * href="http://docs.aws.amazon.com/acm/latest/userguide/acm-limits.html">Limits</a>.
     * </p>
     * 
     * @param certificateName
     *        The SSL/TLS certificate name.</p>
     *        <p>
     *        You can have up to 10 certificates in your account at one time. Each Lightsail load balancer can have up
     *        to 2 certificates associated with it at one time. There is also an overall limit to the number of
     *        certificates that can be issue in a 365-day period. For more information, see <a
     *        href="http://docs.aws.amazon.com/acm/latest/userguide/acm-limits.html">Limits</a>.
     */

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    /**
     * <p>
     * The SSL/TLS certificate name.
     * </p>
     * <p>
     * You can have up to 10 certificates in your account at one time. Each Lightsail load balancer can have up to 2
     * certificates associated with it at one time. There is also an overall limit to the number of certificates that
     * can be issue in a 365-day period. For more information, see <a
     * href="http://docs.aws.amazon.com/acm/latest/userguide/acm-limits.html">Limits</a>.
     * </p>
     * 
     * @return The SSL/TLS certificate name.</p>
     *         <p>
     *         You can have up to 10 certificates in your account at one time. Each Lightsail load balancer can have up
     *         to 2 certificates associated with it at one time. There is also an overall limit to the number of
     *         certificates that can be issue in a 365-day period. For more information, see <a
     *         href="http://docs.aws.amazon.com/acm/latest/userguide/acm-limits.html">Limits</a>.
     */

    public String getCertificateName() {
        return this.certificateName;
    }

    /**
     * <p>
     * The SSL/TLS certificate name.
     * </p>
     * <p>
     * You can have up to 10 certificates in your account at one time. Each Lightsail load balancer can have up to 2
     * certificates associated with it at one time. There is also an overall limit to the number of certificates that
     * can be issue in a 365-day period. For more information, see <a
     * href="http://docs.aws.amazon.com/acm/latest/userguide/acm-limits.html">Limits</a>.
     * </p>
     * 
     * @param certificateName
     *        The SSL/TLS certificate name.</p>
     *        <p>
     *        You can have up to 10 certificates in your account at one time. Each Lightsail load balancer can have up
     *        to 2 certificates associated with it at one time. There is also an overall limit to the number of
     *        certificates that can be issue in a 365-day period. For more information, see <a
     *        href="http://docs.aws.amazon.com/acm/latest/userguide/acm-limits.html">Limits</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerTlsCertificateRequest withCertificateName(String certificateName) {
        setCertificateName(certificateName);
        return this;
    }

    /**
     * <p>
     * The domain name (e.g., <code>example.com</code>) for your SSL/TLS certificate.
     * </p>
     * 
     * @param certificateDomainName
     *        The domain name (e.g., <code>example.com</code>) for your SSL/TLS certificate.
     */

    public void setCertificateDomainName(String certificateDomainName) {
        this.certificateDomainName = certificateDomainName;
    }

    /**
     * <p>
     * The domain name (e.g., <code>example.com</code>) for your SSL/TLS certificate.
     * </p>
     * 
     * @return The domain name (e.g., <code>example.com</code>) for your SSL/TLS certificate.
     */

    public String getCertificateDomainName() {
        return this.certificateDomainName;
    }

    /**
     * <p>
     * The domain name (e.g., <code>example.com</code>) for your SSL/TLS certificate.
     * </p>
     * 
     * @param certificateDomainName
     *        The domain name (e.g., <code>example.com</code>) for your SSL/TLS certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerTlsCertificateRequest withCertificateDomainName(String certificateDomainName) {
        setCertificateDomainName(certificateDomainName);
        return this;
    }

    /**
     * <p>
     * An array of strings listing alternative domains and subdomains for your SSL/TLS certificate. Lightsail will
     * de-dupe the names for you. You can have a maximum of 9 alternative names (in addition to the 1 primary domain).
     * We do not support wildcards (e.g., <code>*.example.com</code>).
     * </p>
     * 
     * @return An array of strings listing alternative domains and subdomains for your SSL/TLS certificate. Lightsail
     *         will de-dupe the names for you. You can have a maximum of 9 alternative names (in addition to the 1
     *         primary domain). We do not support wildcards (e.g., <code>*.example.com</code>).
     */

    public java.util.List<String> getCertificateAlternativeNames() {
        return certificateAlternativeNames;
    }

    /**
     * <p>
     * An array of strings listing alternative domains and subdomains for your SSL/TLS certificate. Lightsail will
     * de-dupe the names for you. You can have a maximum of 9 alternative names (in addition to the 1 primary domain).
     * We do not support wildcards (e.g., <code>*.example.com</code>).
     * </p>
     * 
     * @param certificateAlternativeNames
     *        An array of strings listing alternative domains and subdomains for your SSL/TLS certificate. Lightsail
     *        will de-dupe the names for you. You can have a maximum of 9 alternative names (in addition to the 1
     *        primary domain). We do not support wildcards (e.g., <code>*.example.com</code>).
     */

    public void setCertificateAlternativeNames(java.util.Collection<String> certificateAlternativeNames) {
        if (certificateAlternativeNames == null) {
            this.certificateAlternativeNames = null;
            return;
        }

        this.certificateAlternativeNames = new java.util.ArrayList<String>(certificateAlternativeNames);
    }

    /**
     * <p>
     * An array of strings listing alternative domains and subdomains for your SSL/TLS certificate. Lightsail will
     * de-dupe the names for you. You can have a maximum of 9 alternative names (in addition to the 1 primary domain).
     * We do not support wildcards (e.g., <code>*.example.com</code>).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCertificateAlternativeNames(java.util.Collection)} or
     * {@link #withCertificateAlternativeNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param certificateAlternativeNames
     *        An array of strings listing alternative domains and subdomains for your SSL/TLS certificate. Lightsail
     *        will de-dupe the names for you. You can have a maximum of 9 alternative names (in addition to the 1
     *        primary domain). We do not support wildcards (e.g., <code>*.example.com</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerTlsCertificateRequest withCertificateAlternativeNames(String... certificateAlternativeNames) {
        if (this.certificateAlternativeNames == null) {
            setCertificateAlternativeNames(new java.util.ArrayList<String>(certificateAlternativeNames.length));
        }
        for (String ele : certificateAlternativeNames) {
            this.certificateAlternativeNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings listing alternative domains and subdomains for your SSL/TLS certificate. Lightsail will
     * de-dupe the names for you. You can have a maximum of 9 alternative names (in addition to the 1 primary domain).
     * We do not support wildcards (e.g., <code>*.example.com</code>).
     * </p>
     * 
     * @param certificateAlternativeNames
     *        An array of strings listing alternative domains and subdomains for your SSL/TLS certificate. Lightsail
     *        will de-dupe the names for you. You can have a maximum of 9 alternative names (in addition to the 1
     *        primary domain). We do not support wildcards (e.g., <code>*.example.com</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerTlsCertificateRequest withCertificateAlternativeNames(java.util.Collection<String> certificateAlternativeNames) {
        setCertificateAlternativeNames(certificateAlternativeNames);
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * </p>
     * 
     * @return The tag keys and optional values to add to the resource during create.</p>
     *         <p>
     *         To tag a resource after it has been created, see the <code>tag resource</code> operation.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values to add to the resource during create.</p>
     *        <p>
     *        To tag a resource after it has been created, see the <code>tag resource</code> operation.
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
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values to add to the resource during create.</p>
     *        <p>
     *        To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerTlsCertificateRequest withTags(Tag... tags) {
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
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values to add to the resource during create.</p>
     *        <p>
     *        To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerTlsCertificateRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getLoadBalancerName() != null)
            sb.append("LoadBalancerName: ").append(getLoadBalancerName()).append(",");
        if (getCertificateName() != null)
            sb.append("CertificateName: ").append(getCertificateName()).append(",");
        if (getCertificateDomainName() != null)
            sb.append("CertificateDomainName: ").append(getCertificateDomainName()).append(",");
        if (getCertificateAlternativeNames() != null)
            sb.append("CertificateAlternativeNames: ").append(getCertificateAlternativeNames()).append(",");
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

        if (obj instanceof CreateLoadBalancerTlsCertificateRequest == false)
            return false;
        CreateLoadBalancerTlsCertificateRequest other = (CreateLoadBalancerTlsCertificateRequest) obj;
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getCertificateName() == null ^ this.getCertificateName() == null)
            return false;
        if (other.getCertificateName() != null && other.getCertificateName().equals(this.getCertificateName()) == false)
            return false;
        if (other.getCertificateDomainName() == null ^ this.getCertificateDomainName() == null)
            return false;
        if (other.getCertificateDomainName() != null && other.getCertificateDomainName().equals(this.getCertificateDomainName()) == false)
            return false;
        if (other.getCertificateAlternativeNames() == null ^ this.getCertificateAlternativeNames() == null)
            return false;
        if (other.getCertificateAlternativeNames() != null && other.getCertificateAlternativeNames().equals(this.getCertificateAlternativeNames()) == false)
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

        hashCode = prime * hashCode + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode());
        hashCode = prime * hashCode + ((getCertificateName() == null) ? 0 : getCertificateName().hashCode());
        hashCode = prime * hashCode + ((getCertificateDomainName() == null) ? 0 : getCertificateDomainName().hashCode());
        hashCode = prime * hashCode + ((getCertificateAlternativeNames() == null) ? 0 : getCertificateAlternativeNames().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateLoadBalancerTlsCertificateRequest clone() {
        return (CreateLoadBalancerTlsCertificateRequest) super.clone();
    }

}
