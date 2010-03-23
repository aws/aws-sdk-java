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
 * Bundle Instance Result
 */
public class BundleInstanceResult {
        
    private BundleTask bundleTask;

    /**
     * Returns the value of the BundleTask property for this object.
     *
     * @return The value of the BundleTask property for this object.
     */
    public BundleTask getBundleTask() {
        return bundleTask;
    }
    
    /**
     * Sets the value of the BundleTask property for this object.
     *
     * @param bundleTask The new value for the BundleTask property for this object.
     */
    public void setBundleTask(BundleTask bundleTask) {
        this.bundleTask = bundleTask;
    }
    
    /**
     * Sets the value of the BundleTask property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bundleTask The new value for the BundleTask property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public BundleInstanceResult withBundleTask(BundleTask bundleTask) {
        this.bundleTask = bundleTask;
        return this;
    }
    
    
}
    