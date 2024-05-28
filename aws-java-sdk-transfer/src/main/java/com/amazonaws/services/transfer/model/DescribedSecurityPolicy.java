/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the properties of a security policy that you specify. For more information about security policies, see <a
 * href="https://docs.aws.amazon.com/transfer/latest/userguide/security-policies.html">Working with security policies
 * for servers</a> or <a
 * href="https://docs.aws.amazon.com/transfer/latest/userguide/security-policies-connectors.html">Working with security
 * policies for SFTP connectors</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribedSecurityPolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribedSecurityPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether this policy enables Federal Information Processing Standards (FIPS). This parameter applies to
     * both server and connector security policies.
     * </p>
     */
    private Boolean fips;
    /**
     * <p>
     * The text name of the specified security policy.
     * </p>
     */
    private String securityPolicyName;
    /**
     * <p>
     * Lists the enabled Secure Shell (SSH) cipher encryption algorithms in the security policy that is attached to the
     * server or connector. This parameter applies to both server and connector security policies.
     * </p>
     */
    private java.util.List<String> sshCiphers;
    /**
     * <p>
     * Lists the enabled SSH key exchange (KEX) encryption algorithms in the security policy that is attached to the
     * server or connector. This parameter applies to both server and connector security policies.
     * </p>
     */
    private java.util.List<String> sshKexs;
    /**
     * <p>
     * Lists the enabled SSH message authentication code (MAC) encryption algorithms in the security policy that is
     * attached to the server or connector. This parameter applies to both server and connector security policies.
     * </p>
     */
    private java.util.List<String> sshMacs;
    /**
     * <p>
     * Lists the enabled Transport Layer Security (TLS) cipher encryption algorithms in the security policy that is
     * attached to the server.
     * </p>
     * <note>
     * <p>
     * This parameter only applies to security policies for servers.
     * </p>
     * </note>
     */
    private java.util.List<String> tlsCiphers;
    /**
     * <p>
     * Lists the host key algorithms for the security policy.
     * </p>
     * <note>
     * <p>
     * This parameter only applies to security policies for connectors.
     * </p>
     * </note>
     */
    private java.util.List<String> sshHostKeyAlgorithms;
    /**
     * <p>
     * The resource type to which the security policy applies, either server or connector.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Lists the file transfer protocols that the security policy applies to.
     * </p>
     */
    private java.util.List<String> protocols;

    /**
     * <p>
     * Specifies whether this policy enables Federal Information Processing Standards (FIPS). This parameter applies to
     * both server and connector security policies.
     * </p>
     * 
     * @param fips
     *        Specifies whether this policy enables Federal Information Processing Standards (FIPS). This parameter
     *        applies to both server and connector security policies.
     */

    public void setFips(Boolean fips) {
        this.fips = fips;
    }

    /**
     * <p>
     * Specifies whether this policy enables Federal Information Processing Standards (FIPS). This parameter applies to
     * both server and connector security policies.
     * </p>
     * 
     * @return Specifies whether this policy enables Federal Information Processing Standards (FIPS). This parameter
     *         applies to both server and connector security policies.
     */

    public Boolean getFips() {
        return this.fips;
    }

    /**
     * <p>
     * Specifies whether this policy enables Federal Information Processing Standards (FIPS). This parameter applies to
     * both server and connector security policies.
     * </p>
     * 
     * @param fips
     *        Specifies whether this policy enables Federal Information Processing Standards (FIPS). This parameter
     *        applies to both server and connector security policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedSecurityPolicy withFips(Boolean fips) {
        setFips(fips);
        return this;
    }

    /**
     * <p>
     * Specifies whether this policy enables Federal Information Processing Standards (FIPS). This parameter applies to
     * both server and connector security policies.
     * </p>
     * 
     * @return Specifies whether this policy enables Federal Information Processing Standards (FIPS). This parameter
     *         applies to both server and connector security policies.
     */

    public Boolean isFips() {
        return this.fips;
    }

    /**
     * <p>
     * The text name of the specified security policy.
     * </p>
     * 
     * @param securityPolicyName
     *        The text name of the specified security policy.
     */

    public void setSecurityPolicyName(String securityPolicyName) {
        this.securityPolicyName = securityPolicyName;
    }

    /**
     * <p>
     * The text name of the specified security policy.
     * </p>
     * 
     * @return The text name of the specified security policy.
     */

    public String getSecurityPolicyName() {
        return this.securityPolicyName;
    }

    /**
     * <p>
     * The text name of the specified security policy.
     * </p>
     * 
     * @param securityPolicyName
     *        The text name of the specified security policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedSecurityPolicy withSecurityPolicyName(String securityPolicyName) {
        setSecurityPolicyName(securityPolicyName);
        return this;
    }

    /**
     * <p>
     * Lists the enabled Secure Shell (SSH) cipher encryption algorithms in the security policy that is attached to the
     * server or connector. This parameter applies to both server and connector security policies.
     * </p>
     * 
     * @return Lists the enabled Secure Shell (SSH) cipher encryption algorithms in the security policy that is attached
     *         to the server or connector. This parameter applies to both server and connector security policies.
     */

    public java.util.List<String> getSshCiphers() {
        return sshCiphers;
    }

    /**
     * <p>
     * Lists the enabled Secure Shell (SSH) cipher encryption algorithms in the security policy that is attached to the
     * server or connector. This parameter applies to both server and connector security policies.
     * </p>
     * 
     * @param sshCiphers
     *        Lists the enabled Secure Shell (SSH) cipher encryption algorithms in the security policy that is attached
     *        to the server or connector. This parameter applies to both server and connector security policies.
     */

    public void setSshCiphers(java.util.Collection<String> sshCiphers) {
        if (sshCiphers == null) {
            this.sshCiphers = null;
            return;
        }

        this.sshCiphers = new java.util.ArrayList<String>(sshCiphers);
    }

    /**
     * <p>
     * Lists the enabled Secure Shell (SSH) cipher encryption algorithms in the security policy that is attached to the
     * server or connector. This parameter applies to both server and connector security policies.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSshCiphers(java.util.Collection)} or {@link #withSshCiphers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sshCiphers
     *        Lists the enabled Secure Shell (SSH) cipher encryption algorithms in the security policy that is attached
     *        to the server or connector. This parameter applies to both server and connector security policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedSecurityPolicy withSshCiphers(String... sshCiphers) {
        if (this.sshCiphers == null) {
            setSshCiphers(new java.util.ArrayList<String>(sshCiphers.length));
        }
        for (String ele : sshCiphers) {
            this.sshCiphers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists the enabled Secure Shell (SSH) cipher encryption algorithms in the security policy that is attached to the
     * server or connector. This parameter applies to both server and connector security policies.
     * </p>
     * 
     * @param sshCiphers
     *        Lists the enabled Secure Shell (SSH) cipher encryption algorithms in the security policy that is attached
     *        to the server or connector. This parameter applies to both server and connector security policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedSecurityPolicy withSshCiphers(java.util.Collection<String> sshCiphers) {
        setSshCiphers(sshCiphers);
        return this;
    }

    /**
     * <p>
     * Lists the enabled SSH key exchange (KEX) encryption algorithms in the security policy that is attached to the
     * server or connector. This parameter applies to both server and connector security policies.
     * </p>
     * 
     * @return Lists the enabled SSH key exchange (KEX) encryption algorithms in the security policy that is attached to
     *         the server or connector. This parameter applies to both server and connector security policies.
     */

    public java.util.List<String> getSshKexs() {
        return sshKexs;
    }

    /**
     * <p>
     * Lists the enabled SSH key exchange (KEX) encryption algorithms in the security policy that is attached to the
     * server or connector. This parameter applies to both server and connector security policies.
     * </p>
     * 
     * @param sshKexs
     *        Lists the enabled SSH key exchange (KEX) encryption algorithms in the security policy that is attached to
     *        the server or connector. This parameter applies to both server and connector security policies.
     */

    public void setSshKexs(java.util.Collection<String> sshKexs) {
        if (sshKexs == null) {
            this.sshKexs = null;
            return;
        }

        this.sshKexs = new java.util.ArrayList<String>(sshKexs);
    }

    /**
     * <p>
     * Lists the enabled SSH key exchange (KEX) encryption algorithms in the security policy that is attached to the
     * server or connector. This parameter applies to both server and connector security policies.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSshKexs(java.util.Collection)} or {@link #withSshKexs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sshKexs
     *        Lists the enabled SSH key exchange (KEX) encryption algorithms in the security policy that is attached to
     *        the server or connector. This parameter applies to both server and connector security policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedSecurityPolicy withSshKexs(String... sshKexs) {
        if (this.sshKexs == null) {
            setSshKexs(new java.util.ArrayList<String>(sshKexs.length));
        }
        for (String ele : sshKexs) {
            this.sshKexs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists the enabled SSH key exchange (KEX) encryption algorithms in the security policy that is attached to the
     * server or connector. This parameter applies to both server and connector security policies.
     * </p>
     * 
     * @param sshKexs
     *        Lists the enabled SSH key exchange (KEX) encryption algorithms in the security policy that is attached to
     *        the server or connector. This parameter applies to both server and connector security policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedSecurityPolicy withSshKexs(java.util.Collection<String> sshKexs) {
        setSshKexs(sshKexs);
        return this;
    }

    /**
     * <p>
     * Lists the enabled SSH message authentication code (MAC) encryption algorithms in the security policy that is
     * attached to the server or connector. This parameter applies to both server and connector security policies.
     * </p>
     * 
     * @return Lists the enabled SSH message authentication code (MAC) encryption algorithms in the security policy that
     *         is attached to the server or connector. This parameter applies to both server and connector security
     *         policies.
     */

    public java.util.List<String> getSshMacs() {
        return sshMacs;
    }

    /**
     * <p>
     * Lists the enabled SSH message authentication code (MAC) encryption algorithms in the security policy that is
     * attached to the server or connector. This parameter applies to both server and connector security policies.
     * </p>
     * 
     * @param sshMacs
     *        Lists the enabled SSH message authentication code (MAC) encryption algorithms in the security policy that
     *        is attached to the server or connector. This parameter applies to both server and connector security
     *        policies.
     */

    public void setSshMacs(java.util.Collection<String> sshMacs) {
        if (sshMacs == null) {
            this.sshMacs = null;
            return;
        }

        this.sshMacs = new java.util.ArrayList<String>(sshMacs);
    }

    /**
     * <p>
     * Lists the enabled SSH message authentication code (MAC) encryption algorithms in the security policy that is
     * attached to the server or connector. This parameter applies to both server and connector security policies.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSshMacs(java.util.Collection)} or {@link #withSshMacs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sshMacs
     *        Lists the enabled SSH message authentication code (MAC) encryption algorithms in the security policy that
     *        is attached to the server or connector. This parameter applies to both server and connector security
     *        policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedSecurityPolicy withSshMacs(String... sshMacs) {
        if (this.sshMacs == null) {
            setSshMacs(new java.util.ArrayList<String>(sshMacs.length));
        }
        for (String ele : sshMacs) {
            this.sshMacs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists the enabled SSH message authentication code (MAC) encryption algorithms in the security policy that is
     * attached to the server or connector. This parameter applies to both server and connector security policies.
     * </p>
     * 
     * @param sshMacs
     *        Lists the enabled SSH message authentication code (MAC) encryption algorithms in the security policy that
     *        is attached to the server or connector. This parameter applies to both server and connector security
     *        policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedSecurityPolicy withSshMacs(java.util.Collection<String> sshMacs) {
        setSshMacs(sshMacs);
        return this;
    }

    /**
     * <p>
     * Lists the enabled Transport Layer Security (TLS) cipher encryption algorithms in the security policy that is
     * attached to the server.
     * </p>
     * <note>
     * <p>
     * This parameter only applies to security policies for servers.
     * </p>
     * </note>
     * 
     * @return Lists the enabled Transport Layer Security (TLS) cipher encryption algorithms in the security policy that
     *         is attached to the server.</p> <note>
     *         <p>
     *         This parameter only applies to security policies for servers.
     *         </p>
     */

    public java.util.List<String> getTlsCiphers() {
        return tlsCiphers;
    }

    /**
     * <p>
     * Lists the enabled Transport Layer Security (TLS) cipher encryption algorithms in the security policy that is
     * attached to the server.
     * </p>
     * <note>
     * <p>
     * This parameter only applies to security policies for servers.
     * </p>
     * </note>
     * 
     * @param tlsCiphers
     *        Lists the enabled Transport Layer Security (TLS) cipher encryption algorithms in the security policy that
     *        is attached to the server.</p> <note>
     *        <p>
     *        This parameter only applies to security policies for servers.
     *        </p>
     */

    public void setTlsCiphers(java.util.Collection<String> tlsCiphers) {
        if (tlsCiphers == null) {
            this.tlsCiphers = null;
            return;
        }

        this.tlsCiphers = new java.util.ArrayList<String>(tlsCiphers);
    }

    /**
     * <p>
     * Lists the enabled Transport Layer Security (TLS) cipher encryption algorithms in the security policy that is
     * attached to the server.
     * </p>
     * <note>
     * <p>
     * This parameter only applies to security policies for servers.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTlsCiphers(java.util.Collection)} or {@link #withTlsCiphers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tlsCiphers
     *        Lists the enabled Transport Layer Security (TLS) cipher encryption algorithms in the security policy that
     *        is attached to the server.</p> <note>
     *        <p>
     *        This parameter only applies to security policies for servers.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedSecurityPolicy withTlsCiphers(String... tlsCiphers) {
        if (this.tlsCiphers == null) {
            setTlsCiphers(new java.util.ArrayList<String>(tlsCiphers.length));
        }
        for (String ele : tlsCiphers) {
            this.tlsCiphers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists the enabled Transport Layer Security (TLS) cipher encryption algorithms in the security policy that is
     * attached to the server.
     * </p>
     * <note>
     * <p>
     * This parameter only applies to security policies for servers.
     * </p>
     * </note>
     * 
     * @param tlsCiphers
     *        Lists the enabled Transport Layer Security (TLS) cipher encryption algorithms in the security policy that
     *        is attached to the server.</p> <note>
     *        <p>
     *        This parameter only applies to security policies for servers.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedSecurityPolicy withTlsCiphers(java.util.Collection<String> tlsCiphers) {
        setTlsCiphers(tlsCiphers);
        return this;
    }

    /**
     * <p>
     * Lists the host key algorithms for the security policy.
     * </p>
     * <note>
     * <p>
     * This parameter only applies to security policies for connectors.
     * </p>
     * </note>
     * 
     * @return Lists the host key algorithms for the security policy.</p> <note>
     *         <p>
     *         This parameter only applies to security policies for connectors.
     *         </p>
     */

    public java.util.List<String> getSshHostKeyAlgorithms() {
        return sshHostKeyAlgorithms;
    }

    /**
     * <p>
     * Lists the host key algorithms for the security policy.
     * </p>
     * <note>
     * <p>
     * This parameter only applies to security policies for connectors.
     * </p>
     * </note>
     * 
     * @param sshHostKeyAlgorithms
     *        Lists the host key algorithms for the security policy.</p> <note>
     *        <p>
     *        This parameter only applies to security policies for connectors.
     *        </p>
     */

    public void setSshHostKeyAlgorithms(java.util.Collection<String> sshHostKeyAlgorithms) {
        if (sshHostKeyAlgorithms == null) {
            this.sshHostKeyAlgorithms = null;
            return;
        }

        this.sshHostKeyAlgorithms = new java.util.ArrayList<String>(sshHostKeyAlgorithms);
    }

    /**
     * <p>
     * Lists the host key algorithms for the security policy.
     * </p>
     * <note>
     * <p>
     * This parameter only applies to security policies for connectors.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSshHostKeyAlgorithms(java.util.Collection)} or {@link #withSshHostKeyAlgorithms(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param sshHostKeyAlgorithms
     *        Lists the host key algorithms for the security policy.</p> <note>
     *        <p>
     *        This parameter only applies to security policies for connectors.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedSecurityPolicy withSshHostKeyAlgorithms(String... sshHostKeyAlgorithms) {
        if (this.sshHostKeyAlgorithms == null) {
            setSshHostKeyAlgorithms(new java.util.ArrayList<String>(sshHostKeyAlgorithms.length));
        }
        for (String ele : sshHostKeyAlgorithms) {
            this.sshHostKeyAlgorithms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists the host key algorithms for the security policy.
     * </p>
     * <note>
     * <p>
     * This parameter only applies to security policies for connectors.
     * </p>
     * </note>
     * 
     * @param sshHostKeyAlgorithms
     *        Lists the host key algorithms for the security policy.</p> <note>
     *        <p>
     *        This parameter only applies to security policies for connectors.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedSecurityPolicy withSshHostKeyAlgorithms(java.util.Collection<String> sshHostKeyAlgorithms) {
        setSshHostKeyAlgorithms(sshHostKeyAlgorithms);
        return this;
    }

    /**
     * <p>
     * The resource type to which the security policy applies, either server or connector.
     * </p>
     * 
     * @param type
     *        The resource type to which the security policy applies, either server or connector.
     * @see SecurityPolicyResourceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The resource type to which the security policy applies, either server or connector.
     * </p>
     * 
     * @return The resource type to which the security policy applies, either server or connector.
     * @see SecurityPolicyResourceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The resource type to which the security policy applies, either server or connector.
     * </p>
     * 
     * @param type
     *        The resource type to which the security policy applies, either server or connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecurityPolicyResourceType
     */

    public DescribedSecurityPolicy withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The resource type to which the security policy applies, either server or connector.
     * </p>
     * 
     * @param type
     *        The resource type to which the security policy applies, either server or connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecurityPolicyResourceType
     */

    public DescribedSecurityPolicy withType(SecurityPolicyResourceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Lists the file transfer protocols that the security policy applies to.
     * </p>
     * 
     * @return Lists the file transfer protocols that the security policy applies to.
     * @see SecurityPolicyProtocol
     */

    public java.util.List<String> getProtocols() {
        return protocols;
    }

    /**
     * <p>
     * Lists the file transfer protocols that the security policy applies to.
     * </p>
     * 
     * @param protocols
     *        Lists the file transfer protocols that the security policy applies to.
     * @see SecurityPolicyProtocol
     */

    public void setProtocols(java.util.Collection<String> protocols) {
        if (protocols == null) {
            this.protocols = null;
            return;
        }

        this.protocols = new java.util.ArrayList<String>(protocols);
    }

    /**
     * <p>
     * Lists the file transfer protocols that the security policy applies to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProtocols(java.util.Collection)} or {@link #withProtocols(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param protocols
     *        Lists the file transfer protocols that the security policy applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecurityPolicyProtocol
     */

    public DescribedSecurityPolicy withProtocols(String... protocols) {
        if (this.protocols == null) {
            setProtocols(new java.util.ArrayList<String>(protocols.length));
        }
        for (String ele : protocols) {
            this.protocols.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists the file transfer protocols that the security policy applies to.
     * </p>
     * 
     * @param protocols
     *        Lists the file transfer protocols that the security policy applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecurityPolicyProtocol
     */

    public DescribedSecurityPolicy withProtocols(java.util.Collection<String> protocols) {
        setProtocols(protocols);
        return this;
    }

    /**
     * <p>
     * Lists the file transfer protocols that the security policy applies to.
     * </p>
     * 
     * @param protocols
     *        Lists the file transfer protocols that the security policy applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecurityPolicyProtocol
     */

    public DescribedSecurityPolicy withProtocols(SecurityPolicyProtocol... protocols) {
        java.util.ArrayList<String> protocolsCopy = new java.util.ArrayList<String>(protocols.length);
        for (SecurityPolicyProtocol value : protocols) {
            protocolsCopy.add(value.toString());
        }
        if (getProtocols() == null) {
            setProtocols(protocolsCopy);
        } else {
            getProtocols().addAll(protocolsCopy);
        }
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
        if (getFips() != null)
            sb.append("Fips: ").append(getFips()).append(",");
        if (getSecurityPolicyName() != null)
            sb.append("SecurityPolicyName: ").append(getSecurityPolicyName()).append(",");
        if (getSshCiphers() != null)
            sb.append("SshCiphers: ").append(getSshCiphers()).append(",");
        if (getSshKexs() != null)
            sb.append("SshKexs: ").append(getSshKexs()).append(",");
        if (getSshMacs() != null)
            sb.append("SshMacs: ").append(getSshMacs()).append(",");
        if (getTlsCiphers() != null)
            sb.append("TlsCiphers: ").append(getTlsCiphers()).append(",");
        if (getSshHostKeyAlgorithms() != null)
            sb.append("SshHostKeyAlgorithms: ").append(getSshHostKeyAlgorithms()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getProtocols() != null)
            sb.append("Protocols: ").append(getProtocols());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribedSecurityPolicy == false)
            return false;
        DescribedSecurityPolicy other = (DescribedSecurityPolicy) obj;
        if (other.getFips() == null ^ this.getFips() == null)
            return false;
        if (other.getFips() != null && other.getFips().equals(this.getFips()) == false)
            return false;
        if (other.getSecurityPolicyName() == null ^ this.getSecurityPolicyName() == null)
            return false;
        if (other.getSecurityPolicyName() != null && other.getSecurityPolicyName().equals(this.getSecurityPolicyName()) == false)
            return false;
        if (other.getSshCiphers() == null ^ this.getSshCiphers() == null)
            return false;
        if (other.getSshCiphers() != null && other.getSshCiphers().equals(this.getSshCiphers()) == false)
            return false;
        if (other.getSshKexs() == null ^ this.getSshKexs() == null)
            return false;
        if (other.getSshKexs() != null && other.getSshKexs().equals(this.getSshKexs()) == false)
            return false;
        if (other.getSshMacs() == null ^ this.getSshMacs() == null)
            return false;
        if (other.getSshMacs() != null && other.getSshMacs().equals(this.getSshMacs()) == false)
            return false;
        if (other.getTlsCiphers() == null ^ this.getTlsCiphers() == null)
            return false;
        if (other.getTlsCiphers() != null && other.getTlsCiphers().equals(this.getTlsCiphers()) == false)
            return false;
        if (other.getSshHostKeyAlgorithms() == null ^ this.getSshHostKeyAlgorithms() == null)
            return false;
        if (other.getSshHostKeyAlgorithms() != null && other.getSshHostKeyAlgorithms().equals(this.getSshHostKeyAlgorithms()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getProtocols() == null ^ this.getProtocols() == null)
            return false;
        if (other.getProtocols() != null && other.getProtocols().equals(this.getProtocols()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFips() == null) ? 0 : getFips().hashCode());
        hashCode = prime * hashCode + ((getSecurityPolicyName() == null) ? 0 : getSecurityPolicyName().hashCode());
        hashCode = prime * hashCode + ((getSshCiphers() == null) ? 0 : getSshCiphers().hashCode());
        hashCode = prime * hashCode + ((getSshKexs() == null) ? 0 : getSshKexs().hashCode());
        hashCode = prime * hashCode + ((getSshMacs() == null) ? 0 : getSshMacs().hashCode());
        hashCode = prime * hashCode + ((getTlsCiphers() == null) ? 0 : getTlsCiphers().hashCode());
        hashCode = prime * hashCode + ((getSshHostKeyAlgorithms() == null) ? 0 : getSshHostKeyAlgorithms().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getProtocols() == null) ? 0 : getProtocols().hashCode());
        return hashCode;
    }

    @Override
    public DescribedSecurityPolicy clone() {
        try {
            return (DescribedSecurityPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.DescribedSecurityPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
