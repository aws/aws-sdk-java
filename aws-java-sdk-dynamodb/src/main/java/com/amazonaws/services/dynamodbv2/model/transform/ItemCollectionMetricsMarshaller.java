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
package com.amazonaws.services.dynamodbv2.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dynamodbv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ItemCollectionMetricsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ItemCollectionMetricsMarshaller {

    private static final MarshallingInfo<Map> ITEMCOLLECTIONKEY_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ItemCollectionKey").build();
    private static final MarshallingInfo<List> SIZEESTIMATERANGEGB_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SizeEstimateRangeGB").build();

    private static final ItemCollectionMetricsMarshaller instance = new ItemCollectionMetricsMarshaller();

    public static ItemCollectionMetricsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ItemCollectionMetrics itemCollectionMetrics, ProtocolMarshaller protocolMarshaller) {

        if (itemCollectionMetrics == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(itemCollectionMetrics.getItemCollectionKey(), ITEMCOLLECTIONKEY_BINDING);
            protocolMarshaller.marshall(itemCollectionMetrics.getSizeEstimateRangeGB(), SIZEESTIMATERANGEGB_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
