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
package com.amazonaws.services.quicksight.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RegisteredUserEmbeddingExperienceConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RegisteredUserEmbeddingExperienceConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> DASHBOARD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Dashboard").build();
    private static final MarshallingInfo<StructuredPojo> QUICKSIGHTCONSOLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QuickSightConsole").build();
    private static final MarshallingInfo<StructuredPojo> QSEARCHBAR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QSearchBar").build();
    private static final MarshallingInfo<StructuredPojo> DASHBOARDVISUAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DashboardVisual").build();

    private static final RegisteredUserEmbeddingExperienceConfigurationMarshaller instance = new RegisteredUserEmbeddingExperienceConfigurationMarshaller();

    public static RegisteredUserEmbeddingExperienceConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RegisteredUserEmbeddingExperienceConfiguration registeredUserEmbeddingExperienceConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (registeredUserEmbeddingExperienceConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(registeredUserEmbeddingExperienceConfiguration.getDashboard(), DASHBOARD_BINDING);
            protocolMarshaller.marshall(registeredUserEmbeddingExperienceConfiguration.getQuickSightConsole(), QUICKSIGHTCONSOLE_BINDING);
            protocolMarshaller.marshall(registeredUserEmbeddingExperienceConfiguration.getQSearchBar(), QSEARCHBAR_BINDING);
            protocolMarshaller.marshall(registeredUserEmbeddingExperienceConfiguration.getDashboardVisual(), DASHBOARDVISUAL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
