/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The Listener data type.
 * </p>
 */
public class Listener implements Serializable {

    /**
     * Specifies the load balancer transport protocol to use for routing -
     * HTTP, HTTPS, TCP or SSL. This property cannot be modified for the life
     * of the load balancer.
     */
    private String protocol;

    /**
     * Specifies the external load balancer port number. This property cannot
     * be modified for the life of the load balancer.
     */
    private Integer loadBalancerPort;

    /**
     * Specifies the protocol to use for routing traffic to back-end
     * instances - HTTP, HTTPS, TCP, or SSL. This property cannot be modified
     * for the life of the load balancer. <note> If the front-end protocol is
     * HTTP or HTTPS, <code>InstanceProtocol</code> has to be at the same
     * protocol layer, i.e., HTTP or HTTPS. Likewise, if the front-end
     * protocol is TCP or SSL, InstanceProtocol has to be TCP or SSL. </note>
     * <note> If there is another listener with the same
     * <code>InstancePort</code> whose <code>InstanceProtocol</code> is
     * secure, i.e., HTTPS or SSL, the listener's
     * <code>InstanceProtocol</code> has to be secure, i.e., HTTPS or SSL. If
     * there is another listener with the same <code>InstancePort</code>
     * whose <code>InstanceProtocol</code> is HTTP or TCP, the listener's
     * <code>InstanceProtocol</code> must be either HTTP or TCP. </note>
     */
    private String instanceProtocol;

    /**
     * Specifies the TCP port on which the instance server is listening. This
     * property cannot be modified for the life of the load balancer.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     */
    private Integer instancePort;

    /**
     * The ARN string of the server certificate. To get the ARN of the server
     * certificate, call the AWS Identity and Access Management <a
     * href="http://docs.aws.amazon.com/IAM/latest/APIReference/index.html?API_UploadServerCertificate.html">UploadServerCertificate
     * </a> API.
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
     * @param protocol Specifies the load balancer transport protocol to use
     * for routing - HTTP, HTTPS, TCP or SSL. This property cannot be
     * modified for the life of the load balancer.
     * @param loadBalancerPort Specifies the external load balancer port
     * number. This property cannot be modified for the life of the load
     * balancer.
     * @param instancePort Specifies the TCP port on which the instance
     * server is listening. This property cannot be modified for the life of
     * the load balancer.
     */
    public Listener(String protocol, Integer loadBalancerPort, Integer instancePort) {
        setProtocol(protocol);
        setLoadBalancerPort(loadBalancerPort);
        setInstancePort(instancePort);
    }

    /**
     * Specifies the load balancer transport protocol to use for routing -
     * HTTP, HTTPS, TCP or SSL. This property cannot be modified for the life
     * of the load balancer.
     *
     * @return Specifies the load balancer transport protocol to use for routing -
     *         HTTP, HTTPS, TCP or SSL. This property cannot be modified for the life
     *         of the load balancer.
     */
    public String getProtocol() {
        return protocol;
    }
    
    /**
     * Specifies the load balancer transport protocol to use for routing -
     * HTTP, HTTPS, TCP or SSL. This property cannot be modified for the life
     * of the load balancer.
     *
     * @param protocol Specifies the load balancer transport protocol to use for routing -
     *         HTTP, HTTPS, TCP or SSL. This property cannot be modified for the life
     *         of the load balancer.
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }
    
    /**
     * Specifies the load balancer transport protocol to use for routing -
     * HTTP, HTTPS, TCP or SSL. This property cannot be modified for the life
     * of the load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param protocol Specifies the load balancer transport protocol to use for routing -
     *         HTTP, HTTPS, TCP or SSL. This property cannot be modified for the life
     *         of the load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Listener withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Specifies the external load balancer port number. This property cannot
     * be modified for the life of the load balancer.
     *
     * @return Specifies the external load balancer port number. This property cannot
     *         be modified for the life of the load balancer.
     */
    public Integer getLoadBalancerPort() {
        return loadBalancerPort;
    }
    
    /**
     * Specifies the external load balancer port number. This property cannot
     * be modified for the life of the load balancer.
     *
     * @param loadBalancerPort Specifies the external load balancer port number. This property cannot
     *         be modified for the life of the load balancer.
     */
    public void setLoadBalancerPort(Integer loadBalancerPort) {
        this.loadBalancerPort = loadBalancerPort;
    }
    
