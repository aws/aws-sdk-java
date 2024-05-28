/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An optional structure that contains the Amazon S3 bucket configuration that the generated snapshots are stored in. If
 * you don't provide this information, generated snapshots are stored in the default Amazon QuickSight bucket.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/S3BucketConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3BucketConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of an existing Amazon S3 bucket where the generated snapshot artifacts are sent.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * The prefix of the Amazon S3 bucket that the generated snapshots are stored in.
     * </p>
     */
    private String bucketPrefix;
    /**
     * <p>
     * The region that the Amazon S3 bucket is located in. The bucket must be located in the same region that the
     * <code>StartDashboardSnapshotJob</code> API call is made.
     * </p>
     */
    private String bucketRegion;

    /**
     * <p>
     * The name of an existing Amazon S3 bucket where the generated snapshot artifacts are sent.
     * </p>
     * 
     * @param bucketName
     *        The name of an existing Amazon S3 bucket where the generated snapshot artifacts are sent.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The name of an existing Amazon S3 bucket where the generated snapshot artifacts are sent.
     * </p>
     * 
     * @return The name of an existing Amazon S3 bucket where the generated snapshot artifacts are sent.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * The name of an existing Amazon S3 bucket where the generated snapshot artifacts are sent.
     * </p>
     * 
     * @param bucketName
     *        The name of an existing Amazon S3 bucket where the generated snapshot artifacts are sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketConfiguration withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * The prefix of the Amazon S3 bucket that the generated snapshots are stored in.
     * </p>
     * 
     * @param bucketPrefix
     *        The prefix of the Amazon S3 bucket that the generated snapshots are stored in.
     */

    public void setBucketPrefix(String bucketPrefix) {
        this.bucketPrefix = bucketPrefix;
    }

    /**
     * <p>
     * The prefix of the Amazon S3 bucket that the generated snapshots are stored in.
     * </p>
     * 
     * @return The prefix of the Amazon S3 bucket that the generated snapshots are stored in.
     */

    public String getBucketPrefix() {
        return this.bucketPrefix;
    }

    /**
     * <p>
     * The prefix of the Amazon S3 bucket that the generated snapshots are stored in.
     * </p>
     * 
     * @param bucketPrefix
     *        The prefix of the Amazon S3 bucket that the generated snapshots are stored in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketConfiguration withBucketPrefix(String bucketPrefix) {
        setBucketPrefix(bucketPrefix);
        return this;
    }

    /**
     * <p>
     * The region that the Amazon S3 bucket is located in. The bucket must be located in the same region that the
     * <code>StartDashboardSnapshotJob</code> API call is made.
     * </p>
     * 
     * @param bucketRegion
     *        The region that the Amazon S3 bucket is located in. The bucket must be located in the same region that the
     *        <code>StartDashboardSnapshotJob</code> API call is made.
     */

    public void setBucketRegion(String bucketRegion) {
        this.bucketRegion = bucketRegion;
    }

    /**
     * <p>
     * The region that the Amazon S3 bucket is located in. The bucket must be located in the same region that the
     * <code>StartDashboardSnapshotJob</code> API call is made.
     * </p>
     * 
     * @return The region that the Amazon S3 bucket is located in. The bucket must be located in the same region that
     *         the <code>StartDashboardSnapshotJob</code> API call is made.
     */

    public String getBucketRegion() {
        return this.bucketRegion;
    }

    /**
     * <p>
     * The region that the Amazon S3 bucket is located in. The bucket must be located in the same region that the
     * <code>StartDashboardSnapshotJob</code> API call is made.
     * </p>
     * 
     * @param bucketRegion
     *        The region that the Amazon S3 bucket is located in. The bucket must be located in the same region that the
     *        <code>StartDashboardSnapshotJob</code> API call is made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketConfiguration withBucketRegion(String bucketRegion) {
        setBucketRegion(bucketRegion);
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
        if (getBucketName() != null)
            sb.append("BucketName: ").append(getBucketName()).append(",");
        if (getBucketPrefix() != null)
            sb.append("BucketPrefix: ").append(getBucketPrefix()).append(",");
        if (getBucketRegion() != null)
            sb.append("BucketRegion: ").append(getBucketRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3BucketConfiguration == false)
            return false;
        S3BucketConfiguration other = (S3BucketConfiguration) obj;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getBucketPrefix() == null ^ this.getBucketPrefix() == null)
            return false;
        if (other.getBucketPrefix() != null && other.getBucketPrefix().equals(this.getBucketPrefix()) == false)
            return false;
        if (other.getBucketRegion() == null ^ this.getBucketRegion() == null)
            return false;
        if (other.getBucketRegion() != null && other.getBucketRegion().equals(this.getBucketRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getBucketPrefix() == null) ? 0 : getBucketPrefix().hashCode());
        hashCode = prime * hashCode + ((getBucketRegion() == null) ? 0 : getBucketRegion().hashCode());
        return hashCode;
    }

    @Override
    public S3BucketConfiguration clone() {
        try {
            return (S3BucketConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.S3BucketConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
