/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * Describes the location where the restore job's output is stored.
 *
 * @see RestoreObjectRequest#outputLocation
 */
public class OutputLocation implements Serializable, Cloneable {

    /**
     * Describes an S3 location that will receive the results of the restore request.
     */
    private S3Location s3;

    /**
     * @return the S3 location that will receive the results of the restore request.
     */
    public S3Location getS3() {
        return s3;
    }

    /**
     * Sets the S3 location that will receive the results of the restore request.
     *
     * @param s3 The new s3 location value.
     */
    public void setS3(S3Location s3) {
        this.s3 = s3;
    }

    /**
     * Sets the S3 location that will receive the results of the restore request.
     *
     * @param s3 The new s3 location value.
     * @return This object for method chaining.
     */
    public OutputLocation withS3(S3Location s3) {
        setS3(s3);
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ! (obj instanceof OutputLocation)) {
            return false;
        }

        final OutputLocation other = (OutputLocation) obj;

        if (other.getS3() == null ^ this.getS3() == null)
            return false;
        if (other.getS3() != null && !other.getS3().equals(this.getS3()))
            return false;
        return true;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3() == null) ? 0 : getS3().hashCode());
        return hashCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getS3() != null)
            sb.append("S3: ").append(getS3());
        sb.append("}");
        return sb.toString();
    }


    @Override
    public OutputLocation clone() {
        try {
            return (OutputLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
