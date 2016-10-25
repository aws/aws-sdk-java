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
package com.amazonaws.services.iot.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ActionMarshaller
 */
public class ActionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Action action, StructuredJsonGenerator jsonGenerator) {

        if (action == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (action.getDynamoDB() != null) {
                jsonGenerator.writeFieldName("dynamoDB");
                DynamoDBActionJsonMarshaller.getInstance().marshall(action.getDynamoDB(), jsonGenerator);
            }
            if (action.getDynamoDBv2() != null) {
                jsonGenerator.writeFieldName("dynamoDBv2");
                DynamoDBv2ActionJsonMarshaller.getInstance().marshall(action.getDynamoDBv2(), jsonGenerator);
            }
            if (action.getLambda() != null) {
                jsonGenerator.writeFieldName("lambda");
                LambdaActionJsonMarshaller.getInstance().marshall(action.getLambda(), jsonGenerator);
            }
            if (action.getSns() != null) {
                jsonGenerator.writeFieldName("sns");
                SnsActionJsonMarshaller.getInstance().marshall(action.getSns(), jsonGenerator);
            }
            if (action.getSqs() != null) {
                jsonGenerator.writeFieldName("sqs");
                SqsActionJsonMarshaller.getInstance().marshall(action.getSqs(), jsonGenerator);
            }
            if (action.getKinesis() != null) {
                jsonGenerator.writeFieldName("kinesis");
                KinesisActionJsonMarshaller.getInstance().marshall(action.getKinesis(), jsonGenerator);
            }
            if (action.getRepublish() != null) {
                jsonGenerator.writeFieldName("republish");
                RepublishActionJsonMarshaller.getInstance().marshall(action.getRepublish(), jsonGenerator);
            }
            if (action.getS3() != null) {
                jsonGenerator.writeFieldName("s3");
                S3ActionJsonMarshaller.getInstance().marshall(action.getS3(), jsonGenerator);
            }
            if (action.getFirehose() != null) {
                jsonGenerator.writeFieldName("firehose");
                FirehoseActionJsonMarshaller.getInstance().marshall(action.getFirehose(), jsonGenerator);
            }
            if (action.getCloudwatchMetric() != null) {
                jsonGenerator.writeFieldName("cloudwatchMetric");
                CloudwatchMetricActionJsonMarshaller.getInstance().marshall(action.getCloudwatchMetric(), jsonGenerator);
            }
            if (action.getCloudwatchAlarm() != null) {
                jsonGenerator.writeFieldName("cloudwatchAlarm");
                CloudwatchAlarmActionJsonMarshaller.getInstance().marshall(action.getCloudwatchAlarm(), jsonGenerator);
            }
            if (action.getElasticsearch() != null) {
                jsonGenerator.writeFieldName("elasticsearch");
                ElasticsearchActionJsonMarshaller.getInstance().marshall(action.getElasticsearch(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ActionJsonMarshaller instance;

    public static ActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ActionJsonMarshaller();
        return instance;
    }

}
