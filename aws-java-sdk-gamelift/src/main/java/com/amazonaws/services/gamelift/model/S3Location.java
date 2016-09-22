/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;

/**
 * <p>
 * Location in Amazon Simple Storage Service (Amazon S3) where a build's files are stored. This location is assigned in
 * response to a <a>CreateBuild</a> call, and is always in the same region as the service used to create the build. For
 * more details see the <a href="http://aws.amazon.com/documentation/s3/">Amazon S3 documentation</a>.
 * </p>
 */
public class S3Location implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon S3 bucket identifier.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * Amazon S3 bucket key.
     * </p>
     */
    private String key;
    /**
     * <p>
     * Amazon resource number for the cross-account access role that allows GameLift access to the S3 bucket.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * Amazon S3 bucket identifier.
     * </p>
     * 
     * @param bucket
     *        Amazon S3 bucket identifier.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * Amazon S3 bucket identifier.
     * </p>
     * 
     * @return Amazon S3 bucket identifier.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * Amazon S3 bucket identifier.
     * </p>
     * 
     * @param bucket
     *        Amazon S3 bucket identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * Amazon S3 bucket key.
     * </p>
     * 
     * @param key
     *        Amazon S3 bucket key.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * Amazon S3 bucket key.
     * </p>
     * 
     * @return Amazon S3 bucket key.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * Amazon S3 bucket key.
     * </p>
     * 
     * @param key
     *        Amazon S3 bucket key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * Amazon resource number for the cross-account access role that allows GameLift access to the S3 bucket.
     * </p>
     * 
     * @param roleArn
     *        Amazon resource number for the cross-account access role that allows GameLift access to the S3 bucket.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * Amazon resource number for the cross-account access role that allows GameLift access to the S3 bucket.
     * </p>
     * 
     * @return Amazon resource number for the cross-account access role that allows GameLift access to the S3 bucket.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * Amazon resource number for the cross-account access role that allows GameLift access to the S3 bucket.
     * </p>
     * 
     * @param roleArn
     *        Amazon resource number for the cross-account access role that allows GameLift access to the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("Bucket: " + getBucket() + ",");
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn());
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
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
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
