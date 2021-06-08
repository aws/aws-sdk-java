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
package com.amazonaws.services.auditmanager.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.auditmanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EvidenceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EvidenceMarshaller {

    private static final MarshallingInfo<String> DATASOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataSource").build();
    private static final MarshallingInfo<String> EVIDENCEAWSACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("evidenceAwsAccountId").build();
    private static final MarshallingInfo<java.util.Date> TIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("time").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> EVENTSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("eventSource").build();
    private static final MarshallingInfo<String> EVENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("eventName").build();
    private static final MarshallingInfo<String> EVIDENCEBYTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("evidenceByType").build();
    private static final MarshallingInfo<List> RESOURCESINCLUDED_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourcesIncluded").build();
    private static final MarshallingInfo<Map> ATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("attributes").build();
    private static final MarshallingInfo<String> IAMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("iamId").build();
    private static final MarshallingInfo<String> COMPLIANCECHECK_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("complianceCheck").build();
    private static final MarshallingInfo<String> AWSORGANIZATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("awsOrganization").build();
    private static final MarshallingInfo<String> AWSACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("awsAccountId").build();
    private static final MarshallingInfo<String> EVIDENCEFOLDERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("evidenceFolderId").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> ASSESSMENTREPORTSELECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assessmentReportSelection").build();

    private static final EvidenceMarshaller instance = new EvidenceMarshaller();

    public static EvidenceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Evidence evidence, ProtocolMarshaller protocolMarshaller) {

        if (evidence == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(evidence.getDataSource(), DATASOURCE_BINDING);
            protocolMarshaller.marshall(evidence.getEvidenceAwsAccountId(), EVIDENCEAWSACCOUNTID_BINDING);
            protocolMarshaller.marshall(evidence.getTime(), TIME_BINDING);
            protocolMarshaller.marshall(evidence.getEventSource(), EVENTSOURCE_BINDING);
            protocolMarshaller.marshall(evidence.getEventName(), EVENTNAME_BINDING);
            protocolMarshaller.marshall(evidence.getEvidenceByType(), EVIDENCEBYTYPE_BINDING);
            protocolMarshaller.marshall(evidence.getResourcesIncluded(), RESOURCESINCLUDED_BINDING);
            protocolMarshaller.marshall(evidence.getAttributes(), ATTRIBUTES_BINDING);
            protocolMarshaller.marshall(evidence.getIamId(), IAMID_BINDING);
            protocolMarshaller.marshall(evidence.getComplianceCheck(), COMPLIANCECHECK_BINDING);
            protocolMarshaller.marshall(evidence.getAwsOrganization(), AWSORGANIZATION_BINDING);
            protocolMarshaller.marshall(evidence.getAwsAccountId(), AWSACCOUNTID_BINDING);
            protocolMarshaller.marshall(evidence.getEvidenceFolderId(), EVIDENCEFOLDERID_BINDING);
            protocolMarshaller.marshall(evidence.getId(), ID_BINDING);
            protocolMarshaller.marshall(evidence.getAssessmentReportSelection(), ASSESSMENTREPORTSELECTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
