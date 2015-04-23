/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a listener.
 * </p>
 * <p>
 * For information about the protocols and the ports supported by Elastic
 * Load Balancing, see
 * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-listener-config.html"> Listener Configurations for Elastic Load Balancing </a>
 * in the <i>Elastic Load Balancing Developer Guide</i> .
 * </p>
 */
public class Listener implements Serializable, Cloneable {

    /**
     * The load balancer transport protocol to use for routing: HTTP, HTTPS,
     * TCP, or SSL.
     */
    private String protocol;

    /**
     * The port on which the load balancer is listening: 25, 80, 443, 465,
     * 587, or 1024-65535.
     */
    private Integer loadBalancerPort;

    /**
     * The protocol to use for routing traffic to back-end instances: HTTP,
     * HTTPS, TCP, or SSL. <p>If the front-end protocol is HTTP, HTTPS, TCP,
     * or SSL, <code>InstanceProtocol</code> must be at the same protocol.
     * <p>If there is another listener with the same
     * <code>InstancePort</code> whose <code>InstanceProtocol</code> is
     * secure, (HTTPS or SSL), the listener's <code>InstanceProtocol</code>
     * must also be secure. <p>If there is another listener with the same
     * <code>InstancePort</code> whose <code>InstanceProtocol</code> is HTTP
     * or TCP, the listener's <code>InstanceProtocol</code> must be HTTP or
     * TCP.
     */
    private String instanceProtocol;

    /**
     * The port on which the instance server is listening - 25, 80, 443, 465,
     * 587, or 1024-65535.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     */
    private Integer instancePort;

    /**
     * The Amazon Resource Name (ARN) of the server certificate.
     */
    private String sSLCertificateId;

    /**
     * Default constructor for a new Listener object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public Listener() {}
    
    /**
     * Constructs a new Listener object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param protocol The load balancer transport protocol to use for
     * routing: HTTP, HTTPS, TCP, or SSL.
     * @param loadBalancerPort The port on which the load balancer is
     * listening: 25, 80, 443, 465, 587, or 1024-65535.
     * @param instancePort The port on which the instance server is listening
     * - 25, 80, 443, 465, 587, or 1024-65535.
     */
    public Listener(String protocol, Integer loadBalancerPort, Integer instancePort) {
        setProtocol(protocol);
        setLoadBalancerPort(loadBalancerPort);
        setInstancePort(instancePort);
    }

    /**
     * The load balancer transport protocol to use for routing: HTTP, HTTPS,
     * TCP, or SSL.
     *
     * @return The load balancer transport protocol to use for routing: HTTP, HTTPS,
     *         TCP, or SSL.
     */
    public String getProtocol() {
        return protocol;
    }
    
    /**
     * The load balancer transport protocol to use for routing: HTTP, HTTPS,
     * TCP, or SSL.
     *
     * @param protocol The load balancer transport protocol to use for routing: HTTP, HTTPS,
     *         TCP, or SSL.
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }
    
    /**
     * The load balancer transport protocol to use for routing: HTTP, HTTPS,
     * TCP, or SSL.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param protocol The load balancer transport protocol to use for routing: HTTP, HTTPS,
     *         TCP, or SSL.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Listener withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * The port on which the load balancer is listening: 25, 80, 443, 465,
     * 587, or 1024-65535.
     *
     * @return The port on which the load balancer is listening: 25, 80, 443, 465,
     *         587, or 1024-65535.
     */
    public Integer getLoadBalancerPort() {
        return loadBalancerPort;
    }
    
    /**
     * The port on which the load balancer is listening: 25, 80, 443, 465,
     * 587, or 1024-65535.
     *
     * @param loadBalancerPort The port on which the load balancer is listening: 25, 80, 443, 465,
     *         587, or 1024-65535.
     */
    public void setLoadBalancerPort(Integer loadBalancerPort) {
        this.loadBalancerPort = loadBalancerPort;
    }
    
