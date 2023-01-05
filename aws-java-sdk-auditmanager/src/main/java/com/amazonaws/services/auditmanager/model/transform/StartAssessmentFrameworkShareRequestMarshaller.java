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
 * StartAssessmentFrameworkShareRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartAssessmentFrameworkShareRequestMarshaller {

    private static final MarshallingInfo<String> FRAMEWORKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("frameworkId").build();
    private static final MarshallingInfo<String> DESTINATIONACCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destinationAccount").build();
    private static final MarshallingInfo<String> DESTINATIONREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destinationRegion").build();
    private static final MarshallingInfo<String> COMMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("comment").build();

    private static final StartAssessmentFrameworkShareRequestMarshaller instance = new StartAssessmentFrameworkShareRequestMarshaller();

    public static StartAssessmentFrameworkShareRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartAssessmentFrameworkShareRequest startAssessmentFrameworkShareRequest, ProtocolMarshaller protocolMarshaller) {

        if (startAssessmentFrameworkShareRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startAssessmentFrameworkShareRequest.getFrameworkId(), FRAMEWORKID_BINDING);
            protocolMarshaller.marshall(startAssessmentFrameworkShareRequest.getDestinationAccount(), DESTINATIONACCOUNT_BINDING);
            protocolMarshaller.marshall(startAssessmentFrameworkShareRequest.getDestinationRegion(), DESTINATIONREGION_BINDING);
            protocolMarshaller.marshall(startAssessmentFrameworkShareRequest.getComment(), COMMENT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
