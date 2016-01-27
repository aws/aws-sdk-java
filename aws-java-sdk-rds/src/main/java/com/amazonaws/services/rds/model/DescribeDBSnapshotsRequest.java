/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.rds.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#describeDBSnapshots(DescribeDBSnapshotsRequest) DescribeDBSnapshots operation}.
 * <p>
 * Returns information about DB snapshots. This API supports pagination.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#describeDBSnapshots(DescribeDBSnapshotsRequest)
 */
public class DescribeDBSnapshotsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * A DB instance identifier to retrieve the list of DB snapshots for.
     * This parameter cannot be used in conjunction with
     * <code>DBSnapshotIdentifier</code>. This parameter is not
     * case-sensitive. <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul>
     */
    private String dBInstanceIdentifier;

    /**
     * A specific DB snapshot identifier to describe. This parameter cannot
     * be used in conjunction with <code>DBInstanceIdentifier</code>. This
     * value is stored as a lowercase string. <p>Constraints: <ul> <li>Must
     * be 1 to 255 alphanumeric characters.</li> <li>First character must be
     * a letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens.</li> <li>If this is the identifier of an automated snapshot,
     * the <code>SnapshotType</code> parameter must also be specified.</li>
     * </ul>
     */
    private String dBSnapshotIdentifier;

    /**
     * The type of snapshots that will be returned. You can specify one of
     * the following values: <ul> <li><code>automated</code> - Return all DB
     * snapshots that have been automatically taken by Amazon RDS for my AWS
     * account.</li> <li><code>manual</code> - Return all DB snapshots that
     * have been taken by my AWS account.</li> <li><code>shared</code> -
     * Return all manual DB snapshots that have been shared to my AWS
     * account.</li> <li><code>public</code> - Return all DB snapshots that
     * have been marked as public.</li> </ul> <p>If you do not specify a
     * <code>SnapshotType</code>, then both automated and manual snapshots
     * are returned. You can include shared snapshots with these results by
     * setting the <code>IncludeShared</code> parameter to <code>true</code>.
     * You can include public snapshots with these results by setting the
     * <code>IncludePublic</code> parameter to <code>true</code>. <p>The
     * <code>IncludeShared</code> and <code>IncludePublic</code> parameters
     * do not apply for <code>SnapshotType</code> values of
     * <code>manual</code> or <code>automated</code>. The
     * <code>IncludePublic</code> parameter does not apply when
     * <code>SnapshotType</code> is set to <code>shared</code>. the
     * <code>IncludeShared</code> parameter does not apply when
     * <code>SnapshotType</code> is set to <code>public</code>.
     */
    private String snapshotType;

    /**
     * This parameter is not currently supported.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * pagination token called a marker is included in the response so that
     * the remaining results can be retrieved. <p>Default: 100
     * <p>Constraints: Minimum 20, maximum 100.
     */
    private Integer maxRecords;

    /**
     * An optional pagination token provided by a previous
     * <code>DescribeDBSnapshots</code> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     */
    private String marker;

    /**
     * True to include shared manual DB snapshots from other AWS accounts
     * that this AWS account has been given permission to copy or restore;
     * otherwise false. The default is false. <p>An AWS account is given
     * permission to restore a manual DB snapshot from another AWS account by
     * the <a>ModifyDBSnapshotAttribute</a> API.
     */
    private Boolean includeShared;

    /**
     * True to include manual DB snapshots that are public and can be copied
     * or restored by any AWS account; otherwise false. The default is false.
     * <p>An manual DB snapshot is shared as public by the
     * <a>ModifyDBSnapshotAttribute</a> API.
     */
    private Boolean includePublic;

    /**
     * Default constructor for a new DescribeDBSnapshotsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DescribeDBSnapshotsRequest() {}
    
    /**
     * A DB instance identifier to retrieve the list of DB snapshots for.
     * This parameter cannot be used in conjunction with
     * <code>DBSnapshotIdentifier</code>. This parameter is not
     * case-sensitive. <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul>
     *
     * @return A DB instance identifier to retrieve the list of DB snapshots for.
     *         This parameter cannot be used in conjunction with
     *         <code>DBSnapshotIdentifier</code>. This parameter is not
     *         case-sensitive. <p>Constraints: <ul> <li>Must contain from 1 to 63
     *         alphanumeric characters or hyphens</li> <li>First character must be a
     *         letter</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens</li> </ul>
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }
    
    /**
     * A DB instance identifier to retrieve the list of DB snapshots for.
     * This parameter cannot be used in conjunction with
     * <code>DBSnapshotIdentifier</code>. This parameter is not
     * case-sensitive. <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul>
     *
     * @param dBInstanceIdentifier A DB instance identifier to retrieve the list of DB snapshots for.
     *         This parameter cannot be used in conjunction with
     *         <code>DBSnapshotIdentifier</code>. This parameter is not
     *         case-sensitive. <p>Constraints: <ul> <li>Must contain from 1 to 63
     *         alphanumeric characters or hyphens</li> <li>First character must be a
     *         letter</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens</li> </ul>
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }
    
    /**
     * A DB instance identifier to retrieve the list of DB snapshots for.
     * This parameter cannot be used in conjunction with
     * <code>DBSnapshotIdentifier</code>. This parameter is not
     * case-sensitive. <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceIdentifier A DB instance identifier to retrieve the list of DB snapshots for.
     *         This parameter cannot be used in conjunction with
     *         <code>DBSnapshotIdentifier</code>. This parameter is not
     *         case-sensitive. <p>Constraints: <ul> <li>Must contain from 1 to 63
     *         alphanumeric characters or hyphens</li> <li>First character must be a
     *         letter</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDBSnapshotsRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }

    /**
     * A specific DB snapshot identifier to describe. This parameter cannot
     * be used in conjunction with <code>DBInstanceIdentifier</code>. This
     * value is stored as a lowercase string. <p>Constraints: <ul> <li>Must
     * be 1 to 255 alphanumeric characters.</li> <li>First character must be
     * a letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens.</li> <li>If this is the identifier of an automated snapshot,
     * the <code>SnapshotType</code> parameter must also be specified.</li>
     * </ul>
     *
     * @return A specific DB snapshot identifier to describe. This parameter cannot
     *         be used in conjunction with <code>DBInstanceIdentifier</code>. This
     *         value is stored as a lowercase string. <p>Constraints: <ul> <li>Must
     *         be 1 to 255 alphanumeric characters.</li> <li>First character must be
     *         a letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens.</li> <li>If this is the identifier of an automated snapshot,
     *         the <code>SnapshotType</code> parameter must also be specified.</li>
     *         </ul>
     */
    public String getDBSnapshotIdentifier() {
        return dBSnapshotIdentifier;
    }
    
    /**
     * A specific DB snapshot identifier to describe. This parameter cannot
     * be used in conjunction with <code>DBInstanceIdentifier</code>. This
     * value is stored as a lowercase string. <p>Constraints: <ul> <li>Must
     * be 1 to 255 alphanumeric characters.</li> <li>First character must be
     * a letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens.</li> <li>If this is the identifier of an automated snapshot,
     * the <code>SnapshotType</code> parameter must also be specified.</li>
     * </ul>
     *
     * @param dBSnapshotIdentifier A specific DB snapshot identifier to describe. This parameter cannot
     *         be used in conjunction with <code>DBInstanceIdentifier</code>. This
     *         value is stored as a lowercase string. <p>Constraints: <ul> <li>Must
     *         be 1 to 255 alphanumeric characters.</li> <li>First character must be
     *         a letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens.</li> <li>If this is the identifier of an automated snapshot,
     *         the <code>SnapshotType</code> parameter must also be specified.</li>
     *         </ul>
     */
    public void setDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
    }
    
    /**
     * A specific DB snapshot identifier to describe. This parameter cannot
     * be used in conjunction with <code>DBInstanceIdentifier</code>. This
     * value is stored as a lowercase string. <p>Constraints: <ul> <li>Must
     * be 1 to 255 alphanumeric characters.</li> <li>First character must be
     * a letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens.</li> <li>If this is the identifier of an automated snapshot,
     * the <code>SnapshotType</code> parameter must also be specified.</li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSnapshotIdentifier A specific DB snapshot identifier to describe. This parameter cannot
     *         be used in conjunction with <code>DBInstanceIdentifier</code>. This
     *         value is stored as a lowercase string. <p>Constraints: <ul> <li>Must
     *         be 1 to 255 alphanumeric characters.</li> <li>First character must be
     *         a letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens.</li> <li>If this is the identifier of an automated snapshot,
     *         the <code>SnapshotType</code> parameter must also be specified.</li>
     *         </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDBSnapshotsRequest withDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
        return this;
    }

    /**
     * The type of snapshots that will be returned. You can specify one of
     * the following values: <ul> <li><code>automated</code> - Return all DB
     * snapshots that have been automatically taken by Amazon RDS for my AWS
     * account.</li> <li><code>manual</code> - Return all DB snapshots that
     * have been taken by my AWS account.</li> <li><code>shared</code> -
     * Return all manual DB snapshots that have been shared to my AWS
     * account.</li> <li><code>public</code> - Return all DB snapshots that
     * have been marked as public.</li> </ul> <p>If you do not specify a
     * <code>SnapshotType</code>, then both automated and manual snapshots
     * are returned. You can include shared snapshots with these results by
     * setting the <code>IncludeShared</code> parameter to <code>true</code>.
     * You can include public snapshots with these results by setting the
     * <code>IncludePublic</code> parameter to <code>true</code>. <p>The
     * <code>IncludeShared</code> and <code>IncludePublic</code> parameters
     * do not apply for <code>SnapshotType</code> values of
     * <code>manual</code> or <code>automated</code>. The
     * <code>IncludePublic</code> parameter does not apply when
     * <code>SnapshotType</code> is set to <code>shared</code>. the
     * <code>IncludeShared</code> parameter does not apply when
     * <code>SnapshotType</code> is set to <code>public</code>.
     *
     * @return The type of snapshots that will be returned. You can specify one of
     *         the following values: <ul> <li><code>automated</code> - Return all DB
     *         snapshots that have been automatically taken by Amazon RDS for my AWS
     *         account.</li> <li><code>manual</code> - Return all DB snapshots that
     *         have been taken by my AWS account.</li> <li><code>shared</code> -
     *         Return all manual DB snapshots that have been shared to my AWS
     *         account.</li> <li><code>public</code> - Return all DB snapshots that
     *         have been marked as public.</li> </ul> <p>If you do not specify a
     *         <code>SnapshotType</code>, then both automated and manual snapshots
     *         are returned. You can include shared snapshots with these results by
     *         setting the <code>IncludeShared</code> parameter to <code>true</code>.
     *         You can include public snapshots with these results by setting the
     *         <code>IncludePublic</code> parameter to <code>true</code>. <p>The
     *         <code>IncludeShared</code> and <code>IncludePublic</code> parameters
     *         do not apply for <code>SnapshotType</code> values of
     *         <code>manual</code> or <code>automated</code>. The
     *         <code>IncludePublic</code> parameter does not apply when
     *         <code>SnapshotType</code> is set to <code>shared</code>. the
     *         <code>IncludeShared</code> parameter does not apply when
     *         <code>SnapshotType</code> is set to <code>public</code>.
     */
    public String getSnapshotType() {
        return snapshotType;
    }
    
    /**
     * The type of snapshots that will be returned. You can specify one of
     * the following values: <ul> <li><code>automated</code> - Return all DB
     * snapshots that have been automatically taken by Amazon RDS for my AWS
     * account.</li> <li><code>manual</code> - Return all DB snapshots that
     * have been taken by my AWS account.</li> <li><code>shared</code> -
     * Return all manual DB snapshots that have been shared to my AWS
     * account.</li> <li><code>public</code> - Return all DB snapshots that
     * have been marked as public.</li> </ul> <p>If you do not specify a
     * <code>SnapshotType</code>, then both automated and manual snapshots
     * are returned. You can include shared snapshots with these results by
     * setting the <code>IncludeShared</code> parameter to <code>true</code>.
     * You can include public snapshots with these results by setting the
     * <code>IncludePublic</code> parameter to <code>true</code>. <p>The
     * <code>IncludeShared</code> and <code>IncludePublic</code> parameters
     * do not apply for <code>SnapshotType</code> values of
     * <code>manual</code> or <code>automated</code>. The
     * <code>IncludePublic</code> parameter does not apply when
     * <code>SnapshotType</code> is set to <code>shared</code>. the
     * <code>IncludeShared</code> parameter does not apply when
     * <code>SnapshotType</code> is set to <code>public</code>.
     *
     * @param snapshotType The type of snapshots that will be returned. You can specify one of
     *         the following values: <ul> <li><code>automated</code> - Return all DB
     *         snapshots that have been automatically taken by Amazon RDS for my AWS
     *         account.</li> <li><code>manual</code> - Return all DB snapshots that
     *         have been taken by my AWS account.</li> <li><code>shared</code> -
     *         Return all manual DB snapshots that have been shared to my AWS
     *         account.</li> <li><code>public</code> - Return all DB snapshots that
     *         have been marked as public.</li> </ul> <p>If you do not specify a
     *         <code>SnapshotType</code>, then both automated and manual snapshots
     *         are returned. You can include shared snapshots with these results by
     *         setting the <code>IncludeShared</code> parameter to <code>true</code>.
     *         You can include public snapshots with these results by setting the
     *         <code>IncludePublic</code> parameter to <code>true</code>. <p>The
     *         <code>IncludeShared</code> and <code>IncludePublic</code> parameters
     *         do not apply for <code>SnapshotType</code> values of
     *         <code>manual</code> or <code>automated</code>. The
     *         <code>IncludePublic</code> parameter does not apply when
     *         <code>SnapshotType</code> is set to <code>shared</code>. the
     *         <code>IncludeShared</code> parameter does not apply when
     *         <code>SnapshotType</code> is set to <code>public</code>.
     */
    public void setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
    }
    
    /**
     * The type of snapshots that will be returned. You can specify one of
     * the following values: <ul> <li><code>automated</code> - Return all DB
     * snapshots that have been automatically taken by Amazon RDS for my AWS
     * account.</li> <li><code>manual</code> - Return all DB snapshots that
     * have been taken by my AWS account.</li> <li><code>shared</code> -
     * Return all manual DB snapshots that have been shared to my AWS
     * account.</li> <li><code>public</code> - Return all DB snapshots that
     * have been marked as public.</li> </ul> <p>If you do not specify a
     * <code>SnapshotType</code>, then both automated and manual snapshots
     * are returned. You can include shared snapshots with these results by
     * setting the <code>IncludeShared</code> parameter to <code>true</code>.
     * You can include public snapshots with these results by setting the
     * <code>IncludePublic</code> parameter to <code>true</code>. <p>The
     * <code>IncludeShared</code> and <code>IncludePublic</code> parameters
     * do not apply for <code>SnapshotType</code> values of
     * <code>manual</code> or <code>automated</code>. The
     * <code>IncludePublic</code> parameter does not apply when
     * <code>SnapshotType</code> is set to <code>shared</code>. the
     * <code>IncludeShared</code> parameter does not apply when
     * <code>SnapshotType</code> is set to <code>public</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotType The type of snapshots that will be returned. You can specify one of
     *         the following values: <ul> <li><code>automated</code> - Return all DB
     *         snapshots that have been automatically taken by Amazon RDS for my AWS
     *         account.</li> <li><code>manual</code> - Return all DB snapshots that
     *         have been taken by my AWS account.</li> <li><code>shared</code> -
     *         Return all manual DB snapshots that have been shared to my AWS
     *         account.</li> <li><code>public</code> - Return all DB snapshots that
     *         have been marked as public.</li> </ul> <p>If you do not specify a
     *         <code>SnapshotType</code>, then both automated and manual snapshots
     *         are returned. You can include shared snapshots with these results by
     *         setting the <code>IncludeShared</code> parameter to <code>true</code>.
     *         You can include public snapshots with these results by setting the
     *         <code>IncludePublic</code> parameter to <code>true</code>. <p>The
     *         <code>IncludeShared</code> and <code>IncludePublic</code> parameters
     *         do not apply for <code>SnapshotType</code> values of
     *         <code>manual</code> or <code>automated</code>. The
     *         <code>IncludePublic</code> parameter does not apply when
     *         <code>SnapshotType</code> is set to <code>shared</code>. the
     *         <code>IncludeShared</code> parameter does not apply when
     *         <code>SnapshotType</code> is set to <code>public</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDBSnapshotsRequest withSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
        return this;
    }

    /**
     * This parameter is not currently supported.
     *
     * @return This parameter is not currently supported.
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * This parameter is not currently supported.
     *
     * @param filters This parameter is not currently supported.
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
        filtersCopy.addAll(filters);
        this.filters = filtersCopy;
    }
    
    /**
     * This parameter is not currently supported.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setFilters(java.util.Collection)} or {@link
     * #withFilters(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters This parameter is not currently supported.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDBSnapshotsRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * This parameter is not currently supported.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters This parameter is not currently supported.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDBSnapshotsRequest withFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
            filtersCopy.addAll(filters);
            this.filters = filtersCopy;
        }

        return this;
    }

    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * pagination token called a marker is included in the response so that
     * the remaining results can be retrieved. <p>Default: 100
     * <p>Constraints: Minimum 20, maximum 100.
     *
     * @return The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         pagination token called a marker is included in the response so that
     *         the remaining results can be retrieved. <p>Default: 100
     *         <p>Constraints: Minimum 20, maximum 100.
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * pagination token called a marker is included in the response so that
     * the remaining results can be retrieved. <p>Default: 100
     * <p>Constraints: Minimum 20, maximum 100.
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         pagination token called a marker is included in the response so that
     *         the remaining results can be retrieved. <p>Default: 100
     *         <p>Constraints: Minimum 20, maximum 100.
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * pagination token called a marker is included in the response so that
     * the remaining results can be retrieved. <p>Default: 100
     * <p>Constraints: Minimum 20, maximum 100.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         pagination token called a marker is included in the response so that
     *         the remaining results can be retrieved. <p>Default: 100
     *         <p>Constraints: Minimum 20, maximum 100.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDBSnapshotsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * An optional pagination token provided by a previous
     * <code>DescribeDBSnapshots</code> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     *
     * @return An optional pagination token provided by a previous
     *         <code>DescribeDBSnapshots</code> request. If this parameter is
     *         specified, the response includes only records beyond the marker, up to
     *         the value specified by <code>MaxRecords</code>.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional pagination token provided by a previous
     * <code>DescribeDBSnapshots</code> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     *
     * @param marker An optional pagination token provided by a previous
     *         <code>DescribeDBSnapshots</code> request. If this parameter is
     *         specified, the response includes only records beyond the marker, up to
     *         the value specified by <code>MaxRecords</code>.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional pagination token provided by a previous
     * <code>DescribeDBSnapshots</code> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional pagination token provided by a previous
     *         <code>DescribeDBSnapshots</code> request. If this parameter is
     *         specified, the response includes only records beyond the marker, up to
     *         the value specified by <code>MaxRecords</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDBSnapshotsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * True to include shared manual DB snapshots from other AWS accounts
     * that this AWS account has been given permission to copy or restore;
     * otherwise false. The default is false. <p>An AWS account is given
     * permission to restore a manual DB snapshot from another AWS account by
     * the <a>ModifyDBSnapshotAttribute</a> API.
     *
     * @return True to include shared manual DB snapshots from other AWS accounts
     *         that this AWS account has been given permission to copy or restore;
     *         otherwise false. The default is false. <p>An AWS account is given
     *         permission to restore a manual DB snapshot from another AWS account by
     *         the <a>ModifyDBSnapshotAttribute</a> API.
     */
    public Boolean isIncludeShared() {
        return includeShared;
    }
    
    /**
     * True to include shared manual DB snapshots from other AWS accounts
     * that this AWS account has been given permission to copy or restore;
     * otherwise false. The default is false. <p>An AWS account is given
     * permission to restore a manual DB snapshot from another AWS account by
     * the <a>ModifyDBSnapshotAttribute</a> API.
     *
     * @param includeShared True to include shared manual DB snapshots from other AWS accounts
     *         that this AWS account has been given permission to copy or restore;
     *         otherwise false. The default is false. <p>An AWS account is given
     *         permission to restore a manual DB snapshot from another AWS account by
     *         the <a>ModifyDBSnapshotAttribute</a> API.
     */
    public void setIncludeShared(Boolean includeShared) {
        this.includeShared = includeShared;
    }
    
    /**
     * True to include shared manual DB snapshots from other AWS accounts
     * that this AWS account has been given permission to copy or restore;
     * otherwise false. The default is false. <p>An AWS account is given
     * permission to restore a manual DB snapshot from another AWS account by
     * the <a>ModifyDBSnapshotAttribute</a> API.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param includeShared True to include shared manual DB snapshots from other AWS accounts
     *         that this AWS account has been given permission to copy or restore;
     *         otherwise false. The default is false. <p>An AWS account is given
     *         permission to restore a manual DB snapshot from another AWS account by
     *         the <a>ModifyDBSnapshotAttribute</a> API.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDBSnapshotsRequest withIncludeShared(Boolean includeShared) {
        this.includeShared = includeShared;
        return this;
    }

    /**
     * True to include shared manual DB snapshots from other AWS accounts
     * that this AWS account has been given permission to copy or restore;
     * otherwise false. The default is false. <p>An AWS account is given
     * permission to restore a manual DB snapshot from another AWS account by
     * the <a>ModifyDBSnapshotAttribute</a> API.
     *
     * @return True to include shared manual DB snapshots from other AWS accounts
     *         that this AWS account has been given permission to copy or restore;
     *         otherwise false. The default is false. <p>An AWS account is given
     *         permission to restore a manual DB snapshot from another AWS account by
     *         the <a>ModifyDBSnapshotAttribute</a> API.
     */
    public Boolean getIncludeShared() {
        return includeShared;
    }

    /**
     * True to include manual DB snapshots that are public and can be copied
     * or restored by any AWS account; otherwise false. The default is false.
     * <p>An manual DB snapshot is shared as public by the
     * <a>ModifyDBSnapshotAttribute</a> API.
     *
     * @return True to include manual DB snapshots that are public and can be copied
     *         or restored by any AWS account; otherwise false. The default is false.
     *         <p>An manual DB snapshot is shared as public by the
     *         <a>ModifyDBSnapshotAttribute</a> API.
     */
    public Boolean isIncludePublic() {
        return includePublic;
    }
    
    /**
     * True to include manual DB snapshots that are public and can be copied
     * or restored by any AWS account; otherwise false. The default is false.
     * <p>An manual DB snapshot is shared as public by the
     * <a>ModifyDBSnapshotAttribute</a> API.
     *
     * @param includePublic True to include manual DB snapshots that are public and can be copied
     *         or restored by any AWS account; otherwise false. The default is false.
     *         <p>An manual DB snapshot is shared as public by the
     *         <a>ModifyDBSnapshotAttribute</a> API.
     */
    public void setIncludePublic(Boolean includePublic) {
        this.includePublic = includePublic;
    }
    
    /**
     * True to include manual DB snapshots that are public and can be copied
     * or restored by any AWS account; otherwise false. The default is false.
     * <p>An manual DB snapshot is shared as public by the
     * <a>ModifyDBSnapshotAttribute</a> API.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param includePublic True to include manual DB snapshots that are public and can be copied
     *         or restored by any AWS account; otherwise false. The default is false.
     *         <p>An manual DB snapshot is shared as public by the
     *         <a>ModifyDBSnapshotAttribute</a> API.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDBSnapshotsRequest withIncludePublic(Boolean includePublic) {
        this.includePublic = includePublic;
        return this;
    }

    /**
     * True to include manual DB snapshots that are public and can be copied
     * or restored by any AWS account; otherwise false. The default is false.
     * <p>An manual DB snapshot is shared as public by the
     * <a>ModifyDBSnapshotAttribute</a> API.
     *
     * @return True to include manual DB snapshots that are public and can be copied
     *         or restored by any AWS account; otherwise false. The default is false.
     *         <p>An manual DB snapshot is shared as public by the
     *         <a>ModifyDBSnapshotAttribute</a> API.
     */
    public Boolean getIncludePublic() {
        return includePublic;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDBInstanceIdentifier() != null) sb.append("DBInstanceIdentifier: " + getDBInstanceIdentifier() + ",");
        if (getDBSnapshotIdentifier() != null) sb.append("DBSnapshotIdentifier: " + getDBSnapshotIdentifier() + ",");
        if (getSnapshotType() != null) sb.append("SnapshotType: " + getSnapshotType() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() + ",");
        if (getMaxRecords() != null) sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (isIncludeShared() != null) sb.append("IncludeShared: " + isIncludeShared() + ",");
        if (isIncludePublic() != null) sb.append("IncludePublic: " + isIncludePublic() );
        sb.append("}");
        return sb.toString();
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
        hashCode = prime * hashCode + ((isIncludeShared() == null) ? 0 : isIncludeShared().hashCode()); 
        hashCode = prime * hashCode + ((isIncludePublic() == null) ? 0 : isIncludePublic().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeDBSnapshotsRequest == false) return false;
        DescribeDBSnapshotsRequest other = (DescribeDBSnapshotsRequest)obj;
        
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null) return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false) return false; 
        if (other.getDBSnapshotIdentifier() == null ^ this.getDBSnapshotIdentifier() == null) return false;
        if (other.getDBSnapshotIdentifier() != null && other.getDBSnapshotIdentifier().equals(this.getDBSnapshotIdentifier()) == false) return false; 
        if (other.getSnapshotType() == null ^ this.getSnapshotType() == null) return false;
        if (other.getSnapshotType() != null && other.getSnapshotType().equals(this.getSnapshotType()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.isIncludeShared() == null ^ this.isIncludeShared() == null) return false;
        if (other.isIncludeShared() != null && other.isIncludeShared().equals(this.isIncludeShared()) == false) return false; 
        if (other.isIncludePublic() == null ^ this.isIncludePublic() == null) return false;
        if (other.isIncludePublic() != null && other.isIncludePublic().equals(this.isIncludePublic()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeDBSnapshotsRequest clone() {
        
            return (DescribeDBSnapshotsRequest) super.clone();
    }

}
    