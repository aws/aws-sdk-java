/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.metrics;

/**
 * Service (eg S3, DynamoDB, etc.) specific Metric type.
 */
public interface ServiceMetricType extends MetricType {
    public String getServiceName();

    public static final String UPLOAD_THROUGHPUT_NAME_SUFFIX = "UploadThroughput";
    public static final String UPLOAD_BYTE_COUNT_NAME_SUFFIX = "UploadByteCount";
    public static final String DOWNLOAD_THROUGHPUT_NAME_SUFFIX = "DownloadThroughput";
    public static final String DOWNLOAD_BYTE_COUNT_NAME_SUFFIX = "DownloadByteCount";
}