    /**
     * Specifies the external load balancer port number. This property cannot
     * be modified for the life of the load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerPort Specifies the external load balancer port number. This property cannot
     *         be modified for the life of the load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Listener withLoadBalancerPort(Integer loadBalancerPort) {
        this.loadBalancerPort = loadBalancerPort;
        return this;
    }

    /**
     * Specifies the protocol to use for routing traffic to back-end
     * instances - HTTP, HTTPS, TCP, or SSL. This property cannot be modified
     * for the life of the load balancer. <note> If the front-end protocol is
     * HTTP or HTTPS, <code>InstanceProtocol</code> has to be at the same
     * protocol layer, i.e., HTTP or HTTPS. Likewise, if the front-end
     * protocol is TCP or SSL, InstanceProtocol has to be TCP or SSL. </note>
     * <note> If there is another listener with the same
     * <code>InstancePort</code> whose <code>InstanceProtocol</code> is
     * secure, i.e., HTTPS or SSL, the listener's
     * <code>InstanceProtocol</code> has to be secure, i.e., HTTPS or SSL. If
     * there is another listener with the same <code>InstancePort</code>
     * whose <code>InstanceProtocol</code> is HTTP or TCP, the listener's
     * <code>InstanceProtocol</code> must be either HTTP or TCP. </note>
     *
     * @return Specifies the protocol to use for routing traffic to back-end
     *         instances - HTTP, HTTPS, TCP, or SSL. This property cannot be modified
     *         for the life of the load balancer. <note> If the front-end protocol is
     *         HTTP or HTTPS, <code>InstanceProtocol</code> has to be at the same
     *         protocol layer, i.e., HTTP or HTTPS. Likewise, if the front-end
     *         protocol is TCP or SSL, InstanceProtocol has to be TCP or SSL. </note>
     *         <note> If there is another listener with the same
     *         <code>InstancePort</code> whose <code>InstanceProtocol</code> is
     *         secure, i.e., HTTPS or SSL, the listener's
     *         <code>InstanceProtocol</code> has to be secure, i.e., HTTPS or SSL. If
     *         there is another listener with the same <code>InstancePort</code>
     *         whose <code>InstanceProtocol</code> is HTTP or TCP, the listener's
     *         <code>InstanceProtocol</code> must be either HTTP or TCP. </note>
     */
    public String getInstanceProtocol() {
        return instanceProtocol;
    }
    
    /**
     * Specifies the protocol to use for routing traffic to back-end
     * instances - HTTP, HTTPS, TCP, or SSL. This property cannot be modified
     * for the life of the load balancer. <note> If the front-end protocol is
     * HTTP or HTTPS, <code>InstanceProtocol</code> has to be at the same
     * protocol layer, i.e., HTTP or HTTPS. Likewise, if the front-end
     * protocol is TCP or SSL, InstanceProtocol has to be TCP or SSL. </note>
     * <note> If there is another listener with the same
     * <code>InstancePort</code> whose <code>InstanceProtocol</code> is
     * secure, i.e., HTTPS or SSL, the listener's
     * <code>InstanceProtocol</code> has to be secure, i.e., HTTPS or SSL. If
     * there is another listener with the same <code>InstancePort</code>
     * whose <code>InstanceProtocol</code> is HTTP or TCP, the listener's
     * <code>InstanceProtocol</code> must be either HTTP or TCP. </note>
     *
     * @param instanceProtocol Specifies the protocol to use for routing traffic to back-end
     *         instances - HTTP, HTTPS, TCP, or SSL. This property cannot be modified
     *         for the life of the load balancer. <note> If the front-end protocol is
     *         HTTP or HTTPS, <code>InstanceProtocol</code> has to be at the same
     *         protocol layer, i.e., HTTP or HTTPS. Likewise, if the front-end
     *         protocol is TCP or SSL, InstanceProtocol has to be TCP or SSL. </note>
     *         <note> If there is another listener with the same
     *         <code>InstancePort</code> whose <code>InstanceProtocol</code> is
     *         secure, i.e., HTTPS or SSL, the listener's
     *         <code>InstanceProtocol</code> has to be secure, i.e., HTTPS or SSL. If
     *         there is another listener with the same <code>InstancePort</code>
     *         whose <code>InstanceProtocol</code> is HTTP or TCP, the listener's
     *         <code>InstanceProtocol</code> must be either HTTP or TCP. </note>
     */
    public void setInstanceProtocol(String instanceProtocol) {
        this.instanceProtocol = instanceProtocol;
    }
    
