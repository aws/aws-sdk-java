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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about a policy used for SSL negotiation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/SslPolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SslPolicy implements Serializable, Cloneable {

    /**
     * <p>
     * The protocols.
     * </p>
     */
    private java.util.List<String> sslProtocols;
    /**
     * <p>
     * The ciphers.
     * </p>
     */
    private java.util.List<Cipher> ciphers;
    /**
     * <p>
     * The name of the policy.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The protocols.
     * </p>
     * 
     * @return The protocols.
     */

    public java.util.List<String> getSslProtocols() {
        return sslProtocols;
    }

    /**
     * <p>
     * The protocols.
     * </p>
     * 
     * @param sslProtocols
     *        The protocols.
     */

    public void setSslProtocols(java.util.Collection<String> sslProtocols) {
        if (sslProtocols == null) {
            this.sslProtocols = null;
            return;
        }

        this.sslProtocols = new java.util.ArrayList<String>(sslProtocols);
    }

    /**
     * <p>
     * The protocols.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSslProtocols(java.util.Collection)} or {@link #withSslProtocols(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sslProtocols
     *        The protocols.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SslPolicy withSslProtocols(String... sslProtocols) {
        if (this.sslProtocols == null) {
            setSslProtocols(new java.util.ArrayList<String>(sslProtocols.length));
        }
        for (String ele : sslProtocols) {
            this.sslProtocols.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The protocols.
     * </p>
     * 
     * @param sslProtocols
     *        The protocols.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SslPolicy withSslProtocols(java.util.Collection<String> sslProtocols) {
        setSslProtocols(sslProtocols);
        return this;
    }

    /**
     * <p>
     * The ciphers.
     * </p>
     * 
     * @return The ciphers.
     */

    public java.util.List<Cipher> getCiphers() {
        return ciphers;
    }

    /**
     * <p>
     * The ciphers.
     * </p>
     * 
     * @param ciphers
     *        The ciphers.
     */

    public void setCiphers(java.util.Collection<Cipher> ciphers) {
        if (ciphers == null) {
            this.ciphers = null;
            return;
        }

        this.ciphers = new java.util.ArrayList<Cipher>(ciphers);
    }

    /**
     * <p>
     * The ciphers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCiphers(java.util.Collection)} or {@link #withCiphers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param ciphers
     *        The ciphers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SslPolicy withCiphers(Cipher... ciphers) {
        if (this.ciphers == null) {
            setCiphers(new java.util.ArrayList<Cipher>(ciphers.length));
        }
        for (Cipher ele : ciphers) {
            this.ciphers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ciphers.
     * </p>
     * 
     * @param ciphers
     *        The ciphers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SslPolicy withCiphers(java.util.Collection<Cipher> ciphers) {
        setCiphers(ciphers);
        return this;
    }

    /**
     * <p>
     * The name of the policy.
     * </p>
     * 
     * @param name
     *        The name of the policy.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the policy.
     * </p>
     * 
     * @return The name of the policy.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the policy.
     * </p>
     * 
     * @param name
     *        The name of the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SslPolicy withName(String name) {
        setName(name);
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
        if (getSslProtocols() != null)
            sb.append("SslProtocols: ").append(getSslProtocols()).append(",");
        if (getCiphers() != null)
            sb.append("Ciphers: ").append(getCiphers()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SslPolicy == false)
            return false;
        SslPolicy other = (SslPolicy) obj;
        if (other.getSslProtocols() == null ^ this.getSslProtocols() == null)
            return false;
        if (other.getSslProtocols() != null && other.getSslProtocols().equals(this.getSslProtocols()) == false)
            return false;
        if (other.getCiphers() == null ^ this.getCiphers() == null)
            return false;
        if (other.getCiphers() != null && other.getCiphers().equals(this.getCiphers()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSslProtocols() == null) ? 0 : getSslProtocols().hashCode());
        hashCode = prime * hashCode + ((getCiphers() == null) ? 0 : getCiphers().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public SslPolicy clone() {
        try {
            return (SslPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
