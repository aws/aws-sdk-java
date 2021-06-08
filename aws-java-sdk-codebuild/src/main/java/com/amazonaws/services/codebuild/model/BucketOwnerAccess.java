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
package com.amazonaws.services.codebuild.model;

import javax.annotation.Generated;

/**
 * <p>
 * Specifies the access for objects that are uploaded to an Amazon S3 bucket that is owned by another account.
 * </p>
 * <p>
 * By default, only the account that uploads the objects to the bucket has access to these objects. This property allows
 * you to give the bucket owner access to these objects.
 * </p>
 * <dl>
 * <dt>NONE</dt>
 * <dd>
 * <p>
 * The bucket owner does not have access to the objects. This is the default.
 * </p>
 * </dd>
 * <dt>READ_ONLY</dt>
 * <dd>
 * <p>
 * The bucket owner has read only access to the objects. The uploading account retains ownership of the objects.
 * </p>
 * </dd>
 * <dt>FULL</dt>
 * <dd>
 * <p>
 * The bucket owner has full access to the objects. Object ownership is determined by the following criteria:
 * </p>
 * <ul>
 * <li>
 * <p>
 * If the bucket is configured with the <b>Bucket owner preferred</b> setting, the bucket owner owns the objects. The
 * uploading account will have object access as specified by the bucket's policy.
 * </p>
 * </li>
 * <li>
 * <p>
 * Otherwise, the uploading account retains ownership of the objects.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information about Amazon S3 object ownership, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/about-object-ownership.html">Controlling ownership of
 * uploaded objects using S3 Object Ownership</a> in the <i>Amazon Simple Storage Service User Guide</i>.
 * </p>
 * </dd>
 * </dl>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum BucketOwnerAccess {

    NONE("NONE"),
    READ_ONLY("READ_ONLY"),
    FULL("FULL");

    private String value;

    private BucketOwnerAccess(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return BucketOwnerAccess corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static BucketOwnerAccess fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (BucketOwnerAccess enumEntry : BucketOwnerAccess.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
