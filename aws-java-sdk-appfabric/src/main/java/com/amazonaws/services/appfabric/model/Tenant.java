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
package com.amazonaws.services.appfabric.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about an application tenant.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/Tenant" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Tenant implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the application tenant.
     * </p>
     */
    private String tenantIdentifier;
    /**
     * <p>
     * The display name of the tenant.
     * </p>
     */
    private String tenantDisplayName;

    /**
     * <p>
     * The ID of the application tenant.
     * </p>
     * 
     * @param tenantIdentifier
     *        The ID of the application tenant.
     */

    public void setTenantIdentifier(String tenantIdentifier) {
        this.tenantIdentifier = tenantIdentifier;
    }

    /**
     * <p>
     * The ID of the application tenant.
     * </p>
     * 
     * @return The ID of the application tenant.
     */

    public String getTenantIdentifier() {
        return this.tenantIdentifier;
    }

    /**
     * <p>
     * The ID of the application tenant.
     * </p>
     * 
     * @param tenantIdentifier
     *        The ID of the application tenant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tenant withTenantIdentifier(String tenantIdentifier) {
        setTenantIdentifier(tenantIdentifier);
        return this;
    }

    /**
     * <p>
     * The display name of the tenant.
     * </p>
     * 
     * @param tenantDisplayName
     *        The display name of the tenant.
     */

    public void setTenantDisplayName(String tenantDisplayName) {
        this.tenantDisplayName = tenantDisplayName;
    }

    /**
     * <p>
     * The display name of the tenant.
     * </p>
     * 
     * @return The display name of the tenant.
     */

    public String getTenantDisplayName() {
        return this.tenantDisplayName;
    }

    /**
     * <p>
     * The display name of the tenant.
     * </p>
     * 
     * @param tenantDisplayName
     *        The display name of the tenant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tenant withTenantDisplayName(String tenantDisplayName) {
        setTenantDisplayName(tenantDisplayName);
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
        if (getTenantIdentifier() != null)
            sb.append("TenantIdentifier: ").append(getTenantIdentifier()).append(",");
        if (getTenantDisplayName() != null)
            sb.append("TenantDisplayName: ").append(getTenantDisplayName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Tenant == false)
            return false;
        Tenant other = (Tenant) obj;
        if (other.getTenantIdentifier() == null ^ this.getTenantIdentifier() == null)
            return false;
        if (other.getTenantIdentifier() != null && other.getTenantIdentifier().equals(this.getTenantIdentifier()) == false)
            return false;
        if (other.getTenantDisplayName() == null ^ this.getTenantDisplayName() == null)
            return false;
        if (other.getTenantDisplayName() != null && other.getTenantDisplayName().equals(this.getTenantDisplayName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTenantIdentifier() == null) ? 0 : getTenantIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTenantDisplayName() == null) ? 0 : getTenantDisplayName().hashCode());
        return hashCode;
    }

    @Override
    public Tenant clone() {
        try {
            return (Tenant) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appfabric.model.transform.TenantMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
