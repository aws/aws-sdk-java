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
package com.amazonaws.services.iotdeviceadvisor.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotdeviceadvisor.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartSuiteRunRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartSuiteRunRequestMarshaller {

    private static final MarshallingInfo<String> SUITEDEFINITIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("suiteDefinitionId").build();
    private static final MarshallingInfo<String> SUITEDEFINITIONVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("suiteDefinitionVersion").build();
    private static final MarshallingInfo<StructuredPojo> SUITERUNCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("suiteRunConfiguration").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final StartSuiteRunRequestMarshaller instance = new StartSuiteRunRequestMarshaller();

    public static StartSuiteRunRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartSuiteRunRequest startSuiteRunRequest, ProtocolMarshaller protocolMarshaller) {

        if (startSuiteRunRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startSuiteRunRequest.getSuiteDefinitionId(), SUITEDEFINITIONID_BINDING);
            protocolMarshaller.marshall(startSuiteRunRequest.getSuiteDefinitionVersion(), SUITEDEFINITIONVERSION_BINDING);
            protocolMarshaller.marshall(startSuiteRunRequest.getSuiteRunConfiguration(), SUITERUNCONFIGURATION_BINDING);
            protocolMarshaller.marshall(startSuiteRunRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
