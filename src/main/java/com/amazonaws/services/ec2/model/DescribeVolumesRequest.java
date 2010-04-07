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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to describe the Amazon EBS volumes that you own. If you do
 * not specify any volume IDs, all the volumes you own will be described.
 * </p>
 */
public class DescribeVolumesRequest extends AmazonWebServiceRequest {

    /**
     * The optional list of EBS volumes to describe.
     */
    private java.util.List<String> volumeIds;

    /**
     * The optional list of EBS volumes to describe.
     *
     * @return The optional list of EBS volumes to describe.
     */
    public java.util.List<String> getVolumeIds() {
        if (volumeIds == null) {
            volumeIds = new java.util.ArrayList<String>();
        }
        return volumeIds;
    }
    
    /**
     * The optional list of EBS volumes to describe.
     *
     * @param volumeIds The optional list of EBS volumes to describe.
     */
    public void setVolumeIds(java.util.Collection<String> volumeIds) {
        java.util.List<String> volumeIdsCopy = new java.util.ArrayList<String>();
        if (volumeIds != null) {
            volumeIdsCopy.addAll(volumeIds);
        }
        this.volumeIds = volumeIdsCopy;
    }
    
    /**
     * The optional list of EBS volumes to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeIds The optional list of EBS volumes to describe.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeVolumesRequest withVolumeIds(String... volumeIds) {
        for (String value : volumeIds) {
            getVolumeIds().add(value);
        }
        return this;
    }
    
    /**
     * The optional list of EBS volumes to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeIds The optional list of EBS volumes to describe.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeVolumesRequest withVolumeIds(java.util.Collection<String> volumeIds) {
        java.util.List<String> volumeIdsCopy = new java.util.ArrayList<String>();
        if (volumeIds != null) {
            volumeIdsCopy.addAll(volumeIds);
        }
        this.volumeIds = volumeIdsCopy;

        return this;
    }
    
}
    