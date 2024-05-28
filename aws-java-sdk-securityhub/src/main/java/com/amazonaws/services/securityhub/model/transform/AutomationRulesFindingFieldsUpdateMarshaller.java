/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AutomationRulesFindingFieldsUpdateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AutomationRulesFindingFieldsUpdateMarshaller {

    private static final MarshallingInfo<StructuredPojo> NOTE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Note").build();
    private static final MarshallingInfo<StructuredPojo> SEVERITY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Severity").build();
    private static final MarshallingInfo<String> VERIFICATIONSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VerificationState").build();
    private static final MarshallingInfo<Integer> CONFIDENCE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Confidence").build();
    private static final MarshallingInfo<Integer> CRITICALITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Criticality").build();
    private static final MarshallingInfo<List> TYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Types").build();
    private static final MarshallingInfo<Map> USERDEFINEDFIELDS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserDefinedFields").build();
    private static final MarshallingInfo<StructuredPojo> WORKFLOW_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Workflow").build();
    private static final MarshallingInfo<List> RELATEDFINDINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RelatedFindings").build();

    private static final AutomationRulesFindingFieldsUpdateMarshaller instance = new AutomationRulesFindingFieldsUpdateMarshaller();

    public static AutomationRulesFindingFieldsUpdateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AutomationRulesFindingFieldsUpdate automationRulesFindingFieldsUpdate, ProtocolMarshaller protocolMarshaller) {

        if (automationRulesFindingFieldsUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(automationRulesFindingFieldsUpdate.getNote(), NOTE_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFieldsUpdate.getSeverity(), SEVERITY_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFieldsUpdate.getVerificationState(), VERIFICATIONSTATE_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFieldsUpdate.getConfidence(), CONFIDENCE_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFieldsUpdate.getCriticality(), CRITICALITY_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFieldsUpdate.getTypes(), TYPES_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFieldsUpdate.getUserDefinedFields(), USERDEFINEDFIELDS_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFieldsUpdate.getWorkflow(), WORKFLOW_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFieldsUpdate.getRelatedFindings(), RELATEDFINDINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
