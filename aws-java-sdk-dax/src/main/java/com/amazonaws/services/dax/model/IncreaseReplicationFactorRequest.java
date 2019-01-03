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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/IncreaseReplicationFactor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IncreaseReplicationFactorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the DAX cluster that will receive additional nodes.
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
     * The Availability Zones (AZs) in which the cluster nodes will be created. All nodes belonging to the cluster are
     * placed in these Availability Zones. Use this parameter if you want to distribute the nodes across multiple AZs.
     * </p>
     */
    private java.util.List<String> availabilityZones;

    /**
     * <p>
     * The name of the DAX cluster that will receive additional nodes.
     * </p>
     * 
     * @param clusterName
     *        The name of the DAX cluster that will receive additional nodes.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the DAX cluster that will receive additional nodes.
     * </p>
     * 
     * @return The name of the DAX cluster that will receive additional nodes.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the DAX cluster that will receive additional nodes.
     * </p>
     * 
     * @param clusterName
     *        The name of the DAX cluster that will receive additional nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncreaseReplicationFactorRequest withClusterName(String clusterName) {
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

    public IncreaseReplicationFactorRequest withNewReplicationFactor(Integer newReplicationFactor) {
        setNewReplicationFactor(newReplicationFactor);
        return this;
    }

    /**
     * <p>
     * The Availability Zones (AZs) in which the cluster nodes will be created. All nodes belonging to the cluster are
     * placed in these Availability Zones. Use this parameter if you want to distribute the nodes across multiple AZs.
     * </p>
     * 
     * @return The Availability Zones (AZs) in which the cluster nodes will be created. All nodes belonging to the
     *         cluster are placed in these Availability Zones. Use this parameter if you want to distribute the nodes
     *         across multiple AZs.
     */

    public java.util.List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * The Availability Zones (AZs) in which the cluster nodes will be created. All nodes belonging to the cluster are
     * placed in these Availability Zones. Use this parameter if you want to distribute the nodes across multiple AZs.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones (AZs) in which the cluster nodes will be created. All nodes belonging to the
     *        cluster are placed in these Availability Zones. Use this parameter if you want to distribute the nodes
     *        across multiple AZs.
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
     * The Availability Zones (AZs) in which the cluster nodes will be created. All nodes belonging to the cluster are
     * placed in these Availability Zones. Use this parameter if you want to distribute the nodes across multiple AZs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones (AZs) in which the cluster nodes will be created. All nodes belonging to the
     *        cluster are placed in these Availability Zones. Use this parameter if you want to distribute the nodes
     *        across multiple AZs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncreaseReplicationFactorRequest withAvailabilityZones(String... availabilityZones) {
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
     * The Availability Zones (AZs) in which the cluster nodes will be created. All nodes belonging to the cluster are
     * placed in these Availability Zones. Use this parameter if you want to distribute the nodes across multiple AZs.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones (AZs) in which the cluster nodes will be created. All nodes belonging to the
     *        cluster are placed in these Availability Zones. Use this parameter if you want to distribute the nodes
     *        across multiple AZs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncreaseReplicationFactorRequest withAvailabilityZones(java.util.Collection<String> availabilityZones) {
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
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getNewReplicationFactor() != null)
            sb.append("NewReplicationFactor: ").append(getNewReplicationFactor()).append(",");
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

        if (obj instanceof IncreaseReplicationFactorRequest == false)
            return false;
        IncreaseReplicationFactorRequest other = (IncreaseReplicationFactorRequest) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getNewReplicationFactor() == null) ? 0 : getNewReplicationFactor().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        return hashCode;
    }

    @Override
    public IncreaseReplicationFactorRequest clone() {
        return (IncreaseReplicationFactorRequest) super.clone();
    }

}
