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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * QueryLineageRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class QueryLineageRequestMarshaller {

    private static final MarshallingInfo<List> STARTARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StartArns").build();
    private static final MarshallingInfo<String> DIRECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Direction").build();
    private static final MarshallingInfo<Boolean> INCLUDEEDGES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeEdges").build();
    private static final MarshallingInfo<StructuredPojo> FILTERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Filters").build();
    private static final MarshallingInfo<Integer> MAXDEPTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxDepth").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();

    private static final QueryLineageRequestMarshaller instance = new QueryLineageRequestMarshaller();

    public static QueryLineageRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(QueryLineageRequest queryLineageRequest, ProtocolMarshaller protocolMarshaller) {

        if (queryLineageRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(queryLineageRequest.getStartArns(), STARTARNS_BINDING);
            protocolMarshaller.marshall(queryLineageRequest.getDirection(), DIRECTION_BINDING);
            protocolMarshaller.marshall(queryLineageRequest.getIncludeEdges(), INCLUDEEDGES_BINDING);
            protocolMarshaller.marshall(queryLineageRequest.getFilters(), FILTERS_BINDING);
            protocolMarshaller.marshall(queryLineageRequest.getMaxDepth(), MAXDEPTH_BINDING);
            protocolMarshaller.marshall(queryLineageRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(queryLineageRequest.getNextToken(), NEXTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
