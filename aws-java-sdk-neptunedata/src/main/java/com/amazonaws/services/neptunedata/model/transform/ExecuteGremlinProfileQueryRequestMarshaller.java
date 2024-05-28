/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.neptunedata.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.neptunedata.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ExecuteGremlinProfileQueryRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ExecuteGremlinProfileQueryRequestMarshaller {

    private static final MarshallingInfo<String> GREMLINQUERY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("gremlin").build();
    private static final MarshallingInfo<Boolean> RESULTS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("profile.results").build();
    private static final MarshallingInfo<Integer> CHOP_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("profile.chop").build();
    private static final MarshallingInfo<String> SERIALIZER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("profile.serializer").build();
    private static final MarshallingInfo<Boolean> INDEXOPS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("profile.indexOps").build();

    private static final ExecuteGremlinProfileQueryRequestMarshaller instance = new ExecuteGremlinProfileQueryRequestMarshaller();

    public static ExecuteGremlinProfileQueryRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ExecuteGremlinProfileQueryRequest executeGremlinProfileQueryRequest, ProtocolMarshaller protocolMarshaller) {

        if (executeGremlinProfileQueryRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(executeGremlinProfileQueryRequest.getGremlinQuery(), GREMLINQUERY_BINDING);
            protocolMarshaller.marshall(executeGremlinProfileQueryRequest.getResults(), RESULTS_BINDING);
            protocolMarshaller.marshall(executeGremlinProfileQueryRequest.getChop(), CHOP_BINDING);
            protocolMarshaller.marshall(executeGremlinProfileQueryRequest.getSerializer(), SERIALIZER_BINDING);
            protocolMarshaller.marshall(executeGremlinProfileQueryRequest.getIndexOps(), INDEXOPS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
