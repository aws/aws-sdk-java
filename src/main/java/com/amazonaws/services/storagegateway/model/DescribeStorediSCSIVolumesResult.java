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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;


/**
 * Describe Storedi S C S I Volumes Result
 */
public class DescribeStorediSCSIVolumesResult implements Serializable {

    private com.amazonaws.internal.ListWithAutoConstructFlag<StorediSCSIVolume> storediSCSIVolumes;

    /**
     * Returns the value of the StorediSCSIVolumes property for this object.
     *
     * @return The value of the StorediSCSIVolumes property for this object.
     */
    public java.util.List<StorediSCSIVolume> getStorediSCSIVolumes() {
        if (storediSCSIVolumes == null) {
              storediSCSIVolumes = new com.amazonaws.internal.ListWithAutoConstructFlag<StorediSCSIVolume>();
              storediSCSIVolumes.setAutoConstruct(true);
        }
        return storediSCSIVolumes;
    }
    
    /**
     * Sets the value of the StorediSCSIVolumes property for this object.
     *
     * @param storediSCSIVolumes The new value for the StorediSCSIVolumes property for this object.
     */
    public void setStorediSCSIVolumes(java.util.Collection<StorediSCSIVolume> storediSCSIVolumes) {
        if (storediSCSIVolumes == null) {
            this.storediSCSIVolumes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<StorediSCSIVolume> storediSCSIVolumesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<StorediSCSIVolume>(storediSCSIVolumes.size());
        storediSCSIVolumesCopy.addAll(storediSCSIVolumes);
        this.storediSCSIVolumes = storediSCSIVolumesCopy;
    }
    
    /**
     * Sets the value of the StorediSCSIVolumes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param storediSCSIVolumes The new value for the StorediSCSIVolumes property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeStorediSCSIVolumesResult withStorediSCSIVolumes(StorediSCSIVolume... storediSCSIVolumes) {
        if (getStorediSCSIVolumes() == null) setStorediSCSIVolumes(new java.util.ArrayList<StorediSCSIVolume>(storediSCSIVolumes.length));
        for (StorediSCSIVolume value : storediSCSIVolumes) {
            getStorediSCSIVolumes().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the StorediSCSIVolumes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param storediSCSIVolumes The new value for the StorediSCSIVolumes property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeStorediSCSIVolumesResult withStorediSCSIVolumes(java.util.Collection<StorediSCSIVolume> storediSCSIVolumes) {
        if (storediSCSIVolumes == null) {
            this.storediSCSIVolumes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<StorediSCSIVolume> storediSCSIVolumesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<StorediSCSIVolume>(storediSCSIVolumes.size());
            storediSCSIVolumesCopy.addAll(storediSCSIVolumes);
            this.storediSCSIVolumes = storediSCSIVolumesCopy;
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
        if (getStorediSCSIVolumes() != null) sb.append("StorediSCSIVolumes: " + getStorediSCSIVolumes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStorediSCSIVolumes() == null) ? 0 : getStorediSCSIVolumes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeStorediSCSIVolumesResult == false) return false;
        DescribeStorediSCSIVolumesResult other = (DescribeStorediSCSIVolumesResult)obj;
        
        if (other.getStorediSCSIVolumes() == null ^ this.getStorediSCSIVolumes() == null) return false;
        if (other.getStorediSCSIVolumes() != null && other.getStorediSCSIVolumes().equals(this.getStorediSCSIVolumes()) == false) return false; 
        return true;
    }
    
}
    