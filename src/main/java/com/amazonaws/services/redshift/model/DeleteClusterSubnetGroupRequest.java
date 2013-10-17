/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#deleteClusterSubnetGroup(DeleteClusterSubnetGroupRequest) DeleteClusterSubnetGroup operation}.
 * <p>
 * Deletes the specified cluster subnet group.
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#deleteClusterSubnetGroup(DeleteClusterSubnetGroupRequest)
 */
public class DeleteClusterSubnetGroupRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the cluster subnet group name to be deleted.
     */
    private String clusterSubnetGroupName;

    /**
     * The name of the cluster subnet group name to be deleted.
     *
     * @return The name of the cluster subnet group name to be deleted.
     */
    public String getClusterSubnetGroupName() {
        return clusterSubnetGroupName;
    }
    
    /**
     * The name of the cluster subnet group name to be deleted.
     *
     * @param clusterSubnetGroupName The name of the cluster subnet group name to be deleted.
     */
    public void setClusterSubnetGroupName(String clusterSubnetGroupName) {
        this.clusterSubnetGroupName = clusterSubnetGroupName;
    }
    
    /**
     * The name of the cluster subnet group name to be deleted.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterSubnetGroupName The name of the cluster subnet group name to be deleted.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteClusterSubnetGroupRequest withClusterSubnetGroupName(String clusterSubnetGroupName) {
        this.clusterSubnetGroupName = clusterSubnetGroupName;
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
        if (getClusterSubnetGroupName() != null) sb.append("ClusterSubnetGroupName: " + getClusterSubnetGroupName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClusterSubnetGroupName() == null) ? 0 : getClusterSubnetGroupName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteClusterSubnetGroupRequest == false) return false;
        DeleteClusterSubnetGroupRequest other = (DeleteClusterSubnetGroupRequest)obj;
        
        if (other.getClusterSubnetGroupName() == null ^ this.getClusterSubnetGroupName() == null) return false;
        if (other.getClusterSubnetGroupName() != null && other.getClusterSubnetGroupName().equals(this.getClusterSubnetGroupName()) == false) return false; 
        return true;
    }
    
}
    