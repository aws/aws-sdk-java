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
package com.amazonaws.services.resiliencehub.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.resiliencehub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AppAssessmentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AppAssessmentMarshaller {

    private static final MarshallingInfo<String> APPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("appArn").build();
    private static final MarshallingInfo<String> APPVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("appVersion").build();
    private static final MarshallingInfo<String> ASSESSMENTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assessmentArn").build();
    private static final MarshallingInfo<String> ASSESSMENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assessmentName").build();
    private static final MarshallingInfo<String> ASSESSMENTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assessmentStatus").build();
    private static final MarshallingInfo<Map> COMPLIANCE_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("compliance").build();
    private static final MarshallingInfo<String> COMPLIANCESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("complianceStatus").build();
    private static final MarshallingInfo<StructuredPojo> COST_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cost").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> INVOKER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("invoker").build();
    private static final MarshallingInfo<String> MESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("message").build();
    private static final MarshallingInfo<StructuredPojo> POLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("policy").build();
    private static final MarshallingInfo<StructuredPojo> RESILIENCYSCORE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resiliencyScore").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCEERRORSDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceErrorsDetails").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final AppAssessmentMarshaller instance = new AppAssessmentMarshaller();

    public static AppAssessmentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AppAssessment appAssessment, ProtocolMarshaller protocolMarshaller) {

        if (appAssessment == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(appAssessment.getAppArn(), APPARN_BINDING);
            protocolMarshaller.marshall(appAssessment.getAppVersion(), APPVERSION_BINDING);
            protocolMarshaller.marshall(appAssessment.getAssessmentArn(), ASSESSMENTARN_BINDING);
            protocolMarshaller.marshall(appAssessment.getAssessmentName(), ASSESSMENTNAME_BINDING);
            protocolMarshaller.marshall(appAssessment.getAssessmentStatus(), ASSESSMENTSTATUS_BINDING);
            protocolMarshaller.marshall(appAssessment.getCompliance(), COMPLIANCE_BINDING);
            protocolMarshaller.marshall(appAssessment.getComplianceStatus(), COMPLIANCESTATUS_BINDING);
            protocolMarshaller.marshall(appAssessment.getCost(), COST_BINDING);
            protocolMarshaller.marshall(appAssessment.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(appAssessment.getInvoker(), INVOKER_BINDING);
            protocolMarshaller.marshall(appAssessment.getMessage(), MESSAGE_BINDING);
            protocolMarshaller.marshall(appAssessment.getPolicy(), POLICY_BINDING);
            protocolMarshaller.marshall(appAssessment.getResiliencyScore(), RESILIENCYSCORE_BINDING);
            protocolMarshaller.marshall(appAssessment.getResourceErrorsDetails(), RESOURCEERRORSDETAILS_BINDING);
            protocolMarshaller.marshall(appAssessment.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(appAssessment.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
