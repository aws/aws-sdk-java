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
package com.amazonaws.services.imagebuilder.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.imagebuilder.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartResourceStateUpdateRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartResourceStateUpdateRequestMarshaller {

    private static final MarshallingInfo<String> RESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceArn").build();
    private static final MarshallingInfo<StructuredPojo> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("state").build();
    private static final MarshallingInfo<String> EXECUTIONROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executionRole").build();
    private static final MarshallingInfo<StructuredPojo> INCLUDERESOURCES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("includeResources").build();
    private static final MarshallingInfo<StructuredPojo> EXCLUSIONRULES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("exclusionRules").build();
    private static final MarshallingInfo<java.util.Date> UPDATEAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updateAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();

    private static final StartResourceStateUpdateRequestMarshaller instance = new StartResourceStateUpdateRequestMarshaller();

    public static StartResourceStateUpdateRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartResourceStateUpdateRequest startResourceStateUpdateRequest, ProtocolMarshaller protocolMarshaller) {

        if (startResourceStateUpdateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startResourceStateUpdateRequest.getResourceArn(), RESOURCEARN_BINDING);
            protocolMarshaller.marshall(startResourceStateUpdateRequest.getState(), STATE_BINDING);
            protocolMarshaller.marshall(startResourceStateUpdateRequest.getExecutionRole(), EXECUTIONROLE_BINDING);
            protocolMarshaller.marshall(startResourceStateUpdateRequest.getIncludeResources(), INCLUDERESOURCES_BINDING);
            protocolMarshaller.marshall(startResourceStateUpdateRequest.getExclusionRules(), EXCLUSIONRULES_BINDING);
            protocolMarshaller.marshall(startResourceStateUpdateRequest.getUpdateAt(), UPDATEAT_BINDING);
            protocolMarshaller.marshall(startResourceStateUpdateRequest.getClientToken(), CLIENTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
