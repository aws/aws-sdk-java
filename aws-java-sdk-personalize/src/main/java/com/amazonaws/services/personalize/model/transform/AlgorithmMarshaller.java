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
package com.amazonaws.services.personalize.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.personalize.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AlgorithmMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AlgorithmMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> ALGORITHMARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("algorithmArn").build();
    private static final MarshallingInfo<StructuredPojo> ALGORITHMIMAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("algorithmImage").build();
    private static final MarshallingInfo<Map> DEFAULTHYPERPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultHyperParameters").build();
    private static final MarshallingInfo<StructuredPojo> DEFAULTHYPERPARAMETERRANGES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultHyperParameterRanges").build();
    private static final MarshallingInfo<Map> DEFAULTRESOURCECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultResourceConfig").build();
    private static final MarshallingInfo<String> TRAININGINPUTMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("trainingInputMode").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArn").build();
    private static final MarshallingInfo<java.util.Date> CREATIONDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationDateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdatedDateTime").timestampFormat("unixTimestamp").build();

    private static final AlgorithmMarshaller instance = new AlgorithmMarshaller();

    public static AlgorithmMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Algorithm algorithm, ProtocolMarshaller protocolMarshaller) {

        if (algorithm == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(algorithm.getName(), NAME_BINDING);
            protocolMarshaller.marshall(algorithm.getAlgorithmArn(), ALGORITHMARN_BINDING);
            protocolMarshaller.marshall(algorithm.getAlgorithmImage(), ALGORITHMIMAGE_BINDING);
            protocolMarshaller.marshall(algorithm.getDefaultHyperParameters(), DEFAULTHYPERPARAMETERS_BINDING);
            protocolMarshaller.marshall(algorithm.getDefaultHyperParameterRanges(), DEFAULTHYPERPARAMETERRANGES_BINDING);
            protocolMarshaller.marshall(algorithm.getDefaultResourceConfig(), DEFAULTRESOURCECONFIG_BINDING);
            protocolMarshaller.marshall(algorithm.getTrainingInputMode(), TRAININGINPUTMODE_BINDING);
            protocolMarshaller.marshall(algorithm.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(algorithm.getCreationDateTime(), CREATIONDATETIME_BINDING);
            protocolMarshaller.marshall(algorithm.getLastUpdatedDateTime(), LASTUPDATEDDATETIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
