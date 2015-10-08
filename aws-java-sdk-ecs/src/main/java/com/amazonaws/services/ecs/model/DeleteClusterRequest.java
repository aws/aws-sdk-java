/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ecs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ecs.AmazonECS#deleteCluster(DeleteClusterRequest) DeleteCluster operation}.
 * <p>
 * Deletes the specified cluster. You must deregister all container
 * instances from this cluster before you may delete it. You can list the
 * container instances in a cluster with ListContainerInstances and
 * deregister them with DeregisterContainerInstance.
 * </p>
 *
 * @see com.amazonaws.services.ecs.AmazonECS#deleteCluster(DeleteClusterRequest)
 */
public class DeleteClusterRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster to
     * delete.
     */
    private String cluster;

    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster to
     * delete.
     *
     * @return The short name or full Amazon Resource Name (ARN) of the cluster to
     *         delete.
     */
    public String getCluster() {
        return cluster;
    }
    
    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster to
     * delete.
     *
     * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster to
     *         delete.
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }
    
    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster to
     * delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster to
     *         delete.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteClusterRequest withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCluster() != null) sb.append("Cluster: " + getCluster() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteClusterRequest == false) return false;
        DeleteClusterRequest other = (DeleteClusterRequest)obj;
        
        if (other.getCluster() == null ^ this.getCluster() == null) return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false) return false; 
        return true;
    }
    
    @Override
    public DeleteClusterRequest clone() {
        
            return (DeleteClusterRequest) super.clone();
    }

}
    