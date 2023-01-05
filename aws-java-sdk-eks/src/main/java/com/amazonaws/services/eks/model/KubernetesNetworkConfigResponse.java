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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Kubernetes network configuration for the cluster. The response contains a value for <b>serviceIpv6Cidr</b> or
 * <b>serviceIpv4Cidr</b>, but not both.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/KubernetesNetworkConfigResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KubernetesNetworkConfigResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The CIDR block that Kubernetes pod and service IP addresses are assigned from. Kubernetes assigns addresses from
     * an IPv4 CIDR block assigned to a subnet that the node is in. If you didn't specify a CIDR block when you created
     * the cluster, then Kubernetes assigns addresses from either the <code>10.100.0.0/16</code> or
     * <code>172.20.0.0/16</code> CIDR blocks. If this was specified, then it was specified when the cluster was created
     * and it can't be changed.
     * </p>
     */
    private String serviceIpv4Cidr;
    /**
     * <p>
     * The CIDR block that Kubernetes pod and service IP addresses are assigned from if you created a 1.21 or later
     * cluster with version 1.10.1 or later of the Amazon VPC CNI add-on and specified <code>ipv6</code> for
     * <b>ipFamily</b> when you created the cluster. Kubernetes assigns service addresses from the unique local address
     * range (<code>fc00::/7</code>) because you can't specify a custom IPv6 CIDR block when you create the cluster.
     * </p>
     */
    private String serviceIpv6Cidr;
    /**
     * <p>
     * The IP family used to assign Kubernetes pod and service IP addresses. The IP family is always <code>ipv4</code>,
     * unless you have a <code>1.21</code> or later cluster running version 1.10.1 or later of the Amazon VPC CNI add-on
     * and specified <code>ipv6</code> when you created the cluster.
     * </p>
     */
    private String ipFamily;

    /**
     * <p>
     * The CIDR block that Kubernetes pod and service IP addresses are assigned from. Kubernetes assigns addresses from
     * an IPv4 CIDR block assigned to a subnet that the node is in. If you didn't specify a CIDR block when you created
     * the cluster, then Kubernetes assigns addresses from either the <code>10.100.0.0/16</code> or
     * <code>172.20.0.0/16</code> CIDR blocks. If this was specified, then it was specified when the cluster was created
     * and it can't be changed.
     * </p>
     * 
     * @param serviceIpv4Cidr
     *        The CIDR block that Kubernetes pod and service IP addresses are assigned from. Kubernetes assigns
     *        addresses from an IPv4 CIDR block assigned to a subnet that the node is in. If you didn't specify a CIDR
     *        block when you created the cluster, then Kubernetes assigns addresses from either the
     *        <code>10.100.0.0/16</code> or <code>172.20.0.0/16</code> CIDR blocks. If this was specified, then it was
     *        specified when the cluster was created and it can't be changed.
     */

    public void setServiceIpv4Cidr(String serviceIpv4Cidr) {
        this.serviceIpv4Cidr = serviceIpv4Cidr;
    }

    /**
     * <p>
     * The CIDR block that Kubernetes pod and service IP addresses are assigned from. Kubernetes assigns addresses from
     * an IPv4 CIDR block assigned to a subnet that the node is in. If you didn't specify a CIDR block when you created
     * the cluster, then Kubernetes assigns addresses from either the <code>10.100.0.0/16</code> or
     * <code>172.20.0.0/16</code> CIDR blocks. If this was specified, then it was specified when the cluster was created
     * and it can't be changed.
     * </p>
     * 
     * @return The CIDR block that Kubernetes pod and service IP addresses are assigned from. Kubernetes assigns
     *         addresses from an IPv4 CIDR block assigned to a subnet that the node is in. If you didn't specify a CIDR
     *         block when you created the cluster, then Kubernetes assigns addresses from either the
     *         <code>10.100.0.0/16</code> or <code>172.20.0.0/16</code> CIDR blocks. If this was specified, then it was
     *         specified when the cluster was created and it can't be changed.
     */

    public String getServiceIpv4Cidr() {
        return this.serviceIpv4Cidr;
    }

    /**
     * <p>
     * The CIDR block that Kubernetes pod and service IP addresses are assigned from. Kubernetes assigns addresses from
     * an IPv4 CIDR block assigned to a subnet that the node is in. If you didn't specify a CIDR block when you created
     * the cluster, then Kubernetes assigns addresses from either the <code>10.100.0.0/16</code> or
     * <code>172.20.0.0/16</code> CIDR blocks. If this was specified, then it was specified when the cluster was created
     * and it can't be changed.
     * </p>
     * 
     * @param serviceIpv4Cidr
     *        The CIDR block that Kubernetes pod and service IP addresses are assigned from. Kubernetes assigns
     *        addresses from an IPv4 CIDR block assigned to a subnet that the node is in. If you didn't specify a CIDR
     *        block when you created the cluster, then Kubernetes assigns addresses from either the
     *        <code>10.100.0.0/16</code> or <code>172.20.0.0/16</code> CIDR blocks. If this was specified, then it was
     *        specified when the cluster was created and it can't be changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesNetworkConfigResponse withServiceIpv4Cidr(String serviceIpv4Cidr) {
        setServiceIpv4Cidr(serviceIpv4Cidr);
        return this;
    }

    /**
     * <p>
     * The CIDR block that Kubernetes pod and service IP addresses are assigned from if you created a 1.21 or later
     * cluster with version 1.10.1 or later of the Amazon VPC CNI add-on and specified <code>ipv6</code> for
     * <b>ipFamily</b> when you created the cluster. Kubernetes assigns service addresses from the unique local address
     * range (<code>fc00::/7</code>) because you can't specify a custom IPv6 CIDR block when you create the cluster.
     * </p>
     * 
     * @param serviceIpv6Cidr
     *        The CIDR block that Kubernetes pod and service IP addresses are assigned from if you created a 1.21 or
     *        later cluster with version 1.10.1 or later of the Amazon VPC CNI add-on and specified <code>ipv6</code>
     *        for <b>ipFamily</b> when you created the cluster. Kubernetes assigns service addresses from the unique
     *        local address range (<code>fc00::/7</code>) because you can't specify a custom IPv6 CIDR block when you
     *        create the cluster.
     */

    public void setServiceIpv6Cidr(String serviceIpv6Cidr) {
        this.serviceIpv6Cidr = serviceIpv6Cidr;
    }

    /**
     * <p>
     * The CIDR block that Kubernetes pod and service IP addresses are assigned from if you created a 1.21 or later
     * cluster with version 1.10.1 or later of the Amazon VPC CNI add-on and specified <code>ipv6</code> for
     * <b>ipFamily</b> when you created the cluster. Kubernetes assigns service addresses from the unique local address
     * range (<code>fc00::/7</code>) because you can't specify a custom IPv6 CIDR block when you create the cluster.
     * </p>
     * 
     * @return The CIDR block that Kubernetes pod and service IP addresses are assigned from if you created a 1.21 or
     *         later cluster with version 1.10.1 or later of the Amazon VPC CNI add-on and specified <code>ipv6</code>
     *         for <b>ipFamily</b> when you created the cluster. Kubernetes assigns service addresses from the unique
     *         local address range (<code>fc00::/7</code>) because you can't specify a custom IPv6 CIDR block when you
     *         create the cluster.
     */

    public String getServiceIpv6Cidr() {
        return this.serviceIpv6Cidr;
    }

    /**
     * <p>
     * The CIDR block that Kubernetes pod and service IP addresses are assigned from if you created a 1.21 or later
     * cluster with version 1.10.1 or later of the Amazon VPC CNI add-on and specified <code>ipv6</code> for
     * <b>ipFamily</b> when you created the cluster. Kubernetes assigns service addresses from the unique local address
     * range (<code>fc00::/7</code>) because you can't specify a custom IPv6 CIDR block when you create the cluster.
     * </p>
     * 
     * @param serviceIpv6Cidr
     *        The CIDR block that Kubernetes pod and service IP addresses are assigned from if you created a 1.21 or
     *        later cluster with version 1.10.1 or later of the Amazon VPC CNI add-on and specified <code>ipv6</code>
     *        for <b>ipFamily</b> when you created the cluster. Kubernetes assigns service addresses from the unique
     *        local address range (<code>fc00::/7</code>) because you can't specify a custom IPv6 CIDR block when you
     *        create the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesNetworkConfigResponse withServiceIpv6Cidr(String serviceIpv6Cidr) {
        setServiceIpv6Cidr(serviceIpv6Cidr);
        return this;
    }

    /**
     * <p>
     * The IP family used to assign Kubernetes pod and service IP addresses. The IP family is always <code>ipv4</code>,
     * unless you have a <code>1.21</code> or later cluster running version 1.10.1 or later of the Amazon VPC CNI add-on
     * and specified <code>ipv6</code> when you created the cluster.
     * </p>
     * 
     * @param ipFamily
     *        The IP family used to assign Kubernetes pod and service IP addresses. The IP family is always
     *        <code>ipv4</code>, unless you have a <code>1.21</code> or later cluster running version 1.10.1 or later of
     *        the Amazon VPC CNI add-on and specified <code>ipv6</code> when you created the cluster.
     * @see IpFamily
     */

    public void setIpFamily(String ipFamily) {
        this.ipFamily = ipFamily;
    }

    /**
     * <p>
     * The IP family used to assign Kubernetes pod and service IP addresses. The IP family is always <code>ipv4</code>,
     * unless you have a <code>1.21</code> or later cluster running version 1.10.1 or later of the Amazon VPC CNI add-on
     * and specified <code>ipv6</code> when you created the cluster.
     * </p>
     * 
     * @return The IP family used to assign Kubernetes pod and service IP addresses. The IP family is always
     *         <code>ipv4</code>, unless you have a <code>1.21</code> or later cluster running version 1.10.1 or later
     *         of the Amazon VPC CNI add-on and specified <code>ipv6</code> when you created the cluster.
     * @see IpFamily
     */

    public String getIpFamily() {
        return this.ipFamily;
    }

    /**
     * <p>
     * The IP family used to assign Kubernetes pod and service IP addresses. The IP family is always <code>ipv4</code>,
     * unless you have a <code>1.21</code> or later cluster running version 1.10.1 or later of the Amazon VPC CNI add-on
     * and specified <code>ipv6</code> when you created the cluster.
     * </p>
     * 
     * @param ipFamily
     *        The IP family used to assign Kubernetes pod and service IP addresses. The IP family is always
     *        <code>ipv4</code>, unless you have a <code>1.21</code> or later cluster running version 1.10.1 or later of
     *        the Amazon VPC CNI add-on and specified <code>ipv6</code> when you created the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpFamily
     */

    public KubernetesNetworkConfigResponse withIpFamily(String ipFamily) {
        setIpFamily(ipFamily);
        return this;
    }

    /**
     * <p>
     * The IP family used to assign Kubernetes pod and service IP addresses. The IP family is always <code>ipv4</code>,
     * unless you have a <code>1.21</code> or later cluster running version 1.10.1 or later of the Amazon VPC CNI add-on
     * and specified <code>ipv6</code> when you created the cluster.
     * </p>
     * 
     * @param ipFamily
     *        The IP family used to assign Kubernetes pod and service IP addresses. The IP family is always
     *        <code>ipv4</code>, unless you have a <code>1.21</code> or later cluster running version 1.10.1 or later of
     *        the Amazon VPC CNI add-on and specified <code>ipv6</code> when you created the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpFamily
     */

    public KubernetesNetworkConfigResponse withIpFamily(IpFamily ipFamily) {
        this.ipFamily = ipFamily.toString();
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
        if (getServiceIpv4Cidr() != null)
            sb.append("ServiceIpv4Cidr: ").append(getServiceIpv4Cidr()).append(",");
        if (getServiceIpv6Cidr() != null)
            sb.append("ServiceIpv6Cidr: ").append(getServiceIpv6Cidr()).append(",");
        if (getIpFamily() != null)
            sb.append("IpFamily: ").append(getIpFamily());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KubernetesNetworkConfigResponse == false)
            return false;
        KubernetesNetworkConfigResponse other = (KubernetesNetworkConfigResponse) obj;
        if (other.getServiceIpv4Cidr() == null ^ this.getServiceIpv4Cidr() == null)
            return false;
        if (other.getServiceIpv4Cidr() != null && other.getServiceIpv4Cidr().equals(this.getServiceIpv4Cidr()) == false)
            return false;
        if (other.getServiceIpv6Cidr() == null ^ this.getServiceIpv6Cidr() == null)
            return false;
        if (other.getServiceIpv6Cidr() != null && other.getServiceIpv6Cidr().equals(this.getServiceIpv6Cidr()) == false)
            return false;
        if (other.getIpFamily() == null ^ this.getIpFamily() == null)
            return false;
        if (other.getIpFamily() != null && other.getIpFamily().equals(this.getIpFamily()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceIpv4Cidr() == null) ? 0 : getServiceIpv4Cidr().hashCode());
        hashCode = prime * hashCode + ((getServiceIpv6Cidr() == null) ? 0 : getServiceIpv6Cidr().hashCode());
        hashCode = prime * hashCode + ((getIpFamily() == null) ? 0 : getIpFamily().hashCode());
        return hashCode;
    }

    @Override
    public KubernetesNetworkConfigResponse clone() {
        try {
            return (KubernetesNetworkConfigResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.KubernetesNetworkConfigResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
