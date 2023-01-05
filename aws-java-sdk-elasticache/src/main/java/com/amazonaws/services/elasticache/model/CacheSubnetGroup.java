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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of one of the following operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>CreateCacheSubnetGroup</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ModifyCacheSubnetGroup</code>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CacheSubnetGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CacheSubnetGroup implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the cache subnet group.
     * </p>
     */
    private String cacheSubnetGroupName;
    /**
     * <p>
     * The description of the cache subnet group.
     * </p>
     */
    private String cacheSubnetGroupDescription;
    /**
     * <p>
     * The Amazon Virtual Private Cloud identifier (VPC ID) of the cache subnet group.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * A list of subnets associated with the cache subnet group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Subnet> subnets;
    /**
     * <p>
     * The ARN (Amazon Resource Name) of the cache subnet group.
     * </p>
     */
    private String aRN;
    /**
     * <p>
     * Either <code>ipv4</code> | <code>ipv6</code> | <code>dual_stack</code>. IPv6 is supported for workloads using
     * Redis engine version 6.2 onward or Memcached engine version 1.6.6 on all instances built on the <a
     * href="https://aws.amazon.com/ec2/nitro/">Nitro system</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> supportedNetworkTypes;

    /**
     * <p>
     * The name of the cache subnet group.
     * </p>
     * 
     * @param cacheSubnetGroupName
     *        The name of the cache subnet group.
     */

    public void setCacheSubnetGroupName(String cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
    }

    /**
     * <p>
     * The name of the cache subnet group.
     * </p>
     * 
     * @return The name of the cache subnet group.
     */

    public String getCacheSubnetGroupName() {
        return this.cacheSubnetGroupName;
    }

    /**
     * <p>
     * The name of the cache subnet group.
     * </p>
     * 
     * @param cacheSubnetGroupName
     *        The name of the cache subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheSubnetGroup withCacheSubnetGroupName(String cacheSubnetGroupName) {
        setCacheSubnetGroupName(cacheSubnetGroupName);
        return this;
    }

    /**
     * <p>
     * The description of the cache subnet group.
     * </p>
     * 
     * @param cacheSubnetGroupDescription
     *        The description of the cache subnet group.
     */

    public void setCacheSubnetGroupDescription(String cacheSubnetGroupDescription) {
        this.cacheSubnetGroupDescription = cacheSubnetGroupDescription;
    }

    /**
     * <p>
     * The description of the cache subnet group.
     * </p>
     * 
     * @return The description of the cache subnet group.
     */

    public String getCacheSubnetGroupDescription() {
        return this.cacheSubnetGroupDescription;
    }

    /**
     * <p>
     * The description of the cache subnet group.
     * </p>
     * 
     * @param cacheSubnetGroupDescription
     *        The description of the cache subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheSubnetGroup withCacheSubnetGroupDescription(String cacheSubnetGroupDescription) {
        setCacheSubnetGroupDescription(cacheSubnetGroupDescription);
        return this;
    }

    /**
     * <p>
     * The Amazon Virtual Private Cloud identifier (VPC ID) of the cache subnet group.
     * </p>
     * 
     * @param vpcId
     *        The Amazon Virtual Private Cloud identifier (VPC ID) of the cache subnet group.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The Amazon Virtual Private Cloud identifier (VPC ID) of the cache subnet group.
     * </p>
     * 
     * @return The Amazon Virtual Private Cloud identifier (VPC ID) of the cache subnet group.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The Amazon Virtual Private Cloud identifier (VPC ID) of the cache subnet group.
     * </p>
     * 
     * @param vpcId
     *        The Amazon Virtual Private Cloud identifier (VPC ID) of the cache subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheSubnetGroup withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * A list of subnets associated with the cache subnet group.
     * </p>
     * 
     * @return A list of subnets associated with the cache subnet group.
     */

    public java.util.List<Subnet> getSubnets() {
        if (subnets == null) {
            subnets = new com.amazonaws.internal.SdkInternalList<Subnet>();
        }
        return subnets;
    }

    /**
     * <p>
     * A list of subnets associated with the cache subnet group.
     * </p>
     * 
     * @param subnets
     *        A list of subnets associated with the cache subnet group.
     */

    public void setSubnets(java.util.Collection<Subnet> subnets) {
        if (subnets == null) {
            this.subnets = null;
            return;
        }

        this.subnets = new com.amazonaws.internal.SdkInternalList<Subnet>(subnets);
    }

    /**
     * <p>
     * A list of subnets associated with the cache subnet group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnets(java.util.Collection)} or {@link #withSubnets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param subnets
     *        A list of subnets associated with the cache subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheSubnetGroup withSubnets(Subnet... subnets) {
        if (this.subnets == null) {
            setSubnets(new com.amazonaws.internal.SdkInternalList<Subnet>(subnets.length));
        }
        for (Subnet ele : subnets) {
            this.subnets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of subnets associated with the cache subnet group.
     * </p>
     * 
     * @param subnets
     *        A list of subnets associated with the cache subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheSubnetGroup withSubnets(java.util.Collection<Subnet> subnets) {
        setSubnets(subnets);
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the cache subnet group.
     * </p>
     * 
     * @param aRN
     *        The ARN (Amazon Resource Name) of the cache subnet group.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the cache subnet group.
     * </p>
     * 
     * @return The ARN (Amazon Resource Name) of the cache subnet group.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the cache subnet group.
     * </p>
     * 
     * @param aRN
     *        The ARN (Amazon Resource Name) of the cache subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheSubnetGroup withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * Either <code>ipv4</code> | <code>ipv6</code> | <code>dual_stack</code>. IPv6 is supported for workloads using
     * Redis engine version 6.2 onward or Memcached engine version 1.6.6 on all instances built on the <a
     * href="https://aws.amazon.com/ec2/nitro/">Nitro system</a>.
     * </p>
     * 
     * @return Either <code>ipv4</code> | <code>ipv6</code> | <code>dual_stack</code>. IPv6 is supported for workloads
     *         using Redis engine version 6.2 onward or Memcached engine version 1.6.6 on all instances built on the <a
     *         href="https://aws.amazon.com/ec2/nitro/">Nitro system</a>.
     * @see NetworkType
     */

    public java.util.List<String> getSupportedNetworkTypes() {
        if (supportedNetworkTypes == null) {
            supportedNetworkTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return supportedNetworkTypes;
    }

    /**
     * <p>
     * Either <code>ipv4</code> | <code>ipv6</code> | <code>dual_stack</code>. IPv6 is supported for workloads using
     * Redis engine version 6.2 onward or Memcached engine version 1.6.6 on all instances built on the <a
     * href="https://aws.amazon.com/ec2/nitro/">Nitro system</a>.
     * </p>
     * 
     * @param supportedNetworkTypes
     *        Either <code>ipv4</code> | <code>ipv6</code> | <code>dual_stack</code>. IPv6 is supported for workloads
     *        using Redis engine version 6.2 onward or Memcached engine version 1.6.6 on all instances built on the <a
     *        href="https://aws.amazon.com/ec2/nitro/">Nitro system</a>.
     * @see NetworkType
     */

    public void setSupportedNetworkTypes(java.util.Collection<String> supportedNetworkTypes) {
        if (supportedNetworkTypes == null) {
            this.supportedNetworkTypes = null;
            return;
        }

        this.supportedNetworkTypes = new com.amazonaws.internal.SdkInternalList<String>(supportedNetworkTypes);
    }

    /**
     * <p>
     * Either <code>ipv4</code> | <code>ipv6</code> | <code>dual_stack</code>. IPv6 is supported for workloads using
     * Redis engine version 6.2 onward or Memcached engine version 1.6.6 on all instances built on the <a
     * href="https://aws.amazon.com/ec2/nitro/">Nitro system</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedNetworkTypes(java.util.Collection)} or
     * {@link #withSupportedNetworkTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedNetworkTypes
     *        Either <code>ipv4</code> | <code>ipv6</code> | <code>dual_stack</code>. IPv6 is supported for workloads
     *        using Redis engine version 6.2 onward or Memcached engine version 1.6.6 on all instances built on the <a
     *        href="https://aws.amazon.com/ec2/nitro/">Nitro system</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkType
     */

    public CacheSubnetGroup withSupportedNetworkTypes(String... supportedNetworkTypes) {
        if (this.supportedNetworkTypes == null) {
            setSupportedNetworkTypes(new com.amazonaws.internal.SdkInternalList<String>(supportedNetworkTypes.length));
        }
        for (String ele : supportedNetworkTypes) {
            this.supportedNetworkTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Either <code>ipv4</code> | <code>ipv6</code> | <code>dual_stack</code>. IPv6 is supported for workloads using
     * Redis engine version 6.2 onward or Memcached engine version 1.6.6 on all instances built on the <a
     * href="https://aws.amazon.com/ec2/nitro/">Nitro system</a>.
     * </p>
     * 
     * @param supportedNetworkTypes
     *        Either <code>ipv4</code> | <code>ipv6</code> | <code>dual_stack</code>. IPv6 is supported for workloads
     *        using Redis engine version 6.2 onward or Memcached engine version 1.6.6 on all instances built on the <a
     *        href="https://aws.amazon.com/ec2/nitro/">Nitro system</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkType
     */

    public CacheSubnetGroup withSupportedNetworkTypes(java.util.Collection<String> supportedNetworkTypes) {
        setSupportedNetworkTypes(supportedNetworkTypes);
        return this;
    }

    /**
     * <p>
     * Either <code>ipv4</code> | <code>ipv6</code> | <code>dual_stack</code>. IPv6 is supported for workloads using
     * Redis engine version 6.2 onward or Memcached engine version 1.6.6 on all instances built on the <a
     * href="https://aws.amazon.com/ec2/nitro/">Nitro system</a>.
     * </p>
     * 
     * @param supportedNetworkTypes
     *        Either <code>ipv4</code> | <code>ipv6</code> | <code>dual_stack</code>. IPv6 is supported for workloads
     *        using Redis engine version 6.2 onward or Memcached engine version 1.6.6 on all instances built on the <a
     *        href="https://aws.amazon.com/ec2/nitro/">Nitro system</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkType
     */

    public CacheSubnetGroup withSupportedNetworkTypes(NetworkType... supportedNetworkTypes) {
        com.amazonaws.internal.SdkInternalList<String> supportedNetworkTypesCopy = new com.amazonaws.internal.SdkInternalList<String>(
                supportedNetworkTypes.length);
        for (NetworkType value : supportedNetworkTypes) {
            supportedNetworkTypesCopy.add(value.toString());
        }
        if (getSupportedNetworkTypes() == null) {
            setSupportedNetworkTypes(supportedNetworkTypesCopy);
        } else {
            getSupportedNetworkTypes().addAll(supportedNetworkTypesCopy);
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
        if (getCacheSubnetGroupName() != null)
            sb.append("CacheSubnetGroupName: ").append(getCacheSubnetGroupName()).append(",");
        if (getCacheSubnetGroupDescription() != null)
            sb.append("CacheSubnetGroupDescription: ").append(getCacheSubnetGroupDescription()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getSubnets() != null)
            sb.append("Subnets: ").append(getSubnets()).append(",");
        if (getARN() != null)
            sb.append("ARN: ").append(getARN()).append(",");
        if (getSupportedNetworkTypes() != null)
            sb.append("SupportedNetworkTypes: ").append(getSupportedNetworkTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CacheSubnetGroup == false)
            return false;
        CacheSubnetGroup other = (CacheSubnetGroup) obj;
        if (other.getCacheSubnetGroupName() == null ^ this.getCacheSubnetGroupName() == null)
            return false;
        if (other.getCacheSubnetGroupName() != null && other.getCacheSubnetGroupName().equals(this.getCacheSubnetGroupName()) == false)
            return false;
        if (other.getCacheSubnetGroupDescription() == null ^ this.getCacheSubnetGroupDescription() == null)
            return false;
        if (other.getCacheSubnetGroupDescription() != null && other.getCacheSubnetGroupDescription().equals(this.getCacheSubnetGroupDescription()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getSubnets() == null ^ this.getSubnets() == null)
            return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getSupportedNetworkTypes() == null ^ this.getSupportedNetworkTypes() == null)
            return false;
        if (other.getSupportedNetworkTypes() != null && other.getSupportedNetworkTypes().equals(this.getSupportedNetworkTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCacheSubnetGroupName() == null) ? 0 : getCacheSubnetGroupName().hashCode());
        hashCode = prime * hashCode + ((getCacheSubnetGroupDescription() == null) ? 0 : getCacheSubnetGroupDescription().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getSupportedNetworkTypes() == null) ? 0 : getSupportedNetworkTypes().hashCode());
        return hashCode;
    }

    @Override
    public CacheSubnetGroup clone() {
        try {
            return (CacheSubnetGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
