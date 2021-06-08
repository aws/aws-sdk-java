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
 * The description of the S3 base location that holds the application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/S3ContentBaseLocationDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3ContentBaseLocationDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the S3 bucket.
     * </p>
     */
    private String bucketARN;
    /**
     * <p>
     * The base path for the S3 bucket.
     * </p>
     */
    private String basePath;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the S3 bucket.
     * </p>
     * 
     * @param bucketARN
     *        The Amazon Resource Name (ARN) of the S3 bucket.
     */

    public void setBucketARN(String bucketARN) {
        this.bucketARN = bucketARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the S3 bucket.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the S3 bucket.
     */

    public String getBucketARN() {
        return this.bucketARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the S3 bucket.
     * </p>
     * 
     * @param bucketARN
     *        The Amazon Resource Name (ARN) of the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ContentBaseLocationDescription withBucketARN(String bucketARN) {
        setBucketARN(bucketARN);
        return this;
    }

    /**
     * <p>
     * The base path for the S3 bucket.
     * </p>
     * 
     * @param basePath
     *        The base path for the S3 bucket.
     */

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    /**
     * <p>
     * The base path for the S3 bucket.
     * </p>
     * 
     * @return The base path for the S3 bucket.
     */

    public String getBasePath() {
        return this.basePath;
    }

    /**
     * <p>
     * The base path for the S3 bucket.
     * </p>
     * 
     * @param basePath
     *        The base path for the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ContentBaseLocationDescription withBasePath(String basePath) {
        setBasePath(basePath);
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
        if (getBucketARN() != null)
            sb.append("BucketARN: ").append(getBucketARN()).append(",");
        if (getBasePath() != null)
            sb.append("BasePath: ").append(getBasePath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3ContentBaseLocationDescription == false)
            return false;
        S3ContentBaseLocationDescription other = (S3ContentBaseLocationDescription) obj;
        if (other.getBucketARN() == null ^ this.getBucketARN() == null)
            return false;
        if (other.getBucketARN() != null && other.getBucketARN().equals(this.getBucketARN()) == false)
            return false;
        if (other.getBasePath() == null ^ this.getBasePath() == null)
            return false;
        if (other.getBasePath() != null && other.getBasePath().equals(this.getBasePath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketARN() == null) ? 0 : getBucketARN().hashCode());
        hashCode = prime * hashCode + ((getBasePath() == null) ? 0 : getBasePath().hashCode());
        return hashCode;
    }

    @Override
    public S3ContentBaseLocationDescription clone() {
        try {
            return (S3ContentBaseLocationDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.S3ContentBaseLocationDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
