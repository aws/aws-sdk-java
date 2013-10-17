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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#deleteInstance(DeleteInstanceRequest) DeleteInstance operation}.
 * <p>
 * Deletes a specified instance. You must stop an instance before you can delete it. For more information, see <a
 * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-delete.html"> Deleting Instances </a> .
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#deleteInstance(DeleteInstanceRequest)
 */
public class DeleteInstanceRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The instance ID.
     */
    private String instanceId;

    /**
     * Whether to delete the instance Elastic IP address.
     */
    private Boolean deleteElasticIp;

    /**
     * Whether to delete the instance Amazon EBS volumes.
     */
    private Boolean deleteVolumes;

    /**
     * The instance ID.
     *
     * @return The instance ID.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The instance ID.
     *
     * @param instanceId The instance ID.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The instance ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The instance ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteInstanceRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * Whether to delete the instance Elastic IP address.
     *
     * @return Whether to delete the instance Elastic IP address.
     */
    public Boolean isDeleteElasticIp() {
        return deleteElasticIp;
    }
    
    /**
     * Whether to delete the instance Elastic IP address.
     *
     * @param deleteElasticIp Whether to delete the instance Elastic IP address.
     */
    public void setDeleteElasticIp(Boolean deleteElasticIp) {
        this.deleteElasticIp = deleteElasticIp;
    }
    
    /**
     * Whether to delete the instance Elastic IP address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deleteElasticIp Whether to delete the instance Elastic IP address.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteInstanceRequest withDeleteElasticIp(Boolean deleteElasticIp) {
        this.deleteElasticIp = deleteElasticIp;
        return this;
    }

    /**
     * Whether to delete the instance Elastic IP address.
     *
     * @return Whether to delete the instance Elastic IP address.
     */
    public Boolean getDeleteElasticIp() {
        return deleteElasticIp;
    }

    /**
     * Whether to delete the instance Amazon EBS volumes.
     *
     * @return Whether to delete the instance Amazon EBS volumes.
     */
    public Boolean isDeleteVolumes() {
        return deleteVolumes;
    }
    
    /**
     * Whether to delete the instance Amazon EBS volumes.
     *
     * @param deleteVolumes Whether to delete the instance Amazon EBS volumes.
     */
    public void setDeleteVolumes(Boolean deleteVolumes) {
        this.deleteVolumes = deleteVolumes;
    }
    
    /**
     * Whether to delete the instance Amazon EBS volumes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deleteVolumes Whether to delete the instance Amazon EBS volumes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteInstanceRequest withDeleteVolumes(Boolean deleteVolumes) {
        this.deleteVolumes = deleteVolumes;
        return this;
    }

    /**
     * Whether to delete the instance Amazon EBS volumes.
     *
     * @return Whether to delete the instance Amazon EBS volumes.
     */
    public Boolean getDeleteVolumes() {
        return deleteVolumes;
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
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (isDeleteElasticIp() != null) sb.append("DeleteElasticIp: " + isDeleteElasticIp() + ",");
        if (isDeleteVolumes() != null) sb.append("DeleteVolumes: " + isDeleteVolumes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((isDeleteElasticIp() == null) ? 0 : isDeleteElasticIp().hashCode()); 
        hashCode = prime * hashCode + ((isDeleteVolumes() == null) ? 0 : isDeleteVolumes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteInstanceRequest == false) return false;
        DeleteInstanceRequest other = (DeleteInstanceRequest)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.isDeleteElasticIp() == null ^ this.isDeleteElasticIp() == null) return false;
        if (other.isDeleteElasticIp() != null && other.isDeleteElasticIp().equals(this.isDeleteElasticIp()) == false) return false; 
        if (other.isDeleteVolumes() == null ^ this.isDeleteVolumes() == null) return false;
        if (other.isDeleteVolumes() != null && other.isDeleteVolumes().equals(this.isDeleteVolumes()) == false) return false; 
        return true;
    }
    
}
    