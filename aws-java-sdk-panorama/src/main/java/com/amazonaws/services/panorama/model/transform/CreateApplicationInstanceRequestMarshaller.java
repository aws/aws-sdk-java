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
package com.amazonaws.services.panorama.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.panorama.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateApplicationInstanceRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateApplicationInstanceRequestMarshaller {

    private static final MarshallingInfo<String> APPLICATIONINSTANCEIDTOREPLACE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationInstanceIdToReplace").build();
    private static final MarshallingInfo<String> DEFAULTRUNTIMECONTEXTDEVICE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultRuntimeContextDevice").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<StructuredPojo> MANIFESTOVERRIDESPAYLOAD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ManifestOverridesPayload").build();
    private static final MarshallingInfo<StructuredPojo> MANIFESTPAYLOAD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ManifestPayload").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> RUNTIMEROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RuntimeRoleArn").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateApplicationInstanceRequestMarshaller instance = new CreateApplicationInstanceRequestMarshaller();

    public static CreateApplicationInstanceRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateApplicationInstanceRequest createApplicationInstanceRequest, ProtocolMarshaller protocolMarshaller) {

        if (createApplicationInstanceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createApplicationInstanceRequest.getApplicationInstanceIdToReplace(), APPLICATIONINSTANCEIDTOREPLACE_BINDING);
            protocolMarshaller.marshall(createApplicationInstanceRequest.getDefaultRuntimeContextDevice(), DEFAULTRUNTIMECONTEXTDEVICE_BINDING);
            protocolMarshaller.marshall(createApplicationInstanceRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createApplicationInstanceRequest.getManifestOverridesPayload(), MANIFESTOVERRIDESPAYLOAD_BINDING);
            protocolMarshaller.marshall(createApplicationInstanceRequest.getManifestPayload(), MANIFESTPAYLOAD_BINDING);
            protocolMarshaller.marshall(createApplicationInstanceRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createApplicationInstanceRequest.getRuntimeRoleArn(), RUNTIMEROLEARN_BINDING);
            protocolMarshaller.marshall(createApplicationInstanceRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
