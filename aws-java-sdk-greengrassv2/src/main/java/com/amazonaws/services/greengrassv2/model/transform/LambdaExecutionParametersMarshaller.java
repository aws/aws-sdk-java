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
 * LambdaExecutionParametersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LambdaExecutionParametersMarshaller {

    private static final MarshallingInfo<List> EVENTSOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("eventSources").build();
    private static final MarshallingInfo<Integer> MAXQUEUESIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxQueueSize").build();
    private static final MarshallingInfo<Integer> MAXINSTANCESCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxInstancesCount").build();
    private static final MarshallingInfo<Integer> MAXIDLETIMEINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxIdleTimeInSeconds").build();
    private static final MarshallingInfo<Integer> TIMEOUTINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timeoutInSeconds").build();
    private static final MarshallingInfo<Integer> STATUSTIMEOUTINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statusTimeoutInSeconds").build();
    private static final MarshallingInfo<Boolean> PINNED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("pinned").build();
    private static final MarshallingInfo<String> INPUTPAYLOADENCODINGTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputPayloadEncodingType").build();
    private static final MarshallingInfo<List> EXECARGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("execArgs").build();
    private static final MarshallingInfo<Map> ENVIRONMENTVARIABLES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("environmentVariables").build();
    private static final MarshallingInfo<StructuredPojo> LINUXPROCESSPARAMS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("linuxProcessParams").build();

    private static final LambdaExecutionParametersMarshaller instance = new LambdaExecutionParametersMarshaller();

    public static LambdaExecutionParametersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LambdaExecutionParameters lambdaExecutionParameters, ProtocolMarshaller protocolMarshaller) {

        if (lambdaExecutionParameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(lambdaExecutionParameters.getEventSources(), EVENTSOURCES_BINDING);
            protocolMarshaller.marshall(lambdaExecutionParameters.getMaxQueueSize(), MAXQUEUESIZE_BINDING);
            protocolMarshaller.marshall(lambdaExecutionParameters.getMaxInstancesCount(), MAXINSTANCESCOUNT_BINDING);
            protocolMarshaller.marshall(lambdaExecutionParameters.getMaxIdleTimeInSeconds(), MAXIDLETIMEINSECONDS_BINDING);
            protocolMarshaller.marshall(lambdaExecutionParameters.getTimeoutInSeconds(), TIMEOUTINSECONDS_BINDING);
            protocolMarshaller.marshall(lambdaExecutionParameters.getStatusTimeoutInSeconds(), STATUSTIMEOUTINSECONDS_BINDING);
            protocolMarshaller.marshall(lambdaExecutionParameters.getPinned(), PINNED_BINDING);
            protocolMarshaller.marshall(lambdaExecutionParameters.getInputPayloadEncodingType(), INPUTPAYLOADENCODINGTYPE_BINDING);
            protocolMarshaller.marshall(lambdaExecutionParameters.getExecArgs(), EXECARGS_BINDING);
            protocolMarshaller.marshall(lambdaExecutionParameters.getEnvironmentVariables(), ENVIRONMENTVARIABLES_BINDING);
            protocolMarshaller.marshall(lambdaExecutionParameters.getLinuxProcessParams(), LINUXPROCESSPARAMS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
