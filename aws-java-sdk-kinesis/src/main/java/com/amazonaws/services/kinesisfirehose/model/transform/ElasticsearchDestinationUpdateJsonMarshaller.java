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
 * ElasticsearchDestinationUpdateMarshaller
 */
public class ElasticsearchDestinationUpdateJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ElasticsearchDestinationUpdate elasticsearchDestinationUpdate, StructuredJsonGenerator jsonGenerator) {

        if (elasticsearchDestinationUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (elasticsearchDestinationUpdate.getRoleARN() != null) {
                jsonGenerator.writeFieldName("RoleARN").writeValue(elasticsearchDestinationUpdate.getRoleARN());
            }
            if (elasticsearchDestinationUpdate.getDomainARN() != null) {
                jsonGenerator.writeFieldName("DomainARN").writeValue(elasticsearchDestinationUpdate.getDomainARN());
            }
            if (elasticsearchDestinationUpdate.getIndexName() != null) {
                jsonGenerator.writeFieldName("IndexName").writeValue(elasticsearchDestinationUpdate.getIndexName());
            }
            if (elasticsearchDestinationUpdate.getTypeName() != null) {
                jsonGenerator.writeFieldName("TypeName").writeValue(elasticsearchDestinationUpdate.getTypeName());
            }
            if (elasticsearchDestinationUpdate.getIndexRotationPeriod() != null) {
                jsonGenerator.writeFieldName("IndexRotationPeriod").writeValue(elasticsearchDestinationUpdate.getIndexRotationPeriod());
            }
            if (elasticsearchDestinationUpdate.getBufferingHints() != null) {
                jsonGenerator.writeFieldName("BufferingHints");
                ElasticsearchBufferingHintsJsonMarshaller.getInstance().marshall(elasticsearchDestinationUpdate.getBufferingHints(), jsonGenerator);
            }
            if (elasticsearchDestinationUpdate.getRetryOptions() != null) {
                jsonGenerator.writeFieldName("RetryOptions");
                ElasticsearchRetryOptionsJsonMarshaller.getInstance().marshall(elasticsearchDestinationUpdate.getRetryOptions(), jsonGenerator);
            }
            if (elasticsearchDestinationUpdate.getS3Update() != null) {
                jsonGenerator.writeFieldName("S3Update");
                S3DestinationUpdateJsonMarshaller.getInstance().marshall(elasticsearchDestinationUpdate.getS3Update(), jsonGenerator);
            }
            if (elasticsearchDestinationUpdate.getCloudWatchLoggingOptions() != null) {
                jsonGenerator.writeFieldName("CloudWatchLoggingOptions");
                CloudWatchLoggingOptionsJsonMarshaller.getInstance().marshall(elasticsearchDestinationUpdate.getCloudWatchLoggingOptions(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ElasticsearchDestinationUpdateJsonMarshaller instance;

    public static ElasticsearchDestinationUpdateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ElasticsearchDestinationUpdateJsonMarshaller();
        return instance;
    }

}
