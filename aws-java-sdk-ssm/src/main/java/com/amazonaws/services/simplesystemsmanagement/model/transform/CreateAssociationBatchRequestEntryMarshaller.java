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
 * CreateAssociationBatchRequestEntryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateAssociationBatchRequestEntryMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> INSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceId").build();
    private static final MarshallingInfo<Map> PARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Parameters").build();
    private static final MarshallingInfo<String> AUTOMATIONTARGETPARAMETERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutomationTargetParameterName").build();
    private static final MarshallingInfo<String> DOCUMENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentVersion").build();
    private static final MarshallingInfo<List> TARGETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Targets").build();
    private static final MarshallingInfo<String> SCHEDULEEXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScheduleExpression").build();
    private static final MarshallingInfo<StructuredPojo> OUTPUTLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputLocation").build();
    private static final MarshallingInfo<String> ASSOCIATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociationName").build();
    private static final MarshallingInfo<String> MAXERRORS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MaxErrors").build();
    private static final MarshallingInfo<String> MAXCONCURRENCY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxConcurrency").build();
    private static final MarshallingInfo<String> COMPLIANCESEVERITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComplianceSeverity").build();

    private static final CreateAssociationBatchRequestEntryMarshaller instance = new CreateAssociationBatchRequestEntryMarshaller();

    public static CreateAssociationBatchRequestEntryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateAssociationBatchRequestEntry createAssociationBatchRequestEntry, ProtocolMarshaller protocolMarshaller) {

        if (createAssociationBatchRequestEntry == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createAssociationBatchRequestEntry.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createAssociationBatchRequestEntry.getInstanceId(), INSTANCEID_BINDING);
            protocolMarshaller.marshall(createAssociationBatchRequestEntry.getParameters(), PARAMETERS_BINDING);
            protocolMarshaller.marshall(createAssociationBatchRequestEntry.getAutomationTargetParameterName(), AUTOMATIONTARGETPARAMETERNAME_BINDING);
            protocolMarshaller.marshall(createAssociationBatchRequestEntry.getDocumentVersion(), DOCUMENTVERSION_BINDING);
            protocolMarshaller.marshall(createAssociationBatchRequestEntry.getTargets(), TARGETS_BINDING);
            protocolMarshaller.marshall(createAssociationBatchRequestEntry.getScheduleExpression(), SCHEDULEEXPRESSION_BINDING);
            protocolMarshaller.marshall(createAssociationBatchRequestEntry.getOutputLocation(), OUTPUTLOCATION_BINDING);
            protocolMarshaller.marshall(createAssociationBatchRequestEntry.getAssociationName(), ASSOCIATIONNAME_BINDING);
            protocolMarshaller.marshall(createAssociationBatchRequestEntry.getMaxErrors(), MAXERRORS_BINDING);
            protocolMarshaller.marshall(createAssociationBatchRequestEntry.getMaxConcurrency(), MAXCONCURRENCY_BINDING);
            protocolMarshaller.marshall(createAssociationBatchRequestEntry.getComplianceSeverity(), COMPLIANCESEVERITY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
