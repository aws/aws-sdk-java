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
package com.amazonaws.services.logs.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.logs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutQueryDefinitionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutQueryDefinitionRequestMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> QUERYDEFINITIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("queryDefinitionId").build();
    private static final MarshallingInfo<List> LOGGROUPNAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("logGroupNames").build();
    private static final MarshallingInfo<String> QUERYSTRING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("queryString").build();

    private static final PutQueryDefinitionRequestMarshaller instance = new PutQueryDefinitionRequestMarshaller();

    public static PutQueryDefinitionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutQueryDefinitionRequest putQueryDefinitionRequest, ProtocolMarshaller protocolMarshaller) {

        if (putQueryDefinitionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putQueryDefinitionRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(putQueryDefinitionRequest.getQueryDefinitionId(), QUERYDEFINITIONID_BINDING);
            protocolMarshaller.marshall(putQueryDefinitionRequest.getLogGroupNames(), LOGGROUPNAMES_BINDING);
            protocolMarshaller.marshall(putQueryDefinitionRequest.getQueryString(), QUERYSTRING_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
