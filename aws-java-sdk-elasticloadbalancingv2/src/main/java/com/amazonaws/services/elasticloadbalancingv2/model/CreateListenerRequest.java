/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the parameters for CreateListener.
 * </p>
 */
public class CreateListenerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the load balancer.
     * </p>
     */
    private String loadBalancerArn;
    /**
     * <p>
     * The protocol for connections from clients to the load balancer.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The port on which the load balancer is listening.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The security policy that defines which ciphers and protocols are supported. The default is the current predefined
     * security policy.
     * </p>
     */
    private String sslPolicy;
    /**
     * <p>
     * The SSL server certificate. You must provide exactly one certificate if the protocol is HTTPS.
     * </p>
     */
    private java.util.List<Certificate> certificates;
    /**
     * <p>
     * The default action for the listener.
     * </p>
     */
    private java.util.List<Action> defaultActions;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the load balancer.
     * </p>
     * 
     * @param loadBalancerArn
     *        The Amazon Resource Name (ARN) of the load balancer.
     */

    public void setLoadBalancerArn(String loadBalancerArn) {
        this.loadBalancerArn = loadBalancerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the load balancer.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the load balancer.
     */

    public String getLoadBalancerArn() {
        return this.loadBalancerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the load balancer.
     * </p>
     * 
     * @param loadBalancerArn
     *        The Amazon Resource Name (ARN) of the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListenerRequest withLoadBalancerArn(String loadBalancerArn) {
        setLoadBalancerArn(loadBalancerArn);
        return this;
    }

    /**
     * <p>
     * The protocol for connections from clients to the load balancer.
     * </p>
     * 
     * @param protocol
     *        The protocol for connections from clients to the load balancer.
     * @see ProtocolEnum
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol for connections from clients to the load balancer.
     * </p>
     * 
     * @return The protocol for connections from clients to the load balancer.
     * @see ProtocolEnum
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol for connections from clients to the load balancer.
     * </p>
     * 
     * @param protocol
     *        The protocol for connections from clients to the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtocolEnum
     */

    public CreateListenerRequest withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The protocol for connections from clients to the load balancer.
     * </p>
     * 
     * @param protocol
     *        The protocol for connections from clients to the load balancer.
     * @see ProtocolEnum
     */

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol.toString();
    }

    /**
     * <p>
     * The protocol for connections from clients to the load balancer.
     * </p>
     * 
     * @param protocol
     *        The protocol for connections from clients to the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtocolEnum
     */

    public CreateListenerRequest withProtocol(ProtocolEnum protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The port on which the load balancer is listening.
     * </p>
     * 
     * @param port
     *        The port on which the load balancer is listening.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port on which the load balancer is listening.
     * </p>
     * 
     * @return The port on which the load balancer is listening.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port on which the load balancer is listening.
     * </p>
     * 
     * @param port
     *        The port on which the load balancer is listening.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListenerRequest withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The security policy that defines which ciphers and protocols are supported. The default is the current predefined
     * security policy.
     * </p>
     * 
     * @param sslPolicy
     *        The security policy that defines which ciphers and protocols are supported. The default is the current
     *        predefined security policy.
     */

    public void setSslPolicy(String sslPolicy) {
        this.sslPolicy = sslPolicy;
    }

    /**
     * <p>
     * The security policy that defines which ciphers and protocols are supported. The default is the current predefined
     * security policy.
     * </p>
     * 
     * @return The security policy that defines which ciphers and protocols are supported. The default is the current
     *         predefined security policy.
     */

    public String getSslPolicy() {
        return this.sslPolicy;
    }

    /**
     * <p>
     * The security policy that defines which ciphers and protocols are supported. The default is the current predefined
     * security policy.
     * </p>
     * 
     * @param sslPolicy
     *        The security policy that defines which ciphers and protocols are supported. The default is the current
     *        predefined security policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListenerRequest withSslPolicy(String sslPolicy) {
        setSslPolicy(sslPolicy);
        return this;
    }

    /**
     * <p>
     * The SSL server certificate. You must provide exactly one certificate if the protocol is HTTPS.
     * </p>
     * 
     * @return The SSL server certificate. You must provide exactly one certificate if the protocol is HTTPS.
     */

    public java.util.List<Certificate> getCertificates() {
        return certificates;
    }

    /**
     * <p>
     * The SSL server certificate. You must provide exactly one certificate if the protocol is HTTPS.
     * </p>
     * 
     * @param certificates
     *        The SSL server certificate. You must provide exactly one certificate if the protocol is HTTPS.
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
     * The SSL server certificate. You must provide exactly one certificate if the protocol is HTTPS.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCertificates(java.util.Collection)} or {@link #withCertificates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param certificates
     *        The SSL server certificate. You must provide exactly one certificate if the protocol is HTTPS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListenerRequest withCertificates(Certificate... certificates) {
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
     * The SSL server certificate. You must provide exactly one certificate if the protocol is HTTPS.
     * </p>
     * 
     * @param certificates
     *        The SSL server certificate. You must provide exactly one certificate if the protocol is HTTPS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListenerRequest withCertificates(java.util.Collection<Certificate> certificates) {
        setCertificates(certificates);
        return this;
    }

    /**
     * <p>
     * The default action for the listener.
     * </p>
     * 
     * @return The default action for the listener.
     */

    public java.util.List<Action> getDefaultActions() {
        return defaultActions;
    }

    /**
     * <p>
     * The default action for the listener.
     * </p>
     * 
     * @param defaultActions
     *        The default action for the listener.
     */

    public void setDefaultActions(java.util.Collection<Action> defaultActions) {
        if (defaultActions == null) {
            this.defaultActions = null;
            return;
        }

        this.defaultActions = new java.util.ArrayList<Action>(defaultActions);
    }

    /**
     * <p>
     * The default action for the listener.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDefaultActions(java.util.Collection)} or {@link #withDefaultActions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param defaultActions
     *        The default action for the listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListenerRequest withDefaultActions(Action... defaultActions) {
        if (this.defaultActions == null) {
            setDefaultActions(new java.util.ArrayList<Action>(defaultActions.length));
        }
        for (Action ele : defaultActions) {
            this.defaultActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The default action for the listener.
     * </p>
     * 
     * @param defaultActions
     *        The default action for the listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListenerRequest withDefaultActions(java.util.Collection<Action> defaultActions) {
        setDefaultActions(defaultActions);
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
        if (getLoadBalancerArn() != null)
            sb.append("LoadBalancerArn: " + getLoadBalancerArn() + ",");
        if (getProtocol() != null)
            sb.append("Protocol: " + getProtocol() + ",");
        if (getPort() != null)
            sb.append("Port: " + getPort() + ",");
        if (getSslPolicy() != null)
            sb.append("SslPolicy: " + getSslPolicy() + ",");
        if (getCertificates() != null)
            sb.append("Certificates: " + getCertificates() + ",");
        if (getDefaultActions() != null)
            sb.append("DefaultActions: " + getDefaultActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateListenerRequest == false)
            return false;
        CreateListenerRequest other = (CreateListenerRequest) obj;
        if (other.getLoadBalancerArn() == null ^ this.getLoadBalancerArn() == null)
            return false;
        if (other.getLoadBalancerArn() != null && other.getLoadBalancerArn().equals(this.getLoadBalancerArn()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getSslPolicy() == null ^ this.getSslPolicy() == null)
            return false;
        if (other.getSslPolicy() != null && other.getSslPolicy().equals(this.getSslPolicy()) == false)
            return false;
        if (other.getCertificates() == null ^ this.getCertificates() == null)
            return false;
        if (other.getCertificates() != null && other.getCertificates().equals(this.getCertificates()) == false)
            return false;
        if (other.getDefaultActions() == null ^ this.getDefaultActions() == null)
            return false;
        if (other.getDefaultActions() != null && other.getDefaultActions().equals(this.getDefaultActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoadBalancerArn() == null) ? 0 : getLoadBalancerArn().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getSslPolicy() == null) ? 0 : getSslPolicy().hashCode());
        hashCode = prime * hashCode + ((getCertificates() == null) ? 0 : getCertificates().hashCode());
        hashCode = prime * hashCode + ((getDefaultActions() == null) ? 0 : getDefaultActions().hashCode());
        return hashCode;
    }

    @Override
    public CreateListenerRequest clone() {
        return (CreateListenerRequest) super.clone();
    }
}
