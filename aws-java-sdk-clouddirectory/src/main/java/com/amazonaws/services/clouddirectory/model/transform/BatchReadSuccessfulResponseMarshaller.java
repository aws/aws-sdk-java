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
 * BatchReadSuccessfulResponseMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BatchReadSuccessfulResponseMarshaller {

    private static final MarshallingInfo<StructuredPojo> LISTOBJECTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ListObjectAttributes").build();
    private static final MarshallingInfo<StructuredPojo> LISTOBJECTCHILDREN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ListObjectChildren").build();
    private static final MarshallingInfo<StructuredPojo> GETOBJECTINFORMATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GetObjectInformation").build();
    private static final MarshallingInfo<StructuredPojo> GETOBJECTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GetObjectAttributes").build();
    private static final MarshallingInfo<StructuredPojo> LISTATTACHEDINDICES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ListAttachedIndices").build();
    private static final MarshallingInfo<StructuredPojo> LISTOBJECTPARENTPATHS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ListObjectParentPaths").build();
    private static final MarshallingInfo<StructuredPojo> LISTOBJECTPOLICIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ListObjectPolicies").build();
    private static final MarshallingInfo<StructuredPojo> LISTPOLICYATTACHMENTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ListPolicyAttachments").build();
    private static final MarshallingInfo<StructuredPojo> LOOKUPPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LookupPolicy").build();
    private static final MarshallingInfo<StructuredPojo> LISTINDEX_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ListIndex").build();
    private static final MarshallingInfo<StructuredPojo> LISTOUTGOINGTYPEDLINKS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ListOutgoingTypedLinks").build();
    private static final MarshallingInfo<StructuredPojo> LISTINCOMINGTYPEDLINKS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ListIncomingTypedLinks").build();
    private static final MarshallingInfo<StructuredPojo> GETLINKATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GetLinkAttributes").build();
    private static final MarshallingInfo<StructuredPojo> LISTOBJECTPARENTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ListObjectParents").build();

    private static final BatchReadSuccessfulResponseMarshaller instance = new BatchReadSuccessfulResponseMarshaller();

    public static BatchReadSuccessfulResponseMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BatchReadSuccessfulResponse batchReadSuccessfulResponse, ProtocolMarshaller protocolMarshaller) {

        if (batchReadSuccessfulResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(batchReadSuccessfulResponse.getListObjectAttributes(), LISTOBJECTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(batchReadSuccessfulResponse.getListObjectChildren(), LISTOBJECTCHILDREN_BINDING);
            protocolMarshaller.marshall(batchReadSuccessfulResponse.getGetObjectInformation(), GETOBJECTINFORMATION_BINDING);
            protocolMarshaller.marshall(batchReadSuccessfulResponse.getGetObjectAttributes(), GETOBJECTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(batchReadSuccessfulResponse.getListAttachedIndices(), LISTATTACHEDINDICES_BINDING);
            protocolMarshaller.marshall(batchReadSuccessfulResponse.getListObjectParentPaths(), LISTOBJECTPARENTPATHS_BINDING);
            protocolMarshaller.marshall(batchReadSuccessfulResponse.getListObjectPolicies(), LISTOBJECTPOLICIES_BINDING);
            protocolMarshaller.marshall(batchReadSuccessfulResponse.getListPolicyAttachments(), LISTPOLICYATTACHMENTS_BINDING);
            protocolMarshaller.marshall(batchReadSuccessfulResponse.getLookupPolicy(), LOOKUPPOLICY_BINDING);
            protocolMarshaller.marshall(batchReadSuccessfulResponse.getListIndex(), LISTINDEX_BINDING);
            protocolMarshaller.marshall(batchReadSuccessfulResponse.getListOutgoingTypedLinks(), LISTOUTGOINGTYPEDLINKS_BINDING);
            protocolMarshaller.marshall(batchReadSuccessfulResponse.getListIncomingTypedLinks(), LISTINCOMINGTYPEDLINKS_BINDING);
            protocolMarshaller.marshall(batchReadSuccessfulResponse.getGetLinkAttributes(), GETLINKATTRIBUTES_BINDING);
            protocolMarshaller.marshall(batchReadSuccessfulResponse.getListObjectParents(), LISTOBJECTPARENTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
