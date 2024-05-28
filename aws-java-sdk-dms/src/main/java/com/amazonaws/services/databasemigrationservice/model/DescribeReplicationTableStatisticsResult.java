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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplicationTableStatistics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReplicationTableStatisticsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The Amazon Resource Name of the replication config.
     * </p>
     */
    private String replicationConfigArn;
    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Returns table statistics on the replication, including table name, rows inserted, rows updated, and rows deleted.
     * </p>
     */
    private java.util.List<TableStatistics> replicationTableStatistics;

    /**
     * <p>
     * The Amazon Resource Name of the replication config.
     * </p>
     * 
     * @param replicationConfigArn
     *        The Amazon Resource Name of the replication config.
     */

    public void setReplicationConfigArn(String replicationConfigArn) {
        this.replicationConfigArn = replicationConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the replication config.
     * </p>
     * 
     * @return The Amazon Resource Name of the replication config.
     */

    public String getReplicationConfigArn() {
        return this.replicationConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the replication config.
     * </p>
     * 
     * @param replicationConfigArn
     *        The Amazon Resource Name of the replication config.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationTableStatisticsResult withReplicationConfigArn(String replicationConfigArn) {
        setReplicationConfigArn(replicationConfigArn);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous request. If this parameter is specified, the response
     *         includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationTableStatisticsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Returns table statistics on the replication, including table name, rows inserted, rows updated, and rows deleted.
     * </p>
     * 
     * @return Returns table statistics on the replication, including table name, rows inserted, rows updated, and rows
     *         deleted.
     */

    public java.util.List<TableStatistics> getReplicationTableStatistics() {
        return replicationTableStatistics;
    }

    /**
     * <p>
     * Returns table statistics on the replication, including table name, rows inserted, rows updated, and rows deleted.
     * </p>
     * 
     * @param replicationTableStatistics
     *        Returns table statistics on the replication, including table name, rows inserted, rows updated, and rows
     *        deleted.
     */

    public void setReplicationTableStatistics(java.util.Collection<TableStatistics> replicationTableStatistics) {
        if (replicationTableStatistics == null) {
            this.replicationTableStatistics = null;
            return;
        }

        this.replicationTableStatistics = new java.util.ArrayList<TableStatistics>(replicationTableStatistics);
    }

    /**
     * <p>
     * Returns table statistics on the replication, including table name, rows inserted, rows updated, and rows deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicationTableStatistics(java.util.Collection)} or
     * {@link #withReplicationTableStatistics(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param replicationTableStatistics
     *        Returns table statistics on the replication, including table name, rows inserted, rows updated, and rows
     *        deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationTableStatisticsResult withReplicationTableStatistics(TableStatistics... replicationTableStatistics) {
        if (this.replicationTableStatistics == null) {
            setReplicationTableStatistics(new java.util.ArrayList<TableStatistics>(replicationTableStatistics.length));
        }
        for (TableStatistics ele : replicationTableStatistics) {
            this.replicationTableStatistics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns table statistics on the replication, including table name, rows inserted, rows updated, and rows deleted.
     * </p>
     * 
     * @param replicationTableStatistics
     *        Returns table statistics on the replication, including table name, rows inserted, rows updated, and rows
     *        deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationTableStatisticsResult withReplicationTableStatistics(java.util.Collection<TableStatistics> replicationTableStatistics) {
        setReplicationTableStatistics(replicationTableStatistics);
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
        if (getReplicationConfigArn() != null)
            sb.append("ReplicationConfigArn: ").append(getReplicationConfigArn()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getReplicationTableStatistics() != null)
            sb.append("ReplicationTableStatistics: ").append(getReplicationTableStatistics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReplicationTableStatisticsResult == false)
            return false;
        DescribeReplicationTableStatisticsResult other = (DescribeReplicationTableStatisticsResult) obj;
        if (other.getReplicationConfigArn() == null ^ this.getReplicationConfigArn() == null)
            return false;
        if (other.getReplicationConfigArn() != null && other.getReplicationConfigArn().equals(this.getReplicationConfigArn()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getReplicationTableStatistics() == null ^ this.getReplicationTableStatistics() == null)
            return false;
        if (other.getReplicationTableStatistics() != null && other.getReplicationTableStatistics().equals(this.getReplicationTableStatistics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationConfigArn() == null) ? 0 : getReplicationConfigArn().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getReplicationTableStatistics() == null) ? 0 : getReplicationTableStatistics().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReplicationTableStatisticsResult clone() {
        try {
            return (DescribeReplicationTableStatisticsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
