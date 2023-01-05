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
 * The Kubernetes network configuration for the cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/KubernetesNetworkConfigRequest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KubernetesNetworkConfigRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Don't specify a value if you select <code>ipv6</code> for <b>ipFamily</b>. The CIDR block to assign Kubernetes
     * service IP addresses from. If you don't specify a block, Kubernetes assigns addresses from either the
     * <code>10.100.0.0/16</code> or <code>172.20.0.0/16</code> CIDR blocks. We recommend that you specify a block that
     * does not overlap with resources in other networks that are peered or connected to your VPC. The block must meet
     * the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Within one of the following private IP address blocks: <code>10.0.0.0/8</code>, <code>172.16.0.0/12</code>, or
     * <code>192.168.0.0/16</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Doesn't overlap with any CIDR block assigned to the VPC that you selected for VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * Between /24 and /12.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * You can only specify a custom CIDR block when you create a cluster and can't change this value once the cluster
     * is created.
     * </p>
     * </important>
     */
    private String serviceIpv4Cidr;
    /**
     * <p>
     * Specify which IP family is used to assign Kubernetes pod and service IP addresses. If you don't specify a value,
     * <code>ipv4</code> is used by default. You can only specify an IP family when you create a cluster and can't
     * change this value once the cluster is created. If you specify <code>ipv6</code>, the VPC and subnets that you
     * specify for cluster creation must have both <code>IPv4</code> and <code>IPv6</code> CIDR blocks assigned to them.
     * You can't specify <code>ipv6</code> for clusters in China Regions.
     * </p>
     * <p>
     * You can only specify <code>ipv6</code> for <code>1.21</code> and later clusters that use version
     * <code>1.10.1</code> or later of the Amazon VPC CNI add-on. If you specify <code>ipv6</code>, then ensure that
     * your VPC meets the requirements listed in the considerations listed in <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/cni-ipv6.html">Assigning IPv6 addresses to pods and
     * services</a> in the Amazon EKS User Guide. Kubernetes assigns services <code>IPv6</code> addresses from the
     * unique local address range <code>(fc00::/7)</code>. You can't specify a custom <code>IPv6</code> CIDR block. Pod
     * addresses are assigned from the subnet's <code>IPv6</code> CIDR.
     * </p>
     */
    private String ipFamily;

    /**
     * <p>
     * Don't specify a value if you select <code>ipv6</code> for <b>ipFamily</b>. The CIDR block to assign Kubernetes
     * service IP addresses from. If you don't specify a block, Kubernetes assigns addresses from either the
     * <code>10.100.0.0/16</code> or <code>172.20.0.0/16</code> CIDR blocks. We recommend that you specify a block that
     * does not overlap with resources in other networks that are peered or connected to your VPC. The block must meet
     * the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Within one of the following private IP address blocks: <code>10.0.0.0/8</code>, <code>172.16.0.0/12</code>, or
     * <code>192.168.0.0/16</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Doesn't overlap with any CIDR block assigned to the VPC that you selected for VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * Between /24 and /12.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * You can only specify a custom CIDR block when you create a cluster and can't change this value once the cluster
     * is created.
     * </p>
     * </important>
     * 
     * @param serviceIpv4Cidr
     *        Don't specify a value if you select <code>ipv6</code> for <b>ipFamily</b>. The CIDR block to assign
     *        Kubernetes service IP addresses from. If you don't specify a block, Kubernetes assigns addresses from
     *        either the <code>10.100.0.0/16</code> or <code>172.20.0.0/16</code> CIDR blocks. We recommend that you
     *        specify a block that does not overlap with resources in other networks that are peered or connected to
     *        your VPC. The block must meet the following requirements:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Within one of the following private IP address blocks: <code>10.0.0.0/8</code>, <code>172.16.0.0/12</code>
     *        , or <code>192.168.0.0/16</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Doesn't overlap with any CIDR block assigned to the VPC that you selected for VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Between /24 and /12.
     *        </p>
     *        </li>
     *        </ul>
     *        <important>
     *        <p>
     *        You can only specify a custom CIDR block when you create a cluster and can't change this value once the
     *        cluster is created.
     *        </p>
     */

    public void setServiceIpv4Cidr(String serviceIpv4Cidr) {
        this.serviceIpv4Cidr = serviceIpv4Cidr;
    }

    /**
     * <p>
     * Don't specify a value if you select <code>ipv6</code> for <b>ipFamily</b>. The CIDR block to assign Kubernetes
     * service IP addresses from. If you don't specify a block, Kubernetes assigns addresses from either the
     * <code>10.100.0.0/16</code> or <code>172.20.0.0/16</code> CIDR blocks. We recommend that you specify a block that
     * does not overlap with resources in other networks that are peered or connected to your VPC. The block must meet
     * the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Within one of the following private IP address blocks: <code>10.0.0.0/8</code>, <code>172.16.0.0/12</code>, or
     * <code>192.168.0.0/16</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Doesn't overlap with any CIDR block assigned to the VPC that you selected for VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * Between /24 and /12.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * You can only specify a custom CIDR block when you create a cluster and can't change this value once the cluster
     * is created.
     * </p>
     * </important>
     * 
     * @return Don't specify a value if you select <code>ipv6</code> for <b>ipFamily</b>. The CIDR block to assign
     *         Kubernetes service IP addresses from. If you don't specify a block, Kubernetes assigns addresses from
     *         either the <code>10.100.0.0/16</code> or <code>172.20.0.0/16</code> CIDR blocks. We recommend that you
     *         specify a block that does not overlap with resources in other networks that are peered or connected to
     *         your VPC. The block must meet the following requirements:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Within one of the following private IP address blocks: <code>10.0.0.0/8</code>,
     *         <code>172.16.0.0/12</code>, or <code>192.168.0.0/16</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Doesn't overlap with any CIDR block assigned to the VPC that you selected for VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Between /24 and /12.
     *         </p>
     *         </li>
     *         </ul>
     *         <important>
     *         <p>
     *         You can only specify a custom CIDR block when you create a cluster and can't change this value once the
     *         cluster is created.
     *         </p>
     */

    public String getServiceIpv4Cidr() {
        return this.serviceIpv4Cidr;
    }

    /**
     * <p>
     * Don't specify a value if you select <code>ipv6</code> for <b>ipFamily</b>. The CIDR block to assign Kubernetes
     * service IP addresses from. If you don't specify a block, Kubernetes assigns addresses from either the
     * <code>10.100.0.0/16</code> or <code>172.20.0.0/16</code> CIDR blocks. We recommend that you specify a block that
     * does not overlap with resources in other networks that are peered or connected to your VPC. The block must meet
     * the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Within one of the following private IP address blocks: <code>10.0.0.0/8</code>, <code>172.16.0.0/12</code>, or
     * <code>192.168.0.0/16</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Doesn't overlap with any CIDR block assigned to the VPC that you selected for VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * Between /24 and /12.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * You can only specify a custom CIDR block when you create a cluster and can't change this value once the cluster
     * is created.
     * </p>
     * </important>
     * 
     * @param serviceIpv4Cidr
     *        Don't specify a value if you select <code>ipv6</code> for <b>ipFamily</b>. The CIDR block to assign
     *        Kubernetes service IP addresses from. If you don't specify a block, Kubernetes assigns addresses from
     *        either the <code>10.100.0.0/16</code> or <code>172.20.0.0/16</code> CIDR blocks. We recommend that you
     *        specify a block that does not overlap with resources in other networks that are peered or connected to
     *        your VPC. The block must meet the following requirements:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Within one of the following private IP address blocks: <code>10.0.0.0/8</code>, <code>172.16.0.0/12</code>
     *        , or <code>192.168.0.0/16</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Doesn't overlap with any CIDR block assigned to the VPC that you selected for VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Between /24 and /12.
     *        </p>
     *        </li>
     *        </ul>
     *        <important>
     *        <p>
     *        You can only specify a custom CIDR block when you create a cluster and can't change this value once the
     *        cluster is created.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesNetworkConfigRequest withServiceIpv4Cidr(String serviceIpv4Cidr) {
        setServiceIpv4Cidr(serviceIpv4Cidr);
        return this;
    }

    /**
     * <p>
     * Specify which IP family is used to assign Kubernetes pod and service IP addresses. If you don't specify a value,
     * <code>ipv4</code> is used by default. You can only specify an IP family when you create a cluster and can't
     * change this value once the cluster is created. If you specify <code>ipv6</code>, the VPC and subnets that you
     * specify for cluster creation must have both <code>IPv4</code> and <code>IPv6</code> CIDR blocks assigned to them.
     * You can't specify <code>ipv6</code> for clusters in China Regions.
     * </p>
     * <p>
     * You can only specify <code>ipv6</code> for <code>1.21</code> and later clusters that use version
     * <code>1.10.1</code> or later of the Amazon VPC CNI add-on. If you specify <code>ipv6</code>, then ensure that
     * your VPC meets the requirements listed in the considerations listed in <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/cni-ipv6.html">Assigning IPv6 addresses to pods and
     * services</a> in the Amazon EKS User Guide. Kubernetes assigns services <code>IPv6</code> addresses from the
     * unique local address range <code>(fc00::/7)</code>. You can't specify a custom <code>IPv6</code> CIDR block. Pod
     * addresses are assigned from the subnet's <code>IPv6</code> CIDR.
     * </p>
     * 
     * @param ipFamily
     *        Specify which IP family is used to assign Kubernetes pod and service IP addresses. If you don't specify a
     *        value, <code>ipv4</code> is used by default. You can only specify an IP family when you create a cluster
     *        and can't change this value once the cluster is created. If you specify <code>ipv6</code>, the VPC and
     *        subnets that you specify for cluster creation must have both <code>IPv4</code> and <code>IPv6</code> CIDR
     *        blocks assigned to them. You can't specify <code>ipv6</code> for clusters in China Regions.</p>
     *        <p>
     *        You can only specify <code>ipv6</code> for <code>1.21</code> and later clusters that use version
     *        <code>1.10.1</code> or later of the Amazon VPC CNI add-on. If you specify <code>ipv6</code>, then ensure
     *        that your VPC meets the requirements listed in the considerations listed in <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/cni-ipv6.html">Assigning IPv6 addresses to pods and
     *        services</a> in the Amazon EKS User Guide. Kubernetes assigns services <code>IPv6</code> addresses from
     *        the unique local address range <code>(fc00::/7)</code>. You can't specify a custom <code>IPv6</code> CIDR
     *        block. Pod addresses are assigned from the subnet's <code>IPv6</code> CIDR.
     * @see IpFamily
     */

    public void setIpFamily(String ipFamily) {
        this.ipFamily = ipFamily;
    }

    /**
     * <p>
     * Specify which IP family is used to assign Kubernetes pod and service IP addresses. If you don't specify a value,
     * <code>ipv4</code> is used by default. You can only specify an IP family when you create a cluster and can't
     * change this value once the cluster is created. If you specify <code>ipv6</code>, the VPC and subnets that you
     * specify for cluster creation must have both <code>IPv4</code> and <code>IPv6</code> CIDR blocks assigned to them.
     * You can't specify <code>ipv6</code> for clusters in China Regions.
     * </p>
     * <p>
     * You can only specify <code>ipv6</code> for <code>1.21</code> and later clusters that use version
     * <code>1.10.1</code> or later of the Amazon VPC CNI add-on. If you specify <code>ipv6</code>, then ensure that
     * your VPC meets the requirements listed in the considerations listed in <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/cni-ipv6.html">Assigning IPv6 addresses to pods and
     * services</a> in the Amazon EKS User Guide. Kubernetes assigns services <code>IPv6</code> addresses from the
     * unique local address range <code>(fc00::/7)</code>. You can't specify a custom <code>IPv6</code> CIDR block. Pod
     * addresses are assigned from the subnet's <code>IPv6</code> CIDR.
     * </p>
     * 
     * @return Specify which IP family is used to assign Kubernetes pod and service IP addresses. If you don't specify a
     *         value, <code>ipv4</code> is used by default. You can only specify an IP family when you create a cluster
     *         and can't change this value once the cluster is created. If you specify <code>ipv6</code>, the VPC and
     *         subnets that you specify for cluster creation must have both <code>IPv4</code> and <code>IPv6</code> CIDR
     *         blocks assigned to them. You can't specify <code>ipv6</code> for clusters in China Regions.</p>
     *         <p>
     *         You can only specify <code>ipv6</code> for <code>1.21</code> and later clusters that use version
     *         <code>1.10.1</code> or later of the Amazon VPC CNI add-on. If you specify <code>ipv6</code>, then ensure
     *         that your VPC meets the requirements listed in the considerations listed in <a
     *         href="https://docs.aws.amazon.com/eks/latest/userguide/cni-ipv6.html">Assigning IPv6 addresses to pods
     *         and services</a> in the Amazon EKS User Guide. Kubernetes assigns services <code>IPv6</code> addresses
     *         from the unique local address range <code>(fc00::/7)</code>. You can't specify a custom <code>IPv6</code>
     *         CIDR block. Pod addresses are assigned from the subnet's <code>IPv6</code> CIDR.
     * @see IpFamily
     */

    public String getIpFamily() {
        return this.ipFamily;
    }

    /**
     * <p>
     * Specify which IP family is used to assign Kubernetes pod and service IP addresses. If you don't specify a value,
     * <code>ipv4</code> is used by default. You can only specify an IP family when you create a cluster and can't
     * change this value once the cluster is created. If you specify <code>ipv6</code>, the VPC and subnets that you
     * specify for cluster creation must have both <code>IPv4</code> and <code>IPv6</code> CIDR blocks assigned to them.
     * You can't specify <code>ipv6</code> for clusters in China Regions.
     * </p>
     * <p>
     * You can only specify <code>ipv6</code> for <code>1.21</code> and later clusters that use version
     * <code>1.10.1</code> or later of the Amazon VPC CNI add-on. If you specify <code>ipv6</code>, then ensure that
     * your VPC meets the requirements listed in the considerations listed in <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/cni-ipv6.html">Assigning IPv6 addresses to pods and
     * services</a> in the Amazon EKS User Guide. Kubernetes assigns services <code>IPv6</code> addresses from the
     * unique local address range <code>(fc00::/7)</code>. You can't specify a custom <code>IPv6</code> CIDR block. Pod
     * addresses are assigned from the subnet's <code>IPv6</code> CIDR.
     * </p>
     * 
     * @param ipFamily
     *        Specify which IP family is used to assign Kubernetes pod and service IP addresses. If you don't specify a
     *        value, <code>ipv4</code> is used by default. You can only specify an IP family when you create a cluster
     *        and can't change this value once the cluster is created. If you specify <code>ipv6</code>, the VPC and
     *        subnets that you specify for cluster creation must have both <code>IPv4</code> and <code>IPv6</code> CIDR
     *        blocks assigned to them. You can't specify <code>ipv6</code> for clusters in China Regions.</p>
     *        <p>
     *        You can only specify <code>ipv6</code> for <code>1.21</code> and later clusters that use version
     *        <code>1.10.1</code> or later of the Amazon VPC CNI add-on. If you specify <code>ipv6</code>, then ensure
     *        that your VPC meets the requirements listed in the considerations listed in <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/cni-ipv6.html">Assigning IPv6 addresses to pods and
     *        services</a> in the Amazon EKS User Guide. Kubernetes assigns services <code>IPv6</code> addresses from
     *        the unique local address range <code>(fc00::/7)</code>. You can't specify a custom <code>IPv6</code> CIDR
     *        block. Pod addresses are assigned from the subnet's <code>IPv6</code> CIDR.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpFamily
     */

    public KubernetesNetworkConfigRequest withIpFamily(String ipFamily) {
        setIpFamily(ipFamily);
        return this;
    }

    /**
     * <p>
     * Specify which IP family is used to assign Kubernetes pod and service IP addresses. If you don't specify a value,
     * <code>ipv4</code> is used by default. You can only specify an IP family when you create a cluster and can't
     * change this value once the cluster is created. If you specify <code>ipv6</code>, the VPC and subnets that you
     * specify for cluster creation must have both <code>IPv4</code> and <code>IPv6</code> CIDR blocks assigned to them.
     * You can't specify <code>ipv6</code> for clusters in China Regions.
     * </p>
     * <p>
     * You can only specify <code>ipv6</code> for <code>1.21</code> and later clusters that use version
     * <code>1.10.1</code> or later of the Amazon VPC CNI add-on. If you specify <code>ipv6</code>, then ensure that
     * your VPC meets the requirements listed in the considerations listed in <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/cni-ipv6.html">Assigning IPv6 addresses to pods and
     * services</a> in the Amazon EKS User Guide. Kubernetes assigns services <code>IPv6</code> addresses from the
     * unique local address range <code>(fc00::/7)</code>. You can't specify a custom <code>IPv6</code> CIDR block. Pod
     * addresses are assigned from the subnet's <code>IPv6</code> CIDR.
     * </p>
     * 
     * @param ipFamily
     *        Specify which IP family is used to assign Kubernetes pod and service IP addresses. If you don't specify a
     *        value, <code>ipv4</code> is used by default. You can only specify an IP family when you create a cluster
     *        and can't change this value once the cluster is created. If you specify <code>ipv6</code>, the VPC and
     *        subnets that you specify for cluster creation must have both <code>IPv4</code> and <code>IPv6</code> CIDR
     *        blocks assigned to them. You can't specify <code>ipv6</code> for clusters in China Regions.</p>
     *        <p>
     *        You can only specify <code>ipv6</code> for <code>1.21</code> and later clusters that use version
     *        <code>1.10.1</code> or later of the Amazon VPC CNI add-on. If you specify <code>ipv6</code>, then ensure
     *        that your VPC meets the requirements listed in the considerations listed in <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/cni-ipv6.html">Assigning IPv6 addresses to pods and
     *        services</a> in the Amazon EKS User Guide. Kubernetes assigns services <code>IPv6</code> addresses from
     *        the unique local address range <code>(fc00::/7)</code>. You can't specify a custom <code>IPv6</code> CIDR
     *        block. Pod addresses are assigned from the subnet's <code>IPv6</code> CIDR.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpFamily
     */

    public KubernetesNetworkConfigRequest withIpFamily(IpFamily ipFamily) {
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

        if (obj instanceof KubernetesNetworkConfigRequest == false)
            return false;
        KubernetesNetworkConfigRequest other = (KubernetesNetworkConfigRequest) obj;
        if (other.getServiceIpv4Cidr() == null ^ this.getServiceIpv4Cidr() == null)
            return false;
        if (other.getServiceIpv4Cidr() != null && other.getServiceIpv4Cidr().equals(this.getServiceIpv4Cidr()) == false)
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
        hashCode = prime * hashCode + ((getIpFamily() == null) ? 0 : getIpFamily().hashCode());
        return hashCode;
    }

    @Override
    public KubernetesNetworkConfigRequest clone() {
        try {
            return (KubernetesNetworkConfigRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.KubernetesNetworkConfigRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
