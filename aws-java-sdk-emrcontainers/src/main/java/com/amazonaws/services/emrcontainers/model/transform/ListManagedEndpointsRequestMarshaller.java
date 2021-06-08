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
package com.amazonaws.services.emrcontainers.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.emrcontainers.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListManagedEndpointsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListManagedEndpointsRequestMarshaller {

    private static final MarshallingInfo<String> VIRTUALCLUSTERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("virtualClusterId").build();
    private static final MarshallingInfo<java.util.Date> CREATEDBEFORE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("createdBefore").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAFTER_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("createdAfter").timestampFormat("iso8601").build();
    private static final MarshallingInfo<List> TYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.QUERY_PARAM)
            .marshallLocationName("types").build();
    private static final MarshallingInfo<List> STATES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.QUERY_PARAM)
            .marshallLocationName("states").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("maxResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("nextToken").build();

    private static final ListManagedEndpointsRequestMarshaller instance = new ListManagedEndpointsRequestMarshaller();

    public static ListManagedEndpointsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListManagedEndpointsRequest listManagedEndpointsRequest, ProtocolMarshaller protocolMarshaller) {

        if (listManagedEndpointsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listManagedEndpointsRequest.getVirtualClusterId(), VIRTUALCLUSTERID_BINDING);
            protocolMarshaller.marshall(listManagedEndpointsRequest.getCreatedBefore(), CREATEDBEFORE_BINDING);
            protocolMarshaller.marshall(listManagedEndpointsRequest.getCreatedAfter(), CREATEDAFTER_BINDING);
            protocolMarshaller.marshall(listManagedEndpointsRequest.getTypes(), TYPES_BINDING);
            protocolMarshaller.marshall(listManagedEndpointsRequest.getStates(), STATES_BINDING);
            protocolMarshaller.marshall(listManagedEndpointsRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listManagedEndpointsRequest.getNextToken(), NEXTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
