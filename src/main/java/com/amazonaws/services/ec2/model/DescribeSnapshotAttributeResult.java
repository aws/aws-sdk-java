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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;


/**
 * <p>
 * The result of describing an EBS snapshot attribute.
 * </p>
 */
public class DescribeSnapshotAttributeResult implements Serializable {

    /**
     * The ID of the snapshot whose attribute is being described.
     */
    private String snapshotId;

    /**
     * The list of permissions describing who can create a volume from the
     * associated EBS snapshot. <p> Only available if the
     * createVolumePermission attribute is requested.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<CreateVolumePermission> createVolumePermissions;

    private com.amazonaws.internal.ListWithAutoConstructFlag<ProductCode> productCodes;

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
              createVolumePermissions = new com.amazonaws.internal.ListWithAutoConstructFlag<CreateVolumePermission>();
              createVolumePermissions.setAutoConstruct(true);
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
        if (createVolumePermissions == null) {
            this.createVolumePermissions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<CreateVolumePermission> createVolumePermissionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CreateVolumePermission>(createVolumePermissions.size());
        createVolumePermissionsCopy.addAll(createVolumePermissions);
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
        if (getCreateVolumePermissions() == null) setCreateVolumePermissions(new java.util.ArrayList<CreateVolumePermission>(createVolumePermissions.length));
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
        if (createVolumePermissions == null) {
            this.createVolumePermissions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<CreateVolumePermission> createVolumePermissionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CreateVolumePermission>(createVolumePermissions.size());
            createVolumePermissionsCopy.addAll(createVolumePermissions);
            this.createVolumePermissions = createVolumePermissionsCopy;
        }

        return this;
    }

    /**
     * Returns the value of the ProductCodes property for this object.
     *
     * @return The value of the ProductCodes property for this object.
     */
    public java.util.List<ProductCode> getProductCodes() {
        if (productCodes == null) {
              productCodes = new com.amazonaws.internal.ListWithAutoConstructFlag<ProductCode>();
              productCodes.setAutoConstruct(true);
        }
        return productCodes;
    }
    
    /**
     * Sets the value of the ProductCodes property for this object.
     *
     * @param productCodes The new value for the ProductCodes property for this object.
     */
    public void setProductCodes(java.util.Collection<ProductCode> productCodes) {
        if (productCodes == null) {
            this.productCodes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ProductCode> productCodesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ProductCode>(productCodes.size());
        productCodesCopy.addAll(productCodes);
        this.productCodes = productCodesCopy;
    }
    
    /**
     * Sets the value of the ProductCodes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productCodes The new value for the ProductCodes property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSnapshotAttributeResult withProductCodes(ProductCode... productCodes) {
        if (getProductCodes() == null) setProductCodes(new java.util.ArrayList<ProductCode>(productCodes.length));
        for (ProductCode value : productCodes) {
            getProductCodes().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the ProductCodes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productCodes The new value for the ProductCodes property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSnapshotAttributeResult withProductCodes(java.util.Collection<ProductCode> productCodes) {
        if (productCodes == null) {
            this.productCodes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ProductCode> productCodesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ProductCode>(productCodes.size());
            productCodesCopy.addAll(productCodes);
            this.productCodes = productCodesCopy;
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
        if (getSnapshotId() != null) sb.append("SnapshotId: " + getSnapshotId() + ",");
        if (getCreateVolumePermissions() != null) sb.append("CreateVolumePermissions: " + getCreateVolumePermissions() + ",");
        if (getProductCodes() != null) sb.append("ProductCodes: " + getProductCodes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode()); 
        hashCode = prime * hashCode + ((getCreateVolumePermissions() == null) ? 0 : getCreateVolumePermissions().hashCode()); 
        hashCode = prime * hashCode + ((getProductCodes() == null) ? 0 : getProductCodes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeSnapshotAttributeResult == false) return false;
        DescribeSnapshotAttributeResult other = (DescribeSnapshotAttributeResult)obj;
        
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null) return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false) return false; 
        if (other.getCreateVolumePermissions() == null ^ this.getCreateVolumePermissions() == null) return false;
        if (other.getCreateVolumePermissions() != null && other.getCreateVolumePermissions().equals(this.getCreateVolumePermissions()) == false) return false; 
        if (other.getProductCodes() == null ^ this.getProductCodes() == null) return false;
        if (other.getProductCodes() != null && other.getProductCodes().equals(this.getProductCodes()) == false) return false; 
        return true;
    }
    
}
    