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
     * The CIDR block to assign Kubernetes service IP addresses from. If you don't specify a block, Kubernetes assigns
     * addresses from either the 10.100.0.0/16 or 172.20.0.0/16 CIDR blocks. We recommend that you specify a block that
     * does not overlap with resources in other networks that are peered or connected to your VPC. The block must meet
     * the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Within one of the following private IP address blocks: 10.0.0.0/8, 172.16.0.0.0/12, or 192.168.0.0/16.
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
     * The CIDR block to assign Kubernetes service IP addresses from. If you don't specify a block, Kubernetes assigns
     * addresses from either the 10.100.0.0/16 or 172.20.0.0/16 CIDR blocks. We recommend that you specify a block that
     * does not overlap with resources in other networks that are peered or connected to your VPC. The block must meet
     * the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Within one of the following private IP address blocks: 10.0.0.0/8, 172.16.0.0.0/12, or 192.168.0.0/16.
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
     *        The CIDR block to assign Kubernetes service IP addresses from. If you don't specify a block, Kubernetes
     *        assigns addresses from either the 10.100.0.0/16 or 172.20.0.0/16 CIDR blocks. We recommend that you
     *        specify a block that does not overlap with resources in other networks that are peered or connected to
     *        your VPC. The block must meet the following requirements:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Within one of the following private IP address blocks: 10.0.0.0/8, 172.16.0.0.0/12, or 192.168.0.0/16.
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
     * The CIDR block to assign Kubernetes service IP addresses from. If you don't specify a block, Kubernetes assigns
     * addresses from either the 10.100.0.0/16 or 172.20.0.0/16 CIDR blocks. We recommend that you specify a block that
     * does not overlap with resources in other networks that are peered or connected to your VPC. The block must meet
     * the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Within one of the following private IP address blocks: 10.0.0.0/8, 172.16.0.0.0/12, or 192.168.0.0/16.
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
     * @return The CIDR block to assign Kubernetes service IP addresses from. If you don't specify a block, Kubernetes
     *         assigns addresses from either the 10.100.0.0/16 or 172.20.0.0/16 CIDR blocks. We recommend that you
     *         specify a block that does not overlap with resources in other networks that are peered or connected to
     *         your VPC. The block must meet the following requirements:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Within one of the following private IP address blocks: 10.0.0.0/8, 172.16.0.0.0/12, or 192.168.0.0/16.
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
     * The CIDR block to assign Kubernetes service IP addresses from. If you don't specify a block, Kubernetes assigns
     * addresses from either the 10.100.0.0/16 or 172.20.0.0/16 CIDR blocks. We recommend that you specify a block that
     * does not overlap with resources in other networks that are peered or connected to your VPC. The block must meet
     * the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Within one of the following private IP address blocks: 10.0.0.0/8, 172.16.0.0.0/12, or 192.168.0.0/16.
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
     *        The CIDR block to assign Kubernetes service IP addresses from. If you don't specify a block, Kubernetes
     *        assigns addresses from either the 10.100.0.0/16 or 172.20.0.0/16 CIDR blocks. We recommend that you
     *        specify a block that does not overlap with resources in other networks that are peered or connected to
     *        your VPC. The block must meet the following requirements:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Within one of the following private IP address blocks: 10.0.0.0/8, 172.16.0.0.0/12, or 192.168.0.0/16.
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
            sb.append("ServiceIpv4Cidr: ").append(getServiceIpv4Cidr());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceIpv4Cidr() == null) ? 0 : getServiceIpv4Cidr().hashCode());
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
