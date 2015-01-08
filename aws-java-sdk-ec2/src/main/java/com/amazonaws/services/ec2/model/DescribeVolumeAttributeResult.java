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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeVolumeAttributeResult implements Serializable {

    /**
     * The ID of the volume.
     */
    private String volumeId;

    /**
     * The state of <code>autoEnableIO</code> attribute.
     */
    private Boolean autoEnableIO;

    /**
     * A list of product codes.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ProductCode> productCodes;

    /**
     * The ID of the volume.
     *
     * @return The ID of the volume.
     */
    public String getVolumeId() {
        return volumeId;
    }
    
    /**
     * The ID of the volume.
     *
     * @param volumeId The ID of the volume.
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }
    
    /**
     * The ID of the volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeId The ID of the volume.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVolumeAttributeResult withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * The state of <code>autoEnableIO</code> attribute.
     *
     * @return The state of <code>autoEnableIO</code> attribute.
     */
    public Boolean isAutoEnableIO() {
        return autoEnableIO;
    }
    
    /**
     * The state of <code>autoEnableIO</code> attribute.
     *
     * @param autoEnableIO The state of <code>autoEnableIO</code> attribute.
     */
    public void setAutoEnableIO(Boolean autoEnableIO) {
        this.autoEnableIO = autoEnableIO;
    }
    
    /**
     * The state of <code>autoEnableIO</code> attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoEnableIO The state of <code>autoEnableIO</code> attribute.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVolumeAttributeResult withAutoEnableIO(Boolean autoEnableIO) {
        this.autoEnableIO = autoEnableIO;
        return this;
    }

    /**
     * The state of <code>autoEnableIO</code> attribute.
     *
     * @return The state of <code>autoEnableIO</code> attribute.
     */
    public Boolean getAutoEnableIO() {
        return autoEnableIO;
    }

    /**
     * A list of product codes.
     *
     * @return A list of product codes.
     */
    public java.util.List<ProductCode> getProductCodes() {
        if (productCodes == null) {
              productCodes = new com.amazonaws.internal.ListWithAutoConstructFlag<ProductCode>();
              productCodes.setAutoConstruct(true);
        }
        return productCodes;
    }
    
    /**
     * A list of product codes.
     *
     * @param productCodes A list of product codes.
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
     * A list of product codes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productCodes A list of product codes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVolumeAttributeResult withProductCodes(ProductCode... productCodes) {
        if (getProductCodes() == null) setProductCodes(new java.util.ArrayList<ProductCode>(productCodes.length));
        for (ProductCode value : productCodes) {
            getProductCodes().add(value);
        }
        return this;
    }
    
    /**
     * A list of product codes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productCodes A list of product codes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVolumeAttributeResult withProductCodes(java.util.Collection<ProductCode> productCodes) {
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
        if (getVolumeId() != null) sb.append("VolumeId: " + getVolumeId() + ",");
        if (isAutoEnableIO() != null) sb.append("AutoEnableIO: " + isAutoEnableIO() + ",");
        if (getProductCodes() != null) sb.append("ProductCodes: " + getProductCodes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode()); 
        hashCode = prime * hashCode + ((isAutoEnableIO() == null) ? 0 : isAutoEnableIO().hashCode()); 
        hashCode = prime * hashCode + ((getProductCodes() == null) ? 0 : getProductCodes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeVolumeAttributeResult == false) return false;
        DescribeVolumeAttributeResult other = (DescribeVolumeAttributeResult)obj;
        
        if (other.getVolumeId() == null ^ this.getVolumeId() == null) return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false) return false; 
        if (other.isAutoEnableIO() == null ^ this.isAutoEnableIO() == null) return false;
        if (other.isAutoEnableIO() != null && other.isAutoEnableIO().equals(this.isAutoEnableIO()) == false) return false; 
        if (other.getProductCodes() == null ^ this.getProductCodes() == null) return false;
        if (other.getProductCodes() != null && other.getProductCodes().equals(this.getProductCodes()) == false) return false; 
        return true;
    }
    
}
    