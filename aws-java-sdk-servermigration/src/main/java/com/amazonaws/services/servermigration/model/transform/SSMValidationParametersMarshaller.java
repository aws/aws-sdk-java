/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servermigration.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.servermigration.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SSMValidationParametersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SSMValidationParametersMarshaller {

    private static final MarshallingInfo<StructuredPojo> SOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("source").build();
    private static final MarshallingInfo<String> INSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceId").build();
    private static final MarshallingInfo<String> SCRIPTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scriptType").build();
    private static final MarshallingInfo<String> COMMAND_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("command").build();
    private static final MarshallingInfo<Integer> EXECUTIONTIMEOUTSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executionTimeoutSeconds").build();
    private static final MarshallingInfo<String> OUTPUTS3BUCKETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputS3BucketName").build();

    private static final SSMValidationParametersMarshaller instance = new SSMValidationParametersMarshaller();

    public static SSMValidationParametersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SSMValidationParameters sSMValidationParameters, ProtocolMarshaller protocolMarshaller) {

        if (sSMValidationParameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sSMValidationParameters.getSource(), SOURCE_BINDING);
            protocolMarshaller.marshall(sSMValidationParameters.getInstanceId(), INSTANCEID_BINDING);
            protocolMarshaller.marshall(sSMValidationParameters.getScriptType(), SCRIPTTYPE_BINDING);
            protocolMarshaller.marshall(sSMValidationParameters.getCommand(), COMMAND_BINDING);
            protocolMarshaller.marshall(sSMValidationParameters.getExecutionTimeoutSeconds(), EXECUTIONTIMEOUTSECONDS_BINDING);
            protocolMarshaller.marshall(sSMValidationParameters.getOutputS3BucketName(), OUTPUTS3BUCKETNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
