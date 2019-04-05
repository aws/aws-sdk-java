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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/RemoveListenerCertificates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveListenerCertificatesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener.
     * </p>
     */
    private String listenerArn;
    /**
     * <p>
     * The certificate to remove. You can specify one certificate per call. Set <code>CertificateArn</code> to the
     * certificate ARN but do not set <code>IsDefault</code>.
     * </p>
     */
    private java.util.List<Certificate> certificates;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener.
     * </p>
     * 
     * @param listenerArn
     *        The Amazon Resource Name (ARN) of the listener.
     */

    public void setListenerArn(String listenerArn) {
        this.listenerArn = listenerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the listener.
     */

    public String getListenerArn() {
        return this.listenerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener.
     * </p>
     * 
     * @param listenerArn
     *        The Amazon Resource Name (ARN) of the listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveListenerCertificatesRequest withListenerArn(String listenerArn) {
        setListenerArn(listenerArn);
        return this;
    }

    /**
     * <p>
     * The certificate to remove. You can specify one certificate per call. Set <code>CertificateArn</code> to the
     * certificate ARN but do not set <code>IsDefault</code>.
     * </p>
     * 
     * @return The certificate to remove. You can specify one certificate per call. Set <code>CertificateArn</code> to
     *         the certificate ARN but do not set <code>IsDefault</code>.
     */

    public java.util.List<Certificate> getCertificates() {
        return certificates;
    }

    /**
     * <p>
     * The certificate to remove. You can specify one certificate per call. Set <code>CertificateArn</code> to the
     * certificate ARN but do not set <code>IsDefault</code>.
     * </p>
     * 
     * @param certificates
     *        The certificate to remove. You can specify one certificate per call. Set <code>CertificateArn</code> to
     *        the certificate ARN but do not set <code>IsDefault</code>.
     */

    public void setCertificates(java.util.Collection<Certificate> certificates) {
        if (certificates == null) {
            this.certificates = null;
            return;
        }

        this.certificates = new java.util.ArrayList<Certificate>(certificates);
    }

    /**
     * <p>
     * The certificate to remove. You can specify one certificate per call. Set <code>CertificateArn</code> to the
     * certificate ARN but do not set <code>IsDefault</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCertificates(java.util.Collection)} or {@link #withCertificates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param certificates
     *        The certificate to remove. You can specify one certificate per call. Set <code>CertificateArn</code> to
     *        the certificate ARN but do not set <code>IsDefault</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveListenerCertificatesRequest withCertificates(Certificate... certificates) {
        if (this.certificates == null) {
            setCertificates(new java.util.ArrayList<Certificate>(certificates.length));
        }
        for (Certificate ele : certificates) {
            this.certificates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The certificate to remove. You can specify one certificate per call. Set <code>CertificateArn</code> to the
     * certificate ARN but do not set <code>IsDefault</code>.
     * </p>
     * 
     * @param certificates
     *        The certificate to remove. You can specify one certificate per call. Set <code>CertificateArn</code> to
     *        the certificate ARN but do not set <code>IsDefault</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveListenerCertificatesRequest withCertificates(java.util.Collection<Certificate> certificates) {
        setCertificates(certificates);
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
        if (getListenerArn() != null)
            sb.append("ListenerArn: ").append(getListenerArn()).append(",");
        if (getCertificates() != null)
            sb.append("Certificates: ").append(getCertificates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveListenerCertificatesRequest == false)
            return false;
        RemoveListenerCertificatesRequest other = (RemoveListenerCertificatesRequest) obj;
        if (other.getListenerArn() == null ^ this.getListenerArn() == null)
            return false;
        if (other.getListenerArn() != null && other.getListenerArn().equals(this.getListenerArn()) == false)
            return false;
        if (other.getCertificates() == null ^ this.getCertificates() == null)
            return false;
        if (other.getCertificates() != null && other.getCertificates().equals(this.getCertificates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListenerArn() == null) ? 0 : getListenerArn().hashCode());
        hashCode = prime * hashCode + ((getCertificates() == null) ? 0 : getCertificates().hashCode());
        return hashCode;
    }

    @Override
    public RemoveListenerCertificatesRequest clone() {
        return (RemoveListenerCertificatesRequest) super.clone();
    }

}
