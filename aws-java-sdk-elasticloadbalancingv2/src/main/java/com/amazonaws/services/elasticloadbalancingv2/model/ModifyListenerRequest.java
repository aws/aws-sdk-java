/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/ModifyListener"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyListenerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener.
     * </p>
     */
    private String listenerArn;
    /**
     * <p>
     * The port for connections from clients to the load balancer. You cannot specify a port for a Gateway Load
     * Balancer.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The protocol for connections from clients to the load balancer. Application Load Balancers support the HTTP and
     * HTTPS protocols. Network Load Balancers support the TCP, TLS, UDP, and TCP_UDP protocols. You can’t change the
     * protocol to UDP or TCP_UDP if dual-stack mode is enabled. You cannot specify a protocol for a Gateway Load
     * Balancer.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * [HTTPS and TLS listeners] The security policy that defines which protocols and ciphers are supported.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/application/create-https-listener.html#describe-ssl-policies"
     * >Security policies</a> in the <i>Application Load Balancers Guide</i> or <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#describe-ssl-policies"
     * >Security policies</a> in the <i>Network Load Balancers Guide</i>.
     * </p>
     */
    private String sslPolicy;
    /**
     * <p>
     * [HTTPS and TLS listeners] The default certificate for the listener. You must provide exactly one certificate. Set
     * <code>CertificateArn</code> to the certificate ARN but do not set <code>IsDefault</code>.
     * </p>
     */
    private java.util.List<Certificate> certificates;
    /**
     * <p>
     * The actions for the default rule.
     * </p>
     */
    private java.util.List<Action> defaultActions;
    /**
     * <p>
     * [TLS listeners] The name of the Application-Layer Protocol Negotiation (ALPN) policy. You can specify one policy
     * name. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HTTP1Only</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HTTP2Only</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HTTP2Optional</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HTTP2Preferred</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>None</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#alpn-policies"
     * >ALPN policies</a> in the <i>Network Load Balancers Guide</i>.
     * </p>
     */
    private java.util.List<String> alpnPolicy;

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
     * The port for connections from clients to the load balancer. You cannot specify a port for a Gateway Load
     * Balancer.
     * </p>
     * 
     * @param port
     *        The port for connections from clients to the load balancer. You cannot specify a port for a Gateway Load
     *        Balancer.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port for connections from clients to the load balancer. You cannot specify a port for a Gateway Load
     * Balancer.
     * </p>
     * 
     * @return The port for connections from clients to the load balancer. You cannot specify a port for a Gateway Load
     *         Balancer.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port for connections from clients to the load balancer. You cannot specify a port for a Gateway Load
     * Balancer.
     * </p>
     * 
     * @param port
     *        The port for connections from clients to the load balancer. You cannot specify a port for a Gateway Load
     *        Balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyListenerRequest withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The protocol for connections from clients to the load balancer. Application Load Balancers support the HTTP and
     * HTTPS protocols. Network Load Balancers support the TCP, TLS, UDP, and TCP_UDP protocols. You can’t change the
     * protocol to UDP or TCP_UDP if dual-stack mode is enabled. You cannot specify a protocol for a Gateway Load
     * Balancer.
     * </p>
     * 
     * @param protocol
     *        The protocol for connections from clients to the load balancer. Application Load Balancers support the
     *        HTTP and HTTPS protocols. Network Load Balancers support the TCP, TLS, UDP, and TCP_UDP protocols. You
     *        can’t change the protocol to UDP or TCP_UDP if dual-stack mode is enabled. You cannot specify a protocol
     *        for a Gateway Load Balancer.
     * @see ProtocolEnum
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol for connections from clients to the load balancer. Application Load Balancers support the HTTP and
     * HTTPS protocols. Network Load Balancers support the TCP, TLS, UDP, and TCP_UDP protocols. You can’t change the
     * protocol to UDP or TCP_UDP if dual-stack mode is enabled. You cannot specify a protocol for a Gateway Load
     * Balancer.
     * </p>
     * 
     * @return The protocol for connections from clients to the load balancer. Application Load Balancers support the
     *         HTTP and HTTPS protocols. Network Load Balancers support the TCP, TLS, UDP, and TCP_UDP protocols. You
     *         can’t change the protocol to UDP or TCP_UDP if dual-stack mode is enabled. You cannot specify a protocol
     *         for a Gateway Load Balancer.
     * @see ProtocolEnum
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol for connections from clients to the load balancer. Application Load Balancers support the HTTP and
     * HTTPS protocols. Network Load Balancers support the TCP, TLS, UDP, and TCP_UDP protocols. You can’t change the
     * protocol to UDP or TCP_UDP if dual-stack mode is enabled. You cannot specify a protocol for a Gateway Load
     * Balancer.
     * </p>
     * 
     * @param protocol
     *        The protocol for connections from clients to the load balancer. Application Load Balancers support the
     *        HTTP and HTTPS protocols. Network Load Balancers support the TCP, TLS, UDP, and TCP_UDP protocols. You
     *        can’t change the protocol to UDP or TCP_UDP if dual-stack mode is enabled. You cannot specify a protocol
     *        for a Gateway Load Balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtocolEnum
     */

    public ModifyListenerRequest withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The protocol for connections from clients to the load balancer. Application Load Balancers support the HTTP and
     * HTTPS protocols. Network Load Balancers support the TCP, TLS, UDP, and TCP_UDP protocols. You can’t change the
     * protocol to UDP or TCP_UDP if dual-stack mode is enabled. You cannot specify a protocol for a Gateway Load
     * Balancer.
     * </p>
     * 
     * @param protocol
     *        The protocol for connections from clients to the load balancer. Application Load Balancers support the
     *        HTTP and HTTPS protocols. Network Load Balancers support the TCP, TLS, UDP, and TCP_UDP protocols. You
     *        can’t change the protocol to UDP or TCP_UDP if dual-stack mode is enabled. You cannot specify a protocol
     *        for a Gateway Load Balancer.
     * @see ProtocolEnum
     */

    public void setProtocol(ProtocolEnum protocol) {
        withProtocol(protocol);
    }

    /**
     * <p>
     * The protocol for connections from clients to the load balancer. Application Load Balancers support the HTTP and
     * HTTPS protocols. Network Load Balancers support the TCP, TLS, UDP, and TCP_UDP protocols. You can’t change the
     * protocol to UDP or TCP_UDP if dual-stack mode is enabled. You cannot specify a protocol for a Gateway Load
     * Balancer.
     * </p>
     * 
     * @param protocol
     *        The protocol for connections from clients to the load balancer. Application Load Balancers support the
     *        HTTP and HTTPS protocols. Network Load Balancers support the TCP, TLS, UDP, and TCP_UDP protocols. You
     *        can’t change the protocol to UDP or TCP_UDP if dual-stack mode is enabled. You cannot specify a protocol
     *        for a Gateway Load Balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtocolEnum
     */

    public ModifyListenerRequest withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * [HTTPS and TLS listeners] The security policy that defines which protocols and ciphers are supported.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/application/create-https-listener.html#describe-ssl-policies"
     * >Security policies</a> in the <i>Application Load Balancers Guide</i> or <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#describe-ssl-policies"
     * >Security policies</a> in the <i>Network Load Balancers Guide</i>.
     * </p>
     * 
     * @param sslPolicy
     *        [HTTPS and TLS listeners] The security policy that defines which protocols and ciphers are supported.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/elasticloadbalancing/latest/application/create-https-listener.html#describe-ssl-policies"
     *        >Security policies</a> in the <i>Application Load Balancers Guide</i> or <a href=
     *        "https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#describe-ssl-policies"
     *        >Security policies</a> in the <i>Network Load Balancers Guide</i>.
     */

    public void setSslPolicy(String sslPolicy) {
        this.sslPolicy = sslPolicy;
    }

    /**
     * <p>
     * [HTTPS and TLS listeners] The security policy that defines which protocols and ciphers are supported.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/application/create-https-listener.html#describe-ssl-policies"
     * >Security policies</a> in the <i>Application Load Balancers Guide</i> or <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#describe-ssl-policies"
     * >Security policies</a> in the <i>Network Load Balancers Guide</i>.
     * </p>
     * 
     * @return [HTTPS and TLS listeners] The security policy that defines which protocols and ciphers are supported.</p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/elasticloadbalancing/latest/application/create-https-listener.html#describe-ssl-policies"
     *         >Security policies</a> in the <i>Application Load Balancers Guide</i> or <a href=
     *         "https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#describe-ssl-policies"
     *         >Security policies</a> in the <i>Network Load Balancers Guide</i>.
     */

    public String getSslPolicy() {
        return this.sslPolicy;
    }

    /**
     * <p>
     * [HTTPS and TLS listeners] The security policy that defines which protocols and ciphers are supported.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/application/create-https-listener.html#describe-ssl-policies"
     * >Security policies</a> in the <i>Application Load Balancers Guide</i> or <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#describe-ssl-policies"
     * >Security policies</a> in the <i>Network Load Balancers Guide</i>.
     * </p>
     * 
     * @param sslPolicy
     *        [HTTPS and TLS listeners] The security policy that defines which protocols and ciphers are supported.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/elasticloadbalancing/latest/application/create-https-listener.html#describe-ssl-policies"
     *        >Security policies</a> in the <i>Application Load Balancers Guide</i> or <a href=
     *        "https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#describe-ssl-policies"
     *        >Security policies</a> in the <i>Network Load Balancers Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyListenerRequest withSslPolicy(String sslPolicy) {
        setSslPolicy(sslPolicy);
        return this;
    }

    /**
     * <p>
     * [HTTPS and TLS listeners] The default certificate for the listener. You must provide exactly one certificate. Set
     * <code>CertificateArn</code> to the certificate ARN but do not set <code>IsDefault</code>.
     * </p>
     * 
     * @return [HTTPS and TLS listeners] The default certificate for the listener. You must provide exactly one
     *         certificate. Set <code>CertificateArn</code> to the certificate ARN but do not set <code>IsDefault</code>
     *         .
     */

    public java.util.List<Certificate> getCertificates() {
        return certificates;
    }

    /**
     * <p>
     * [HTTPS and TLS listeners] The default certificate for the listener. You must provide exactly one certificate. Set
     * <code>CertificateArn</code> to the certificate ARN but do not set <code>IsDefault</code>.
     * </p>
     * 
     * @param certificates
     *        [HTTPS and TLS listeners] The default certificate for the listener. You must provide exactly one
     *        certificate. Set <code>CertificateArn</code> to the certificate ARN but do not set <code>IsDefault</code>.
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
     * [HTTPS and TLS listeners] The default certificate for the listener. You must provide exactly one certificate. Set
     * <code>CertificateArn</code> to the certificate ARN but do not set <code>IsDefault</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCertificates(java.util.Collection)} or {@link #withCertificates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param certificates
     *        [HTTPS and TLS listeners] The default certificate for the listener. You must provide exactly one
     *        certificate. Set <code>CertificateArn</code> to the certificate ARN but do not set <code>IsDefault</code>.
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
     * [HTTPS and TLS listeners] The default certificate for the listener. You must provide exactly one certificate. Set
     * <code>CertificateArn</code> to the certificate ARN but do not set <code>IsDefault</code>.
     * </p>
     * 
     * @param certificates
     *        [HTTPS and TLS listeners] The default certificate for the listener. You must provide exactly one
     *        certificate. Set <code>CertificateArn</code> to the certificate ARN but do not set <code>IsDefault</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyListenerRequest withCertificates(java.util.Collection<Certificate> certificates) {
        setCertificates(certificates);
        return this;
    }

    /**
     * <p>
     * The actions for the default rule.
     * </p>
     * 
     * @return The actions for the default rule.
     */

    public java.util.List<Action> getDefaultActions() {
        return defaultActions;
    }

    /**
     * <p>
     * The actions for the default rule.
     * </p>
     * 
     * @param defaultActions
     *        The actions for the default rule.
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
     * The actions for the default rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDefaultActions(java.util.Collection)} or {@link #withDefaultActions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param defaultActions
     *        The actions for the default rule.
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
     * The actions for the default rule.
     * </p>
     * 
     * @param defaultActions
     *        The actions for the default rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyListenerRequest withDefaultActions(java.util.Collection<Action> defaultActions) {
        setDefaultActions(defaultActions);
        return this;
    }

    /**
     * <p>
     * [TLS listeners] The name of the Application-Layer Protocol Negotiation (ALPN) policy. You can specify one policy
     * name. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HTTP1Only</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HTTP2Only</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HTTP2Optional</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HTTP2Preferred</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>None</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#alpn-policies"
     * >ALPN policies</a> in the <i>Network Load Balancers Guide</i>.
     * </p>
     * 
     * @return [TLS listeners] The name of the Application-Layer Protocol Negotiation (ALPN) policy. You can specify one
     *         policy name. The following are the possible values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>HTTP1Only</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>HTTP2Only</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>HTTP2Optional</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>HTTP2Preferred</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>None</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#alpn-policies"
     *         >ALPN policies</a> in the <i>Network Load Balancers Guide</i>.
     */

    public java.util.List<String> getAlpnPolicy() {
        return alpnPolicy;
    }

    /**
     * <p>
     * [TLS listeners] The name of the Application-Layer Protocol Negotiation (ALPN) policy. You can specify one policy
     * name. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HTTP1Only</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HTTP2Only</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HTTP2Optional</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HTTP2Preferred</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>None</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#alpn-policies"
     * >ALPN policies</a> in the <i>Network Load Balancers Guide</i>.
     * </p>
     * 
     * @param alpnPolicy
     *        [TLS listeners] The name of the Application-Layer Protocol Negotiation (ALPN) policy. You can specify one
     *        policy name. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HTTP1Only</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HTTP2Only</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HTTP2Optional</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HTTP2Preferred</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>None</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#alpn-policies"
     *        >ALPN policies</a> in the <i>Network Load Balancers Guide</i>.
     */

    public void setAlpnPolicy(java.util.Collection<String> alpnPolicy) {
        if (alpnPolicy == null) {
            this.alpnPolicy = null;
            return;
        }

        this.alpnPolicy = new java.util.ArrayList<String>(alpnPolicy);
    }

    /**
     * <p>
     * [TLS listeners] The name of the Application-Layer Protocol Negotiation (ALPN) policy. You can specify one policy
     * name. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HTTP1Only</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HTTP2Only</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HTTP2Optional</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HTTP2Preferred</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>None</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#alpn-policies"
     * >ALPN policies</a> in the <i>Network Load Balancers Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAlpnPolicy(java.util.Collection)} or {@link #withAlpnPolicy(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param alpnPolicy
     *        [TLS listeners] The name of the Application-Layer Protocol Negotiation (ALPN) policy. You can specify one
     *        policy name. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HTTP1Only</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HTTP2Only</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HTTP2Optional</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HTTP2Preferred</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>None</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#alpn-policies"
     *        >ALPN policies</a> in the <i>Network Load Balancers Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyListenerRequest withAlpnPolicy(String... alpnPolicy) {
        if (this.alpnPolicy == null) {
            setAlpnPolicy(new java.util.ArrayList<String>(alpnPolicy.length));
        }
        for (String ele : alpnPolicy) {
            this.alpnPolicy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * [TLS listeners] The name of the Application-Layer Protocol Negotiation (ALPN) policy. You can specify one policy
     * name. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HTTP1Only</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HTTP2Only</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HTTP2Optional</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HTTP2Preferred</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>None</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#alpn-policies"
     * >ALPN policies</a> in the <i>Network Load Balancers Guide</i>.
     * </p>
     * 
     * @param alpnPolicy
     *        [TLS listeners] The name of the Application-Layer Protocol Negotiation (ALPN) policy. You can specify one
     *        policy name. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HTTP1Only</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HTTP2Only</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HTTP2Optional</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HTTP2Preferred</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>None</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#alpn-policies"
     *        >ALPN policies</a> in the <i>Network Load Balancers Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyListenerRequest withAlpnPolicy(java.util.Collection<String> alpnPolicy) {
        setAlpnPolicy(alpnPolicy);
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
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getSslPolicy() != null)
            sb.append("SslPolicy: ").append(getSslPolicy()).append(",");
        if (getCertificates() != null)
            sb.append("Certificates: ").append(getCertificates()).append(",");
        if (getDefaultActions() != null)
            sb.append("DefaultActions: ").append(getDefaultActions()).append(",");
        if (getAlpnPolicy() != null)
            sb.append("AlpnPolicy: ").append(getAlpnPolicy());
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
        if (other.getAlpnPolicy() == null ^ this.getAlpnPolicy() == null)
            return false;
        if (other.getAlpnPolicy() != null && other.getAlpnPolicy().equals(this.getAlpnPolicy()) == false)
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
        hashCode = prime * hashCode + ((getAlpnPolicy() == null) ? 0 : getAlpnPolicy().hashCode());
        return hashCode;
    }

    @Override
    public ModifyListenerRequest clone() {
        return (ModifyListenerRequest) super.clone();
    }

}
