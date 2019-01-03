/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The bucket and key of an item stored in Amazon S3.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/S3Location" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Location implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon S3 bucket where the data is located.
     * </p>
     */
    private String s3Bucket;
    /**
     * <p>
     * The Amazon S3 key where the data is located.
     * </p>
     */
    private String s3Key;

    /**
     * Default constructor for S3Location object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public S3Location() {
    }

    /**
     * Constructs a new S3Location object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param s3Bucket
     *        The Amazon S3 bucket where the data is located.
     * @param s3Key
     *        The Amazon S3 key where the data is located.
     */
    public S3Location(String s3Bucket, String s3Key) {
        setS3Bucket(s3Bucket);
        setS3Key(s3Key);
    }

    /**
     * <p>
     * The Amazon S3 bucket where the data is located.
     * </p>
     * 
     * @param s3Bucket
     *        The Amazon S3 bucket where the data is located.
     */

    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket where the data is located.
     * </p>
     * 
     * @return The Amazon S3 bucket where the data is located.
     */

    public String getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket where the data is located.
     * </p>
     * 
     * @param s3Bucket
     *        The Amazon S3 bucket where the data is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location withS3Bucket(String s3Bucket) {
        setS3Bucket(s3Bucket);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 key where the data is located.
     * </p>
     * 
     * @param s3Key
     *        The Amazon S3 key where the data is located.
     */

    public void setS3Key(String s3Key) {
        this.s3Key = s3Key;
    }

    /**
     * <p>
     * The Amazon S3 key where the data is located.
     * </p>
     * 
     * @return The Amazon S3 key where the data is located.
     */

    public String getS3Key() {
        return this.s3Key;
    }

    /**
     * <p>
     * The Amazon S3 key where the data is located.
     * </p>
     * 
     * @param s3Key
     *        The Amazon S3 key where the data is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location withS3Key(String s3Key) {
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

        if (obj instanceof S3Location == false)
            return false;
        S3Location other = (S3Location) obj;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
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
        hashCode = prime * hashCode + ((getS3Key() == null) ? 0 : getS3Key().hashCode());
        return hashCode;
    }

    @Override
    public S3Location clone() {
        try {
            return (S3Location) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
