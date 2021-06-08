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
package com.amazonaws.services.accessanalyzer.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.accessanalyzer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListAccessPreviewFindingsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListAccessPreviewFindingsRequestMarshaller {

    private static final MarshallingInfo<String> ACCESSPREVIEWID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("accessPreviewId").build();
    private static final MarshallingInfo<String> ANALYZERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("analyzerArn").build();
    private static final MarshallingInfo<Map> FILTER_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("filter").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nextToken").build();

    private static final ListAccessPreviewFindingsRequestMarshaller instance = new ListAccessPreviewFindingsRequestMarshaller();

    public static ListAccessPreviewFindingsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListAccessPreviewFindingsRequest listAccessPreviewFindingsRequest, ProtocolMarshaller protocolMarshaller) {

        if (listAccessPreviewFindingsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listAccessPreviewFindingsRequest.getAccessPreviewId(), ACCESSPREVIEWID_BINDING);
            protocolMarshaller.marshall(listAccessPreviewFindingsRequest.getAnalyzerArn(), ANALYZERARN_BINDING);
            protocolMarshaller.marshall(listAccessPreviewFindingsRequest.getFilter(), FILTER_BINDING);
            protocolMarshaller.marshall(listAccessPreviewFindingsRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listAccessPreviewFindingsRequest.getNextToken(), NEXTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
