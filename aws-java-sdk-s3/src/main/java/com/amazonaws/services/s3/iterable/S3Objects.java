/*
 * Copyright 2012-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.iterable;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ListObjectsRequest;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import java.util.Iterator;

/**
 * Provides an easy way to iterate Amazon S3 objects in a "foreach" statement.
 * For example:
 *
 * <pre class="brush: java">
 * for ( S3ObjectSummary summary : S3Objects.withPrefix(s3, &quot;my-bucket&quot;, &quot;photos/&quot;) ) {
 *     System.out.printf(&quot;Object with key '%s'\n&quot;, summary.getKey());
 * }
 * </pre>
 * <p>
 * The list of {@link S3ObjectSummary}s will be fetched lazily, a page at a
 * time, as they are needed. The size of the page can be controlled with the
 * {@link S3Objects#withBatchSize(int)} method.
 */
public class S3Objects implements Iterable<S3ObjectSummary> {

    private AmazonS3 s3;
    private String prefix = null;
    private String bucketName;
    private Integer batchSize = null;
    private String delimiter;
    private String marker;
    private String encodingType;
    private boolean requesterPays;

    private S3Objects(AmazonS3 s3, String bucketName) {
        this.s3 = s3;
        this.bucketName = bucketName;
    }

    /**
     * Constructs an iterable that covers all the objects in an Amazon S3
     * bucket.
     *
     * @param s3
     *            The Amazon S3 client.
     * @param bucketName
     *            The bucket name.
     * @return An iterator for object summaries.
     */
    public static S3Objects inBucket(AmazonS3 s3, String bucketName) {
        return new S3Objects(s3, bucketName);
    }

    /**
     * Constructs an iterable that covers the objects in an Amazon S3 bucket
     * where the key begins with the given prefix.
     *
     * @param s3
     *            The Amazon S3 client.
     * @param bucketName
     *            The bucket name.
     * @param prefix
     *            The prefix.
     * @return An iterator for object summaries.
     */
    public static S3Objects withPrefix(AmazonS3 s3, String bucketName, String prefix) {
        S3Objects objects = new S3Objects(s3, bucketName);
        objects.prefix = prefix;
        return objects;
    }

    /**
     * Sets the batch size, i.e., how many {@link S3ObjectSummary}s will be
     * fetched at once.
     *
     * @param batchSize
     *            How many object summaries to fetch at once.
     */
    public S3Objects withBatchSize(int batchSize) {
        this.batchSize = batchSize;
        return this;
    }

    /**
     * @see ListObjectsRequest#withRequesterPays(boolean)
     */
    public void withRequesterPays(boolean requesterPays) {
        this.requesterPays = requesterPays;
    }

    /**
     * @see ListObjectsRequest#withEncodingType(String)
     */
    public void withEncodingType(String encodingType) {
        this.encodingType = encodingType;
    }

    /**
     * @see ListObjectsRequest#withMarker(String)
     */
    public void withMarker(String marker) {
        this.marker = marker;
    }

    /**
     * @see ListObjectsRequest#withDelimiter(String)
     */
    public void withDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    public Integer getBatchSize() {
        return batchSize;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getBucketName() {
        return bucketName;
    }

    public String getDelimiter() {
        return delimiter;
    }

    public String getMarker() {
        return marker;
    }

    public String getEncodingType() {
        return encodingType;
    }

    public boolean isRequesterPays() {
        return requesterPays;
    }

    public AmazonS3 getS3() {
        return s3;
    }

    private class S3ObjectIterator implements Iterator<S3ObjectSummary> {

        private ObjectListing currentListing = null;

        private Iterator<S3ObjectSummary> currentIterator = null;

        @Override
        public boolean hasNext() {
            prepareCurrentListing();
            return currentIterator.hasNext();
        }

        @Override
        public S3ObjectSummary next() {
            prepareCurrentListing();
            return currentIterator.next();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private void prepareCurrentListing() {
            while (currentListing == null || (!currentIterator.hasNext() && currentListing.isTruncated())) {

                if (currentListing == null) {
                    ListObjectsRequest req = new ListObjectsRequest();
                    req.setBucketName(getBucketName());
                    req.setPrefix(getPrefix());
                    req.setMaxKeys(getBatchSize());
                    req.setDelimiter(getDelimiter());
                    req.setMarker(getMarker());
                    req.setEncodingType(getEncodingType());
                    req.setRequesterPays(isRequesterPays());
                    currentListing = getS3().listObjects(req);
                } else {
                    currentListing = getS3().listNextBatchOfObjects(currentListing);
                }

                currentIterator = currentListing.getObjectSummaries().iterator();
            }
        }

    }

    @Override
    public Iterator<S3ObjectSummary> iterator() {
        return new S3ObjectIterator();
    }

}
