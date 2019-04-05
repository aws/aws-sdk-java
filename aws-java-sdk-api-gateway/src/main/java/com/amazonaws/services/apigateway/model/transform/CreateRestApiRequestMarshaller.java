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
package com.amazonaws.services.apigateway.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apigateway.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateRestApiRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateRestApiRequestMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("version").build();
    private static final MarshallingInfo<String> CLONEFROM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("cloneFrom").build();
    private static final MarshallingInfo<List> BINARYMEDIATYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("binaryMediaTypes").build();
    private static final MarshallingInfo<Integer> MINIMUMCOMPRESSIONSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("minimumCompressionSize").build();
    private static final MarshallingInfo<String> APIKEYSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("apiKeySource").build();
    private static final MarshallingInfo<StructuredPojo> ENDPOINTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endpointConfiguration").build();
    private static final MarshallingInfo<String> POLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("policy").build();

    private static final CreateRestApiRequestMarshaller instance = new CreateRestApiRequestMarshaller();

    public static CreateRestApiRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateRestApiRequest createRestApiRequest, ProtocolMarshaller protocolMarshaller) {

        if (createRestApiRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createRestApiRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createRestApiRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createRestApiRequest.getVersion(), VERSION_BINDING);
            protocolMarshaller.marshall(createRestApiRequest.getCloneFrom(), CLONEFROM_BINDING);
            protocolMarshaller.marshall(createRestApiRequest.getBinaryMediaTypes(), BINARYMEDIATYPES_BINDING);
            protocolMarshaller.marshall(createRestApiRequest.getMinimumCompressionSize(), MINIMUMCOMPRESSIONSIZE_BINDING);
            protocolMarshaller.marshall(createRestApiRequest.getApiKeySource(), APIKEYSOURCE_BINDING);
            protocolMarshaller.marshall(createRestApiRequest.getEndpointConfiguration(), ENDPOINTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createRestApiRequest.getPolicy(), POLICY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
