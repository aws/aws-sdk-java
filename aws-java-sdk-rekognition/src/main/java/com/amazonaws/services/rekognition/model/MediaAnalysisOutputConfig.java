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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Output configuration provided in the job creation request.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MediaAnalysisOutputConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the Amazon S3 bucket to contain the output of the media analysis job.
     * </p>
     */
    private String s3Bucket;
    /**
     * <p>
     * Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated for storage.
     * </p>
     */
    private String s3KeyPrefix;

    /**
     * <p>
     * Specifies the Amazon S3 bucket to contain the output of the media analysis job.
     * </p>
     * 
     * @param s3Bucket
     *        Specifies the Amazon S3 bucket to contain the output of the media analysis job.
     */

    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * Specifies the Amazon S3 bucket to contain the output of the media analysis job.
     * </p>
     * 
     * @return Specifies the Amazon S3 bucket to contain the output of the media analysis job.
     */

    public String getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * Specifies the Amazon S3 bucket to contain the output of the media analysis job.
     * </p>
     * 
     * @param s3Bucket
     *        Specifies the Amazon S3 bucket to contain the output of the media analysis job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaAnalysisOutputConfig withS3Bucket(String s3Bucket) {
        setS3Bucket(s3Bucket);
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated for storage.
     * </p>
     * 
     * @param s3KeyPrefix
     *        Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated for
     *        storage.
     */

    public void setS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
    }

    /**
     * <p>
     * Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated for storage.
     * </p>
     * 
     * @return Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated for
     *         storage.
     */

    public String getS3KeyPrefix() {
        return this.s3KeyPrefix;
    }

    /**
     * <p>
     * Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated for storage.
     * </p>
     * 
     * @param s3KeyPrefix
     *        Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated for
     *        storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaAnalysisOutputConfig withS3KeyPrefix(String s3KeyPrefix) {
        setS3KeyPrefix(s3KeyPrefix);
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
        if (getS3Bucket() != null)
            sb.append("S3Bucket: ").append(getS3Bucket()).append(",");
        if (getS3KeyPrefix() != null)
            sb.append("S3KeyPrefix: ").append(getS3KeyPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MediaAnalysisOutputConfig == false)
            return false;
        MediaAnalysisOutputConfig other = (MediaAnalysisOutputConfig) obj;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getS3KeyPrefix() == null ^ this.getS3KeyPrefix() == null)
            return false;
        if (other.getS3KeyPrefix() != null && other.getS3KeyPrefix().equals(this.getS3KeyPrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getS3KeyPrefix() == null) ? 0 : getS3KeyPrefix().hashCode());
        return hashCode;
    }

    @Override
    public MediaAnalysisOutputConfig clone() {
        try {
            return (MediaAnalysisOutputConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.MediaAnalysisOutputConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
