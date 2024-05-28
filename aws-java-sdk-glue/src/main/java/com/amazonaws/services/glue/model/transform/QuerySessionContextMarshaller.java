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
package com.amazonaws.services.glue.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * QuerySessionContextMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class QuerySessionContextMarshaller {

    private static final MarshallingInfo<String> QUERYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("QueryId").build();
    private static final MarshallingInfo<java.util.Date> QUERYSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QueryStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> CLUSTERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ClusterId").build();
    private static final MarshallingInfo<String> QUERYAUTHORIZATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QueryAuthorizationId").build();
    private static final MarshallingInfo<Map> ADDITIONALCONTEXT_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdditionalContext").build();

    private static final QuerySessionContextMarshaller instance = new QuerySessionContextMarshaller();

    public static QuerySessionContextMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(QuerySessionContext querySessionContext, ProtocolMarshaller protocolMarshaller) {

        if (querySessionContext == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(querySessionContext.getQueryId(), QUERYID_BINDING);
            protocolMarshaller.marshall(querySessionContext.getQueryStartTime(), QUERYSTARTTIME_BINDING);
            protocolMarshaller.marshall(querySessionContext.getClusterId(), CLUSTERID_BINDING);
            protocolMarshaller.marshall(querySessionContext.getQueryAuthorizationId(), QUERYAUTHORIZATIONID_BINDING);
            protocolMarshaller.marshall(querySessionContext.getAdditionalContext(), ADDITIONALCONTEXT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
