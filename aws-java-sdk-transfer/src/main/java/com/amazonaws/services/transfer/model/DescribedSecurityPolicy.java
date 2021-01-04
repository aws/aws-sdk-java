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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the properties of a security policy that was specified. For more information about security policies, see
 * <a href="https://docs.aws.amazon.com/transfer/latest/userguide/security-policies.html">Working with security
 * policies</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribedSecurityPolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribedSecurityPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether this policy enables Federal Information Processing Standards (FIPS).
     * </p>
     */
    private Boolean fips;
    /**
     * <p>
     * Specifies the name of the security policy that is attached to the server.
     * </p>
     */
    private String securityPolicyName;
    /**
     * <p>
     * Specifies the enabled Secure Shell (SSH) cipher encryption algorithms in the security policy that is attached to
     * the server.
     * </p>
     */
    private java.util.List<String> sshCiphers;
    /**
     * <p>
     * Specifies the enabled SSH key exchange (KEX) encryption algorithms in the security policy that is attached to the
     * server.
     * </p>
     */
    private java.util.List<String> sshKexs;
    /**
     * <p>
     * Specifies the enabled SSH message authentication code (MAC) encryption algorithms in the security policy that is
     * attached to the server.
     * </p>
     */
    private java.util.List<String> sshMacs;
    /**
     * <p>
     * Specifies the enabled Transport Layer Security (TLS) cipher encryption algorithms in the security policy that is
     * attached to the server.
     * </p>
     */
    private java.util.List<String> tlsCiphers;

    /**
     * <p>
     * Specifies whether this policy enables Federal Information Processing Standards (FIPS).
     * </p>
     * 
     * @param fips
     *        Specifies whether this policy enables Federal Information Processing Standards (FIPS).
     */

    public void setFips(Boolean fips) {
        this.fips = fips;
    }

    /**
     * <p>
     * Specifies whether this policy enables Federal Information Processing Standards (FIPS).
     * </p>
     * 
     * @return Specifies whether this policy enables Federal Information Processing Standards (FIPS).
     */

    public Boolean getFips() {
        return this.fips;
    }

    /**
     * <p>
     * Specifies whether this policy enables Federal Information Processing Standards (FIPS).
     * </p>
     * 
     * @param fips
     *        Specifies whether this policy enables Federal Information Processing Standards (FIPS).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedSecurityPolicy withFips(Boolean fips) {
        setFips(fips);
        return this;
    }

    /**
     * <p>
     * Specifies whether this policy enables Federal Information Processing Standards (FIPS).
     * </p>
     * 
     * @return Specifies whether this policy enables Federal Information Processing Standards (FIPS).
     */

    public Boolean isFips() {
        return this.fips;
    }

    /**
     * <p>
     * Specifies the name of the security policy that is attached to the server.
     * </p>
     * 
     * @param securityPolicyName
     *        Specifies the name of the security policy that is attached to the server.
     */

    public void setSecurityPolicyName(String securityPolicyName) {
        this.securityPolicyName = securityPolicyName;
    }

    /**
     * <p>
     * Specifies the name of the security policy that is attached to the server.
     * </p>
     * 
     * @return Specifies the name of the security policy that is attached to the server.
     */

    public String getSecurityPolicyName() {
        return this.securityPolicyName;
    }

    /**
     * <p>
     * Specifies the name of the security policy that is attached to the server.
     * </p>
     * 
     * @param securityPolicyName
     *        Specifies the name of the security policy that is attached to the server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedSecurityPolicy withSecurityPolicyName(String securityPolicyName) {
        setSecurityPolicyName(securityPolicyName);
        return this;
    }

    /**
     * <p>
     * Specifies the enabled Secure Shell (SSH) cipher encryption algorithms in the security policy that is attached to
     * the server.
     * </p>
     * 
     * @return Specifies the enabled Secure Shell (SSH) cipher encryption algorithms in the security policy that is
     *         attached to the server.
     */

    public java.util.List<String> getSshCiphers() {
        return sshCiphers;
    }

    /**
     * <p>
     * Specifies the enabled Secure Shell (SSH) cipher encryption algorithms in the security policy that is attached to
     * the server.
     * </p>
     * 
     * @param sshCiphers
     *        Specifies the enabled Secure Shell (SSH) cipher encryption algorithms in the security policy that is
     *        attached to the server.
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
     * Specifies the enabled Secure Shell (SSH) cipher encryption algorithms in the security policy that is attached to
     * the server.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSshCiphers(java.util.Collection)} or {@link #withSshCiphers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sshCiphers
     *        Specifies the enabled Secure Shell (SSH) cipher encryption algorithms in the security policy that is
     *        attached to the server.
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
     * Specifies the enabled Secure Shell (SSH) cipher encryption algorithms in the security policy that is attached to
     * the server.
     * </p>
     * 
     * @param sshCiphers
     *        Specifies the enabled Secure Shell (SSH) cipher encryption algorithms in the security policy that is
     *        attached to the server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedSecurityPolicy withSshCiphers(java.util.Collection<String> sshCiphers) {
        setSshCiphers(sshCiphers);
        return this;
    }

    /**
     * <p>
     * Specifies the enabled SSH key exchange (KEX) encryption algorithms in the security policy that is attached to the
     * server.
     * </p>
     * 
     * @return Specifies the enabled SSH key exchange (KEX) encryption algorithms in the security policy that is
     *         attached to the server.
     */

    public java.util.List<String> getSshKexs() {
        return sshKexs;
    }

    /**
     * <p>
     * Specifies the enabled SSH key exchange (KEX) encryption algorithms in the security policy that is attached to the
     * server.
     * </p>
     * 
     * @param sshKexs
     *        Specifies the enabled SSH key exchange (KEX) encryption algorithms in the security policy that is attached
     *        to the server.
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
     * Specifies the enabled SSH key exchange (KEX) encryption algorithms in the security policy that is attached to the
     * server.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSshKexs(java.util.Collection)} or {@link #withSshKexs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sshKexs
     *        Specifies the enabled SSH key exchange (KEX) encryption algorithms in the security policy that is attached
     *        to the server.
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
     * Specifies the enabled SSH key exchange (KEX) encryption algorithms in the security policy that is attached to the
     * server.
     * </p>
     * 
     * @param sshKexs
     *        Specifies the enabled SSH key exchange (KEX) encryption algorithms in the security policy that is attached
     *        to the server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedSecurityPolicy withSshKexs(java.util.Collection<String> sshKexs) {
        setSshKexs(sshKexs);
        return this;
    }

    /**
     * <p>
     * Specifies the enabled SSH message authentication code (MAC) encryption algorithms in the security policy that is
     * attached to the server.
     * </p>
     * 
     * @return Specifies the enabled SSH message authentication code (MAC) encryption algorithms in the security policy
     *         that is attached to the server.
     */

    public java.util.List<String> getSshMacs() {
        return sshMacs;
    }

    /**
     * <p>
     * Specifies the enabled SSH message authentication code (MAC) encryption algorithms in the security policy that is
     * attached to the server.
     * </p>
     * 
     * @param sshMacs
     *        Specifies the enabled SSH message authentication code (MAC) encryption algorithms in the security policy
     *        that is attached to the server.
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
     * Specifies the enabled SSH message authentication code (MAC) encryption algorithms in the security policy that is
     * attached to the server.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSshMacs(java.util.Collection)} or {@link #withSshMacs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sshMacs
     *        Specifies the enabled SSH message authentication code (MAC) encryption algorithms in the security policy
     *        that is attached to the server.
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
     * Specifies the enabled SSH message authentication code (MAC) encryption algorithms in the security policy that is
     * attached to the server.
     * </p>
     * 
     * @param sshMacs
     *        Specifies the enabled SSH message authentication code (MAC) encryption algorithms in the security policy
     *        that is attached to the server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedSecurityPolicy withSshMacs(java.util.Collection<String> sshMacs) {
        setSshMacs(sshMacs);
        return this;
    }

    /**
     * <p>
     * Specifies the enabled Transport Layer Security (TLS) cipher encryption algorithms in the security policy that is
     * attached to the server.
     * </p>
     * 
     * @return Specifies the enabled Transport Layer Security (TLS) cipher encryption algorithms in the security policy
     *         that is attached to the server.
     */

    public java.util.List<String> getTlsCiphers() {
        return tlsCiphers;
    }

    /**
     * <p>
     * Specifies the enabled Transport Layer Security (TLS) cipher encryption algorithms in the security policy that is
     * attached to the server.
     * </p>
     * 
     * @param tlsCiphers
     *        Specifies the enabled Transport Layer Security (TLS) cipher encryption algorithms in the security policy
     *        that is attached to the server.
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
     * Specifies the enabled Transport Layer Security (TLS) cipher encryption algorithms in the security policy that is
     * attached to the server.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTlsCiphers(java.util.Collection)} or {@link #withTlsCiphers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tlsCiphers
     *        Specifies the enabled Transport Layer Security (TLS) cipher encryption algorithms in the security policy
     *        that is attached to the server.
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
     * Specifies the enabled Transport Layer Security (TLS) cipher encryption algorithms in the security policy that is
     * attached to the server.
     * </p>
     * 
     * @param tlsCiphers
     *        Specifies the enabled Transport Layer Security (TLS) cipher encryption algorithms in the security policy
     *        that is attached to the server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedSecurityPolicy withTlsCiphers(java.util.Collection<String> tlsCiphers) {
        setTlsCiphers(tlsCiphers);
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
            sb.append("TlsCiphers: ").append(getTlsCiphers());
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
