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
package com.amazonaws.services.mturk.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mturk.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateQualificationTypeRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateQualificationTypeRequestMarshaller {

    private static final MarshallingInfo<String> QUALIFICATIONTYPEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QualificationTypeId").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> QUALIFICATIONTYPESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QualificationTypeStatus").build();
    private static final MarshallingInfo<String> TEST_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Test").build();
    private static final MarshallingInfo<String> ANSWERKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AnswerKey").build();
    private static final MarshallingInfo<Long> TESTDURATIONINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TestDurationInSeconds").build();
    private static final MarshallingInfo<Long> RETRYDELAYINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RetryDelayInSeconds").build();
    private static final MarshallingInfo<Boolean> AUTOGRANTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoGranted").build();
    private static final MarshallingInfo<Integer> AUTOGRANTEDVALUE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoGrantedValue").build();

    private static final UpdateQualificationTypeRequestMarshaller instance = new UpdateQualificationTypeRequestMarshaller();

    public static UpdateQualificationTypeRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateQualificationTypeRequest updateQualificationTypeRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateQualificationTypeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateQualificationTypeRequest.getQualificationTypeId(), QUALIFICATIONTYPEID_BINDING);
            protocolMarshaller.marshall(updateQualificationTypeRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateQualificationTypeRequest.getQualificationTypeStatus(), QUALIFICATIONTYPESTATUS_BINDING);
            protocolMarshaller.marshall(updateQualificationTypeRequest.getTest(), TEST_BINDING);
            protocolMarshaller.marshall(updateQualificationTypeRequest.getAnswerKey(), ANSWERKEY_BINDING);
            protocolMarshaller.marshall(updateQualificationTypeRequest.getTestDurationInSeconds(), TESTDURATIONINSECONDS_BINDING);
            protocolMarshaller.marshall(updateQualificationTypeRequest.getRetryDelayInSeconds(), RETRYDELAYINSECONDS_BINDING);
            protocolMarshaller.marshall(updateQualificationTypeRequest.getAutoGranted(), AUTOGRANTED_BINDING);
            protocolMarshaller.marshall(updateQualificationTypeRequest.getAutoGrantedValue(), AUTOGRANTEDVALUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
