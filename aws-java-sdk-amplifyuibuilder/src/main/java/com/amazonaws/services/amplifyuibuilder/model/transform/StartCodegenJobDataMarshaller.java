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
package com.amazonaws.services.amplifyuibuilder.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.amplifyuibuilder.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartCodegenJobDataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartCodegenJobDataMarshaller {

    private static final MarshallingInfo<StructuredPojo> RENDERCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("renderConfig").build();
    private static final MarshallingInfo<StructuredPojo> GENERICDATASCHEMA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("genericDataSchema").build();
    private static final MarshallingInfo<Boolean> AUTOGENERATEFORMS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("autoGenerateForms").build();
    private static final MarshallingInfo<StructuredPojo> FEATURES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("features").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final StartCodegenJobDataMarshaller instance = new StartCodegenJobDataMarshaller();

    public static StartCodegenJobDataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartCodegenJobData startCodegenJobData, ProtocolMarshaller protocolMarshaller) {

        if (startCodegenJobData == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startCodegenJobData.getRenderConfig(), RENDERCONFIG_BINDING);
            protocolMarshaller.marshall(startCodegenJobData.getGenericDataSchema(), GENERICDATASCHEMA_BINDING);
            protocolMarshaller.marshall(startCodegenJobData.getAutoGenerateForms(), AUTOGENERATEFORMS_BINDING);
            protocolMarshaller.marshall(startCodegenJobData.getFeatures(), FEATURES_BINDING);
            protocolMarshaller.marshall(startCodegenJobData.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
