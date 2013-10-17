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
 * The result of canceling an Amazon EC2 bundle task.
 * </p>
 */
public class CancelBundleTaskResult implements Serializable {

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
        if (getBundleTask() != null) sb.append("BundleTask: " + getBundleTask() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getBundleTask() == null) ? 0 : getBundleTask().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CancelBundleTaskResult == false) return false;
        CancelBundleTaskResult other = (CancelBundleTaskResult)obj;
        
        if (other.getBundleTask() == null ^ this.getBundleTask() == null) return false;
        if (other.getBundleTask() != null && other.getBundleTask().equals(this.getBundleTask()) == false) return false; 
        return true;
    }
    
}
    