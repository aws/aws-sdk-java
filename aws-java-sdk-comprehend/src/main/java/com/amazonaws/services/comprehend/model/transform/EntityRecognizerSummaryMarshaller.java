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
package com.amazonaws.services.comprehend.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.comprehend.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EntityRecognizerSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EntityRecognizerSummaryMarshaller {

    private static final MarshallingInfo<String> RECOGNIZERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecognizerName").build();
    private static final MarshallingInfo<Integer> NUMBEROFVERSIONS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfVersions").build();
    private static final MarshallingInfo<java.util.Date> LATESTVERSIONCREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LatestVersionCreatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> LATESTVERSIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LatestVersionName").build();
    private static final MarshallingInfo<String> LATESTVERSIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LatestVersionStatus").build();

    private static final EntityRecognizerSummaryMarshaller instance = new EntityRecognizerSummaryMarshaller();

    public static EntityRecognizerSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EntityRecognizerSummary entityRecognizerSummary, ProtocolMarshaller protocolMarshaller) {

        if (entityRecognizerSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(entityRecognizerSummary.getRecognizerName(), RECOGNIZERNAME_BINDING);
            protocolMarshaller.marshall(entityRecognizerSummary.getNumberOfVersions(), NUMBEROFVERSIONS_BINDING);
            protocolMarshaller.marshall(entityRecognizerSummary.getLatestVersionCreatedAt(), LATESTVERSIONCREATEDAT_BINDING);
            protocolMarshaller.marshall(entityRecognizerSummary.getLatestVersionName(), LATESTVERSIONNAME_BINDING);
            protocolMarshaller.marshall(entityRecognizerSummary.getLatestVersionStatus(), LATESTVERSIONSTATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
