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
package com.amazonaws.services.dax.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DecreaseReplicationFactor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DecreaseReplicationFactorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the DAX cluster from which you want to remove nodes.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The new number of nodes for the DAX cluster.
     * </p>
     */
    private Integer newReplicationFactor;
    /**
     * <p>
     * The Availability Zone(s) from which to remove nodes.
     * </p>
     */
    private java.util.List<String> availabilityZones;
    /**
     * <p>
     * The unique identifiers of the nodes to be removed from the cluster.
     * </p>
     */
    private java.util.List<String> nodeIdsToRemove;

    /**
     * <p>
     * The name of the DAX cluster from which you want to remove nodes.
     * </p>
     * 
     * @param clusterName
     *        The name of the DAX cluster from which you want to remove nodes.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the DAX cluster from which you want to remove nodes.
     * </p>
     * 
     * @return The name of the DAX cluster from which you want to remove nodes.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the DAX cluster from which you want to remove nodes.
     * </p>
     * 
     * @param clusterName
     *        The name of the DAX cluster from which you want to remove nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecreaseReplicationFactorRequest withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The new number of nodes for the DAX cluster.
     * </p>
     * 
     * @param newReplicationFactor
     *        The new number of nodes for the DAX cluster.
     */

    public void setNewReplicationFactor(Integer newReplicationFactor) {
        this.newReplicationFactor = newReplicationFactor;
    }

    /**
     * <p>
     * The new number of nodes for the DAX cluster.
     * </p>
     * 
     * @return The new number of nodes for the DAX cluster.
     */

    public Integer getNewReplicationFactor() {
        return this.newReplicationFactor;
    }

    /**
     * <p>
     * The new number of nodes for the DAX cluster.
     * </p>
     * 
     * @param newReplicationFactor
     *        The new number of nodes for the DAX cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecreaseReplicationFactorRequest withNewReplicationFactor(Integer newReplicationFactor) {
        setNewReplicationFactor(newReplicationFactor);
        return this;
    }

    /**
     * <p>
     * The Availability Zone(s) from which to remove nodes.
     * </p>
     * 
     * @return The Availability Zone(s) from which to remove nodes.
     */

    public java.util.List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * The Availability Zone(s) from which to remove nodes.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zone(s) from which to remove nodes.
     */

    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new java.util.ArrayList<String>(availabilityZones);
    }

    /**
     * <p>
     * The Availability Zone(s) from which to remove nodes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zone(s) from which to remove nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecreaseReplicationFactorRequest withAvailabilityZones(String... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new java.util.ArrayList<String>(availabilityZones.length));
        }
        for (String ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Availability Zone(s) from which to remove nodes.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zone(s) from which to remove nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecreaseReplicationFactorRequest withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * The unique identifiers of the nodes to be removed from the cluster.
     * </p>
     * 
     * @return The unique identifiers of the nodes to be removed from the cluster.
     */

    public java.util.List<String> getNodeIdsToRemove() {
        return nodeIdsToRemove;
    }

    /**
     * <p>
     * The unique identifiers of the nodes to be removed from the cluster.
     * </p>
     * 
     * @param nodeIdsToRemove
     *        The unique identifiers of the nodes to be removed from the cluster.
     */

    public void setNodeIdsToRemove(java.util.Collection<String> nodeIdsToRemove) {
        if (nodeIdsToRemove == null) {
            this.nodeIdsToRemove = null;
            return;
        }

        this.nodeIdsToRemove = new java.util.ArrayList<String>(nodeIdsToRemove);
    }

    /**
     * <p>
     * The unique identifiers of the nodes to be removed from the cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNodeIdsToRemove(java.util.Collection)} or {@link #withNodeIdsToRemove(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param nodeIdsToRemove
     *        The unique identifiers of the nodes to be removed from the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecreaseReplicationFactorRequest withNodeIdsToRemove(String... nodeIdsToRemove) {
        if (this.nodeIdsToRemove == null) {
            setNodeIdsToRemove(new java.util.ArrayList<String>(nodeIdsToRemove.length));
        }
        for (String ele : nodeIdsToRemove) {
            this.nodeIdsToRemove.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The unique identifiers of the nodes to be removed from the cluster.
     * </p>
     * 
     * @param nodeIdsToRemove
     *        The unique identifiers of the nodes to be removed from the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecreaseReplicationFactorRequest withNodeIdsToRemove(java.util.Collection<String> nodeIdsToRemove) {
        setNodeIdsToRemove(nodeIdsToRemove);
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
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getNewReplicationFactor() != null)
            sb.append("NewReplicationFactor: ").append(getNewReplicationFactor()).append(",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones()).append(",");
        if (getNodeIdsToRemove() != null)
            sb.append("NodeIdsToRemove: ").append(getNodeIdsToRemove());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DecreaseReplicationFactorRequest == false)
            return false;
        DecreaseReplicationFactorRequest other = (DecreaseReplicationFactorRequest) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getNewReplicationFactor() == null ^ this.getNewReplicationFactor() == null)
            return false;
        if (other.getNewReplicationFactor() != null && other.getNewReplicationFactor().equals(this.getNewReplicationFactor()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getNodeIdsToRemove() == null ^ this.getNodeIdsToRemove() == null)
            return false;
        if (other.getNodeIdsToRemove() != null && other.getNodeIdsToRemove().equals(this.getNodeIdsToRemove()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getNewReplicationFactor() == null) ? 0 : getNewReplicationFactor().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getNodeIdsToRemove() == null) ? 0 : getNodeIdsToRemove().hashCode());
        return hashCode;
    }

    @Override
    public DecreaseReplicationFactorRequest clone() {
        return (DecreaseReplicationFactorRequest) super.clone();
    }

}
