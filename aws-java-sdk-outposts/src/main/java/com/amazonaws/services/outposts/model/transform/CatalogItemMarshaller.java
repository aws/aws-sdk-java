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
package com.amazonaws.services.outposts.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.outposts.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CatalogItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CatalogItemMarshaller {

    private static final MarshallingInfo<String> CATALOGITEMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CatalogItemId").build();
    private static final MarshallingInfo<String> ITEMSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ItemStatus").build();
    private static final MarshallingInfo<List> EC2CAPACITIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("EC2Capacities").build();
    private static final MarshallingInfo<Float> POWERKVA_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PowerKva").build();
    private static final MarshallingInfo<Integer> WEIGHTLBS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WeightLbs").build();
    private static final MarshallingInfo<List> SUPPORTEDUPLINKGBPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SupportedUplinkGbps").build();
    private static final MarshallingInfo<List> SUPPORTEDSTORAGE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SupportedStorage").build();

    private static final CatalogItemMarshaller instance = new CatalogItemMarshaller();

    public static CatalogItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CatalogItem catalogItem, ProtocolMarshaller protocolMarshaller) {

        if (catalogItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(catalogItem.getCatalogItemId(), CATALOGITEMID_BINDING);
            protocolMarshaller.marshall(catalogItem.getItemStatus(), ITEMSTATUS_BINDING);
            protocolMarshaller.marshall(catalogItem.getEC2Capacities(), EC2CAPACITIES_BINDING);
            protocolMarshaller.marshall(catalogItem.getPowerKva(), POWERKVA_BINDING);
            protocolMarshaller.marshall(catalogItem.getWeightLbs(), WEIGHTLBS_BINDING);
            protocolMarshaller.marshall(catalogItem.getSupportedUplinkGbps(), SUPPORTEDUPLINKGBPS_BINDING);
            protocolMarshaller.marshall(catalogItem.getSupportedStorage(), SUPPORTEDSTORAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
