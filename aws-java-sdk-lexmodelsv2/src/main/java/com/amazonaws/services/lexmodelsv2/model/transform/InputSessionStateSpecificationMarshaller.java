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
package com.amazonaws.services.lexmodelsv2.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexmodelsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InputSessionStateSpecificationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InputSessionStateSpecificationMarshaller {

    private static final MarshallingInfo<Map> SESSIONATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sessionAttributes").build();
    private static final MarshallingInfo<List> ACTIVECONTEXTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activeContexts").build();
    private static final MarshallingInfo<StructuredPojo> RUNTIMEHINTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("runtimeHints").build();

    private static final InputSessionStateSpecificationMarshaller instance = new InputSessionStateSpecificationMarshaller();

    public static InputSessionStateSpecificationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InputSessionStateSpecification inputSessionStateSpecification, ProtocolMarshaller protocolMarshaller) {

        if (inputSessionStateSpecification == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(inputSessionStateSpecification.getSessionAttributes(), SESSIONATTRIBUTES_BINDING);
            protocolMarshaller.marshall(inputSessionStateSpecification.getActiveContexts(), ACTIVECONTEXTS_BINDING);
            protocolMarshaller.marshall(inputSessionStateSpecification.getRuntimeHints(), RUNTIMEHINTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
