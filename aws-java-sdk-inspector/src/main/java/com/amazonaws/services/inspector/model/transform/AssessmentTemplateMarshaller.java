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
package com.amazonaws.services.inspector.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AssessmentTemplateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AssessmentTemplateMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> ASSESSMENTTARGETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assessmentTargetArn").build();
    private static final MarshallingInfo<Integer> DURATIONINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("durationInSeconds").build();
    private static final MarshallingInfo<List> RULESPACKAGEARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rulesPackageArns").build();
    private static final MarshallingInfo<List> USERATTRIBUTESFORFINDINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("userAttributesForFindings").build();
    private static final MarshallingInfo<String> LASTASSESSMENTRUNARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastAssessmentRunArn").build();
    private static final MarshallingInfo<Integer> ASSESSMENTRUNCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assessmentRunCount").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();

    private static final AssessmentTemplateMarshaller instance = new AssessmentTemplateMarshaller();

    public static AssessmentTemplateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AssessmentTemplate assessmentTemplate, ProtocolMarshaller protocolMarshaller) {

        if (assessmentTemplate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(assessmentTemplate.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(assessmentTemplate.getName(), NAME_BINDING);
            protocolMarshaller.marshall(assessmentTemplate.getAssessmentTargetArn(), ASSESSMENTTARGETARN_BINDING);
            protocolMarshaller.marshall(assessmentTemplate.getDurationInSeconds(), DURATIONINSECONDS_BINDING);
            protocolMarshaller.marshall(assessmentTemplate.getRulesPackageArns(), RULESPACKAGEARNS_BINDING);
            protocolMarshaller.marshall(assessmentTemplate.getUserAttributesForFindings(), USERATTRIBUTESFORFINDINGS_BINDING);
            protocolMarshaller.marshall(assessmentTemplate.getLastAssessmentRunArn(), LASTASSESSMENTRUNARN_BINDING);
            protocolMarshaller.marshall(assessmentTemplate.getAssessmentRunCount(), ASSESSMENTRUNCOUNT_BINDING);
            protocolMarshaller.marshall(assessmentTemplate.getCreatedAt(), CREATEDAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
