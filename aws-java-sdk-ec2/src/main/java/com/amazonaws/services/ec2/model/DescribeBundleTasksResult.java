/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBundleTasksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the bundle tasks.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<BundleTask> bundleTasks;

    /**
     * <p>
     * Information about the bundle tasks.
     * </p>
     * 
     * @return Information about the bundle tasks.
     */

    public java.util.List<BundleTask> getBundleTasks() {
        if (bundleTasks == null) {
            bundleTasks = new com.amazonaws.internal.SdkInternalList<BundleTask>();
        }
        return bundleTasks;
    }

    /**
     * <p>
     * Information about the bundle tasks.
     * </p>
     * 
     * @param bundleTasks
     *        Information about the bundle tasks.
     */

    public void setBundleTasks(java.util.Collection<BundleTask> bundleTasks) {
        if (bundleTasks == null) {
            this.bundleTasks = null;
            return;
        }

        this.bundleTasks = new com.amazonaws.internal.SdkInternalList<BundleTask>(bundleTasks);
    }

    /**
     * <p>
     * Information about the bundle tasks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBundleTasks(java.util.Collection)} or {@link #withBundleTasks(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param bundleTasks
     *        Information about the bundle tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBundleTasksResult withBundleTasks(BundleTask... bundleTasks) {
        if (this.bundleTasks == null) {
            setBundleTasks(new com.amazonaws.internal.SdkInternalList<BundleTask>(bundleTasks.length));
        }
        for (BundleTask ele : bundleTasks) {
            this.bundleTasks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the bundle tasks.
     * </p>
     * 
     * @param bundleTasks
     *        Information about the bundle tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBundleTasksResult withBundleTasks(java.util.Collection<BundleTask> bundleTasks) {
        setBundleTasks(bundleTasks);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBundleTasks() != null)
            sb.append("BundleTasks: ").append(getBundleTasks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBundleTasksResult == false)
            return false;
        DescribeBundleTasksResult other = (DescribeBundleTasksResult) obj;
        if (other.getBundleTasks() == null ^ this.getBundleTasks() == null)
            return false;
        if (other.getBundleTasks() != null && other.getBundleTasks().equals(this.getBundleTasks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBundleTasks() == null) ? 0 : getBundleTasks().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBundleTasksResult clone() {
        try {
            return (DescribeBundleTasksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
