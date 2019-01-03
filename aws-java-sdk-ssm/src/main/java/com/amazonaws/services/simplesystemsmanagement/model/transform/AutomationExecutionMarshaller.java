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
 * AutomationExecutionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AutomationExecutionMarshaller {

    private static final MarshallingInfo<String> AUTOMATIONEXECUTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutomationExecutionId").build();
    private static final MarshallingInfo<String> DOCUMENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentName").build();
    private static final MarshallingInfo<String> DOCUMENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentVersion").build();
    private static final MarshallingInfo<java.util.Date> EXECUTIONSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutionStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> EXECUTIONENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutionEndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> AUTOMATIONEXECUTIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutomationExecutionStatus").build();
    private static final MarshallingInfo<List> STEPEXECUTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StepExecutions").build();
    private static final MarshallingInfo<Boolean> STEPEXECUTIONSTRUNCATED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StepExecutionsTruncated").build();
    private static final MarshallingInfo<Map> PARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Parameters").build();
    private static final MarshallingInfo<Map> OUTPUTS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Outputs").build();
    private static final MarshallingInfo<String> FAILUREMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureMessage").build();
    private static final MarshallingInfo<String> MODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Mode").build();
    private static final MarshallingInfo<String> PARENTAUTOMATIONEXECUTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParentAutomationExecutionId").build();
    private static final MarshallingInfo<String> EXECUTEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutedBy").build();
    private static final MarshallingInfo<String> CURRENTSTEPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentStepName").build();
    private static final MarshallingInfo<String> CURRENTACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentAction").build();
    private static final MarshallingInfo<String> TARGETPARAMETERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetParameterName").build();
    private static final MarshallingInfo<List> TARGETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Targets").build();
    private static final MarshallingInfo<List> TARGETMAPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TargetMaps").build();
    private static final MarshallingInfo<StructuredPojo> RESOLVEDTARGETS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResolvedTargets").build();
    private static final MarshallingInfo<String> MAXCONCURRENCY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxConcurrency").build();
    private static final MarshallingInfo<String> MAXERRORS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MaxErrors").build();
    private static final MarshallingInfo<String> TARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Target").build();
    private static final MarshallingInfo<List> TARGETLOCATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetLocations").build();
    private static final MarshallingInfo<StructuredPojo> PROGRESSCOUNTERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProgressCounters").build();

    private static final AutomationExecutionMarshaller instance = new AutomationExecutionMarshaller();

    public static AutomationExecutionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AutomationExecution automationExecution, ProtocolMarshaller protocolMarshaller) {

        if (automationExecution == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(automationExecution.getAutomationExecutionId(), AUTOMATIONEXECUTIONID_BINDING);
            protocolMarshaller.marshall(automationExecution.getDocumentName(), DOCUMENTNAME_BINDING);
            protocolMarshaller.marshall(automationExecution.getDocumentVersion(), DOCUMENTVERSION_BINDING);
            protocolMarshaller.marshall(automationExecution.getExecutionStartTime(), EXECUTIONSTARTTIME_BINDING);
            protocolMarshaller.marshall(automationExecution.getExecutionEndTime(), EXECUTIONENDTIME_BINDING);
            protocolMarshaller.marshall(automationExecution.getAutomationExecutionStatus(), AUTOMATIONEXECUTIONSTATUS_BINDING);
            protocolMarshaller.marshall(automationExecution.getStepExecutions(), STEPEXECUTIONS_BINDING);
            protocolMarshaller.marshall(automationExecution.getStepExecutionsTruncated(), STEPEXECUTIONSTRUNCATED_BINDING);
            protocolMarshaller.marshall(automationExecution.getParameters(), PARAMETERS_BINDING);
            protocolMarshaller.marshall(automationExecution.getOutputs(), OUTPUTS_BINDING);
            protocolMarshaller.marshall(automationExecution.getFailureMessage(), FAILUREMESSAGE_BINDING);
            protocolMarshaller.marshall(automationExecution.getMode(), MODE_BINDING);
            protocolMarshaller.marshall(automationExecution.getParentAutomationExecutionId(), PARENTAUTOMATIONEXECUTIONID_BINDING);
            protocolMarshaller.marshall(automationExecution.getExecutedBy(), EXECUTEDBY_BINDING);
            protocolMarshaller.marshall(automationExecution.getCurrentStepName(), CURRENTSTEPNAME_BINDING);
            protocolMarshaller.marshall(automationExecution.getCurrentAction(), CURRENTACTION_BINDING);
            protocolMarshaller.marshall(automationExecution.getTargetParameterName(), TARGETPARAMETERNAME_BINDING);
            protocolMarshaller.marshall(automationExecution.getTargets(), TARGETS_BINDING);
            protocolMarshaller.marshall(automationExecution.getTargetMaps(), TARGETMAPS_BINDING);
            protocolMarshaller.marshall(automationExecution.getResolvedTargets(), RESOLVEDTARGETS_BINDING);
            protocolMarshaller.marshall(automationExecution.getMaxConcurrency(), MAXCONCURRENCY_BINDING);
            protocolMarshaller.marshall(automationExecution.getMaxErrors(), MAXERRORS_BINDING);
            protocolMarshaller.marshall(automationExecution.getTarget(), TARGET_BINDING);
            protocolMarshaller.marshall(automationExecution.getTargetLocations(), TARGETLOCATIONS_BINDING);
            protocolMarshaller.marshall(automationExecution.getProgressCounters(), PROGRESSCOUNTERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
