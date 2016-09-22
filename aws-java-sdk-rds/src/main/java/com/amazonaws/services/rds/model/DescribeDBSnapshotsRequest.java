/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 */
public class DescribeDBSnapshotsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the DB instance to retrieve the list of DB snapshots for. This parameter cannot be used in conjunction
     * with <code>DBSnapshotIdentifier</code>. This parameter is not case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     */
    private String dBInstanceIdentifier;
    /**
     * <p>
     * A specific DB snapshot identifier to describe. This parameter cannot be used in conjunction with
     * <code>DBInstanceIdentifier</code>. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * If this identifier is for an automated snapshot, the <code>SnapshotType</code> parameter must also be specified.
     * </p>
     * </li>
     * </ul>
     */
    private String dBSnapshotIdentifier;
    /**
     * <p>
     * The type of snapshots to be returned. You can specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>automated</code> - Return all DB snapshots that have been automatically taken by Amazon RDS for my AWS
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manual</code> - Return all DB snapshots that have been taken by my AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>shared</code> - Return all manual DB snapshots that have been shared to my AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>public</code> - Return all DB snapshots that have been marked as public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a <code>SnapshotType</code> value, then both automated and manual snapshots are returned.
     * Shared and public DB snapshots are not included in the returned results by default. You can include shared
     * snapshots with these results by setting the <code>IncludeShared</code> parameter to <code>true</code>. You can
     * include public snapshots with these results by setting the <code>IncludePublic</code> parameter to
     * <code>true</code>.
     * </p>
     * <p>
     * The <code>IncludeShared</code> and <code>IncludePublic</code> parameters don't apply for
     * <code>SnapshotType</code> values of <code>manual</code> or <code>automated</code>. The <code>IncludePublic</code>
     * parameter doesn't apply when <code>SnapshotType</code> is set to <code>shared</code>. The
     * <code>IncludeShared</code> parameter doesn't apply when <code>SnapshotType</code> is set to <code>public</code>.
     * </p>
     */
    private String snapshotType;
    /**
     * <p>
     * This parameter is not currently supported.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that the
     * remaining results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeDBSnapshots</code> request. If this parameter
     * is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Set this value to <code>true</code> to include shared manual DB snapshots from other AWS accounts that this AWS
     * account has been given permission to copy or restore, otherwise set this value to <code>false</code>. The default
     * is <code>false</code>.
     * </p>
     * <p>
     * You can give an AWS account permission to restore a manual DB snapshot from another AWS account by using the
     * <a>ModifyDBSnapshotAttribute</a> API action.
     * </p>
     */
    private Boolean includeShared;
    /**
     * <p>
     * Set this value to <code>true</code> to include manual DB snapshots that are public and can be copied or restored
     * by any AWS account, otherwise set this value to <code>false</code>. The default is <code>false</code>.
     * </p>
     * <p>
     * You can share a manual DB snapshot as public by using the <a>ModifyDBSnapshotAttribute</a> API.
     * </p>
     */
    private Boolean includePublic;

    /**
     * <p>
     * The ID of the DB instance to retrieve the list of DB snapshots for. This parameter cannot be used in conjunction
     * with <code>DBSnapshotIdentifier</code>. This parameter is not case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBInstanceIdentifier
     *        The ID of the DB instance to retrieve the list of DB snapshots for. This parameter cannot be used in
     *        conjunction with <code>DBSnapshotIdentifier</code>. This parameter is not case-sensitive. </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 alphanumeric characters or hyphens
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     */

    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * The ID of the DB instance to retrieve the list of DB snapshots for. This parameter cannot be used in conjunction
     * with <code>DBSnapshotIdentifier</code>. This parameter is not case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * 
     * @return The ID of the DB instance to retrieve the list of DB snapshots for. This parameter cannot be used in
     *         conjunction with <code>DBSnapshotIdentifier</code>. This parameter is not case-sensitive. </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 1 to 63 alphanumeric characters or hyphens
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot end with a hyphen or contain two consecutive hyphens
     *         </p>
     *         </li>
     */

    public String getDBInstanceIdentifier() {
        return this.dBInstanceIdentifier;
    }

    /**
     * <p>
     * The ID of the DB instance to retrieve the list of DB snapshots for. This parameter cannot be used in conjunction
     * with <code>DBSnapshotIdentifier</code>. This parameter is not case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBInstanceIdentifier
     *        The ID of the DB instance to retrieve the list of DB snapshots for. This parameter cannot be used in
     *        conjunction with <code>DBSnapshotIdentifier</code>. This parameter is not case-sensitive. </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 alphanumeric characters or hyphens
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBSnapshotsRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * A specific DB snapshot identifier to describe. This parameter cannot be used in conjunction with
     * <code>DBInstanceIdentifier</code>. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * If this identifier is for an automated snapshot, the <code>SnapshotType</code> parameter must also be specified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBSnapshotIdentifier
     *        A specific DB snapshot identifier to describe. This parameter cannot be used in conjunction with
     *        <code>DBInstanceIdentifier</code>. This value is stored as a lowercase string. </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 255 alphanumeric characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If this identifier is for an automated snapshot, the <code>SnapshotType</code> parameter must also be
     *        specified.
     *        </p>
     *        </li>
     */

    public void setDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
    }

    /**
     * <p>
     * A specific DB snapshot identifier to describe. This parameter cannot be used in conjunction with
     * <code>DBInstanceIdentifier</code>. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * If this identifier is for an automated snapshot, the <code>SnapshotType</code> parameter must also be specified.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A specific DB snapshot identifier to describe. This parameter cannot be used in conjunction with
     *         <code>DBInstanceIdentifier</code>. This value is stored as a lowercase string. </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 255 alphanumeric characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If this identifier is for an automated snapshot, the <code>SnapshotType</code> parameter must also be
     *         specified.
     *         </p>
     *         </li>
     */

    public String getDBSnapshotIdentifier() {
        return this.dBSnapshotIdentifier;
    }

    /**
     * <p>
     * A specific DB snapshot identifier to describe. This parameter cannot be used in conjunction with
     * <code>DBInstanceIdentifier</code>. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * If this identifier is for an automated snapshot, the <code>SnapshotType</code> parameter must also be specified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBSnapshotIdentifier
     *        A specific DB snapshot identifier to describe. This parameter cannot be used in conjunction with
     *        <code>DBInstanceIdentifier</code>. This value is stored as a lowercase string. </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 255 alphanumeric characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If this identifier is for an automated snapshot, the <code>SnapshotType</code> parameter must also be
     *        specified.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBSnapshotsRequest withDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        setDBSnapshotIdentifier(dBSnapshotIdentifier);
        return this;
    }

    /**
     * <p>
     * The type of snapshots to be returned. You can specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>automated</code> - Return all DB snapshots that have been automatically taken by Amazon RDS for my AWS
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manual</code> - Return all DB snapshots that have been taken by my AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>shared</code> - Return all manual DB snapshots that have been shared to my AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>public</code> - Return all DB snapshots that have been marked as public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a <code>SnapshotType</code> value, then both automated and manual snapshots are returned.
     * Shared and public DB snapshots are not included in the returned results by default. You can include shared
     * snapshots with these results by setting the <code>IncludeShared</code> parameter to <code>true</code>. You can
     * include public snapshots with these results by setting the <code>IncludePublic</code> parameter to
     * <code>true</code>.
     * </p>
     * <p>
     * The <code>IncludeShared</code> and <code>IncludePublic</code> parameters don't apply for
     * <code>SnapshotType</code> values of <code>manual</code> or <code>automated</code>. The <code>IncludePublic</code>
     * parameter doesn't apply when <code>SnapshotType</code> is set to <code>shared</code>. The
     * <code>IncludeShared</code> parameter doesn't apply when <code>SnapshotType</code> is set to <code>public</code>.
     * </p>
     * 
     * @param snapshotType
     *        The type of snapshots to be returned. You can specify one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>automated</code> - Return all DB snapshots that have been automatically taken by Amazon RDS for my
     *        AWS account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>manual</code> - Return all DB snapshots that have been taken by my AWS account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>shared</code> - Return all manual DB snapshots that have been shared to my AWS account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>public</code> - Return all DB snapshots that have been marked as public.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify a <code>SnapshotType</code> value, then both automated and manual snapshots are
     *        returned. Shared and public DB snapshots are not included in the returned results by default. You can
     *        include shared snapshots with these results by setting the <code>IncludeShared</code> parameter to
     *        <code>true</code>. You can include public snapshots with these results by setting the
     *        <code>IncludePublic</code> parameter to <code>true</code>.
     *        </p>
     *        <p>
     *        The <code>IncludeShared</code> and <code>IncludePublic</code> parameters don't apply for
     *        <code>SnapshotType</code> values of <code>manual</code> or <code>automated</code>. The
     *        <code>IncludePublic</code> parameter doesn't apply when <code>SnapshotType</code> is set to
     *        <code>shared</code>. The <code>IncludeShared</code> parameter doesn't apply when <code>SnapshotType</code>
     *        is set to <code>public</code>.
     */

    public void setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
    }

    /**
     * <p>
     * The type of snapshots to be returned. You can specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>automated</code> - Return all DB snapshots that have been automatically taken by Amazon RDS for my AWS
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manual</code> - Return all DB snapshots that have been taken by my AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>shared</code> - Return all manual DB snapshots that have been shared to my AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>public</code> - Return all DB snapshots that have been marked as public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a <code>SnapshotType</code> value, then both automated and manual snapshots are returned.
     * Shared and public DB snapshots are not included in the returned results by default. You can include shared
     * snapshots with these results by setting the <code>IncludeShared</code> parameter to <code>true</code>. You can
     * include public snapshots with these results by setting the <code>IncludePublic</code> parameter to
     * <code>true</code>.
     * </p>
     * <p>
     * The <code>IncludeShared</code> and <code>IncludePublic</code> parameters don't apply for
     * <code>SnapshotType</code> values of <code>manual</code> or <code>automated</code>. The <code>IncludePublic</code>
     * parameter doesn't apply when <code>SnapshotType</code> is set to <code>shared</code>. The
     * <code>IncludeShared</code> parameter doesn't apply when <code>SnapshotType</code> is set to <code>public</code>.
     * </p>
     * 
     * @return The type of snapshots to be returned. You can specify one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>automated</code> - Return all DB snapshots that have been automatically taken by Amazon RDS for my
     *         AWS account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>manual</code> - Return all DB snapshots that have been taken by my AWS account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>shared</code> - Return all manual DB snapshots that have been shared to my AWS account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>public</code> - Return all DB snapshots that have been marked as public.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you don't specify a <code>SnapshotType</code> value, then both automated and manual snapshots are
     *         returned. Shared and public DB snapshots are not included in the returned results by default. You can
     *         include shared snapshots with these results by setting the <code>IncludeShared</code> parameter to
     *         <code>true</code>. You can include public snapshots with these results by setting the
     *         <code>IncludePublic</code> parameter to <code>true</code>.
     *         </p>
     *         <p>
     *         The <code>IncludeShared</code> and <code>IncludePublic</code> parameters don't apply for
     *         <code>SnapshotType</code> values of <code>manual</code> or <code>automated</code>. The
     *         <code>IncludePublic</code> parameter doesn't apply when <code>SnapshotType</code> is set to
     *         <code>shared</code>. The <code>IncludeShared</code> parameter doesn't apply when
     *         <code>SnapshotType</code> is set to <code>public</code>.
     */

    public String getSnapshotType() {
        return this.snapshotType;
    }

    /**
     * <p>
     * The type of snapshots to be returned. You can specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>automated</code> - Return all DB snapshots that have been automatically taken by Amazon RDS for my AWS
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manual</code> - Return all DB snapshots that have been taken by my AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>shared</code> - Return all manual DB snapshots that have been shared to my AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>public</code> - Return all DB snapshots that have been marked as public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a <code>SnapshotType</code> value, then both automated and manual snapshots are returned.
     * Shared and public DB snapshots are not included in the returned results by default. You can include shared
     * snapshots with these results by setting the <code>IncludeShared</code> parameter to <code>true</code>. You can
     * include public snapshots with these results by setting the <code>IncludePublic</code> parameter to
     * <code>true</code>.
     * </p>
     * <p>
     * The <code>IncludeShared</code> and <code>IncludePublic</code> parameters don't apply for
     * <code>SnapshotType</code> values of <code>manual</code> or <code>automated</code>. The <code>IncludePublic</code>
     * parameter doesn't apply when <code>SnapshotType</code> is set to <code>shared</code>. The
     * <code>IncludeShared</code> parameter doesn't apply when <code>SnapshotType</code> is set to <code>public</code>.
     * </p>
     * 
     * @param snapshotType
     *        The type of snapshots to be returned. You can specify one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>automated</code> - Return all DB snapshots that have been automatically taken by Amazon RDS for my
     *        AWS account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>manual</code> - Return all DB snapshots that have been taken by my AWS account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>shared</code> - Return all manual DB snapshots that have been shared to my AWS account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>public</code> - Return all DB snapshots that have been marked as public.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify a <code>SnapshotType</code> value, then both automated and manual snapshots are
     *        returned. Shared and public DB snapshots are not included in the returned results by default. You can
     *        include shared snapshots with these results by setting the <code>IncludeShared</code> parameter to
     *        <code>true</code>. You can include public snapshots with these results by setting the
     *        <code>IncludePublic</code> parameter to <code>true</code>.
     *        </p>
     *        <p>
     *        The <code>IncludeShared</code> and <code>IncludePublic</code> parameters don't apply for
     *        <code>SnapshotType</code> values of <code>manual</code> or <code>automated</code>. The
     *        <code>IncludePublic</code> parameter doesn't apply when <code>SnapshotType</code> is set to
     *        <code>shared</code>. The <code>IncludeShared</code> parameter doesn't apply when <code>SnapshotType</code>
     *        is set to <code>public</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBSnapshotsRequest withSnapshotType(String snapshotType) {
        setSnapshotType(snapshotType);
        return this;
    }

    /**
     * <p>
     * This parameter is not currently supported.
     * </p>
     * 
     * @return This parameter is not currently supported.
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * This parameter is not currently supported.
     * </p>
     * 
     * @param filters
     *        This parameter is not currently supported.
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
     * This parameter is not currently supported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        This parameter is not currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBSnapshotsRequest withFilters(Filter... filters) {
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
     * This parameter is not currently supported.
     * </p>
     * 
     * @param filters
     *        This parameter is not currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBSnapshotsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that the
     * remaining results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that the
     *        remaining results can be retrieved. </p>
     *        <p>
     *        Default: 100
     *        </p>
     *        <p>
     *        Constraints: Minimum 20, maximum 100.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that the
     * remaining results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @return The maximum number of records to include in the response. If more records exist than the specified
     *         <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that the
     *         remaining results can be retrieved. </p>
     *         <p>
     *         Default: 100
     *         </p>
     *         <p>
     *         Constraints: Minimum 20, maximum 100.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that the
     * remaining results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that the
     *        remaining results can be retrieved. </p>
     *        <p>
     *        Default: 100
     *        </p>
     *        <p>
     *        Constraints: Minimum 20, maximum 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBSnapshotsRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeDBSnapshots</code> request. If this parameter
     * is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <code>DescribeDBSnapshots</code> request. If this
     *        parameter is specified, the response includes only records beyond the marker, up to the value specified by
     *        <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeDBSnapshots</code> request. If this parameter
     * is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous <code>DescribeDBSnapshots</code> request. If this
     *         parameter is specified, the response includes only records beyond the marker, up to the value specified
     *         by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeDBSnapshots</code> request. If this parameter
     * is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <code>DescribeDBSnapshots</code> request. If this
     *        parameter is specified, the response includes only records beyond the marker, up to the value specified by
     *        <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBSnapshotsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Set this value to <code>true</code> to include shared manual DB snapshots from other AWS accounts that this AWS
     * account has been given permission to copy or restore, otherwise set this value to <code>false</code>. The default
     * is <code>false</code>.
     * </p>
     * <p>
     * You can give an AWS account permission to restore a manual DB snapshot from another AWS account by using the
     * <a>ModifyDBSnapshotAttribute</a> API action.
     * </p>
     * 
     * @param includeShared
     *        Set this value to <code>true</code> to include shared manual DB snapshots from other AWS accounts that
     *        this AWS account has been given permission to copy or restore, otherwise set this value to
     *        <code>false</code>. The default is <code>false</code>.</p>
     *        <p>
     *        You can give an AWS account permission to restore a manual DB snapshot from another AWS account by using
     *        the <a>ModifyDBSnapshotAttribute</a> API action.
     */

    public void setIncludeShared(Boolean includeShared) {
        this.includeShared = includeShared;
    }

    /**
     * <p>
     * Set this value to <code>true</code> to include shared manual DB snapshots from other AWS accounts that this AWS
     * account has been given permission to copy or restore, otherwise set this value to <code>false</code>. The default
     * is <code>false</code>.
     * </p>
     * <p>
     * You can give an AWS account permission to restore a manual DB snapshot from another AWS account by using the
     * <a>ModifyDBSnapshotAttribute</a> API action.
     * </p>
     * 
     * @return Set this value to <code>true</code> to include shared manual DB snapshots from other AWS accounts that
     *         this AWS account has been given permission to copy or restore, otherwise set this value to
     *         <code>false</code>. The default is <code>false</code>.</p>
     *         <p>
     *         You can give an AWS account permission to restore a manual DB snapshot from another AWS account by using
     *         the <a>ModifyDBSnapshotAttribute</a> API action.
     */

    public Boolean getIncludeShared() {
        return this.includeShared;
    }

    /**
     * <p>
     * Set this value to <code>true</code> to include shared manual DB snapshots from other AWS accounts that this AWS
     * account has been given permission to copy or restore, otherwise set this value to <code>false</code>. The default
     * is <code>false</code>.
     * </p>
     * <p>
     * You can give an AWS account permission to restore a manual DB snapshot from another AWS account by using the
     * <a>ModifyDBSnapshotAttribute</a> API action.
     * </p>
     * 
     * @param includeShared
     *        Set this value to <code>true</code> to include shared manual DB snapshots from other AWS accounts that
     *        this AWS account has been given permission to copy or restore, otherwise set this value to
     *        <code>false</code>. The default is <code>false</code>.</p>
     *        <p>
     *        You can give an AWS account permission to restore a manual DB snapshot from another AWS account by using
     *        the <a>ModifyDBSnapshotAttribute</a> API action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBSnapshotsRequest withIncludeShared(Boolean includeShared) {
        setIncludeShared(includeShared);
        return this;
    }

    /**
     * <p>
     * Set this value to <code>true</code> to include shared manual DB snapshots from other AWS accounts that this AWS
     * account has been given permission to copy or restore, otherwise set this value to <code>false</code>. The default
     * is <code>false</code>.
     * </p>
     * <p>
     * You can give an AWS account permission to restore a manual DB snapshot from another AWS account by using the
     * <a>ModifyDBSnapshotAttribute</a> API action.
     * </p>
     * 
     * @return Set this value to <code>true</code> to include shared manual DB snapshots from other AWS accounts that
     *         this AWS account has been given permission to copy or restore, otherwise set this value to
     *         <code>false</code>. The default is <code>false</code>.</p>
     *         <p>
     *         You can give an AWS account permission to restore a manual DB snapshot from another AWS account by using
     *         the <a>ModifyDBSnapshotAttribute</a> API action.
     */

    public Boolean isIncludeShared() {
        return this.includeShared;
    }

    /**
     * <p>
     * Set this value to <code>true</code> to include manual DB snapshots that are public and can be copied or restored
     * by any AWS account, otherwise set this value to <code>false</code>. The default is <code>false</code>.
     * </p>
     * <p>
     * You can share a manual DB snapshot as public by using the <a>ModifyDBSnapshotAttribute</a> API.
     * </p>
     * 
     * @param includePublic
     *        Set this value to <code>true</code> to include manual DB snapshots that are public and can be copied or
     *        restored by any AWS account, otherwise set this value to <code>false</code>. The default is
     *        <code>false</code>.</p>
     *        <p>
     *        You can share a manual DB snapshot as public by using the <a>ModifyDBSnapshotAttribute</a> API.
     */

    public void setIncludePublic(Boolean includePublic) {
        this.includePublic = includePublic;
    }

    /**
     * <p>
     * Set this value to <code>true</code> to include manual DB snapshots that are public and can be copied or restored
     * by any AWS account, otherwise set this value to <code>false</code>. The default is <code>false</code>.
     * </p>
     * <p>
     * You can share a manual DB snapshot as public by using the <a>ModifyDBSnapshotAttribute</a> API.
     * </p>
     * 
     * @return Set this value to <code>true</code> to include manual DB snapshots that are public and can be copied or
     *         restored by any AWS account, otherwise set this value to <code>false</code>. The default is
     *         <code>false</code>.</p>
     *         <p>
     *         You can share a manual DB snapshot as public by using the <a>ModifyDBSnapshotAttribute</a> API.
     */

    public Boolean getIncludePublic() {
        return this.includePublic;
    }

    /**
     * <p>
     * Set this value to <code>true</code> to include manual DB snapshots that are public and can be copied or restored
     * by any AWS account, otherwise set this value to <code>false</code>. The default is <code>false</code>.
     * </p>
     * <p>
     * You can share a manual DB snapshot as public by using the <a>ModifyDBSnapshotAttribute</a> API.
     * </p>
     * 
     * @param includePublic
     *        Set this value to <code>true</code> to include manual DB snapshots that are public and can be copied or
     *        restored by any AWS account, otherwise set this value to <code>false</code>. The default is
     *        <code>false</code>.</p>
     *        <p>
     *        You can share a manual DB snapshot as public by using the <a>ModifyDBSnapshotAttribute</a> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBSnapshotsRequest withIncludePublic(Boolean includePublic) {
        setIncludePublic(includePublic);
        return this;
    }

    /**
     * <p>
     * Set this value to <code>true</code> to include manual DB snapshots that are public and can be copied or restored
     * by any AWS account, otherwise set this value to <code>false</code>. The default is <code>false</code>.
     * </p>
     * <p>
     * You can share a manual DB snapshot as public by using the <a>ModifyDBSnapshotAttribute</a> API.
     * </p>
     * 
     * @return Set this value to <code>true</code> to include manual DB snapshots that are public and can be copied or
     *         restored by any AWS account, otherwise set this value to <code>false</code>. The default is
     *         <code>false</code>.</p>
     *         <p>
     *         You can share a manual DB snapshot as public by using the <a>ModifyDBSnapshotAttribute</a> API.
     */

    public Boolean isIncludePublic() {
        return this.includePublic;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("DBInstanceIdentifier: " + getDBInstanceIdentifier() + ",");
        if (getDBSnapshotIdentifier() != null)
            sb.append("DBSnapshotIdentifier: " + getDBSnapshotIdentifier() + ",");
        if (getSnapshotType() != null)
            sb.append("SnapshotType: " + getSnapshotType() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getIncludeShared() != null)
            sb.append("IncludeShared: " + getIncludeShared() + ",");
        if (getIncludePublic() != null)
            sb.append("IncludePublic: " + getIncludePublic());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBSnapshotsRequest == false)
            return false;
        DescribeDBSnapshotsRequest other = (DescribeDBSnapshotsRequest) obj;
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
        if (other.getIncludeShared() == null ^ this.getIncludeShared() == null)
            return false;
        if (other.getIncludeShared() != null && other.getIncludeShared().equals(this.getIncludeShared()) == false)
            return false;
        if (other.getIncludePublic() == null ^ this.getIncludePublic() == null)
            return false;
        if (other.getIncludePublic() != null && other.getIncludePublic().equals(this.getIncludePublic()) == false)
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
        hashCode = prime * hashCode + ((getIncludeShared() == null) ? 0 : getIncludeShared().hashCode());
        hashCode = prime * hashCode + ((getIncludePublic() == null) ? 0 : getIncludePublic().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDBSnapshotsRequest clone() {
        return (DescribeDBSnapshotsRequest) super.clone();
    }
}
