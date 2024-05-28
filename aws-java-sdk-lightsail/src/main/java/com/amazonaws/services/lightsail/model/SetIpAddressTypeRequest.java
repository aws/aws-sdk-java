/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/SetIpAddressType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetIpAddressTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The resource type.
     * </p>
     * <p>
     * The resource values are <code>Distribution</code>, <code>Instance</code>, and <code>LoadBalancer</code>.
     * </p>
     * <note>
     * <p>
     * Distribution-related APIs are available only in the N. Virginia (<code>us-east-1</code>) Amazon Web Services
     * Region. Set your Amazon Web Services Region configuration to <code>us-east-1</code> to create, view, or edit
     * distributions.
     * </p>
     * </note>
     */
    private String resourceType;
    /**
     * <p>
     * The name of the resource for which to set the IP address type.
     * </p>
     */
    private String resourceName;
    /**
     * <p>
     * The IP address type to set for the specified resource.
     * </p>
     * <p>
     * The possible values are <code>ipv4</code> for IPv4 only, <code>ipv6</code> for IPv6 only, and
     * <code>dualstack</code> for IPv4 and IPv6.
     * </p>
     */
    private String ipAddressType;
    /**
     * <p>
     * Required parameter to accept the instance bundle update when changing to, and from, IPv6-only.
     * </p>
     * <note>
     * <p>
     * An instance bundle will change when switching from <code>dual-stack</code> or <code>ipv4</code>, to
     * <code>ipv6</code>. It also changes when switching from <code>ipv6</code>, to <code>dual-stack</code> or
     * <code>ipv4</code>.
     * </p>
     * <p>
     * You must include this parameter in the command to update the bundle. For example, if you switch from
     * <code>dual-stack</code> to <code>ipv6</code>, the bundle will be updated, and billing for the IPv6-only instance
     * bundle begins immediately.
     * </p>
     * </note>
     */
    private Boolean acceptBundleUpdate;

    /**
     * <p>
     * The resource type.
     * </p>
     * <p>
     * The resource values are <code>Distribution</code>, <code>Instance</code>, and <code>LoadBalancer</code>.
     * </p>
     * <note>
     * <p>
     * Distribution-related APIs are available only in the N. Virginia (<code>us-east-1</code>) Amazon Web Services
     * Region. Set your Amazon Web Services Region configuration to <code>us-east-1</code> to create, view, or edit
     * distributions.
     * </p>
     * </note>
     * 
     * @param resourceType
     *        The resource type.</p>
     *        <p>
     *        The resource values are <code>Distribution</code>, <code>Instance</code>, and <code>LoadBalancer</code>.
     *        </p>
     *        <note>
     *        <p>
     *        Distribution-related APIs are available only in the N. Virginia (<code>us-east-1</code>) Amazon Web
     *        Services Region. Set your Amazon Web Services Region configuration to <code>us-east-1</code> to create,
     *        view, or edit distributions.
     *        </p>
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * <p>
     * The resource values are <code>Distribution</code>, <code>Instance</code>, and <code>LoadBalancer</code>.
     * </p>
     * <note>
     * <p>
     * Distribution-related APIs are available only in the N. Virginia (<code>us-east-1</code>) Amazon Web Services
     * Region. Set your Amazon Web Services Region configuration to <code>us-east-1</code> to create, view, or edit
     * distributions.
     * </p>
     * </note>
     * 
     * @return The resource type.</p>
     *         <p>
     *         The resource values are <code>Distribution</code>, <code>Instance</code>, and <code>LoadBalancer</code>.
     *         </p>
     *         <note>
     *         <p>
     *         Distribution-related APIs are available only in the N. Virginia (<code>us-east-1</code>) Amazon Web
     *         Services Region. Set your Amazon Web Services Region configuration to <code>us-east-1</code> to create,
     *         view, or edit distributions.
     *         </p>
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * <p>
     * The resource values are <code>Distribution</code>, <code>Instance</code>, and <code>LoadBalancer</code>.
     * </p>
     * <note>
     * <p>
     * Distribution-related APIs are available only in the N. Virginia (<code>us-east-1</code>) Amazon Web Services
     * Region. Set your Amazon Web Services Region configuration to <code>us-east-1</code> to create, view, or edit
     * distributions.
     * </p>
     * </note>
     * 
     * @param resourceType
     *        The resource type.</p>
     *        <p>
     *        The resource values are <code>Distribution</code>, <code>Instance</code>, and <code>LoadBalancer</code>.
     *        </p>
     *        <note>
     *        <p>
     *        Distribution-related APIs are available only in the N. Virginia (<code>us-east-1</code>) Amazon Web
     *        Services Region. Set your Amazon Web Services Region configuration to <code>us-east-1</code> to create,
     *        view, or edit distributions.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public SetIpAddressTypeRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * <p>
     * The resource values are <code>Distribution</code>, <code>Instance</code>, and <code>LoadBalancer</code>.
     * </p>
     * <note>
     * <p>
     * Distribution-related APIs are available only in the N. Virginia (<code>us-east-1</code>) Amazon Web Services
     * Region. Set your Amazon Web Services Region configuration to <code>us-east-1</code> to create, view, or edit
     * distributions.
     * </p>
     * </note>
     * 
     * @param resourceType
     *        The resource type.</p>
     *        <p>
     *        The resource values are <code>Distribution</code>, <code>Instance</code>, and <code>LoadBalancer</code>.
     *        </p>
     *        <note>
     *        <p>
     *        Distribution-related APIs are available only in the N. Virginia (<code>us-east-1</code>) Amazon Web
     *        Services Region. Set your Amazon Web Services Region configuration to <code>us-east-1</code> to create,
     *        view, or edit distributions.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public SetIpAddressTypeRequest withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the resource for which to set the IP address type.
     * </p>
     * 
     * @param resourceName
     *        The name of the resource for which to set the IP address type.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The name of the resource for which to set the IP address type.
     * </p>
     * 
     * @return The name of the resource for which to set the IP address type.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The name of the resource for which to set the IP address type.
     * </p>
     * 
     * @param resourceName
     *        The name of the resource for which to set the IP address type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetIpAddressTypeRequest withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

    /**
     * <p>
     * The IP address type to set for the specified resource.
     * </p>
     * <p>
     * The possible values are <code>ipv4</code> for IPv4 only, <code>ipv6</code> for IPv6 only, and
     * <code>dualstack</code> for IPv4 and IPv6.
     * </p>
     * 
     * @param ipAddressType
     *        The IP address type to set for the specified resource.</p>
     *        <p>
     *        The possible values are <code>ipv4</code> for IPv4 only, <code>ipv6</code> for IPv6 only, and
     *        <code>dualstack</code> for IPv4 and IPv6.
     * @see IpAddressType
     */

    public void setIpAddressType(String ipAddressType) {
        this.ipAddressType = ipAddressType;
    }

    /**
     * <p>
     * The IP address type to set for the specified resource.
     * </p>
     * <p>
     * The possible values are <code>ipv4</code> for IPv4 only, <code>ipv6</code> for IPv6 only, and
     * <code>dualstack</code> for IPv4 and IPv6.
     * </p>
     * 
     * @return The IP address type to set for the specified resource.</p>
     *         <p>
     *         The possible values are <code>ipv4</code> for IPv4 only, <code>ipv6</code> for IPv6 only, and
     *         <code>dualstack</code> for IPv4 and IPv6.
     * @see IpAddressType
     */

    public String getIpAddressType() {
        return this.ipAddressType;
    }

    /**
     * <p>
     * The IP address type to set for the specified resource.
     * </p>
     * <p>
     * The possible values are <code>ipv4</code> for IPv4 only, <code>ipv6</code> for IPv6 only, and
     * <code>dualstack</code> for IPv4 and IPv6.
     * </p>
     * 
     * @param ipAddressType
     *        The IP address type to set for the specified resource.</p>
     *        <p>
     *        The possible values are <code>ipv4</code> for IPv4 only, <code>ipv6</code> for IPv6 only, and
     *        <code>dualstack</code> for IPv4 and IPv6.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpAddressType
     */

    public SetIpAddressTypeRequest withIpAddressType(String ipAddressType) {
        setIpAddressType(ipAddressType);
        return this;
    }

    /**
     * <p>
     * The IP address type to set for the specified resource.
     * </p>
     * <p>
     * The possible values are <code>ipv4</code> for IPv4 only, <code>ipv6</code> for IPv6 only, and
     * <code>dualstack</code> for IPv4 and IPv6.
     * </p>
     * 
     * @param ipAddressType
     *        The IP address type to set for the specified resource.</p>
     *        <p>
     *        The possible values are <code>ipv4</code> for IPv4 only, <code>ipv6</code> for IPv6 only, and
     *        <code>dualstack</code> for IPv4 and IPv6.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpAddressType
     */

    public SetIpAddressTypeRequest withIpAddressType(IpAddressType ipAddressType) {
        this.ipAddressType = ipAddressType.toString();
        return this;
    }

    /**
     * <p>
     * Required parameter to accept the instance bundle update when changing to, and from, IPv6-only.
     * </p>
     * <note>
     * <p>
     * An instance bundle will change when switching from <code>dual-stack</code> or <code>ipv4</code>, to
     * <code>ipv6</code>. It also changes when switching from <code>ipv6</code>, to <code>dual-stack</code> or
     * <code>ipv4</code>.
     * </p>
     * <p>
     * You must include this parameter in the command to update the bundle. For example, if you switch from
     * <code>dual-stack</code> to <code>ipv6</code>, the bundle will be updated, and billing for the IPv6-only instance
     * bundle begins immediately.
     * </p>
     * </note>
     * 
     * @param acceptBundleUpdate
     *        Required parameter to accept the instance bundle update when changing to, and from, IPv6-only.</p> <note>
     *        <p>
     *        An instance bundle will change when switching from <code>dual-stack</code> or <code>ipv4</code>, to
     *        <code>ipv6</code>. It also changes when switching from <code>ipv6</code>, to <code>dual-stack</code> or
     *        <code>ipv4</code>.
     *        </p>
     *        <p>
     *        You must include this parameter in the command to update the bundle. For example, if you switch from
     *        <code>dual-stack</code> to <code>ipv6</code>, the bundle will be updated, and billing for the IPv6-only
     *        instance bundle begins immediately.
     *        </p>
     */

    public void setAcceptBundleUpdate(Boolean acceptBundleUpdate) {
        this.acceptBundleUpdate = acceptBundleUpdate;
    }

    /**
     * <p>
     * Required parameter to accept the instance bundle update when changing to, and from, IPv6-only.
     * </p>
     * <note>
     * <p>
     * An instance bundle will change when switching from <code>dual-stack</code> or <code>ipv4</code>, to
     * <code>ipv6</code>. It also changes when switching from <code>ipv6</code>, to <code>dual-stack</code> or
     * <code>ipv4</code>.
     * </p>
     * <p>
     * You must include this parameter in the command to update the bundle. For example, if you switch from
     * <code>dual-stack</code> to <code>ipv6</code>, the bundle will be updated, and billing for the IPv6-only instance
     * bundle begins immediately.
     * </p>
     * </note>
     * 
     * @return Required parameter to accept the instance bundle update when changing to, and from, IPv6-only.</p> <note>
     *         <p>
     *         An instance bundle will change when switching from <code>dual-stack</code> or <code>ipv4</code>, to
     *         <code>ipv6</code>. It also changes when switching from <code>ipv6</code>, to <code>dual-stack</code> or
     *         <code>ipv4</code>.
     *         </p>
     *         <p>
     *         You must include this parameter in the command to update the bundle. For example, if you switch from
     *         <code>dual-stack</code> to <code>ipv6</code>, the bundle will be updated, and billing for the IPv6-only
     *         instance bundle begins immediately.
     *         </p>
     */

    public Boolean getAcceptBundleUpdate() {
        return this.acceptBundleUpdate;
    }

    /**
     * <p>
     * Required parameter to accept the instance bundle update when changing to, and from, IPv6-only.
     * </p>
     * <note>
     * <p>
     * An instance bundle will change when switching from <code>dual-stack</code> or <code>ipv4</code>, to
     * <code>ipv6</code>. It also changes when switching from <code>ipv6</code>, to <code>dual-stack</code> or
     * <code>ipv4</code>.
     * </p>
     * <p>
     * You must include this parameter in the command to update the bundle. For example, if you switch from
     * <code>dual-stack</code> to <code>ipv6</code>, the bundle will be updated, and billing for the IPv6-only instance
     * bundle begins immediately.
     * </p>
     * </note>
     * 
     * @param acceptBundleUpdate
     *        Required parameter to accept the instance bundle update when changing to, and from, IPv6-only.</p> <note>
     *        <p>
     *        An instance bundle will change when switching from <code>dual-stack</code> or <code>ipv4</code>, to
     *        <code>ipv6</code>. It also changes when switching from <code>ipv6</code>, to <code>dual-stack</code> or
     *        <code>ipv4</code>.
     *        </p>
     *        <p>
     *        You must include this parameter in the command to update the bundle. For example, if you switch from
     *        <code>dual-stack</code> to <code>ipv6</code>, the bundle will be updated, and billing for the IPv6-only
     *        instance bundle begins immediately.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetIpAddressTypeRequest withAcceptBundleUpdate(Boolean acceptBundleUpdate) {
        setAcceptBundleUpdate(acceptBundleUpdate);
        return this;
    }

    /**
     * <p>
     * Required parameter to accept the instance bundle update when changing to, and from, IPv6-only.
     * </p>
     * <note>
     * <p>
     * An instance bundle will change when switching from <code>dual-stack</code> or <code>ipv4</code>, to
     * <code>ipv6</code>. It also changes when switching from <code>ipv6</code>, to <code>dual-stack</code> or
     * <code>ipv4</code>.
     * </p>
     * <p>
     * You must include this parameter in the command to update the bundle. For example, if you switch from
     * <code>dual-stack</code> to <code>ipv6</code>, the bundle will be updated, and billing for the IPv6-only instance
     * bundle begins immediately.
     * </p>
     * </note>
     * 
     * @return Required parameter to accept the instance bundle update when changing to, and from, IPv6-only.</p> <note>
     *         <p>
     *         An instance bundle will change when switching from <code>dual-stack</code> or <code>ipv4</code>, to
     *         <code>ipv6</code>. It also changes when switching from <code>ipv6</code>, to <code>dual-stack</code> or
     *         <code>ipv4</code>.
     *         </p>
     *         <p>
     *         You must include this parameter in the command to update the bundle. For example, if you switch from
     *         <code>dual-stack</code> to <code>ipv6</code>, the bundle will be updated, and billing for the IPv6-only
     *         instance bundle begins immediately.
     *         </p>
     */

    public Boolean isAcceptBundleUpdate() {
        return this.acceptBundleUpdate;
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceName() != null)
            sb.append("ResourceName: ").append(getResourceName()).append(",");
        if (getIpAddressType() != null)
            sb.append("IpAddressType: ").append(getIpAddressType()).append(",");
        if (getAcceptBundleUpdate() != null)
            sb.append("AcceptBundleUpdate: ").append(getAcceptBundleUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetIpAddressTypeRequest == false)
            return false;
        SetIpAddressTypeRequest other = (SetIpAddressTypeRequest) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        if (other.getIpAddressType() == null ^ this.getIpAddressType() == null)
            return false;
        if (other.getIpAddressType() != null && other.getIpAddressType().equals(this.getIpAddressType()) == false)
            return false;
        if (other.getAcceptBundleUpdate() == null ^ this.getAcceptBundleUpdate() == null)
            return false;
        if (other.getAcceptBundleUpdate() != null && other.getAcceptBundleUpdate().equals(this.getAcceptBundleUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode + ((getIpAddressType() == null) ? 0 : getIpAddressType().hashCode());
        hashCode = prime * hashCode + ((getAcceptBundleUpdate() == null) ? 0 : getAcceptBundleUpdate().hashCode());
        return hashCode;
    }

    @Override
    public SetIpAddressTypeRequest clone() {
        return (SetIpAddressTypeRequest) super.clone();
    }

}
