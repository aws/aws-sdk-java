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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeTenantDatabases" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTenantDatabasesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user-supplied DB instance identifier, which must match the identifier of an existing instance owned by the
     * Amazon Web Services account. This parameter isn't case-sensitive.
     * </p>
     */
    private String dBInstanceIdentifier;
    /**
     * <p>
     * The user-supplied tenant database name, which must match the name of an existing tenant database on the specified
     * DB instance owned by your Amazon Web Services account. This parameter isn’t case-sensitive.
     * </p>
     */
    private String tenantDBName;
    /**
     * <p>
     * A filter that specifies one or more database tenants to describe.
     * </p>
     * <p>
     * Supported filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tenant-db-name</code> - Tenant database names. The results list only includes information about the tenant
     * databases that match these tenant DB names.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tenant-database-resource-id</code> - Tenant database resource identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dbi-resource-id</code> - DB instance resource identifiers. The results list only includes information about
     * the tenants contained within the DB instances identified by these resource identifiers.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
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
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that you can
     * retrieve the remaining results.
     * </p>
     */
    private Integer maxRecords;

    /**
     * <p>
     * The user-supplied DB instance identifier, which must match the identifier of an existing instance owned by the
     * Amazon Web Services account. This parameter isn't case-sensitive.
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        The user-supplied DB instance identifier, which must match the identifier of an existing instance owned by
     *        the Amazon Web Services account. This parameter isn't case-sensitive.
     */

    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * The user-supplied DB instance identifier, which must match the identifier of an existing instance owned by the
     * Amazon Web Services account. This parameter isn't case-sensitive.
     * </p>
     * 
     * @return The user-supplied DB instance identifier, which must match the identifier of an existing instance owned
     *         by the Amazon Web Services account. This parameter isn't case-sensitive.
     */

    public String getDBInstanceIdentifier() {
        return this.dBInstanceIdentifier;
    }

    /**
     * <p>
     * The user-supplied DB instance identifier, which must match the identifier of an existing instance owned by the
     * Amazon Web Services account. This parameter isn't case-sensitive.
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        The user-supplied DB instance identifier, which must match the identifier of an existing instance owned by
     *        the Amazon Web Services account. This parameter isn't case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTenantDatabasesRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * The user-supplied tenant database name, which must match the name of an existing tenant database on the specified
     * DB instance owned by your Amazon Web Services account. This parameter isn’t case-sensitive.
     * </p>
     * 
     * @param tenantDBName
     *        The user-supplied tenant database name, which must match the name of an existing tenant database on the
     *        specified DB instance owned by your Amazon Web Services account. This parameter isn’t case-sensitive.
     */

    public void setTenantDBName(String tenantDBName) {
        this.tenantDBName = tenantDBName;
    }

    /**
     * <p>
     * The user-supplied tenant database name, which must match the name of an existing tenant database on the specified
     * DB instance owned by your Amazon Web Services account. This parameter isn’t case-sensitive.
     * </p>
     * 
     * @return The user-supplied tenant database name, which must match the name of an existing tenant database on the
     *         specified DB instance owned by your Amazon Web Services account. This parameter isn’t case-sensitive.
     */

    public String getTenantDBName() {
        return this.tenantDBName;
    }

    /**
     * <p>
     * The user-supplied tenant database name, which must match the name of an existing tenant database on the specified
     * DB instance owned by your Amazon Web Services account. This parameter isn’t case-sensitive.
     * </p>
     * 
     * @param tenantDBName
     *        The user-supplied tenant database name, which must match the name of an existing tenant database on the
     *        specified DB instance owned by your Amazon Web Services account. This parameter isn’t case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTenantDatabasesRequest withTenantDBName(String tenantDBName) {
        setTenantDBName(tenantDBName);
        return this;
    }

    /**
     * <p>
     * A filter that specifies one or more database tenants to describe.
     * </p>
     * <p>
     * Supported filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tenant-db-name</code> - Tenant database names. The results list only includes information about the tenant
     * databases that match these tenant DB names.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tenant-database-resource-id</code> - Tenant database resource identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dbi-resource-id</code> - DB instance resource identifiers. The results list only includes information about
     * the tenants contained within the DB instances identified by these resource identifiers.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A filter that specifies one or more database tenants to describe.</p>
     *         <p>
     *         Supported filters:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>tenant-db-name</code> - Tenant database names. The results list only includes information about the
     *         tenant databases that match these tenant DB names.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tenant-database-resource-id</code> - Tenant database resource identifiers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>dbi-resource-id</code> - DB instance resource identifiers. The results list only includes
     *         information about the tenants contained within the DB instances identified by these resource identifiers.
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * A filter that specifies one or more database tenants to describe.
     * </p>
     * <p>
     * Supported filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tenant-db-name</code> - Tenant database names. The results list only includes information about the tenant
     * databases that match these tenant DB names.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tenant-database-resource-id</code> - Tenant database resource identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dbi-resource-id</code> - DB instance resource identifiers. The results list only includes information about
     * the tenants contained within the DB instances identified by these resource identifiers.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        A filter that specifies one or more database tenants to describe.</p>
     *        <p>
     *        Supported filters:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>tenant-db-name</code> - Tenant database names. The results list only includes information about the
     *        tenant databases that match these tenant DB names.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tenant-database-resource-id</code> - Tenant database resource identifiers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dbi-resource-id</code> - DB instance resource identifiers. The results list only includes
     *        information about the tenants contained within the DB instances identified by these resource identifiers.
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(filters);
    }

    /**
     * <p>
     * A filter that specifies one or more database tenants to describe.
     * </p>
     * <p>
     * Supported filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tenant-db-name</code> - Tenant database names. The results list only includes information about the tenant
     * databases that match these tenant DB names.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tenant-database-resource-id</code> - Tenant database resource identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dbi-resource-id</code> - DB instance resource identifiers. The results list only includes information about
     * the tenants contained within the DB instances identified by these resource identifiers.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        A filter that specifies one or more database tenants to describe.</p>
     *        <p>
     *        Supported filters:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>tenant-db-name</code> - Tenant database names. The results list only includes information about the
     *        tenant databases that match these tenant DB names.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tenant-database-resource-id</code> - Tenant database resource identifiers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dbi-resource-id</code> - DB instance resource identifiers. The results list only includes
     *        information about the tenants contained within the DB instances identified by these resource identifiers.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTenantDatabasesRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A filter that specifies one or more database tenants to describe.
     * </p>
     * <p>
     * Supported filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tenant-db-name</code> - Tenant database names. The results list only includes information about the tenant
     * databases that match these tenant DB names.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tenant-database-resource-id</code> - Tenant database resource identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dbi-resource-id</code> - DB instance resource identifiers. The results list only includes information about
     * the tenants contained within the DB instances identified by these resource identifiers.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        A filter that specifies one or more database tenants to describe.</p>
     *        <p>
     *        Supported filters:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>tenant-db-name</code> - Tenant database names. The results list only includes information about the
     *        tenant databases that match these tenant DB names.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tenant-database-resource-id</code> - Tenant database resource identifiers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dbi-resource-id</code> - DB instance resource identifiers. The results list only includes
     *        information about the tenants contained within the DB instances identified by these resource identifiers.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTenantDatabasesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
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

    public DescribeTenantDatabasesRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that you can
     * retrieve the remaining results.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that you
     *        can retrieve the remaining results.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that you can
     * retrieve the remaining results.
     * </p>
     * 
     * @return The maximum number of records to include in the response. If more records exist than the specified
     *         <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that you
     *         can retrieve the remaining results.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that you can
     * retrieve the remaining results.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that you
     *        can retrieve the remaining results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTenantDatabasesRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
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
        if (getDBInstanceIdentifier() != null)
            sb.append("DBInstanceIdentifier: ").append(getDBInstanceIdentifier()).append(",");
        if (getTenantDBName() != null)
            sb.append("TenantDBName: ").append(getTenantDBName()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTenantDatabasesRequest == false)
            return false;
        DescribeTenantDatabasesRequest other = (DescribeTenantDatabasesRequest) obj;
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        if (other.getTenantDBName() == null ^ this.getTenantDBName() == null)
            return false;
        if (other.getTenantDBName() != null && other.getTenantDBName().equals(this.getTenantDBName()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTenantDBName() == null) ? 0 : getTenantDBName().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTenantDatabasesRequest clone() {
        return (DescribeTenantDatabasesRequest) super.clone();
    }

}
