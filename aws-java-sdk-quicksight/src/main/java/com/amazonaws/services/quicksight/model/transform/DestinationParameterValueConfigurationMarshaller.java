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
 * DestinationParameterValueConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DestinationParameterValueConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> CUSTOMVALUESCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomValuesConfiguration").build();
    private static final MarshallingInfo<String> SELECTALLVALUEOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SelectAllValueOptions").build();
    private static final MarshallingInfo<String> SOURCEPARAMETERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceParameterName").build();
    private static final MarshallingInfo<String> SOURCEFIELD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceField").build();

    private static final DestinationParameterValueConfigurationMarshaller instance = new DestinationParameterValueConfigurationMarshaller();

    public static DestinationParameterValueConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DestinationParameterValueConfiguration destinationParameterValueConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (destinationParameterValueConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(destinationParameterValueConfiguration.getCustomValuesConfiguration(), CUSTOMVALUESCONFIGURATION_BINDING);
            protocolMarshaller.marshall(destinationParameterValueConfiguration.getSelectAllValueOptions(), SELECTALLVALUEOPTIONS_BINDING);
            protocolMarshaller.marshall(destinationParameterValueConfiguration.getSourceParameterName(), SOURCEPARAMETERNAME_BINDING);
            protocolMarshaller.marshall(destinationParameterValueConfiguration.getSourceField(), SOURCEFIELD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
