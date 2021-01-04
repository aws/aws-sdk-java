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
package com.amazonaws.services.greengrassv2.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.greengrassv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LambdaFunctionRecipeSourceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LambdaFunctionRecipeSourceMarshaller {

    private static final MarshallingInfo<String> LAMBDAARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("lambdaArn").build();
    private static final MarshallingInfo<String> COMPONENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("componentName").build();
    private static final MarshallingInfo<String> COMPONENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("componentVersion").build();
    private static final MarshallingInfo<List> COMPONENTPLATFORMS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("componentPlatforms").build();
    private static final MarshallingInfo<Map> COMPONENTDEPENDENCIES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("componentDependencies").build();
    private static final MarshallingInfo<StructuredPojo> COMPONENTLAMBDAPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("componentLambdaParameters").build();

    private static final LambdaFunctionRecipeSourceMarshaller instance = new LambdaFunctionRecipeSourceMarshaller();

    public static LambdaFunctionRecipeSourceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LambdaFunctionRecipeSource lambdaFunctionRecipeSource, ProtocolMarshaller protocolMarshaller) {

        if (lambdaFunctionRecipeSource == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(lambdaFunctionRecipeSource.getLambdaArn(), LAMBDAARN_BINDING);
            protocolMarshaller.marshall(lambdaFunctionRecipeSource.getComponentName(), COMPONENTNAME_BINDING);
            protocolMarshaller.marshall(lambdaFunctionRecipeSource.getComponentVersion(), COMPONENTVERSION_BINDING);
            protocolMarshaller.marshall(lambdaFunctionRecipeSource.getComponentPlatforms(), COMPONENTPLATFORMS_BINDING);
            protocolMarshaller.marshall(lambdaFunctionRecipeSource.getComponentDependencies(), COMPONENTDEPENDENCIES_BINDING);
            protocolMarshaller.marshall(lambdaFunctionRecipeSource.getComponentLambdaParameters(), COMPONENTLAMBDAPARAMETERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
