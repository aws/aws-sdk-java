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
package com.amazonaws.services.gluedatabrew.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.gluedatabrew.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ProfileConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProfileConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> DATASETSTATISTICSCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatasetStatisticsConfiguration").build();
    private static final MarshallingInfo<List> PROFILECOLUMNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProfileColumns").build();
    private static final MarshallingInfo<List> COLUMNSTATISTICSCONFIGURATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ColumnStatisticsConfigurations").build();
    private static final MarshallingInfo<StructuredPojo> ENTITYDETECTORCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EntityDetectorConfiguration").build();

    private static final ProfileConfigurationMarshaller instance = new ProfileConfigurationMarshaller();

    public static ProfileConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ProfileConfiguration profileConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (profileConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(profileConfiguration.getDatasetStatisticsConfiguration(), DATASETSTATISTICSCONFIGURATION_BINDING);
            protocolMarshaller.marshall(profileConfiguration.getProfileColumns(), PROFILECOLUMNS_BINDING);
            protocolMarshaller.marshall(profileConfiguration.getColumnStatisticsConfigurations(), COLUMNSTATISTICSCONFIGURATIONS_BINDING);
            protocolMarshaller.marshall(profileConfiguration.getEntityDetectorConfiguration(), ENTITYDETECTORCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
