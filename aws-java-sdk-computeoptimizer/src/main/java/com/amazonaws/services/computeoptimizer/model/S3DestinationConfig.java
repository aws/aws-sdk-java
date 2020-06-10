/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the destination Amazon Simple Storage Service (Amazon S3) bucket name and key prefix for a recommendations
 * export job.
 * </p>
 * <p>
 * You must create the destination Amazon S3 bucket for your recommendations export before you create the export job.
 * Compute Optimizer does not create the S3 bucket for you. After you create the S3 bucket, ensure that it has the
 * required permission policy to allow Compute Optimizer to write the export file to it. If you plan to specify an
 * object prefix when you create the export job, you must include the object prefix in the policy that you add to the S3
 * bucket. For more information, see <a
 * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/create-s3-bucket-policy-for-compute-optimizer.html"
 * >Amazon S3 Bucket Policy for Compute Optimizer</a> in the <i>Compute Optimizer user guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/S3DestinationConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3DestinationConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Amazon S3 bucket to use as the destination for an export job.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The Amazon S3 bucket prefix for an export job.
     * </p>
     */
    private String keyPrefix;

    /**
     * <p>
     * The name of the Amazon S3 bucket to use as the destination for an export job.
     * </p>
     * 
     * @param bucket
     *        The name of the Amazon S3 bucket to use as the destination for an export job.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket to use as the destination for an export job.
     * </p>
     * 
     * @return The name of the Amazon S3 bucket to use as the destination for an export job.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket to use as the destination for an export job.
     * </p>
     * 
     * @param bucket
     *        The name of the Amazon S3 bucket to use as the destination for an export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DestinationConfig withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket prefix for an export job.
     * </p>
     * 
     * @param keyPrefix
     *        The Amazon S3 bucket prefix for an export job.
     */

    public void setKeyPrefix(String keyPrefix) {
        this.keyPrefix = keyPrefix;
    }

    /**
     * <p>
     * The Amazon S3 bucket prefix for an export job.
     * </p>
     * 
     * @return The Amazon S3 bucket prefix for an export job.
     */

    public String getKeyPrefix() {
        return this.keyPrefix;
    }

    /**
     * <p>
     * The Amazon S3 bucket prefix for an export job.
     * </p>
     * 
     * @param keyPrefix
     *        The Amazon S3 bucket prefix for an export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DestinationConfig withKeyPrefix(String keyPrefix) {
        setKeyPrefix(keyPrefix);
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
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getKeyPrefix() != null)
            sb.append("KeyPrefix: ").append(getKeyPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3DestinationConfig == false)
            return false;
        S3DestinationConfig other = (S3DestinationConfig) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getKeyPrefix() == null ^ this.getKeyPrefix() == null)
            return false;
        if (other.getKeyPrefix() != null && other.getKeyPrefix().equals(this.getKeyPrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getKeyPrefix() == null) ? 0 : getKeyPrefix().hashCode());
        return hashCode;
    }

    @Override
    public S3DestinationConfig clone() {
        try {
            return (S3DestinationConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.S3DestinationConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
