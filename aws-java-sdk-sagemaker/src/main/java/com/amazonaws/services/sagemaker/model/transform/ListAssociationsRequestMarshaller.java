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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListAssociationsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListAssociationsRequestMarshaller {

    private static final MarshallingInfo<String> SOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SourceArn").build();
    private static final MarshallingInfo<String> DESTINATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationArn").build();
    private static final MarshallingInfo<String> SOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceType").build();
    private static final MarshallingInfo<String> DESTINATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationType").build();
    private static final MarshallingInfo<String> ASSOCIATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociationType").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAFTER_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedAfter").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> CREATEDBEFORE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedBefore").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> SORTBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SortBy").build();
    private static final MarshallingInfo<String> SORTORDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SortOrder").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxResults").build();

    private static final ListAssociationsRequestMarshaller instance = new ListAssociationsRequestMarshaller();

    public static ListAssociationsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListAssociationsRequest listAssociationsRequest, ProtocolMarshaller protocolMarshaller) {

        if (listAssociationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listAssociationsRequest.getSourceArn(), SOURCEARN_BINDING);
            protocolMarshaller.marshall(listAssociationsRequest.getDestinationArn(), DESTINATIONARN_BINDING);
            protocolMarshaller.marshall(listAssociationsRequest.getSourceType(), SOURCETYPE_BINDING);
            protocolMarshaller.marshall(listAssociationsRequest.getDestinationType(), DESTINATIONTYPE_BINDING);
            protocolMarshaller.marshall(listAssociationsRequest.getAssociationType(), ASSOCIATIONTYPE_BINDING);
            protocolMarshaller.marshall(listAssociationsRequest.getCreatedAfter(), CREATEDAFTER_BINDING);
            protocolMarshaller.marshall(listAssociationsRequest.getCreatedBefore(), CREATEDBEFORE_BINDING);
            protocolMarshaller.marshall(listAssociationsRequest.getSortBy(), SORTBY_BINDING);
            protocolMarshaller.marshall(listAssociationsRequest.getSortOrder(), SORTORDER_BINDING);
            protocolMarshaller.marshall(listAssociationsRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listAssociationsRequest.getMaxResults(), MAXRESULTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
