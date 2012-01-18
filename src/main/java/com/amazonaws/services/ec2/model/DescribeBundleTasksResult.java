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
package com.amazonaws.services.ec2.model;

/**
 * <p>
 * The result of describing the bundle tasks for the user's account.
 * </p>
 */
public class DescribeBundleTasksResult {

    /**
     * The list of described bundle tasks.
     */
    private java.util.List<BundleTask> bundleTasks;

    /**
     * The list of described bundle tasks.
     *
     * @return The list of described bundle tasks.
     */
    public java.util.List<BundleTask> getBundleTasks() {
        
        if (bundleTasks == null) {
            bundleTasks = new java.util.ArrayList<BundleTask>();
        }
        return bundleTasks;
    }
    
    /**
     * The list of described bundle tasks.
     *
     * @param bundleTasks The list of described bundle tasks.
     */
    public void setBundleTasks(java.util.Collection<BundleTask> bundleTasks) {
        if (bundleTasks == null) {
            this.bundleTasks = null;
            return;
        }

        java.util.List<BundleTask> bundleTasksCopy = new java.util.ArrayList<BundleTask>(bundleTasks.size());
        bundleTasksCopy.addAll(bundleTasks);
        this.bundleTasks = bundleTasksCopy;
    }
    
    /**
     * The list of described bundle tasks.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bundleTasks The list of described bundle tasks.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeBundleTasksResult withBundleTasks(BundleTask... bundleTasks) {
        if (getBundleTasks() == null) setBundleTasks(new java.util.ArrayList<BundleTask>(bundleTasks.length));
        for (BundleTask value : bundleTasks) {
            getBundleTasks().add(value);
        }
        return this;
    }
    
    /**
     * The list of described bundle tasks.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bundleTasks The list of described bundle tasks.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeBundleTasksResult withBundleTasks(java.util.Collection<BundleTask> bundleTasks) {
        if (bundleTasks == null) {
            this.bundleTasks = null;
        } else {
            java.util.List<BundleTask> bundleTasksCopy = new java.util.ArrayList<BundleTask>(bundleTasks.size());
            bundleTasksCopy.addAll(bundleTasks);
            this.bundleTasks = bundleTasksCopy;
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
        if (bundleTasks != null) sb.append("BundleTasks: " + bundleTasks + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getBundleTasks() == null) ? 0 : getBundleTasks().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeBundleTasksResult == false) return false;
        DescribeBundleTasksResult other = (DescribeBundleTasksResult)obj;
        
        if (other.getBundleTasks() == null ^ this.getBundleTasks() == null) return false;
        if (other.getBundleTasks() != null && other.getBundleTasks().equals(this.getBundleTasks()) == false) return false; 
        return true;
    }
    
}
    