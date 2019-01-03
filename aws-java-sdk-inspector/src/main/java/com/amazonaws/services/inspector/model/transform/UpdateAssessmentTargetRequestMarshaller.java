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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateAssessmentTargetRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateAssessmentTargetRequestMarshaller {

    private static final MarshallingInfo<String> ASSESSMENTTARGETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assessmentTargetArn").build();
    private static final MarshallingInfo<String> ASSESSMENTTARGETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assessmentTargetName").build();
    private static final MarshallingInfo<String> RESOURCEGROUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceGroupArn").build();

    private static final UpdateAssessmentTargetRequestMarshaller instance = new UpdateAssessmentTargetRequestMarshaller();

    public static UpdateAssessmentTargetRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateAssessmentTargetRequest updateAssessmentTargetRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateAssessmentTargetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateAssessmentTargetRequest.getAssessmentTargetArn(), ASSESSMENTTARGETARN_BINDING);
            protocolMarshaller.marshall(updateAssessmentTargetRequest.getAssessmentTargetName(), ASSESSMENTTARGETNAME_BINDING);
            protocolMarshaller.marshall(updateAssessmentTargetRequest.getResourceGroupArn(), RESOURCEGROUPARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
