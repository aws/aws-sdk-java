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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CommandInvocationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CommandInvocationMarshaller {

    private static final MarshallingInfo<String> COMMANDID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CommandId").build();
    private static final MarshallingInfo<String> INSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceId").build();
    private static final MarshallingInfo<String> INSTANCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceName").build();
    private static final MarshallingInfo<String> COMMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Comment").build();
    private static final MarshallingInfo<String> DOCUMENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentName").build();
    private static final MarshallingInfo<String> DOCUMENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentVersion").build();
    private static final MarshallingInfo<java.util.Date> REQUESTEDDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequestedDateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> STATUSDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatusDetails").build();
    private static final MarshallingInfo<String> TRACEOUTPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TraceOutput").build();
    private static final MarshallingInfo<String> STANDARDOUTPUTURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StandardOutputUrl").build();
    private static final MarshallingInfo<String> STANDARDERRORURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StandardErrorUrl").build();
    private static final MarshallingInfo<List> COMMANDPLUGINS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CommandPlugins").build();
    private static final MarshallingInfo<String> SERVICEROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceRole").build();
    private static final MarshallingInfo<StructuredPojo> NOTIFICATIONCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotificationConfig").build();
    private static final MarshallingInfo<StructuredPojo> CLOUDWATCHOUTPUTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudWatchOutputConfig").build();

    private static final CommandInvocationMarshaller instance = new CommandInvocationMarshaller();

    public static CommandInvocationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CommandInvocation commandInvocation, ProtocolMarshaller protocolMarshaller) {

        if (commandInvocation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(commandInvocation.getCommandId(), COMMANDID_BINDING);
            protocolMarshaller.marshall(commandInvocation.getInstanceId(), INSTANCEID_BINDING);
            protocolMarshaller.marshall(commandInvocation.getInstanceName(), INSTANCENAME_BINDING);
            protocolMarshaller.marshall(commandInvocation.getComment(), COMMENT_BINDING);
            protocolMarshaller.marshall(commandInvocation.getDocumentName(), DOCUMENTNAME_BINDING);
            protocolMarshaller.marshall(commandInvocation.getDocumentVersion(), DOCUMENTVERSION_BINDING);
            protocolMarshaller.marshall(commandInvocation.getRequestedDateTime(), REQUESTEDDATETIME_BINDING);
            protocolMarshaller.marshall(commandInvocation.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(commandInvocation.getStatusDetails(), STATUSDETAILS_BINDING);
            protocolMarshaller.marshall(commandInvocation.getTraceOutput(), TRACEOUTPUT_BINDING);
            protocolMarshaller.marshall(commandInvocation.getStandardOutputUrl(), STANDARDOUTPUTURL_BINDING);
            protocolMarshaller.marshall(commandInvocation.getStandardErrorUrl(), STANDARDERRORURL_BINDING);
            protocolMarshaller.marshall(commandInvocation.getCommandPlugins(), COMMANDPLUGINS_BINDING);
            protocolMarshaller.marshall(commandInvocation.getServiceRole(), SERVICEROLE_BINDING);
            protocolMarshaller.marshall(commandInvocation.getNotificationConfig(), NOTIFICATIONCONFIG_BINDING);
            protocolMarshaller.marshall(commandInvocation.getCloudWatchOutputConfig(), CLOUDWATCHOUTPUTCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
