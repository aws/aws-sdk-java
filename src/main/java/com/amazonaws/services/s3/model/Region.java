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
 * Specifies constants that define Amazon S3 Regions.
 * <p>
 * Amazon S3 Regions allow the user to choose the geographical region where Amazon S3
 * will store the buckets the user creates. Choose a Amazon S3 Region to optimize
 * latency, minimize costs, or address regulatory requirements.
 * </p>
 * <p>
 * Objects stored in a Amazon S3 Region never leave that region unless explicitly
 * transfered to another region.
 * </p>
 */
public enum Region {

    /**
     * The US Standard Amazon S3 Region. This region
     * uses Amazon S3 servers located in the United
     * States.
     * <p>
     * This is the default Amazon S3 Region. All requests sent to
     * <code>s3.amazonaws.com</code> go
     * to this region unless a location constraint is specified when creating a bucket.
     * The US Standard Region automatically places
     * data in either Amazon's east or west coast data centers depending on
     * which one provides the lowest latency. The US Standard Region
     * provides eventual consistency for all requests.
     * </p>
     */
    US_Standard(null),

    /**
     * The US-West (Northern California) Amazon S3 Region. This region uses Amazon S3
     * servers located in Northern California.
     * <p>
     * When using buckets in this region, optionally set the client
     * endpoint to <code>s3-us-west-1.amazonaws.com</code> on all requests to these
     * buckets to reduce any latency experienced after the first
     * hour of creating a bucket in this region.
     * </p>
     * <p>
     * In Amazon S3, the US-West (Northern California) Region provides
     * read-after-write consistency for PUTS of new objects in Amazon
     * S3 buckets and eventual consistency for overwrite PUTS and DELETES.
     * </p>
     */
    US_West("us-west-1"),

    /**
     * The EU (Ireland) Amazon S3 Region. This region uses Amazon S3 servers located
     * in Ireland.
     * <p>
     * In Amazon S3, the EU (Ireland) Region provides read-after-write
     * consistency for PUTS of new objects in Amazon S3 buckets and eventual
     * consistency for overwrite PUTS and DELETES.
     * </p>
     */
    EU_Ireland("EU"),

    /**
     * The Asia Pacific (Singapore) Region. This region uses Amazon S3 servers located
     * in Singapore.
     * <p>
     * When using buckets in this region, optionally set the client
     * endpoint to <code>s3-ap-southeast-1.amazonaws.com</code> on all requests to these buckets
     * to reduce any latency experienced after the first hour of
     * creating a bucket in this region.
     * </p>
     */
    AP_Singapore("ap-southeast-1");

    /** The unique ID representing each region. */
    private final String regionId;

    /**
     * Constructs a new region with the specified region ID.
     *
     * @param regionId
     *            The unique ID representing the S3 region.
     */
    private Region(String regionId) {
        this.regionId = regionId;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return regionId;
    }

    /**
     * Returns the Amazon S3 Region enumeration value representing the specified Amazon
     * S3 Region ID string. If specified string doesn't map to a known Amazon S3
     * Region, then an <code>IllegalArgumentException</code> is thrown.
     *
     * @param s3RegionString
     *            The Amazon S3 region ID string.
     *
     * @return The Amazon S3 Region enumeration value representing the specified Amazon
     *         S3 Region ID.
     *
     * @throws IllegalArgumentException
     *             If the specified value does not map to one of the known
     *             Amazon S3 regions.
     */
    public static Region fromValue(String s3RegionString) throws IllegalArgumentException {
        for (Region region : Region.values()) {
            String regionString = region.toString();
            if (regionString == null && s3RegionString == null) return region;
            if (regionString != null && regionString.equals(s3RegionString)) return region;
        }

        throw new IllegalArgumentException(
                "Cannot create enum from " + s3RegionString + " value!");
    }
}