/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appsync.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appsync.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EnhancedMetricsConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EnhancedMetricsConfigMarshaller {

    private static final MarshallingInfo<String> RESOLVERLEVELMETRICSBEHAVIOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resolverLevelMetricsBehavior").build();
    private static final MarshallingInfo<String> DATASOURCELEVELMETRICSBEHAVIOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataSourceLevelMetricsBehavior").build();
    private static final MarshallingInfo<String> OPERATIONLEVELMETRICSCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("operationLevelMetricsConfig").build();

    private static final EnhancedMetricsConfigMarshaller instance = new EnhancedMetricsConfigMarshaller();

    public static EnhancedMetricsConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EnhancedMetricsConfig enhancedMetricsConfig, ProtocolMarshaller protocolMarshaller) {

        if (enhancedMetricsConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(enhancedMetricsConfig.getResolverLevelMetricsBehavior(), RESOLVERLEVELMETRICSBEHAVIOR_BINDING);
            protocolMarshaller.marshall(enhancedMetricsConfig.getDataSourceLevelMetricsBehavior(), DATASOURCELEVELMETRICSBEHAVIOR_BINDING);
            protocolMarshaller.marshall(enhancedMetricsConfig.getOperationLevelMetricsConfig(), OPERATIONLEVELMETRICSCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
