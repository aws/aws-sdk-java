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
package com.amazonaws.services.iot.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AuditFindingMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AuditFindingMarshaller {

    private static final MarshallingInfo<String> TASKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("taskId").build();
    private static final MarshallingInfo<String> CHECKNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("checkName").build();
    private static final MarshallingInfo<java.util.Date> TASKSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> FINDINGTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("findingTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> SEVERITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("severity").build();
    private static final MarshallingInfo<StructuredPojo> NONCOMPLIANTRESOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nonCompliantResource").build();
    private static final MarshallingInfo<List> RELATEDRESOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("relatedResources").build();
    private static final MarshallingInfo<String> REASONFORNONCOMPLIANCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("reasonForNonCompliance").build();
    private static final MarshallingInfo<String> REASONFORNONCOMPLIANCECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("reasonForNonComplianceCode").build();

    private static final AuditFindingMarshaller instance = new AuditFindingMarshaller();

    public static AuditFindingMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AuditFinding auditFinding, ProtocolMarshaller protocolMarshaller) {

        if (auditFinding == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(auditFinding.getTaskId(), TASKID_BINDING);
            protocolMarshaller.marshall(auditFinding.getCheckName(), CHECKNAME_BINDING);
            protocolMarshaller.marshall(auditFinding.getTaskStartTime(), TASKSTARTTIME_BINDING);
            protocolMarshaller.marshall(auditFinding.getFindingTime(), FINDINGTIME_BINDING);
            protocolMarshaller.marshall(auditFinding.getSeverity(), SEVERITY_BINDING);
            protocolMarshaller.marshall(auditFinding.getNonCompliantResource(), NONCOMPLIANTRESOURCE_BINDING);
            protocolMarshaller.marshall(auditFinding.getRelatedResources(), RELATEDRESOURCES_BINDING);
            protocolMarshaller.marshall(auditFinding.getReasonForNonCompliance(), REASONFORNONCOMPLIANCE_BINDING);
            protocolMarshaller.marshall(auditFinding.getReasonForNonComplianceCode(), REASONFORNONCOMPLIANCECODE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
