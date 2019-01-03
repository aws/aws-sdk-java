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
 * QualificationTypeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class QualificationTypeMarshaller {

    private static final MarshallingInfo<String> QUALIFICATIONTYPEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QualificationTypeId").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> KEYWORDS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Keywords").build();
    private static final MarshallingInfo<String> QUALIFICATIONTYPESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QualificationTypeStatus").build();
    private static final MarshallingInfo<String> TEST_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Test").build();
    private static final MarshallingInfo<Long> TESTDURATIONINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TestDurationInSeconds").build();
    private static final MarshallingInfo<String> ANSWERKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AnswerKey").build();
    private static final MarshallingInfo<Long> RETRYDELAYINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RetryDelayInSeconds").build();
    private static final MarshallingInfo<Boolean> ISREQUESTABLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsRequestable").build();
    private static final MarshallingInfo<Boolean> AUTOGRANTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoGranted").build();
    private static final MarshallingInfo<Integer> AUTOGRANTEDVALUE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoGrantedValue").build();

    private static final QualificationTypeMarshaller instance = new QualificationTypeMarshaller();

    public static QualificationTypeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(QualificationType qualificationType, ProtocolMarshaller protocolMarshaller) {

        if (qualificationType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(qualificationType.getQualificationTypeId(), QUALIFICATIONTYPEID_BINDING);
            protocolMarshaller.marshall(qualificationType.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(qualificationType.getName(), NAME_BINDING);
            protocolMarshaller.marshall(qualificationType.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(qualificationType.getKeywords(), KEYWORDS_BINDING);
            protocolMarshaller.marshall(qualificationType.getQualificationTypeStatus(), QUALIFICATIONTYPESTATUS_BINDING);
            protocolMarshaller.marshall(qualificationType.getTest(), TEST_BINDING);
            protocolMarshaller.marshall(qualificationType.getTestDurationInSeconds(), TESTDURATIONINSECONDS_BINDING);
            protocolMarshaller.marshall(qualificationType.getAnswerKey(), ANSWERKEY_BINDING);
            protocolMarshaller.marshall(qualificationType.getRetryDelayInSeconds(), RETRYDELAYINSECONDS_BINDING);
            protocolMarshaller.marshall(qualificationType.getIsRequestable(), ISREQUESTABLE_BINDING);
            protocolMarshaller.marshall(qualificationType.getAutoGranted(), AUTOGRANTED_BINDING);
            protocolMarshaller.marshall(qualificationType.getAutoGrantedValue(), AUTOGRANTEDVALUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
