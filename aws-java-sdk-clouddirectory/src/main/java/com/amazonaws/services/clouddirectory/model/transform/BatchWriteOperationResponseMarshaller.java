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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.clouddirectory.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BatchWriteOperationResponseMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BatchWriteOperationResponseMarshaller {

    private static final MarshallingInfo<StructuredPojo> CREATEOBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreateObject").build();
    private static final MarshallingInfo<StructuredPojo> ATTACHOBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AttachObject").build();
    private static final MarshallingInfo<StructuredPojo> DETACHOBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DetachObject").build();
    private static final MarshallingInfo<StructuredPojo> UPDATEOBJECTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdateObjectAttributes").build();
    private static final MarshallingInfo<StructuredPojo> DELETEOBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeleteObject").build();
    private static final MarshallingInfo<StructuredPojo> ADDFACETTOOBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AddFacetToObject").build();
    private static final MarshallingInfo<StructuredPojo> REMOVEFACETFROMOBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RemoveFacetFromObject").build();
    private static final MarshallingInfo<StructuredPojo> ATTACHPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AttachPolicy").build();
    private static final MarshallingInfo<StructuredPojo> DETACHPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DetachPolicy").build();
    private static final MarshallingInfo<StructuredPojo> CREATEINDEX_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreateIndex").build();
    private static final MarshallingInfo<StructuredPojo> ATTACHTOINDEX_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AttachToIndex").build();
    private static final MarshallingInfo<StructuredPojo> DETACHFROMINDEX_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DetachFromIndex").build();
    private static final MarshallingInfo<StructuredPojo> ATTACHTYPEDLINK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AttachTypedLink").build();
    private static final MarshallingInfo<StructuredPojo> DETACHTYPEDLINK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DetachTypedLink").build();
    private static final MarshallingInfo<StructuredPojo> UPDATELINKATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdateLinkAttributes").build();

    private static final BatchWriteOperationResponseMarshaller instance = new BatchWriteOperationResponseMarshaller();

    public static BatchWriteOperationResponseMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BatchWriteOperationResponse batchWriteOperationResponse, ProtocolMarshaller protocolMarshaller) {

        if (batchWriteOperationResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(batchWriteOperationResponse.getCreateObject(), CREATEOBJECT_BINDING);
            protocolMarshaller.marshall(batchWriteOperationResponse.getAttachObject(), ATTACHOBJECT_BINDING);
            protocolMarshaller.marshall(batchWriteOperationResponse.getDetachObject(), DETACHOBJECT_BINDING);
            protocolMarshaller.marshall(batchWriteOperationResponse.getUpdateObjectAttributes(), UPDATEOBJECTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(batchWriteOperationResponse.getDeleteObject(), DELETEOBJECT_BINDING);
            protocolMarshaller.marshall(batchWriteOperationResponse.getAddFacetToObject(), ADDFACETTOOBJECT_BINDING);
            protocolMarshaller.marshall(batchWriteOperationResponse.getRemoveFacetFromObject(), REMOVEFACETFROMOBJECT_BINDING);
            protocolMarshaller.marshall(batchWriteOperationResponse.getAttachPolicy(), ATTACHPOLICY_BINDING);
            protocolMarshaller.marshall(batchWriteOperationResponse.getDetachPolicy(), DETACHPOLICY_BINDING);
            protocolMarshaller.marshall(batchWriteOperationResponse.getCreateIndex(), CREATEINDEX_BINDING);
            protocolMarshaller.marshall(batchWriteOperationResponse.getAttachToIndex(), ATTACHTOINDEX_BINDING);
            protocolMarshaller.marshall(batchWriteOperationResponse.getDetachFromIndex(), DETACHFROMINDEX_BINDING);
            protocolMarshaller.marshall(batchWriteOperationResponse.getAttachTypedLink(), ATTACHTYPEDLINK_BINDING);
            protocolMarshaller.marshall(batchWriteOperationResponse.getDetachTypedLink(), DETACHTYPEDLINK_BINDING);
            protocolMarshaller.marshall(batchWriteOperationResponse.getUpdateLinkAttributes(), UPDATELINKATTRIBUTES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