    /**
     * The port on which the load balancer is listening: 25, 80, 443, 465,
     * 587, or 1024-65535.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerPort The port on which the load balancer is listening: 25, 80, 443, 465,
     *         587, or 1024-65535.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Listener withLoadBalancerPort(Integer loadBalancerPort) {
        this.loadBalancerPort = loadBalancerPort;
        return this;
    }

    /**
     * The protocol to use for routing traffic to back-end instances: HTTP,
     * HTTPS, TCP, or SSL. <p>If the front-end protocol is HTTP, HTTPS, TCP,
     * or SSL, <code>InstanceProtocol</code> must be at the same protocol.
     * <p>If there is another listener with the same
     * <code>InstancePort</code> whose <code>InstanceProtocol</code> is
     * secure, (HTTPS or SSL), the listener's <code>InstanceProtocol</code>
     * must also be secure. <p>If there is another listener with the same
     * <code>InstancePort</code> whose <code>InstanceProtocol</code> is HTTP
     * or TCP, the listener's <code>InstanceProtocol</code> must be HTTP or
     * TCP.
     *
     * @return The protocol to use for routing traffic to back-end instances: HTTP,
     *         HTTPS, TCP, or SSL. <p>If the front-end protocol is HTTP, HTTPS, TCP,
     *         or SSL, <code>InstanceProtocol</code> must be at the same protocol.
     *         <p>If there is another listener with the same
     *         <code>InstancePort</code> whose <code>InstanceProtocol</code> is
     *         secure, (HTTPS or SSL), the listener's <code>InstanceProtocol</code>
     *         must also be secure. <p>If there is another listener with the same
     *         <code>InstancePort</code> whose <code>InstanceProtocol</code> is HTTP
     *         or TCP, the listener's <code>InstanceProtocol</code> must be HTTP or
     *         TCP.
     */
    public String getInstanceProtocol() {
        return instanceProtocol;
    }
    
    /**
     * The protocol to use for routing traffic to back-end instances: HTTP,
     * HTTPS, TCP, or SSL. <p>If the front-end protocol is HTTP, HTTPS, TCP,
     * or SSL, <code>InstanceProtocol</code> must be at the same protocol.
     * <p>If there is another listener with the same
     * <code>InstancePort</code> whose <code>InstanceProtocol</code> is
     * secure, (HTTPS or SSL), the listener's <code>InstanceProtocol</code>
     * must also be secure. <p>If there is another listener with the same
     * <code>InstancePort</code> whose <code>InstanceProtocol</code> is HTTP
     * or TCP, the listener's <code>InstanceProtocol</code> must be HTTP or
     * TCP.
     *
     * @param instanceProtocol The protocol to use for routing traffic to back-end instances: HTTP,
     *         HTTPS, TCP, or SSL. <p>If the front-end protocol is HTTP, HTTPS, TCP,
     *         or SSL, <code>InstanceProtocol</code> must be at the same protocol.
     *         <p>If there is another listener with the same
     *         <code>InstancePort</code> whose <code>InstanceProtocol</code> is
     *         secure, (HTTPS or SSL), the listener's <code>InstanceProtocol</code>
     *         must also be secure. <p>If there is another listener with the same
     *         <code>InstancePort</code> whose <code>InstanceProtocol</code> is HTTP
     *         or TCP, the listener's <code>InstanceProtocol</code> must be HTTP or
     *         TCP.
     */
    public void setInstanceProtocol(String instanceProtocol) {
        this.instanceProtocol = instanceProtocol;
    }
    
    /**
     * The protocol to use for routing traffic to back-end instances: HTTP,
     * HTTPS, TCP, or SSL. <p>If the front-end protocol is HTTP, HTTPS, TCP,
     * or SSL, <code>InstanceProtocol</code> must be at the same protocol.
     * <p>If there is another listener with the same
     * <code>InstancePort</code> whose <code>InstanceProtocol</code> is
     * secure, (HTTPS or SSL), the listener's <code>InstanceProtocol</code>
     * must also be secure. <p>If there is another listener with the same
     * <code>InstancePort</code> whose <code>InstanceProtocol</code> is HTTP
     * or TCP, the listener's <code>InstanceProtocol</code> must be HTTP or
     * TCP.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceProtocol The protocol to use for routing traffic to back-end instances: HTTP,
     *         HTTPS, TCP, or SSL. <p>If the front-end protocol is HTTP, HTTPS, TCP,
     *         or SSL, <code>InstanceProtocol</code> must be at the same protocol.
     *         <p>If there is another listener with the same
     *         <code>InstancePort</code> whose <code>InstanceProtocol</code> is
     *         secure, (HTTPS or SSL), the listener's <code>InstanceProtocol</code>
     *         must also be secure. <p>If there is another listener with the same
     *         <code>InstancePort</code> whose <code>InstanceProtocol</code> is HTTP
     *         or TCP, the listener's <code>InstanceProtocol</code> must be HTTP or
     *         TCP.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Listener withInstanceProtocol(String instanceProtocol) {
        this.instanceProtocol = instanceProtocol;
        return this;
    }

    /**
     * The port on which the instance server is listening - 25, 80, 443, 465,
     * 587, or 1024-65535.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @return The port on which the instance server is listening - 25, 80, 443, 465,
     *         587, or 1024-65535.
     */
    public Integer getInstancePort() {
        return instancePort;
    }
    
