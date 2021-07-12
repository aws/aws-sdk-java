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
package com.amazonaws.services.kendra.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kendra.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListGroupsOlderThanOrderingIdRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListGroupsOlderThanOrderingIdRequestMarshaller {

    private static final MarshallingInfo<String> INDEXID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IndexId").build();
    private static final MarshallingInfo<String> DATASOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataSourceId").build();
    private static final MarshallingInfo<Long> ORDERINGID_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OrderingId").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxResults").build();

    private static final ListGroupsOlderThanOrderingIdRequestMarshaller instance = new ListGroupsOlderThanOrderingIdRequestMarshaller();

    public static ListGroupsOlderThanOrderingIdRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListGroupsOlderThanOrderingIdRequest listGroupsOlderThanOrderingIdRequest, ProtocolMarshaller protocolMarshaller) {

        if (listGroupsOlderThanOrderingIdRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listGroupsOlderThanOrderingIdRequest.getIndexId(), INDEXID_BINDING);
            protocolMarshaller.marshall(listGroupsOlderThanOrderingIdRequest.getDataSourceId(), DATASOURCEID_BINDING);
            protocolMarshaller.marshall(listGroupsOlderThanOrderingIdRequest.getOrderingId(), ORDERINGID_BINDING);
            protocolMarshaller.marshall(listGroupsOlderThanOrderingIdRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listGroupsOlderThanOrderingIdRequest.getMaxResults(), MAXRESULTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
