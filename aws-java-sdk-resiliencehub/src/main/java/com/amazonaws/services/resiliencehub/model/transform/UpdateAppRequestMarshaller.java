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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.resiliencehub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateAppRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateAppRequestMarshaller {

    private static final MarshallingInfo<String> APPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("appArn").build();
    private static final MarshallingInfo<String> ASSESSMENTSCHEDULE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assessmentSchedule").build();
    private static final MarshallingInfo<Boolean> CLEARRESILIENCYPOLICYARN_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clearResiliencyPolicyArn").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> POLICYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("policyArn").build();

    private static final UpdateAppRequestMarshaller instance = new UpdateAppRequestMarshaller();

    public static UpdateAppRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateAppRequest updateAppRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateAppRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateAppRequest.getAppArn(), APPARN_BINDING);
            protocolMarshaller.marshall(updateAppRequest.getAssessmentSchedule(), ASSESSMENTSCHEDULE_BINDING);
            protocolMarshaller.marshall(updateAppRequest.getClearResiliencyPolicyArn(), CLEARRESILIENCYPOLICYARN_BINDING);
            protocolMarshaller.marshall(updateAppRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateAppRequest.getPolicyArn(), POLICYARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
