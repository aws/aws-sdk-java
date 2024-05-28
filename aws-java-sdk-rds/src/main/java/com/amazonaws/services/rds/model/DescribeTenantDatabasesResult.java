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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeTenantDatabases" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTenantDatabasesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeTenantDatabases</code> request. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * An array of the tenant databases requested by the <code>DescribeTenantDatabases</code> operation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TenantDatabase> tenantDatabases;

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeTenantDatabases</code> request. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <code>DescribeTenantDatabases</code> request. If this
     *        parameter is specified, the response includes only records beyond the marker, up to the value specified by
     *        <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeTenantDatabases</code> request. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous <code>DescribeTenantDatabases</code> request. If this
     *         parameter is specified, the response includes only records beyond the marker, up to the value specified
     *         by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeTenantDatabases</code> request. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <code>DescribeTenantDatabases</code> request. If this
     *        parameter is specified, the response includes only records beyond the marker, up to the value specified by
     *        <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTenantDatabasesResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * An array of the tenant databases requested by the <code>DescribeTenantDatabases</code> operation.
     * </p>
     * 
     * @return An array of the tenant databases requested by the <code>DescribeTenantDatabases</code> operation.
     */

    public java.util.List<TenantDatabase> getTenantDatabases() {
        if (tenantDatabases == null) {
            tenantDatabases = new com.amazonaws.internal.SdkInternalList<TenantDatabase>();
        }
        return tenantDatabases;
    }

    /**
     * <p>
     * An array of the tenant databases requested by the <code>DescribeTenantDatabases</code> operation.
     * </p>
     * 
     * @param tenantDatabases
     *        An array of the tenant databases requested by the <code>DescribeTenantDatabases</code> operation.
     */

    public void setTenantDatabases(java.util.Collection<TenantDatabase> tenantDatabases) {
        if (tenantDatabases == null) {
            this.tenantDatabases = null;
            return;
        }

        this.tenantDatabases = new com.amazonaws.internal.SdkInternalList<TenantDatabase>(tenantDatabases);
    }

    /**
     * <p>
     * An array of the tenant databases requested by the <code>DescribeTenantDatabases</code> operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTenantDatabases(java.util.Collection)} or {@link #withTenantDatabases(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param tenantDatabases
     *        An array of the tenant databases requested by the <code>DescribeTenantDatabases</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTenantDatabasesResult withTenantDatabases(TenantDatabase... tenantDatabases) {
        if (this.tenantDatabases == null) {
            setTenantDatabases(new com.amazonaws.internal.SdkInternalList<TenantDatabase>(tenantDatabases.length));
        }
        for (TenantDatabase ele : tenantDatabases) {
            this.tenantDatabases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of the tenant databases requested by the <code>DescribeTenantDatabases</code> operation.
     * </p>
     * 
     * @param tenantDatabases
     *        An array of the tenant databases requested by the <code>DescribeTenantDatabases</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTenantDatabasesResult withTenantDatabases(java.util.Collection<TenantDatabase> tenantDatabases) {
        setTenantDatabases(tenantDatabases);
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
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getTenantDatabases() != null)
            sb.append("TenantDatabases: ").append(getTenantDatabases());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTenantDatabasesResult == false)
            return false;
        DescribeTenantDatabasesResult other = (DescribeTenantDatabasesResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getTenantDatabases() == null ^ this.getTenantDatabases() == null)
            return false;
        if (other.getTenantDatabases() != null && other.getTenantDatabases().equals(this.getTenantDatabases()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getTenantDatabases() == null) ? 0 : getTenantDatabases().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTenantDatabasesResult clone() {
        try {
            return (DescribeTenantDatabasesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
