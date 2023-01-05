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
 * PhysicalResourceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PhysicalResourceMarshaller {

    private static final MarshallingInfo<List> APPCOMPONENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("appComponents").build();
    private static final MarshallingInfo<StructuredPojo> LOGICALRESOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logicalResourceId").build();
    private static final MarshallingInfo<StructuredPojo> PHYSICALRESOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("physicalResourceId").build();
    private static final MarshallingInfo<String> RESOURCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceName").build();
    private static final MarshallingInfo<String> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceType").build();

    private static final PhysicalResourceMarshaller instance = new PhysicalResourceMarshaller();

    public static PhysicalResourceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PhysicalResource physicalResource, ProtocolMarshaller protocolMarshaller) {

        if (physicalResource == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(physicalResource.getAppComponents(), APPCOMPONENTS_BINDING);
            protocolMarshaller.marshall(physicalResource.getLogicalResourceId(), LOGICALRESOURCEID_BINDING);
            protocolMarshaller.marshall(physicalResource.getPhysicalResourceId(), PHYSICALRESOURCEID_BINDING);
            protocolMarshaller.marshall(physicalResource.getResourceName(), RESOURCENAME_BINDING);
            protocolMarshaller.marshall(physicalResource.getResourceType(), RESOURCETYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
