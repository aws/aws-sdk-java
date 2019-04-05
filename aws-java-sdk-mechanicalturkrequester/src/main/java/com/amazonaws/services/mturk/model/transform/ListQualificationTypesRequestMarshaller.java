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
package com.amazonaws.services.mturk.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mturk.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListQualificationTypesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListQualificationTypesRequestMarshaller {

    private static final MarshallingInfo<String> QUERY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Query").build();
    private static final MarshallingInfo<Boolean> MUSTBEREQUESTABLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MustBeRequestable").build();
    private static final MarshallingInfo<Boolean> MUSTBEOWNEDBYCALLER_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MustBeOwnedByCaller").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxResults").build();

    private static final ListQualificationTypesRequestMarshaller instance = new ListQualificationTypesRequestMarshaller();

    public static ListQualificationTypesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListQualificationTypesRequest listQualificationTypesRequest, ProtocolMarshaller protocolMarshaller) {

        if (listQualificationTypesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listQualificationTypesRequest.getQuery(), QUERY_BINDING);
            protocolMarshaller.marshall(listQualificationTypesRequest.getMustBeRequestable(), MUSTBEREQUESTABLE_BINDING);
            protocolMarshaller.marshall(listQualificationTypesRequest.getMustBeOwnedByCaller(), MUSTBEOWNEDBYCALLER_BINDING);
            protocolMarshaller.marshall(listQualificationTypesRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listQualificationTypesRequest.getMaxResults(), MAXRESULTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
