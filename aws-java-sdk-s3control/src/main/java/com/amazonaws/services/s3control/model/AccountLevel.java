/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A container for the account-level Amazon S3 Storage Lens configuration.
 * </p>
 * <p>
 * For more information about S3 Storage Lens, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens.html">Assessing your storage activity and
 * usage with S3 Storage Lens</a> in the <i>Amazon S3 User Guide</i>. For a complete list of S3 Storage Lens metrics,
 * see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_metrics_glossary.html">S3 Storage
 * Lens metrics glossary</a> in the <i>Amazon S3 User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/AccountLevel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountLevel implements Serializable, Cloneable {

    /**
     * <p>
     * A container for S3 Storage Lens activity metrics.
     * </p>
     */
    private ActivityMetrics activityMetrics;
    /**
     * <p>
     * A container for the S3 Storage Lens bucket-level configuration.
     * </p>
     */
    private BucketLevel bucketLevel;
    /**
     * <p>
     * A container for S3 Storage Lens advanced cost-optimization metrics.
     * </p>
     */
    private AdvancedCostOptimizationMetrics advancedCostOptimizationMetrics;
    /**
     * <p>
     * A container for S3 Storage Lens advanced data-protection metrics.
     * </p>
     */
    private AdvancedDataProtectionMetrics advancedDataProtectionMetrics;
    /**
     * <p>
     * A container for detailed status code metrics.
     * </p>
     */
    private DetailedStatusCodesMetrics detailedStatusCodesMetrics;

    /**
     * <p>
     * A container for S3 Storage Lens activity metrics.
     * </p>
     * 
     * @param activityMetrics
     *        A container for S3 Storage Lens activity metrics.
     */

    public void setActivityMetrics(ActivityMetrics activityMetrics) {
        this.activityMetrics = activityMetrics;
    }

    /**
     * <p>
     * A container for S3 Storage Lens activity metrics.
     * </p>
     * 
     * @return A container for S3 Storage Lens activity metrics.
     */

    public ActivityMetrics getActivityMetrics() {
        return this.activityMetrics;
    }

    /**
     * <p>
     * A container for S3 Storage Lens activity metrics.
     * </p>
     * 
     * @param activityMetrics
     *        A container for S3 Storage Lens activity metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountLevel withActivityMetrics(ActivityMetrics activityMetrics) {
        setActivityMetrics(activityMetrics);
        return this;
    }

    /**
     * <p>
     * A container for the S3 Storage Lens bucket-level configuration.
     * </p>
     * 
     * @param bucketLevel
     *        A container for the S3 Storage Lens bucket-level configuration.
     */

    public void setBucketLevel(BucketLevel bucketLevel) {
        this.bucketLevel = bucketLevel;
    }

    /**
     * <p>
     * A container for the S3 Storage Lens bucket-level configuration.
     * </p>
     * 
     * @return A container for the S3 Storage Lens bucket-level configuration.
     */

    public BucketLevel getBucketLevel() {
        return this.bucketLevel;
    }

    /**
     * <p>
     * A container for the S3 Storage Lens bucket-level configuration.
     * </p>
     * 
     * @param bucketLevel
     *        A container for the S3 Storage Lens bucket-level configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountLevel withBucketLevel(BucketLevel bucketLevel) {
        setBucketLevel(bucketLevel);
        return this;
    }

    /**
     * <p>
     * A container for S3 Storage Lens advanced cost-optimization metrics.
     * </p>
     * 
     * @param advancedCostOptimizationMetrics
     *        A container for S3 Storage Lens advanced cost-optimization metrics.
     */

    public void setAdvancedCostOptimizationMetrics(AdvancedCostOptimizationMetrics advancedCostOptimizationMetrics) {
        this.advancedCostOptimizationMetrics = advancedCostOptimizationMetrics;
    }

    /**
     * <p>
     * A container for S3 Storage Lens advanced cost-optimization metrics.
     * </p>
     * 
     * @return A container for S3 Storage Lens advanced cost-optimization metrics.
     */

    public AdvancedCostOptimizationMetrics getAdvancedCostOptimizationMetrics() {
        return this.advancedCostOptimizationMetrics;
    }

    /**
     * <p>
     * A container for S3 Storage Lens advanced cost-optimization metrics.
     * </p>
     * 
     * @param advancedCostOptimizationMetrics
     *        A container for S3 Storage Lens advanced cost-optimization metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountLevel withAdvancedCostOptimizationMetrics(AdvancedCostOptimizationMetrics advancedCostOptimizationMetrics) {
        setAdvancedCostOptimizationMetrics(advancedCostOptimizationMetrics);
        return this;
    }

    /**
     * <p>
     * A container for S3 Storage Lens advanced data-protection metrics.
     * </p>
     * 
     * @param advancedDataProtectionMetrics
     *        A container for S3 Storage Lens advanced data-protection metrics.
     */

    public void setAdvancedDataProtectionMetrics(AdvancedDataProtectionMetrics advancedDataProtectionMetrics) {
        this.advancedDataProtectionMetrics = advancedDataProtectionMetrics;
    }

    /**
     * <p>
     * A container for S3 Storage Lens advanced data-protection metrics.
     * </p>
     * 
     * @return A container for S3 Storage Lens advanced data-protection metrics.
     */

    public AdvancedDataProtectionMetrics getAdvancedDataProtectionMetrics() {
        return this.advancedDataProtectionMetrics;
    }

    /**
     * <p>
     * A container for S3 Storage Lens advanced data-protection metrics.
     * </p>
     * 
     * @param advancedDataProtectionMetrics
     *        A container for S3 Storage Lens advanced data-protection metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountLevel withAdvancedDataProtectionMetrics(AdvancedDataProtectionMetrics advancedDataProtectionMetrics) {
        setAdvancedDataProtectionMetrics(advancedDataProtectionMetrics);
        return this;
    }

    /**
     * <p>
     * A container for detailed status code metrics.
     * </p>
     * 
     * @param detailedStatusCodesMetrics
     *        A container for detailed status code metrics.
     */

    public void setDetailedStatusCodesMetrics(DetailedStatusCodesMetrics detailedStatusCodesMetrics) {
        this.detailedStatusCodesMetrics = detailedStatusCodesMetrics;
    }

    /**
     * <p>
     * A container for detailed status code metrics.
     * </p>
     * 
     * @return A container for detailed status code metrics.
     */

    public DetailedStatusCodesMetrics getDetailedStatusCodesMetrics() {
        return this.detailedStatusCodesMetrics;
    }

    /**
     * <p>
     * A container for detailed status code metrics.
     * </p>
     * 
     * @param detailedStatusCodesMetrics
     *        A container for detailed status code metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountLevel withDetailedStatusCodesMetrics(DetailedStatusCodesMetrics detailedStatusCodesMetrics) {
        setDetailedStatusCodesMetrics(detailedStatusCodesMetrics);
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
        if (getBucketLevel() != null)
            sb.append("BucketLevel: ").append(getBucketLevel()).append(",");
        if (getAdvancedCostOptimizationMetrics() != null)
            sb.append("AdvancedCostOptimizationMetrics: ").append(getAdvancedCostOptimizationMetrics()).append(",");
        if (getAdvancedDataProtectionMetrics() != null)
            sb.append("AdvancedDataProtectionMetrics: ").append(getAdvancedDataProtectionMetrics()).append(",");
        if (getDetailedStatusCodesMetrics() != null)
            sb.append("DetailedStatusCodesMetrics: ").append(getDetailedStatusCodesMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountLevel == false)
            return false;
        AccountLevel other = (AccountLevel) obj;
        if (other.getActivityMetrics() == null ^ this.getActivityMetrics() == null)
            return false;
        if (other.getActivityMetrics() != null && other.getActivityMetrics().equals(this.getActivityMetrics()) == false)
            return false;
        if (other.getBucketLevel() == null ^ this.getBucketLevel() == null)
            return false;
        if (other.getBucketLevel() != null && other.getBucketLevel().equals(this.getBucketLevel()) == false)
            return false;
        if (other.getAdvancedCostOptimizationMetrics() == null ^ this.getAdvancedCostOptimizationMetrics() == null)
            return false;
        if (other.getAdvancedCostOptimizationMetrics() != null
                && other.getAdvancedCostOptimizationMetrics().equals(this.getAdvancedCostOptimizationMetrics()) == false)
            return false;
        if (other.getAdvancedDataProtectionMetrics() == null ^ this.getAdvancedDataProtectionMetrics() == null)
            return false;
        if (other.getAdvancedDataProtectionMetrics() != null
                && other.getAdvancedDataProtectionMetrics().equals(this.getAdvancedDataProtectionMetrics()) == false)
            return false;
        if (other.getDetailedStatusCodesMetrics() == null ^ this.getDetailedStatusCodesMetrics() == null)
            return false;
        if (other.getDetailedStatusCodesMetrics() != null && other.getDetailedStatusCodesMetrics().equals(this.getDetailedStatusCodesMetrics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActivityMetrics() == null) ? 0 : getActivityMetrics().hashCode());
        hashCode = prime * hashCode + ((getBucketLevel() == null) ? 0 : getBucketLevel().hashCode());
        hashCode = prime * hashCode + ((getAdvancedCostOptimizationMetrics() == null) ? 0 : getAdvancedCostOptimizationMetrics().hashCode());
        hashCode = prime * hashCode + ((getAdvancedDataProtectionMetrics() == null) ? 0 : getAdvancedDataProtectionMetrics().hashCode());
        hashCode = prime * hashCode + ((getDetailedStatusCodesMetrics() == null) ? 0 : getDetailedStatusCodesMetrics().hashCode());
        return hashCode;
    }

    @Override
    public AccountLevel clone() {
        try {
            return (AccountLevel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
