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
package com.amazonaws.services.pinpointemail.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpointemail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CloudWatchDimensionConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CloudWatchDimensionConfigurationMarshaller {

    private static final MarshallingInfo<String> DIMENSIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DimensionName").build();
    private static final MarshallingInfo<String> DIMENSIONVALUESOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DimensionValueSource").build();
    private static final MarshallingInfo<String> DEFAULTDIMENSIONVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultDimensionValue").build();

    private static final CloudWatchDimensionConfigurationMarshaller instance = new CloudWatchDimensionConfigurationMarshaller();

    public static CloudWatchDimensionConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CloudWatchDimensionConfiguration cloudWatchDimensionConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (cloudWatchDimensionConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(cloudWatchDimensionConfiguration.getDimensionName(), DIMENSIONNAME_BINDING);
            protocolMarshaller.marshall(cloudWatchDimensionConfiguration.getDimensionValueSource(), DIMENSIONVALUESOURCE_BINDING);
            protocolMarshaller.marshall(cloudWatchDimensionConfiguration.getDefaultDimensionValue(), DEFAULTDIMENSIONVALUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
