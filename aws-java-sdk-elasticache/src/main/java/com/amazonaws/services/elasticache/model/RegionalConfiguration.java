/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A list of the replication groups
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/RegionalConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegionalConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the secondary cluster
     * </p>
     */
    private String replicationGroupId;
    /**
     * <p>
     * The AWS region where the cluster is stored
     * </p>
     */
    private String replicationGroupRegion;
    /**
     * <p>
     * A list of <code>PreferredAvailabilityZones</code> objects that specifies the configuration of a node group in the
     * resharded cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ReshardingConfiguration> reshardingConfiguration;

    /**
     * <p>
     * The name of the secondary cluster
     * </p>
     * 
     * @param replicationGroupId
     *        The name of the secondary cluster
     */

    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The name of the secondary cluster
     * </p>
     * 
     * @return The name of the secondary cluster
     */

    public String getReplicationGroupId() {
        return this.replicationGroupId;
    }

    /**
     * <p>
     * The name of the secondary cluster
     * </p>
     * 
     * @param replicationGroupId
     *        The name of the secondary cluster
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegionalConfiguration withReplicationGroupId(String replicationGroupId) {
        setReplicationGroupId(replicationGroupId);
        return this;
    }

    /**
     * <p>
     * The AWS region where the cluster is stored
     * </p>
     * 
     * @param replicationGroupRegion
     *        The AWS region where the cluster is stored
     */

    public void setReplicationGroupRegion(String replicationGroupRegion) {
        this.replicationGroupRegion = replicationGroupRegion;
    }

    /**
     * <p>
     * The AWS region where the cluster is stored
     * </p>
     * 
     * @return The AWS region where the cluster is stored
     */

    public String getReplicationGroupRegion() {
        return this.replicationGroupRegion;
    }

    /**
     * <p>
     * The AWS region where the cluster is stored
     * </p>
     * 
     * @param replicationGroupRegion
     *        The AWS region where the cluster is stored
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegionalConfiguration withReplicationGroupRegion(String replicationGroupRegion) {
        setReplicationGroupRegion(replicationGroupRegion);
        return this;
    }

    /**
     * <p>
     * A list of <code>PreferredAvailabilityZones</code> objects that specifies the configuration of a node group in the
     * resharded cluster.
     * </p>
     * 
     * @return A list of <code>PreferredAvailabilityZones</code> objects that specifies the configuration of a node
     *         group in the resharded cluster.
     */

    public java.util.List<ReshardingConfiguration> getReshardingConfiguration() {
        if (reshardingConfiguration == null) {
            reshardingConfiguration = new com.amazonaws.internal.SdkInternalList<ReshardingConfiguration>();
        }
        return reshardingConfiguration;
    }

    /**
     * <p>
     * A list of <code>PreferredAvailabilityZones</code> objects that specifies the configuration of a node group in the
     * resharded cluster.
     * </p>
     * 
     * @param reshardingConfiguration
     *        A list of <code>PreferredAvailabilityZones</code> objects that specifies the configuration of a node group
     *        in the resharded cluster.
     */

    public void setReshardingConfiguration(java.util.Collection<ReshardingConfiguration> reshardingConfiguration) {
        if (reshardingConfiguration == null) {
            this.reshardingConfiguration = null;
            return;
        }

        this.reshardingConfiguration = new com.amazonaws.internal.SdkInternalList<ReshardingConfiguration>(reshardingConfiguration);
    }

    /**
     * <p>
     * A list of <code>PreferredAvailabilityZones</code> objects that specifies the configuration of a node group in the
     * resharded cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReshardingConfiguration(java.util.Collection)} or
     * {@link #withReshardingConfiguration(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param reshardingConfiguration
     *        A list of <code>PreferredAvailabilityZones</code> objects that specifies the configuration of a node group
     *        in the resharded cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegionalConfiguration withReshardingConfiguration(ReshardingConfiguration... reshardingConfiguration) {
        if (this.reshardingConfiguration == null) {
            setReshardingConfiguration(new com.amazonaws.internal.SdkInternalList<ReshardingConfiguration>(reshardingConfiguration.length));
        }
        for (ReshardingConfiguration ele : reshardingConfiguration) {
            this.reshardingConfiguration.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>PreferredAvailabilityZones</code> objects that specifies the configuration of a node group in the
     * resharded cluster.
     * </p>
     * 
     * @param reshardingConfiguration
     *        A list of <code>PreferredAvailabilityZones</code> objects that specifies the configuration of a node group
     *        in the resharded cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegionalConfiguration withReshardingConfiguration(java.util.Collection<ReshardingConfiguration> reshardingConfiguration) {
        setReshardingConfiguration(reshardingConfiguration);
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
        if (getReplicationGroupId() != null)
            sb.append("ReplicationGroupId: ").append(getReplicationGroupId()).append(",");
        if (getReplicationGroupRegion() != null)
            sb.append("ReplicationGroupRegion: ").append(getReplicationGroupRegion()).append(",");
        if (getReshardingConfiguration() != null)
            sb.append("ReshardingConfiguration: ").append(getReshardingConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegionalConfiguration == false)
            return false;
        RegionalConfiguration other = (RegionalConfiguration) obj;
        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null)
            return false;
        if (other.getReplicationGroupId() != null && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false)
            return false;
        if (other.getReplicationGroupRegion() == null ^ this.getReplicationGroupRegion() == null)
            return false;
        if (other.getReplicationGroupRegion() != null && other.getReplicationGroupRegion().equals(this.getReplicationGroupRegion()) == false)
            return false;
        if (other.getReshardingConfiguration() == null ^ this.getReshardingConfiguration() == null)
            return false;
        if (other.getReshardingConfiguration() != null && other.getReshardingConfiguration().equals(this.getReshardingConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode());
        hashCode = prime * hashCode + ((getReplicationGroupRegion() == null) ? 0 : getReplicationGroupRegion().hashCode());
        hashCode = prime * hashCode + ((getReshardingConfiguration() == null) ? 0 : getReshardingConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public RegionalConfiguration clone() {
        try {
            return (RegionalConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
