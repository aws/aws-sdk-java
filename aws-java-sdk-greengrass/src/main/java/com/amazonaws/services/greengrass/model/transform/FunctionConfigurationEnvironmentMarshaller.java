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
package com.amazonaws.services.greengrass.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.greengrass.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FunctionConfigurationEnvironmentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FunctionConfigurationEnvironmentMarshaller {

    private static final MarshallingInfo<Boolean> ACCESSSYSFS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccessSysfs").build();
    private static final MarshallingInfo<StructuredPojo> EXECUTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Execution").build();
    private static final MarshallingInfo<List> RESOURCEACCESSPOLICIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceAccessPolicies").build();
    private static final MarshallingInfo<Map> VARIABLES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Variables").build();

    private static final FunctionConfigurationEnvironmentMarshaller instance = new FunctionConfigurationEnvironmentMarshaller();

    public static FunctionConfigurationEnvironmentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FunctionConfigurationEnvironment functionConfigurationEnvironment, ProtocolMarshaller protocolMarshaller) {

        if (functionConfigurationEnvironment == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(functionConfigurationEnvironment.getAccessSysfs(), ACCESSSYSFS_BINDING);
            protocolMarshaller.marshall(functionConfigurationEnvironment.getExecution(), EXECUTION_BINDING);
            protocolMarshaller.marshall(functionConfigurationEnvironment.getResourceAccessPolicies(), RESOURCEACCESSPOLICIES_BINDING);
            protocolMarshaller.marshall(functionConfigurationEnvironment.getVariables(), VARIABLES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
