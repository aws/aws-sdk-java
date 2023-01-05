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
package com.amazonaws.services.apprunner.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apprunner.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ObservabilityConfigurationSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ObservabilityConfigurationSummaryMarshaller {

    private static final MarshallingInfo<String> OBSERVABILITYCONFIGURATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ObservabilityConfigurationArn").build();
    private static final MarshallingInfo<String> OBSERVABILITYCONFIGURATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ObservabilityConfigurationName").build();
    private static final MarshallingInfo<Integer> OBSERVABILITYCONFIGURATIONREVISION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ObservabilityConfigurationRevision").build();

    private static final ObservabilityConfigurationSummaryMarshaller instance = new ObservabilityConfigurationSummaryMarshaller();

    public static ObservabilityConfigurationSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ObservabilityConfigurationSummary observabilityConfigurationSummary, ProtocolMarshaller protocolMarshaller) {

        if (observabilityConfigurationSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(observabilityConfigurationSummary.getObservabilityConfigurationArn(), OBSERVABILITYCONFIGURATIONARN_BINDING);
            protocolMarshaller.marshall(observabilityConfigurationSummary.getObservabilityConfigurationName(), OBSERVABILITYCONFIGURATIONNAME_BINDING);
            protocolMarshaller.marshall(observabilityConfigurationSummary.getObservabilityConfigurationRevision(), OBSERVABILITYCONFIGURATIONREVISION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
