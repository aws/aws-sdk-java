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
 * ApplicationConfigurationDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ApplicationConfigurationDescriptionMarshaller {

    private static final MarshallingInfo<StructuredPojo> SQLAPPLICATIONCONFIGURATIONDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SqlApplicationConfigurationDescription").build();
    private static final MarshallingInfo<StructuredPojo> APPLICATIONCODECONFIGURATIONDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationCodeConfigurationDescription").build();
    private static final MarshallingInfo<StructuredPojo> RUNCONFIGURATIONDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RunConfigurationDescription").build();
    private static final MarshallingInfo<StructuredPojo> FLINKAPPLICATIONCONFIGURATIONDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FlinkApplicationConfigurationDescription").build();
    private static final MarshallingInfo<StructuredPojo> ENVIRONMENTPROPERTYDESCRIPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnvironmentPropertyDescriptions").build();
    private static final MarshallingInfo<StructuredPojo> APPLICATIONSNAPSHOTCONFIGURATIONDESCRIPTION_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationSnapshotConfigurationDescription")
            .build();

    private static final ApplicationConfigurationDescriptionMarshaller instance = new ApplicationConfigurationDescriptionMarshaller();

    public static ApplicationConfigurationDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ApplicationConfigurationDescription applicationConfigurationDescription, ProtocolMarshaller protocolMarshaller) {

        if (applicationConfigurationDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(applicationConfigurationDescription.getSqlApplicationConfigurationDescription(),
                    SQLAPPLICATIONCONFIGURATIONDESCRIPTION_BINDING);
            protocolMarshaller.marshall(applicationConfigurationDescription.getApplicationCodeConfigurationDescription(),
                    APPLICATIONCODECONFIGURATIONDESCRIPTION_BINDING);
            protocolMarshaller.marshall(applicationConfigurationDescription.getRunConfigurationDescription(), RUNCONFIGURATIONDESCRIPTION_BINDING);
            protocolMarshaller.marshall(applicationConfigurationDescription.getFlinkApplicationConfigurationDescription(),
                    FLINKAPPLICATIONCONFIGURATIONDESCRIPTION_BINDING);
            protocolMarshaller.marshall(applicationConfigurationDescription.getEnvironmentPropertyDescriptions(), ENVIRONMENTPROPERTYDESCRIPTIONS_BINDING);
            protocolMarshaller.marshall(applicationConfigurationDescription.getApplicationSnapshotConfigurationDescription(),
                    APPLICATIONSNAPSHOTCONFIGURATIONDESCRIPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
