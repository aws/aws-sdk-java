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
 * CustomFilterConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CustomFilterConfigurationMarshaller {

    private static final MarshallingInfo<String> MATCHOPERATOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MatchOperator").build();
    private static final MarshallingInfo<String> CATEGORYVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CategoryValue").build();
    private static final MarshallingInfo<String> SELECTALLOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SelectAllOptions").build();
    private static final MarshallingInfo<String> PARAMETERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParameterName").build();
    private static final MarshallingInfo<String> NULLOPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NullOption").build();

    private static final CustomFilterConfigurationMarshaller instance = new CustomFilterConfigurationMarshaller();

    public static CustomFilterConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CustomFilterConfiguration customFilterConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (customFilterConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(customFilterConfiguration.getMatchOperator(), MATCHOPERATOR_BINDING);
            protocolMarshaller.marshall(customFilterConfiguration.getCategoryValue(), CATEGORYVALUE_BINDING);
            protocolMarshaller.marshall(customFilterConfiguration.getSelectAllOptions(), SELECTALLOPTIONS_BINDING);
            protocolMarshaller.marshall(customFilterConfiguration.getParameterName(), PARAMETERNAME_BINDING);
            protocolMarshaller.marshall(customFilterConfiguration.getNullOption(), NULLOPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
