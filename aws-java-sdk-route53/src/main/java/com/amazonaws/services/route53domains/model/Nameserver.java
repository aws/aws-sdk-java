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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Nameserver includes the following elements.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/Nameserver" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Nameserver implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The fully qualified host name of the name server.
     * </p>
     * <p>
     * Constraint: Maximum 255 characters
     * </p>
     */
    private String name;
    /**
     * <p>
     * Glue IP address of a name server entry. Glue IP addresses are required only when the name of the name server is a
     * subdomain of the domain. For example, if your domain is example.com and the name server for the domain is
     * ns.example.com, you need to specify the IP address for ns.example.com.
     * </p>
     * <p>
     * Constraints: The list can contain only one IPv4 and one IPv6 address.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> glueIps;

    /**
     * <p>
     * The fully qualified host name of the name server.
     * </p>
     * <p>
     * Constraint: Maximum 255 characters
     * </p>
     * 
     * @param name
     *        The fully qualified host name of the name server.</p>
     *        <p>
     *        Constraint: Maximum 255 characters
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The fully qualified host name of the name server.
     * </p>
     * <p>
     * Constraint: Maximum 255 characters
     * </p>
     * 
     * @return The fully qualified host name of the name server.</p>
     *         <p>
     *         Constraint: Maximum 255 characters
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The fully qualified host name of the name server.
     * </p>
     * <p>
     * Constraint: Maximum 255 characters
     * </p>
     * 
     * @param name
     *        The fully qualified host name of the name server.</p>
     *        <p>
     *        Constraint: Maximum 255 characters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Nameserver withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Glue IP address of a name server entry. Glue IP addresses are required only when the name of the name server is a
     * subdomain of the domain. For example, if your domain is example.com and the name server for the domain is
     * ns.example.com, you need to specify the IP address for ns.example.com.
     * </p>
     * <p>
     * Constraints: The list can contain only one IPv4 and one IPv6 address.
     * </p>
     * 
     * @return Glue IP address of a name server entry. Glue IP addresses are required only when the name of the name
     *         server is a subdomain of the domain. For example, if your domain is example.com and the name server for
     *         the domain is ns.example.com, you need to specify the IP address for ns.example.com.</p>
     *         <p>
     *         Constraints: The list can contain only one IPv4 and one IPv6 address.
     */

    public java.util.List<String> getGlueIps() {
        if (glueIps == null) {
            glueIps = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return glueIps;
    }

    /**
     * <p>
     * Glue IP address of a name server entry. Glue IP addresses are required only when the name of the name server is a
     * subdomain of the domain. For example, if your domain is example.com and the name server for the domain is
     * ns.example.com, you need to specify the IP address for ns.example.com.
     * </p>
     * <p>
     * Constraints: The list can contain only one IPv4 and one IPv6 address.
     * </p>
     * 
     * @param glueIps
     *        Glue IP address of a name server entry. Glue IP addresses are required only when the name of the name
     *        server is a subdomain of the domain. For example, if your domain is example.com and the name server for
     *        the domain is ns.example.com, you need to specify the IP address for ns.example.com.</p>
     *        <p>
     *        Constraints: The list can contain only one IPv4 and one IPv6 address.
     */

    public void setGlueIps(java.util.Collection<String> glueIps) {
        if (glueIps == null) {
            this.glueIps = null;
            return;
        }

        this.glueIps = new com.amazonaws.internal.SdkInternalList<String>(glueIps);
    }

    /**
     * <p>
     * Glue IP address of a name server entry. Glue IP addresses are required only when the name of the name server is a
     * subdomain of the domain. For example, if your domain is example.com and the name server for the domain is
     * ns.example.com, you need to specify the IP address for ns.example.com.
     * </p>
     * <p>
     * Constraints: The list can contain only one IPv4 and one IPv6 address.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGlueIps(java.util.Collection)} or {@link #withGlueIps(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param glueIps
     *        Glue IP address of a name server entry. Glue IP addresses are required only when the name of the name
     *        server is a subdomain of the domain. For example, if your domain is example.com and the name server for
     *        the domain is ns.example.com, you need to specify the IP address for ns.example.com.</p>
     *        <p>
     *        Constraints: The list can contain only one IPv4 and one IPv6 address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Nameserver withGlueIps(String... glueIps) {
        if (this.glueIps == null) {
            setGlueIps(new com.amazonaws.internal.SdkInternalList<String>(glueIps.length));
        }
        for (String ele : glueIps) {
            this.glueIps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Glue IP address of a name server entry. Glue IP addresses are required only when the name of the name server is a
     * subdomain of the domain. For example, if your domain is example.com and the name server for the domain is
     * ns.example.com, you need to specify the IP address for ns.example.com.
     * </p>
     * <p>
     * Constraints: The list can contain only one IPv4 and one IPv6 address.
     * </p>
     * 
     * @param glueIps
     *        Glue IP address of a name server entry. Glue IP addresses are required only when the name of the name
     *        server is a subdomain of the domain. For example, if your domain is example.com and the name server for
     *        the domain is ns.example.com, you need to specify the IP address for ns.example.com.</p>
     *        <p>
     *        Constraints: The list can contain only one IPv4 and one IPv6 address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Nameserver withGlueIps(java.util.Collection<String> glueIps) {
        setGlueIps(glueIps);
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
        if (getGlueIps() != null)
            sb.append("GlueIps: ").append(getGlueIps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Nameserver == false)
            return false;
        Nameserver other = (Nameserver) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getGlueIps() == null ^ this.getGlueIps() == null)
            return false;
        if (other.getGlueIps() != null && other.getGlueIps().equals(this.getGlueIps()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getGlueIps() == null) ? 0 : getGlueIps().hashCode());
        return hashCode;
    }

    @Override
    public Nameserver clone() {
        try {
            return (Nameserver) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53domains.model.transform.NameserverMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
