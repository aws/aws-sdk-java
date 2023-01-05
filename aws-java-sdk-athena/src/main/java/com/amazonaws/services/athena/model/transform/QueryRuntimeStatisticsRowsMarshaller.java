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
package com.amazonaws.services.athena.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.athena.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * QueryRuntimeStatisticsRowsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class QueryRuntimeStatisticsRowsMarshaller {

    private static final MarshallingInfo<Long> INPUTROWS_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("InputRows").build();
    private static final MarshallingInfo<Long> INPUTBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("InputBytes").build();
    private static final MarshallingInfo<Long> OUTPUTBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OutputBytes").build();
    private static final MarshallingInfo<Long> OUTPUTROWS_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OutputRows").build();

    private static final QueryRuntimeStatisticsRowsMarshaller instance = new QueryRuntimeStatisticsRowsMarshaller();

    public static QueryRuntimeStatisticsRowsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(QueryRuntimeStatisticsRows queryRuntimeStatisticsRows, ProtocolMarshaller protocolMarshaller) {

        if (queryRuntimeStatisticsRows == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(queryRuntimeStatisticsRows.getInputRows(), INPUTROWS_BINDING);
            protocolMarshaller.marshall(queryRuntimeStatisticsRows.getInputBytes(), INPUTBYTES_BINDING);
            protocolMarshaller.marshall(queryRuntimeStatisticsRows.getOutputBytes(), OUTPUTBYTES_BINDING);
            protocolMarshaller.marshall(queryRuntimeStatisticsRows.getOutputRows(), OUTPUTROWS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
