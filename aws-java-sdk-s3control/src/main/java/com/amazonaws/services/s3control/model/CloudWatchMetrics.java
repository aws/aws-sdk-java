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
 * A container for enabling Amazon CloudWatch publishing for S3 Storage Lens metrics.
 * </p>
 * <p>
 * For more information about publishing S3 Storage Lens metrics to CloudWatch, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_view_metrics_cloudwatch.html">Monitor S3
 * Storage Lens metrics in CloudWatch</a> in the <i>Amazon S3 User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CloudWatchMetrics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudWatchMetrics implements Serializable, Cloneable {

    /**
     * <p>
     * A container that indicates whether CloudWatch publishing for S3 Storage Lens metrics is enabled. A value of
     * <code>true</code> indicates that CloudWatch publishing for S3 Storage Lens metrics is enabled.
     * </p>
     */
    private Boolean isEnabled;

    /**
     * <p>
     * A container that indicates whether CloudWatch publishing for S3 Storage Lens metrics is enabled. A value of
     * <code>true</code> indicates that CloudWatch publishing for S3 Storage Lens metrics is enabled.
     * </p>
     * 
     * @param isEnabled
     *        A container that indicates whether CloudWatch publishing for S3 Storage Lens metrics is enabled. A value
     *        of <code>true</code> indicates that CloudWatch publishing for S3 Storage Lens metrics is enabled.
     */

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    /**
     * <p>
     * A container that indicates whether CloudWatch publishing for S3 Storage Lens metrics is enabled. A value of
     * <code>true</code> indicates that CloudWatch publishing for S3 Storage Lens metrics is enabled.
     * </p>
     * 
     * @return A container that indicates whether CloudWatch publishing for S3 Storage Lens metrics is enabled. A value
     *         of <code>true</code> indicates that CloudWatch publishing for S3 Storage Lens metrics is enabled.
     */

    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * <p>
     * A container that indicates whether CloudWatch publishing for S3 Storage Lens metrics is enabled. A value of
     * <code>true</code> indicates that CloudWatch publishing for S3 Storage Lens metrics is enabled.
     * </p>
     * 
     * @param isEnabled
     *        A container that indicates whether CloudWatch publishing for S3 Storage Lens metrics is enabled. A value
     *        of <code>true</code> indicates that CloudWatch publishing for S3 Storage Lens metrics is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchMetrics withIsEnabled(Boolean isEnabled) {
        setIsEnabled(isEnabled);
        return this;
    }

    /**
     * <p>
     * A container that indicates whether CloudWatch publishing for S3 Storage Lens metrics is enabled. A value of
     * <code>true</code> indicates that CloudWatch publishing for S3 Storage Lens metrics is enabled.
     * </p>
     * 
     * @return A container that indicates whether CloudWatch publishing for S3 Storage Lens metrics is enabled. A value
     *         of <code>true</code> indicates that CloudWatch publishing for S3 Storage Lens metrics is enabled.
     */

    public Boolean isEnabled() {
        return this.isEnabled;
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
        if (getIsEnabled() != null)
            sb.append("IsEnabled: ").append(getIsEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudWatchMetrics == false)
            return false;
        CloudWatchMetrics other = (CloudWatchMetrics) obj;
        if (other.getIsEnabled() == null ^ this.getIsEnabled() == null)
            return false;
        if (other.getIsEnabled() != null && other.getIsEnabled().equals(this.getIsEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsEnabled() == null) ? 0 : getIsEnabled().hashCode());
        return hashCode;
    }

    @Override
    public CloudWatchMetrics clone() {
        try {
            return (CloudWatchMetrics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
