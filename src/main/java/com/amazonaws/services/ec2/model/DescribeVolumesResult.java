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
 * The result of describing your EBS volumes.
 * </p>
 */
public class DescribeVolumesResult {

    /**
     * The list of described EBS volumes.
     */
    private java.util.List<Volume> volumes;

    /**
     * The list of described EBS volumes.
     *
     * @return The list of described EBS volumes.
     */
    public java.util.List<Volume> getVolumes() {
        if (volumes == null) {
            volumes = new java.util.ArrayList<Volume>();
        }
        return volumes;
    }
    
    /**
     * The list of described EBS volumes.
     *
     * @param volumes The list of described EBS volumes.
     */
    public void setVolumes(java.util.Collection<Volume> volumes) {
        java.util.List<Volume> volumesCopy = new java.util.ArrayList<Volume>();
        if (volumes != null) {
            volumesCopy.addAll(volumes);
        }
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
        java.util.List<Volume> volumesCopy = new java.util.ArrayList<Volume>();
        if (volumes != null) {
            volumesCopy.addAll(volumes);
        }
        this.volumes = volumesCopy;

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
        sb.append("Volumes: " + volumes + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    