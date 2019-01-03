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
package com.amazonaws.services.simpleworkflow.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simpleworkflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DecisionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DecisionMarshaller {

    private static final MarshallingInfo<String> DECISIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("decisionType").build();
    private static final MarshallingInfo<StructuredPojo> SCHEDULEACTIVITYTASKDECISIONATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scheduleActivityTaskDecisionAttributes").build();
    private static final MarshallingInfo<StructuredPojo> REQUESTCANCELACTIVITYTASKDECISIONATTRIBUTES_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("requestCancelActivityTaskDecisionAttributes")
            .build();
    private static final MarshallingInfo<StructuredPojo> COMPLETEWORKFLOWEXECUTIONDECISIONATTRIBUTES_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("completeWorkflowExecutionDecisionAttributes")
            .build();
    private static final MarshallingInfo<StructuredPojo> FAILWORKFLOWEXECUTIONDECISIONATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failWorkflowExecutionDecisionAttributes").build();
    private static final MarshallingInfo<StructuredPojo> CANCELWORKFLOWEXECUTIONDECISIONATTRIBUTES_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cancelWorkflowExecutionDecisionAttributes")
            .build();
    private static final MarshallingInfo<StructuredPojo> CONTINUEASNEWWORKFLOWEXECUTIONDECISIONATTRIBUTES_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("continueAsNewWorkflowExecutionDecisionAttributes").build();
    private static final MarshallingInfo<StructuredPojo> RECORDMARKERDECISIONATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recordMarkerDecisionAttributes").build();
    private static final MarshallingInfo<StructuredPojo> STARTTIMERDECISIONATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startTimerDecisionAttributes").build();
    private static final MarshallingInfo<StructuredPojo> CANCELTIMERDECISIONATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cancelTimerDecisionAttributes").build();
    private static final MarshallingInfo<StructuredPojo> SIGNALEXTERNALWORKFLOWEXECUTIONDECISIONATTRIBUTES_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("signalExternalWorkflowExecutionDecisionAttributes").build();
    private static final MarshallingInfo<StructuredPojo> REQUESTCANCELEXTERNALWORKFLOWEXECUTIONDECISIONATTRIBUTES_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("requestCancelExternalWorkflowExecutionDecisionAttributes").build();
    private static final MarshallingInfo<StructuredPojo> STARTCHILDWORKFLOWEXECUTIONDECISIONATTRIBUTES_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("startChildWorkflowExecutionDecisionAttributes").build();
    private static final MarshallingInfo<StructuredPojo> SCHEDULELAMBDAFUNCTIONDECISIONATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scheduleLambdaFunctionDecisionAttributes").build();

    private static final DecisionMarshaller instance = new DecisionMarshaller();

    public static DecisionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Decision decision, ProtocolMarshaller protocolMarshaller) {

        if (decision == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(decision.getDecisionType(), DECISIONTYPE_BINDING);
            protocolMarshaller.marshall(decision.getScheduleActivityTaskDecisionAttributes(), SCHEDULEACTIVITYTASKDECISIONATTRIBUTES_BINDING);
            protocolMarshaller.marshall(decision.getRequestCancelActivityTaskDecisionAttributes(), REQUESTCANCELACTIVITYTASKDECISIONATTRIBUTES_BINDING);
            protocolMarshaller.marshall(decision.getCompleteWorkflowExecutionDecisionAttributes(), COMPLETEWORKFLOWEXECUTIONDECISIONATTRIBUTES_BINDING);
            protocolMarshaller.marshall(decision.getFailWorkflowExecutionDecisionAttributes(), FAILWORKFLOWEXECUTIONDECISIONATTRIBUTES_BINDING);
            protocolMarshaller.marshall(decision.getCancelWorkflowExecutionDecisionAttributes(), CANCELWORKFLOWEXECUTIONDECISIONATTRIBUTES_BINDING);
            protocolMarshaller.marshall(decision.getContinueAsNewWorkflowExecutionDecisionAttributes(),
                    CONTINUEASNEWWORKFLOWEXECUTIONDECISIONATTRIBUTES_BINDING);
            protocolMarshaller.marshall(decision.getRecordMarkerDecisionAttributes(), RECORDMARKERDECISIONATTRIBUTES_BINDING);
            protocolMarshaller.marshall(decision.getStartTimerDecisionAttributes(), STARTTIMERDECISIONATTRIBUTES_BINDING);
            protocolMarshaller.marshall(decision.getCancelTimerDecisionAttributes(), CANCELTIMERDECISIONATTRIBUTES_BINDING);
            protocolMarshaller.marshall(decision.getSignalExternalWorkflowExecutionDecisionAttributes(),
                    SIGNALEXTERNALWORKFLOWEXECUTIONDECISIONATTRIBUTES_BINDING);
            protocolMarshaller.marshall(decision.getRequestCancelExternalWorkflowExecutionDecisionAttributes(),
                    REQUESTCANCELEXTERNALWORKFLOWEXECUTIONDECISIONATTRIBUTES_BINDING);
            protocolMarshaller.marshall(decision.getStartChildWorkflowExecutionDecisionAttributes(), STARTCHILDWORKFLOWEXECUTIONDECISIONATTRIBUTES_BINDING);
            protocolMarshaller.marshall(decision.getScheduleLambdaFunctionDecisionAttributes(), SCHEDULELAMBDAFUNCTIONDECISIONATTRIBUTES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
