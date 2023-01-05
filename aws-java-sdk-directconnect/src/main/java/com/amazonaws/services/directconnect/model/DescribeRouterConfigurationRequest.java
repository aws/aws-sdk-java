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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Provides the details about a virtual interface's router.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeRouterConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRouterConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the virtual interface.
     * </p>
     */
    private String virtualInterfaceId;
    /**
     * <p>
     * Identifies the router by a combination of vendor, platform, and software version. For example,
     * <code>CiscoSystemsInc-2900SeriesRouters-IOS124</code>.
     * </p>
     */
    private String routerTypeIdentifier;

    /**
     * <p>
     * The ID of the virtual interface.
     * </p>
     * 
     * @param virtualInterfaceId
     *        The ID of the virtual interface.
     */

    public void setVirtualInterfaceId(String virtualInterfaceId) {
        this.virtualInterfaceId = virtualInterfaceId;
    }

    /**
     * <p>
     * The ID of the virtual interface.
     * </p>
     * 
     * @return The ID of the virtual interface.
     */

    public String getVirtualInterfaceId() {
        return this.virtualInterfaceId;
    }

    /**
     * <p>
     * The ID of the virtual interface.
     * </p>
     * 
     * @param virtualInterfaceId
     *        The ID of the virtual interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRouterConfigurationRequest withVirtualInterfaceId(String virtualInterfaceId) {
        setVirtualInterfaceId(virtualInterfaceId);
        return this;
    }

    /**
     * <p>
     * Identifies the router by a combination of vendor, platform, and software version. For example,
     * <code>CiscoSystemsInc-2900SeriesRouters-IOS124</code>.
     * </p>
     * 
     * @param routerTypeIdentifier
     *        Identifies the router by a combination of vendor, platform, and software version. For example,
     *        <code>CiscoSystemsInc-2900SeriesRouters-IOS124</code>.
     */

    public void setRouterTypeIdentifier(String routerTypeIdentifier) {
        this.routerTypeIdentifier = routerTypeIdentifier;
    }

    /**
     * <p>
     * Identifies the router by a combination of vendor, platform, and software version. For example,
     * <code>CiscoSystemsInc-2900SeriesRouters-IOS124</code>.
     * </p>
     * 
     * @return Identifies the router by a combination of vendor, platform, and software version. For example,
     *         <code>CiscoSystemsInc-2900SeriesRouters-IOS124</code>.
     */

    public String getRouterTypeIdentifier() {
        return this.routerTypeIdentifier;
    }

    /**
     * <p>
     * Identifies the router by a combination of vendor, platform, and software version. For example,
     * <code>CiscoSystemsInc-2900SeriesRouters-IOS124</code>.
     * </p>
     * 
     * @param routerTypeIdentifier
     *        Identifies the router by a combination of vendor, platform, and software version. For example,
     *        <code>CiscoSystemsInc-2900SeriesRouters-IOS124</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRouterConfigurationRequest withRouterTypeIdentifier(String routerTypeIdentifier) {
        setRouterTypeIdentifier(routerTypeIdentifier);
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
        if (getVirtualInterfaceId() != null)
            sb.append("VirtualInterfaceId: ").append(getVirtualInterfaceId()).append(",");
        if (getRouterTypeIdentifier() != null)
            sb.append("RouterTypeIdentifier: ").append(getRouterTypeIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRouterConfigurationRequest == false)
            return false;
        DescribeRouterConfigurationRequest other = (DescribeRouterConfigurationRequest) obj;
        if (other.getVirtualInterfaceId() == null ^ this.getVirtualInterfaceId() == null)
            return false;
        if (other.getVirtualInterfaceId() != null && other.getVirtualInterfaceId().equals(this.getVirtualInterfaceId()) == false)
            return false;
        if (other.getRouterTypeIdentifier() == null ^ this.getRouterTypeIdentifier() == null)
            return false;
        if (other.getRouterTypeIdentifier() != null && other.getRouterTypeIdentifier().equals(this.getRouterTypeIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVirtualInterfaceId() == null) ? 0 : getVirtualInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getRouterTypeIdentifier() == null) ? 0 : getRouterTypeIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRouterConfigurationRequest clone() {
        return (DescribeRouterConfigurationRequest) super.clone();
    }

}
