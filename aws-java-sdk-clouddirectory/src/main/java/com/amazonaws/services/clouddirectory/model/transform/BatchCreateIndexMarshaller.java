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
package com.amazonaws.services.clouddirectory.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.clouddirectory.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BatchCreateIndexMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BatchCreateIndexMarshaller {

    private static final MarshallingInfo<List> ORDEREDINDEXEDATTRIBUTELIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrderedIndexedAttributeList").build();
    private static final MarshallingInfo<Boolean> ISUNIQUE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsUnique").build();
    private static final MarshallingInfo<StructuredPojo> PARENTREFERENCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParentReference").build();
    private static final MarshallingInfo<String> LINKNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LinkName").build();
    private static final MarshallingInfo<String> BATCHREFERENCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BatchReferenceName").build();

    private static final BatchCreateIndexMarshaller instance = new BatchCreateIndexMarshaller();

    public static BatchCreateIndexMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BatchCreateIndex batchCreateIndex, ProtocolMarshaller protocolMarshaller) {

        if (batchCreateIndex == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(batchCreateIndex.getOrderedIndexedAttributeList(), ORDEREDINDEXEDATTRIBUTELIST_BINDING);
            protocolMarshaller.marshall(batchCreateIndex.getIsUnique(), ISUNIQUE_BINDING);
            protocolMarshaller.marshall(batchCreateIndex.getParentReference(), PARENTREFERENCE_BINDING);
            protocolMarshaller.marshall(batchCreateIndex.getLinkName(), LINKNAME_BINDING);
            protocolMarshaller.marshall(batchCreateIndex.getBatchReferenceName(), BATCHREFERENCENAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
