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
 * CreateAssessmentTemplateRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateAssessmentTemplateRequestMarshaller {

    private static final MarshallingInfo<String> ASSESSMENTTARGETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assessmentTargetArn").build();
    private static final MarshallingInfo<String> ASSESSMENTTEMPLATENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assessmentTemplateName").build();
    private static final MarshallingInfo<Integer> DURATIONINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("durationInSeconds").build();
    private static final MarshallingInfo<List> RULESPACKAGEARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rulesPackageArns").build();
    private static final MarshallingInfo<List> USERATTRIBUTESFORFINDINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("userAttributesForFindings").build();

    private static final CreateAssessmentTemplateRequestMarshaller instance = new CreateAssessmentTemplateRequestMarshaller();

    public static CreateAssessmentTemplateRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateAssessmentTemplateRequest createAssessmentTemplateRequest, ProtocolMarshaller protocolMarshaller) {

        if (createAssessmentTemplateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createAssessmentTemplateRequest.getAssessmentTargetArn(), ASSESSMENTTARGETARN_BINDING);
            protocolMarshaller.marshall(createAssessmentTemplateRequest.getAssessmentTemplateName(), ASSESSMENTTEMPLATENAME_BINDING);
            protocolMarshaller.marshall(createAssessmentTemplateRequest.getDurationInSeconds(), DURATIONINSECONDS_BINDING);
            protocolMarshaller.marshall(createAssessmentTemplateRequest.getRulesPackageArns(), RULESPACKAGEARNS_BINDING);
            protocolMarshaller.marshall(createAssessmentTemplateRequest.getUserAttributesForFindings(), USERATTRIBUTESFORFINDINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
