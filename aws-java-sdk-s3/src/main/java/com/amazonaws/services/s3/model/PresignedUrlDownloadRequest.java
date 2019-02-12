/*
 * Copyright 2018-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.net.URL;

/**
 * Request class to download objects using presigned urls. The class has options to set the presigned url to
 * download the request from, range headers to download partial objects.
 *
 * If custom headers are used in generating the url, you can set them through {@link #putCustomRequestHeader(String, String)}
 * method. If any signed headers or parameters are missing from the request, a Signature mismatch error will be thrown from S3.
 * Ensure you set all the custom headers/parameters that are used for creating the presigned url.
 */
public class PresignedUrlDownloadRequest extends AmazonWebServiceRequest implements Serializable {

    /** Required member indicating the endpoint to send the request **/
    private URL presignedUrl;

    /** Optional member indicating the byte range of data to retrieve */
    private long[] range;

    public PresignedUrlDownloadRequest(URL presignedUrl) {
        this.presignedUrl = presignedUrl;
    }

    /**
     * @return The presigned url to which the request will be sent
     */
    public URL getPresignedUrl() {
        return presignedUrl;
    }

    /**
     * @param presignedUrl sets the presigned url to send the request to
     */
    public void setPresignedUrl(URL presignedUrl) {
        this.presignedUrl = presignedUrl;
    }

    /**
     * @param presignedUrl sets the presigned url to send the request to
     * @return This object for method chaining
     */
    public PresignedUrlDownloadRequest withPresignedUrl(URL presignedUrl) {
        setPresignedUrl(presignedUrl);
        return this;
    }

    /**
     * <p>
     * Gets the optional inclusive byte range within the desired object
     * that will be downloaded by this request.
     * </p>
     * <p>
     * The range is returned as
     * a two element array, containing the start and end index of the byte range.
     * If no byte range has been specified, the entire object is downloaded and
     * this method returns <code>null</code>.
     * </p>
     * @return A two element array indicating the inclusive start index and end index
     *         within the object being downloaded by this request.
     *         Returns <code>null</code> if no range has been specified,
     *         and the whole object is
     *         to be downloaded.
     *
     * @see #setRange(long, long)
     */
    public long[] getRange() {
        return range == null ? null : range.clone();
    }

    /**
     * <p>
     * Sets the optional inclusive byte range within the desired object that
     * will be downloaded by this request.
     * </p>
     * <p>
     * The first byte in an object has
     * position 0; as an example, the first ten bytes of an object can be
     * downloaded by specifying a range of 0 to 9.
     * </p>
     * <p>
     * If no byte range is specified, this request downloads the entire
     * object from Amazon S3.
     * </p>
     *
     * @param start
     *            The start of the inclusive byte range to download.
     * @param end
     *            The end of the inclusive byte range to download.
     *
     * @see #getRange()
     */
    public void setRange(long start, long end) {
        range = new long[] {start, end};
    }

    /**
     * <p>
     * Sets the optional inclusive byte range within the desired object that
     * will be downloaded by this request.
     * Returns this {@link GetObjectRequest}, enabling additional method
     * calls to be chained together.
     * </p>
     * <p>
     * The first byte in an object has
     * position 0; as an example, the first ten bytes of an object can be
     * downloaded by specifying a range of 0 to 9.
     * </p>
     * <p>
     * If no byte range is specified, this request downloads the entire
     * object from Amazon S3.
     * </p>
     *
     * @param start
     *            The start of the inclusive byte range to download.
     * @param end
     *            The end of the inclusive byte range to download.
     *
     * @return This {@link GetObjectRequest}, enabling additional method
     *         calls to be chained together.
     *
     * @see #getRange()
     * @see #setRange(long, long)
     */
    public PresignedUrlDownloadRequest withRange(long start, long end) {
        setRange(start, end);
        return this;
    }

    /**
     * Creates and returns a new copy of the request.
     * This method also copies the internal state of the base {@link AmazonWebServiceRequest} class.
     */
    public PresignedUrlDownloadRequest clone() {
        PresignedUrlDownloadRequest target = new PresignedUrlDownloadRequest(getPresignedUrl());
        copyBaseTo(target);

        if (getRange() != null) {
            target.setRange(getRange()[0], getRange()[1]);
        }

        return target;
    }
}
