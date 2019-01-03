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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes an orderable cluster option.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/OrderableClusterOption" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrderableClusterOption implements Serializable, Cloneable {

    /**
     * <p>
     * The version of the orderable cluster.
     * </p>
     */
    private String clusterVersion;
    /**
     * <p>
     * The cluster type, for example <code>multi-node</code>.
     * </p>
     */
    private String clusterType;
    /**
     * <p>
     * The node type for the orderable cluster.
     * </p>
     */
    private String nodeType;
    /**
     * <p>
     * A list of availability zones for the orderable cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AvailabilityZone> availabilityZones;

    /**
     * <p>
     * The version of the orderable cluster.
     * </p>
     * 
     * @param clusterVersion
     *        The version of the orderable cluster.
     */

    public void setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
    }

    /**
     * <p>
     * The version of the orderable cluster.
     * </p>
     * 
     * @return The version of the orderable cluster.
     */

    public String getClusterVersion() {
        return this.clusterVersion;
    }

    /**
     * <p>
     * The version of the orderable cluster.
     * </p>
     * 
     * @param clusterVersion
     *        The version of the orderable cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableClusterOption withClusterVersion(String clusterVersion) {
        setClusterVersion(clusterVersion);
        return this;
    }

    /**
     * <p>
     * The cluster type, for example <code>multi-node</code>.
     * </p>
     * 
     * @param clusterType
     *        The cluster type, for example <code>multi-node</code>.
     */

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    /**
     * <p>
     * The cluster type, for example <code>multi-node</code>.
     * </p>
     * 
     * @return The cluster type, for example <code>multi-node</code>.
     */

    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * <p>
     * The cluster type, for example <code>multi-node</code>.
     * </p>
     * 
     * @param clusterType
     *        The cluster type, for example <code>multi-node</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableClusterOption withClusterType(String clusterType) {
        setClusterType(clusterType);
        return this;
    }

    /**
     * <p>
     * The node type for the orderable cluster.
     * </p>
     * 
     * @param nodeType
     *        The node type for the orderable cluster.
     */

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * The node type for the orderable cluster.
     * </p>
     * 
     * @return The node type for the orderable cluster.
     */

    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * <p>
     * The node type for the orderable cluster.
     * </p>
     * 
     * @param nodeType
     *        The node type for the orderable cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableClusterOption withNodeType(String nodeType) {
        setNodeType(nodeType);
        return this;
    }

    /**
     * <p>
     * A list of availability zones for the orderable cluster.
     * </p>
     * 
     * @return A list of availability zones for the orderable cluster.
     */

    public java.util.List<AvailabilityZone> getAvailabilityZones() {
        if (availabilityZones == null) {
            availabilityZones = new com.amazonaws.internal.SdkInternalList<AvailabilityZone>();
        }
        return availabilityZones;
    }

    /**
     * <p>
     * A list of availability zones for the orderable cluster.
     * </p>
     * 
     * @param availabilityZones
     *        A list of availability zones for the orderable cluster.
     */

    public void setAvailabilityZones(java.util.Collection<AvailabilityZone> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new com.amazonaws.internal.SdkInternalList<AvailabilityZone>(availabilityZones);
    }

    /**
     * <p>
     * A list of availability zones for the orderable cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        A list of availability zones for the orderable cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableClusterOption withAvailabilityZones(AvailabilityZone... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new com.amazonaws.internal.SdkInternalList<AvailabilityZone>(availabilityZones.length));
        }
        for (AvailabilityZone ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of availability zones for the orderable cluster.
     * </p>
     * 
     * @param availabilityZones
     *        A list of availability zones for the orderable cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableClusterOption withAvailabilityZones(java.util.Collection<AvailabilityZone> availabilityZones) {
        setAvailabilityZones(availabilityZones);
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
        if (getClusterVersion() != null)
            sb.append("ClusterVersion: ").append(getClusterVersion()).append(",");
        if (getClusterType() != null)
            sb.append("ClusterType: ").append(getClusterType()).append(",");
        if (getNodeType() != null)
            sb.append("NodeType: ").append(getNodeType()).append(",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrderableClusterOption == false)
            return false;
        OrderableClusterOption other = (OrderableClusterOption) obj;
        if (other.getClusterVersion() == null ^ this.getClusterVersion() == null)
            return false;
        if (other.getClusterVersion() != null && other.getClusterVersion().equals(this.getClusterVersion()) == false)
            return false;
        if (other.getClusterType() == null ^ this.getClusterType() == null)
            return false;
        if (other.getClusterType() != null && other.getClusterType().equals(this.getClusterType()) == false)
            return false;
        if (other.getNodeType() == null ^ this.getNodeType() == null)
            return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterVersion() == null) ? 0 : getClusterVersion().hashCode());
        hashCode = prime * hashCode + ((getClusterType() == null) ? 0 : getClusterType().hashCode());
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        return hashCode;
    }

    @Override
    public OrderableClusterOption clone() {
        try {
            return (OrderableClusterOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
