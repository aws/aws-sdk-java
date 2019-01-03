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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CommandPluginMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CommandPluginMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> STATUSDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatusDetails").build();
    private static final MarshallingInfo<Integer> RESPONSECODE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResponseCode").build();
    private static final MarshallingInfo<java.util.Date> RESPONSESTARTDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResponseStartDateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> RESPONSEFINISHDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResponseFinishDateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> OUTPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Output").build();
    private static final MarshallingInfo<String> STANDARDOUTPUTURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StandardOutputUrl").build();
    private static final MarshallingInfo<String> STANDARDERRORURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StandardErrorUrl").build();
    private static final MarshallingInfo<String> OUTPUTS3REGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputS3Region").build();
    private static final MarshallingInfo<String> OUTPUTS3BUCKETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputS3BucketName").build();
    private static final MarshallingInfo<String> OUTPUTS3KEYPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputS3KeyPrefix").build();

    private static final CommandPluginMarshaller instance = new CommandPluginMarshaller();

    public static CommandPluginMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CommandPlugin commandPlugin, ProtocolMarshaller protocolMarshaller) {

        if (commandPlugin == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(commandPlugin.getName(), NAME_BINDING);
            protocolMarshaller.marshall(commandPlugin.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(commandPlugin.getStatusDetails(), STATUSDETAILS_BINDING);
            protocolMarshaller.marshall(commandPlugin.getResponseCode(), RESPONSECODE_BINDING);
            protocolMarshaller.marshall(commandPlugin.getResponseStartDateTime(), RESPONSESTARTDATETIME_BINDING);
            protocolMarshaller.marshall(commandPlugin.getResponseFinishDateTime(), RESPONSEFINISHDATETIME_BINDING);
            protocolMarshaller.marshall(commandPlugin.getOutput(), OUTPUT_BINDING);
            protocolMarshaller.marshall(commandPlugin.getStandardOutputUrl(), STANDARDOUTPUTURL_BINDING);
            protocolMarshaller.marshall(commandPlugin.getStandardErrorUrl(), STANDARDERRORURL_BINDING);
            protocolMarshaller.marshall(commandPlugin.getOutputS3Region(), OUTPUTS3REGION_BINDING);
            protocolMarshaller.marshall(commandPlugin.getOutputS3BucketName(), OUTPUTS3BUCKETNAME_BINDING);
            protocolMarshaller.marshall(commandPlugin.getOutputS3KeyPrefix(), OUTPUTS3KEYPREFIX_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
