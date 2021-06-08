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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotdeviceadvisor.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetSuiteDefinitionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetSuiteDefinitionRequestMarshaller {

    private static final MarshallingInfo<String> SUITEDEFINITIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("suiteDefinitionId").build();
    private static final MarshallingInfo<String> SUITEDEFINITIONVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("suiteDefinitionVersion").build();

    private static final GetSuiteDefinitionRequestMarshaller instance = new GetSuiteDefinitionRequestMarshaller();

    public static GetSuiteDefinitionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetSuiteDefinitionRequest getSuiteDefinitionRequest, ProtocolMarshaller protocolMarshaller) {

        if (getSuiteDefinitionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getSuiteDefinitionRequest.getSuiteDefinitionId(), SUITEDEFINITIONID_BINDING);
            protocolMarshaller.marshall(getSuiteDefinitionRequest.getSuiteDefinitionVersion(), SUITEDEFINITIONVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
