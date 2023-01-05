/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.auditmanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ControlInsightsMetadataByAssessmentItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ControlInsightsMetadataByAssessmentItemMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<StructuredPojo> EVIDENCEINSIGHTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("evidenceInsights").build();
    private static final MarshallingInfo<String> CONTROLSETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("controlSetName").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdated").timestampFormat("unixTimestamp").build();

    private static final ControlInsightsMetadataByAssessmentItemMarshaller instance = new ControlInsightsMetadataByAssessmentItemMarshaller();

    public static ControlInsightsMetadataByAssessmentItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ControlInsightsMetadataByAssessmentItem controlInsightsMetadataByAssessmentItem, ProtocolMarshaller protocolMarshaller) {

        if (controlInsightsMetadataByAssessmentItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(controlInsightsMetadataByAssessmentItem.getName(), NAME_BINDING);
            protocolMarshaller.marshall(controlInsightsMetadataByAssessmentItem.getId(), ID_BINDING);
            protocolMarshaller.marshall(controlInsightsMetadataByAssessmentItem.getEvidenceInsights(), EVIDENCEINSIGHTS_BINDING);
            protocolMarshaller.marshall(controlInsightsMetadataByAssessmentItem.getControlSetName(), CONTROLSETNAME_BINDING);
            protocolMarshaller.marshall(controlInsightsMetadataByAssessmentItem.getLastUpdated(), LASTUPDATED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
