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
package com.amazonaws.services.lambda.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lambda.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateFunctionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateFunctionRequestMarshaller {

    private static final MarshallingInfo<String> FUNCTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FunctionName").build();
    private static final MarshallingInfo<String> RUNTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Runtime").build();
    private static final MarshallingInfo<String> ROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Role").build();
    private static final MarshallingInfo<String> HANDLER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Handler").build();
    private static final MarshallingInfo<StructuredPojo> CODE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Code").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<Integer> TIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Timeout").build();
    private static final MarshallingInfo<Integer> MEMORYSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MemorySize").build();
    private static final MarshallingInfo<Boolean> PUBLISH_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Publish").build();
    private static final MarshallingInfo<StructuredPojo> VPCCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcConfig").build();
    private static final MarshallingInfo<StructuredPojo> DEADLETTERCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeadLetterConfig").build();
    private static final MarshallingInfo<StructuredPojo> ENVIRONMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Environment").build();
    private static final MarshallingInfo<String> KMSKEYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KMSKeyArn").build();
    private static final MarshallingInfo<StructuredPojo> TRACINGCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TracingConfig").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<List> LAYERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Layers").build();

    private static final CreateFunctionRequestMarshaller instance = new CreateFunctionRequestMarshaller();

    public static CreateFunctionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateFunctionRequest createFunctionRequest, ProtocolMarshaller protocolMarshaller) {

        if (createFunctionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createFunctionRequest.getFunctionName(), FUNCTIONNAME_BINDING);
            protocolMarshaller.marshall(createFunctionRequest.getRuntime(), RUNTIME_BINDING);
            protocolMarshaller.marshall(createFunctionRequest.getRole(), ROLE_BINDING);
            protocolMarshaller.marshall(createFunctionRequest.getHandler(), HANDLER_BINDING);
            protocolMarshaller.marshall(createFunctionRequest.getCode(), CODE_BINDING);
            protocolMarshaller.marshall(createFunctionRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createFunctionRequest.getTimeout(), TIMEOUT_BINDING);
            protocolMarshaller.marshall(createFunctionRequest.getMemorySize(), MEMORYSIZE_BINDING);
            protocolMarshaller.marshall(createFunctionRequest.getPublish(), PUBLISH_BINDING);
            protocolMarshaller.marshall(createFunctionRequest.getVpcConfig(), VPCCONFIG_BINDING);
            protocolMarshaller.marshall(createFunctionRequest.getDeadLetterConfig(), DEADLETTERCONFIG_BINDING);
            protocolMarshaller.marshall(createFunctionRequest.getEnvironment(), ENVIRONMENT_BINDING);
            protocolMarshaller.marshall(createFunctionRequest.getKMSKeyArn(), KMSKEYARN_BINDING);
            protocolMarshaller.marshall(createFunctionRequest.getTracingConfig(), TRACINGCONFIG_BINDING);
            protocolMarshaller.marshall(createFunctionRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createFunctionRequest.getLayers(), LAYERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
