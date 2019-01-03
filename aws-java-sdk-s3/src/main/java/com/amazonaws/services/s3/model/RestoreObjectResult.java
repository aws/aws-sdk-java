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

import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import com.amazonaws.services.s3.internal.S3RestoreOutputPathResult;
import java.io.Serializable;

/**
 * Result object to contain the response returned from
 * {@link com.amazonaws.services.s3.AmazonS3Client#restoreObject(RestoreObjectRequest)}
 * operation.
 */
public class RestoreObjectResult implements Serializable, S3RequesterChargedResult, S3RestoreOutputPathResult {

    /**
     * Indicate if the requester is charged for conducting this operation from
     * Requester Pays Buckets.
     */
    private boolean isRequesterCharged;

    /**
     * The path in the provided S3 output location where Select results will be restored to
     */
    private String restoreOutputPath;

    /**
     * @return if the requester is charged for conducting this operation from
     * Requester Pays Buckets.
     */
    @Override
    public boolean isRequesterCharged() {
        return isRequesterCharged;
    }

    @Override
    public void setRequesterCharged(boolean isRequesterCharged) {
        this.isRequesterCharged = isRequesterCharged;
    }

    /**
     * @return the path in the provided S3 output location where Select results will be restored to.
     */
    @Override
    public String getRestoreOutputPath() {
        return restoreOutputPath;
    }

    @Override
    public void setRestoreOutputPath(String restoreOutputPath) {
        this.restoreOutputPath = restoreOutputPath;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRestoreOutputPath() != null)
            sb.append("restoreOutputPath: ").append(getRestoreOutputPath()).append(",");
        sb.append("isRequestCharged: ").append(isRequesterCharged());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ! (obj instanceof RestoreObjectResult)) {
            return false;
        }

        final RestoreObjectResult other = (RestoreObjectResult) obj;

        if (other.getRestoreOutputPath() == null ^ this.getRestoreOutputPath() == null)
            return false;
        if (other.getRestoreOutputPath() != null && !other.getRestoreOutputPath().equals(this.getRestoreOutputPath()))
            return false;
        if (other.isRequesterCharged() != this.isRequesterCharged())
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestoreOutputPath() == null) ? 0 : getRestoreOutputPath().hashCode());
        return hashCode;
    }
}
