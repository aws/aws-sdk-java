/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

/**
 * <p>
 * The result of describing an EBS snapshot attribute.
 * </p>
 */
public class DescribeSnapshotAttributeResult {

    /**
     * The ID of the snapshot whose attribute is being described.
     */
    private String snapshotId;

    /**
     * The list of permissions describing who can create a volume from the
     * associated EBS snapshot. <p> Only available if the
     * createVolumePermission attribute is requested.
     */
    private java.util.List<CreateVolumePermission> createVolumePermissions;

    /**
     * The ID of the snapshot whose attribute is being described.
     *
     * @return The ID of the snapshot whose attribute is being described.
     */
    public String getSnapshotId() {
        return snapshotId;
    }
    
    /**
     * The ID of the snapshot whose attribute is being described.
     *
     * @param snapshotId The ID of the snapshot whose attribute is being described.
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }
    
    /**
     * The ID of the snapshot whose attribute is being described.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotId The ID of the snapshot whose attribute is being described.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSnapshotAttributeResult withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    
    
    /**
     * The list of permissions describing who can create a volume from the
     * associated EBS snapshot. <p> Only available if the
     * createVolumePermission attribute is requested.
     *
     * @return The list of permissions describing who can create a volume from the
     *         associated EBS snapshot. <p> Only available if the
     *         createVolumePermission attribute is requested.
     */
    public java.util.List<CreateVolumePermission> getCreateVolumePermissions() {
        if (createVolumePermissions == null) {
            createVolumePermissions = new java.util.ArrayList<CreateVolumePermission>();
        }
        return createVolumePermissions;
    }
    
    /**
     * The list of permissions describing who can create a volume from the
     * associated EBS snapshot. <p> Only available if the
     * createVolumePermission attribute is requested.
     *
     * @param createVolumePermissions The list of permissions describing who can create a volume from the
     *         associated EBS snapshot. <p> Only available if the
     *         createVolumePermission attribute is requested.
     */
    public void setCreateVolumePermissions(java.util.Collection<CreateVolumePermission> createVolumePermissions) {
        java.util.List<CreateVolumePermission> createVolumePermissionsCopy = new java.util.ArrayList<CreateVolumePermission>();
        if (createVolumePermissions != null) {
            createVolumePermissionsCopy.addAll(createVolumePermissions);
        }
        this.createVolumePermissions = createVolumePermissionsCopy;
    }
    
    /**
     * The list of permissions describing who can create a volume from the
     * associated EBS snapshot. <p> Only available if the
     * createVolumePermission attribute is requested.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createVolumePermissions The list of permissions describing who can create a volume from the
     *         associated EBS snapshot. <p> Only available if the
     *         createVolumePermission attribute is requested.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSnapshotAttributeResult withCreateVolumePermissions(CreateVolumePermission... createVolumePermissions) {
        for (CreateVolumePermission value : createVolumePermissions) {
            getCreateVolumePermissions().add(value);
        }
        return this;
    }
    
    /**
     * The list of permissions describing who can create a volume from the
     * associated EBS snapshot. <p> Only available if the
     * createVolumePermission attribute is requested.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createVolumePermissions The list of permissions describing who can create a volume from the
     *         associated EBS snapshot. <p> Only available if the
     *         createVolumePermission attribute is requested.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSnapshotAttributeResult withCreateVolumePermissions(java.util.Collection<CreateVolumePermission> createVolumePermissions) {
        java.util.List<CreateVolumePermission> createVolumePermissionsCopy = new java.util.ArrayList<CreateVolumePermission>();
        if (createVolumePermissions != null) {
            createVolumePermissionsCopy.addAll(createVolumePermissions);
        }
        this.createVolumePermissions = createVolumePermissionsCopy;

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
        
        sb.append("SnapshotId: " + snapshotId + ", ");
        sb.append("CreateVolumePermissions: " + createVolumePermissions + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    