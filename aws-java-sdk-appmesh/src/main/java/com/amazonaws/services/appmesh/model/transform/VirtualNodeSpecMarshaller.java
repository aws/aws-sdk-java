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
package com.amazonaws.services.appmesh.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appmesh.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * VirtualNodeSpecMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VirtualNodeSpecMarshaller {

    private static final MarshallingInfo<List> BACKENDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("backends").build();
    private static final MarshallingInfo<List> LISTENERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("listeners").build();
    private static final MarshallingInfo<StructuredPojo> LOGGING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logging").build();
    private static final MarshallingInfo<StructuredPojo> SERVICEDISCOVERY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceDiscovery").build();

    private static final VirtualNodeSpecMarshaller instance = new VirtualNodeSpecMarshaller();

    public static VirtualNodeSpecMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VirtualNodeSpec virtualNodeSpec, ProtocolMarshaller protocolMarshaller) {

        if (virtualNodeSpec == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(virtualNodeSpec.getBackends(), BACKENDS_BINDING);
            protocolMarshaller.marshall(virtualNodeSpec.getListeners(), LISTENERS_BINDING);
            protocolMarshaller.marshall(virtualNodeSpec.getLogging(), LOGGING_BINDING);
            protocolMarshaller.marshall(virtualNodeSpec.getServiceDiscovery(), SERVICEDISCOVERY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
