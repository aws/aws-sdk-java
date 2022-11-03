/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.migrationhubrefactorspaces.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.migrationhubrefactorspaces.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateRouteRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateRouteRequestMarshaller {

    private static final MarshallingInfo<String> APPLICATIONIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("ApplicationIdentifier").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<StructuredPojo> DEFAULTROUTE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultRoute").build();
    private static final MarshallingInfo<String> ENVIRONMENTIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("EnvironmentIdentifier").build();
    private static final MarshallingInfo<String> ROUTETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RouteType").build();
    private static final MarshallingInfo<String> SERVICEIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceIdentifier").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<StructuredPojo> URIPATHROUTE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UriPathRoute").build();

    private static final CreateRouteRequestMarshaller instance = new CreateRouteRequestMarshaller();

    public static CreateRouteRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateRouteRequest createRouteRequest, ProtocolMarshaller protocolMarshaller) {

        if (createRouteRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createRouteRequest.getApplicationIdentifier(), APPLICATIONIDENTIFIER_BINDING);
            protocolMarshaller.marshall(createRouteRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createRouteRequest.getDefaultRoute(), DEFAULTROUTE_BINDING);
            protocolMarshaller.marshall(createRouteRequest.getEnvironmentIdentifier(), ENVIRONMENTIDENTIFIER_BINDING);
            protocolMarshaller.marshall(createRouteRequest.getRouteType(), ROUTETYPE_BINDING);
            protocolMarshaller.marshall(createRouteRequest.getServiceIdentifier(), SERVICEIDENTIFIER_BINDING);
            protocolMarshaller.marshall(createRouteRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createRouteRequest.getUriPathRoute(), URIPATHROUTE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
