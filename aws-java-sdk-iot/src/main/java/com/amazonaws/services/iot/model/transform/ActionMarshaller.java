/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ActionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ActionMarshaller {

    private static final MarshallingInfo<StructuredPojo> DYNAMODB_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dynamoDB").build();
    private static final MarshallingInfo<StructuredPojo> DYNAMODBV2_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dynamoDBv2").build();
    private static final MarshallingInfo<StructuredPojo> LAMBDA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lambda").build();
    private static final MarshallingInfo<StructuredPojo> SNS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sns").build();
    private static final MarshallingInfo<StructuredPojo> SQS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sqs").build();
    private static final MarshallingInfo<StructuredPojo> KINESIS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("kinesis").build();
    private static final MarshallingInfo<StructuredPojo> REPUBLISH_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("republish").build();
    private static final MarshallingInfo<StructuredPojo> S3_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("s3").build();
    private static final MarshallingInfo<StructuredPojo> FIREHOSE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("firehose").build();
    private static final MarshallingInfo<StructuredPojo> CLOUDWATCHMETRIC_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cloudwatchMetric").build();
    private static final MarshallingInfo<StructuredPojo> CLOUDWATCHALARM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cloudwatchAlarm").build();
    private static final MarshallingInfo<StructuredPojo> ELASTICSEARCH_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("elasticsearch").build();
    private static final MarshallingInfo<StructuredPojo> SALESFORCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("salesforce").build();
    private static final MarshallingInfo<StructuredPojo> IOTANALYTICS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("iotAnalytics").build();
    private static final MarshallingInfo<StructuredPojo> IOTEVENTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("iotEvents").build();
    private static final MarshallingInfo<StructuredPojo> STEPFUNCTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stepFunctions").build();

    private static final ActionMarshaller instance = new ActionMarshaller();

    public static ActionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Action action, ProtocolMarshaller protocolMarshaller) {

        if (action == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(action.getDynamoDB(), DYNAMODB_BINDING);
            protocolMarshaller.marshall(action.getDynamoDBv2(), DYNAMODBV2_BINDING);
            protocolMarshaller.marshall(action.getLambda(), LAMBDA_BINDING);
            protocolMarshaller.marshall(action.getSns(), SNS_BINDING);
            protocolMarshaller.marshall(action.getSqs(), SQS_BINDING);
            protocolMarshaller.marshall(action.getKinesis(), KINESIS_BINDING);
            protocolMarshaller.marshall(action.getRepublish(), REPUBLISH_BINDING);
            protocolMarshaller.marshall(action.getS3(), S3_BINDING);
            protocolMarshaller.marshall(action.getFirehose(), FIREHOSE_BINDING);
            protocolMarshaller.marshall(action.getCloudwatchMetric(), CLOUDWATCHMETRIC_BINDING);
            protocolMarshaller.marshall(action.getCloudwatchAlarm(), CLOUDWATCHALARM_BINDING);
            protocolMarshaller.marshall(action.getElasticsearch(), ELASTICSEARCH_BINDING);
            protocolMarshaller.marshall(action.getSalesforce(), SALESFORCE_BINDING);
            protocolMarshaller.marshall(action.getIotAnalytics(), IOTANALYTICS_BINDING);
            protocolMarshaller.marshall(action.getIotEvents(), IOTEVENTS_BINDING);
            protocolMarshaller.marshall(action.getStepFunctions(), STEPFUNCTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
