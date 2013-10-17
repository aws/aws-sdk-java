/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;


/**
 * <p>
 * Results of a CreateStorageLocationResult call.
 * </p>
 */
public class CreateStorageLocationResult implements Serializable {

    /**
     * The name of the Amazon S3 bucket created.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     */
    private String s3Bucket;

    /**
     * The name of the Amazon S3 bucket created.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @return The name of the Amazon S3 bucket created.
     */
    public String getS3Bucket() {
        return s3Bucket;
    }
    
    /**
     * The name of the Amazon S3 bucket created.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param s3Bucket The name of the Amazon S3 bucket created.
     */
    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }
    
    /**
     * The name of the Amazon S3 bucket created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param s3Bucket The name of the Amazon S3 bucket created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateStorageLocationResult withS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
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
        if (getS3Bucket() != null) sb.append("S3Bucket: " + getS3Bucket() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateStorageLocationResult == false) return false;
        CreateStorageLocationResult other = (CreateStorageLocationResult)obj;
        
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null) return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false) return false; 
        return true;
    }
    
}
    