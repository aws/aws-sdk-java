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
package com.amazonaws.services.resiliencehub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.resiliencehub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RemoveDraftAppVersionResourceMappingsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RemoveDraftAppVersionResourceMappingsRequestMarshaller {

    private static final MarshallingInfo<String> APPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("appArn").build();
    private static final MarshallingInfo<List> APPREGISTRYAPPNAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("appRegistryAppNames").build();
    private static final MarshallingInfo<List> LOGICALSTACKNAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logicalStackNames").build();
    private static final MarshallingInfo<List> RESOURCEGROUPNAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceGroupNames").build();
    private static final MarshallingInfo<List> RESOURCENAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("resourceNames").build();
    private static final MarshallingInfo<List> TERRAFORMSOURCENAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("terraformSourceNames").build();

    private static final RemoveDraftAppVersionResourceMappingsRequestMarshaller instance = new RemoveDraftAppVersionResourceMappingsRequestMarshaller();

    public static RemoveDraftAppVersionResourceMappingsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RemoveDraftAppVersionResourceMappingsRequest removeDraftAppVersionResourceMappingsRequest, ProtocolMarshaller protocolMarshaller) {

        if (removeDraftAppVersionResourceMappingsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(removeDraftAppVersionResourceMappingsRequest.getAppArn(), APPARN_BINDING);
            protocolMarshaller.marshall(removeDraftAppVersionResourceMappingsRequest.getAppRegistryAppNames(), APPREGISTRYAPPNAMES_BINDING);
            protocolMarshaller.marshall(removeDraftAppVersionResourceMappingsRequest.getLogicalStackNames(), LOGICALSTACKNAMES_BINDING);
            protocolMarshaller.marshall(removeDraftAppVersionResourceMappingsRequest.getResourceGroupNames(), RESOURCEGROUPNAMES_BINDING);
            protocolMarshaller.marshall(removeDraftAppVersionResourceMappingsRequest.getResourceNames(), RESOURCENAMES_BINDING);
            protocolMarshaller.marshall(removeDraftAppVersionResourceMappingsRequest.getTerraformSourceNames(), TERRAFORMSOURCENAMES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
