/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the TLS security policies that are available for Lightsail load balancers.
 * </p>
 * <p>
 * For more information about load balancer TLS security policies, see <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configure-load-balancer-tls-security-policy"
 * >Configuring TLS security policies on your Amazon Lightsail load balancers</a> in the <i>Amazon Lightsail Developer
 * Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/LoadBalancerTlsPolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoadBalancerTlsPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the TLS security policy.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A Boolean value that indicates whether the TLS security policy is the default.
     * </p>
     */
    private Boolean isDefault;
    /**
     * <p>
     * The description of the TLS security policy.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The protocols used in a given TLS security policy.
     * </p>
     */
    private java.util.List<String> protocols;
    /**
     * <p>
     * The ciphers used by the TLS security policy.
     * </p>
     * <p>
     * The ciphers are listed in order of preference.
     * </p>
     */
    private java.util.List<String> ciphers;

    /**
     * <p>
     * The name of the TLS security policy.
     * </p>
     * 
     * @param name
     *        The name of the TLS security policy.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the TLS security policy.
     * </p>
     * 
     * @return The name of the TLS security policy.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the TLS security policy.
     * </p>
     * 
     * @param name
     *        The name of the TLS security policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsPolicy withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the TLS security policy is the default.
     * </p>
     * 
     * @param isDefault
     *        A Boolean value that indicates whether the TLS security policy is the default.
     */

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the TLS security policy is the default.
     * </p>
     * 
     * @return A Boolean value that indicates whether the TLS security policy is the default.
     */

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the TLS security policy is the default.
     * </p>
     * 
     * @param isDefault
     *        A Boolean value that indicates whether the TLS security policy is the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsPolicy withIsDefault(Boolean isDefault) {
        setIsDefault(isDefault);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the TLS security policy is the default.
     * </p>
     * 
     * @return A Boolean value that indicates whether the TLS security policy is the default.
     */

    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * <p>
     * The description of the TLS security policy.
     * </p>
     * 
     * @param description
     *        The description of the TLS security policy.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the TLS security policy.
     * </p>
     * 
     * @return The description of the TLS security policy.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the TLS security policy.
     * </p>
     * 
     * @param description
     *        The description of the TLS security policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsPolicy withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The protocols used in a given TLS security policy.
     * </p>
     * 
     * @return The protocols used in a given TLS security policy.
     */

    public java.util.List<String> getProtocols() {
        return protocols;
    }

    /**
     * <p>
     * The protocols used in a given TLS security policy.
     * </p>
     * 
     * @param protocols
     *        The protocols used in a given TLS security policy.
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
     * The protocols used in a given TLS security policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProtocols(java.util.Collection)} or {@link #withProtocols(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param protocols
     *        The protocols used in a given TLS security policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsPolicy withProtocols(String... protocols) {
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
     * The protocols used in a given TLS security policy.
     * </p>
     * 
     * @param protocols
     *        The protocols used in a given TLS security policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsPolicy withProtocols(java.util.Collection<String> protocols) {
        setProtocols(protocols);
        return this;
    }

    /**
     * <p>
     * The ciphers used by the TLS security policy.
     * </p>
     * <p>
     * The ciphers are listed in order of preference.
     * </p>
     * 
     * @return The ciphers used by the TLS security policy.</p>
     *         <p>
     *         The ciphers are listed in order of preference.
     */

    public java.util.List<String> getCiphers() {
        return ciphers;
    }

    /**
     * <p>
     * The ciphers used by the TLS security policy.
     * </p>
     * <p>
     * The ciphers are listed in order of preference.
     * </p>
     * 
     * @param ciphers
     *        The ciphers used by the TLS security policy.</p>
     *        <p>
     *        The ciphers are listed in order of preference.
     */

    public void setCiphers(java.util.Collection<String> ciphers) {
        if (ciphers == null) {
            this.ciphers = null;
            return;
        }

        this.ciphers = new java.util.ArrayList<String>(ciphers);
    }

    /**
     * <p>
     * The ciphers used by the TLS security policy.
     * </p>
     * <p>
     * The ciphers are listed in order of preference.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCiphers(java.util.Collection)} or {@link #withCiphers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param ciphers
     *        The ciphers used by the TLS security policy.</p>
     *        <p>
     *        The ciphers are listed in order of preference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsPolicy withCiphers(String... ciphers) {
        if (this.ciphers == null) {
            setCiphers(new java.util.ArrayList<String>(ciphers.length));
        }
        for (String ele : ciphers) {
            this.ciphers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ciphers used by the TLS security policy.
     * </p>
     * <p>
     * The ciphers are listed in order of preference.
     * </p>
     * 
     * @param ciphers
     *        The ciphers used by the TLS security policy.</p>
     *        <p>
     *        The ciphers are listed in order of preference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsPolicy withCiphers(java.util.Collection<String> ciphers) {
        setCiphers(ciphers);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getIsDefault() != null)
            sb.append("IsDefault: ").append(getIsDefault()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getProtocols() != null)
            sb.append("Protocols: ").append(getProtocols()).append(",");
        if (getCiphers() != null)
            sb.append("Ciphers: ").append(getCiphers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoadBalancerTlsPolicy == false)
            return false;
        LoadBalancerTlsPolicy other = (LoadBalancerTlsPolicy) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getIsDefault() == null ^ this.getIsDefault() == null)
            return false;
        if (other.getIsDefault() != null && other.getIsDefault().equals(this.getIsDefault()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getProtocols() == null ^ this.getProtocols() == null)
            return false;
        if (other.getProtocols() != null && other.getProtocols().equals(this.getProtocols()) == false)
            return false;
        if (other.getCiphers() == null ^ this.getCiphers() == null)
            return false;
        if (other.getCiphers() != null && other.getCiphers().equals(this.getCiphers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getProtocols() == null) ? 0 : getProtocols().hashCode());
        hashCode = prime * hashCode + ((getCiphers() == null) ? 0 : getCiphers().hashCode());
        return hashCode;
    }

    @Override
    public LoadBalancerTlsPolicy clone() {
        try {
            return (LoadBalancerTlsPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.LoadBalancerTlsPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
