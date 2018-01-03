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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateLoadBalancer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLoadBalancerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of your load balancer.
     * </p>
     */
    private String loadBalancerName;
    /**
     * <p>
     * The instance port where you're creating your load balancer.
     * </p>
     */
    private Integer instancePort;
    /**
     * <p>
     * The path you provided to perform the load balancer health check. If you didn't specify a health check path,
     * Lightsail uses the root path of your website (e.g., <code>"/"</code>).
     * </p>
     */
    private String healthCheckPath;
    /**
     * <p>
     * The name of the TLS/SSL certificate.
     * </p>
     * <p>
     * If you specify <code>certificateName</code>, then <code>certificateDomainName</code> is required (and
     * vice-versa).
     * </p>
     */
    private String certificateName;
    /**
     * <p>
     * The domain name with which your certificate is associated (e.g., <code>example.com</code>).
     * </p>
     * <p>
     * If you specify <code>certificateDomainName</code>, then <code>certificateName</code> is required (and
     * vice-versa).
     * </p>
     */
    private String certificateDomainName;
    /**
     * <p>
     * The alternative domain names to use with your TLS/SSL certificate (e.g., <code>www.example.com</code>,
     * <code>www.ejemplo.com</code>, <code>ejemplo.com</code>).
     * </p>
     */
    private java.util.List<String> certificateAlternativeNames;

    /**
     * <p>
     * The name of your load balancer.
     * </p>
     * 
     * @param loadBalancerName
     *        The name of your load balancer.
     */

    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    /**
     * <p>
     * The name of your load balancer.
     * </p>
     * 
     * @return The name of your load balancer.
     */

    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * <p>
     * The name of your load balancer.
     * </p>
     * 
     * @param loadBalancerName
     *        The name of your load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerRequest withLoadBalancerName(String loadBalancerName) {
        setLoadBalancerName(loadBalancerName);
        return this;
    }

    /**
     * <p>
     * The instance port where you're creating your load balancer.
     * </p>
     * 
     * @param instancePort
     *        The instance port where you're creating your load balancer.
     */

    public void setInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
    }

    /**
     * <p>
     * The instance port where you're creating your load balancer.
     * </p>
     * 
     * @return The instance port where you're creating your load balancer.
     */

    public Integer getInstancePort() {
        return this.instancePort;
    }

    /**
     * <p>
     * The instance port where you're creating your load balancer.
     * </p>
     * 
     * @param instancePort
     *        The instance port where you're creating your load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerRequest withInstancePort(Integer instancePort) {
        setInstancePort(instancePort);
        return this;
    }

    /**
     * <p>
     * The path you provided to perform the load balancer health check. If you didn't specify a health check path,
     * Lightsail uses the root path of your website (e.g., <code>"/"</code>).
     * </p>
     * 
     * @param healthCheckPath
     *        The path you provided to perform the load balancer health check. If you didn't specify a health check
     *        path, Lightsail uses the root path of your website (e.g., <code>"/"</code>).
     */

    public void setHealthCheckPath(String healthCheckPath) {
        this.healthCheckPath = healthCheckPath;
    }

    /**
     * <p>
     * The path you provided to perform the load balancer health check. If you didn't specify a health check path,
     * Lightsail uses the root path of your website (e.g., <code>"/"</code>).
     * </p>
     * 
     * @return The path you provided to perform the load balancer health check. If you didn't specify a health check
     *         path, Lightsail uses the root path of your website (e.g., <code>"/"</code>).
     */

    public String getHealthCheckPath() {
        return this.healthCheckPath;
    }

    /**
     * <p>
     * The path you provided to perform the load balancer health check. If you didn't specify a health check path,
     * Lightsail uses the root path of your website (e.g., <code>"/"</code>).
     * </p>
     * 
     * @param healthCheckPath
     *        The path you provided to perform the load balancer health check. If you didn't specify a health check
     *        path, Lightsail uses the root path of your website (e.g., <code>"/"</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerRequest withHealthCheckPath(String healthCheckPath) {
        setHealthCheckPath(healthCheckPath);
        return this;
    }

    /**
     * <p>
     * The name of the TLS/SSL certificate.
     * </p>
     * <p>
     * If you specify <code>certificateName</code>, then <code>certificateDomainName</code> is required (and
     * vice-versa).
     * </p>
     * 
     * @param certificateName
     *        The name of the TLS/SSL certificate.</p>
     *        <p>
     *        If you specify <code>certificateName</code>, then <code>certificateDomainName</code> is required (and
     *        vice-versa).
     */

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    /**
     * <p>
     * The name of the TLS/SSL certificate.
     * </p>
     * <p>
     * If you specify <code>certificateName</code>, then <code>certificateDomainName</code> is required (and
     * vice-versa).
     * </p>
     * 
     * @return The name of the TLS/SSL certificate.</p>
     *         <p>
     *         If you specify <code>certificateName</code>, then <code>certificateDomainName</code> is required (and
     *         vice-versa).
     */

    public String getCertificateName() {
        return this.certificateName;
    }

    /**
     * <p>
     * The name of the TLS/SSL certificate.
     * </p>
     * <p>
     * If you specify <code>certificateName</code>, then <code>certificateDomainName</code> is required (and
     * vice-versa).
     * </p>
     * 
     * @param certificateName
     *        The name of the TLS/SSL certificate.</p>
     *        <p>
     *        If you specify <code>certificateName</code>, then <code>certificateDomainName</code> is required (and
     *        vice-versa).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerRequest withCertificateName(String certificateName) {
        setCertificateName(certificateName);
        return this;
    }

    /**
     * <p>
     * The domain name with which your certificate is associated (e.g., <code>example.com</code>).
     * </p>
     * <p>
     * If you specify <code>certificateDomainName</code>, then <code>certificateName</code> is required (and
     * vice-versa).
     * </p>
     * 
     * @param certificateDomainName
     *        The domain name with which your certificate is associated (e.g., <code>example.com</code>).</p>
     *        <p>
     *        If you specify <code>certificateDomainName</code>, then <code>certificateName</code> is required (and
     *        vice-versa).
     */

    public void setCertificateDomainName(String certificateDomainName) {
        this.certificateDomainName = certificateDomainName;
    }

    /**
     * <p>
     * The domain name with which your certificate is associated (e.g., <code>example.com</code>).
     * </p>
     * <p>
     * If you specify <code>certificateDomainName</code>, then <code>certificateName</code> is required (and
     * vice-versa).
     * </p>
     * 
     * @return The domain name with which your certificate is associated (e.g., <code>example.com</code>).</p>
     *         <p>
     *         If you specify <code>certificateDomainName</code>, then <code>certificateName</code> is required (and
     *         vice-versa).
     */

    public String getCertificateDomainName() {
        return this.certificateDomainName;
    }

    /**
     * <p>
     * The domain name with which your certificate is associated (e.g., <code>example.com</code>).
     * </p>
     * <p>
     * If you specify <code>certificateDomainName</code>, then <code>certificateName</code> is required (and
     * vice-versa).
     * </p>
     * 
     * @param certificateDomainName
     *        The domain name with which your certificate is associated (e.g., <code>example.com</code>).</p>
     *        <p>
     *        If you specify <code>certificateDomainName</code>, then <code>certificateName</code> is required (and
     *        vice-versa).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerRequest withCertificateDomainName(String certificateDomainName) {
        setCertificateDomainName(certificateDomainName);
        return this;
    }

    /**
     * <p>
     * The alternative domain names to use with your TLS/SSL certificate (e.g., <code>www.example.com</code>,
     * <code>www.ejemplo.com</code>, <code>ejemplo.com</code>).
     * </p>
     * 
     * @return The alternative domain names to use with your TLS/SSL certificate (e.g., <code>www.example.com</code>,
     *         <code>www.ejemplo.com</code>, <code>ejemplo.com</code>).
     */

    public java.util.List<String> getCertificateAlternativeNames() {
        return certificateAlternativeNames;
    }

    /**
     * <p>
     * The alternative domain names to use with your TLS/SSL certificate (e.g., <code>www.example.com</code>,
     * <code>www.ejemplo.com</code>, <code>ejemplo.com</code>).
     * </p>
     * 
     * @param certificateAlternativeNames
     *        The alternative domain names to use with your TLS/SSL certificate (e.g., <code>www.example.com</code>,
     *        <code>www.ejemplo.com</code>, <code>ejemplo.com</code>).
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
     * The alternative domain names to use with your TLS/SSL certificate (e.g., <code>www.example.com</code>,
     * <code>www.ejemplo.com</code>, <code>ejemplo.com</code>).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCertificateAlternativeNames(java.util.Collection)} or
     * {@link #withCertificateAlternativeNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param certificateAlternativeNames
     *        The alternative domain names to use with your TLS/SSL certificate (e.g., <code>www.example.com</code>,
     *        <code>www.ejemplo.com</code>, <code>ejemplo.com</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerRequest withCertificateAlternativeNames(String... certificateAlternativeNames) {
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
     * The alternative domain names to use with your TLS/SSL certificate (e.g., <code>www.example.com</code>,
     * <code>www.ejemplo.com</code>, <code>ejemplo.com</code>).
     * </p>
     * 
     * @param certificateAlternativeNames
     *        The alternative domain names to use with your TLS/SSL certificate (e.g., <code>www.example.com</code>,
     *        <code>www.ejemplo.com</code>, <code>ejemplo.com</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerRequest withCertificateAlternativeNames(java.util.Collection<String> certificateAlternativeNames) {
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
        if (getInstancePort() != null)
            sb.append("InstancePort: ").append(getInstancePort()).append(",");
        if (getHealthCheckPath() != null)
            sb.append("HealthCheckPath: ").append(getHealthCheckPath()).append(",");
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

        if (obj instanceof CreateLoadBalancerRequest == false)
            return false;
        CreateLoadBalancerRequest other = (CreateLoadBalancerRequest) obj;
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getInstancePort() == null ^ this.getInstancePort() == null)
            return false;
        if (other.getInstancePort() != null && other.getInstancePort().equals(this.getInstancePort()) == false)
            return false;
        if (other.getHealthCheckPath() == null ^ this.getHealthCheckPath() == null)
            return false;
        if (other.getHealthCheckPath() != null && other.getHealthCheckPath().equals(this.getHealthCheckPath()) == false)
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
        hashCode = prime * hashCode + ((getInstancePort() == null) ? 0 : getInstancePort().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckPath() == null) ? 0 : getHealthCheckPath().hashCode());
        hashCode = prime * hashCode + ((getCertificateName() == null) ? 0 : getCertificateName().hashCode());
        hashCode = prime * hashCode + ((getCertificateDomainName() == null) ? 0 : getCertificateDomainName().hashCode());
        hashCode = prime * hashCode + ((getCertificateAlternativeNames() == null) ? 0 : getCertificateAlternativeNames().hashCode());
        return hashCode;
    }

    @Override
    public CreateLoadBalancerRequest clone() {
        return (CreateLoadBalancerRequest) super.clone();
    }

}
