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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplicationConfigs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReplicationConfigsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Returned configuration parameters that describe each provisioned DMS Serverless replication.
     * </p>
     */
    private java.util.List<ReplicationConfig> replicationConfigs;

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

    public DescribeReplicationConfigsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Returned configuration parameters that describe each provisioned DMS Serverless replication.
     * </p>
     * 
     * @return Returned configuration parameters that describe each provisioned DMS Serverless replication.
     */

    public java.util.List<ReplicationConfig> getReplicationConfigs() {
        return replicationConfigs;
    }

    /**
     * <p>
     * Returned configuration parameters that describe each provisioned DMS Serverless replication.
     * </p>
     * 
     * @param replicationConfigs
     *        Returned configuration parameters that describe each provisioned DMS Serverless replication.
     */

    public void setReplicationConfigs(java.util.Collection<ReplicationConfig> replicationConfigs) {
        if (replicationConfigs == null) {
            this.replicationConfigs = null;
            return;
        }

        this.replicationConfigs = new java.util.ArrayList<ReplicationConfig>(replicationConfigs);
    }

    /**
     * <p>
     * Returned configuration parameters that describe each provisioned DMS Serverless replication.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicationConfigs(java.util.Collection)} or {@link #withReplicationConfigs(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param replicationConfigs
     *        Returned configuration parameters that describe each provisioned DMS Serverless replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationConfigsResult withReplicationConfigs(ReplicationConfig... replicationConfigs) {
        if (this.replicationConfigs == null) {
            setReplicationConfigs(new java.util.ArrayList<ReplicationConfig>(replicationConfigs.length));
        }
        for (ReplicationConfig ele : replicationConfigs) {
            this.replicationConfigs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returned configuration parameters that describe each provisioned DMS Serverless replication.
     * </p>
     * 
     * @param replicationConfigs
     *        Returned configuration parameters that describe each provisioned DMS Serverless replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationConfigsResult withReplicationConfigs(java.util.Collection<ReplicationConfig> replicationConfigs) {
        setReplicationConfigs(replicationConfigs);
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
        if (getReplicationConfigs() != null)
            sb.append("ReplicationConfigs: ").append(getReplicationConfigs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReplicationConfigsResult == false)
            return false;
        DescribeReplicationConfigsResult other = (DescribeReplicationConfigsResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getReplicationConfigs() == null ^ this.getReplicationConfigs() == null)
            return false;
        if (other.getReplicationConfigs() != null && other.getReplicationConfigs().equals(this.getReplicationConfigs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getReplicationConfigs() == null) ? 0 : getReplicationConfigs().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReplicationConfigsResult clone() {
        try {
            return (DescribeReplicationConfigsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
