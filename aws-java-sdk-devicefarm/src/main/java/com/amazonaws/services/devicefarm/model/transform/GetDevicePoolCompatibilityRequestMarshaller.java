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
package com.amazonaws.services.devicefarm.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.devicefarm.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetDevicePoolCompatibilityRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetDevicePoolCompatibilityRequestMarshaller {

    private static final MarshallingInfo<String> DEVICEPOOLARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("devicePoolArn").build();
    private static final MarshallingInfo<String> APPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("appArn").build();
    private static final MarshallingInfo<String> TESTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("testType").build();
    private static final MarshallingInfo<StructuredPojo> TEST_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("test").build();
    private static final MarshallingInfo<StructuredPojo> CONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configuration").build();

    private static final GetDevicePoolCompatibilityRequestMarshaller instance = new GetDevicePoolCompatibilityRequestMarshaller();

    public static GetDevicePoolCompatibilityRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetDevicePoolCompatibilityRequest getDevicePoolCompatibilityRequest, ProtocolMarshaller protocolMarshaller) {

        if (getDevicePoolCompatibilityRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getDevicePoolCompatibilityRequest.getDevicePoolArn(), DEVICEPOOLARN_BINDING);
            protocolMarshaller.marshall(getDevicePoolCompatibilityRequest.getAppArn(), APPARN_BINDING);
            protocolMarshaller.marshall(getDevicePoolCompatibilityRequest.getTestType(), TESTTYPE_BINDING);
            protocolMarshaller.marshall(getDevicePoolCompatibilityRequest.getTest(), TEST_BINDING);
            protocolMarshaller.marshall(getDevicePoolCompatibilityRequest.getConfiguration(), CONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
