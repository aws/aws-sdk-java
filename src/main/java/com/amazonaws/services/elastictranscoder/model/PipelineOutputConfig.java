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
package com.amazonaws.services.elastictranscoder.model;
import java.io.Serializable;

/**
 * 
 */
public class PipelineOutputConfig  implements Serializable  {

    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(\w|\.|-){1,255}$<br/>
     */
    private String bucket;

    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^ReducedRedundancy$)|(^Standard$)<br/>
     */
    private String storageClass;

    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Permission> permissions;

    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(\w|\.|-){1,255}$<br/>
     *
     * @return 
     */
    public String getBucket() {
        return bucket;
    }
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(\w|\.|-){1,255}$<br/>
     *
     * @param bucket 
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(\w|\.|-){1,255}$<br/>
     *
     * @param bucket 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PipelineOutputConfig withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^ReducedRedundancy$)|(^Standard$)<br/>
     *
     * @return 
     */
    public String getStorageClass() {
        return storageClass;
    }
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^ReducedRedundancy$)|(^Standard$)<br/>
     *
     * @param storageClass 
     */
    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^ReducedRedundancy$)|(^Standard$)<br/>
     *
     * @param storageClass 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PipelineOutputConfig withStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }
    
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @return 
     */
    public java.util.List<Permission> getPermissions() {
        
        if (permissions == null) {
              permissions = new com.amazonaws.internal.ListWithAutoConstructFlag<Permission>();
              permissions.setAutoConstruct(true);
        }
        return permissions;
    }
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param permissions 
     */
    public void setPermissions(java.util.Collection<Permission> permissions) {
        if (permissions == null) {
            this.permissions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Permission> permissionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Permission>(permissions.size());
        permissionsCopy.addAll(permissions);
        this.permissions = permissionsCopy;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param permissions 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PipelineOutputConfig withPermissions(Permission... permissions) {
        if (getPermissions() == null) setPermissions(new java.util.ArrayList<Permission>(permissions.length));
        for (Permission value : permissions) {
            getPermissions().add(value);
        }
        return this;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param permissions 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PipelineOutputConfig withPermissions(java.util.Collection<Permission> permissions) {
        if (permissions == null) {
            this.permissions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Permission> permissionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Permission>(permissions.size());
            permissionsCopy.addAll(permissions);
            this.permissions = permissionsCopy;
        }

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
        if (getBucket() != null) sb.append("Bucket: " + getBucket() + ",");
        if (getStorageClass() != null) sb.append("StorageClass: " + getStorageClass() + ",");
        if (getPermissions() != null) sb.append("Permissions: " + getPermissions() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode()); 
        hashCode = prime * hashCode + ((getStorageClass() == null) ? 0 : getStorageClass().hashCode()); 
        hashCode = prime * hashCode + ((getPermissions() == null) ? 0 : getPermissions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PipelineOutputConfig == false) return false;
        PipelineOutputConfig other = (PipelineOutputConfig)obj;
        
        if (other.getBucket() == null ^ this.getBucket() == null) return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false) return false; 
        if (other.getStorageClass() == null ^ this.getStorageClass() == null) return false;
        if (other.getStorageClass() != null && other.getStorageClass().equals(this.getStorageClass()) == false) return false; 
        if (other.getPermissions() == null ^ this.getPermissions() == null) return false;
        if (other.getPermissions() != null && other.getPermissions().equals(this.getPermissions()) == false) return false; 
        return true;
    }
    
}
    