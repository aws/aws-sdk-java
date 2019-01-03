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
package com.amazonaws.services.kinesisanalyticsv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisanalyticsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ApplicationConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ApplicationConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> SQLAPPLICATIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SqlApplicationConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> FLINKAPPLICATIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FlinkApplicationConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> ENVIRONMENTPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnvironmentProperties").build();
    private static final MarshallingInfo<StructuredPojo> APPLICATIONCODECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationCodeConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> APPLICATIONSNAPSHOTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationSnapshotConfiguration").build();

    private static final ApplicationConfigurationMarshaller instance = new ApplicationConfigurationMarshaller();

    public static ApplicationConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ApplicationConfiguration applicationConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (applicationConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(applicationConfiguration.getSqlApplicationConfiguration(), SQLAPPLICATIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(applicationConfiguration.getFlinkApplicationConfiguration(), FLINKAPPLICATIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(applicationConfiguration.getEnvironmentProperties(), ENVIRONMENTPROPERTIES_BINDING);
            protocolMarshaller.marshall(applicationConfiguration.getApplicationCodeConfiguration(), APPLICATIONCODECONFIGURATION_BINDING);
            protocolMarshaller.marshall(applicationConfiguration.getApplicationSnapshotConfiguration(), APPLICATIONSNAPSHOTCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
