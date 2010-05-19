/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Amazon S3 offers multiple storage classes for customer's different needs. The
 * standard storage class is the default storage class, and means that several
 * redundant copies of your data will be stored in different locations.
 * <p>
 * The reduced redundancy storage class offers customers who are using Amazon S3
 * for storing non-critical, reproducible data a lower cost, highly available,
 * but less redundant storage option.
 */
public enum StorageClass {

    /**
     * Standard storage is the default Amazon S3 storage class, and is
     * recommended for critical, non-reproducible data. The standard storage
     * class offers a highly available and highly redundant storage option for
     * an affordable price.
     */
    Standard("STANDARD"),

    /**
     * Reduced redundancy storage allows customers to reduce their storage costs
     * in return for a reduced level of data redundancy. Customers who are using
     * Amazon S3 for storing non-critical, reproducible data can now choose a
     * lower cost, highly available, less redundant storage option.
     */
    ReducedRedundancy("REDUCED_REDUNDANCY");


    /**
     * Returns the Amazon S3 storage class enum value representing the
     * specified Amazon S3 storage class ID string. If specified string
     * doesn't map to a known Amazon S3 storage class, then an
     * IllegalArgumentException is thrown.
     *
     * @param s3StorageClassString
     *            The Amazon S3 storage class ID string.
     *
     * @return The Amazon S3 StorageClass enum value representing the
     *         specified Amazon S3 storage class ID.
     *
     * @throws IllegalArgumentException
     *             If the specified value does not map to one of the known
     *             Amazon S3 storage classes.
     */
    public static StorageClass fromValue(String s3StorageClassString) throws IllegalArgumentException {
        for (StorageClass storageClass : StorageClass.values()) {
            if (storageClass.toString().equals(s3StorageClassString)) return storageClass;
        }

        throw new IllegalArgumentException(
                "Cannot create enum from " + s3StorageClassString + " value!");
    }


    private final String storageClassId;

    private StorageClass(String id) {
        this.storageClassId = id;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return storageClassId;
    }

}