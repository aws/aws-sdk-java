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
package com.amazonaws.services.iot.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateIndexingConfigurationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateIndexingConfigurationRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> THINGINDEXINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("thingIndexingConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> THINGGROUPINDEXINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("thingGroupIndexingConfiguration").build();

    private static final UpdateIndexingConfigurationRequestMarshaller instance = new UpdateIndexingConfigurationRequestMarshaller();

    public static UpdateIndexingConfigurationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateIndexingConfigurationRequest updateIndexingConfigurationRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateIndexingConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateIndexingConfigurationRequest.getThingIndexingConfiguration(), THINGINDEXINGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateIndexingConfigurationRequest.getThingGroupIndexingConfiguration(), THINGGROUPINDEXINGCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
