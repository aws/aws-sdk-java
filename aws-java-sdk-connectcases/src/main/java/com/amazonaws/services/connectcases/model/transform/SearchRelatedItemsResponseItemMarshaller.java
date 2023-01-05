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
package com.amazonaws.services.connectcases.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connectcases.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SearchRelatedItemsResponseItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SearchRelatedItemsResponseItemMarshaller {

    private static final MarshallingInfo<java.util.Date> ASSOCIATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("associationTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<StructuredPojo> CONTENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("content").build();
    private static final MarshallingInfo<String> RELATEDITEMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("relatedItemId").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();

    private static final SearchRelatedItemsResponseItemMarshaller instance = new SearchRelatedItemsResponseItemMarshaller();

    public static SearchRelatedItemsResponseItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SearchRelatedItemsResponseItem searchRelatedItemsResponseItem, ProtocolMarshaller protocolMarshaller) {

        if (searchRelatedItemsResponseItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(searchRelatedItemsResponseItem.getAssociationTime(), ASSOCIATIONTIME_BINDING);
            protocolMarshaller.marshall(searchRelatedItemsResponseItem.getContent(), CONTENT_BINDING);
            protocolMarshaller.marshall(searchRelatedItemsResponseItem.getRelatedItemId(), RELATEDITEMID_BINDING);
            protocolMarshaller.marshall(searchRelatedItemsResponseItem.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(searchRelatedItemsResponseItem.getType(), TYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
