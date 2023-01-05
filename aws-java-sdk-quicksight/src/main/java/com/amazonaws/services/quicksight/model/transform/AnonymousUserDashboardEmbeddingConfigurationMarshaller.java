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
 * AnonymousUserDashboardEmbeddingConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AnonymousUserDashboardEmbeddingConfigurationMarshaller {

    private static final MarshallingInfo<String> INITIALDASHBOARDID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InitialDashboardId").build();

    private static final AnonymousUserDashboardEmbeddingConfigurationMarshaller instance = new AnonymousUserDashboardEmbeddingConfigurationMarshaller();

    public static AnonymousUserDashboardEmbeddingConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AnonymousUserDashboardEmbeddingConfiguration anonymousUserDashboardEmbeddingConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (anonymousUserDashboardEmbeddingConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(anonymousUserDashboardEmbeddingConfiguration.getInitialDashboardId(), INITIALDASHBOARDID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
