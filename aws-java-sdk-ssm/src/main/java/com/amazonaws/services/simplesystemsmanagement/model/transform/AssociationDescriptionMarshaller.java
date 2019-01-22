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
 * AssociationDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AssociationDescriptionMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> INSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceId").build();
    private static final MarshallingInfo<String> ASSOCIATIONVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociationVersion").build();
    private static final MarshallingInfo<java.util.Date> DATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Date").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEASSOCIATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdateAssociationDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Status").build();
    private static final MarshallingInfo<StructuredPojo> OVERVIEW_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Overview").build();
    private static final MarshallingInfo<String> DOCUMENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentVersion").build();
    private static final MarshallingInfo<String> AUTOMATIONTARGETPARAMETERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutomationTargetParameterName").build();
    private static final MarshallingInfo<Map> PARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Parameters").build();
    private static final MarshallingInfo<String> ASSOCIATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociationId").build();
    private static final MarshallingInfo<List> TARGETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Targets").build();
    private static final MarshallingInfo<String> SCHEDULEEXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScheduleExpression").build();
    private static final MarshallingInfo<StructuredPojo> OUTPUTLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputLocation").build();
    private static final MarshallingInfo<java.util.Date> LASTEXECUTIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastExecutionDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTSUCCESSFULEXECUTIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastSuccessfulExecutionDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> ASSOCIATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociationName").build();
    private static final MarshallingInfo<String> MAXERRORS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MaxErrors").build();
    private static final MarshallingInfo<String> MAXCONCURRENCY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxConcurrency").build();
    private static final MarshallingInfo<String> COMPLIANCESEVERITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComplianceSeverity").build();

    private static final AssociationDescriptionMarshaller instance = new AssociationDescriptionMarshaller();

    public static AssociationDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AssociationDescription associationDescription, ProtocolMarshaller protocolMarshaller) {

        if (associationDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(associationDescription.getName(), NAME_BINDING);
            protocolMarshaller.marshall(associationDescription.getInstanceId(), INSTANCEID_BINDING);
            protocolMarshaller.marshall(associationDescription.getAssociationVersion(), ASSOCIATIONVERSION_BINDING);
            protocolMarshaller.marshall(associationDescription.getDate(), DATE_BINDING);
            protocolMarshaller.marshall(associationDescription.getLastUpdateAssociationDate(), LASTUPDATEASSOCIATIONDATE_BINDING);
            protocolMarshaller.marshall(associationDescription.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(associationDescription.getOverview(), OVERVIEW_BINDING);
            protocolMarshaller.marshall(associationDescription.getDocumentVersion(), DOCUMENTVERSION_BINDING);
            protocolMarshaller.marshall(associationDescription.getAutomationTargetParameterName(), AUTOMATIONTARGETPARAMETERNAME_BINDING);
            protocolMarshaller.marshall(associationDescription.getParameters(), PARAMETERS_BINDING);
            protocolMarshaller.marshall(associationDescription.getAssociationId(), ASSOCIATIONID_BINDING);
            protocolMarshaller.marshall(associationDescription.getTargets(), TARGETS_BINDING);
            protocolMarshaller.marshall(associationDescription.getScheduleExpression(), SCHEDULEEXPRESSION_BINDING);
            protocolMarshaller.marshall(associationDescription.getOutputLocation(), OUTPUTLOCATION_BINDING);
            protocolMarshaller.marshall(associationDescription.getLastExecutionDate(), LASTEXECUTIONDATE_BINDING);
            protocolMarshaller.marshall(associationDescription.getLastSuccessfulExecutionDate(), LASTSUCCESSFULEXECUTIONDATE_BINDING);
            protocolMarshaller.marshall(associationDescription.getAssociationName(), ASSOCIATIONNAME_BINDING);
            protocolMarshaller.marshall(associationDescription.getMaxErrors(), MAXERRORS_BINDING);
            protocolMarshaller.marshall(associationDescription.getMaxConcurrency(), MAXCONCURRENCY_BINDING);
            protocolMarshaller.marshall(associationDescription.getComplianceSeverity(), COMPLIANCESEVERITY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
