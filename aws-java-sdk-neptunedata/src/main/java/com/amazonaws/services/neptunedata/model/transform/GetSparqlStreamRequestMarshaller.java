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
 * GetSparqlStreamRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetSparqlStreamRequestMarshaller {

    private static final MarshallingInfo<Long> LIMIT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.QUERY_PARAM)
            .marshallLocationName("limit").build();
    private static final MarshallingInfo<String> ITERATORTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("iteratorType").build();
    private static final MarshallingInfo<Long> COMMITNUM_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.QUERY_PARAM)
            .marshallLocationName("commitNum").build();
    private static final MarshallingInfo<Long> OPNUM_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.QUERY_PARAM)
            .marshallLocationName("opNum").build();
    private static final MarshallingInfo<String> ENCODING_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.HEADER)
            .marshallLocationName("Accept-Encoding").build();

    private static final GetSparqlStreamRequestMarshaller instance = new GetSparqlStreamRequestMarshaller();

    public static GetSparqlStreamRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetSparqlStreamRequest getSparqlStreamRequest, ProtocolMarshaller protocolMarshaller) {

        if (getSparqlStreamRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getSparqlStreamRequest.getLimit(), LIMIT_BINDING);
            protocolMarshaller.marshall(getSparqlStreamRequest.getIteratorType(), ITERATORTYPE_BINDING);
            protocolMarshaller.marshall(getSparqlStreamRequest.getCommitNum(), COMMITNUM_BINDING);
            protocolMarshaller.marshall(getSparqlStreamRequest.getOpNum(), OPNUM_BINDING);
            protocolMarshaller.marshall(getSparqlStreamRequest.getEncoding(), ENCODING_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
