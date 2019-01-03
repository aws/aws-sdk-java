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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains a cluster's state, a cluster's ID, and other important information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/ClusterListEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterListEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The 39-character ID for the cluster that you want to list, for example
     * <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     */
    private String clusterId;
    /**
     * <p>
     * The current state of this cluster. For information about the state of a specific node, see
     * <a>JobListEntry$JobState</a>.
     * </p>
     */
    private String clusterState;
    /**
     * <p>
     * The creation date for this cluster.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * Defines an optional description of the cluster, for example <code>Environmental Data Cluster-01</code>.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The 39-character ID for the cluster that you want to list, for example
     * <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * 
     * @param clusterId
     *        The 39-character ID for the cluster that you want to list, for example
     *        <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     */

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * The 39-character ID for the cluster that you want to list, for example
     * <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * 
     * @return The 39-character ID for the cluster that you want to list, for example
     *         <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     */

    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * <p>
     * The 39-character ID for the cluster that you want to list, for example
     * <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * 
     * @param clusterId
     *        The 39-character ID for the cluster that you want to list, for example
     *        <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterListEntry withClusterId(String clusterId) {
        setClusterId(clusterId);
        return this;
    }

    /**
     * <p>
     * The current state of this cluster. For information about the state of a specific node, see
     * <a>JobListEntry$JobState</a>.
     * </p>
     * 
     * @param clusterState
     *        The current state of this cluster. For information about the state of a specific node, see
     *        <a>JobListEntry$JobState</a>.
     * @see ClusterState
     */

    public void setClusterState(String clusterState) {
        this.clusterState = clusterState;
    }

    /**
     * <p>
     * The current state of this cluster. For information about the state of a specific node, see
     * <a>JobListEntry$JobState</a>.
     * </p>
     * 
     * @return The current state of this cluster. For information about the state of a specific node, see
     *         <a>JobListEntry$JobState</a>.
     * @see ClusterState
     */

    public String getClusterState() {
        return this.clusterState;
    }

    /**
     * <p>
     * The current state of this cluster. For information about the state of a specific node, see
     * <a>JobListEntry$JobState</a>.
     * </p>
     * 
     * @param clusterState
     *        The current state of this cluster. For information about the state of a specific node, see
     *        <a>JobListEntry$JobState</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterState
     */

    public ClusterListEntry withClusterState(String clusterState) {
        setClusterState(clusterState);
        return this;
    }

    /**
     * <p>
     * The current state of this cluster. For information about the state of a specific node, see
     * <a>JobListEntry$JobState</a>.
     * </p>
     * 
     * @param clusterState
     *        The current state of this cluster. For information about the state of a specific node, see
     *        <a>JobListEntry$JobState</a>.
     * @see ClusterState
     */

    public void setClusterState(ClusterState clusterState) {
        withClusterState(clusterState);
    }

    /**
     * <p>
     * The current state of this cluster. For information about the state of a specific node, see
     * <a>JobListEntry$JobState</a>.
     * </p>
     * 
     * @param clusterState
     *        The current state of this cluster. For information about the state of a specific node, see
     *        <a>JobListEntry$JobState</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterState
     */

    public ClusterListEntry withClusterState(ClusterState clusterState) {
        this.clusterState = clusterState.toString();
        return this;
    }

    /**
     * <p>
     * The creation date for this cluster.
     * </p>
     * 
     * @param creationDate
     *        The creation date for this cluster.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The creation date for this cluster.
     * </p>
     * 
     * @return The creation date for this cluster.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The creation date for this cluster.
     * </p>
     * 
     * @param creationDate
     *        The creation date for this cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterListEntry withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * Defines an optional description of the cluster, for example <code>Environmental Data Cluster-01</code>.
     * </p>
     * 
     * @param description
     *        Defines an optional description of the cluster, for example <code>Environmental Data Cluster-01</code>.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Defines an optional description of the cluster, for example <code>Environmental Data Cluster-01</code>.
     * </p>
     * 
     * @return Defines an optional description of the cluster, for example <code>Environmental Data Cluster-01</code>.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Defines an optional description of the cluster, for example <code>Environmental Data Cluster-01</code>.
     * </p>
     * 
     * @param description
     *        Defines an optional description of the cluster, for example <code>Environmental Data Cluster-01</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterListEntry withDescription(String description) {
        setDescription(description);
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
        if (getClusterId() != null)
            sb.append("ClusterId: ").append(getClusterId()).append(",");
        if (getClusterState() != null)
            sb.append("ClusterState: ").append(getClusterState()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterListEntry == false)
            return false;
        ClusterListEntry other = (ClusterListEntry) obj;
        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getClusterState() == null ^ this.getClusterState() == null)
            return false;
        if (other.getClusterState() != null && other.getClusterState().equals(this.getClusterState()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode + ((getClusterState() == null) ? 0 : getClusterState().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public ClusterListEntry clone() {
        try {
            return (ClusterListEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.snowball.model.transform.ClusterListEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
