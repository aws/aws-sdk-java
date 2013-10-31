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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduce#listInstances(ListInstancesRequest) ListInstances operation}.
 * <p>
 * Provides information about the cluster instances that Amazon EMR provisions on behalf of a user when it creates the cluster. For example, this
 * operation indicates when the EC2 instances reach the Ready state, when instances become available to Amazon EMR to use for jobs, and the IP addresses
 * for cluster instances, etc.
 * </p>
 *
 * @see com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduce#listInstances(ListInstancesRequest)
 */
public class ListInstancesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The identifier of the cluster for which to list the instances.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String clusterId;

    /**
     * The identifier of the instance group for which to list the instances.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String instanceGroupId;

    /**
     * The type of instance group for which to list the instances.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceGroupTypes;

    /**
     * The pagination token that indicates the next set of results to
     * retrieve.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     */
    private String marker;

    /**
     * The identifier of the cluster for which to list the instances.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return The identifier of the cluster for which to list the instances.
     */
    public String getClusterId() {
        return clusterId;
    }
    
    /**
     * The identifier of the cluster for which to list the instances.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param clusterId The identifier of the cluster for which to list the instances.
     */
    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }
    
    /**
     * The identifier of the cluster for which to list the instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param clusterId The identifier of the cluster for which to list the instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListInstancesRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * The identifier of the instance group for which to list the instances.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return The identifier of the instance group for which to list the instances.
     */
    public String getInstanceGroupId() {
        return instanceGroupId;
    }
    
    /**
     * The identifier of the instance group for which to list the instances.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param instanceGroupId The identifier of the instance group for which to list the instances.
     */
    public void setInstanceGroupId(String instanceGroupId) {
        this.instanceGroupId = instanceGroupId;
    }
    
    /**
     * The identifier of the instance group for which to list the instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param instanceGroupId The identifier of the instance group for which to list the instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListInstancesRequest withInstanceGroupId(String instanceGroupId) {
        this.instanceGroupId = instanceGroupId;
        return this;
    }

    /**
     * The type of instance group for which to list the instances.
     *
     * @return The type of instance group for which to list the instances.
     */
    public java.util.List<String> getInstanceGroupTypes() {
        if (instanceGroupTypes == null) {
              instanceGroupTypes = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              instanceGroupTypes.setAutoConstruct(true);
        }
        return instanceGroupTypes;
    }
    
    /**
     * The type of instance group for which to list the instances.
     *
     * @param instanceGroupTypes The type of instance group for which to list the instances.
     */
    public void setInstanceGroupTypes(java.util.Collection<String> instanceGroupTypes) {
        if (instanceGroupTypes == null) {
            this.instanceGroupTypes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceGroupTypesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(instanceGroupTypes.size());
        instanceGroupTypesCopy.addAll(instanceGroupTypes);
        this.instanceGroupTypes = instanceGroupTypesCopy;
    }
    
    /**
     * The type of instance group for which to list the instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceGroupTypes The type of instance group for which to list the instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListInstancesRequest withInstanceGroupTypes(String... instanceGroupTypes) {
        if (getInstanceGroupTypes() == null) setInstanceGroupTypes(new java.util.ArrayList<String>(instanceGroupTypes.length));
        for (String value : instanceGroupTypes) {
            getInstanceGroupTypes().add(value);
        }
        return this;
    }
    
    /**
     * The type of instance group for which to list the instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceGroupTypes The type of instance group for which to list the instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListInstancesRequest withInstanceGroupTypes(java.util.Collection<String> instanceGroupTypes) {
        if (instanceGroupTypes == null) {
            this.instanceGroupTypes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceGroupTypesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(instanceGroupTypes.size());
            instanceGroupTypesCopy.addAll(instanceGroupTypes);
            this.instanceGroupTypes = instanceGroupTypesCopy;
        }

        return this;
    }

    /**
     * The type of instance group for which to list the instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceGroupTypes The type of instance group for which to list the instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListInstancesRequest withInstanceGroupTypes(InstanceGroupType... instanceGroupTypes) {
        java.util.ArrayList<String> instanceGroupTypesCopy = new java.util.ArrayList<String>(instanceGroupTypes.length);
        for (InstanceGroupType member : instanceGroupTypes) {
            instanceGroupTypesCopy.add(member.toString());
        }
        if (getInstanceGroupTypes() == null) {
            setInstanceGroupTypes(instanceGroupTypesCopy);
        } else {
            getInstanceGroupTypes().addAll(instanceGroupTypesCopy);
        }
        return this;
    }

    /**
     * The pagination token that indicates the next set of results to
     * retrieve.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @return The pagination token that indicates the next set of results to
     *         retrieve.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * The pagination token that indicates the next set of results to
     * retrieve.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param marker The pagination token that indicates the next set of results to
     *         retrieve.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * The pagination token that indicates the next set of results to
     * retrieve.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param marker The pagination token that indicates the next set of results to
     *         retrieve.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListInstancesRequest withMarker(String marker) {
        this.marker = marker;
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
        if (getClusterId() != null) sb.append("ClusterId: " + getClusterId() + ",");
        if (getInstanceGroupId() != null) sb.append("InstanceGroupId: " + getInstanceGroupId() + ",");
        if (getInstanceGroupTypes() != null) sb.append("InstanceGroupTypes: " + getInstanceGroupTypes() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceGroupId() == null) ? 0 : getInstanceGroupId().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceGroupTypes() == null) ? 0 : getInstanceGroupTypes().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListInstancesRequest == false) return false;
        ListInstancesRequest other = (ListInstancesRequest)obj;
        
        if (other.getClusterId() == null ^ this.getClusterId() == null) return false;
        if (other.getClusterId() != null && other.getClusterId().equals(this.getClusterId()) == false) return false; 
        if (other.getInstanceGroupId() == null ^ this.getInstanceGroupId() == null) return false;
        if (other.getInstanceGroupId() != null && other.getInstanceGroupId().equals(this.getInstanceGroupId()) == false) return false; 
        if (other.getInstanceGroupTypes() == null ^ this.getInstanceGroupTypes() == null) return false;
        if (other.getInstanceGroupTypes() != null && other.getInstanceGroupTypes().equals(this.getInstanceGroupTypes()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    