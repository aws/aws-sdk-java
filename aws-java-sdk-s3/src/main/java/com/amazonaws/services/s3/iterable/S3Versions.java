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

import java.util.Iterator;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ListVersionsRequest;
import com.amazonaws.services.s3.model.S3VersionSummary;
import com.amazonaws.services.s3.model.VersionListing;

/**
 * Provides an easy way to iterate Amazon S3 object versions in a "foreach"
 * statement. For example:
 *
 * <pre class="brush: java">
 * for ( S3VersionSummary summary : S3Versions.forPrefix(s3, &quot;my-bucket&quot;, &quot;photos/&quot;) ) {
 *     System.out.printf(&quot;Version '%s' of key '%s'\n&quot;, summary.getVersionId(), summary.getKey());
 * }
 * </pre>
 * <p>
 * The list of {@link S3VersionSummary}s will be fetched lazily, a page at a
 * time, as they are needed. The size of the page can be controlled with the
 * {@link S3Versions#withBatchSize(int)} method.
 */
public class S3Versions implements Iterable<S3VersionSummary> {

    private AmazonS3 s3;
    private String bucketName;
    private String prefix;
    private String key;
    private Integer batchSize;

    private S3Versions(AmazonS3 s3, String bucketName) {
        this.s3 = s3;
        this.bucketName = bucketName;
    }

    /**
     * Constructs an iterable that covers all the object versions in an Amazon
     * S3 bucket.
     *
     * @param s3
     *            The Amazon S3 client.
     * @param bucketName
     *            The bucket name.
     * @return An iterator for object version summaries.
     */
    public static S3Versions inBucket(AmazonS3 s3, String bucketName) {
        return new S3Versions(s3, bucketName);
    }

    /**
     * Constructs an iterable that covers the versions in an Amazon S3 bucket
     * where the object key begins with the given prefix.
     *
     * @param s3
     *            The Amazon S3 client.
     * @param bucketName
     *            The bucket name.
     * @param prefix
     *            The prefix.
     * @return An iterator for object version summaries.
     */
    public static S3Versions withPrefix(AmazonS3 s3, String bucketName,
            String prefix) {
        S3Versions versions = new S3Versions(s3, bucketName);
        versions.prefix = prefix;
        return versions;
    }

    /**
     * Constructs an iterable that covers the versions of a single Amazon S3
     * object.
     *
     * @param s3
     *            The Amazon S3 client.
     * @param bucketName
     *            The bucket name.
     * @param key
     *            The key.
     * @return An iterator for object version summaries.
     */
    public static S3Versions forKey(AmazonS3 s3, String bucketName, String key) {
        S3Versions versions = new S3Versions(s3, bucketName);
        versions.key = key;
        return versions;
    }

    /**
     * Sets the batch size, i.e., how many {@link S3VersionSummary}s will be fetched at
     * once.
     *
     * @param batchSize
     *            How many object summaries to fetch at once.
     */
    public S3Versions withBatchSize(int batchSize) {
        this.batchSize = batchSize;
        return this;
    }

    public Integer getBatchSize() {
        return batchSize;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getKey() {
        return key;
    }

    public AmazonS3 getS3() {
        return s3;
    }

    public String getBucketName() {
        return bucketName;
    }

    private class VersionIterator implements Iterator<S3VersionSummary> {

        private VersionListing currentListing = null;
        private Iterator<S3VersionSummary> currentIterator = null;
        private S3VersionSummary nextSummary = null;

        @Override
        public boolean hasNext() {
            prepareCurrentListing();
            return nextMatchingSummary() != null;
        }

        @Override
        public S3VersionSummary next() {
            prepareCurrentListing();
            S3VersionSummary returnValue = nextMatchingSummary();
            nextSummary = null;
            return returnValue;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private S3VersionSummary nextMatchingSummary() {
            if (getKey() == null
                    || (nextSummary != null && nextSummary.getKey().equals(
                            getKey()))) {
                return nextSummary;
            } else {
                return null;
            }
        }

        private void prepareCurrentListing() {
            while (currentListing == null
                    || (!currentIterator.hasNext() && currentListing
                            .isTruncated())) {
                if (currentListing == null) {
                    ListVersionsRequest req = new ListVersionsRequest();
                    req.setBucketName(getBucketName());

                    if (getKey() != null) {
                        req.setPrefix(getKey());
                    } else {
                        req.setPrefix(getPrefix());
                    }

                    req.setMaxResults(getBatchSize());
                    currentListing = getS3().listVersions(req);
                } else {
                    currentListing = getS3().listNextBatchOfVersions(
                            currentListing);
                }
                currentIterator = currentListing.getVersionSummaries()
                        .iterator();
            }

            if (nextSummary == null && currentIterator.hasNext()) {
                nextSummary = currentIterator.next();
            }
        }

    }

    @Override
    public Iterator<S3VersionSummary> iterator() {
        return new VersionIterator();
    }

}
