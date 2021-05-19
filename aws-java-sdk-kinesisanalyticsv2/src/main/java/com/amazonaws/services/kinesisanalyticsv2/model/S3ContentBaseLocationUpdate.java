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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The information required to update the S3 base location that holds the application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/S3ContentBaseLocationUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3ContentBaseLocationUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The updated Amazon Resource Name (ARN) of the S3 bucket.
     * </p>
     */
    private String bucketARNUpdate;
    /**
     * <p>
     * The updated S3 bucket path.
     * </p>
     */
    private String basePathUpdate;

    /**
     * <p>
     * The updated Amazon Resource Name (ARN) of the S3 bucket.
     * </p>
     * 
     * @param bucketARNUpdate
     *        The updated Amazon Resource Name (ARN) of the S3 bucket.
     */

    public void setBucketARNUpdate(String bucketARNUpdate) {
        this.bucketARNUpdate = bucketARNUpdate;
    }

    /**
     * <p>
     * The updated Amazon Resource Name (ARN) of the S3 bucket.
     * </p>
     * 
     * @return The updated Amazon Resource Name (ARN) of the S3 bucket.
     */

    public String getBucketARNUpdate() {
        return this.bucketARNUpdate;
    }

    /**
     * <p>
     * The updated Amazon Resource Name (ARN) of the S3 bucket.
     * </p>
     * 
     * @param bucketARNUpdate
     *        The updated Amazon Resource Name (ARN) of the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ContentBaseLocationUpdate withBucketARNUpdate(String bucketARNUpdate) {
        setBucketARNUpdate(bucketARNUpdate);
        return this;
    }

    /**
     * <p>
     * The updated S3 bucket path.
     * </p>
     * 
     * @param basePathUpdate
     *        The updated S3 bucket path.
     */

    public void setBasePathUpdate(String basePathUpdate) {
        this.basePathUpdate = basePathUpdate;
    }

    /**
     * <p>
     * The updated S3 bucket path.
     * </p>
     * 
     * @return The updated S3 bucket path.
     */

    public String getBasePathUpdate() {
        return this.basePathUpdate;
    }

    /**
     * <p>
     * The updated S3 bucket path.
     * </p>
     * 
     * @param basePathUpdate
     *        The updated S3 bucket path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ContentBaseLocationUpdate withBasePathUpdate(String basePathUpdate) {
        setBasePathUpdate(basePathUpdate);
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
        if (getBucketARNUpdate() != null)
            sb.append("BucketARNUpdate: ").append(getBucketARNUpdate()).append(",");
        if (getBasePathUpdate() != null)
            sb.append("BasePathUpdate: ").append(getBasePathUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3ContentBaseLocationUpdate == false)
            return false;
        S3ContentBaseLocationUpdate other = (S3ContentBaseLocationUpdate) obj;
        if (other.getBucketARNUpdate() == null ^ this.getBucketARNUpdate() == null)
            return false;
        if (other.getBucketARNUpdate() != null && other.getBucketARNUpdate().equals(this.getBucketARNUpdate()) == false)
            return false;
        if (other.getBasePathUpdate() == null ^ this.getBasePathUpdate() == null)
            return false;
        if (other.getBasePathUpdate() != null && other.getBasePathUpdate().equals(this.getBasePathUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketARNUpdate() == null) ? 0 : getBucketARNUpdate().hashCode());
        hashCode = prime * hashCode + ((getBasePathUpdate() == null) ? 0 : getBasePathUpdate().hashCode());
        return hashCode;
    }

    @Override
    public S3ContentBaseLocationUpdate clone() {
        try {
            return (S3ContentBaseLocationUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.S3ContentBaseLocationUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
