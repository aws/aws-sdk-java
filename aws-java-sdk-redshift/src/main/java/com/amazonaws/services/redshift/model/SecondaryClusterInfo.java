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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The AvailabilityZone and ClusterNodes information of the secondary compute unit.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/SecondaryClusterInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecondaryClusterInfo implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Availability Zone in which the secondary compute unit of the cluster is located.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The nodes in the secondary compute unit.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ClusterNode> clusterNodes;

    /**
     * <p>
     * The name of the Availability Zone in which the secondary compute unit of the cluster is located.
     * </p>
     * 
     * @param availabilityZone
     *        The name of the Availability Zone in which the secondary compute unit of the cluster is located.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The name of the Availability Zone in which the secondary compute unit of the cluster is located.
     * </p>
     * 
     * @return The name of the Availability Zone in which the secondary compute unit of the cluster is located.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The name of the Availability Zone in which the secondary compute unit of the cluster is located.
     * </p>
     * 
     * @param availabilityZone
     *        The name of the Availability Zone in which the secondary compute unit of the cluster is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecondaryClusterInfo withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The nodes in the secondary compute unit.
     * </p>
     * 
     * @return The nodes in the secondary compute unit.
     */

    public java.util.List<ClusterNode> getClusterNodes() {
        if (clusterNodes == null) {
            clusterNodes = new com.amazonaws.internal.SdkInternalList<ClusterNode>();
        }
        return clusterNodes;
    }

    /**
     * <p>
     * The nodes in the secondary compute unit.
     * </p>
     * 
     * @param clusterNodes
     *        The nodes in the secondary compute unit.
     */

    public void setClusterNodes(java.util.Collection<ClusterNode> clusterNodes) {
        if (clusterNodes == null) {
            this.clusterNodes = null;
            return;
        }

        this.clusterNodes = new com.amazonaws.internal.SdkInternalList<ClusterNode>(clusterNodes);
    }

    /**
     * <p>
     * The nodes in the secondary compute unit.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClusterNodes(java.util.Collection)} or {@link #withClusterNodes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param clusterNodes
     *        The nodes in the secondary compute unit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecondaryClusterInfo withClusterNodes(ClusterNode... clusterNodes) {
        if (this.clusterNodes == null) {
            setClusterNodes(new com.amazonaws.internal.SdkInternalList<ClusterNode>(clusterNodes.length));
        }
        for (ClusterNode ele : clusterNodes) {
            this.clusterNodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The nodes in the secondary compute unit.
     * </p>
     * 
     * @param clusterNodes
     *        The nodes in the secondary compute unit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecondaryClusterInfo withClusterNodes(java.util.Collection<ClusterNode> clusterNodes) {
        setClusterNodes(clusterNodes);
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
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getClusterNodes() != null)
            sb.append("ClusterNodes: ").append(getClusterNodes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecondaryClusterInfo == false)
            return false;
        SecondaryClusterInfo other = (SecondaryClusterInfo) obj;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getClusterNodes() == null ^ this.getClusterNodes() == null)
            return false;
        if (other.getClusterNodes() != null && other.getClusterNodes().equals(this.getClusterNodes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getClusterNodes() == null) ? 0 : getClusterNodes().hashCode());
        return hashCode;
    }

    @Override
    public SecondaryClusterInfo clone() {
        try {
            return (SecondaryClusterInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
