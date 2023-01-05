/*
 * Copyright 2019-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import static com.amazonaws.services.s3.S3ResourceType.OBJECT_LAMBDAS;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.s3.S3Resource;
import com.amazonaws.util.ValidationUtils;

/**
 * An {@link S3Resource} that represents an S3 Object Lambdas resource.
 */
@SdkInternalApi
public final class S3ObjectLambdasResource implements S3Resource {
    private final String partition;
    private final String region;
    private final String accountId;
    private final String accessPointName;

    private S3ObjectLambdasResource(Builder b) {
        this.partition = ValidationUtils.assertStringNotEmpty(b.partition, "partition");
        this.region = ValidationUtils.assertStringNotEmpty(b.region, "region");
        this.accountId = ValidationUtils.assertStringNotEmpty(b.accountId, "accountId");
        this.accessPointName = ValidationUtils.assertStringNotEmpty(b.accessPointName, "accessPointName");
    }

    @Override
    public String getType() {
        return OBJECT_LAMBDAS.toString();
    }

    @Override
    public S3Resource getParentS3Resource() {
        return null;
    }

    @Override
    public String getPartition() {
        return partition;
    }

    @Override
    public String getRegion() {
        return region;
    }

    @Override
    public String getAccountId() {
        return accountId;
    }

    /**
     * @return The name of the access point.
     */
    public String getAccessPointName() {
        return accessPointName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        S3ObjectLambdasResource that = (S3ObjectLambdasResource) o;

        if (partition != null ? !partition.equals(that.partition) : that.partition != null) return false;
        if (region != null ? !region.equals(that.region) : that.region != null) return false;
        if (accountId != null ? !accountId.equals(that.accountId) : that.accountId != null) return false;
        return accessPointName != null ? accessPointName.equals(that.accessPointName) : that.accessPointName == null;
    }

    @Override
    public int hashCode() {
        int result = partition != null ? partition.hashCode() : 0;
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (accountId != null ? accountId.hashCode() : 0);
        result = 31 * result + (accessPointName != null ? accessPointName.hashCode() : 0);
        return result;
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * A builder for {@link S3OutpostResource} objects.
     */
    public static final class Builder {
        private String partition;
        private String region;
        private String accountId;
        private String accessPointName;

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
         * The name of the access point.
         */
        public Builder withAccessPointName(String accessPointName) {
            this.accessPointName = accessPointName;
            return this;
        }

        /**
         * Builds an instance of {@link S3ObjectLambdasResource}.
         */
        public S3ObjectLambdasResource build() {
            return new S3ObjectLambdasResource(this);
        }
    }
}
