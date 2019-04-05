/*
 * Copyright 2015-2019 Amazon Technologies, Inc.
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
package com.amazonaws.services.s3.model;
import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Request object for parameters of listing next batch of objects.
 */
public class ListNextBatchOfObjectsRequest extends AmazonWebServiceRequest implements Serializable {

    private ObjectListing previousObjectListing;

    /**
     * Creates a request object for listing next batch of objects.
     *
     * @param previousObjectListing
     * 			The previous object listing whose features are to be fetched.
     */
    public ListNextBatchOfObjectsRequest(ObjectListing previousObjectListing) {
        setPreviousObjectListing(previousObjectListing);
    }

    /**
     * Returns the previous object listing.
     * @return The previous object listing.
     */
    public ObjectListing getPreviousObjectListing() {
        return previousObjectListing;
    }

    /**
     * Sets the previous object listing and all the features of the next object listing as well.
     * @param previousObjectListing
     * 			This parameter must be specified.
     */
    public void setPreviousObjectListing(ObjectListing previousObjectListing) {
        if(previousObjectListing == null) {
            throw new IllegalArgumentException("The parameter previousObjectListing must be specified.");
        }
        this.previousObjectListing = previousObjectListing;
    }

    /**
     * Sets the previous object listing and returns the updated request object so that additional
     * method calls can be chained together.
     *
     * @param previousObjectListing
     * 			The previous object listing whose features are to be fetched.
     * @return The updated request object so that additional method calls can be chained together.
     */
    public ListNextBatchOfObjectsRequest withPreviousObjectListing(ObjectListing previousObjectListing) {
        setPreviousObjectListing(previousObjectListing);
        return this;
    }

    /**
     * Creates a new {@link ListObjectsRequest} object using the previous object listing.
     * @return A new {@link ListObjectsRequest} object using the previous object listing.
     */
    public ListObjectsRequest toListObjectsRequest() {
        return new ListObjectsRequest(previousObjectListing.getBucketName(),
                previousObjectListing.getPrefix(),
                previousObjectListing.getNextMarker(),
                previousObjectListing.getDelimiter(),
                Integer.valueOf(previousObjectListing.getMaxKeys()))
                .withEncodingType(previousObjectListing.getEncodingType());
    }

}
