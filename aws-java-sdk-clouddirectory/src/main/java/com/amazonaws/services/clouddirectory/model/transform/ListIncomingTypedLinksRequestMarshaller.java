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
 * ListIncomingTypedLinksRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListIncomingTypedLinksRequestMarshaller {

    private static final MarshallingInfo<String> DIRECTORYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("x-amz-data-partition").build();
    private static final MarshallingInfo<StructuredPojo> OBJECTREFERENCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ObjectReference").build();
    private static final MarshallingInfo<List> FILTERATTRIBUTERANGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FilterAttributeRanges").build();
    private static final MarshallingInfo<StructuredPojo> FILTERTYPEDLINK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FilterTypedLink").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxResults").build();
    private static final MarshallingInfo<String> CONSISTENCYLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConsistencyLevel").build();

    private static final ListIncomingTypedLinksRequestMarshaller instance = new ListIncomingTypedLinksRequestMarshaller();

    public static ListIncomingTypedLinksRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListIncomingTypedLinksRequest listIncomingTypedLinksRequest, ProtocolMarshaller protocolMarshaller) {

        if (listIncomingTypedLinksRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listIncomingTypedLinksRequest.getDirectoryArn(), DIRECTORYARN_BINDING);
            protocolMarshaller.marshall(listIncomingTypedLinksRequest.getObjectReference(), OBJECTREFERENCE_BINDING);
            protocolMarshaller.marshall(listIncomingTypedLinksRequest.getFilterAttributeRanges(), FILTERATTRIBUTERANGES_BINDING);
            protocolMarshaller.marshall(listIncomingTypedLinksRequest.getFilterTypedLink(), FILTERTYPEDLINK_BINDING);
            protocolMarshaller.marshall(listIncomingTypedLinksRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listIncomingTypedLinksRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listIncomingTypedLinksRequest.getConsistencyLevel(), CONSISTENCYLEVEL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
