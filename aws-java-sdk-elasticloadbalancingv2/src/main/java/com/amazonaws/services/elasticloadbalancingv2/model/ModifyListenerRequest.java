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
 * Contains the parameters for ModifyListener.
 * </p>
 */
public class ModifyListenerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener.
     * </p>
     */
    private String listenerArn;
    /**
     * <p>
     * The port for connections from clients to the load balancer.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The protocol for connections from clients to the load balancer.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The security policy that defines which ciphers and protocols are supported.
     * </p>
     */
    private String sslPolicy;
    /**
     * <p>
     * The SSL server certificate.
     * </p>
     */
    private java.util.List<Certificate> certificates;
    /**
     * <p>
     * The default actions.
     * </p>
     */
    private java.util.List<Action> defaultActions;

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

    public ModifyListenerRequest withListenerArn(String listenerArn) {
        setListenerArn(listenerArn);
        return this;
    }

    /**
     * <p>
     * The port for connections from clients to the load balancer.
     * </p>
     * 
     * @param port
     *        The port for connections from clients to the load balancer.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port for connections from clients to the load balancer.
     * </p>
     * 
     * @return The port for connections from clients to the load balancer.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port for connections from clients to the load balancer.
     * </p>
     * 
     * @param port
     *        The port for connections from clients to the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyListenerRequest withPort(Integer port) {
        setPort(port);
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

    public ModifyListenerRequest withProtocol(String protocol) {
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

    public ModifyListenerRequest withProtocol(ProtocolEnum protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The security policy that defines which ciphers and protocols are supported.
     * </p>
     * 
     * @param sslPolicy
     *        The security policy that defines which ciphers and protocols are supported.
     */

    public void setSslPolicy(String sslPolicy) {
        this.sslPolicy = sslPolicy;
    }

    /**
     * <p>
     * The security policy that defines which ciphers and protocols are supported.
     * </p>
     * 
     * @return The security policy that defines which ciphers and protocols are supported.
     */

    public String getSslPolicy() {
        return this.sslPolicy;
    }

    /**
     * <p>
     * The security policy that defines which ciphers and protocols are supported.
     * </p>
     * 
     * @param sslPolicy
     *        The security policy that defines which ciphers and protocols are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyListenerRequest withSslPolicy(String sslPolicy) {
        setSslPolicy(sslPolicy);
        return this;
    }

    /**
     * <p>
     * The SSL server certificate.
     * </p>
     * 
     * @return The SSL server certificate.
     */

    public java.util.List<Certificate> getCertificates() {
        return certificates;
    }

    /**
     * <p>
     * The SSL server certificate.
     * </p>
     * 
     * @param certificates
     *        The SSL server certificate.
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
     * The SSL server certificate.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCertificates(java.util.Collection)} or {@link #withCertificates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param certificates
     *        The SSL server certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyListenerRequest withCertificates(Certificate... certificates) {
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
     * The SSL server certificate.
     * </p>
     * 
     * @param certificates
     *        The SSL server certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyListenerRequest withCertificates(java.util.Collection<Certificate> certificates) {
        setCertificates(certificates);
        return this;
    }

    /**
     * <p>
     * The default actions.
     * </p>
     * 
     * @return The default actions.
     */

    public java.util.List<Action> getDefaultActions() {
        return defaultActions;
    }

    /**
     * <p>
     * The default actions.
     * </p>
     * 
     * @param defaultActions
     *        The default actions.
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
     * The default actions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDefaultActions(java.util.Collection)} or {@link #withDefaultActions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param defaultActions
     *        The default actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyListenerRequest withDefaultActions(Action... defaultActions) {
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
     * The default actions.
     * </p>
     * 
     * @param defaultActions
     *        The default actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyListenerRequest withDefaultActions(java.util.Collection<Action> defaultActions) {
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
        if (getListenerArn() != null)
            sb.append("ListenerArn: " + getListenerArn() + ",");
        if (getPort() != null)
            sb.append("Port: " + getPort() + ",");
        if (getProtocol() != null)
            sb.append("Protocol: " + getProtocol() + ",");
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

        if (obj instanceof ModifyListenerRequest == false)
            return false;
        ModifyListenerRequest other = (ModifyListenerRequest) obj;
        if (other.getListenerArn() == null ^ this.getListenerArn() == null)
            return false;
        if (other.getListenerArn() != null && other.getListenerArn().equals(this.getListenerArn()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
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

        hashCode = prime * hashCode + ((getListenerArn() == null) ? 0 : getListenerArn().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getSslPolicy() == null) ? 0 : getSslPolicy().hashCode());
        hashCode = prime * hashCode + ((getCertificates() == null) ? 0 : getCertificates().hashCode());
        hashCode = prime * hashCode + ((getDefaultActions() == null) ? 0 : getDefaultActions().hashCode());
        return hashCode;
    }

    @Override
    public ModifyListenerRequest clone() {
        return (ModifyListenerRequest) super.clone();
    }
}
