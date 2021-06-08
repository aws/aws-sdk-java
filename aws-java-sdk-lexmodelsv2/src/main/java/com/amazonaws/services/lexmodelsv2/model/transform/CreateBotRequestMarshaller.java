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
package com.amazonaws.services.lexmodelsv2.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexmodelsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateBotRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateBotRequestMarshaller {

    private static final MarshallingInfo<String> BOTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("botName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArn").build();
    private static final MarshallingInfo<StructuredPojo> DATAPRIVACY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataPrivacy").build();
    private static final MarshallingInfo<Integer> IDLESESSIONTTLINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("idleSessionTTLInSeconds").build();
    private static final MarshallingInfo<Map> BOTTAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("botTags").build();
    private static final MarshallingInfo<Map> TESTBOTALIASTAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("testBotAliasTags").build();

    private static final CreateBotRequestMarshaller instance = new CreateBotRequestMarshaller();

    public static CreateBotRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateBotRequest createBotRequest, ProtocolMarshaller protocolMarshaller) {

        if (createBotRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createBotRequest.getBotName(), BOTNAME_BINDING);
            protocolMarshaller.marshall(createBotRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createBotRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(createBotRequest.getDataPrivacy(), DATAPRIVACY_BINDING);
            protocolMarshaller.marshall(createBotRequest.getIdleSessionTTLInSeconds(), IDLESESSIONTTLINSECONDS_BINDING);
            protocolMarshaller.marshall(createBotRequest.getBotTags(), BOTTAGS_BINDING);
            protocolMarshaller.marshall(createBotRequest.getTestBotAliasTags(), TESTBOTALIASTAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
