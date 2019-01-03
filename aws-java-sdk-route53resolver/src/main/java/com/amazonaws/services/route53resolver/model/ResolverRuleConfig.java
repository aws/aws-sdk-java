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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * In an <a>UpdateResolverRule</a> request, information about the changes that you want to make.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ResolverRuleConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResolverRuleConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The new name for the resolver rule. The name that you specify appears in the Resolver dashboard in the Route 53
     * console.
     * </p>
     */
    private String name;
    /**
     * <p>
     * For DNS queries that originate in your VPC, the new IP addresses that you want to route outbound DNS queries to.
     * </p>
     */
    private java.util.List<TargetAddress> targetIps;
    /**
     * <p>
     * The ID of the new outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that
     * you specify in <code>TargetIps</code>.
     * </p>
     */
    private String resolverEndpointId;

    /**
     * <p>
     * The new name for the resolver rule. The name that you specify appears in the Resolver dashboard in the Route 53
     * console.
     * </p>
     * 
     * @param name
     *        The new name for the resolver rule. The name that you specify appears in the Resolver dashboard in the
     *        Route 53 console.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The new name for the resolver rule. The name that you specify appears in the Resolver dashboard in the Route 53
     * console.
     * </p>
     * 
     * @return The new name for the resolver rule. The name that you specify appears in the Resolver dashboard in the
     *         Route 53 console.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The new name for the resolver rule. The name that you specify appears in the Resolver dashboard in the Route 53
     * console.
     * </p>
     * 
     * @param name
     *        The new name for the resolver rule. The name that you specify appears in the Resolver dashboard in the
     *        Route 53 console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverRuleConfig withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * For DNS queries that originate in your VPC, the new IP addresses that you want to route outbound DNS queries to.
     * </p>
     * 
     * @return For DNS queries that originate in your VPC, the new IP addresses that you want to route outbound DNS
     *         queries to.
     */

    public java.util.List<TargetAddress> getTargetIps() {
        return targetIps;
    }

    /**
     * <p>
     * For DNS queries that originate in your VPC, the new IP addresses that you want to route outbound DNS queries to.
     * </p>
     * 
     * @param targetIps
     *        For DNS queries that originate in your VPC, the new IP addresses that you want to route outbound DNS
     *        queries to.
     */

    public void setTargetIps(java.util.Collection<TargetAddress> targetIps) {
        if (targetIps == null) {
            this.targetIps = null;
            return;
        }

        this.targetIps = new java.util.ArrayList<TargetAddress>(targetIps);
    }

    /**
     * <p>
     * For DNS queries that originate in your VPC, the new IP addresses that you want to route outbound DNS queries to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetIps(java.util.Collection)} or {@link #withTargetIps(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param targetIps
     *        For DNS queries that originate in your VPC, the new IP addresses that you want to route outbound DNS
     *        queries to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverRuleConfig withTargetIps(TargetAddress... targetIps) {
        if (this.targetIps == null) {
            setTargetIps(new java.util.ArrayList<TargetAddress>(targetIps.length));
        }
        for (TargetAddress ele : targetIps) {
            this.targetIps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For DNS queries that originate in your VPC, the new IP addresses that you want to route outbound DNS queries to.
     * </p>
     * 
     * @param targetIps
     *        For DNS queries that originate in your VPC, the new IP addresses that you want to route outbound DNS
     *        queries to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverRuleConfig withTargetIps(java.util.Collection<TargetAddress> targetIps) {
        setTargetIps(targetIps);
        return this;
    }

    /**
     * <p>
     * The ID of the new outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that
     * you specify in <code>TargetIps</code>.
     * </p>
     * 
     * @param resolverEndpointId
     *        The ID of the new outbound resolver endpoint that you want to use to route DNS queries to the IP addresses
     *        that you specify in <code>TargetIps</code>.
     */

    public void setResolverEndpointId(String resolverEndpointId) {
        this.resolverEndpointId = resolverEndpointId;
    }

    /**
     * <p>
     * The ID of the new outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that
     * you specify in <code>TargetIps</code>.
     * </p>
     * 
     * @return The ID of the new outbound resolver endpoint that you want to use to route DNS queries to the IP
     *         addresses that you specify in <code>TargetIps</code>.
     */

    public String getResolverEndpointId() {
        return this.resolverEndpointId;
    }

    /**
     * <p>
     * The ID of the new outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that
     * you specify in <code>TargetIps</code>.
     * </p>
     * 
     * @param resolverEndpointId
     *        The ID of the new outbound resolver endpoint that you want to use to route DNS queries to the IP addresses
     *        that you specify in <code>TargetIps</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverRuleConfig withResolverEndpointId(String resolverEndpointId) {
        setResolverEndpointId(resolverEndpointId);
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
        if (getTargetIps() != null)
            sb.append("TargetIps: ").append(getTargetIps()).append(",");
        if (getResolverEndpointId() != null)
            sb.append("ResolverEndpointId: ").append(getResolverEndpointId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResolverRuleConfig == false)
            return false;
        ResolverRuleConfig other = (ResolverRuleConfig) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTargetIps() == null ^ this.getTargetIps() == null)
            return false;
        if (other.getTargetIps() != null && other.getTargetIps().equals(this.getTargetIps()) == false)
            return false;
        if (other.getResolverEndpointId() == null ^ this.getResolverEndpointId() == null)
            return false;
        if (other.getResolverEndpointId() != null && other.getResolverEndpointId().equals(this.getResolverEndpointId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTargetIps() == null) ? 0 : getTargetIps().hashCode());
        hashCode = prime * hashCode + ((getResolverEndpointId() == null) ? 0 : getResolverEndpointId().hashCode());
        return hashCode;
    }

    @Override
    public ResolverRuleConfig clone() {
        try {
            return (ResolverRuleConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53resolver.model.transform.ResolverRuleConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
