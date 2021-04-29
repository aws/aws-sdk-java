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
 * Provides information about the permissions settings of the bucket policy for an S3 bucket.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/BucketPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BucketPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether the bucket policy allows the general public to have read access to the bucket.
     * </p>
     */
    private Boolean allowsPublicReadAccess;
    /**
     * <p>
     * Specifies whether the bucket policy allows the general public to have write access to the bucket.
     * </p>
     */
    private Boolean allowsPublicWriteAccess;

    /**
     * <p>
     * Specifies whether the bucket policy allows the general public to have read access to the bucket.
     * </p>
     * 
     * @param allowsPublicReadAccess
     *        Specifies whether the bucket policy allows the general public to have read access to the bucket.
     */

    public void setAllowsPublicReadAccess(Boolean allowsPublicReadAccess) {
        this.allowsPublicReadAccess = allowsPublicReadAccess;
    }

    /**
     * <p>
     * Specifies whether the bucket policy allows the general public to have read access to the bucket.
     * </p>
     * 
     * @return Specifies whether the bucket policy allows the general public to have read access to the bucket.
     */

    public Boolean getAllowsPublicReadAccess() {
        return this.allowsPublicReadAccess;
    }

    /**
     * <p>
     * Specifies whether the bucket policy allows the general public to have read access to the bucket.
     * </p>
     * 
     * @param allowsPublicReadAccess
     *        Specifies whether the bucket policy allows the general public to have read access to the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketPolicy withAllowsPublicReadAccess(Boolean allowsPublicReadAccess) {
        setAllowsPublicReadAccess(allowsPublicReadAccess);
        return this;
    }

    /**
     * <p>
     * Specifies whether the bucket policy allows the general public to have read access to the bucket.
     * </p>
     * 
     * @return Specifies whether the bucket policy allows the general public to have read access to the bucket.
     */

    public Boolean isAllowsPublicReadAccess() {
        return this.allowsPublicReadAccess;
    }

    /**
     * <p>
     * Specifies whether the bucket policy allows the general public to have write access to the bucket.
     * </p>
     * 
     * @param allowsPublicWriteAccess
     *        Specifies whether the bucket policy allows the general public to have write access to the bucket.
     */

    public void setAllowsPublicWriteAccess(Boolean allowsPublicWriteAccess) {
        this.allowsPublicWriteAccess = allowsPublicWriteAccess;
    }

    /**
     * <p>
     * Specifies whether the bucket policy allows the general public to have write access to the bucket.
     * </p>
     * 
     * @return Specifies whether the bucket policy allows the general public to have write access to the bucket.
     */

    public Boolean getAllowsPublicWriteAccess() {
        return this.allowsPublicWriteAccess;
    }

    /**
     * <p>
     * Specifies whether the bucket policy allows the general public to have write access to the bucket.
     * </p>
     * 
     * @param allowsPublicWriteAccess
     *        Specifies whether the bucket policy allows the general public to have write access to the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketPolicy withAllowsPublicWriteAccess(Boolean allowsPublicWriteAccess) {
        setAllowsPublicWriteAccess(allowsPublicWriteAccess);
        return this;
    }

    /**
     * <p>
     * Specifies whether the bucket policy allows the general public to have write access to the bucket.
     * </p>
     * 
     * @return Specifies whether the bucket policy allows the general public to have write access to the bucket.
     */

    public Boolean isAllowsPublicWriteAccess() {
        return this.allowsPublicWriteAccess;
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
        if (getAllowsPublicReadAccess() != null)
            sb.append("AllowsPublicReadAccess: ").append(getAllowsPublicReadAccess()).append(",");
        if (getAllowsPublicWriteAccess() != null)
            sb.append("AllowsPublicWriteAccess: ").append(getAllowsPublicWriteAccess());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BucketPolicy == false)
            return false;
        BucketPolicy other = (BucketPolicy) obj;
        if (other.getAllowsPublicReadAccess() == null ^ this.getAllowsPublicReadAccess() == null)
            return false;
        if (other.getAllowsPublicReadAccess() != null && other.getAllowsPublicReadAccess().equals(this.getAllowsPublicReadAccess()) == false)
            return false;
        if (other.getAllowsPublicWriteAccess() == null ^ this.getAllowsPublicWriteAccess() == null)
            return false;
        if (other.getAllowsPublicWriteAccess() != null && other.getAllowsPublicWriteAccess().equals(this.getAllowsPublicWriteAccess()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowsPublicReadAccess() == null) ? 0 : getAllowsPublicReadAccess().hashCode());
        hashCode = prime * hashCode + ((getAllowsPublicWriteAccess() == null) ? 0 : getAllowsPublicWriteAccess().hashCode());
        return hashCode;
    }

    @Override
    public BucketPolicy clone() {
        try {
            return (BucketPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.BucketPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
