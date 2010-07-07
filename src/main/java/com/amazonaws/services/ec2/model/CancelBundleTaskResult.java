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
 * The result of canceling an Amazon EC2 bundle task.
 * </p>
 */
public class CancelBundleTaskResult {

    /**
     * The canceled bundle task.
     */
    private BundleTask bundleTask;

    /**
     * The canceled bundle task.
     *
     * @return The canceled bundle task.
     */
    public BundleTask getBundleTask() {
        return bundleTask;
    }
    
    /**
     * The canceled bundle task.
     *
     * @param bundleTask The canceled bundle task.
     */
    public void setBundleTask(BundleTask bundleTask) {
        this.bundleTask = bundleTask;
    }
    
    /**
     * The canceled bundle task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bundleTask The canceled bundle task.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CancelBundleTaskResult withBundleTask(BundleTask bundleTask) {
        this.bundleTask = bundleTask;
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
        sb.append("BundleTask: " + bundleTask + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    