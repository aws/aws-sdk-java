/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The load balancer name where you want to create the TLS/SSL certificate.
     * </p>
     */
    private String loadBalancerName;
    /**
     * <p>
     * The TLS/SSL certificate name.
     * </p>
     */
    private String certificateName;
    /**
     * <p>
     * The domain name (e.g., <code>example.com</code>) for your TLS/SSL certificate.
     * </p>
     */
    private String certificateDomainName;
    /**
     * <p>
     * An array of strings listing alternative domain names for your TLS/SSL certificate.
     * </p>
     */
    private java.util.List<String> certificateAlternativeNames;

    /**
     * <p>
     * The load balancer name where you want to create the TLS/SSL certificate.
     * </p>
     * 
     * @param loadBalancerName
     *        The load balancer name where you want to create the TLS/SSL certificate.
     */

    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    /**
     * <p>
     * The load balancer name where you want to create the TLS/SSL certificate.
     * </p>
     * 
     * @return The load balancer name where you want to create the TLS/SSL certificate.
     */

    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * <p>
     * The load balancer name where you want to create the TLS/SSL certificate.
     * </p>
     * 
     * @param loadBalancerName
     *        The load balancer name where you want to create the TLS/SSL certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerTlsCertificateRequest withLoadBalancerName(String loadBalancerName) {
        setLoadBalancerName(loadBalancerName);
        return this;
    }

    /**
     * <p>
     * The TLS/SSL certificate name.
     * </p>
     * 
     * @param certificateName
     *        The TLS/SSL certificate name.
     */

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    /**
     * <p>
     * The TLS/SSL certificate name.
     * </p>
     * 
     * @return The TLS/SSL certificate name.
     */

    public String getCertificateName() {
        return this.certificateName;
    }

    /**
     * <p>
     * The TLS/SSL certificate name.
     * </p>
     * 
     * @param certificateName
     *        The TLS/SSL certificate name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerTlsCertificateRequest withCertificateName(String certificateName) {
        setCertificateName(certificateName);
        return this;
    }

    /**
     * <p>
     * The domain name (e.g., <code>example.com</code>) for your TLS/SSL certificate.
     * </p>
     * 
     * @param certificateDomainName
     *        The domain name (e.g., <code>example.com</code>) for your TLS/SSL certificate.
     */

    public void setCertificateDomainName(String certificateDomainName) {
        this.certificateDomainName = certificateDomainName;
    }

    /**
     * <p>
     * The domain name (e.g., <code>example.com</code>) for your TLS/SSL certificate.
     * </p>
     * 
     * @return The domain name (e.g., <code>example.com</code>) for your TLS/SSL certificate.
     */

    public String getCertificateDomainName() {
        return this.certificateDomainName;
    }

    /**
     * <p>
     * The domain name (e.g., <code>example.com</code>) for your TLS/SSL certificate.
     * </p>
     * 
     * @param certificateDomainName
     *        The domain name (e.g., <code>example.com</code>) for your TLS/SSL certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerTlsCertificateRequest withCertificateDomainName(String certificateDomainName) {
        setCertificateDomainName(certificateDomainName);
        return this;
    }

    /**
     * <p>
     * An array of strings listing alternative domain names for your TLS/SSL certificate.
     * </p>
     * 
     * @return An array of strings listing alternative domain names for your TLS/SSL certificate.
     */

    public java.util.List<String> getCertificateAlternativeNames() {
        return certificateAlternativeNames;
    }

    /**
     * <p>
     * An array of strings listing alternative domain names for your TLS/SSL certificate.
     * </p>
     * 
     * @param certificateAlternativeNames
     *        An array of strings listing alternative domain names for your TLS/SSL certificate.
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
     * An array of strings listing alternative domain names for your TLS/SSL certificate.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCertificateAlternativeNames(java.util.Collection)} or
     * {@link #withCertificateAlternativeNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param certificateAlternativeNames
     *        An array of strings listing alternative domain names for your TLS/SSL certificate.
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
     * An array of strings listing alternative domain names for your TLS/SSL certificate.
     * </p>
     * 
     * @param certificateAlternativeNames
     *        An array of strings listing alternative domain names for your TLS/SSL certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerTlsCertificateRequest withCertificateAlternativeNames(java.util.Collection<String> certificateAlternativeNames) {
        setCertificateAlternativeNames(certificateAlternativeNames);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("CertificateAlternativeNames: ").append(getCertificateAlternativeNames());
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
        return hashCode;
    }

    @Override
    public CreateLoadBalancerTlsCertificateRequest clone() {
        return (CreateLoadBalancerTlsCertificateRequest) super.clone();
    }

}
