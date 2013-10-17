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
 * The result of describing your EBS volumes.
 * </p>
 */
public class DescribeVolumesResult implements Serializable {

    /**
     * The list of described EBS volumes.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Volume> volumes;

    /**
     * The list of described EBS volumes.
     *
     * @return The list of described EBS volumes.
     */
    public java.util.List<Volume> getVolumes() {
        if (volumes == null) {
              volumes = new com.amazonaws.internal.ListWithAutoConstructFlag<Volume>();
              volumes.setAutoConstruct(true);
        }
        return volumes;
    }
    
    /**
     * The list of described EBS volumes.
     *
     * @param volumes The list of described EBS volumes.
     */
    public void setVolumes(java.util.Collection<Volume> volumes) {
        if (volumes == null) {
            this.volumes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Volume> volumesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Volume>(volumes.size());
        volumesCopy.addAll(volumes);
        this.volumes = volumesCopy;
    }
    
    /**
     * The list of described EBS volumes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumes The list of described EBS volumes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeVolumesResult withVolumes(Volume... volumes) {
        if (getVolumes() == null) setVolumes(new java.util.ArrayList<Volume>(volumes.length));
        for (Volume value : volumes) {
            getVolumes().add(value);
        }
        return this;
    }
    
    /**
     * The list of described EBS volumes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumes The list of described EBS volumes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeVolumesResult withVolumes(java.util.Collection<Volume> volumes) {
        if (volumes == null) {
            this.volumes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Volume> volumesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Volume>(volumes.size());
            volumesCopy.addAll(volumes);
            this.volumes = volumesCopy;
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
        if (getVolumes() != null) sb.append("Volumes: " + getVolumes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVolumes() == null) ? 0 : getVolumes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeVolumesResult == false) return false;
        DescribeVolumesResult other = (DescribeVolumesResult)obj;
        
        if (other.getVolumes() == null ^ this.getVolumes() == null) return false;
        if (other.getVolumes() != null && other.getVolumes().equals(this.getVolumes()) == false) return false; 
        return true;
    }
    
}
    