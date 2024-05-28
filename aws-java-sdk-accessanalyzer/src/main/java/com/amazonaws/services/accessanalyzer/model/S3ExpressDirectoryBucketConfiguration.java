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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Proposed access control configuration for an Amazon S3 directory bucket. You can propose a configuration for a new
 * Amazon S3 directory bucket or an existing Amazon S3 directory bucket that you own by specifying the Amazon S3 bucket
 * policy. If the configuration is for an existing Amazon S3 directory bucket and you do not specify the Amazon S3
 * bucket policy, the access preview uses the existing policy attached to the directory bucket. If the access preview is
 * for a new resource and you do not specify the Amazon S3 bucket policy, the access preview assumes an directory bucket
 * without a policy. To propose deletion of an existing bucket policy, you can specify an empty string. For more
 * information about Amazon S3 directory bucket policies, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-express-security-iam-example-bucket-policies.html"
 * >Example directory bucket policies for S3 Express One Zone</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/S3ExpressDirectoryBucketConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3ExpressDirectoryBucketConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The proposed bucket policy for the Amazon S3 directory bucket.
     * </p>
     */
    private String bucketPolicy;

    /**
     * <p>
     * The proposed bucket policy for the Amazon S3 directory bucket.
     * </p>
     * 
     * @param bucketPolicy
     *        The proposed bucket policy for the Amazon S3 directory bucket.
     */

    public void setBucketPolicy(String bucketPolicy) {
        this.bucketPolicy = bucketPolicy;
    }

    /**
     * <p>
     * The proposed bucket policy for the Amazon S3 directory bucket.
     * </p>
     * 
     * @return The proposed bucket policy for the Amazon S3 directory bucket.
     */

    public String getBucketPolicy() {
        return this.bucketPolicy;
    }

    /**
     * <p>
     * The proposed bucket policy for the Amazon S3 directory bucket.
     * </p>
     * 
     * @param bucketPolicy
     *        The proposed bucket policy for the Amazon S3 directory bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ExpressDirectoryBucketConfiguration withBucketPolicy(String bucketPolicy) {
        setBucketPolicy(bucketPolicy);
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
        if (getBucketPolicy() != null)
            sb.append("BucketPolicy: ").append(getBucketPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3ExpressDirectoryBucketConfiguration == false)
            return false;
        S3ExpressDirectoryBucketConfiguration other = (S3ExpressDirectoryBucketConfiguration) obj;
        if (other.getBucketPolicy() == null ^ this.getBucketPolicy() == null)
            return false;
        if (other.getBucketPolicy() != null && other.getBucketPolicy().equals(this.getBucketPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketPolicy() == null) ? 0 : getBucketPolicy().hashCode());
        return hashCode;
    }

    @Override
    public S3ExpressDirectoryBucketConfiguration clone() {
        try {
            return (S3ExpressDirectoryBucketConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.S3ExpressDirectoryBucketConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
