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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBClusterAutomatedBackups"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBClusterAutomatedBackupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The resource ID of the DB cluster that is the source of the automated backup. This parameter isn't
     * case-sensitive.
     * </p>
     */
    private String dbClusterResourceId;
    /**
     * <p>
     * (Optional) The user-supplied DB cluster identifier. If this parameter is specified, it must match the identifier
     * of an existing DB cluster. It returns information from the specific DB cluster's automated backup. This parameter
     * isn't case-sensitive.
     * </p>
     */
    private String dBClusterIdentifier;
    /**
     * <p>
     * A filter that specifies which resources to return based on status.
     * </p>
     * <p>
     * Supported filters are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>status</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>retained</code> - Automated backups for deleted clusters and after backup replication is stopped.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>db-cluster-id</code> - Accepts DB cluster identifiers and Amazon Resource Names (ARNs). The results list
     * includes only information about the DB cluster automated backups identified by these ARNs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db-cluster-resource-id</code> - Accepts DB resource identifiers and Amazon Resource Names (ARNs). The
     * results list includes only information about the DB cluster resources identified by these ARNs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns all resources by default. The status for each resource is specified in the response.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
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
     * The pagination token provided in the previous request. If this parameter is specified the response includes only
     * records beyond the marker, up to <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The resource ID of the DB cluster that is the source of the automated backup. This parameter isn't
     * case-sensitive.
     * </p>
     * 
     * @param dbClusterResourceId
     *        The resource ID of the DB cluster that is the source of the automated backup. This parameter isn't
     *        case-sensitive.
     */

    public void setDbClusterResourceId(String dbClusterResourceId) {
        this.dbClusterResourceId = dbClusterResourceId;
    }

    /**
     * <p>
     * The resource ID of the DB cluster that is the source of the automated backup. This parameter isn't
     * case-sensitive.
     * </p>
     * 
     * @return The resource ID of the DB cluster that is the source of the automated backup. This parameter isn't
     *         case-sensitive.
     */

    public String getDbClusterResourceId() {
        return this.dbClusterResourceId;
    }

    /**
     * <p>
     * The resource ID of the DB cluster that is the source of the automated backup. This parameter isn't
     * case-sensitive.
     * </p>
     * 
     * @param dbClusterResourceId
     *        The resource ID of the DB cluster that is the source of the automated backup. This parameter isn't
     *        case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClusterAutomatedBackupsRequest withDbClusterResourceId(String dbClusterResourceId) {
        setDbClusterResourceId(dbClusterResourceId);
        return this;
    }

    /**
     * <p>
     * (Optional) The user-supplied DB cluster identifier. If this parameter is specified, it must match the identifier
     * of an existing DB cluster. It returns information from the specific DB cluster's automated backup. This parameter
     * isn't case-sensitive.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        (Optional) The user-supplied DB cluster identifier. If this parameter is specified, it must match the
     *        identifier of an existing DB cluster. It returns information from the specific DB cluster's automated
     *        backup. This parameter isn't case-sensitive.
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * (Optional) The user-supplied DB cluster identifier. If this parameter is specified, it must match the identifier
     * of an existing DB cluster. It returns information from the specific DB cluster's automated backup. This parameter
     * isn't case-sensitive.
     * </p>
     * 
     * @return (Optional) The user-supplied DB cluster identifier. If this parameter is specified, it must match the
     *         identifier of an existing DB cluster. It returns information from the specific DB cluster's automated
     *         backup. This parameter isn't case-sensitive.
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * (Optional) The user-supplied DB cluster identifier. If this parameter is specified, it must match the identifier
     * of an existing DB cluster. It returns information from the specific DB cluster's automated backup. This parameter
     * isn't case-sensitive.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        (Optional) The user-supplied DB cluster identifier. If this parameter is specified, it must match the
     *        identifier of an existing DB cluster. It returns information from the specific DB cluster's automated
     *        backup. This parameter isn't case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClusterAutomatedBackupsRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * A filter that specifies which resources to return based on status.
     * </p>
     * <p>
     * Supported filters are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>status</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>retained</code> - Automated backups for deleted clusters and after backup replication is stopped.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>db-cluster-id</code> - Accepts DB cluster identifiers and Amazon Resource Names (ARNs). The results list
     * includes only information about the DB cluster automated backups identified by these ARNs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db-cluster-resource-id</code> - Accepts DB resource identifiers and Amazon Resource Names (ARNs). The
     * results list includes only information about the DB cluster resources identified by these ARNs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns all resources by default. The status for each resource is specified in the response.
     * </p>
     * 
     * @return A filter that specifies which resources to return based on status.</p>
     *         <p>
     *         Supported filters are the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>status</code>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>retained</code> - Automated backups for deleted clusters and after backup replication is stopped.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>db-cluster-id</code> - Accepts DB cluster identifiers and Amazon Resource Names (ARNs). The results
     *         list includes only information about the DB cluster automated backups identified by these ARNs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>db-cluster-resource-id</code> - Accepts DB resource identifiers and Amazon Resource Names (ARNs).
     *         The results list includes only information about the DB cluster resources identified by these ARNs.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Returns all resources by default. The status for each resource is specified in the response.
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * A filter that specifies which resources to return based on status.
     * </p>
     * <p>
     * Supported filters are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>status</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>retained</code> - Automated backups for deleted clusters and after backup replication is stopped.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>db-cluster-id</code> - Accepts DB cluster identifiers and Amazon Resource Names (ARNs). The results list
     * includes only information about the DB cluster automated backups identified by these ARNs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db-cluster-resource-id</code> - Accepts DB resource identifiers and Amazon Resource Names (ARNs). The
     * results list includes only information about the DB cluster resources identified by these ARNs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns all resources by default. The status for each resource is specified in the response.
     * </p>
     * 
     * @param filters
     *        A filter that specifies which resources to return based on status.</p>
     *        <p>
     *        Supported filters are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>status</code>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>retained</code> - Automated backups for deleted clusters and after backup replication is stopped.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db-cluster-id</code> - Accepts DB cluster identifiers and Amazon Resource Names (ARNs). The results
     *        list includes only information about the DB cluster automated backups identified by these ARNs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db-cluster-resource-id</code> - Accepts DB resource identifiers and Amazon Resource Names (ARNs).
     *        The results list includes only information about the DB cluster resources identified by these ARNs.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Returns all resources by default. The status for each resource is specified in the response.
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
     * A filter that specifies which resources to return based on status.
     * </p>
     * <p>
     * Supported filters are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>status</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>retained</code> - Automated backups for deleted clusters and after backup replication is stopped.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>db-cluster-id</code> - Accepts DB cluster identifiers and Amazon Resource Names (ARNs). The results list
     * includes only information about the DB cluster automated backups identified by these ARNs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db-cluster-resource-id</code> - Accepts DB resource identifiers and Amazon Resource Names (ARNs). The
     * results list includes only information about the DB cluster resources identified by these ARNs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns all resources by default. The status for each resource is specified in the response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        A filter that specifies which resources to return based on status.</p>
     *        <p>
     *        Supported filters are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>status</code>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>retained</code> - Automated backups for deleted clusters and after backup replication is stopped.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db-cluster-id</code> - Accepts DB cluster identifiers and Amazon Resource Names (ARNs). The results
     *        list includes only information about the DB cluster automated backups identified by these ARNs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db-cluster-resource-id</code> - Accepts DB resource identifiers and Amazon Resource Names (ARNs).
     *        The results list includes only information about the DB cluster resources identified by these ARNs.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Returns all resources by default. The status for each resource is specified in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClusterAutomatedBackupsRequest withFilters(Filter... filters) {
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
     * A filter that specifies which resources to return based on status.
     * </p>
     * <p>
     * Supported filters are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>status</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>retained</code> - Automated backups for deleted clusters and after backup replication is stopped.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>db-cluster-id</code> - Accepts DB cluster identifiers and Amazon Resource Names (ARNs). The results list
     * includes only information about the DB cluster automated backups identified by these ARNs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db-cluster-resource-id</code> - Accepts DB resource identifiers and Amazon Resource Names (ARNs). The
     * results list includes only information about the DB cluster resources identified by these ARNs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns all resources by default. The status for each resource is specified in the response.
     * </p>
     * 
     * @param filters
     *        A filter that specifies which resources to return based on status.</p>
     *        <p>
     *        Supported filters are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>status</code>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>retained</code> - Automated backups for deleted clusters and after backup replication is stopped.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db-cluster-id</code> - Accepts DB cluster identifiers and Amazon Resource Names (ARNs). The results
     *        list includes only information about the DB cluster automated backups identified by these ARNs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db-cluster-resource-id</code> - Accepts DB resource identifiers and Amazon Resource Names (ARNs).
     *        The results list includes only information about the DB cluster resources identified by these ARNs.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Returns all resources by default. The status for each resource is specified in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClusterAutomatedBackupsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
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

    public DescribeDBClusterAutomatedBackupsRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * The pagination token provided in the previous request. If this parameter is specified the response includes only
     * records beyond the marker, up to <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        The pagination token provided in the previous request. If this parameter is specified the response
     *        includes only records beyond the marker, up to <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The pagination token provided in the previous request. If this parameter is specified the response includes only
     * records beyond the marker, up to <code>MaxRecords</code>.
     * </p>
     * 
     * @return The pagination token provided in the previous request. If this parameter is specified the response
     *         includes only records beyond the marker, up to <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The pagination token provided in the previous request. If this parameter is specified the response includes only
     * records beyond the marker, up to <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        The pagination token provided in the previous request. If this parameter is specified the response
     *        includes only records beyond the marker, up to <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClusterAutomatedBackupsRequest withMarker(String marker) {
        setMarker(marker);
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
        if (getDbClusterResourceId() != null)
            sb.append("DbClusterResourceId: ").append(getDbClusterResourceId()).append(",");
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: ").append(getDBClusterIdentifier()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBClusterAutomatedBackupsRequest == false)
            return false;
        DescribeDBClusterAutomatedBackupsRequest other = (DescribeDBClusterAutomatedBackupsRequest) obj;
        if (other.getDbClusterResourceId() == null ^ this.getDbClusterResourceId() == null)
            return false;
        if (other.getDbClusterResourceId() != null && other.getDbClusterResourceId().equals(this.getDbClusterResourceId()) == false)
            return false;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDbClusterResourceId() == null) ? 0 : getDbClusterResourceId().hashCode());
        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDBClusterAutomatedBackupsRequest clone() {
        return (DescribeDBClusterAutomatedBackupsRequest) super.clone();
    }

}
