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
 * TestCaseRunMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TestCaseRunMarshaller {

    private static final MarshallingInfo<String> TESTCASERUNID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("testCaseRunId").build();
    private static final MarshallingInfo<String> TESTCASEDEFINITIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("testCaseDefinitionId").build();
    private static final MarshallingInfo<String> TESTCASEDEFINITIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("testCaseDefinitionName").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> LOGURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("logUrl").build();
    private static final MarshallingInfo<String> WARNINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("warnings").build();
    private static final MarshallingInfo<String> FAILURE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("failure").build();

    private static final TestCaseRunMarshaller instance = new TestCaseRunMarshaller();

    public static TestCaseRunMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TestCaseRun testCaseRun, ProtocolMarshaller protocolMarshaller) {

        if (testCaseRun == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(testCaseRun.getTestCaseRunId(), TESTCASERUNID_BINDING);
            protocolMarshaller.marshall(testCaseRun.getTestCaseDefinitionId(), TESTCASEDEFINITIONID_BINDING);
            protocolMarshaller.marshall(testCaseRun.getTestCaseDefinitionName(), TESTCASEDEFINITIONNAME_BINDING);
            protocolMarshaller.marshall(testCaseRun.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(testCaseRun.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(testCaseRun.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(testCaseRun.getLogUrl(), LOGURL_BINDING);
            protocolMarshaller.marshall(testCaseRun.getWarnings(), WARNINGS_BINDING);
            protocolMarshaller.marshall(testCaseRun.getFailure(), FAILURE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
