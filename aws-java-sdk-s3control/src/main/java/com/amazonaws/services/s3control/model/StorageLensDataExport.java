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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A container to specify the properties of your S3 Storage Lens metrics export, including the destination, schema, and
 * format.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/StorageLensDataExport" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StorageLensDataExport implements Serializable, Cloneable {

    /**
     * <p>
     * A container for the bucket where the S3 Storage Lens metrics export will be located.
     * </p>
     * <note>
     * <p>
     * This bucket must be located in the same Region as the storage lens configuration.
     * </p>
     * </note>
     */
    private S3BucketDestination s3BucketDestination;

    /**
     * <p>
     * A container for the bucket where the S3 Storage Lens metrics export will be located.
     * </p>
     * <note>
     * <p>
     * This bucket must be located in the same Region as the storage lens configuration.
     * </p>
     * </note>
     * 
     * @param s3BucketDestination
     *        A container for the bucket where the S3 Storage Lens metrics export will be located.</p> <note>
     *        <p>
     *        This bucket must be located in the same Region as the storage lens configuration.
     *        </p>
     */

    public void setS3BucketDestination(S3BucketDestination s3BucketDestination) {
        this.s3BucketDestination = s3BucketDestination;
    }

    /**
     * <p>
     * A container for the bucket where the S3 Storage Lens metrics export will be located.
     * </p>
     * <note>
     * <p>
     * This bucket must be located in the same Region as the storage lens configuration.
     * </p>
     * </note>
     * 
     * @return A container for the bucket where the S3 Storage Lens metrics export will be located.</p> <note>
     *         <p>
     *         This bucket must be located in the same Region as the storage lens configuration.
     *         </p>
     */

    public S3BucketDestination getS3BucketDestination() {
        return this.s3BucketDestination;
    }

    /**
     * <p>
     * A container for the bucket where the S3 Storage Lens metrics export will be located.
     * </p>
     * <note>
     * <p>
     * This bucket must be located in the same Region as the storage lens configuration.
     * </p>
     * </note>
     * 
     * @param s3BucketDestination
     *        A container for the bucket where the S3 Storage Lens metrics export will be located.</p> <note>
     *        <p>
     *        This bucket must be located in the same Region as the storage lens configuration.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLensDataExport withS3BucketDestination(S3BucketDestination s3BucketDestination) {
        setS3BucketDestination(s3BucketDestination);
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
        if (getS3BucketDestination() != null)
            sb.append("S3BucketDestination: ").append(getS3BucketDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StorageLensDataExport == false)
            return false;
        StorageLensDataExport other = (StorageLensDataExport) obj;
        if (other.getS3BucketDestination() == null ^ this.getS3BucketDestination() == null)
            return false;
        if (other.getS3BucketDestination() != null && other.getS3BucketDestination().equals(this.getS3BucketDestination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3BucketDestination() == null) ? 0 : getS3BucketDestination().hashCode());
        return hashCode;
    }

    @Override
    public StorageLensDataExport clone() {
        try {
            return (StorageLensDataExport) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
