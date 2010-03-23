/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Portions copyright 2006-2009 James Murty. Please see LICENSE.txt
 * for applicable license terms and NOTICE.txt for applicable notices.
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

import java.util.Date;

/**
 * Represents an Amazon S3 bucket.
 */
public class Bucket {
    private static final long serialVersionUID = -8646831898339939580L;

    /** The name of this S3 bucket */
    private String name = null;

    /** The details on the owner of this bucket */
    private Owner owner = null;

    /** The date this bucket was created */
    private Date creationDate = null;

    /**
     * Create a bucket without any name specified
     */
    public Bucket() {}

    /**
     * Create a bucket with a name. All buckets in S3 share a single namespace,
     * so choose a unique name for your bucket.
     *
     * @param name
     *            the name for the bucket
     */
    public Bucket(String name) {
        this.name = name;
    }

    /**
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return "S3Bucket [name=" + getName()
                + ", creationDate=" + getCreationDate()
                + ", owner=" + getOwner() + "]";
    }

    /**
     * @return the bucket's owner, or null if it is unknown.
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * Sets the bucket's owner in S3 - this should only be used internally by
     * the AWS Java client methods that retrieve information directly from S3.
     *
     * @param owner
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * Returns this bucket's creation date, or null if not known.
     *
     * @return this bucket's creation date, or null if not known.
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the bucket's creation date in S3 - this should only be used
     * internally by AWS Java client methods that retrieve information directly
     * from S3.
     *
     * @param creationDate
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * Returns the name of this bucket.
     *
     * @return the name of this bucket.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the bucket. All buckets in S3 share a single namespace,
     * so choose a unique name for your bucket.
     *
     * @param name
     *            the name for the bucket
     */
    public void setName(String name) {
        this.name = name;
    }

}
