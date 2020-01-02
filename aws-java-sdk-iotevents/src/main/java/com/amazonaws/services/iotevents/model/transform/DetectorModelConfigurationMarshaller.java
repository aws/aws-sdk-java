/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotevents.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotevents.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DetectorModelConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DetectorModelConfigurationMarshaller {

    private static final MarshallingInfo<String> DETECTORMODELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("detectorModelName").build();
    private static final MarshallingInfo<String> DETECTORMODELVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("detectorModelVersion").build();
    private static final MarshallingInfo<String> DETECTORMODELDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("detectorModelDescription").build();
    private static final MarshallingInfo<String> DETECTORMODELARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("detectorModelArn").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArn").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> KEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("key").build();
    private static final MarshallingInfo<String> EVALUATIONMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("evaluationMethod").build();

    private static final DetectorModelConfigurationMarshaller instance = new DetectorModelConfigurationMarshaller();

    public static DetectorModelConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DetectorModelConfiguration detectorModelConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (detectorModelConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(detectorModelConfiguration.getDetectorModelName(), DETECTORMODELNAME_BINDING);
            protocolMarshaller.marshall(detectorModelConfiguration.getDetectorModelVersion(), DETECTORMODELVERSION_BINDING);
            protocolMarshaller.marshall(detectorModelConfiguration.getDetectorModelDescription(), DETECTORMODELDESCRIPTION_BINDING);
            protocolMarshaller.marshall(detectorModelConfiguration.getDetectorModelArn(), DETECTORMODELARN_BINDING);
            protocolMarshaller.marshall(detectorModelConfiguration.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(detectorModelConfiguration.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(detectorModelConfiguration.getLastUpdateTime(), LASTUPDATETIME_BINDING);
            protocolMarshaller.marshall(detectorModelConfiguration.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(detectorModelConfiguration.getKey(), KEY_BINDING);
            protocolMarshaller.marshall(detectorModelConfiguration.getEvaluationMethod(), EVALUATIONMETHOD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
