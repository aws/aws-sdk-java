/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.kinesisfirehose.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisfirehose.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ElasticsearchDestinationConfigurationMarshaller
 */
public class ElasticsearchDestinationConfigurationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ElasticsearchDestinationConfiguration elasticsearchDestinationConfiguration, StructuredJsonGenerator jsonGenerator) {

        if (elasticsearchDestinationConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (elasticsearchDestinationConfiguration.getRoleARN() != null) {
                jsonGenerator.writeFieldName("RoleARN").writeValue(elasticsearchDestinationConfiguration.getRoleARN());
            }
            if (elasticsearchDestinationConfiguration.getDomainARN() != null) {
                jsonGenerator.writeFieldName("DomainARN").writeValue(elasticsearchDestinationConfiguration.getDomainARN());
            }
            if (elasticsearchDestinationConfiguration.getIndexName() != null) {
                jsonGenerator.writeFieldName("IndexName").writeValue(elasticsearchDestinationConfiguration.getIndexName());
            }
            if (elasticsearchDestinationConfiguration.getTypeName() != null) {
                jsonGenerator.writeFieldName("TypeName").writeValue(elasticsearchDestinationConfiguration.getTypeName());
            }
            if (elasticsearchDestinationConfiguration.getIndexRotationPeriod() != null) {
                jsonGenerator.writeFieldName("IndexRotationPeriod").writeValue(elasticsearchDestinationConfiguration.getIndexRotationPeriod());
            }
            if (elasticsearchDestinationConfiguration.getBufferingHints() != null) {
                jsonGenerator.writeFieldName("BufferingHints");
                ElasticsearchBufferingHintsJsonMarshaller.getInstance().marshall(elasticsearchDestinationConfiguration.getBufferingHints(), jsonGenerator);
            }
            if (elasticsearchDestinationConfiguration.getRetryOptions() != null) {
                jsonGenerator.writeFieldName("RetryOptions");
                ElasticsearchRetryOptionsJsonMarshaller.getInstance().marshall(elasticsearchDestinationConfiguration.getRetryOptions(), jsonGenerator);
            }
            if (elasticsearchDestinationConfiguration.getS3BackupMode() != null) {
                jsonGenerator.writeFieldName("S3BackupMode").writeValue(elasticsearchDestinationConfiguration.getS3BackupMode());
            }
            if (elasticsearchDestinationConfiguration.getS3Configuration() != null) {
                jsonGenerator.writeFieldName("S3Configuration");
                S3DestinationConfigurationJsonMarshaller.getInstance().marshall(elasticsearchDestinationConfiguration.getS3Configuration(), jsonGenerator);
            }
            if (elasticsearchDestinationConfiguration.getCloudWatchLoggingOptions() != null) {
                jsonGenerator.writeFieldName("CloudWatchLoggingOptions");
                CloudWatchLoggingOptionsJsonMarshaller.getInstance().marshall(elasticsearchDestinationConfiguration.getCloudWatchLoggingOptions(),
                        jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ElasticsearchDestinationConfigurationJsonMarshaller instance;

    public static ElasticsearchDestinationConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ElasticsearchDestinationConfigurationJsonMarshaller();
        return instance;
    }

}
