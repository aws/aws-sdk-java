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
 * Amazon S3 Regions allow you to choose the geographical Region where Amazon S3
 * will store the buckets you create. You might choose a Region to optimize
 * latency, minimize costs, or address regulatory requirements. For example, if
 * you reside in Europe, you will probably find it advantageous to create
 * buckets in the EU (Ireland) Region.
 * <p>
 * Objects stored in a Region never leave that Region unless you explicitly
 * transfer them to another Region. For example, objects stored in the EU
 * (Ireland) Region never leave it.
 */
public enum Region {

    /**
     * The US Standard Amazon S3 region uses Amazon S3 servers in the United
     * States.
     * <p>
     * This is the default Region. All requests sent to s3.amazonaws.com go
     * to this Region unless you specify a location constraint on a bucket
     * when you create it. The US Standard Region automatically places your
     * data in either Amazon's east or west coast data centers depending on
     * what will provide you with the lowest latency. The US Standard Region
     * provides eventual consistency for all requests.
     */
    US_Standard(null),

    /**
     * The US-West (Northern California) Amazon S3 region uses Amazon S3
     * servers in Northern California.
     * <p>
     * When using buckets in this region, you can optionally set the client
     * endpoint to s3-us-west-1.amazonaws.com on all requests to these
     * buckets to reduce the latency you might experience after the first
     * hour of creating a bucket in this region.
     * <p>
     * In Amazon S3, the US-West (Northern California) Region provides
     * read-after-write consistency for PUTS of new objects in your Amazon
     * S3 bucket and eventual consistency for overwrite PUTS and DELETES.
     */
    US_West("us-west-1"),

    /**
     * The EU (Ireland) Amazon S3 region used Amazon S3 servers in Ireland.
     * <p>
     * In Amazon S3, the EU (Ireland) Region provides read-after-write
     * consistency for PUTS of new objects in your Amazon S3 bucket and eventual
     * consistency for overwrite PUTS and DELETES.
     */
    EU_Ireland("EU"),

    /**
     * The Asia Pacific (Singapore) region uses Amazon S3 servers in Singapore.
     * <p>
     * When using buckets in this region, you can optionally set the client
     * endpoint to s3-ap-southeast-1.amazonaws.com on all requests to these buckets
     * to reduce the latency you might experience after the first hour of
     * creating a bucket in this region.
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
     * Returns the Amazon S3 Region enum value representing the specified Amazon
     * S3 region ID string. If specified string doesn't map to a known Amazon S3
     * region, then an IllegalArgumentException is thrown.
     *
     * @param s3RegionString
     *            The Amazon S3 region ID string.
     *
     * @return The Amazon S3 Region enum value representing the specified Amazon
     *         S3 region ID.
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