    /**
     * Specifies the protocol to use for routing traffic to back-end
     * instances - HTTP, HTTPS, TCP, or SSL. This property cannot be modified
     * for the life of the load balancer. <note> If the front-end protocol is
     * HTTP or HTTPS, <code>InstanceProtocol</code> has to be at the same
     * protocol layer, i.e., HTTP or HTTPS. Likewise, if the front-end
     * protocol is TCP or SSL, InstanceProtocol has to be TCP or SSL. </note>
     * <note> If there is another listener with the same
     * <code>InstancePort</code> whose <code>InstanceProtocol</code> is
     * secure, i.e., HTTPS or SSL, the listener's
     * <code>InstanceProtocol</code> has to be secure, i.e., HTTPS or SSL. If
     * there is another listener with the same <code>InstancePort</code>
     * whose <code>InstanceProtocol</code> is HTTP or TCP, the listener's
     * <code>InstanceProtocol</code> must be either HTTP or TCP. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceProtocol Specifies the protocol to use for routing traffic to back-end
     *         instances - HTTP, HTTPS, TCP, or SSL. This property cannot be modified
     *         for the life of the load balancer. <note> If the front-end protocol is
     *         HTTP or HTTPS, <code>InstanceProtocol</code> has to be at the same
     *         protocol layer, i.e., HTTP or HTTPS. Likewise, if the front-end
     *         protocol is TCP or SSL, InstanceProtocol has to be TCP or SSL. </note>
     *         <note> If there is another listener with the same
     *         <code>InstancePort</code> whose <code>InstanceProtocol</code> is
     *         secure, i.e., HTTPS or SSL, the listener's
     *         <code>InstanceProtocol</code> has to be secure, i.e., HTTPS or SSL. If
     *         there is another listener with the same <code>InstancePort</code>
     *         whose <code>InstanceProtocol</code> is HTTP or TCP, the listener's
     *         <code>InstanceProtocol</code> must be either HTTP or TCP. </note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Listener withInstanceProtocol(String instanceProtocol) {
        this.instanceProtocol = instanceProtocol;
        return this;
    }

    /**
     * Specifies the TCP port on which the instance server is listening. This
     * property cannot be modified for the life of the load balancer.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @return Specifies the TCP port on which the instance server is listening. This
     *         property cannot be modified for the life of the load balancer.
     */
    public Integer getInstancePort() {
        return instancePort;
    }
    
    /**
     * Specifies the TCP port on which the instance server is listening. This
     * property cannot be modified for the life of the load balancer.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @param instancePort Specifies the TCP port on which the instance server is listening. This
     *         property cannot be modified for the life of the load balancer.
     */
    public void setInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
    }
    
    /**
     * Specifies the TCP port on which the instance server is listening. This
     * property cannot be modified for the life of the load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @param instancePort Specifies the TCP port on which the instance server is listening. This
     *         property cannot be modified for the life of the load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Listener withInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
        return this;
    }

    /**
     * The ARN string of the server certificate. To get the ARN of the server
     * certificate, call the AWS Identity and Access Management <a
     * href="http://docs.aws.amazon.com/IAM/latest/APIReference/index.html?API_UploadServerCertificate.html">UploadServerCertificate
     * </a> API.
     *
     * @return The ARN string of the server certificate. To get the ARN of the server
     *         certificate, call the AWS Identity and Access Management <a
     *         href="http://docs.aws.amazon.com/IAM/latest/APIReference/index.html?API_UploadServerCertificate.html">UploadServerCertificate
     *         </a> API.
     */
    public String getSSLCertificateId() {
        return sSLCertificateId;
    }
    
    /**
     * The ARN string of the server certificate. To get the ARN of the server
     * certificate, call the AWS Identity and Access Management <a
     * href="http://docs.aws.amazon.com/IAM/latest/APIReference/index.html?API_UploadServerCertificate.html">UploadServerCertificate
     * </a> API.
     *
     * @param sSLCertificateId The ARN string of the server certificate. To get the ARN of the server
     *         certificate, call the AWS Identity and Access Management <a
     *         href="http://docs.aws.amazon.com/IAM/latest/APIReference/index.html?API_UploadServerCertificate.html">UploadServerCertificate
     *         </a> API.
     */
    public void setSSLCertificateId(String sSLCertificateId) {
        this.sSLCertificateId = sSLCertificateId;
    }
    
    /**
     * The ARN string of the server certificate. To get the ARN of the server
     * certificate, call the AWS Identity and Access Management <a
     * href="http://docs.aws.amazon.com/IAM/latest/APIReference/index.html?API_UploadServerCertificate.html">UploadServerCertificate
     * </a> API.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sSLCertificateId The ARN string of the server certificate. To get the ARN of the server
     *         certificate, call the AWS Identity and Access Management <a
     *         href="http://docs.aws.amazon.com/IAM/latest/APIReference/index.html?API_UploadServerCertificate.html">UploadServerCertificate
     *         </a> API.
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
    
}
    