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
 * RestApiMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RestApiMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<java.util.Date> CREATEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("version").build();
    private static final MarshallingInfo<List> WARNINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("warnings").build();
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

    private static final RestApiMarshaller instance = new RestApiMarshaller();

    public static RestApiMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RestApi restApi, ProtocolMarshaller protocolMarshaller) {

        if (restApi == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(restApi.getId(), ID_BINDING);
            protocolMarshaller.marshall(restApi.getName(), NAME_BINDING);
            protocolMarshaller.marshall(restApi.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(restApi.getCreatedDate(), CREATEDDATE_BINDING);
            protocolMarshaller.marshall(restApi.getVersion(), VERSION_BINDING);
            protocolMarshaller.marshall(restApi.getWarnings(), WARNINGS_BINDING);
            protocolMarshaller.marshall(restApi.getBinaryMediaTypes(), BINARYMEDIATYPES_BINDING);
            protocolMarshaller.marshall(restApi.getMinimumCompressionSize(), MINIMUMCOMPRESSIONSIZE_BINDING);
            protocolMarshaller.marshall(restApi.getApiKeySource(), APIKEYSOURCE_BINDING);
            protocolMarshaller.marshall(restApi.getEndpointConfiguration(), ENDPOINTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(restApi.getPolicy(), POLICY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
