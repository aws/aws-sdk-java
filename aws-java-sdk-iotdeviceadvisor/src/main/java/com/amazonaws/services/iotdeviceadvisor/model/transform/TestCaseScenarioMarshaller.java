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
package com.amazonaws.services.iotdeviceadvisor.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotdeviceadvisor.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TestCaseScenarioMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TestCaseScenarioMarshaller {

    private static final MarshallingInfo<String> TESTCASESCENARIOID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("testCaseScenarioId").build();
    private static final MarshallingInfo<String> TESTCASESCENARIOTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("testCaseScenarioType").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> FAILURE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("failure").build();
    private static final MarshallingInfo<String> SYSTEMMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("systemMessage").build();

    private static final TestCaseScenarioMarshaller instance = new TestCaseScenarioMarshaller();

    public static TestCaseScenarioMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TestCaseScenario testCaseScenario, ProtocolMarshaller protocolMarshaller) {

        if (testCaseScenario == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(testCaseScenario.getTestCaseScenarioId(), TESTCASESCENARIOID_BINDING);
            protocolMarshaller.marshall(testCaseScenario.getTestCaseScenarioType(), TESTCASESCENARIOTYPE_BINDING);
            protocolMarshaller.marshall(testCaseScenario.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(testCaseScenario.getFailure(), FAILURE_BINDING);
            protocolMarshaller.marshall(testCaseScenario.getSystemMessage(), SYSTEMMESSAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
