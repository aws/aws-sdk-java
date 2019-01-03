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
package com.amazonaws.services.appsync.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appsync.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FunctionConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FunctionConfigurationMarshaller {

    private static final MarshallingInfo<String> FUNCTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("functionId").build();
    private static final MarshallingInfo<String> FUNCTIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("functionArn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> DATASOURCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataSourceName").build();
    private static final MarshallingInfo<String> REQUESTMAPPINGTEMPLATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("requestMappingTemplate").build();
    private static final MarshallingInfo<String> RESPONSEMAPPINGTEMPLATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("responseMappingTemplate").build();
    private static final MarshallingInfo<String> FUNCTIONVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("functionVersion").build();

    private static final FunctionConfigurationMarshaller instance = new FunctionConfigurationMarshaller();

    public static FunctionConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FunctionConfiguration functionConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (functionConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(functionConfiguration.getFunctionId(), FUNCTIONID_BINDING);
            protocolMarshaller.marshall(functionConfiguration.getFunctionArn(), FUNCTIONARN_BINDING);
            protocolMarshaller.marshall(functionConfiguration.getName(), NAME_BINDING);
            protocolMarshaller.marshall(functionConfiguration.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(functionConfiguration.getDataSourceName(), DATASOURCENAME_BINDING);
            protocolMarshaller.marshall(functionConfiguration.getRequestMappingTemplate(), REQUESTMAPPINGTEMPLATE_BINDING);
            protocolMarshaller.marshall(functionConfiguration.getResponseMappingTemplate(), RESPONSEMAPPINGTEMPLATE_BINDING);
            protocolMarshaller.marshall(functionConfiguration.getFunctionVersion(), FUNCTIONVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
