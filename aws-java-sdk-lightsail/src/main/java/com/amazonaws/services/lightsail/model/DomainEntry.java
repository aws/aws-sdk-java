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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a domain recordset entry.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DomainEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the domain recordset entry.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the domain.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The target AWS name server (e.g., <code>ns-111.awsdns-22.com.</code>).
     * </p>
     * <p>
     * For Lightsail load balancers, the value looks like
     * <code>ab1234c56789c6b86aba6fb203d443bc-123456789.us-east-2.elb.amazonaws.com</code>. Be sure to also set
     * <code>isAlias</code> to <code>true</code> when setting up an A record for a load balancer.
     * </p>
     */
    private String target;
    /**
     * <p>
     * When <code>true</code>, specifies whether the domain entry is an alias used by the Lightsail load balancer. You
     * can include an alias (A type) record in your request, which points to a load balancer DNS name and routes traffic
     * to your load balancer
     * </p>
     */
    private Boolean isAlias;
    /**
     * <p>
     * The type of domain entry, such as address (A), canonical name (CNAME), mail exchanger (MX), name server (NS),
     * start of authority (SOA), service locator (SRV), or text (TXT).
     * </p>
     * <p>
     * The following domain entry types can be used:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>A</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CNAME</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MX</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SOA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SRV</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TXT</code>
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * (Deprecated) The options for the domain entry.
     * </p>
     * <note>
     * <p>
     * In releases prior to November 29, 2017, this parameter was not included in the API response. It is now
     * deprecated.
     * </p>
     * </note>
     */
    @Deprecated
    private java.util.Map<String, String> options;

    /**
     * <p>
     * The ID of the domain recordset entry.
     * </p>
     * 
     * @param id
     *        The ID of the domain recordset entry.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the domain recordset entry.
     * </p>
     * 
     * @return The ID of the domain recordset entry.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the domain recordset entry.
     * </p>
     * 
     * @param id
     *        The ID of the domain recordset entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainEntry withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @param name
     *        The name of the domain.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @return The name of the domain.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @param name
     *        The name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainEntry withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The target AWS name server (e.g., <code>ns-111.awsdns-22.com.</code>).
     * </p>
     * <p>
     * For Lightsail load balancers, the value looks like
     * <code>ab1234c56789c6b86aba6fb203d443bc-123456789.us-east-2.elb.amazonaws.com</code>. Be sure to also set
     * <code>isAlias</code> to <code>true</code> when setting up an A record for a load balancer.
     * </p>
     * 
     * @param target
     *        The target AWS name server (e.g., <code>ns-111.awsdns-22.com.</code>).</p>
     *        <p>
     *        For Lightsail load balancers, the value looks like
     *        <code>ab1234c56789c6b86aba6fb203d443bc-123456789.us-east-2.elb.amazonaws.com</code>. Be sure to also set
     *        <code>isAlias</code> to <code>true</code> when setting up an A record for a load balancer.
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The target AWS name server (e.g., <code>ns-111.awsdns-22.com.</code>).
     * </p>
     * <p>
     * For Lightsail load balancers, the value looks like
     * <code>ab1234c56789c6b86aba6fb203d443bc-123456789.us-east-2.elb.amazonaws.com</code>. Be sure to also set
     * <code>isAlias</code> to <code>true</code> when setting up an A record for a load balancer.
     * </p>
     * 
     * @return The target AWS name server (e.g., <code>ns-111.awsdns-22.com.</code>).</p>
     *         <p>
     *         For Lightsail load balancers, the value looks like
     *         <code>ab1234c56789c6b86aba6fb203d443bc-123456789.us-east-2.elb.amazonaws.com</code>. Be sure to also set
     *         <code>isAlias</code> to <code>true</code> when setting up an A record for a load balancer.
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The target AWS name server (e.g., <code>ns-111.awsdns-22.com.</code>).
     * </p>
     * <p>
     * For Lightsail load balancers, the value looks like
     * <code>ab1234c56789c6b86aba6fb203d443bc-123456789.us-east-2.elb.amazonaws.com</code>. Be sure to also set
     * <code>isAlias</code> to <code>true</code> when setting up an A record for a load balancer.
     * </p>
     * 
     * @param target
     *        The target AWS name server (e.g., <code>ns-111.awsdns-22.com.</code>).</p>
     *        <p>
     *        For Lightsail load balancers, the value looks like
     *        <code>ab1234c56789c6b86aba6fb203d443bc-123456789.us-east-2.elb.amazonaws.com</code>. Be sure to also set
     *        <code>isAlias</code> to <code>true</code> when setting up an A record for a load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainEntry withTarget(String target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * When <code>true</code>, specifies whether the domain entry is an alias used by the Lightsail load balancer. You
     * can include an alias (A type) record in your request, which points to a load balancer DNS name and routes traffic
     * to your load balancer
     * </p>
     * 
     * @param isAlias
     *        When <code>true</code>, specifies whether the domain entry is an alias used by the Lightsail load
     *        balancer. You can include an alias (A type) record in your request, which points to a load balancer DNS
     *        name and routes traffic to your load balancer
     */

    public void setIsAlias(Boolean isAlias) {
        this.isAlias = isAlias;
    }

    /**
     * <p>
     * When <code>true</code>, specifies whether the domain entry is an alias used by the Lightsail load balancer. You
     * can include an alias (A type) record in your request, which points to a load balancer DNS name and routes traffic
     * to your load balancer
     * </p>
     * 
     * @return When <code>true</code>, specifies whether the domain entry is an alias used by the Lightsail load
     *         balancer. You can include an alias (A type) record in your request, which points to a load balancer DNS
     *         name and routes traffic to your load balancer
     */

    public Boolean getIsAlias() {
        return this.isAlias;
    }

    /**
     * <p>
     * When <code>true</code>, specifies whether the domain entry is an alias used by the Lightsail load balancer. You
     * can include an alias (A type) record in your request, which points to a load balancer DNS name and routes traffic
     * to your load balancer
     * </p>
     * 
     * @param isAlias
     *        When <code>true</code>, specifies whether the domain entry is an alias used by the Lightsail load
     *        balancer. You can include an alias (A type) record in your request, which points to a load balancer DNS
     *        name and routes traffic to your load balancer
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainEntry withIsAlias(Boolean isAlias) {
        setIsAlias(isAlias);
        return this;
    }

    /**
     * <p>
     * When <code>true</code>, specifies whether the domain entry is an alias used by the Lightsail load balancer. You
     * can include an alias (A type) record in your request, which points to a load balancer DNS name and routes traffic
     * to your load balancer
     * </p>
     * 
     * @return When <code>true</code>, specifies whether the domain entry is an alias used by the Lightsail load
     *         balancer. You can include an alias (A type) record in your request, which points to a load balancer DNS
     *         name and routes traffic to your load balancer
     */

    public Boolean isAlias() {
        return this.isAlias;
    }

    /**
     * <p>
     * The type of domain entry, such as address (A), canonical name (CNAME), mail exchanger (MX), name server (NS),
     * start of authority (SOA), service locator (SRV), or text (TXT).
     * </p>
     * <p>
     * The following domain entry types can be used:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>A</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CNAME</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MX</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SOA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SRV</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TXT</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of domain entry, such as address (A), canonical name (CNAME), mail exchanger (MX), name server
     *        (NS), start of authority (SOA), service locator (SRV), or text (TXT).</p>
     *        <p>
     *        The following domain entry types can be used:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>A</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CNAME</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MX</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SOA</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SRV</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TXT</code>
     *        </p>
     *        </li>
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of domain entry, such as address (A), canonical name (CNAME), mail exchanger (MX), name server (NS),
     * start of authority (SOA), service locator (SRV), or text (TXT).
     * </p>
     * <p>
     * The following domain entry types can be used:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>A</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CNAME</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MX</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SOA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SRV</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TXT</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of domain entry, such as address (A), canonical name (CNAME), mail exchanger (MX), name server
     *         (NS), start of authority (SOA), service locator (SRV), or text (TXT).</p>
     *         <p>
     *         The following domain entry types can be used:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>A</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CNAME</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MX</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SOA</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SRV</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TXT</code>
     *         </p>
     *         </li>
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of domain entry, such as address (A), canonical name (CNAME), mail exchanger (MX), name server (NS),
     * start of authority (SOA), service locator (SRV), or text (TXT).
     * </p>
     * <p>
     * The following domain entry types can be used:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>A</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CNAME</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MX</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SOA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SRV</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TXT</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of domain entry, such as address (A), canonical name (CNAME), mail exchanger (MX), name server
     *        (NS), start of authority (SOA), service locator (SRV), or text (TXT).</p>
     *        <p>
     *        The following domain entry types can be used:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>A</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CNAME</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MX</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SOA</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SRV</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TXT</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainEntry withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * (Deprecated) The options for the domain entry.
     * </p>
     * <note>
     * <p>
     * In releases prior to November 29, 2017, this parameter was not included in the API response. It is now
     * deprecated.
     * </p>
     * </note>
     * 
     * @return (Deprecated) The options for the domain entry.</p> <note>
     *         <p>
     *         In releases prior to November 29, 2017, this parameter was not included in the API response. It is now
     *         deprecated.
     *         </p>
     */
    @Deprecated
    public java.util.Map<String, String> getOptions() {
        return options;
    }

    /**
     * <p>
     * (Deprecated) The options for the domain entry.
     * </p>
     * <note>
     * <p>
     * In releases prior to November 29, 2017, this parameter was not included in the API response. It is now
     * deprecated.
     * </p>
     * </note>
     * 
     * @param options
     *        (Deprecated) The options for the domain entry.</p> <note>
     *        <p>
     *        In releases prior to November 29, 2017, this parameter was not included in the API response. It is now
     *        deprecated.
     *        </p>
     */
    @Deprecated
    public void setOptions(java.util.Map<String, String> options) {
        this.options = options;
    }

    /**
     * <p>
     * (Deprecated) The options for the domain entry.
     * </p>
     * <note>
     * <p>
     * In releases prior to November 29, 2017, this parameter was not included in the API response. It is now
     * deprecated.
     * </p>
     * </note>
     * 
     * @param options
     *        (Deprecated) The options for the domain entry.</p> <note>
     *        <p>
     *        In releases prior to November 29, 2017, this parameter was not included in the API response. It is now
     *        deprecated.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public DomainEntry withOptions(java.util.Map<String, String> options) {
        setOptions(options);
        return this;
    }

    @Deprecated
    public DomainEntry addOptionsEntry(String key, String value) {
        if (null == this.options) {
            this.options = new java.util.HashMap<String, String>();
        }
        if (this.options.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.options.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Options.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public DomainEntry clearOptionsEntries() {
        this.options = null;
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getIsAlias() != null)
            sb.append("IsAlias: ").append(getIsAlias()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainEntry == false)
            return false;
        DomainEntry other = (DomainEntry) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getIsAlias() == null ^ this.getIsAlias() == null)
            return false;
        if (other.getIsAlias() != null && other.getIsAlias().equals(this.getIsAlias()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getIsAlias() == null) ? 0 : getIsAlias().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        return hashCode;
    }

    @Override
    public DomainEntry clone() {
        try {
            return (DomainEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.DomainEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
