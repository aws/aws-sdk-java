/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.util.ValidationUtils;

/**
 * An {@link S3Resource} that represents an S3 object.
 */
@SdkInternalApi
public final class S3ObjectResource implements S3Resource {
    private static final S3ResourceType S3_RESOURCE_TYPE = S3ResourceType.OBJECT;

    private final S3Resource parentS3Resource;
    private final String key;

    private S3ObjectResource(Builder b) {
        this.parentS3Resource = validateParentS3Resource(b.parentS3Resource);
        this.key = ValidationUtils.assertStringNotEmpty(b.key, "key");
    }

    /**
     * Get a new builder for this class.
     * @return A newly initialized instance of a builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Gets the resource type for this S3 object.
     * @return This will always return "object".
     */
    @Override
    public String getType() {
        return S3_RESOURCE_TYPE.toString();
    }

    /**
     * Gets the Amazon Web Services partition name associated with the S3 object (e.g.: 'aws').
     * @return the name of the partition.
     */
    @Override
    public String getPartition() {
        return this.parentS3Resource.getPartition();
    }

    /**
     * Gets the Amazon Web Services region name associated with the S3 object (e.g.: 'us-east-1').
     * @return the name of the region or null if the region has not been specified (e.g. the resource is in the
     * global namespace).
     */
    @Override
    public String getRegion() {
        return this.parentS3Resource.getRegion();
    }

    /**
     * Gets the Amazon Web Services account ID associated with the S3 object.
     * @return the Amazon Web Services account ID or null if the account ID has not been specified.
     */
    @Override
    public String getAccountId() {
        return this.parentS3Resource.getAccountId();
    }

    /**
     * Gets the key of the S3 object.
     * @return the key of the S3 object.
     */
    public String getKey() {
        return this.key;
    }

    /**
     * Gets the parent S3 resource of this object. This represents the resource the S3 object is contained within or
     * addressed through. This will either be a {@link S3BucketResource} or a {@link S3AccessPointResource}.
     * @return The parent S3 resource.
     */
    public S3Resource getParentS3Resource() {
        return parentS3Resource;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        S3ObjectResource that = (S3ObjectResource) o;

        if (parentS3Resource != null ? !parentS3Resource.equals(that.parentS3Resource) : that.parentS3Resource != null) {
            return false;
        }
        return key != null ? key.equals(that.key) : that.key == null;
    }

    @Override
    public int hashCode() {
        int result = parentS3Resource != null ? parentS3Resource.hashCode() : 0;
        result = 31 * result + (key != null ? key.hashCode() : 0);
        return result;
    }

    /**
     * A builder for {@link S3ObjectResource} objects.
     */
    public static final class Builder {
        private S3Resource parentS3Resource;
        private String key;

        /**
         * The S3 resource this object is associated with (contained within). Only {@link S3BucketResource} and
         * {@link S3AccessPointResource} are valid parent resource types.
         */
        public void setParentS3Resource(S3Resource parentS3Resource) {
            this.parentS3Resource = parentS3Resource;
        }

        /**
         * The S3 resource this object is associated with (contained within). Only {@link S3BucketResource} and
         * {@link S3AccessPointResource} are valid parent resource types.
         */
        public Builder withParentS3Resource(S3Resource parentS3Resource) {
            setParentS3Resource(parentS3Resource);
            return this;
        }

        /**
         * The key of the S3 object.
         */
        public void setKey(String key) {
            this.key = key;
        }

        /**
         * The key of the S3 object.
         */
        public Builder withKey(String key) {
            setKey(key);
            return this;
        }

        /**
         * Builds an instance of {@link S3BucketResource}.
         */
        public S3ObjectResource build() {
            return new S3ObjectResource(this);
        }
    }

    private S3Resource validateParentS3Resource(S3Resource parentS3Resource) {
        ValidationUtils.assertNotNull(parentS3Resource, "parentS3Resource");

        if (!S3ResourceType.ACCESS_POINT.toString().equals(parentS3Resource.getType())
            && !S3ResourceType.BUCKET.toString().equals(parentS3Resource.getType())) {
            throw new IllegalArgumentException("Invalid 'parentS3Resource' type. An S3 object resource must be " +
                                                   "associated with either a bucket or access-point parent resource.");
        }

        return parentS3Resource;
    }
}
