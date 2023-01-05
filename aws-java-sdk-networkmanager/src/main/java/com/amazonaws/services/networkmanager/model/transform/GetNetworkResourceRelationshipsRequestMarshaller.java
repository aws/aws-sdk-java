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
package com.amazonaws.services.networkmanager.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.networkmanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetNetworkResourceRelationshipsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetNetworkResourceRelationshipsRequestMarshaller {

    private static final MarshallingInfo<String> GLOBALNETWORKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("globalNetworkId").build();
    private static final MarshallingInfo<String> CORENETWORKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("coreNetworkId").build();
    private static final MarshallingInfo<String> REGISTEREDGATEWAYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("registeredGatewayArn").build();
    private static final MarshallingInfo<String> AWSREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("awsRegion").build();
    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("accountId").build();
    private static final MarshallingInfo<String> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("resourceType").build();
    private static final MarshallingInfo<String> RESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("resourceArn").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("maxResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("nextToken").build();

    private static final GetNetworkResourceRelationshipsRequestMarshaller instance = new GetNetworkResourceRelationshipsRequestMarshaller();

    public static GetNetworkResourceRelationshipsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetNetworkResourceRelationshipsRequest getNetworkResourceRelationshipsRequest, ProtocolMarshaller protocolMarshaller) {

        if (getNetworkResourceRelationshipsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getNetworkResourceRelationshipsRequest.getGlobalNetworkId(), GLOBALNETWORKID_BINDING);
            protocolMarshaller.marshall(getNetworkResourceRelationshipsRequest.getCoreNetworkId(), CORENETWORKID_BINDING);
            protocolMarshaller.marshall(getNetworkResourceRelationshipsRequest.getRegisteredGatewayArn(), REGISTEREDGATEWAYARN_BINDING);
            protocolMarshaller.marshall(getNetworkResourceRelationshipsRequest.getAwsRegion(), AWSREGION_BINDING);
            protocolMarshaller.marshall(getNetworkResourceRelationshipsRequest.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(getNetworkResourceRelationshipsRequest.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(getNetworkResourceRelationshipsRequest.getResourceArn(), RESOURCEARN_BINDING);
            protocolMarshaller.marshall(getNetworkResourceRelationshipsRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(getNetworkResourceRelationshipsRequest.getNextToken(), NEXTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
