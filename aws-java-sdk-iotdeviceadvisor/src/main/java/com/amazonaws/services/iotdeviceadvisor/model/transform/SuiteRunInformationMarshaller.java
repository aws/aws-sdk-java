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
 * SuiteRunInformationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SuiteRunInformationMarshaller {

    private static final MarshallingInfo<String> SUITEDEFINITIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("suiteDefinitionId").build();
    private static final MarshallingInfo<String> SUITEDEFINITIONVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("suiteDefinitionVersion").build();
    private static final MarshallingInfo<String> SUITEDEFINITIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("suiteDefinitionName").build();
    private static final MarshallingInfo<String> SUITERUNID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("suiteRunId").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> STARTEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<Integer> PASSED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("passed").build();
    private static final MarshallingInfo<Integer> FAILED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("failed").build();

    private static final SuiteRunInformationMarshaller instance = new SuiteRunInformationMarshaller();

    public static SuiteRunInformationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SuiteRunInformation suiteRunInformation, ProtocolMarshaller protocolMarshaller) {

        if (suiteRunInformation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(suiteRunInformation.getSuiteDefinitionId(), SUITEDEFINITIONID_BINDING);
            protocolMarshaller.marshall(suiteRunInformation.getSuiteDefinitionVersion(), SUITEDEFINITIONVERSION_BINDING);
            protocolMarshaller.marshall(suiteRunInformation.getSuiteDefinitionName(), SUITEDEFINITIONNAME_BINDING);
            protocolMarshaller.marshall(suiteRunInformation.getSuiteRunId(), SUITERUNID_BINDING);
            protocolMarshaller.marshall(suiteRunInformation.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(suiteRunInformation.getStartedAt(), STARTEDAT_BINDING);
            protocolMarshaller.marshall(suiteRunInformation.getEndAt(), ENDAT_BINDING);
            protocolMarshaller.marshall(suiteRunInformation.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(suiteRunInformation.getPassed(), PASSED_BINDING);
            protocolMarshaller.marshall(suiteRunInformation.getFailed(), FAILED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
