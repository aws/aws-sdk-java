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
 * ApplicationConfigurationUpdateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ApplicationConfigurationUpdateMarshaller {

    private static final MarshallingInfo<StructuredPojo> SQLAPPLICATIONCONFIGURATIONUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SqlApplicationConfigurationUpdate").build();
    private static final MarshallingInfo<StructuredPojo> APPLICATIONCODECONFIGURATIONUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationCodeConfigurationUpdate").build();
    private static final MarshallingInfo<StructuredPojo> FLINKAPPLICATIONCONFIGURATIONUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FlinkApplicationConfigurationUpdate").build();
    private static final MarshallingInfo<StructuredPojo> ENVIRONMENTPROPERTYUPDATES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnvironmentPropertyUpdates").build();
    private static final MarshallingInfo<StructuredPojo> APPLICATIONSNAPSHOTCONFIGURATIONUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationSnapshotConfigurationUpdate").build();

    private static final ApplicationConfigurationUpdateMarshaller instance = new ApplicationConfigurationUpdateMarshaller();

    public static ApplicationConfigurationUpdateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ApplicationConfigurationUpdate applicationConfigurationUpdate, ProtocolMarshaller protocolMarshaller) {

        if (applicationConfigurationUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(applicationConfigurationUpdate.getSqlApplicationConfigurationUpdate(), SQLAPPLICATIONCONFIGURATIONUPDATE_BINDING);
            protocolMarshaller.marshall(applicationConfigurationUpdate.getApplicationCodeConfigurationUpdate(), APPLICATIONCODECONFIGURATIONUPDATE_BINDING);
            protocolMarshaller.marshall(applicationConfigurationUpdate.getFlinkApplicationConfigurationUpdate(), FLINKAPPLICATIONCONFIGURATIONUPDATE_BINDING);
            protocolMarshaller.marshall(applicationConfigurationUpdate.getEnvironmentPropertyUpdates(), ENVIRONMENTPROPERTYUPDATES_BINDING);
            protocolMarshaller.marshall(applicationConfigurationUpdate.getApplicationSnapshotConfigurationUpdate(),
                    APPLICATIONSNAPSHOTCONFIGURATIONUPDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
