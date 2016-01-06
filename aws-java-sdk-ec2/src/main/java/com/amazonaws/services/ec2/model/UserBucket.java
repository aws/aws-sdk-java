/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the S3 bucket for the disk image.
 * </p>
 */
public class UserBucket implements Serializable, Cloneable {

    /**
     * The name of the S3 bucket where the disk image is located.
     */
    private String s3Bucket;

    /**
     * The key for the disk image.
     */
    private String s3Key;

    /**
     * The name of the S3 bucket where the disk image is located.
     *
     * @return The name of the S3 bucket where the disk image is located.
     */
    public String getS3Bucket() {
        return s3Bucket;
    }
    
    /**
     * The name of the S3 bucket where the disk image is located.
     *
     * @param s3Bucket The name of the S3 bucket where the disk image is located.
     */
    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }
    
    /**
     * The name of the S3 bucket where the disk image is located.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param s3Bucket The name of the S3 bucket where the disk image is located.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserBucket withS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
        return this;
    }

    /**
     * The key for the disk image.
     *
     * @return The key for the disk image.
     */
    public String getS3Key() {
        return s3Key;
    }
    
    /**
     * The key for the disk image.
     *
     * @param s3Key The key for the disk image.
     */
    public void setS3Key(String s3Key) {
        this.s3Key = s3Key;
    }
    
    /**
     * The key for the disk image.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param s3Key The key for the disk image.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserBucket withS3Key(String s3Key) {
        this.s3Key = s3Key;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getS3Bucket() != null) sb.append("S3Bucket: " + getS3Bucket() + ",");
        if (getS3Key() != null) sb.append("S3Key: " + getS3Key() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UserBucket == false) return false;
        UserBucket other = (UserBucket)obj;
        
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null) return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false) return false; 
        if (other.getS3Key() == null ^ this.getS3Key() == null) return false;
        if (other.getS3Key() != null && other.getS3Key().equals(this.getS3Key()) == false) return false; 
        return true;
    }
    
    @Override
    public UserBucket clone() {
        try {
            return (UserBucket) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    