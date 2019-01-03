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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBClusterBacktracks" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBClusterBacktracksRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The DB cluster identifier of the DB cluster to be described. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster1</code>
     * </p>
     */
    private String dBClusterIdentifier;
    /**
     * <p>
     * If specified, this value is the backtrack identifier of the backtrack to be described.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain a valid universally unique identifier (UUID). For more information about UUIDs, see <a
     * href="http://www.ietf.org/rfc/rfc4122.txt">A Universally Unique Identifier (UUID) URN Namespace</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>123e4567-e89b-12d3-a456-426655440000</code>
     * </p>
     */
    private String backtrackIdentifier;
    /**
     * <p>
     * A filter that specifies one or more DB clusters to describe. Supported filters include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db-cluster-backtrack-id</code> - Accepts backtrack identifiers. The results list includes information about
     * only the backtracks identified by these identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db-cluster-backtrack-status</code> - Accepts any of the following backtrack status values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>applying</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>completed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The results list includes information about only the backtracks identified by these values. For more information
     * about backtrack status values, see <a>DBClusterBacktrack</a>.
     * </p>
     * </li>
     * </ul>
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
     * An optional pagination token provided by a previous <a>DescribeDBClusterBacktracks</a> request. If this parameter
     * is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The DB cluster identifier of the DB cluster to be described. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster1</code>
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The DB cluster identifier of the DB cluster to be described. This parameter is stored as a lowercase
     *        string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 alphanumeric characters or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>my-cluster1</code>
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier of the DB cluster to be described. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster1</code>
     * </p>
     * 
     * @return The DB cluster identifier of the DB cluster to be described. This parameter is stored as a lowercase
     *         string.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 1 to 63 alphanumeric characters or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>my-cluster1</code>
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier of the DB cluster to be described. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster1</code>
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The DB cluster identifier of the DB cluster to be described. This parameter is stored as a lowercase
     *        string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 alphanumeric characters or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>my-cluster1</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClusterBacktracksRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * If specified, this value is the backtrack identifier of the backtrack to be described.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain a valid universally unique identifier (UUID). For more information about UUIDs, see <a
     * href="http://www.ietf.org/rfc/rfc4122.txt">A Universally Unique Identifier (UUID) URN Namespace</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>123e4567-e89b-12d3-a456-426655440000</code>
     * </p>
     * 
     * @param backtrackIdentifier
     *        If specified, this value is the backtrack identifier of the backtrack to be described.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain a valid universally unique identifier (UUID). For more information about UUIDs, see <a
     *        href="http://www.ietf.org/rfc/rfc4122.txt">A Universally Unique Identifier (UUID) URN Namespace</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>123e4567-e89b-12d3-a456-426655440000</code>
     */

    public void setBacktrackIdentifier(String backtrackIdentifier) {
        this.backtrackIdentifier = backtrackIdentifier;
    }

    /**
     * <p>
     * If specified, this value is the backtrack identifier of the backtrack to be described.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain a valid universally unique identifier (UUID). For more information about UUIDs, see <a
     * href="http://www.ietf.org/rfc/rfc4122.txt">A Universally Unique Identifier (UUID) URN Namespace</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>123e4567-e89b-12d3-a456-426655440000</code>
     * </p>
     * 
     * @return If specified, this value is the backtrack identifier of the backtrack to be described.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain a valid universally unique identifier (UUID). For more information about UUIDs, see <a
     *         href="http://www.ietf.org/rfc/rfc4122.txt">A Universally Unique Identifier (UUID) URN Namespace</a>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>123e4567-e89b-12d3-a456-426655440000</code>
     */

    public String getBacktrackIdentifier() {
        return this.backtrackIdentifier;
    }

    /**
     * <p>
     * If specified, this value is the backtrack identifier of the backtrack to be described.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain a valid universally unique identifier (UUID). For more information about UUIDs, see <a
     * href="http://www.ietf.org/rfc/rfc4122.txt">A Universally Unique Identifier (UUID) URN Namespace</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>123e4567-e89b-12d3-a456-426655440000</code>
     * </p>
     * 
     * @param backtrackIdentifier
     *        If specified, this value is the backtrack identifier of the backtrack to be described.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain a valid universally unique identifier (UUID). For more information about UUIDs, see <a
     *        href="http://www.ietf.org/rfc/rfc4122.txt">A Universally Unique Identifier (UUID) URN Namespace</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>123e4567-e89b-12d3-a456-426655440000</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClusterBacktracksRequest withBacktrackIdentifier(String backtrackIdentifier) {
        setBacktrackIdentifier(backtrackIdentifier);
        return this;
    }

    /**
     * <p>
     * A filter that specifies one or more DB clusters to describe. Supported filters include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db-cluster-backtrack-id</code> - Accepts backtrack identifiers. The results list includes information about
     * only the backtracks identified by these identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db-cluster-backtrack-status</code> - Accepts any of the following backtrack status values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>applying</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>completed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The results list includes information about only the backtracks identified by these values. For more information
     * about backtrack status values, see <a>DBClusterBacktrack</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A filter that specifies one or more DB clusters to describe. Supported filters include the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>db-cluster-backtrack-id</code> - Accepts backtrack identifiers. The results list includes
     *         information about only the backtracks identified by these identifiers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>db-cluster-backtrack-status</code> - Accepts any of the following backtrack status values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>applying</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>completed</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>failed</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pending</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The results list includes information about only the backtracks identified by these values. For more
     *         information about backtrack status values, see <a>DBClusterBacktrack</a>.
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
     * A filter that specifies one or more DB clusters to describe. Supported filters include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db-cluster-backtrack-id</code> - Accepts backtrack identifiers. The results list includes information about
     * only the backtracks identified by these identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db-cluster-backtrack-status</code> - Accepts any of the following backtrack status values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>applying</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>completed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The results list includes information about only the backtracks identified by these values. For more information
     * about backtrack status values, see <a>DBClusterBacktrack</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        A filter that specifies one or more DB clusters to describe. Supported filters include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>db-cluster-backtrack-id</code> - Accepts backtrack identifiers. The results list includes
     *        information about only the backtracks identified by these identifiers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db-cluster-backtrack-status</code> - Accepts any of the following backtrack status values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>applying</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>completed</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failed</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The results list includes information about only the backtracks identified by these values. For more
     *        information about backtrack status values, see <a>DBClusterBacktrack</a>.
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
     * A filter that specifies one or more DB clusters to describe. Supported filters include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db-cluster-backtrack-id</code> - Accepts backtrack identifiers. The results list includes information about
     * only the backtracks identified by these identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db-cluster-backtrack-status</code> - Accepts any of the following backtrack status values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>applying</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>completed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The results list includes information about only the backtracks identified by these values. For more information
     * about backtrack status values, see <a>DBClusterBacktrack</a>.
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
     *        A filter that specifies one or more DB clusters to describe. Supported filters include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>db-cluster-backtrack-id</code> - Accepts backtrack identifiers. The results list includes
     *        information about only the backtracks identified by these identifiers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db-cluster-backtrack-status</code> - Accepts any of the following backtrack status values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>applying</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>completed</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failed</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The results list includes information about only the backtracks identified by these values. For more
     *        information about backtrack status values, see <a>DBClusterBacktrack</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClusterBacktracksRequest withFilters(Filter... filters) {
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
     * A filter that specifies one or more DB clusters to describe. Supported filters include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db-cluster-backtrack-id</code> - Accepts backtrack identifiers. The results list includes information about
     * only the backtracks identified by these identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db-cluster-backtrack-status</code> - Accepts any of the following backtrack status values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>applying</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>completed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The results list includes information about only the backtracks identified by these values. For more information
     * about backtrack status values, see <a>DBClusterBacktrack</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        A filter that specifies one or more DB clusters to describe. Supported filters include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>db-cluster-backtrack-id</code> - Accepts backtrack identifiers. The results list includes
     *        information about only the backtracks identified by these identifiers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db-cluster-backtrack-status</code> - Accepts any of the following backtrack status values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>applying</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>completed</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failed</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The results list includes information about only the backtracks identified by these values. For more
     *        information about backtrack status values, see <a>DBClusterBacktrack</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClusterBacktracksRequest withFilters(java.util.Collection<Filter> filters) {
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

    public DescribeDBClusterBacktracksRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <a>DescribeDBClusterBacktracks</a> request. If this parameter
     * is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <a>DescribeDBClusterBacktracks</a> request. If this
     *        parameter is specified, the response includes only records beyond the marker, up to the value specified by
     *        <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <a>DescribeDBClusterBacktracks</a> request. If this parameter
     * is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous <a>DescribeDBClusterBacktracks</a> request. If this
     *         parameter is specified, the response includes only records beyond the marker, up to the value specified
     *         by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <a>DescribeDBClusterBacktracks</a> request. If this parameter
     * is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <a>DescribeDBClusterBacktracks</a> request. If this
     *        parameter is specified, the response includes only records beyond the marker, up to the value specified by
     *        <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClusterBacktracksRequest withMarker(String marker) {
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
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: ").append(getDBClusterIdentifier()).append(",");
        if (getBacktrackIdentifier() != null)
            sb.append("BacktrackIdentifier: ").append(getBacktrackIdentifier()).append(",");
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

        if (obj instanceof DescribeDBClusterBacktracksRequest == false)
            return false;
        DescribeDBClusterBacktracksRequest other = (DescribeDBClusterBacktracksRequest) obj;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getBacktrackIdentifier() == null ^ this.getBacktrackIdentifier() == null)
            return false;
        if (other.getBacktrackIdentifier() != null && other.getBacktrackIdentifier().equals(this.getBacktrackIdentifier()) == false)
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

        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getBacktrackIdentifier() == null) ? 0 : getBacktrackIdentifier().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDBClusterBacktracksRequest clone() {
        return (DescribeDBClusterBacktracksRequest) super.clone();
    }

}
