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
 * UpdateQuerySuggestionsBlockListRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateQuerySuggestionsBlockListRequestMarshaller {

    private static final MarshallingInfo<String> INDEXID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IndexId").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<StructuredPojo> SOURCES3PATH_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceS3Path").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleArn").build();

    private static final UpdateQuerySuggestionsBlockListRequestMarshaller instance = new UpdateQuerySuggestionsBlockListRequestMarshaller();

    public static UpdateQuerySuggestionsBlockListRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateQuerySuggestionsBlockListRequest updateQuerySuggestionsBlockListRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateQuerySuggestionsBlockListRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateQuerySuggestionsBlockListRequest.getIndexId(), INDEXID_BINDING);
            protocolMarshaller.marshall(updateQuerySuggestionsBlockListRequest.getId(), ID_BINDING);
            protocolMarshaller.marshall(updateQuerySuggestionsBlockListRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateQuerySuggestionsBlockListRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateQuerySuggestionsBlockListRequest.getSourceS3Path(), SOURCES3PATH_BINDING);
            protocolMarshaller.marshall(updateQuerySuggestionsBlockListRequest.getRoleArn(), ROLEARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
