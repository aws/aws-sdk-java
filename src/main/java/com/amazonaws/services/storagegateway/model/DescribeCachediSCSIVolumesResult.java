/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * A JSON object containing the following fields:
 * </p>
 * 
 * <ul>
 * <li> DescribeCachediSCSIVolumesOutput$CachediSCSIVolumes </li>
 * 
 * </ul>
 */
public class DescribeCachediSCSIVolumesResult {

    /**
     * An array of <a>CachediSCSIVolume</a> objects where each object
     * contains metadata about one cached volume.
     */
    private java.util.List<CachediSCSIVolume> cachediSCSIVolumes;

    /**
     * An array of <a>CachediSCSIVolume</a> objects where each object
     * contains metadata about one cached volume.
     *
     * @return An array of <a>CachediSCSIVolume</a> objects where each object
     *         contains metadata about one cached volume.
     */
    public java.util.List<CachediSCSIVolume> getCachediSCSIVolumes() {
        
        if (cachediSCSIVolumes == null) {
            cachediSCSIVolumes = new java.util.ArrayList<CachediSCSIVolume>();
        }
        return cachediSCSIVolumes;
    }
    
    /**
     * An array of <a>CachediSCSIVolume</a> objects where each object
     * contains metadata about one cached volume.
     *
     * @param cachediSCSIVolumes An array of <a>CachediSCSIVolume</a> objects where each object
     *         contains metadata about one cached volume.
     */
    public void setCachediSCSIVolumes(java.util.Collection<CachediSCSIVolume> cachediSCSIVolumes) {
        if (cachediSCSIVolumes == null) {
            this.cachediSCSIVolumes = null;
            return;
        }

        java.util.List<CachediSCSIVolume> cachediSCSIVolumesCopy = new java.util.ArrayList<CachediSCSIVolume>(cachediSCSIVolumes.size());
        cachediSCSIVolumesCopy.addAll(cachediSCSIVolumes);
        this.cachediSCSIVolumes = cachediSCSIVolumesCopy;
    }
    
    /**
     * An array of <a>CachediSCSIVolume</a> objects where each object
     * contains metadata about one cached volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cachediSCSIVolumes An array of <a>CachediSCSIVolume</a> objects where each object
     *         contains metadata about one cached volume.
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
     * An array of <a>CachediSCSIVolume</a> objects where each object
     * contains metadata about one cached volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cachediSCSIVolumes An array of <a>CachediSCSIVolume</a> objects where each object
     *         contains metadata about one cached volume.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeCachediSCSIVolumesResult withCachediSCSIVolumes(java.util.Collection<CachediSCSIVolume> cachediSCSIVolumes) {
        if (cachediSCSIVolumes == null) {
            this.cachediSCSIVolumes = null;
        } else {
            java.util.List<CachediSCSIVolume> cachediSCSIVolumesCopy = new java.util.ArrayList<CachediSCSIVolume>(cachediSCSIVolumes.size());
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
        if (cachediSCSIVolumes != null) sb.append("CachediSCSIVolumes: " + cachediSCSIVolumes + ", ");
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
    