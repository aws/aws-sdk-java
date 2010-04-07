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
 * Result of attaching an Amazon EBS volume to a running instance.
 * </p>
 */
public class AttachVolumeResult {

    private VolumeAttachment attachment;

    /**
     * Returns the value of the Attachment property for this object.
     *
     * @return The value of the Attachment property for this object.
     */
    public VolumeAttachment getAttachment() {
        return attachment;
    }
    
    /**
     * Sets the value of the Attachment property for this object.
     *
     * @param attachment The new value for the Attachment property for this object.
     */
    public void setAttachment(VolumeAttachment attachment) {
        this.attachment = attachment;
    }
    
    /**
     * Sets the value of the Attachment property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attachment The new value for the Attachment property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AttachVolumeResult withAttachment(VolumeAttachment attachment) {
        this.attachment = attachment;
        return this;
    }
    
    
}
    