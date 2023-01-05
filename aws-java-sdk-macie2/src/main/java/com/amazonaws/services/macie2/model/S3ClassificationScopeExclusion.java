/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the names of the S3 buckets that are excluded from automated sensitive data discovery.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/S3ClassificationScopeExclusion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3ClassificationScopeExclusion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of strings, one for each S3 bucket that is excluded. Each string is the full name of an excluded bucket.
     * </p>
     */
    private java.util.List<String> bucketNames;

    /**
     * <p>
     * An array of strings, one for each S3 bucket that is excluded. Each string is the full name of an excluded bucket.
     * </p>
     * 
     * @return An array of strings, one for each S3 bucket that is excluded. Each string is the full name of an excluded
     *         bucket.
     */

    public java.util.List<String> getBucketNames() {
        return bucketNames;
    }

    /**
     * <p>
     * An array of strings, one for each S3 bucket that is excluded. Each string is the full name of an excluded bucket.
     * </p>
     * 
     * @param bucketNames
     *        An array of strings, one for each S3 bucket that is excluded. Each string is the full name of an excluded
     *        bucket.
     */

    public void setBucketNames(java.util.Collection<String> bucketNames) {
        if (bucketNames == null) {
            this.bucketNames = null;
            return;
        }

        this.bucketNames = new java.util.ArrayList<String>(bucketNames);
    }

    /**
     * <p>
     * An array of strings, one for each S3 bucket that is excluded. Each string is the full name of an excluded bucket.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBucketNames(java.util.Collection)} or {@link #withBucketNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param bucketNames
     *        An array of strings, one for each S3 bucket that is excluded. Each string is the full name of an excluded
     *        bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ClassificationScopeExclusion withBucketNames(String... bucketNames) {
        if (this.bucketNames == null) {
            setBucketNames(new java.util.ArrayList<String>(bucketNames.length));
        }
        for (String ele : bucketNames) {
            this.bucketNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings, one for each S3 bucket that is excluded. Each string is the full name of an excluded bucket.
     * </p>
     * 
     * @param bucketNames
     *        An array of strings, one for each S3 bucket that is excluded. Each string is the full name of an excluded
     *        bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ClassificationScopeExclusion withBucketNames(java.util.Collection<String> bucketNames) {
        setBucketNames(bucketNames);
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
        if (getBucketNames() != null)
            sb.append("BucketNames: ").append(getBucketNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3ClassificationScopeExclusion == false)
            return false;
        S3ClassificationScopeExclusion other = (S3ClassificationScopeExclusion) obj;
        if (other.getBucketNames() == null ^ this.getBucketNames() == null)
            return false;
        if (other.getBucketNames() != null && other.getBucketNames().equals(this.getBucketNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketNames() == null) ? 0 : getBucketNames().hashCode());
        return hashCode;
    }

    @Override
    public S3ClassificationScopeExclusion clone() {
        try {
            return (S3ClassificationScopeExclusion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.S3ClassificationScopeExclusionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
