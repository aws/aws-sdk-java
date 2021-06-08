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
package com.amazonaws.services.lakeformation.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lakeformation.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TaggedTableMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TaggedTableMarshaller {

    private static final MarshallingInfo<StructuredPojo> TABLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Table").build();
    private static final MarshallingInfo<List> LFTAGONDATABASE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LFTagOnDatabase").build();
    private static final MarshallingInfo<List> LFTAGSONTABLE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LFTagsOnTable").build();
    private static final MarshallingInfo<List> LFTAGSONCOLUMNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LFTagsOnColumns").build();

    private static final TaggedTableMarshaller instance = new TaggedTableMarshaller();

    public static TaggedTableMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TaggedTable taggedTable, ProtocolMarshaller protocolMarshaller) {

        if (taggedTable == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(taggedTable.getTable(), TABLE_BINDING);
            protocolMarshaller.marshall(taggedTable.getLFTagOnDatabase(), LFTAGONDATABASE_BINDING);
            protocolMarshaller.marshall(taggedTable.getLFTagsOnTable(), LFTAGSONTABLE_BINDING);
            protocolMarshaller.marshall(taggedTable.getLFTagsOnColumns(), LFTAGSONCOLUMNS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
