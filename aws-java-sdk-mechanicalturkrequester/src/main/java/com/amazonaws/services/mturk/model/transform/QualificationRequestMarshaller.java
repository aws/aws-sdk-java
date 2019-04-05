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
 * QualificationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class QualificationRequestMarshaller {

    private static final MarshallingInfo<String> QUALIFICATIONREQUESTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QualificationRequestId").build();
    private static final MarshallingInfo<String> QUALIFICATIONTYPEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QualificationTypeId").build();
    private static final MarshallingInfo<String> WORKERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("WorkerId").build();
    private static final MarshallingInfo<String> TEST_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Test").build();
    private static final MarshallingInfo<String> ANSWER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Answer").build();
    private static final MarshallingInfo<java.util.Date> SUBMITTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubmitTime").timestampFormat("unixTimestamp").build();

    private static final QualificationRequestMarshaller instance = new QualificationRequestMarshaller();

    public static QualificationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(QualificationRequest qualificationRequest, ProtocolMarshaller protocolMarshaller) {

        if (qualificationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(qualificationRequest.getQualificationRequestId(), QUALIFICATIONREQUESTID_BINDING);
            protocolMarshaller.marshall(qualificationRequest.getQualificationTypeId(), QUALIFICATIONTYPEID_BINDING);
            protocolMarshaller.marshall(qualificationRequest.getWorkerId(), WORKERID_BINDING);
            protocolMarshaller.marshall(qualificationRequest.getTest(), TEST_BINDING);
            protocolMarshaller.marshall(qualificationRequest.getAnswer(), ANSWER_BINDING);
            protocolMarshaller.marshall(qualificationRequest.getSubmitTime(), SUBMITTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
