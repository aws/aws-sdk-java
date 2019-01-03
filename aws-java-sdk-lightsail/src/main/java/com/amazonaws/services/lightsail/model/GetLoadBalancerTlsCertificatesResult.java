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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetLoadBalancerTlsCertificates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLoadBalancerTlsCertificatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An array of LoadBalancerTlsCertificate objects describing your SSL/TLS certificates.
     * </p>
     */
    private java.util.List<LoadBalancerTlsCertificate> tlsCertificates;

    /**
     * <p>
     * An array of LoadBalancerTlsCertificate objects describing your SSL/TLS certificates.
     * </p>
     * 
     * @return An array of LoadBalancerTlsCertificate objects describing your SSL/TLS certificates.
     */

    public java.util.List<LoadBalancerTlsCertificate> getTlsCertificates() {
        return tlsCertificates;
    }

    /**
     * <p>
     * An array of LoadBalancerTlsCertificate objects describing your SSL/TLS certificates.
     * </p>
     * 
     * @param tlsCertificates
     *        An array of LoadBalancerTlsCertificate objects describing your SSL/TLS certificates.
     */

    public void setTlsCertificates(java.util.Collection<LoadBalancerTlsCertificate> tlsCertificates) {
        if (tlsCertificates == null) {
            this.tlsCertificates = null;
            return;
        }

        this.tlsCertificates = new java.util.ArrayList<LoadBalancerTlsCertificate>(tlsCertificates);
    }

    /**
     * <p>
     * An array of LoadBalancerTlsCertificate objects describing your SSL/TLS certificates.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTlsCertificates(java.util.Collection)} or {@link #withTlsCertificates(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param tlsCertificates
     *        An array of LoadBalancerTlsCertificate objects describing your SSL/TLS certificates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLoadBalancerTlsCertificatesResult withTlsCertificates(LoadBalancerTlsCertificate... tlsCertificates) {
        if (this.tlsCertificates == null) {
            setTlsCertificates(new java.util.ArrayList<LoadBalancerTlsCertificate>(tlsCertificates.length));
        }
        for (LoadBalancerTlsCertificate ele : tlsCertificates) {
            this.tlsCertificates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of LoadBalancerTlsCertificate objects describing your SSL/TLS certificates.
     * </p>
     * 
     * @param tlsCertificates
     *        An array of LoadBalancerTlsCertificate objects describing your SSL/TLS certificates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLoadBalancerTlsCertificatesResult withTlsCertificates(java.util.Collection<LoadBalancerTlsCertificate> tlsCertificates) {
        setTlsCertificates(tlsCertificates);
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
        if (getTlsCertificates() != null)
            sb.append("TlsCertificates: ").append(getTlsCertificates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLoadBalancerTlsCertificatesResult == false)
            return false;
        GetLoadBalancerTlsCertificatesResult other = (GetLoadBalancerTlsCertificatesResult) obj;
        if (other.getTlsCertificates() == null ^ this.getTlsCertificates() == null)
            return false;
        if (other.getTlsCertificates() != null && other.getTlsCertificates().equals(this.getTlsCertificates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTlsCertificates() == null) ? 0 : getTlsCertificates().hashCode());
        return hashCode;
    }

    @Override
    public GetLoadBalancerTlsCertificatesResult clone() {
        try {
            return (GetLoadBalancerTlsCertificatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
