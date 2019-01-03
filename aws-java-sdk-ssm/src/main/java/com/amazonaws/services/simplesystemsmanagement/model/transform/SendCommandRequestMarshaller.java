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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SendCommandRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SendCommandRequestMarshaller {

    private static final MarshallingInfo<List> INSTANCEIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("InstanceIds").build();
    private static final MarshallingInfo<List> TARGETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Targets").build();
    private static final MarshallingInfo<String> DOCUMENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentName").build();
    private static final MarshallingInfo<String> DOCUMENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentVersion").build();
    private static final MarshallingInfo<String> DOCUMENTHASH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentHash").build();
    private static final MarshallingInfo<String> DOCUMENTHASHTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentHashType").build();
    private static final MarshallingInfo<Integer> TIMEOUTSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeoutSeconds").build();
    private static final MarshallingInfo<String> COMMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Comment").build();
    private static final MarshallingInfo<Map> PARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Parameters").build();
    private static final MarshallingInfo<String> OUTPUTS3REGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputS3Region").build();
    private static final MarshallingInfo<String> OUTPUTS3BUCKETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputS3BucketName").build();
    private static final MarshallingInfo<String> OUTPUTS3KEYPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputS3KeyPrefix").build();
    private static final MarshallingInfo<String> MAXCONCURRENCY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxConcurrency").build();
    private static final MarshallingInfo<String> MAXERRORS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MaxErrors").build();
    private static final MarshallingInfo<String> SERVICEROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceRoleArn").build();
    private static final MarshallingInfo<StructuredPojo> NOTIFICATIONCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotificationConfig").build();
    private static final MarshallingInfo<StructuredPojo> CLOUDWATCHOUTPUTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudWatchOutputConfig").build();

    private static final SendCommandRequestMarshaller instance = new SendCommandRequestMarshaller();

    public static SendCommandRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SendCommandRequest sendCommandRequest, ProtocolMarshaller protocolMarshaller) {

        if (sendCommandRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sendCommandRequest.getInstanceIds(), INSTANCEIDS_BINDING);
            protocolMarshaller.marshall(sendCommandRequest.getTargets(), TARGETS_BINDING);
            protocolMarshaller.marshall(sendCommandRequest.getDocumentName(), DOCUMENTNAME_BINDING);
            protocolMarshaller.marshall(sendCommandRequest.getDocumentVersion(), DOCUMENTVERSION_BINDING);
            protocolMarshaller.marshall(sendCommandRequest.getDocumentHash(), DOCUMENTHASH_BINDING);
            protocolMarshaller.marshall(sendCommandRequest.getDocumentHashType(), DOCUMENTHASHTYPE_BINDING);
            protocolMarshaller.marshall(sendCommandRequest.getTimeoutSeconds(), TIMEOUTSECONDS_BINDING);
            protocolMarshaller.marshall(sendCommandRequest.getComment(), COMMENT_BINDING);
            protocolMarshaller.marshall(sendCommandRequest.getParameters(), PARAMETERS_BINDING);
            protocolMarshaller.marshall(sendCommandRequest.getOutputS3Region(), OUTPUTS3REGION_BINDING);
            protocolMarshaller.marshall(sendCommandRequest.getOutputS3BucketName(), OUTPUTS3BUCKETNAME_BINDING);
            protocolMarshaller.marshall(sendCommandRequest.getOutputS3KeyPrefix(), OUTPUTS3KEYPREFIX_BINDING);
            protocolMarshaller.marshall(sendCommandRequest.getMaxConcurrency(), MAXCONCURRENCY_BINDING);
            protocolMarshaller.marshall(sendCommandRequest.getMaxErrors(), MAXERRORS_BINDING);
            protocolMarshaller.marshall(sendCommandRequest.getServiceRoleArn(), SERVICEROLEARN_BINDING);
            protocolMarshaller.marshall(sendCommandRequest.getNotificationConfig(), NOTIFICATIONCONFIG_BINDING);
            protocolMarshaller.marshall(sendCommandRequest.getCloudWatchOutputConfig(), CLOUDWATCHOUTPUTCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
