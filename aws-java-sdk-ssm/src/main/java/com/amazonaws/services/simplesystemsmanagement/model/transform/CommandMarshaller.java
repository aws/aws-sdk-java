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
 * CommandMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CommandMarshaller {

    private static final MarshallingInfo<String> COMMANDID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CommandId").build();
    private static final MarshallingInfo<String> DOCUMENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentName").build();
    private static final MarshallingInfo<String> DOCUMENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentVersion").build();
    private static final MarshallingInfo<String> COMMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Comment").build();
    private static final MarshallingInfo<java.util.Date> EXPIRESAFTER_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExpiresAfter").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Map> PARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Parameters").build();
    private static final MarshallingInfo<List> INSTANCEIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("InstanceIds").build();
    private static final MarshallingInfo<List> TARGETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Targets").build();
    private static final MarshallingInfo<java.util.Date> REQUESTEDDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequestedDateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> STATUSDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatusDetails").build();
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
    private static final MarshallingInfo<Integer> TARGETCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetCount").build();
    private static final MarshallingInfo<Integer> COMPLETEDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompletedCount").build();
    private static final MarshallingInfo<Integer> ERRORCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ErrorCount").build();
    private static final MarshallingInfo<Integer> DELIVERYTIMEDOUTCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeliveryTimedOutCount").build();
    private static final MarshallingInfo<String> SERVICEROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceRole").build();
    private static final MarshallingInfo<StructuredPojo> NOTIFICATIONCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotificationConfig").build();
    private static final MarshallingInfo<StructuredPojo> CLOUDWATCHOUTPUTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudWatchOutputConfig").build();

    private static final CommandMarshaller instance = new CommandMarshaller();

    public static CommandMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Command command, ProtocolMarshaller protocolMarshaller) {

        if (command == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(command.getCommandId(), COMMANDID_BINDING);
            protocolMarshaller.marshall(command.getDocumentName(), DOCUMENTNAME_BINDING);
            protocolMarshaller.marshall(command.getDocumentVersion(), DOCUMENTVERSION_BINDING);
            protocolMarshaller.marshall(command.getComment(), COMMENT_BINDING);
            protocolMarshaller.marshall(command.getExpiresAfter(), EXPIRESAFTER_BINDING);
            protocolMarshaller.marshall(command.getParameters(), PARAMETERS_BINDING);
            protocolMarshaller.marshall(command.getInstanceIds(), INSTANCEIDS_BINDING);
            protocolMarshaller.marshall(command.getTargets(), TARGETS_BINDING);
            protocolMarshaller.marshall(command.getRequestedDateTime(), REQUESTEDDATETIME_BINDING);
            protocolMarshaller.marshall(command.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(command.getStatusDetails(), STATUSDETAILS_BINDING);
            protocolMarshaller.marshall(command.getOutputS3Region(), OUTPUTS3REGION_BINDING);
            protocolMarshaller.marshall(command.getOutputS3BucketName(), OUTPUTS3BUCKETNAME_BINDING);
            protocolMarshaller.marshall(command.getOutputS3KeyPrefix(), OUTPUTS3KEYPREFIX_BINDING);
            protocolMarshaller.marshall(command.getMaxConcurrency(), MAXCONCURRENCY_BINDING);
            protocolMarshaller.marshall(command.getMaxErrors(), MAXERRORS_BINDING);
            protocolMarshaller.marshall(command.getTargetCount(), TARGETCOUNT_BINDING);
            protocolMarshaller.marshall(command.getCompletedCount(), COMPLETEDCOUNT_BINDING);
            protocolMarshaller.marshall(command.getErrorCount(), ERRORCOUNT_BINDING);
            protocolMarshaller.marshall(command.getDeliveryTimedOutCount(), DELIVERYTIMEDOUTCOUNT_BINDING);
            protocolMarshaller.marshall(command.getServiceRole(), SERVICEROLE_BINDING);
            protocolMarshaller.marshall(command.getNotificationConfig(), NOTIFICATIONCONFIG_BINDING);
            protocolMarshaller.marshall(command.getCloudWatchOutputConfig(), CLOUDWATCHOUTPUTCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
