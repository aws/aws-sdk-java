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
package com.amazonaws.services.kinesisfirehose.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisfirehose.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DataFormatConversionConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DataFormatConversionConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> SCHEMACONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SchemaConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> INPUTFORMATCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputFormatConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> OUTPUTFORMATCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputFormatConfiguration").build();
    private static final MarshallingInfo<Boolean> ENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Enabled").build();

    private static final DataFormatConversionConfigurationMarshaller instance = new DataFormatConversionConfigurationMarshaller();

    public static DataFormatConversionConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DataFormatConversionConfiguration dataFormatConversionConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (dataFormatConversionConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dataFormatConversionConfiguration.getSchemaConfiguration(), SCHEMACONFIGURATION_BINDING);
            protocolMarshaller.marshall(dataFormatConversionConfiguration.getInputFormatConfiguration(), INPUTFORMATCONFIGURATION_BINDING);
            protocolMarshaller.marshall(dataFormatConversionConfiguration.getOutputFormatConfiguration(), OUTPUTFORMATCONFIGURATION_BINDING);
            protocolMarshaller.marshall(dataFormatConversionConfiguration.getEnabled(), ENABLED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
