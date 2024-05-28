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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Start export request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/StartExport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartExportRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Start export request s3 bucket.
     * </p>
     */
    private String s3Bucket;
    /**
     * <p>
     * Start export request s3 bucket owner.
     * </p>
     */
    private String s3BucketOwner;
    /**
     * <p>
     * Start export request s3key.
     * </p>
     */
    private String s3Key;

    /**
     * <p>
     * Start export request s3 bucket.
     * </p>
     * 
     * @param s3Bucket
     *        Start export request s3 bucket.
     */

    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * Start export request s3 bucket.
     * </p>
     * 
     * @return Start export request s3 bucket.
     */

    public String getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * Start export request s3 bucket.
     * </p>
     * 
     * @param s3Bucket
     *        Start export request s3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartExportRequest withS3Bucket(String s3Bucket) {
        setS3Bucket(s3Bucket);
        return this;
    }

    /**
     * <p>
     * Start export request s3 bucket owner.
     * </p>
     * 
     * @param s3BucketOwner
     *        Start export request s3 bucket owner.
     */

    public void setS3BucketOwner(String s3BucketOwner) {
        this.s3BucketOwner = s3BucketOwner;
    }

    /**
     * <p>
     * Start export request s3 bucket owner.
     * </p>
     * 
     * @return Start export request s3 bucket owner.
     */

    public String getS3BucketOwner() {
        return this.s3BucketOwner;
    }

    /**
     * <p>
     * Start export request s3 bucket owner.
     * </p>
     * 
     * @param s3BucketOwner
     *        Start export request s3 bucket owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartExportRequest withS3BucketOwner(String s3BucketOwner) {
        setS3BucketOwner(s3BucketOwner);
        return this;
    }

    /**
     * <p>
     * Start export request s3key.
     * </p>
     * 
     * @param s3Key
     *        Start export request s3key.
     */

    public void setS3Key(String s3Key) {
        this.s3Key = s3Key;
    }

    /**
     * <p>
     * Start export request s3key.
     * </p>
     * 
     * @return Start export request s3key.
     */

    public String getS3Key() {
        return this.s3Key;
    }

    /**
     * <p>
     * Start export request s3key.
     * </p>
     * 
     * @param s3Key
     *        Start export request s3key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartExportRequest withS3Key(String s3Key) {
        setS3Key(s3Key);
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
        if (getS3BucketOwner() != null)
            sb.append("S3BucketOwner: ").append(getS3BucketOwner()).append(",");
        if (getS3Key() != null)
            sb.append("S3Key: ").append(getS3Key());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartExportRequest == false)
            return false;
        StartExportRequest other = (StartExportRequest) obj;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getS3BucketOwner() == null ^ this.getS3BucketOwner() == null)
            return false;
        if (other.getS3BucketOwner() != null && other.getS3BucketOwner().equals(this.getS3BucketOwner()) == false)
            return false;
        if (other.getS3Key() == null ^ this.getS3Key() == null)
            return false;
        if (other.getS3Key() != null && other.getS3Key().equals(this.getS3Key()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getS3BucketOwner() == null) ? 0 : getS3BucketOwner().hashCode());
        hashCode = prime * hashCode + ((getS3Key() == null) ? 0 : getS3Key().hashCode());
        return hashCode;
    }

    @Override
    public StartExportRequest clone() {
        return (StartExportRequest) super.clone();
    }

}
