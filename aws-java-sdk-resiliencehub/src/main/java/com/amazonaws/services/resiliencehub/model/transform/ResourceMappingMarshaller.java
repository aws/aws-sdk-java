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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.resiliencehub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ResourceMappingMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ResourceMappingMarshaller {

    private static final MarshallingInfo<String> APPREGISTRYAPPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("appRegistryAppName").build();
    private static final MarshallingInfo<String> LOGICALSTACKNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logicalStackName").build();
    private static final MarshallingInfo<String> MAPPINGTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mappingType").build();
    private static final MarshallingInfo<StructuredPojo> PHYSICALRESOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("physicalResourceId").build();
    private static final MarshallingInfo<String> RESOURCEGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceGroupName").build();
    private static final MarshallingInfo<String> RESOURCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceName").build();
    private static final MarshallingInfo<String> TERRAFORMSOURCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("terraformSourceName").build();

    private static final ResourceMappingMarshaller instance = new ResourceMappingMarshaller();

    public static ResourceMappingMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ResourceMapping resourceMapping, ProtocolMarshaller protocolMarshaller) {

        if (resourceMapping == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(resourceMapping.getAppRegistryAppName(), APPREGISTRYAPPNAME_BINDING);
            protocolMarshaller.marshall(resourceMapping.getLogicalStackName(), LOGICALSTACKNAME_BINDING);
            protocolMarshaller.marshall(resourceMapping.getMappingType(), MAPPINGTYPE_BINDING);
            protocolMarshaller.marshall(resourceMapping.getPhysicalResourceId(), PHYSICALRESOURCEID_BINDING);
            protocolMarshaller.marshall(resourceMapping.getResourceGroupName(), RESOURCEGROUPNAME_BINDING);
            protocolMarshaller.marshall(resourceMapping.getResourceName(), RESOURCENAME_BINDING);
            protocolMarshaller.marshall(resourceMapping.getTerraformSourceName(), TERRAFORMSOURCENAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
