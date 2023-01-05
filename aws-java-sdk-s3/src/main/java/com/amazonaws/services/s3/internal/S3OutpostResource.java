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
package com.amazonaws.services.s3.internal;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.s3.EndpointParams;
import com.amazonaws.services.s3.S3Resource;
import com.amazonaws.services.s3.S3ResourceType;
import com.amazonaws.util.ValidationUtils;

/**
 * An {@link S3Resource} that represents an S3 outpost resource
 */
@SdkInternalApi
public final class S3OutpostResource implements S3Resource {

    private final String partition;
    private final String region;
    private final String accountId;
    private final String outpostId;

    private S3OutpostResource(Builder b) {
        this.partition = ValidationUtils.assertStringNotEmpty(b.partition, "partition");
        this.region = ValidationUtils.assertStringNotEmpty(b.region, "region");
        this.accountId = ValidationUtils.assertStringNotEmpty(b.accountId, "accountId");
        this.outpostId = ValidationUtils.assertStringNotEmpty(b.outpostId, "outpostId");
    }

    /**
     * Get a new builder for this class.
     * @return A newly initialized instance of a builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Gets the resource type for this access point.
     * @return This will always return "accesspoint".
     */
    @Override
    public String getType() {
        return S3ResourceType.OUTPOST.toString();
    }

    @Override
    public S3Resource getParentS3Resource() {
        return null;
    }

    /**
     * Gets the Amazon Web Services partition name associated with this access point (e.g.: 'aws').
     * @return the name of the partition.
     */
    @Override
    public String getPartition() {
        return this.partition;
    }

    /**
     * Gets the Amazon Web Services region name associated with this bucket (e.g.: 'us-east-1').
     * @return the name of the region.
     */
    @Override
    public String getRegion() {
        return this.region;
    }

    /**
     * Gets the Amazon Web Services account ID associated with this bucket.
     * @return the Amazon Web Services account ID.
     */
    @Override
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * Gets the outpost ID
     * @return the outpost ID.
     */
    public String getOutpostId() {
        return this.outpostId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        S3OutpostResource that = (S3OutpostResource) o;

        if (partition != null ? ! partition.equals(that.partition) : that.partition != null) return false;
        if (region != null ? ! region.equals(that.region) : that.region != null) return false;
        if (accountId != null ? ! accountId.equals(that.accountId) : that.accountId != null) return false;
        return outpostId.equals(that.outpostId);
    }

    @Override
    public int hashCode() {
        int result = partition != null ? partition.hashCode() : 0;
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (accountId != null ? accountId.hashCode() : 0);
        result = 31 * result + outpostId.hashCode();
        return result;
    }

    /**
     * A builder for {@link S3OutpostResource} objects.
     */
    public static final class Builder {
        private String outpostId;
        private String partition;
        private String region;
        private String accountId;

        private Builder() {
        }

        /**
         * The Amazon Web Services partition associated with the access point.
         */
        public Builder withPartition(String partition) {
            this.partition = partition;
            return this;
        }

        /**
         * The Amazon Web Services region associated with the access point.
         */
        public Builder withRegion(String region) {
            this.region = region;
            return this;
        }

        /**
         * The Amazon Web Services account ID associated with the access point.
         */
        public Builder withAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * The Id of the outpost
         */
        public Builder withOutpostId(String outpostId) {
            this.outpostId = outpostId;
            return this;
        }

        /**
         * Builds an instance of {@link S3OutpostResource}.
         */
        public S3OutpostResource build() {
            return new S3OutpostResource(this);
        }
    }
}
