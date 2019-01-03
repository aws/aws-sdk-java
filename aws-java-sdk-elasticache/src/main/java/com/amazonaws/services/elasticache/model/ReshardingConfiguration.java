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
 * A list of <code>PreferredAvailabilityZones</code> objects that specifies the configuration of a node group in the
 * resharded cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ReshardingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReshardingConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * The 4-digit id for the node group these configuration values apply to.
     * </p>
     */
    private String nodeGroupId;
    /**
     * <p>
     * A list of preferred availability zones for the nodes in this cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> preferredAvailabilityZones;

    /**
     * <p>
     * The 4-digit id for the node group these configuration values apply to.
     * </p>
     * 
     * @param nodeGroupId
     *        The 4-digit id for the node group these configuration values apply to.
     */

    public void setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
    }

    /**
     * <p>
     * The 4-digit id for the node group these configuration values apply to.
     * </p>
     * 
     * @return The 4-digit id for the node group these configuration values apply to.
     */

    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * <p>
     * The 4-digit id for the node group these configuration values apply to.
     * </p>
     * 
     * @param nodeGroupId
     *        The 4-digit id for the node group these configuration values apply to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReshardingConfiguration withNodeGroupId(String nodeGroupId) {
        setNodeGroupId(nodeGroupId);
        return this;
    }

    /**
     * <p>
     * A list of preferred availability zones for the nodes in this cluster.
     * </p>
     * 
     * @return A list of preferred availability zones for the nodes in this cluster.
     */

    public java.util.List<String> getPreferredAvailabilityZones() {
        if (preferredAvailabilityZones == null) {
            preferredAvailabilityZones = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return preferredAvailabilityZones;
    }

    /**
     * <p>
     * A list of preferred availability zones for the nodes in this cluster.
     * </p>
     * 
     * @param preferredAvailabilityZones
     *        A list of preferred availability zones for the nodes in this cluster.
     */

    public void setPreferredAvailabilityZones(java.util.Collection<String> preferredAvailabilityZones) {
        if (preferredAvailabilityZones == null) {
            this.preferredAvailabilityZones = null;
            return;
        }

        this.preferredAvailabilityZones = new com.amazonaws.internal.SdkInternalList<String>(preferredAvailabilityZones);
    }

    /**
     * <p>
     * A list of preferred availability zones for the nodes in this cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPreferredAvailabilityZones(java.util.Collection)} or
     * {@link #withPreferredAvailabilityZones(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param preferredAvailabilityZones
     *        A list of preferred availability zones for the nodes in this cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReshardingConfiguration withPreferredAvailabilityZones(String... preferredAvailabilityZones) {
        if (this.preferredAvailabilityZones == null) {
            setPreferredAvailabilityZones(new com.amazonaws.internal.SdkInternalList<String>(preferredAvailabilityZones.length));
        }
        for (String ele : preferredAvailabilityZones) {
            this.preferredAvailabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of preferred availability zones for the nodes in this cluster.
     * </p>
     * 
     * @param preferredAvailabilityZones
     *        A list of preferred availability zones for the nodes in this cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReshardingConfiguration withPreferredAvailabilityZones(java.util.Collection<String> preferredAvailabilityZones) {
        setPreferredAvailabilityZones(preferredAvailabilityZones);
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
        if (getNodeGroupId() != null)
            sb.append("NodeGroupId: ").append(getNodeGroupId()).append(",");
        if (getPreferredAvailabilityZones() != null)
            sb.append("PreferredAvailabilityZones: ").append(getPreferredAvailabilityZones());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReshardingConfiguration == false)
            return false;
        ReshardingConfiguration other = (ReshardingConfiguration) obj;
        if (other.getNodeGroupId() == null ^ this.getNodeGroupId() == null)
            return false;
        if (other.getNodeGroupId() != null && other.getNodeGroupId().equals(this.getNodeGroupId()) == false)
            return false;
        if (other.getPreferredAvailabilityZones() == null ^ this.getPreferredAvailabilityZones() == null)
            return false;
        if (other.getPreferredAvailabilityZones() != null && other.getPreferredAvailabilityZones().equals(this.getPreferredAvailabilityZones()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNodeGroupId() == null) ? 0 : getNodeGroupId().hashCode());
        hashCode = prime * hashCode + ((getPreferredAvailabilityZones() == null) ? 0 : getPreferredAvailabilityZones().hashCode());
        return hashCode;
    }

    @Override
    public ReshardingConfiguration clone() {
        try {
            return (ReshardingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
