/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appmesh.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RouteRefMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RouteRefMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> MESHNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("meshName").build();
    private static final MarshallingInfo<String> MESHOWNER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("meshOwner").build();
    private static final MarshallingInfo<String> RESOURCEOWNER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceOwner").build();
    private static final MarshallingInfo<String> ROUTENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("routeName").build();
    private static final MarshallingInfo<Long> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("version").build();
    private static final MarshallingInfo<String> VIRTUALROUTERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("virtualRouterName").build();

    private static final RouteRefMarshaller instance = new RouteRefMarshaller();

    public static RouteRefMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RouteRef routeRef, ProtocolMarshaller protocolMarshaller) {

        if (routeRef == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(routeRef.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(routeRef.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(routeRef.getLastUpdatedAt(), LASTUPDATEDAT_BINDING);
            protocolMarshaller.marshall(routeRef.getMeshName(), MESHNAME_BINDING);
            protocolMarshaller.marshall(routeRef.getMeshOwner(), MESHOWNER_BINDING);
            protocolMarshaller.marshall(routeRef.getResourceOwner(), RESOURCEOWNER_BINDING);
            protocolMarshaller.marshall(routeRef.getRouteName(), ROUTENAME_BINDING);
            protocolMarshaller.marshall(routeRef.getVersion(), VERSION_BINDING);
            protocolMarshaller.marshall(routeRef.getVirtualRouterName(), VIRTUALROUTERNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
