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
package com.amazonaws.services.macie2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.macie2.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateFindingsFilterRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateFindingsFilterRequestMarshaller {

    private static final MarshallingInfo<String> ACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("action").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<StructuredPojo> FINDINGCRITERIA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("findingCriteria").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<Integer> POSITION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("position").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();

    private static final UpdateFindingsFilterRequestMarshaller instance = new UpdateFindingsFilterRequestMarshaller();

    public static UpdateFindingsFilterRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateFindingsFilterRequest updateFindingsFilterRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateFindingsFilterRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateFindingsFilterRequest.getAction(), ACTION_BINDING);
            protocolMarshaller.marshall(updateFindingsFilterRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateFindingsFilterRequest.getFindingCriteria(), FINDINGCRITERIA_BINDING);
            protocolMarshaller.marshall(updateFindingsFilterRequest.getId(), ID_BINDING);
            protocolMarshaller.marshall(updateFindingsFilterRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateFindingsFilterRequest.getPosition(), POSITION_BINDING);
            protocolMarshaller.marshall(updateFindingsFilterRequest.getClientToken(), CLIENTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
