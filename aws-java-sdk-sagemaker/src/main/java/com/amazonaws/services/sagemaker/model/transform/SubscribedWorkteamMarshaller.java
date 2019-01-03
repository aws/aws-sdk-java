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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SubscribedWorkteamMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SubscribedWorkteamMarshaller {

    private static final MarshallingInfo<String> WORKTEAMARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkteamArn").build();
    private static final MarshallingInfo<String> MARKETPLACETITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MarketplaceTitle").build();
    private static final MarshallingInfo<String> SELLERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SellerName").build();
    private static final MarshallingInfo<String> MARKETPLACEDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MarketplaceDescription").build();
    private static final MarshallingInfo<String> LISTINGID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ListingId").build();

    private static final SubscribedWorkteamMarshaller instance = new SubscribedWorkteamMarshaller();

    public static SubscribedWorkteamMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SubscribedWorkteam subscribedWorkteam, ProtocolMarshaller protocolMarshaller) {

        if (subscribedWorkteam == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(subscribedWorkteam.getWorkteamArn(), WORKTEAMARN_BINDING);
            protocolMarshaller.marshall(subscribedWorkteam.getMarketplaceTitle(), MARKETPLACETITLE_BINDING);
            protocolMarshaller.marshall(subscribedWorkteam.getSellerName(), SELLERNAME_BINDING);
            protocolMarshaller.marshall(subscribedWorkteam.getMarketplaceDescription(), MARKETPLACEDESCRIPTION_BINDING);
            protocolMarshaller.marshall(subscribedWorkteam.getListingId(), LISTINGID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
