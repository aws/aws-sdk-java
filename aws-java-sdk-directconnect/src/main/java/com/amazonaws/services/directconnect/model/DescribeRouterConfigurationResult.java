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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeRouterConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRouterConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The customer router configuration.
     * </p>
     */
    private String customerRouterConfig;
    /**
     * <p>
     * The details about the router.
     * </p>
     */
    private RouterType router;
    /**
     * <p>
     * The ID assigned to the virtual interface.
     * </p>
     */
    private String virtualInterfaceId;
    /**
     * <p>
     * Provides the details about a virtual interface's router.
     * </p>
     */
    private String virtualInterfaceName;

    /**
     * <p>
     * The customer router configuration.
     * </p>
     * 
     * @param customerRouterConfig
     *        The customer router configuration.
     */

    public void setCustomerRouterConfig(String customerRouterConfig) {
        this.customerRouterConfig = customerRouterConfig;
    }

    /**
     * <p>
     * The customer router configuration.
     * </p>
     * 
     * @return The customer router configuration.
     */

    public String getCustomerRouterConfig() {
        return this.customerRouterConfig;
    }

    /**
     * <p>
     * The customer router configuration.
     * </p>
     * 
     * @param customerRouterConfig
     *        The customer router configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRouterConfigurationResult withCustomerRouterConfig(String customerRouterConfig) {
        setCustomerRouterConfig(customerRouterConfig);
        return this;
    }

    /**
     * <p>
     * The details about the router.
     * </p>
     * 
     * @param router
     *        The details about the router.
     */

    public void setRouter(RouterType router) {
        this.router = router;
    }

    /**
     * <p>
     * The details about the router.
     * </p>
     * 
     * @return The details about the router.
     */

    public RouterType getRouter() {
        return this.router;
    }

    /**
     * <p>
     * The details about the router.
     * </p>
     * 
     * @param router
     *        The details about the router.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRouterConfigurationResult withRouter(RouterType router) {
        setRouter(router);
        return this;
    }

    /**
     * <p>
     * The ID assigned to the virtual interface.
     * </p>
     * 
     * @param virtualInterfaceId
     *        The ID assigned to the virtual interface.
     */

    public void setVirtualInterfaceId(String virtualInterfaceId) {
        this.virtualInterfaceId = virtualInterfaceId;
    }

    /**
     * <p>
     * The ID assigned to the virtual interface.
     * </p>
     * 
     * @return The ID assigned to the virtual interface.
     */

    public String getVirtualInterfaceId() {
        return this.virtualInterfaceId;
    }

    /**
     * <p>
     * The ID assigned to the virtual interface.
     * </p>
     * 
     * @param virtualInterfaceId
     *        The ID assigned to the virtual interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRouterConfigurationResult withVirtualInterfaceId(String virtualInterfaceId) {
        setVirtualInterfaceId(virtualInterfaceId);
        return this;
    }

    /**
     * <p>
     * Provides the details about a virtual interface's router.
     * </p>
     * 
     * @param virtualInterfaceName
     *        Provides the details about a virtual interface's router.
     */

    public void setVirtualInterfaceName(String virtualInterfaceName) {
        this.virtualInterfaceName = virtualInterfaceName;
    }

    /**
     * <p>
     * Provides the details about a virtual interface's router.
     * </p>
     * 
     * @return Provides the details about a virtual interface's router.
     */

    public String getVirtualInterfaceName() {
        return this.virtualInterfaceName;
    }

    /**
     * <p>
     * Provides the details about a virtual interface's router.
     * </p>
     * 
     * @param virtualInterfaceName
     *        Provides the details about a virtual interface's router.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRouterConfigurationResult withVirtualInterfaceName(String virtualInterfaceName) {
        setVirtualInterfaceName(virtualInterfaceName);
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
        if (getCustomerRouterConfig() != null)
            sb.append("CustomerRouterConfig: ").append(getCustomerRouterConfig()).append(",");
        if (getRouter() != null)
            sb.append("Router: ").append(getRouter()).append(",");
        if (getVirtualInterfaceId() != null)
            sb.append("VirtualInterfaceId: ").append(getVirtualInterfaceId()).append(",");
        if (getVirtualInterfaceName() != null)
            sb.append("VirtualInterfaceName: ").append(getVirtualInterfaceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRouterConfigurationResult == false)
            return false;
        DescribeRouterConfigurationResult other = (DescribeRouterConfigurationResult) obj;
        if (other.getCustomerRouterConfig() == null ^ this.getCustomerRouterConfig() == null)
            return false;
        if (other.getCustomerRouterConfig() != null && other.getCustomerRouterConfig().equals(this.getCustomerRouterConfig()) == false)
            return false;
        if (other.getRouter() == null ^ this.getRouter() == null)
            return false;
        if (other.getRouter() != null && other.getRouter().equals(this.getRouter()) == false)
            return false;
        if (other.getVirtualInterfaceId() == null ^ this.getVirtualInterfaceId() == null)
            return false;
        if (other.getVirtualInterfaceId() != null && other.getVirtualInterfaceId().equals(this.getVirtualInterfaceId()) == false)
            return false;
        if (other.getVirtualInterfaceName() == null ^ this.getVirtualInterfaceName() == null)
            return false;
        if (other.getVirtualInterfaceName() != null && other.getVirtualInterfaceName().equals(this.getVirtualInterfaceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomerRouterConfig() == null) ? 0 : getCustomerRouterConfig().hashCode());
        hashCode = prime * hashCode + ((getRouter() == null) ? 0 : getRouter().hashCode());
        hashCode = prime * hashCode + ((getVirtualInterfaceId() == null) ? 0 : getVirtualInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getVirtualInterfaceName() == null) ? 0 : getVirtualInterfaceName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRouterConfigurationResult clone() {
        try {
            return (DescribeRouterConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
