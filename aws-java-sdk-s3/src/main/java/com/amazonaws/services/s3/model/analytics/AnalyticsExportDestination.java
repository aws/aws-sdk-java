/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.model.analytics;

import java.io.Serializable;

/**
 * The place to store the data for an analysis.
 */
public class AnalyticsExportDestination implements Serializable {

    private AnalyticsS3BucketDestination s3BucketDestination;

    public AnalyticsS3BucketDestination getS3BucketDestination() {
        return s3BucketDestination;
    }

    public void setS3BucketDestination(AnalyticsS3BucketDestination s3BucketDestination) {
        this.s3BucketDestination = s3BucketDestination;
    }

    public AnalyticsExportDestination withS3BucketDestination(AnalyticsS3BucketDestination s3BucketDestination) {
        setS3BucketDestination(s3BucketDestination);
        return this;
    }
}
