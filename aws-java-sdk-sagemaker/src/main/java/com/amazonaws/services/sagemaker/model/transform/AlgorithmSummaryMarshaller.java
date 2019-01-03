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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AlgorithmSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AlgorithmSummaryMarshaller {

    private static final MarshallingInfo<String> ALGORITHMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AlgorithmName").build();
    private static final MarshallingInfo<String> ALGORITHMARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AlgorithmArn").build();
    private static final MarshallingInfo<String> ALGORITHMDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AlgorithmDescription").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> ALGORITHMSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AlgorithmStatus").build();

    private static final AlgorithmSummaryMarshaller instance = new AlgorithmSummaryMarshaller();

    public static AlgorithmSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AlgorithmSummary algorithmSummary, ProtocolMarshaller protocolMarshaller) {

        if (algorithmSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(algorithmSummary.getAlgorithmName(), ALGORITHMNAME_BINDING);
            protocolMarshaller.marshall(algorithmSummary.getAlgorithmArn(), ALGORITHMARN_BINDING);
            protocolMarshaller.marshall(algorithmSummary.getAlgorithmDescription(), ALGORITHMDESCRIPTION_BINDING);
            protocolMarshaller.marshall(algorithmSummary.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(algorithmSummary.getAlgorithmStatus(), ALGORITHMSTATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
