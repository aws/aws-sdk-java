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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteLoadBalancerTlsCertificate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteLoadBalancerTlsCertificateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The load balancer name.
     * </p>
     */
    private String loadBalancerName;
    /**
     * <p>
     * The SSL/TLS certificate name.
     * </p>
     */
    private String certificateName;
    /**
     * <p>
     * When <code>true</code>, forces the deletion of an SSL/TLS certificate.
     * </p>
     * <p>
     * There can be two certificates associated with a Lightsail load balancer: the primary and the backup. The
     * <code>force</code> parameter is required when the primary SSL/TLS certificate is in use by an instance attached
     * to the load balancer.
     * </p>
     */
    private Boolean force;

    /**
     * <p>
     * The load balancer name.
     * </p>
     * 
     * @param loadBalancerName
     *        The load balancer name.
     */

    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    /**
     * <p>
     * The load balancer name.
     * </p>
     * 
     * @return The load balancer name.
     */

    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * <p>
     * The load balancer name.
     * </p>
     * 
     * @param loadBalancerName
     *        The load balancer name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteLoadBalancerTlsCertificateRequest withLoadBalancerName(String loadBalancerName) {
        setLoadBalancerName(loadBalancerName);
        return this;
    }

    /**
     * <p>
     * The SSL/TLS certificate name.
     * </p>
     * 
     * @param certificateName
     *        The SSL/TLS certificate name.
     */

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    /**
     * <p>
     * The SSL/TLS certificate name.
     * </p>
     * 
     * @return The SSL/TLS certificate name.
     */

    public String getCertificateName() {
        return this.certificateName;
    }

    /**
     * <p>
     * The SSL/TLS certificate name.
     * </p>
     * 
     * @param certificateName
     *        The SSL/TLS certificate name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteLoadBalancerTlsCertificateRequest withCertificateName(String certificateName) {
        setCertificateName(certificateName);
        return this;
    }

    /**
     * <p>
     * When <code>true</code>, forces the deletion of an SSL/TLS certificate.
     * </p>
     * <p>
     * There can be two certificates associated with a Lightsail load balancer: the primary and the backup. The
     * <code>force</code> parameter is required when the primary SSL/TLS certificate is in use by an instance attached
     * to the load balancer.
     * </p>
     * 
     * @param force
     *        When <code>true</code>, forces the deletion of an SSL/TLS certificate.</p>
     *        <p>
     *        There can be two certificates associated with a Lightsail load balancer: the primary and the backup. The
     *        <code>force</code> parameter is required when the primary SSL/TLS certificate is in use by an instance
     *        attached to the load balancer.
     */

    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * When <code>true</code>, forces the deletion of an SSL/TLS certificate.
     * </p>
     * <p>
     * There can be two certificates associated with a Lightsail load balancer: the primary and the backup. The
     * <code>force</code> parameter is required when the primary SSL/TLS certificate is in use by an instance attached
     * to the load balancer.
     * </p>
     * 
     * @return When <code>true</code>, forces the deletion of an SSL/TLS certificate.</p>
     *         <p>
     *         There can be two certificates associated with a Lightsail load balancer: the primary and the backup. The
     *         <code>force</code> parameter is required when the primary SSL/TLS certificate is in use by an instance
     *         attached to the load balancer.
     */

    public Boolean getForce() {
        return this.force;
    }

    /**
     * <p>
     * When <code>true</code>, forces the deletion of an SSL/TLS certificate.
     * </p>
     * <p>
     * There can be two certificates associated with a Lightsail load balancer: the primary and the backup. The
     * <code>force</code> parameter is required when the primary SSL/TLS certificate is in use by an instance attached
     * to the load balancer.
     * </p>
     * 
     * @param force
     *        When <code>true</code>, forces the deletion of an SSL/TLS certificate.</p>
     *        <p>
     *        There can be two certificates associated with a Lightsail load balancer: the primary and the backup. The
     *        <code>force</code> parameter is required when the primary SSL/TLS certificate is in use by an instance
     *        attached to the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteLoadBalancerTlsCertificateRequest withForce(Boolean force) {
        setForce(force);
        return this;
    }

    /**
     * <p>
     * When <code>true</code>, forces the deletion of an SSL/TLS certificate.
     * </p>
     * <p>
     * There can be two certificates associated with a Lightsail load balancer: the primary and the backup. The
     * <code>force</code> parameter is required when the primary SSL/TLS certificate is in use by an instance attached
     * to the load balancer.
     * </p>
     * 
     * @return When <code>true</code>, forces the deletion of an SSL/TLS certificate.</p>
     *         <p>
     *         There can be two certificates associated with a Lightsail load balancer: the primary and the backup. The
     *         <code>force</code> parameter is required when the primary SSL/TLS certificate is in use by an instance
     *         attached to the load balancer.
     */

    public Boolean isForce() {
        return this.force;
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
        if (getForce() != null)
            sb.append("Force: ").append(getForce());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteLoadBalancerTlsCertificateRequest == false)
            return false;
        DeleteLoadBalancerTlsCertificateRequest other = (DeleteLoadBalancerTlsCertificateRequest) obj;
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getCertificateName() == null ^ this.getCertificateName() == null)
            return false;
        if (other.getCertificateName() != null && other.getCertificateName().equals(this.getCertificateName()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode());
        hashCode = prime * hashCode + ((getCertificateName() == null) ? 0 : getCertificateName().hashCode());
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        return hashCode;
    }

    @Override
    public DeleteLoadBalancerTlsCertificateRequest clone() {
        return (DeleteLoadBalancerTlsCertificateRequest) super.clone();
    }

}
