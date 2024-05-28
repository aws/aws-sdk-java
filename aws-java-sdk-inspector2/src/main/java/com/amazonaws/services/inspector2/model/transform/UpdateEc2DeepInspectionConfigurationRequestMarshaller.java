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
package com.amazonaws.services.inspector2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateEc2DeepInspectionConfigurationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateEc2DeepInspectionConfigurationRequestMarshaller {

    private static final MarshallingInfo<Boolean> ACTIVATEDEEPINSPECTION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activateDeepInspection").build();
    private static final MarshallingInfo<List> PACKAGEPATHS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("packagePaths").build();

    private static final UpdateEc2DeepInspectionConfigurationRequestMarshaller instance = new UpdateEc2DeepInspectionConfigurationRequestMarshaller();

    public static UpdateEc2DeepInspectionConfigurationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateEc2DeepInspectionConfigurationRequest updateEc2DeepInspectionConfigurationRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateEc2DeepInspectionConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateEc2DeepInspectionConfigurationRequest.getActivateDeepInspection(), ACTIVATEDEEPINSPECTION_BINDING);
            protocolMarshaller.marshall(updateEc2DeepInspectionConfigurationRequest.getPackagePaths(), PACKAGEPATHS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