    /**
     * The port on which the instance server is listening - 25, 80, 443, 465,
     * 587, or 1024-65535.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @param instancePort The port on which the instance server is listening - 25, 80, 443, 465,
     *         587, or 1024-65535.
     */
    public void setInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
    }
    
    /**
     * The port on which the instance server is listening - 25, 80, 443, 465,
     * 587, or 1024-65535.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @param instancePort The port on which the instance server is listening - 25, 80, 443, 465,
     *         587, or 1024-65535.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Listener withInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the server certificate.
     *
     * @return The Amazon Resource Name (ARN) of the server certificate.
     */
    public String getSSLCertificateId() {
        return sSLCertificateId;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the server certificate.
     *
     * @param sSLCertificateId The Amazon Resource Name (ARN) of the server certificate.
     */
    public void setSSLCertificateId(String sSLCertificateId) {
        this.sSLCertificateId = sSLCertificateId;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the server certificate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sSLCertificateId The Amazon Resource Name (ARN) of the server certificate.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Listener withSSLCertificateId(String sSLCertificateId) {
        this.sSLCertificateId = sSLCertificateId;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getProtocol() != null) sb.append("Protocol: " + getProtocol() + ",");
        if (getLoadBalancerPort() != null) sb.append("LoadBalancerPort: " + getLoadBalancerPort() + ",");
        if (getInstanceProtocol() != null) sb.append("InstanceProtocol: " + getInstanceProtocol() + ",");
        if (getInstancePort() != null) sb.append("InstancePort: " + getInstancePort() + ",");
        if (getSSLCertificateId() != null) sb.append("SSLCertificateId: " + getSSLCertificateId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode()); 
        hashCode = prime * hashCode + ((getLoadBalancerPort() == null) ? 0 : getLoadBalancerPort().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceProtocol() == null) ? 0 : getInstanceProtocol().hashCode()); 
        hashCode = prime * hashCode + ((getInstancePort() == null) ? 0 : getInstancePort().hashCode()); 
        hashCode = prime * hashCode + ((getSSLCertificateId() == null) ? 0 : getSSLCertificateId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Listener == false) return false;
        Listener other = (Listener)obj;
        
        if (other.getProtocol() == null ^ this.getProtocol() == null) return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false) return false; 
        if (other.getLoadBalancerPort() == null ^ this.getLoadBalancerPort() == null) return false;
        if (other.getLoadBalancerPort() != null && other.getLoadBalancerPort().equals(this.getLoadBalancerPort()) == false) return false; 
        if (other.getInstanceProtocol() == null ^ this.getInstanceProtocol() == null) return false;
        if (other.getInstanceProtocol() != null && other.getInstanceProtocol().equals(this.getInstanceProtocol()) == false) return false; 
        if (other.getInstancePort() == null ^ this.getInstancePort() == null) return false;
        if (other.getInstancePort() != null && other.getInstancePort().equals(this.getInstancePort()) == false) return false; 
        if (other.getSSLCertificateId() == null ^ this.getSSLCertificateId() == null) return false;
        if (other.getSSLCertificateId() != null && other.getSSLCertificateId().equals(this.getSSLCertificateId()) == false) return false; 
        return true;
    }
    
    @Override
    public Listener clone() {
        try {
            return (Listener) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    