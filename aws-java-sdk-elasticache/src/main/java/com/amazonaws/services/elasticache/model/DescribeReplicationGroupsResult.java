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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a <code>DescribeReplicationGroups</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeReplicationGroups"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReplicationGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * A list of replication groups. Each item in the list contains detailed information about one replication group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ReplicationGroup> replicationGroups;

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     * 
     * @param marker
     *        Provides an identifier to allow retrieval of paginated results.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     * 
     * @return Provides an identifier to allow retrieval of paginated results.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     * 
     * @param marker
     *        Provides an identifier to allow retrieval of paginated results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationGroupsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A list of replication groups. Each item in the list contains detailed information about one replication group.
     * </p>
     * 
     * @return A list of replication groups. Each item in the list contains detailed information about one replication
     *         group.
     */

    public java.util.List<ReplicationGroup> getReplicationGroups() {
        if (replicationGroups == null) {
            replicationGroups = new com.amazonaws.internal.SdkInternalList<ReplicationGroup>();
        }
        return replicationGroups;
    }

    /**
     * <p>
     * A list of replication groups. Each item in the list contains detailed information about one replication group.
     * </p>
     * 
     * @param replicationGroups
     *        A list of replication groups. Each item in the list contains detailed information about one replication
     *        group.
     */

    public void setReplicationGroups(java.util.Collection<ReplicationGroup> replicationGroups) {
        if (replicationGroups == null) {
            this.replicationGroups = null;
            return;
        }

        this.replicationGroups = new com.amazonaws.internal.SdkInternalList<ReplicationGroup>(replicationGroups);
    }

    /**
     * <p>
     * A list of replication groups. Each item in the list contains detailed information about one replication group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicationGroups(java.util.Collection)} or {@link #withReplicationGroups(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param replicationGroups
     *        A list of replication groups. Each item in the list contains detailed information about one replication
     *        group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationGroupsResult withReplicationGroups(ReplicationGroup... replicationGroups) {
        if (this.replicationGroups == null) {
            setReplicationGroups(new com.amazonaws.internal.SdkInternalList<ReplicationGroup>(replicationGroups.length));
        }
        for (ReplicationGroup ele : replicationGroups) {
            this.replicationGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of replication groups. Each item in the list contains detailed information about one replication group.
     * </p>
     * 
     * @param replicationGroups
     *        A list of replication groups. Each item in the list contains detailed information about one replication
     *        group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationGroupsResult withReplicationGroups(java.util.Collection<ReplicationGroup> replicationGroups) {
        setReplicationGroups(replicationGroups);
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
        if (getReplicationGroups() != null)
            sb.append("ReplicationGroups: ").append(getReplicationGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReplicationGroupsResult == false)
            return false;
        DescribeReplicationGroupsResult other = (DescribeReplicationGroupsResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getReplicationGroups() == null ^ this.getReplicationGroups() == null)
            return false;
        if (other.getReplicationGroups() != null && other.getReplicationGroups().equals(this.getReplicationGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getReplicationGroups() == null) ? 0 : getReplicationGroups().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReplicationGroupsResult clone() {
        try {
            return (DescribeReplicationGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
