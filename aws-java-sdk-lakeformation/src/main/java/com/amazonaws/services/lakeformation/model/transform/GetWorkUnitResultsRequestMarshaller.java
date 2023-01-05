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
package com.amazonaws.services.lakeformation.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lakeformation.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetWorkUnitResultsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetWorkUnitResultsRequestMarshaller {

    private static final MarshallingInfo<String> QUERYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("QueryId").build();
    private static final MarshallingInfo<Long> WORKUNITID_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("WorkUnitId").build();
    private static final MarshallingInfo<String> WORKUNITTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkUnitToken").build();

    private static final GetWorkUnitResultsRequestMarshaller instance = new GetWorkUnitResultsRequestMarshaller();

    public static GetWorkUnitResultsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetWorkUnitResultsRequest getWorkUnitResultsRequest, ProtocolMarshaller protocolMarshaller) {

        if (getWorkUnitResultsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getWorkUnitResultsRequest.getQueryId(), QUERYID_BINDING);
            protocolMarshaller.marshall(getWorkUnitResultsRequest.getWorkUnitId(), WORKUNITID_BINDING);
            protocolMarshaller.marshall(getWorkUnitResultsRequest.getWorkUnitToken(), WORKUNITTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
