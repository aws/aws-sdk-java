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
package com.amazonaws.services.glue.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BatchGetBlueprintsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BatchGetBlueprintsRequestMarshaller {

    private static final MarshallingInfo<List> NAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Names").build();
    private static final MarshallingInfo<Boolean> INCLUDEBLUEPRINT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeBlueprint").build();
    private static final MarshallingInfo<Boolean> INCLUDEPARAMETERSPEC_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeParameterSpec").build();

    private static final BatchGetBlueprintsRequestMarshaller instance = new BatchGetBlueprintsRequestMarshaller();

    public static BatchGetBlueprintsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BatchGetBlueprintsRequest batchGetBlueprintsRequest, ProtocolMarshaller protocolMarshaller) {

        if (batchGetBlueprintsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(batchGetBlueprintsRequest.getNames(), NAMES_BINDING);
            protocolMarshaller.marshall(batchGetBlueprintsRequest.getIncludeBlueprint(), INCLUDEBLUEPRINT_BINDING);
            protocolMarshaller.marshall(batchGetBlueprintsRequest.getIncludeParameterSpec(), INCLUDEPARAMETERSPEC_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
