/*
 * Copyright 2016-2019 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.s3.internal;

public interface S3RequesterChargedResult {

    /**
     * Returns true if the user has enabled Requester Pays option when
     * conducting this operation from Requester Pays Bucket; else false.
     *
     * <p>
     * If a bucket is enabled for Requester Pays, then any attempt of operation
     * from it without Requester Pays enabled will result in
     * a 403 error and the bucket owner will be charged for the request.
     *
     * <p>
     * Enabling Requester Pays disables the ability to have anonymous access to
     * this bucket
     *
     * @return true if the user has enabled Requester Pays option for
     *         conducting this operation from Requester Pays Bucket.
     */
    public boolean isRequesterCharged();

    /**
     * Used for conducting this operation from a Requester Pays Bucket. If
     * set the requester is charged for conducting the operation from the bucket.
     *
     * <p>
     * If a bucket is enabled for Requester Pays, then any attempt of operation
     * from it without Requester Pays enabled will result in a 403 error
     * and the bucket owner will be charged for the request.
     *
     * @param isRequesterCharged
     *            Indicates requester is charged for this operation.
     */
    public void setRequesterCharged(boolean isRequesterCharged);
}
