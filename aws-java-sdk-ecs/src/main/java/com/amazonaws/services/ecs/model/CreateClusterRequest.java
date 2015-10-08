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
 * Container for the parameters to the {@link com.amazonaws.services.ecs.AmazonECS#createCluster(CreateClusterRequest) CreateCluster operation}.
 * <p>
 * Creates a new Amazon ECS cluster. By default, your account receives a
 * <code>default</code> cluster when you launch your first container
 * instance. However, you can create your own cluster with a unique name
 * with the <code>CreateCluster</code> action.
 * </p>
 *
 * @see com.amazonaws.services.ecs.AmazonECS#createCluster(CreateClusterRequest)
 */
public class CreateClusterRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of your cluster. If you do not specify a name for your
     * cluster, you create a cluster named <code>default</code>. Up to 255
     * letters (uppercase and lowercase), numbers, hyphens, and underscores
     * are allowed.
     */
    private String clusterName;

    /**
     * The name of your cluster. If you do not specify a name for your
     * cluster, you create a cluster named <code>default</code>. Up to 255
     * letters (uppercase and lowercase), numbers, hyphens, and underscores
     * are allowed.
     *
     * @return The name of your cluster. If you do not specify a name for your
     *         cluster, you create a cluster named <code>default</code>. Up to 255
     *         letters (uppercase and lowercase), numbers, hyphens, and underscores
     *         are allowed.
     */
    public String getClusterName() {
        return clusterName;
    }
    
    /**
     * The name of your cluster. If you do not specify a name for your
     * cluster, you create a cluster named <code>default</code>. Up to 255
     * letters (uppercase and lowercase), numbers, hyphens, and underscores
     * are allowed.
     *
     * @param clusterName The name of your cluster. If you do not specify a name for your
     *         cluster, you create a cluster named <code>default</code>. Up to 255
     *         letters (uppercase and lowercase), numbers, hyphens, and underscores
     *         are allowed.
     */
    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }
    
    /**
     * The name of your cluster. If you do not specify a name for your
     * cluster, you create a cluster named <code>default</code>. Up to 255
     * letters (uppercase and lowercase), numbers, hyphens, and underscores
     * are allowed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterName The name of your cluster. If you do not specify a name for your
     *         cluster, you create a cluster named <code>default</code>. Up to 255
     *         letters (uppercase and lowercase), numbers, hyphens, and underscores
     *         are allowed.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateClusterRequest withClusterName(String clusterName) {
        this.clusterName = clusterName;
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
        if (getClusterName() != null) sb.append("ClusterName: " + getClusterName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateClusterRequest == false) return false;
        CreateClusterRequest other = (CreateClusterRequest)obj;
        
        if (other.getClusterName() == null ^ this.getClusterName() == null) return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateClusterRequest clone() {
        
            return (CreateClusterRequest) super.clone();
    }

}
    