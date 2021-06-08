/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A container for the bucket-level configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/BucketLevel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BucketLevel implements Serializable, Cloneable {

    /**
     * <p>
     * A container for the bucket-level activity metrics for Amazon S3 Storage Lens
     * </p>
     */
    private ActivityMetrics activityMetrics;
    /**
     * <p>
     * A container for the bucket-level prefix-level metrics for S3 Storage Lens
     * </p>
     */
    private PrefixLevel prefixLevel;

    /**
     * <p>
     * A container for the bucket-level activity metrics for Amazon S3 Storage Lens
     * </p>
     * 
     * @param activityMetrics
     *        A container for the bucket-level activity metrics for Amazon S3 Storage Lens
     */

    public void setActivityMetrics(ActivityMetrics activityMetrics) {
        this.activityMetrics = activityMetrics;
    }

    /**
     * <p>
     * A container for the bucket-level activity metrics for Amazon S3 Storage Lens
     * </p>
     * 
     * @return A container for the bucket-level activity metrics for Amazon S3 Storage Lens
     */

    public ActivityMetrics getActivityMetrics() {
        return this.activityMetrics;
    }

    /**
     * <p>
     * A container for the bucket-level activity metrics for Amazon S3 Storage Lens
     * </p>
     * 
     * @param activityMetrics
     *        A container for the bucket-level activity metrics for Amazon S3 Storage Lens
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketLevel withActivityMetrics(ActivityMetrics activityMetrics) {
        setActivityMetrics(activityMetrics);
        return this;
    }

    /**
     * <p>
     * A container for the bucket-level prefix-level metrics for S3 Storage Lens
     * </p>
     * 
     * @param prefixLevel
     *        A container for the bucket-level prefix-level metrics for S3 Storage Lens
     */

    public void setPrefixLevel(PrefixLevel prefixLevel) {
        this.prefixLevel = prefixLevel;
    }

    /**
     * <p>
     * A container for the bucket-level prefix-level metrics for S3 Storage Lens
     * </p>
     * 
     * @return A container for the bucket-level prefix-level metrics for S3 Storage Lens
     */

    public PrefixLevel getPrefixLevel() {
        return this.prefixLevel;
    }

    /**
     * <p>
     * A container for the bucket-level prefix-level metrics for S3 Storage Lens
     * </p>
     * 
     * @param prefixLevel
     *        A container for the bucket-level prefix-level metrics for S3 Storage Lens
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketLevel withPrefixLevel(PrefixLevel prefixLevel) {
        setPrefixLevel(prefixLevel);
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
        if (getActivityMetrics() != null)
            sb.append("ActivityMetrics: ").append(getActivityMetrics()).append(",");
        if (getPrefixLevel() != null)
            sb.append("PrefixLevel: ").append(getPrefixLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BucketLevel == false)
            return false;
        BucketLevel other = (BucketLevel) obj;
        if (other.getActivityMetrics() == null ^ this.getActivityMetrics() == null)
            return false;
        if (other.getActivityMetrics() != null && other.getActivityMetrics().equals(this.getActivityMetrics()) == false)
            return false;
        if (other.getPrefixLevel() == null ^ this.getPrefixLevel() == null)
            return false;
        if (other.getPrefixLevel() != null && other.getPrefixLevel().equals(this.getPrefixLevel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActivityMetrics() == null) ? 0 : getActivityMetrics().hashCode());
        hashCode = prime * hashCode + ((getPrefixLevel() == null) ? 0 : getPrefixLevel().hashCode());
        return hashCode;
    }

    @Override
    public BucketLevel clone() {
        try {
            return (BucketLevel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
