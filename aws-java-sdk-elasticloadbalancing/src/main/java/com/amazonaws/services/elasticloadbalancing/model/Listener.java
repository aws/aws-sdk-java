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
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about a listener.
 * </p>
 * <p>
 * For information about the protocols and the ports supported by Elastic Load Balancing, see <a
 * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-listener-config.html">Listeners for Your
 * Classic Load Balancer</a> in the <i>Classic Load Balancers Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/Listener" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Listener implements Serializable, Cloneable {

    /**
     * <p>
     * The load balancer transport protocol to use for routing: HTTP, HTTPS, TCP, or SSL.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The port on which the load balancer is listening. On EC2-VPC, you can specify any port from the range 1-65535. On
     * EC2-Classic, you can specify any port from the following list: 25, 80, 443, 465, 587, 1024-65535.
     * </p>
     */
    private Integer loadBalancerPort;
    /**
     * <p>
     * The protocol to use for routing traffic to instances: HTTP, HTTPS, TCP, or SSL.
     * </p>
     * <p>
     * If the front-end protocol is HTTP, HTTPS, TCP, or SSL, <code>InstanceProtocol</code> must be at the same
     * protocol.
     * </p>
     * <p>
     * If there is another listener with the same <code>InstancePort</code> whose <code>InstanceProtocol</code> is
     * secure, (HTTPS or SSL), the listener's <code>InstanceProtocol</code> must also be secure.
     * </p>
     * <p>
     * If there is another listener with the same <code>InstancePort</code> whose <code>InstanceProtocol</code> is HTTP
     * or TCP, the listener's <code>InstanceProtocol</code> must be HTTP or TCP.
     * </p>
     */
    private String instanceProtocol;
    /**
     * <p>
     * The port on which the instance is listening.
     * </p>
     */
    private Integer instancePort;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the server certificate.
     * </p>
     */
    private String sSLCertificateId;

    /**
     * Default constructor for Listener object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public Listener() {
    }

    /**
     * Constructs a new Listener object. Callers should use the setter or fluent setter (with...) methods to initialize
     * any additional object members.
     * 
     * @param protocol
     *        The load balancer transport protocol to use for routing: HTTP, HTTPS, TCP, or SSL.
     * @param loadBalancerPort
     *        The port on which the load balancer is listening. On EC2-VPC, you can specify any port from the range
     *        1-65535. On EC2-Classic, you can specify any port from the following list: 25, 80, 443, 465, 587,
     *        1024-65535.
     * @param instancePort
     *        The port on which the instance is listening.
     */
    public Listener(String protocol, Integer loadBalancerPort, Integer instancePort) {
        setProtocol(protocol);
        setLoadBalancerPort(loadBalancerPort);
        setInstancePort(instancePort);
    }

    /**
     * <p>
     * The load balancer transport protocol to use for routing: HTTP, HTTPS, TCP, or SSL.
     * </p>
     * 
     * @param protocol
     *        The load balancer transport protocol to use for routing: HTTP, HTTPS, TCP, or SSL.
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The load balancer transport protocol to use for routing: HTTP, HTTPS, TCP, or SSL.
     * </p>
     * 
     * @return The load balancer transport protocol to use for routing: HTTP, HTTPS, TCP, or SSL.
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The load balancer transport protocol to use for routing: HTTP, HTTPS, TCP, or SSL.
     * </p>
     * 
     * @param protocol
     *        The load balancer transport protocol to use for routing: HTTP, HTTPS, TCP, or SSL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Listener withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The port on which the load balancer is listening. On EC2-VPC, you can specify any port from the range 1-65535. On
     * EC2-Classic, you can specify any port from the following list: 25, 80, 443, 465, 587, 1024-65535.
     * </p>
     * 
     * @param loadBalancerPort
     *        The port on which the load balancer is listening. On EC2-VPC, you can specify any port from the range
     *        1-65535. On EC2-Classic, you can specify any port from the following list: 25, 80, 443, 465, 587,
     *        1024-65535.
     */

    public void setLoadBalancerPort(Integer loadBalancerPort) {
        this.loadBalancerPort = loadBalancerPort;
    }

    /**
     * <p>
     * The port on which the load balancer is listening. On EC2-VPC, you can specify any port from the range 1-65535. On
     * EC2-Classic, you can specify any port from the following list: 25, 80, 443, 465, 587, 1024-65535.
     * </p>
     * 
     * @return The port on which the load balancer is listening. On EC2-VPC, you can specify any port from the range
     *         1-65535. On EC2-Classic, you can specify any port from the following list: 25, 80, 443, 465, 587,
     *         1024-65535.
     */

    public Integer getLoadBalancerPort() {
        return this.loadBalancerPort;
    }

    /**
     * <p>
     * The port on which the load balancer is listening. On EC2-VPC, you can specify any port from the range 1-65535. On
     * EC2-Classic, you can specify any port from the following list: 25, 80, 443, 465, 587, 1024-65535.
     * </p>
     * 
     * @param loadBalancerPort
     *        The port on which the load balancer is listening. On EC2-VPC, you can specify any port from the range
     *        1-65535. On EC2-Classic, you can specify any port from the following list: 25, 80, 443, 465, 587,
     *        1024-65535.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Listener withLoadBalancerPort(Integer loadBalancerPort) {
        setLoadBalancerPort(loadBalancerPort);
        return this;
    }

    /**
     * <p>
     * The protocol to use for routing traffic to instances: HTTP, HTTPS, TCP, or SSL.
     * </p>
     * <p>
     * If the front-end protocol is HTTP, HTTPS, TCP, or SSL, <code>InstanceProtocol</code> must be at the same
     * protocol.
     * </p>
     * <p>
     * If there is another listener with the same <code>InstancePort</code> whose <code>InstanceProtocol</code> is
     * secure, (HTTPS or SSL), the listener's <code>InstanceProtocol</code> must also be secure.
     * </p>
     * <p>
     * If there is another listener with the same <code>InstancePort</code> whose <code>InstanceProtocol</code> is HTTP
     * or TCP, the listener's <code>InstanceProtocol</code> must be HTTP or TCP.
     * </p>
     * 
     * @param instanceProtocol
     *        The protocol to use for routing traffic to instances: HTTP, HTTPS, TCP, or SSL.</p>
     *        <p>
     *        If the front-end protocol is HTTP, HTTPS, TCP, or SSL, <code>InstanceProtocol</code> must be at the same
     *        protocol.
     *        </p>
     *        <p>
     *        If there is another listener with the same <code>InstancePort</code> whose <code>InstanceProtocol</code>
     *        is secure, (HTTPS or SSL), the listener's <code>InstanceProtocol</code> must also be secure.
     *        </p>
     *        <p>
     *        If there is another listener with the same <code>InstancePort</code> whose <code>InstanceProtocol</code>
     *        is HTTP or TCP, the listener's <code>InstanceProtocol</code> must be HTTP or TCP.
     */

    public void setInstanceProtocol(String instanceProtocol) {
        this.instanceProtocol = instanceProtocol;
    }

    /**
     * <p>
     * The protocol to use for routing traffic to instances: HTTP, HTTPS, TCP, or SSL.
     * </p>
     * <p>
     * If the front-end protocol is HTTP, HTTPS, TCP, or SSL, <code>InstanceProtocol</code> must be at the same
     * protocol.
     * </p>
     * <p>
     * If there is another listener with the same <code>InstancePort</code> whose <code>InstanceProtocol</code> is
     * secure, (HTTPS or SSL), the listener's <code>InstanceProtocol</code> must also be secure.
     * </p>
     * <p>
     * If there is another listener with the same <code>InstancePort</code> whose <code>InstanceProtocol</code> is HTTP
     * or TCP, the listener's <code>InstanceProtocol</code> must be HTTP or TCP.
     * </p>
     * 
     * @return The protocol to use for routing traffic to instances: HTTP, HTTPS, TCP, or SSL.</p>
     *         <p>
     *         If the front-end protocol is HTTP, HTTPS, TCP, or SSL, <code>InstanceProtocol</code> must be at the same
     *         protocol.
     *         </p>
     *         <p>
     *         If there is another listener with the same <code>InstancePort</code> whose <code>InstanceProtocol</code>
     *         is secure, (HTTPS or SSL), the listener's <code>InstanceProtocol</code> must also be secure.
     *         </p>
     *         <p>
     *         If there is another listener with the same <code>InstancePort</code> whose <code>InstanceProtocol</code>
     *         is HTTP or TCP, the listener's <code>InstanceProtocol</code> must be HTTP or TCP.
     */

    public String getInstanceProtocol() {
        return this.instanceProtocol;
    }

    /**
     * <p>
     * The protocol to use for routing traffic to instances: HTTP, HTTPS, TCP, or SSL.
     * </p>
     * <p>
     * If the front-end protocol is HTTP, HTTPS, TCP, or SSL, <code>InstanceProtocol</code> must be at the same
     * protocol.
     * </p>
     * <p>
     * If there is another listener with the same <code>InstancePort</code> whose <code>InstanceProtocol</code> is
     * secure, (HTTPS or SSL), the listener's <code>InstanceProtocol</code> must also be secure.
     * </p>
     * <p>
     * If there is another listener with the same <code>InstancePort</code> whose <code>InstanceProtocol</code> is HTTP
     * or TCP, the listener's <code>InstanceProtocol</code> must be HTTP or TCP.
     * </p>
     * 
     * @param instanceProtocol
     *        The protocol to use for routing traffic to instances: HTTP, HTTPS, TCP, or SSL.</p>
     *        <p>
     *        If the front-end protocol is HTTP, HTTPS, TCP, or SSL, <code>InstanceProtocol</code> must be at the same
     *        protocol.
     *        </p>
     *        <p>
     *        If there is another listener with the same <code>InstancePort</code> whose <code>InstanceProtocol</code>
     *        is secure, (HTTPS or SSL), the listener's <code>InstanceProtocol</code> must also be secure.
     *        </p>
     *        <p>
     *        If there is another listener with the same <code>InstancePort</code> whose <code>InstanceProtocol</code>
     *        is HTTP or TCP, the listener's <code>InstanceProtocol</code> must be HTTP or TCP.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Listener withInstanceProtocol(String instanceProtocol) {
        setInstanceProtocol(instanceProtocol);
        return this;
    }

    /**
     * <p>
     * The port on which the instance is listening.
     * </p>
     * 
     * @param instancePort
     *        The port on which the instance is listening.
     */

    public void setInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
    }

    /**
     * <p>
     * The port on which the instance is listening.
     * </p>
     * 
     * @return The port on which the instance is listening.
     */

    public Integer getInstancePort() {
        return this.instancePort;
    }

    /**
     * <p>
     * The port on which the instance is listening.
     * </p>
     * 
     * @param instancePort
     *        The port on which the instance is listening.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Listener withInstancePort(Integer instancePort) {
        setInstancePort(instancePort);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the server certificate.
     * </p>
     * 
     * @param sSLCertificateId
     *        The Amazon Resource Name (ARN) of the server certificate.
     */

    public void setSSLCertificateId(String sSLCertificateId) {
        this.sSLCertificateId = sSLCertificateId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the server certificate.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the server certificate.
     */

    public String getSSLCertificateId() {
        return this.sSLCertificateId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the server certificate.
     * </p>
     * 
     * @param sSLCertificateId
     *        The Amazon Resource Name (ARN) of the server certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Listener withSSLCertificateId(String sSLCertificateId) {
        setSSLCertificateId(sSLCertificateId);
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
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getLoadBalancerPort() != null)
            sb.append("LoadBalancerPort: ").append(getLoadBalancerPort()).append(",");
        if (getInstanceProtocol() != null)
            sb.append("InstanceProtocol: ").append(getInstanceProtocol()).append(",");
        if (getInstancePort() != null)
            sb.append("InstancePort: ").append(getInstancePort()).append(",");
        if (getSSLCertificateId() != null)
            sb.append("SSLCertificateId: ").append(getSSLCertificateId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Listener == false)
            return false;
        Listener other = (Listener) obj;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getLoadBalancerPort() == null ^ this.getLoadBalancerPort() == null)
            return false;
        if (other.getLoadBalancerPort() != null && other.getLoadBalancerPort().equals(this.getLoadBalancerPort()) == false)
            return false;
        if (other.getInstanceProtocol() == null ^ this.getInstanceProtocol() == null)
            return false;
        if (other.getInstanceProtocol() != null && other.getInstanceProtocol().equals(this.getInstanceProtocol()) == false)
            return false;
        if (other.getInstancePort() == null ^ this.getInstancePort() == null)
            return false;
        if (other.getInstancePort() != null && other.getInstancePort().equals(this.getInstancePort()) == false)
            return false;
        if (other.getSSLCertificateId() == null ^ this.getSSLCertificateId() == null)
            return false;
        if (other.getSSLCertificateId() != null && other.getSSLCertificateId().equals(this.getSSLCertificateId()) == false)
            return false;
        return true;
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
    public Listener clone() {
        try {
            return (Listener) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
