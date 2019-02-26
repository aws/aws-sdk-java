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
 * AutomationExecutionMetadataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AutomationExecutionMetadataMarshaller {

    private static final MarshallingInfo<String> AUTOMATIONEXECUTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutomationExecutionId").build();
    private static final MarshallingInfo<String> DOCUMENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentName").build();
    private static final MarshallingInfo<String> DOCUMENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentVersion").build();
    private static final MarshallingInfo<String> AUTOMATIONEXECUTIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutomationExecutionStatus").build();
    private static final MarshallingInfo<java.util.Date> EXECUTIONSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutionStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> EXECUTIONENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutionEndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> EXECUTEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutedBy").build();
    private static final MarshallingInfo<String> LOGFILE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LogFile").build();
    private static final MarshallingInfo<Map> OUTPUTS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Outputs").build();
    private static final MarshallingInfo<String> MODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Mode").build();
    private static final MarshallingInfo<String> PARENTAUTOMATIONEXECUTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParentAutomationExecutionId").build();
    private static final MarshallingInfo<String> CURRENTSTEPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentStepName").build();
    private static final MarshallingInfo<String> CURRENTACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentAction").build();
    private static final MarshallingInfo<String> FAILUREMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureMessage").build();
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
    private static final MarshallingInfo<String> AUTOMATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutomationType").build();

    private static final AutomationExecutionMetadataMarshaller instance = new AutomationExecutionMetadataMarshaller();

    public static AutomationExecutionMetadataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AutomationExecutionMetadata automationExecutionMetadata, ProtocolMarshaller protocolMarshaller) {

        if (automationExecutionMetadata == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(automationExecutionMetadata.getAutomationExecutionId(), AUTOMATIONEXECUTIONID_BINDING);
            protocolMarshaller.marshall(automationExecutionMetadata.getDocumentName(), DOCUMENTNAME_BINDING);
            protocolMarshaller.marshall(automationExecutionMetadata.getDocumentVersion(), DOCUMENTVERSION_BINDING);
            protocolMarshaller.marshall(automationExecutionMetadata.getAutomationExecutionStatus(), AUTOMATIONEXECUTIONSTATUS_BINDING);
            protocolMarshaller.marshall(automationExecutionMetadata.getExecutionStartTime(), EXECUTIONSTARTTIME_BINDING);
            protocolMarshaller.marshall(automationExecutionMetadata.getExecutionEndTime(), EXECUTIONENDTIME_BINDING);
            protocolMarshaller.marshall(automationExecutionMetadata.getExecutedBy(), EXECUTEDBY_BINDING);
            protocolMarshaller.marshall(automationExecutionMetadata.getLogFile(), LOGFILE_BINDING);
            protocolMarshaller.marshall(automationExecutionMetadata.getOutputs(), OUTPUTS_BINDING);
            protocolMarshaller.marshall(automationExecutionMetadata.getMode(), MODE_BINDING);
            protocolMarshaller.marshall(automationExecutionMetadata.getParentAutomationExecutionId(), PARENTAUTOMATIONEXECUTIONID_BINDING);
            protocolMarshaller.marshall(automationExecutionMetadata.getCurrentStepName(), CURRENTSTEPNAME_BINDING);
            protocolMarshaller.marshall(automationExecutionMetadata.getCurrentAction(), CURRENTACTION_BINDING);
            protocolMarshaller.marshall(automationExecutionMetadata.getFailureMessage(), FAILUREMESSAGE_BINDING);
            protocolMarshaller.marshall(automationExecutionMetadata.getTargetParameterName(), TARGETPARAMETERNAME_BINDING);
            protocolMarshaller.marshall(automationExecutionMetadata.getTargets(), TARGETS_BINDING);
            protocolMarshaller.marshall(automationExecutionMetadata.getTargetMaps(), TARGETMAPS_BINDING);
            protocolMarshaller.marshall(automationExecutionMetadata.getResolvedTargets(), RESOLVEDTARGETS_BINDING);
            protocolMarshaller.marshall(automationExecutionMetadata.getMaxConcurrency(), MAXCONCURRENCY_BINDING);
            protocolMarshaller.marshall(automationExecutionMetadata.getMaxErrors(), MAXERRORS_BINDING);
            protocolMarshaller.marshall(automationExecutionMetadata.getTarget(), TARGET_BINDING);
            protocolMarshaller.marshall(automationExecutionMetadata.getAutomationType(), AUTOMATIONTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
