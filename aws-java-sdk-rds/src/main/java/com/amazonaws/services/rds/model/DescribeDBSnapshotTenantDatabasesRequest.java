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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBSnapshotTenantDatabases"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBSnapshotTenantDatabasesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the DB instance used to create the DB snapshots. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the identifier of an existing <code>DBInstance</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String dBInstanceIdentifier;
    /**
     * <p>
     * The ID of a DB snapshot that contains the tenant databases to describe. This value is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify this parameter, the value must match the ID of an existing DB snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify an automatic snapshot, you must also specify <code>SnapshotType</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String dBSnapshotIdentifier;
    /**
     * <p>
     * The type of DB snapshots to be returned. You can specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>automated</code> – All DB snapshots that have been automatically taken by Amazon RDS for my Amazon Web
     * Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manual</code> – All DB snapshots that have been taken by my Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>shared</code> – All manual DB snapshots that have been shared to my Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>public</code> – All DB snapshots that have been marked as public.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>awsbackup</code> – All DB snapshots managed by the Amazon Web Services Backup service.
     * </p>
     * </li>
     * </ul>
     */
    private String snapshotType;
    /**
     * <p>
     * A filter that specifies one or more tenant databases to describe.
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
     * <code>tenant-database-resource-id</code> - Tenant database resource identifiers. The results list only includes
     * information about the tenant databases contained within the DB snapshots.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dbi-resource-id</code> - DB instance resource identifiers. The results list only includes information about
     * snapshots containing tenant databases contained within the DB instances identified by these resource identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db-instance-id</code> - Accepts DB instance identifiers and DB instance Amazon Resource Names (ARNs).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db-snapshot-id</code> - Accepts DB snapshot identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-type</code> - Accepts types of DB snapshots.
     * </p>
     * </li>
     * </ul>
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
     * An optional pagination token provided by a previous <code>DescribeDBSnapshotTenantDatabases</code> request. If
     * this parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * A specific DB resource identifier to describe.
     * </p>
     */
    private String dbiResourceId;

    /**
     * <p>
     * The ID of the DB instance used to create the DB snapshots. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the identifier of an existing <code>DBInstance</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBInstanceIdentifier
     *        The ID of the DB instance used to create the DB snapshots. This parameter isn't case-sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match the identifier of an existing <code>DBInstance</code>.
     *        </p>
     *        </li>
     */

    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * The ID of the DB instance used to create the DB snapshots. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the identifier of an existing <code>DBInstance</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The ID of the DB instance used to create the DB snapshots. This parameter isn't case-sensitive.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If supplied, must match the identifier of an existing <code>DBInstance</code>.
     *         </p>
     *         </li>
     */

    public String getDBInstanceIdentifier() {
        return this.dBInstanceIdentifier;
    }

    /**
     * <p>
     * The ID of the DB instance used to create the DB snapshots. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the identifier of an existing <code>DBInstance</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBInstanceIdentifier
     *        The ID of the DB instance used to create the DB snapshots. This parameter isn't case-sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match the identifier of an existing <code>DBInstance</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBSnapshotTenantDatabasesRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * The ID of a DB snapshot that contains the tenant databases to describe. This value is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify this parameter, the value must match the ID of an existing DB snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify an automatic snapshot, you must also specify <code>SnapshotType</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBSnapshotIdentifier
     *        The ID of a DB snapshot that contains the tenant databases to describe. This value is stored as a
     *        lowercase string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you specify this parameter, the value must match the ID of an existing DB snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify an automatic snapshot, you must also specify <code>SnapshotType</code>.
     *        </p>
     *        </li>
     */

    public void setDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
    }

    /**
     * <p>
     * The ID of a DB snapshot that contains the tenant databases to describe. This value is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify this parameter, the value must match the ID of an existing DB snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify an automatic snapshot, you must also specify <code>SnapshotType</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The ID of a DB snapshot that contains the tenant databases to describe. This value is stored as a
     *         lowercase string.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you specify this parameter, the value must match the ID of an existing DB snapshot.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you specify an automatic snapshot, you must also specify <code>SnapshotType</code>.
     *         </p>
     *         </li>
     */

    public String getDBSnapshotIdentifier() {
        return this.dBSnapshotIdentifier;
    }

    /**
     * <p>
     * The ID of a DB snapshot that contains the tenant databases to describe. This value is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify this parameter, the value must match the ID of an existing DB snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify an automatic snapshot, you must also specify <code>SnapshotType</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBSnapshotIdentifier
     *        The ID of a DB snapshot that contains the tenant databases to describe. This value is stored as a
     *        lowercase string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you specify this parameter, the value must match the ID of an existing DB snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify an automatic snapshot, you must also specify <code>SnapshotType</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBSnapshotTenantDatabasesRequest withDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        setDBSnapshotIdentifier(dBSnapshotIdentifier);
        return this;
    }

    /**
     * <p>
     * The type of DB snapshots to be returned. You can specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>automated</code> – All DB snapshots that have been automatically taken by Amazon RDS for my Amazon Web
     * Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manual</code> – All DB snapshots that have been taken by my Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>shared</code> – All manual DB snapshots that have been shared to my Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>public</code> – All DB snapshots that have been marked as public.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>awsbackup</code> – All DB snapshots managed by the Amazon Web Services Backup service.
     * </p>
     * </li>
     * </ul>
     * 
     * @param snapshotType
     *        The type of DB snapshots to be returned. You can specify one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>automated</code> – All DB snapshots that have been automatically taken by Amazon RDS for my Amazon
     *        Web Services account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>manual</code> – All DB snapshots that have been taken by my Amazon Web Services account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>shared</code> – All manual DB snapshots that have been shared to my Amazon Web Services account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>public</code> – All DB snapshots that have been marked as public.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>awsbackup</code> – All DB snapshots managed by the Amazon Web Services Backup service.
     *        </p>
     *        </li>
     */

    public void setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
    }

    /**
     * <p>
     * The type of DB snapshots to be returned. You can specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>automated</code> – All DB snapshots that have been automatically taken by Amazon RDS for my Amazon Web
     * Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manual</code> – All DB snapshots that have been taken by my Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>shared</code> – All manual DB snapshots that have been shared to my Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>public</code> – All DB snapshots that have been marked as public.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>awsbackup</code> – All DB snapshots managed by the Amazon Web Services Backup service.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of DB snapshots to be returned. You can specify one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>automated</code> – All DB snapshots that have been automatically taken by Amazon RDS for my Amazon
     *         Web Services account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>manual</code> – All DB snapshots that have been taken by my Amazon Web Services account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>shared</code> – All manual DB snapshots that have been shared to my Amazon Web Services account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>public</code> – All DB snapshots that have been marked as public.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>awsbackup</code> – All DB snapshots managed by the Amazon Web Services Backup service.
     *         </p>
     *         </li>
     */

    public String getSnapshotType() {
        return this.snapshotType;
    }

    /**
     * <p>
     * The type of DB snapshots to be returned. You can specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>automated</code> – All DB snapshots that have been automatically taken by Amazon RDS for my Amazon Web
     * Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manual</code> – All DB snapshots that have been taken by my Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>shared</code> – All manual DB snapshots that have been shared to my Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>public</code> – All DB snapshots that have been marked as public.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>awsbackup</code> – All DB snapshots managed by the Amazon Web Services Backup service.
     * </p>
     * </li>
     * </ul>
     * 
     * @param snapshotType
     *        The type of DB snapshots to be returned. You can specify one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>automated</code> – All DB snapshots that have been automatically taken by Amazon RDS for my Amazon
     *        Web Services account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>manual</code> – All DB snapshots that have been taken by my Amazon Web Services account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>shared</code> – All manual DB snapshots that have been shared to my Amazon Web Services account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>public</code> – All DB snapshots that have been marked as public.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>awsbackup</code> – All DB snapshots managed by the Amazon Web Services Backup service.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBSnapshotTenantDatabasesRequest withSnapshotType(String snapshotType) {
        setSnapshotType(snapshotType);
        return this;
    }

    /**
     * <p>
     * A filter that specifies one or more tenant databases to describe.
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
     * <code>tenant-database-resource-id</code> - Tenant database resource identifiers. The results list only includes
     * information about the tenant databases contained within the DB snapshots.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dbi-resource-id</code> - DB instance resource identifiers. The results list only includes information about
     * snapshots containing tenant databases contained within the DB instances identified by these resource identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db-instance-id</code> - Accepts DB instance identifiers and DB instance Amazon Resource Names (ARNs).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db-snapshot-id</code> - Accepts DB snapshot identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-type</code> - Accepts types of DB snapshots.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A filter that specifies one or more tenant databases to describe.</p>
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
     *         <code>tenant-database-resource-id</code> - Tenant database resource identifiers. The results list only
     *         includes information about the tenant databases contained within the DB snapshots.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>dbi-resource-id</code> - DB instance resource identifiers. The results list only includes
     *         information about snapshots containing tenant databases contained within the DB instances identified by
     *         these resource identifiers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>db-instance-id</code> - Accepts DB instance identifiers and DB instance Amazon Resource Names
     *         (ARNs).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>db-snapshot-id</code> - Accepts DB snapshot identifiers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>snapshot-type</code> - Accepts types of DB snapshots.
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
     * A filter that specifies one or more tenant databases to describe.
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
     * <code>tenant-database-resource-id</code> - Tenant database resource identifiers. The results list only includes
     * information about the tenant databases contained within the DB snapshots.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dbi-resource-id</code> - DB instance resource identifiers. The results list only includes information about
     * snapshots containing tenant databases contained within the DB instances identified by these resource identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db-instance-id</code> - Accepts DB instance identifiers and DB instance Amazon Resource Names (ARNs).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db-snapshot-id</code> - Accepts DB snapshot identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-type</code> - Accepts types of DB snapshots.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        A filter that specifies one or more tenant databases to describe.</p>
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
     *        <code>tenant-database-resource-id</code> - Tenant database resource identifiers. The results list only
     *        includes information about the tenant databases contained within the DB snapshots.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dbi-resource-id</code> - DB instance resource identifiers. The results list only includes
     *        information about snapshots containing tenant databases contained within the DB instances identified by
     *        these resource identifiers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db-instance-id</code> - Accepts DB instance identifiers and DB instance Amazon Resource Names
     *        (ARNs).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db-snapshot-id</code> - Accepts DB snapshot identifiers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>snapshot-type</code> - Accepts types of DB snapshots.
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
     * A filter that specifies one or more tenant databases to describe.
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
     * <code>tenant-database-resource-id</code> - Tenant database resource identifiers. The results list only includes
     * information about the tenant databases contained within the DB snapshots.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dbi-resource-id</code> - DB instance resource identifiers. The results list only includes information about
     * snapshots containing tenant databases contained within the DB instances identified by these resource identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db-instance-id</code> - Accepts DB instance identifiers and DB instance Amazon Resource Names (ARNs).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db-snapshot-id</code> - Accepts DB snapshot identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-type</code> - Accepts types of DB snapshots.
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
     *        A filter that specifies one or more tenant databases to describe.</p>
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
     *        <code>tenant-database-resource-id</code> - Tenant database resource identifiers. The results list only
     *        includes information about the tenant databases contained within the DB snapshots.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dbi-resource-id</code> - DB instance resource identifiers. The results list only includes
     *        information about snapshots containing tenant databases contained within the DB instances identified by
     *        these resource identifiers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db-instance-id</code> - Accepts DB instance identifiers and DB instance Amazon Resource Names
     *        (ARNs).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db-snapshot-id</code> - Accepts DB snapshot identifiers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>snapshot-type</code> - Accepts types of DB snapshots.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBSnapshotTenantDatabasesRequest withFilters(Filter... filters) {
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
     * A filter that specifies one or more tenant databases to describe.
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
     * <code>tenant-database-resource-id</code> - Tenant database resource identifiers. The results list only includes
     * information about the tenant databases contained within the DB snapshots.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dbi-resource-id</code> - DB instance resource identifiers. The results list only includes information about
     * snapshots containing tenant databases contained within the DB instances identified by these resource identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db-instance-id</code> - Accepts DB instance identifiers and DB instance Amazon Resource Names (ARNs).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db-snapshot-id</code> - Accepts DB snapshot identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-type</code> - Accepts types of DB snapshots.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        A filter that specifies one or more tenant databases to describe.</p>
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
     *        <code>tenant-database-resource-id</code> - Tenant database resource identifiers. The results list only
     *        includes information about the tenant databases contained within the DB snapshots.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dbi-resource-id</code> - DB instance resource identifiers. The results list only includes
     *        information about snapshots containing tenant databases contained within the DB instances identified by
     *        these resource identifiers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db-instance-id</code> - Accepts DB instance identifiers and DB instance Amazon Resource Names
     *        (ARNs).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db-snapshot-id</code> - Accepts DB snapshot identifiers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>snapshot-type</code> - Accepts types of DB snapshots.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBSnapshotTenantDatabasesRequest withFilters(java.util.Collection<Filter> filters) {
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

    public DescribeDBSnapshotTenantDatabasesRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeDBSnapshotTenantDatabases</code> request. If
     * this parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <code>DescribeDBSnapshotTenantDatabases</code>
     *        request. If this parameter is specified, the response includes only records beyond the marker, up to the
     *        value specified by <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeDBSnapshotTenantDatabases</code> request. If
     * this parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous <code>DescribeDBSnapshotTenantDatabases</code>
     *         request. If this parameter is specified, the response includes only records beyond the marker, up to the
     *         value specified by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeDBSnapshotTenantDatabases</code> request. If
     * this parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <code>DescribeDBSnapshotTenantDatabases</code>
     *        request. If this parameter is specified, the response includes only records beyond the marker, up to the
     *        value specified by <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBSnapshotTenantDatabasesRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A specific DB resource identifier to describe.
     * </p>
     * 
     * @param dbiResourceId
     *        A specific DB resource identifier to describe.
     */

    public void setDbiResourceId(String dbiResourceId) {
        this.dbiResourceId = dbiResourceId;
    }

    /**
     * <p>
     * A specific DB resource identifier to describe.
     * </p>
     * 
     * @return A specific DB resource identifier to describe.
     */

    public String getDbiResourceId() {
        return this.dbiResourceId;
    }

    /**
     * <p>
     * A specific DB resource identifier to describe.
     * </p>
     * 
     * @param dbiResourceId
     *        A specific DB resource identifier to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBSnapshotTenantDatabasesRequest withDbiResourceId(String dbiResourceId) {
        setDbiResourceId(dbiResourceId);
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
        if (getDBSnapshotIdentifier() != null)
            sb.append("DBSnapshotIdentifier: ").append(getDBSnapshotIdentifier()).append(",");
        if (getSnapshotType() != null)
            sb.append("SnapshotType: ").append(getSnapshotType()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getDbiResourceId() != null)
            sb.append("DbiResourceId: ").append(getDbiResourceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBSnapshotTenantDatabasesRequest == false)
            return false;
        DescribeDBSnapshotTenantDatabasesRequest other = (DescribeDBSnapshotTenantDatabasesRequest) obj;
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        if (other.getDBSnapshotIdentifier() == null ^ this.getDBSnapshotIdentifier() == null)
            return false;
        if (other.getDBSnapshotIdentifier() != null && other.getDBSnapshotIdentifier().equals(this.getDBSnapshotIdentifier()) == false)
            return false;
        if (other.getSnapshotType() == null ^ this.getSnapshotType() == null)
            return false;
        if (other.getSnapshotType() != null && other.getSnapshotType().equals(this.getSnapshotType()) == false)
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
        if (other.getDbiResourceId() == null ^ this.getDbiResourceId() == null)
            return false;
        if (other.getDbiResourceId() != null && other.getDbiResourceId().equals(this.getDbiResourceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDBSnapshotIdentifier() == null) ? 0 : getDBSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSnapshotType() == null) ? 0 : getSnapshotType().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getDbiResourceId() == null) ? 0 : getDbiResourceId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDBSnapshotTenantDatabasesRequest clone() {
        return (DescribeDBSnapshotTenantDatabasesRequest) super.clone();
    }

}
