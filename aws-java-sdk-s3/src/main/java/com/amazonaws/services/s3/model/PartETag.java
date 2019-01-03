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
 * Container for the part number and ETag of an uploaded part. After the part is
 * uploaded to Amazon S3, this data is used when completing the multipart
 * upload.
 */
public class PartETag implements Serializable {

    /** The part number of the associated part. */
    private int partNumber;

    /** The entity tag generated from the content of the associated part. */
    private String eTag;


    /**
     * Constructs an instance of PartETag and sets the part number and ETag.
     *
     * @param partNumber
     *            The part number.
     * @param eTag
     *            the associated ETag for the part number.
     */
    public PartETag(int partNumber, String eTag) {
        this.partNumber = partNumber;
        this.eTag = eTag;
    }
    

    /**
     * Returns the part number of the associated part.
     *
     * @return the part number of the associated part.
     */
    public int getPartNumber() {
        return partNumber;
    }

    /**
     * Sets the part number of the associated part.
     *
     * @param partNumber
     *            the part number of the associated part.
     */
    public void setPartNumber(int partNumber) {
        this.partNumber = partNumber;
    }

    /**
     * Sets the part number of the associated part, and returns this updated
     * PartETag object so that additional method calls can be chained together.
     *
     * @param partNumber
     *            the part number of the associated part.
     *
     * @return This updated PartETag object.
     */
    public PartETag withPartNumber(int partNumber) {
        this.partNumber = partNumber;
        return this;
    }

    /**
     * Returns the entity tag generated from the content of the associated part.
     *
     * @return the entity tag generated from the content of the associated part.
     */
    public String getETag() {
        return eTag;
    }

    /**
     * Sets the entity tag generated from the content of the associated part.
     *
     * @param eTag
     *            the entity tag generated from the content of the associated
     *            part.
     */
    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * Sets the entity tag generated from the content of the associated part,
     * and returns this updated PartETag object so that additional method calls
     * can be chained together.
     *
     * @param eTag
     *            the entity tag generated from the content of the associated
     *            part.
     *
     * @return This updated PartETag object.
     */
    public PartETag withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

}
