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
package com.amazonaws.services.vpclattice.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.vpclattice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListServiceNetworkServiceAssociationsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListServiceNetworkServiceAssociationsRequestMarshaller {

    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("maxResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("nextToken").build();
    private static final MarshallingInfo<String> SERVICEIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("serviceIdentifier").build();
    private static final MarshallingInfo<String> SERVICENETWORKIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("serviceNetworkIdentifier").build();

    private static final ListServiceNetworkServiceAssociationsRequestMarshaller instance = new ListServiceNetworkServiceAssociationsRequestMarshaller();

    public static ListServiceNetworkServiceAssociationsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListServiceNetworkServiceAssociationsRequest listServiceNetworkServiceAssociationsRequest, ProtocolMarshaller protocolMarshaller) {

        if (listServiceNetworkServiceAssociationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listServiceNetworkServiceAssociationsRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listServiceNetworkServiceAssociationsRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listServiceNetworkServiceAssociationsRequest.getServiceIdentifier(), SERVICEIDENTIFIER_BINDING);
            protocolMarshaller.marshall(listServiceNetworkServiceAssociationsRequest.getServiceNetworkIdentifier(), SERVICENETWORKIDENTIFIER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
