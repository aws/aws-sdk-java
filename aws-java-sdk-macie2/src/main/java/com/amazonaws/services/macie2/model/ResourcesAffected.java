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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the resources that a finding applies to.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ResourcesAffected" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourcesAffected implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The details of the S3 bucket that the finding applies to.
     * </p>
     */
    private S3Bucket s3Bucket;
    /**
     * <p>
     * The details of the S3 object that the finding applies to.
     * </p>
     */
    private S3Object s3Object;

    /**
     * <p>
     * The details of the S3 bucket that the finding applies to.
     * </p>
     * 
     * @param s3Bucket
     *        The details of the S3 bucket that the finding applies to.
     */

    public void setS3Bucket(S3Bucket s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * The details of the S3 bucket that the finding applies to.
     * </p>
     * 
     * @return The details of the S3 bucket that the finding applies to.
     */

    public S3Bucket getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * The details of the S3 bucket that the finding applies to.
     * </p>
     * 
     * @param s3Bucket
     *        The details of the S3 bucket that the finding applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcesAffected withS3Bucket(S3Bucket s3Bucket) {
        setS3Bucket(s3Bucket);
        return this;
    }

    /**
     * <p>
     * The details of the S3 object that the finding applies to.
     * </p>
     * 
     * @param s3Object
     *        The details of the S3 object that the finding applies to.
     */

    public void setS3Object(S3Object s3Object) {
        this.s3Object = s3Object;
    }

    /**
     * <p>
     * The details of the S3 object that the finding applies to.
     * </p>
     * 
     * @return The details of the S3 object that the finding applies to.
     */

    public S3Object getS3Object() {
        return this.s3Object;
    }

    /**
     * <p>
     * The details of the S3 object that the finding applies to.
     * </p>
     * 
     * @param s3Object
     *        The details of the S3 object that the finding applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcesAffected withS3Object(S3Object s3Object) {
        setS3Object(s3Object);
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
        if (getS3Object() != null)
            sb.append("S3Object: ").append(getS3Object());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourcesAffected == false)
            return false;
        ResourcesAffected other = (ResourcesAffected) obj;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getS3Object() == null ^ this.getS3Object() == null)
            return false;
        if (other.getS3Object() != null && other.getS3Object().equals(this.getS3Object()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getS3Object() == null) ? 0 : getS3Object().hashCode());
        return hashCode;
    }

    @Override
    public ResourcesAffected clone() {
        try {
            return (ResourcesAffected) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.ResourcesAffectedMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
