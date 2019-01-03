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
 * BatchCreateObjectMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BatchCreateObjectMarshaller {

    private static final MarshallingInfo<List> SCHEMAFACET_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SchemaFacet").build();
    private static final MarshallingInfo<List> OBJECTATTRIBUTELIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ObjectAttributeList").build();
    private static final MarshallingInfo<StructuredPojo> PARENTREFERENCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParentReference").build();
    private static final MarshallingInfo<String> LINKNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LinkName").build();
    private static final MarshallingInfo<String> BATCHREFERENCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BatchReferenceName").build();

    private static final BatchCreateObjectMarshaller instance = new BatchCreateObjectMarshaller();

    public static BatchCreateObjectMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BatchCreateObject batchCreateObject, ProtocolMarshaller protocolMarshaller) {

        if (batchCreateObject == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(batchCreateObject.getSchemaFacet(), SCHEMAFACET_BINDING);
            protocolMarshaller.marshall(batchCreateObject.getObjectAttributeList(), OBJECTATTRIBUTELIST_BINDING);
            protocolMarshaller.marshall(batchCreateObject.getParentReference(), PARENTREFERENCE_BINDING);
            protocolMarshaller.marshall(batchCreateObject.getLinkName(), LINKNAME_BINDING);
            protocolMarshaller.marshall(batchCreateObject.getBatchReferenceName(), BATCHREFERENCENAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
