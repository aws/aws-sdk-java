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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StepExecutionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StepExecutionMarshaller {

    private static final MarshallingInfo<String> STEPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StepName").build();
    private static final MarshallingInfo<String> ACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Action").build();
    private static final MarshallingInfo<Long> TIMEOUTSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeoutSeconds").build();
    private static final MarshallingInfo<String> ONFAILURE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OnFailure").build();
    private static final MarshallingInfo<Integer> MAXATTEMPTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxAttempts").build();
    private static final MarshallingInfo<java.util.Date> EXECUTIONSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutionStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> EXECUTIONENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutionEndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STEPSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StepStatus").build();
    private static final MarshallingInfo<String> RESPONSECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResponseCode").build();
    private static final MarshallingInfo<Map> INPUTS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Inputs").build();
    private static final MarshallingInfo<Map> OUTPUTS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Outputs").build();
    private static final MarshallingInfo<String> RESPONSE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Response").build();
    private static final MarshallingInfo<String> FAILUREMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureMessage").build();
    private static final MarshallingInfo<StructuredPojo> FAILUREDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureDetails").build();
    private static final MarshallingInfo<String> STEPEXECUTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StepExecutionId").build();
    private static final MarshallingInfo<Map> OVERRIDDENPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OverriddenParameters").build();
    private static final MarshallingInfo<Boolean> ISEND_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IsEnd").build();
    private static final MarshallingInfo<String> NEXTSTEP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextStep").build();
    private static final MarshallingInfo<Boolean> ISCRITICAL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsCritical").build();
    private static final MarshallingInfo<List> VALIDNEXTSTEPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ValidNextSteps").build();
    private static final MarshallingInfo<List> TARGETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Targets").build();
    private static final MarshallingInfo<StructuredPojo> TARGETLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetLocation").build();

    private static final StepExecutionMarshaller instance = new StepExecutionMarshaller();

    public static StepExecutionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StepExecution stepExecution, ProtocolMarshaller protocolMarshaller) {

        if (stepExecution == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(stepExecution.getStepName(), STEPNAME_BINDING);
            protocolMarshaller.marshall(stepExecution.getAction(), ACTION_BINDING);
            protocolMarshaller.marshall(stepExecution.getTimeoutSeconds(), TIMEOUTSECONDS_BINDING);
            protocolMarshaller.marshall(stepExecution.getOnFailure(), ONFAILURE_BINDING);
            protocolMarshaller.marshall(stepExecution.getMaxAttempts(), MAXATTEMPTS_BINDING);
            protocolMarshaller.marshall(stepExecution.getExecutionStartTime(), EXECUTIONSTARTTIME_BINDING);
            protocolMarshaller.marshall(stepExecution.getExecutionEndTime(), EXECUTIONENDTIME_BINDING);
            protocolMarshaller.marshall(stepExecution.getStepStatus(), STEPSTATUS_BINDING);
            protocolMarshaller.marshall(stepExecution.getResponseCode(), RESPONSECODE_BINDING);
            protocolMarshaller.marshall(stepExecution.getInputs(), INPUTS_BINDING);
            protocolMarshaller.marshall(stepExecution.getOutputs(), OUTPUTS_BINDING);
            protocolMarshaller.marshall(stepExecution.getResponse(), RESPONSE_BINDING);
            protocolMarshaller.marshall(stepExecution.getFailureMessage(), FAILUREMESSAGE_BINDING);
            protocolMarshaller.marshall(stepExecution.getFailureDetails(), FAILUREDETAILS_BINDING);
            protocolMarshaller.marshall(stepExecution.getStepExecutionId(), STEPEXECUTIONID_BINDING);
            protocolMarshaller.marshall(stepExecution.getOverriddenParameters(), OVERRIDDENPARAMETERS_BINDING);
            protocolMarshaller.marshall(stepExecution.getIsEnd(), ISEND_BINDING);
            protocolMarshaller.marshall(stepExecution.getNextStep(), NEXTSTEP_BINDING);
            protocolMarshaller.marshall(stepExecution.getIsCritical(), ISCRITICAL_BINDING);
            protocolMarshaller.marshall(stepExecution.getValidNextSteps(), VALIDNEXTSTEPS_BINDING);
            protocolMarshaller.marshall(stepExecution.getTargets(), TARGETS_BINDING);
            protocolMarshaller.marshall(stepExecution.getTargetLocation(), TARGETLOCATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
