/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBClusterSnapshots" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBClusterSnapshotsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the DB cluster to retrieve the list of DB cluster snapshots for. This parameter can't be used in
     * conjunction with the <code>DBClusterSnapshotIdentifier</code> parameter. This parameter is not case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the identifier of an existing DBCluster.
     * </p>
     * </li>
     * </ul>
     */
    private String dBClusterIdentifier;
    /**
     * <p>
     * A specific DB cluster snapshot identifier to describe. This parameter can't be used in conjunction with the
     * <code>DBClusterIdentifier</code> parameter. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the identifier of an existing DBClusterSnapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If this identifier is for an automated snapshot, the <code>SnapshotType</code> parameter must also be specified.
     * </p>
     * </li>
     * </ul>
     */
    private String dBClusterSnapshotIdentifier;
    /**
     * <p>
     * The type of DB cluster snapshots to be returned. You can specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>automated</code> - Return all DB cluster snapshots that have been automatically taken by Amazon RDS for my
     * AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manual</code> - Return all DB cluster snapshots that have been taken by my AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>shared</code> - Return all manual DB cluster snapshots that have been shared to my AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>public</code> - Return all DB cluster snapshots that have been marked as public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a <code>SnapshotType</code> value, then both automated and manual DB cluster snapshots are
     * returned. You can include shared DB cluster snapshots with these results by setting the
     * <code>IncludeShared</code> parameter to <code>true</code>. You can include public DB cluster snapshots with these
     * results by setting the <code>IncludePublic</code> parameter to <code>true</code>.
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
     * An optional pagination token provided by a previous <code>DescribeDBClusterSnapshots</code> request. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * True to include shared manual DB cluster snapshots from other AWS accounts that this AWS account has been given
     * permission to copy or restore, and otherwise false. The default is <code>false</code>.
     * </p>
     * <p>
     * You can give an AWS account permission to restore a manual DB cluster snapshot from another AWS account by the
     * <a>ModifyDBClusterSnapshotAttribute</a> API action.
     * </p>
     */
    private Boolean includeShared;
    /**
     * <p>
     * True to include manual DB cluster snapshots that are public and can be copied or restored by any AWS account, and
     * otherwise false. The default is <code>false</code>. The default is false.
     * </p>
     * <p>
     * You can share a manual DB cluster snapshot as public by using the <a>ModifyDBClusterSnapshotAttribute</a> API
     * action.
     * </p>
     */
    private Boolean includePublic;

    /**
     * <p>
     * The ID of the DB cluster to retrieve the list of DB cluster snapshots for. This parameter can't be used in
     * conjunction with the <code>DBClusterSnapshotIdentifier</code> parameter. This parameter is not case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the identifier of an existing DBCluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBClusterIdentifier
     *        The ID of the DB cluster to retrieve the list of DB cluster snapshots for. This parameter can't be used in
     *        conjunction with the <code>DBClusterSnapshotIdentifier</code> parameter. This parameter is not
     *        case-sensitive. </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match the identifier of an existing DBCluster.
     *        </p>
     *        </li>
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The ID of the DB cluster to retrieve the list of DB cluster snapshots for. This parameter can't be used in
     * conjunction with the <code>DBClusterSnapshotIdentifier</code> parameter. This parameter is not case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the identifier of an existing DBCluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The ID of the DB cluster to retrieve the list of DB cluster snapshots for. This parameter can't be used
     *         in conjunction with the <code>DBClusterSnapshotIdentifier</code> parameter. This parameter is not
     *         case-sensitive. </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If supplied, must match the identifier of an existing DBCluster.
     *         </p>
     *         </li>
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * The ID of the DB cluster to retrieve the list of DB cluster snapshots for. This parameter can't be used in
     * conjunction with the <code>DBClusterSnapshotIdentifier</code> parameter. This parameter is not case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the identifier of an existing DBCluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBClusterIdentifier
     *        The ID of the DB cluster to retrieve the list of DB cluster snapshots for. This parameter can't be used in
     *        conjunction with the <code>DBClusterSnapshotIdentifier</code> parameter. This parameter is not
     *        case-sensitive. </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match the identifier of an existing DBCluster.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClusterSnapshotsRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * A specific DB cluster snapshot identifier to describe. This parameter can't be used in conjunction with the
     * <code>DBClusterIdentifier</code> parameter. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the identifier of an existing DBClusterSnapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If this identifier is for an automated snapshot, the <code>SnapshotType</code> parameter must also be specified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBClusterSnapshotIdentifier
     *        A specific DB cluster snapshot identifier to describe. This parameter can't be used in conjunction with
     *        the <code>DBClusterIdentifier</code> parameter. This value is stored as a lowercase string. </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match the identifier of an existing DBClusterSnapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If this identifier is for an automated snapshot, the <code>SnapshotType</code> parameter must also be
     *        specified.
     *        </p>
     *        </li>
     */

    public void setDBClusterSnapshotIdentifier(String dBClusterSnapshotIdentifier) {
        this.dBClusterSnapshotIdentifier = dBClusterSnapshotIdentifier;
    }

    /**
     * <p>
     * A specific DB cluster snapshot identifier to describe. This parameter can't be used in conjunction with the
     * <code>DBClusterIdentifier</code> parameter. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the identifier of an existing DBClusterSnapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If this identifier is for an automated snapshot, the <code>SnapshotType</code> parameter must also be specified.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A specific DB cluster snapshot identifier to describe. This parameter can't be used in conjunction with
     *         the <code>DBClusterIdentifier</code> parameter. This value is stored as a lowercase string. </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If supplied, must match the identifier of an existing DBClusterSnapshot.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If this identifier is for an automated snapshot, the <code>SnapshotType</code> parameter must also be
     *         specified.
     *         </p>
     *         </li>
     */

    public String getDBClusterSnapshotIdentifier() {
        return this.dBClusterSnapshotIdentifier;
    }

    /**
     * <p>
     * A specific DB cluster snapshot identifier to describe. This parameter can't be used in conjunction with the
     * <code>DBClusterIdentifier</code> parameter. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the identifier of an existing DBClusterSnapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If this identifier is for an automated snapshot, the <code>SnapshotType</code> parameter must also be specified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBClusterSnapshotIdentifier
     *        A specific DB cluster snapshot identifier to describe. This parameter can't be used in conjunction with
     *        the <code>DBClusterIdentifier</code> parameter. This value is stored as a lowercase string. </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match the identifier of an existing DBClusterSnapshot.
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

    public DescribeDBClusterSnapshotsRequest withDBClusterSnapshotIdentifier(String dBClusterSnapshotIdentifier) {
        setDBClusterSnapshotIdentifier(dBClusterSnapshotIdentifier);
        return this;
    }

    /**
     * <p>
     * The type of DB cluster snapshots to be returned. You can specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>automated</code> - Return all DB cluster snapshots that have been automatically taken by Amazon RDS for my
     * AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manual</code> - Return all DB cluster snapshots that have been taken by my AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>shared</code> - Return all manual DB cluster snapshots that have been shared to my AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>public</code> - Return all DB cluster snapshots that have been marked as public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a <code>SnapshotType</code> value, then both automated and manual DB cluster snapshots are
     * returned. You can include shared DB cluster snapshots with these results by setting the
     * <code>IncludeShared</code> parameter to <code>true</code>. You can include public DB cluster snapshots with these
     * results by setting the <code>IncludePublic</code> parameter to <code>true</code>.
     * </p>
     * <p>
     * The <code>IncludeShared</code> and <code>IncludePublic</code> parameters don't apply for
     * <code>SnapshotType</code> values of <code>manual</code> or <code>automated</code>. The <code>IncludePublic</code>
     * parameter doesn't apply when <code>SnapshotType</code> is set to <code>shared</code>. The
     * <code>IncludeShared</code> parameter doesn't apply when <code>SnapshotType</code> is set to <code>public</code>.
     * </p>
     * 
     * @param snapshotType
     *        The type of DB cluster snapshots to be returned. You can specify one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>automated</code> - Return all DB cluster snapshots that have been automatically taken by Amazon RDS
     *        for my AWS account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>manual</code> - Return all DB cluster snapshots that have been taken by my AWS account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>shared</code> - Return all manual DB cluster snapshots that have been shared to my AWS account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>public</code> - Return all DB cluster snapshots that have been marked as public.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify a <code>SnapshotType</code> value, then both automated and manual DB cluster
     *        snapshots are returned. You can include shared DB cluster snapshots with these results by setting the
     *        <code>IncludeShared</code> parameter to <code>true</code>. You can include public DB cluster snapshots
     *        with these results by setting the <code>IncludePublic</code> parameter to <code>true</code>.
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
     * The type of DB cluster snapshots to be returned. You can specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>automated</code> - Return all DB cluster snapshots that have been automatically taken by Amazon RDS for my
     * AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manual</code> - Return all DB cluster snapshots that have been taken by my AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>shared</code> - Return all manual DB cluster snapshots that have been shared to my AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>public</code> - Return all DB cluster snapshots that have been marked as public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a <code>SnapshotType</code> value, then both automated and manual DB cluster snapshots are
     * returned. You can include shared DB cluster snapshots with these results by setting the
     * <code>IncludeShared</code> parameter to <code>true</code>. You can include public DB cluster snapshots with these
     * results by setting the <code>IncludePublic</code> parameter to <code>true</code>.
     * </p>
     * <p>
     * The <code>IncludeShared</code> and <code>IncludePublic</code> parameters don't apply for
     * <code>SnapshotType</code> values of <code>manual</code> or <code>automated</code>. The <code>IncludePublic</code>
     * parameter doesn't apply when <code>SnapshotType</code> is set to <code>shared</code>. The
     * <code>IncludeShared</code> parameter doesn't apply when <code>SnapshotType</code> is set to <code>public</code>.
     * </p>
     * 
     * @return The type of DB cluster snapshots to be returned. You can specify one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>automated</code> - Return all DB cluster snapshots that have been automatically taken by Amazon RDS
     *         for my AWS account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>manual</code> - Return all DB cluster snapshots that have been taken by my AWS account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>shared</code> - Return all manual DB cluster snapshots that have been shared to my AWS account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>public</code> - Return all DB cluster snapshots that have been marked as public.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you don't specify a <code>SnapshotType</code> value, then both automated and manual DB cluster
     *         snapshots are returned. You can include shared DB cluster snapshots with these results by setting the
     *         <code>IncludeShared</code> parameter to <code>true</code>. You can include public DB cluster snapshots
     *         with these results by setting the <code>IncludePublic</code> parameter to <code>true</code>.
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
     * The type of DB cluster snapshots to be returned. You can specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>automated</code> - Return all DB cluster snapshots that have been automatically taken by Amazon RDS for my
     * AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manual</code> - Return all DB cluster snapshots that have been taken by my AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>shared</code> - Return all manual DB cluster snapshots that have been shared to my AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>public</code> - Return all DB cluster snapshots that have been marked as public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a <code>SnapshotType</code> value, then both automated and manual DB cluster snapshots are
     * returned. You can include shared DB cluster snapshots with these results by setting the
     * <code>IncludeShared</code> parameter to <code>true</code>. You can include public DB cluster snapshots with these
     * results by setting the <code>IncludePublic</code> parameter to <code>true</code>.
     * </p>
     * <p>
     * The <code>IncludeShared</code> and <code>IncludePublic</code> parameters don't apply for
     * <code>SnapshotType</code> values of <code>manual</code> or <code>automated</code>. The <code>IncludePublic</code>
     * parameter doesn't apply when <code>SnapshotType</code> is set to <code>shared</code>. The
     * <code>IncludeShared</code> parameter doesn't apply when <code>SnapshotType</code> is set to <code>public</code>.
     * </p>
     * 
     * @param snapshotType
     *        The type of DB cluster snapshots to be returned. You can specify one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>automated</code> - Return all DB cluster snapshots that have been automatically taken by Amazon RDS
     *        for my AWS account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>manual</code> - Return all DB cluster snapshots that have been taken by my AWS account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>shared</code> - Return all manual DB cluster snapshots that have been shared to my AWS account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>public</code> - Return all DB cluster snapshots that have been marked as public.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify a <code>SnapshotType</code> value, then both automated and manual DB cluster
     *        snapshots are returned. You can include shared DB cluster snapshots with these results by setting the
     *        <code>IncludeShared</code> parameter to <code>true</code>. You can include public DB cluster snapshots
     *        with these results by setting the <code>IncludePublic</code> parameter to <code>true</code>.
     *        </p>
     *        <p>
     *        The <code>IncludeShared</code> and <code>IncludePublic</code> parameters don't apply for
     *        <code>SnapshotType</code> values of <code>manual</code> or <code>automated</code>. The
     *        <code>IncludePublic</code> parameter doesn't apply when <code>SnapshotType</code> is set to
     *        <code>shared</code>. The <code>IncludeShared</code> parameter doesn't apply when <code>SnapshotType</code>
     *        is set to <code>public</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClusterSnapshotsRequest withSnapshotType(String snapshotType) {
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

    public DescribeDBClusterSnapshotsRequest withFilters(Filter... filters) {
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

    public DescribeDBClusterSnapshotsRequest withFilters(java.util.Collection<Filter> filters) {
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

    public DescribeDBClusterSnapshotsRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeDBClusterSnapshots</code> request. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <code>DescribeDBClusterSnapshots</code> request. If
     *        this parameter is specified, the response includes only records beyond the marker, up to the value
     *        specified by <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeDBClusterSnapshots</code> request. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous <code>DescribeDBClusterSnapshots</code> request. If
     *         this parameter is specified, the response includes only records beyond the marker, up to the value
     *         specified by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeDBClusterSnapshots</code> request. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <code>DescribeDBClusterSnapshots</code> request. If
     *        this parameter is specified, the response includes only records beyond the marker, up to the value
     *        specified by <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClusterSnapshotsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * True to include shared manual DB cluster snapshots from other AWS accounts that this AWS account has been given
     * permission to copy or restore, and otherwise false. The default is <code>false</code>.
     * </p>
     * <p>
     * You can give an AWS account permission to restore a manual DB cluster snapshot from another AWS account by the
     * <a>ModifyDBClusterSnapshotAttribute</a> API action.
     * </p>
     * 
     * @param includeShared
     *        True to include shared manual DB cluster snapshots from other AWS accounts that this AWS account has been
     *        given permission to copy or restore, and otherwise false. The default is <code>false</code>.</p>
     *        <p>
     *        You can give an AWS account permission to restore a manual DB cluster snapshot from another AWS account by
     *        the <a>ModifyDBClusterSnapshotAttribute</a> API action.
     */

    public void setIncludeShared(Boolean includeShared) {
        this.includeShared = includeShared;
    }

    /**
     * <p>
     * True to include shared manual DB cluster snapshots from other AWS accounts that this AWS account has been given
     * permission to copy or restore, and otherwise false. The default is <code>false</code>.
     * </p>
     * <p>
     * You can give an AWS account permission to restore a manual DB cluster snapshot from another AWS account by the
     * <a>ModifyDBClusterSnapshotAttribute</a> API action.
     * </p>
     * 
     * @return True to include shared manual DB cluster snapshots from other AWS accounts that this AWS account has been
     *         given permission to copy or restore, and otherwise false. The default is <code>false</code>.</p>
     *         <p>
     *         You can give an AWS account permission to restore a manual DB cluster snapshot from another AWS account
     *         by the <a>ModifyDBClusterSnapshotAttribute</a> API action.
     */

    public Boolean getIncludeShared() {
        return this.includeShared;
    }

    /**
     * <p>
     * True to include shared manual DB cluster snapshots from other AWS accounts that this AWS account has been given
     * permission to copy or restore, and otherwise false. The default is <code>false</code>.
     * </p>
     * <p>
     * You can give an AWS account permission to restore a manual DB cluster snapshot from another AWS account by the
     * <a>ModifyDBClusterSnapshotAttribute</a> API action.
     * </p>
     * 
     * @param includeShared
     *        True to include shared manual DB cluster snapshots from other AWS accounts that this AWS account has been
     *        given permission to copy or restore, and otherwise false. The default is <code>false</code>.</p>
     *        <p>
     *        You can give an AWS account permission to restore a manual DB cluster snapshot from another AWS account by
     *        the <a>ModifyDBClusterSnapshotAttribute</a> API action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClusterSnapshotsRequest withIncludeShared(Boolean includeShared) {
        setIncludeShared(includeShared);
        return this;
    }

    /**
     * <p>
     * True to include shared manual DB cluster snapshots from other AWS accounts that this AWS account has been given
     * permission to copy or restore, and otherwise false. The default is <code>false</code>.
     * </p>
     * <p>
     * You can give an AWS account permission to restore a manual DB cluster snapshot from another AWS account by the
     * <a>ModifyDBClusterSnapshotAttribute</a> API action.
     * </p>
     * 
     * @return True to include shared manual DB cluster snapshots from other AWS accounts that this AWS account has been
     *         given permission to copy or restore, and otherwise false. The default is <code>false</code>.</p>
     *         <p>
     *         You can give an AWS account permission to restore a manual DB cluster snapshot from another AWS account
     *         by the <a>ModifyDBClusterSnapshotAttribute</a> API action.
     */

    public Boolean isIncludeShared() {
        return this.includeShared;
    }

    /**
     * <p>
     * True to include manual DB cluster snapshots that are public and can be copied or restored by any AWS account, and
     * otherwise false. The default is <code>false</code>. The default is false.
     * </p>
     * <p>
     * You can share a manual DB cluster snapshot as public by using the <a>ModifyDBClusterSnapshotAttribute</a> API
     * action.
     * </p>
     * 
     * @param includePublic
     *        True to include manual DB cluster snapshots that are public and can be copied or restored by any AWS
     *        account, and otherwise false. The default is <code>false</code>. The default is false.</p>
     *        <p>
     *        You can share a manual DB cluster snapshot as public by using the <a>ModifyDBClusterSnapshotAttribute</a>
     *        API action.
     */

    public void setIncludePublic(Boolean includePublic) {
        this.includePublic = includePublic;
    }

    /**
     * <p>
     * True to include manual DB cluster snapshots that are public and can be copied or restored by any AWS account, and
     * otherwise false. The default is <code>false</code>. The default is false.
     * </p>
     * <p>
     * You can share a manual DB cluster snapshot as public by using the <a>ModifyDBClusterSnapshotAttribute</a> API
     * action.
     * </p>
     * 
     * @return True to include manual DB cluster snapshots that are public and can be copied or restored by any AWS
     *         account, and otherwise false. The default is <code>false</code>. The default is false.</p>
     *         <p>
     *         You can share a manual DB cluster snapshot as public by using the <a>ModifyDBClusterSnapshotAttribute</a>
     *         API action.
     */

    public Boolean getIncludePublic() {
        return this.includePublic;
    }

    /**
     * <p>
     * True to include manual DB cluster snapshots that are public and can be copied or restored by any AWS account, and
     * otherwise false. The default is <code>false</code>. The default is false.
     * </p>
     * <p>
     * You can share a manual DB cluster snapshot as public by using the <a>ModifyDBClusterSnapshotAttribute</a> API
     * action.
     * </p>
     * 
     * @param includePublic
     *        True to include manual DB cluster snapshots that are public and can be copied or restored by any AWS
     *        account, and otherwise false. The default is <code>false</code>. The default is false.</p>
     *        <p>
     *        You can share a manual DB cluster snapshot as public by using the <a>ModifyDBClusterSnapshotAttribute</a>
     *        API action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClusterSnapshotsRequest withIncludePublic(Boolean includePublic) {
        setIncludePublic(includePublic);
        return this;
    }

    /**
     * <p>
     * True to include manual DB cluster snapshots that are public and can be copied or restored by any AWS account, and
     * otherwise false. The default is <code>false</code>. The default is false.
     * </p>
     * <p>
     * You can share a manual DB cluster snapshot as public by using the <a>ModifyDBClusterSnapshotAttribute</a> API
     * action.
     * </p>
     * 
     * @return True to include manual DB cluster snapshots that are public and can be copied or restored by any AWS
     *         account, and otherwise false. The default is <code>false</code>. The default is false.</p>
     *         <p>
     *         You can share a manual DB cluster snapshot as public by using the <a>ModifyDBClusterSnapshotAttribute</a>
     *         API action.
     */

    public Boolean isIncludePublic() {
        return this.includePublic;
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
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: ").append(getDBClusterIdentifier()).append(",");
        if (getDBClusterSnapshotIdentifier() != null)
            sb.append("DBClusterSnapshotIdentifier: ").append(getDBClusterSnapshotIdentifier()).append(",");
        if (getSnapshotType() != null)
            sb.append("SnapshotType: ").append(getSnapshotType()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getIncludeShared() != null)
            sb.append("IncludeShared: ").append(getIncludeShared()).append(",");
        if (getIncludePublic() != null)
            sb.append("IncludePublic: ").append(getIncludePublic());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBClusterSnapshotsRequest == false)
            return false;
        DescribeDBClusterSnapshotsRequest other = (DescribeDBClusterSnapshotsRequest) obj;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getDBClusterSnapshotIdentifier() == null ^ this.getDBClusterSnapshotIdentifier() == null)
            return false;
        if (other.getDBClusterSnapshotIdentifier() != null && other.getDBClusterSnapshotIdentifier().equals(this.getDBClusterSnapshotIdentifier()) == false)
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

        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDBClusterSnapshotIdentifier() == null) ? 0 : getDBClusterSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSnapshotType() == null) ? 0 : getSnapshotType().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getIncludeShared() == null) ? 0 : getIncludeShared().hashCode());
        hashCode = prime * hashCode + ((getIncludePublic() == null) ? 0 : getIncludePublic().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDBClusterSnapshotsRequest clone() {
        return (DescribeDBClusterSnapshotsRequest) super.clone();
    }

}
