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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.auditmanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateAssessmentRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateAssessmentRequestMarshaller {

    private static final MarshallingInfo<String> ASSESSMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("assessmentId").build();
    private static final MarshallingInfo<String> ASSESSMENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assessmentName").build();
    private static final MarshallingInfo<String> ASSESSMENTDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assessmentDescription").build();
    private static final MarshallingInfo<StructuredPojo> SCOPE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scope").build();
    private static final MarshallingInfo<StructuredPojo> ASSESSMENTREPORTSDESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assessmentReportsDestination").build();
    private static final MarshallingInfo<List> ROLES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roles").build();

    private static final UpdateAssessmentRequestMarshaller instance = new UpdateAssessmentRequestMarshaller();

    public static UpdateAssessmentRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateAssessmentRequest updateAssessmentRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateAssessmentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateAssessmentRequest.getAssessmentId(), ASSESSMENTID_BINDING);
            protocolMarshaller.marshall(updateAssessmentRequest.getAssessmentName(), ASSESSMENTNAME_BINDING);
            protocolMarshaller.marshall(updateAssessmentRequest.getAssessmentDescription(), ASSESSMENTDESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateAssessmentRequest.getScope(), SCOPE_BINDING);
            protocolMarshaller.marshall(updateAssessmentRequest.getAssessmentReportsDestination(), ASSESSMENTREPORTSDESTINATION_BINDING);
            protocolMarshaller.marshall(updateAssessmentRequest.getRoles(), ROLES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
