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
 * <p>
 * A JSON object containing the following fields:
 * </p>
 */
public class DescribeCachediSCSIVolumesResult implements Serializable {

    /**
     * An array of objects where each object contains metadata about one
     * cached volume.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<CachediSCSIVolume> cachediSCSIVolumes;

    /**
     * An array of objects where each object contains metadata about one
     * cached volume.
     *
     * @return An array of objects where each object contains metadata about one
     *         cached volume.
     */
    public java.util.List<CachediSCSIVolume> getCachediSCSIVolumes() {
        if (cachediSCSIVolumes == null) {
              cachediSCSIVolumes = new com.amazonaws.internal.ListWithAutoConstructFlag<CachediSCSIVolume>();
              cachediSCSIVolumes.setAutoConstruct(true);
        }
        return cachediSCSIVolumes;
    }
    
    /**
     * An array of objects where each object contains metadata about one
     * cached volume.
     *
     * @param cachediSCSIVolumes An array of objects where each object contains metadata about one
     *         cached volume.
     */
    public void setCachediSCSIVolumes(java.util.Collection<CachediSCSIVolume> cachediSCSIVolumes) {
        if (cachediSCSIVolumes == null) {
            this.cachediSCSIVolumes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<CachediSCSIVolume> cachediSCSIVolumesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CachediSCSIVolume>(cachediSCSIVolumes.size());
        cachediSCSIVolumesCopy.addAll(cachediSCSIVolumes);
        this.cachediSCSIVolumes = cachediSCSIVolumesCopy;
    }
    
    /**
     * An array of objects where each object contains metadata about one
     * cached volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cachediSCSIVolumes An array of objects where each object contains metadata about one
     *         cached volume.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCachediSCSIVolumesResult withCachediSCSIVolumes(CachediSCSIVolume... cachediSCSIVolumes) {
        if (getCachediSCSIVolumes() == null) setCachediSCSIVolumes(new java.util.ArrayList<CachediSCSIVolume>(cachediSCSIVolumes.length));
        for (CachediSCSIVolume value : cachediSCSIVolumes) {
            getCachediSCSIVolumes().add(value);
        }
        return this;
    }
    
    /**
     * An array of objects where each object contains metadata about one
     * cached volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cachediSCSIVolumes An array of objects where each object contains metadata about one
     *         cached volume.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCachediSCSIVolumesResult withCachediSCSIVolumes(java.util.Collection<CachediSCSIVolume> cachediSCSIVolumes) {
        if (cachediSCSIVolumes == null) {
            this.cachediSCSIVolumes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<CachediSCSIVolume> cachediSCSIVolumesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CachediSCSIVolume>(cachediSCSIVolumes.size());
            cachediSCSIVolumesCopy.addAll(cachediSCSIVolumes);
            this.cachediSCSIVolumes = cachediSCSIVolumesCopy;
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
        if (getCachediSCSIVolumes() != null) sb.append("CachediSCSIVolumes: " + getCachediSCSIVolumes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCachediSCSIVolumes() == null) ? 0 : getCachediSCSIVolumes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeCachediSCSIVolumesResult == false) return false;
        DescribeCachediSCSIVolumesResult other = (DescribeCachediSCSIVolumesResult)obj;
        
        if (other.getCachediSCSIVolumes() == null ^ this.getCachediSCSIVolumes() == null) return false;
        if (other.getCachediSCSIVolumes() != null && other.getCachediSCSIVolumes().equals(this.getCachediSCSIVolumes()) == false) return false; 
        return true;
    }
    
}
    