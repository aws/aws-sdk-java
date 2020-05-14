/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides information about the user who owns an S3 bucket.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01T00:00:00Z/S3BucketOwner" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3BucketOwner implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The display name of the user who owns the bucket.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The AWS account ID for the user who owns the bucket.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The display name of the user who owns the bucket.
     * </p>
     * 
     * @param displayName
     *        The display name of the user who owns the bucket.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the user who owns the bucket.
     * </p>
     * 
     * @return The display name of the user who owns the bucket.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of the user who owns the bucket.
     * </p>
     * 
     * @param displayName
     *        The display name of the user who owns the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketOwner withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The AWS account ID for the user who owns the bucket.
     * </p>
     * 
     * @param id
     *        The AWS account ID for the user who owns the bucket.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The AWS account ID for the user who owns the bucket.
     * </p>
     * 
     * @return The AWS account ID for the user who owns the bucket.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The AWS account ID for the user who owns the bucket.
     * </p>
     * 
     * @param id
     *        The AWS account ID for the user who owns the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketOwner withId(String id) {
        setId(id);
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
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3BucketOwner == false)
            return false;
        S3BucketOwner other = (S3BucketOwner) obj;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public S3BucketOwner clone() {
        try {
            return (S3BucketOwner) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.S3BucketOwnerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
