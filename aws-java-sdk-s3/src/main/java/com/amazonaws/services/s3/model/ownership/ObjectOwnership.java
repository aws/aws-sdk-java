/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.model.ownership;

/**
 * <p>
 *     The container element for object ownership for a bucket's ownership controls.
 * </p>
 * <p>
 *     BucketOwnerPreferred - Objects uploaded to the bucket change ownership to the bucket owner if
 *     the objects are uploaded with the <code>bucket-owner-full-control</code> canned ACL.
 * </p>
 * <p>
 *     ObjectWriter - The uploading account will own the object if the object is uploaded with
 *     the <code>bucket-owner-full-control</code> canned ACL.
 * </p>
 */
public enum ObjectOwnership {

    BucketOwnerPreferred("BucketOwnerPreferred"),

    ObjectWriter("ObjectWriter")
    ;

    public static ObjectOwnership fromValue(String s3OwnershipString) throws IllegalArgumentException {
        for (ObjectOwnership objectOwnership : ObjectOwnership.values()) {
            if (objectOwnership.toString().equals(s3OwnershipString)) return objectOwnership;
        }

        throw new IllegalArgumentException(
            "Cannot create enum from " + s3OwnershipString + " value!");
    }

    private final String objectOwnershipId;

    private ObjectOwnership(String id) {
        this.objectOwnershipId = id;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return objectOwnershipId;
    }

}
