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
package com.amazonaws.services.datazone.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.datazone.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SearchInventoryResultItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SearchInventoryResultItemMarshaller {

    private static final MarshallingInfo<StructuredPojo> ASSETITEM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assetItem").build();
    private static final MarshallingInfo<StructuredPojo> DATAPRODUCTITEM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataProductItem").build();
    private static final MarshallingInfo<StructuredPojo> GLOSSARYITEM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("glossaryItem").build();
    private static final MarshallingInfo<StructuredPojo> GLOSSARYTERMITEM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("glossaryTermItem").build();

    private static final SearchInventoryResultItemMarshaller instance = new SearchInventoryResultItemMarshaller();

    public static SearchInventoryResultItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SearchInventoryResultItem searchInventoryResultItem, ProtocolMarshaller protocolMarshaller) {

        if (searchInventoryResultItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(searchInventoryResultItem.getAssetItem(), ASSETITEM_BINDING);
            protocolMarshaller.marshall(searchInventoryResultItem.getDataProductItem(), DATAPRODUCTITEM_BINDING);
            protocolMarshaller.marshall(searchInventoryResultItem.getGlossaryItem(), GLOSSARYITEM_BINDING);
            protocolMarshaller.marshall(searchInventoryResultItem.getGlossaryTermItem(), GLOSSARYTERMITEM_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
