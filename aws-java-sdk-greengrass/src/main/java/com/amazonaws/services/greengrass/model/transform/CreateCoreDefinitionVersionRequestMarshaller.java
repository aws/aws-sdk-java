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
package com.amazonaws.services.greengrass.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.greengrass.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateCoreDefinitionVersionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateCoreDefinitionVersionRequestMarshaller {

    private static final MarshallingInfo<String> AMZNCLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("X-Amzn-Client-Token").build();
    private static final MarshallingInfo<String> COREDEFINITIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("CoreDefinitionId").build();
    private static final MarshallingInfo<List> CORES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Cores").build();

    private static final CreateCoreDefinitionVersionRequestMarshaller instance = new CreateCoreDefinitionVersionRequestMarshaller();

    public static CreateCoreDefinitionVersionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateCoreDefinitionVersionRequest createCoreDefinitionVersionRequest, ProtocolMarshaller protocolMarshaller) {

        if (createCoreDefinitionVersionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createCoreDefinitionVersionRequest.getAmznClientToken(), AMZNCLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createCoreDefinitionVersionRequest.getCoreDefinitionId(), COREDEFINITIONID_BINDING);
            protocolMarshaller.marshall(createCoreDefinitionVersionRequest.getCores(), CORES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
