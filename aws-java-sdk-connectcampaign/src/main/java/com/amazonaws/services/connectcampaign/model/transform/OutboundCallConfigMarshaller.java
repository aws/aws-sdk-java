/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectcampaign.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connectcampaign.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OutboundCallConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OutboundCallConfigMarshaller {

    private static final MarshallingInfo<StructuredPojo> ANSWERMACHINEDETECTIONCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("answerMachineDetectionConfig").build();
    private static final MarshallingInfo<String> CONNECTCONTACTFLOWID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectContactFlowId").build();
    private static final MarshallingInfo<String> CONNECTQUEUEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectQueueId").build();
    private static final MarshallingInfo<String> CONNECTSOURCEPHONENUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectSourcePhoneNumber").build();

    private static final OutboundCallConfigMarshaller instance = new OutboundCallConfigMarshaller();

    public static OutboundCallConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OutboundCallConfig outboundCallConfig, ProtocolMarshaller protocolMarshaller) {

        if (outboundCallConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(outboundCallConfig.getAnswerMachineDetectionConfig(), ANSWERMACHINEDETECTIONCONFIG_BINDING);
            protocolMarshaller.marshall(outboundCallConfig.getConnectContactFlowId(), CONNECTCONTACTFLOWID_BINDING);
            protocolMarshaller.marshall(outboundCallConfig.getConnectQueueId(), CONNECTQUEUEID_BINDING);
            protocolMarshaller.marshall(outboundCallConfig.getConnectSourcePhoneNumber(), CONNECTSOURCEPHONENUMBER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
