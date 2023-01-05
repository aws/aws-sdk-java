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
package com.amazonaws.services.inspector2.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LambdaFunctionMetadataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LambdaFunctionMetadataMarshaller {

    private static final MarshallingInfo<String> FUNCTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("functionName").build();
    private static final MarshallingInfo<Map> FUNCTIONTAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("functionTags").build();
    private static final MarshallingInfo<List> LAYERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("layers").build();
    private static final MarshallingInfo<String> RUNTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("runtime").build();

    private static final LambdaFunctionMetadataMarshaller instance = new LambdaFunctionMetadataMarshaller();

    public static LambdaFunctionMetadataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LambdaFunctionMetadata lambdaFunctionMetadata, ProtocolMarshaller protocolMarshaller) {

        if (lambdaFunctionMetadata == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(lambdaFunctionMetadata.getFunctionName(), FUNCTIONNAME_BINDING);
            protocolMarshaller.marshall(lambdaFunctionMetadata.getFunctionTags(), FUNCTIONTAGS_BINDING);
            protocolMarshaller.marshall(lambdaFunctionMetadata.getLayers(), LAYERS_BINDING);
            protocolMarshaller.marshall(lambdaFunctionMetadata.getRuntime(), RUNTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
