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
 * A request to cancel an Amazon EC2 bundle task.
 * </p>
 */
public class CancelBundleTaskRequest extends AmazonWebServiceRequest {
        
    /**
     * The ID of the bundle task to cancel.
     */
    private String bundleId;

    /**
     * The ID of the bundle task to cancel.
     *
     * @return The ID of the bundle task to cancel.
     */
    public String getBundleId() {
        return bundleId;
    }
    
    /**
     * The ID of the bundle task to cancel.
     *
     * @param bundleId The ID of the bundle task to cancel.
     */
    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }
    
    /**
     * The ID of the bundle task to cancel.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bundleId The ID of the bundle task to cancel.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CancelBundleTaskRequest withBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }
    
    
}
    